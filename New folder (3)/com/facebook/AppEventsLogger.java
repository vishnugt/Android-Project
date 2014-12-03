package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.a.c;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.FetchedAppSettings;
import com.facebook.internal.Validate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

public class AppEventsLogger
{
  public static final String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";
  private static final int APP_ACTIVATE_SUPPRESSION_PERIOD_IN_SECONDS = 300;
  public static final String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
  public static final String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";
  private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 86400;
  private static final int FLUSH_PERIOD_IN_SECONDS = 60;
  private static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;
  private static final String TAG = AppEventsLogger.class.getCanonicalName();
  private static Context applicationContext;
  private static AppEventsLogger.FlushBehavior flushBehavior;
  private static Timer flushTimer;
  private static String hashedDeviceAndAppId;
  private static Map<String, AppEventsLogger.EventSuppression> mapEventNameToSuppress = new AppEventsLogger.1();
  private static Map<String, Date> mapEventsToSuppressionTime;
  private static boolean requestInFlight;
  private static Map<AppEventsLogger.AccessTokenAppIdPair, AppEventsLogger.SessionEventsState> stateMap = new ConcurrentHashMap();
  private static Object staticLock;
  private static Timer supportsAttributionRecheckTimer;
  private final AppEventsLogger.AccessTokenAppIdPair accessTokenAppId;
  private final Context context;
  
  static
  {
    flushBehavior = AppEventsLogger.FlushBehavior.AUTO;
    staticLock = new Object();
    mapEventsToSuppressionTime = new HashMap();
  }
  
  private AppEventsLogger(Context paramContext, String paramString, Session paramSession)
  {
    Validate.notNull(paramContext, "context");
    this.context = paramContext;
    if (paramSession == null) {
      paramSession = Session.getActiveSession();
    }
    if (paramSession != null) {
      this.accessTokenAppId = new AppEventsLogger.AccessTokenAppIdPair(paramSession);
    }
    synchronized (staticLock)
    {
      if (hashedDeviceAndAppId == null) {
        hashedDeviceAndAppId = Utility.getHashedDeviceAndAppID(paramContext, paramString);
      }
      if (applicationContext == null) {
        applicationContext = paramContext.getApplicationContext();
      }
      initializeTimersIfNeeded();
      return;
      if (paramString == null) {
        paramString = Utility.getMetadataApplicationId(paramContext);
      }
      this.accessTokenAppId = new AppEventsLogger.AccessTokenAppIdPair(null, paramString);
    }
  }
  
  private static int accumulatePersistedEvents()
  {
    AppEventsLogger.PersistedEvents localPersistedEvents = AppEventsLogger.PersistedEvents.readAndClearStore(applicationContext);
    Iterator localIterator = localPersistedEvents.keySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      AppEventsLogger.AccessTokenAppIdPair localAccessTokenAppIdPair = (AppEventsLogger.AccessTokenAppIdPair)localIterator.next();
      AppEventsLogger.SessionEventsState localSessionEventsState = getSessionEventsState(applicationContext, localAccessTokenAppIdPair);
      List localList = localPersistedEvents.getEvents(localAccessTokenAppIdPair);
      localSessionEventsState.accumulatePersistedEvents(localList);
      i += localList.size();
    }
    return i;
  }
  
  public static void activateApp(Context paramContext)
  {
    activateApp(paramContext, Utility.getMetadataApplicationId(paramContext));
  }
  
  public static void activateApp(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {
      throw new IllegalArgumentException("Both context and applicationId must be non-null");
    }
    Settings.publishInstallAsync(paramContext, paramString);
    new AppEventsLogger(paramContext, paramString, null).logEvent("fb_mobile_activate_app");
  }
  
  private static AppEventsLogger.FlushStatistics buildAndExecuteRequests(AppEventsLogger.FlushReason paramFlushReason, Set<AppEventsLogger.AccessTokenAppIdPair> paramSet)
  {
    AppEventsLogger.FlushStatistics localFlushStatistics = new AppEventsLogger.FlushStatistics(null);
    boolean bool = Settings.getLimitEventAndDataUsage(applicationContext);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramSet.iterator();
    while (localIterator1.hasNext())
    {
      AppEventsLogger.AccessTokenAppIdPair localAccessTokenAppIdPair = (AppEventsLogger.AccessTokenAppIdPair)localIterator1.next();
      AppEventsLogger.SessionEventsState localSessionEventsState = getSessionEventsState(localAccessTokenAppIdPair);
      if (localSessionEventsState != null)
      {
        Request localRequest = buildRequestForSession(localAccessTokenAppIdPair, localSessionEventsState, bool, localFlushStatistics);
        if (localRequest != null) {
          localArrayList.add(localRequest);
        }
      }
    }
    if (localArrayList.size() > 0)
    {
      LoggingBehavior localLoggingBehavior = LoggingBehavior.APP_EVENTS;
      String str = TAG;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localFlushStatistics.numEvents);
      arrayOfObject[1] = paramFlushReason.toString();
      Logger.log(localLoggingBehavior, str, "Flushing %d events due to %s.", arrayOfObject);
      Iterator localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext()) {
        ((Request)localIterator2.next()).executeAndWait();
      }
      return localFlushStatistics;
    }
    return null;
  }
  
  private static Request buildRequestForSession(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair, AppEventsLogger.SessionEventsState paramSessionEventsState, boolean paramBoolean, AppEventsLogger.FlushStatistics paramFlushStatistics)
  {
    String str = paramAccessTokenAppIdPair.getApplicationId();
    Utility.FetchedAppSettings localFetchedAppSettings = Utility.queryAppSettings(str, false);
    Request localRequest = Request.newPostRequest(null, String.format("%s/activities", new Object[] { str }), null, null);
    Bundle localBundle = localRequest.getParameters();
    if (localBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putString("access_token", paramAccessTokenAppIdPair.getAccessToken());
    localRequest.setParameters(localBundle);
    int i = paramSessionEventsState.populateRequest(localRequest, localFetchedAppSettings.supportsImplicitLogging(), localFetchedAppSettings.supportsAttribution(), paramBoolean);
    if (i == 0) {
      return null;
    }
    paramFlushStatistics.numEvents = (i + paramFlushStatistics.numEvents);
    localRequest.setCallback(new AppEventsLogger.5(paramAccessTokenAppIdPair, localRequest, paramSessionEventsState, paramFlushStatistics));
    return localRequest;
  }
  
  static void eagerFlush()
  {
    if (getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
      flush(AppEventsLogger.FlushReason.EAGER_FLUSHING_EVENT);
    }
  }
  
  private static void flush(AppEventsLogger.FlushReason paramFlushReason)
  {
    Settings.getExecutor().execute(new AppEventsLogger.4(paramFlushReason));
  }
  
  private static void flushAndWait(AppEventsLogger.FlushReason paramFlushReason)
  {
    HashSet localHashSet;
    synchronized (staticLock)
    {
      if (requestInFlight) {
        return;
      }
      requestInFlight = true;
      localHashSet = new HashSet(stateMap.keySet());
      accumulatePersistedEvents();
    }
    try
    {
      AppEventsLogger.FlushStatistics localFlushStatistics2 = buildAndExecuteRequests(paramFlushReason, localHashSet);
      AppEventsLogger.FlushStatistics localFlushStatistics1 = localFlushStatistics2;
      Intent localIntent;
      return;
    }
    catch (Exception localException)
    {
      synchronized (staticLock)
      {
        requestInFlight = false;
        if (localFlushStatistics1 != null)
        {
          localIntent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
          localIntent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", localFlushStatistics1.numEvents);
          localIntent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", localFlushStatistics1.result);
          c.a(applicationContext).a(localIntent);
          return;
          localObject2 = finally;
          throw localObject2;
          localException = localException;
          new StringBuilder("Caught unexpected exception while flushing: ").append(localException.toString()).toString();
          localFlushStatistics1 = null;
        }
      }
    }
  }
  
  private static void flushIfNecessary()
  {
    synchronized (staticLock)
    {
      if ((getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) && (getAccumulatedEventCount() > 100)) {
        flush(AppEventsLogger.FlushReason.EVENT_THRESHOLD);
      }
      return;
    }
  }
  
  private static int getAccumulatedEventCount()
  {
    synchronized (staticLock)
    {
      Iterator localIterator = stateMap.values().iterator();
      int i = 0;
      while (localIterator.hasNext()) {
        i += ((AppEventsLogger.SessionEventsState)localIterator.next()).getAccumulatedEventCount();
      }
      return i;
    }
  }
  
  public static AppEventsLogger.FlushBehavior getFlushBehavior()
  {
    synchronized (staticLock)
    {
      AppEventsLogger.FlushBehavior localFlushBehavior = flushBehavior;
      return localFlushBehavior;
    }
  }
  
  @Deprecated
  public static boolean getLimitEventUsage(Context paramContext)
  {
    return Settings.getLimitEventAndDataUsage(paramContext);
  }
  
  private static AppEventsLogger.SessionEventsState getSessionEventsState(Context paramContext, AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    synchronized (staticLock)
    {
      AppEventsLogger.SessionEventsState localSessionEventsState = (AppEventsLogger.SessionEventsState)stateMap.get(paramAccessTokenAppIdPair);
      if (localSessionEventsState == null)
      {
        localSessionEventsState = new AppEventsLogger.SessionEventsState(Settings.getAttributionId(paramContext.getContentResolver()), paramContext.getPackageName(), hashedDeviceAndAppId);
        stateMap.put(paramAccessTokenAppIdPair, localSessionEventsState);
      }
      return localSessionEventsState;
    }
  }
  
  private static AppEventsLogger.SessionEventsState getSessionEventsState(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    synchronized (staticLock)
    {
      AppEventsLogger.SessionEventsState localSessionEventsState = (AppEventsLogger.SessionEventsState)stateMap.get(paramAccessTokenAppIdPair);
      return localSessionEventsState;
    }
  }
  
  private static void handleResponse(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair, Request paramRequest, Response paramResponse, AppEventsLogger.SessionEventsState paramSessionEventsState, AppEventsLogger.FlushStatistics paramFlushStatistics)
  {
    FacebookRequestError localFacebookRequestError = paramResponse.getError();
    AppEventsLogger.FlushResult localFlushResult1 = AppEventsLogger.FlushResult.SUCCESS;
    Object localObject1;
    Object localObject2;
    if (localFacebookRequestError != null) {
      if (localFacebookRequestError.getErrorCode() == -1)
      {
        AppEventsLogger.FlushResult localFlushResult3 = AppEventsLogger.FlushResult.NO_CONNECTIVITY;
        localObject1 = "Failed: No Connectivity";
        localObject2 = localFlushResult3;
      }
    }
    for (;;)
    {
      String str1;
      if (Settings.isLoggingBehaviorEnabled(LoggingBehavior.APP_EVENTS)) {
        str1 = (String)paramRequest.getTag();
      }
      try
      {
        String str4 = new JSONArray(str1).toString(2);
        str2 = str4;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          LoggingBehavior localLoggingBehavior;
          String str3;
          Object[] arrayOfObject1;
          Object[] arrayOfObject2;
          String str5;
          AppEventsLogger.FlushResult localFlushResult2;
          String str2 = "<Can't encode events for debug logging>";
          continue;
          boolean bool = false;
        }
      }
      localLoggingBehavior = LoggingBehavior.APP_EVENTS;
      str3 = TAG;
      arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = paramRequest.getGraphObject().toString();
      arrayOfObject1[1] = localObject1;
      arrayOfObject1[2] = str2;
      Logger.log(localLoggingBehavior, str3, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", arrayOfObject1);
      if (localFacebookRequestError != null)
      {
        bool = true;
        paramSessionEventsState.clearInFlightAndStats(bool);
        if (localObject2 == AppEventsLogger.FlushResult.NO_CONNECTIVITY) {
          AppEventsLogger.PersistedEvents.persistEvents(applicationContext, paramAccessTokenAppIdPair, paramSessionEventsState);
        }
        if ((localObject2 != AppEventsLogger.FlushResult.SUCCESS) && (paramFlushStatistics.result != AppEventsLogger.FlushResult.NO_CONNECTIVITY)) {
          paramFlushStatistics.result = ((AppEventsLogger.FlushResult)localObject2);
        }
        return;
        arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = paramResponse.toString();
        arrayOfObject2[1] = localFacebookRequestError.toString();
        str5 = String.format("Failed:\n  Response: %s\n  Error %s", arrayOfObject2);
        localFlushResult2 = AppEventsLogger.FlushResult.SERVER_ERROR;
        localObject1 = str5;
        localObject2 = localFlushResult2;
      }
      else
      {
        localObject1 = "Success";
        localObject2 = localFlushResult1;
      }
    }
  }
  
  private static void initializeTimersIfNeeded()
  {
    synchronized (staticLock)
    {
      if (flushTimer != null) {
        return;
      }
      flushTimer = new Timer();
      supportsAttributionRecheckTimer = new Timer();
      flushTimer.schedule(new AppEventsLogger.2(), 0L, 60000L);
      supportsAttributionRecheckTimer.schedule(new AppEventsLogger.3(), 0L, 86400000L);
      return;
    }
  }
  
  private static void logEvent(Context paramContext, AppEventsLogger.AppEvent paramAppEvent, AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    if (shouldSuppressEvent(paramAppEvent)) {
      return;
    }
    getSessionEventsState(paramContext, paramAccessTokenAppIdPair).addEvent(paramAppEvent);
    flushIfNecessary();
  }
  
  private void logEvent(String paramString, Double paramDouble, Bundle paramBundle, boolean paramBoolean)
  {
    AppEventsLogger.AppEvent localAppEvent = new AppEventsLogger.AppEvent(paramString, paramDouble, paramBundle, paramBoolean);
    logEvent(this.context, localAppEvent, this.accessTokenAppId);
  }
  
  public static AppEventsLogger newLogger(Context paramContext)
  {
    return new AppEventsLogger(paramContext, null, null);
  }
  
  public static AppEventsLogger newLogger(Context paramContext, Session paramSession)
  {
    return new AppEventsLogger(paramContext, null, paramSession);
  }
  
  public static AppEventsLogger newLogger(Context paramContext, String paramString)
  {
    return new AppEventsLogger(paramContext, paramString, null);
  }
  
  public static AppEventsLogger newLogger(Context paramContext, String paramString, Session paramSession)
  {
    return new AppEventsLogger(paramContext, paramString, paramSession);
  }
  
  private static void notifyDeveloperError(String paramString)
  {
    Logger.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", paramString);
  }
  
  public static void onContextStop()
  {
    AppEventsLogger.PersistedEvents.persistEvents(applicationContext, stateMap);
  }
  
  public static void setFlushBehavior(AppEventsLogger.FlushBehavior paramFlushBehavior)
  {
    synchronized (staticLock)
    {
      flushBehavior = paramFlushBehavior;
      return;
    }
  }
  
  @Deprecated
  public static void setLimitEventUsage(Context paramContext, boolean paramBoolean)
  {
    Settings.setLimitEventAndDataUsage(paramContext, paramBoolean);
  }
  
  private static boolean shouldSuppressEvent(AppEventsLogger.AppEvent paramAppEvent)
  {
    AppEventsLogger.EventSuppression localEventSuppression = (AppEventsLogger.EventSuppression)mapEventNameToSuppress.get(paramAppEvent.getName());
    if (localEventSuppression == null) {
      return false;
    }
    Date localDate = (Date)mapEventsToSuppressionTime.get(paramAppEvent.getName());
    if ((localDate != null) && (new Date().getTime() - localDate.getTime() < 1000 * localEventSuppression.getTimeoutPeriod())) {}
    for (boolean bool = true;; bool = false)
    {
      if ((!bool) || (localEventSuppression.getBehavior() == AppEventsLogger.SuppressionTimeoutBehavior.RESET_TIMEOUT_WHEN_LOG_ATTEMPTED)) {
        mapEventsToSuppressionTime.put(paramAppEvent.getName(), new Date());
      }
      return bool;
    }
  }
  
  public void flush()
  {
    flush(AppEventsLogger.FlushReason.EXPLICIT);
  }
  
  public String getApplicationId()
  {
    return this.accessTokenAppId.getApplicationId();
  }
  
  boolean isValidForSession(Session paramSession)
  {
    AppEventsLogger.AccessTokenAppIdPair localAccessTokenAppIdPair = new AppEventsLogger.AccessTokenAppIdPair(paramSession);
    return this.accessTokenAppId.equals(localAccessTokenAppIdPair);
  }
  
  public void logEvent(String paramString)
  {
    logEvent(paramString, null);
  }
  
  public void logEvent(String paramString, double paramDouble)
  {
    logEvent(paramString, paramDouble, null);
  }
  
  public void logEvent(String paramString, double paramDouble, Bundle paramBundle)
  {
    logEvent(paramString, Double.valueOf(paramDouble), paramBundle, false);
  }
  
  public void logEvent(String paramString, Bundle paramBundle)
  {
    logEvent(paramString, null, paramBundle, false);
  }
  
  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency)
  {
    logPurchase(paramBigDecimal, paramCurrency, null);
  }
  
  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (paramBigDecimal == null)
    {
      notifyDeveloperError("purchaseAmount cannot be null");
      return;
    }
    if (paramCurrency == null)
    {
      notifyDeveloperError("currency cannot be null");
      return;
    }
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    paramBundle.putString("fb_currency", paramCurrency.getCurrencyCode());
    logEvent("fb_mobile_purchase", paramBigDecimal.doubleValue(), paramBundle);
    eagerFlush();
  }
  
  public void logSdkEvent(String paramString, Double paramDouble, Bundle paramBundle)
  {
    logEvent(paramString, paramDouble, paramBundle, true);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger
 * JD-Core Version:    0.7.0.1
 */