package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.FetchedAppSettings;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObject.Factory;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class Settings
{
  private static final String ANALYTICS_EVENT = "event";
  private static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
  private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
  private static final Uri ATTRIBUTION_ID_CONTENT_URI;
  private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
  private static final String AUTO_PUBLISH = "auto_publish";
  private static final int DEFAULT_CORE_POOL_SIZE = 5;
  private static final int DEFAULT_KEEP_ALIVE = 1;
  private static final int DEFAULT_MAXIMUM_POOL_SIZE = 128;
  private static final ThreadFactory DEFAULT_THREAD_FACTORY = new Settings.1();
  private static final BlockingQueue<Runnable> DEFAULT_WORK_QUEUE;
  private static final String FACEBOOK_COM = "facebook.com";
  private static final Object LOCK;
  private static final String MOBILE_INSTALL_EVENT = "MOBILE_APP_INSTALL";
  private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
  private static final String TAG = Settings.class.getCanonicalName();
  private static volatile String appVersion;
  private static volatile Executor executor;
  private static volatile String facebookDomain;
  private static final HashSet<LoggingBehavior> loggingBehaviors;
  private static volatile boolean shouldAutoPublishInstall;
  
  static
  {
    LoggingBehavior[] arrayOfLoggingBehavior = new LoggingBehavior[1];
    arrayOfLoggingBehavior[0] = LoggingBehavior.DEVELOPER_ERRORS;
    loggingBehaviors = new HashSet(Arrays.asList(arrayOfLoggingBehavior));
    facebookDomain = "facebook.com";
    LOCK = new Object();
    ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    DEFAULT_WORK_QUEUE = new LinkedBlockingQueue(10);
  }
  
  public static final void addLoggingBehavior(LoggingBehavior paramLoggingBehavior)
  {
    synchronized (loggingBehaviors)
    {
      loggingBehaviors.add(paramLoggingBehavior);
      return;
    }
  }
  
  public static final void clearLoggingBehaviors()
  {
    synchronized (loggingBehaviors)
    {
      loggingBehaviors.clear();
      return;
    }
  }
  
  public static String getAppVersion()
  {
    return appVersion;
  }
  
  private static Executor getAsyncTaskExecutor()
  {
    Object localObject;
    try
    {
      Field localField = AsyncTask.class.getField("THREAD_POOL_EXECUTOR");
      if ((localObject instanceof Executor)) {
        break label35;
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      try
      {
        localObject = localField.get(null);
        if (localObject != null) {
          break label26;
        }
        return null;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        return null;
      }
      localNoSuchFieldException = localNoSuchFieldException;
      return null;
    }
    label26:
    return null;
    label35:
    return (Executor)localObject;
  }
  
  public static String getAttributionId(ContentResolver paramContentResolver)
  {
    try
    {
      String[] arrayOfString = { "aid" };
      Cursor localCursor = paramContentResolver.query(ATTRIBUTION_ID_CONTENT_URI, arrayOfString, null, null, null);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        String str = localCursor.getString(localCursor.getColumnIndex("aid"));
        localCursor.close();
        return str;
      }
    }
    catch (Exception localException)
    {
      new StringBuilder("Caught unexpected exception in getAttributionId(): ").append(localException.toString()).toString();
      return null;
    }
    return null;
  }
  
  public static Executor getExecutor()
  {
    synchronized (LOCK)
    {
      if (executor == null)
      {
        Object localObject3 = getAsyncTaskExecutor();
        if (localObject3 == null) {
          localObject3 = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, DEFAULT_WORK_QUEUE, DEFAULT_THREAD_FACTORY);
        }
        executor = (Executor)localObject3;
      }
      return executor;
    }
  }
  
  public static String getFacebookDomain()
  {
    return facebookDomain;
  }
  
  public static boolean getLimitEventAndDataUsage(Context paramContext)
  {
    return paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
  }
  
  public static final Set<LoggingBehavior> getLoggingBehaviors()
  {
    synchronized (loggingBehaviors)
    {
      Set localSet = Collections.unmodifiableSet(new HashSet(loggingBehaviors));
      return localSet;
    }
  }
  
  public static String getMigrationBundle()
  {
    return "fbsdk:20131203";
  }
  
  public static String getSdkVersion()
  {
    return "3.6.0";
  }
  
  @Deprecated
  public static boolean getShouldAutoPublishInstall()
  {
    return shouldAutoPublishInstall;
  }
  
  public static final boolean isLoggingBehaviorEnabled(LoggingBehavior paramLoggingBehavior)
  {
    HashSet localHashSet = loggingBehaviors;
    return false;
  }
  
  @Deprecated
  public static boolean publishInstallAndWait(Context paramContext, String paramString)
  {
    Response localResponse = publishInstallAndWaitForResponse(paramContext, paramString);
    return (localResponse != null) && (localResponse.getError() == null);
  }
  
  @Deprecated
  public static Response publishInstallAndWaitForResponse(Context paramContext, String paramString)
  {
    return publishInstallAndWaitForResponse(paramContext, paramString, false);
  }
  
  static Response publishInstallAndWaitForResponse(Context paramContext, String paramString, boolean paramBoolean)
  {
    if ((paramContext == null) || (paramString == null)) {
      try
      {
        throw new IllegalArgumentException("Both context and applicationId must be non-null");
      }
      catch (Exception localException)
      {
        Utility.logd("Facebook-publish", localException);
        return new Response(null, null, new FacebookRequestError(null, localException));
      }
    }
    String str1 = getAttributionId(paramContext.getContentResolver());
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
    String str2 = paramString + "ping";
    String str3 = paramString + "json";
    long l = localSharedPreferences.getLong(str2, 0L);
    String str4 = localSharedPreferences.getString(str3, null);
    if (!paramBoolean) {
      setShouldAutoPublishInstall(false);
    }
    GraphObject localGraphObject1 = GraphObject.Factory.create();
    localGraphObject1.setProperty("event", "MOBILE_APP_INSTALL");
    String str5 = Utility.getHashedDeviceAndAppID(paramContext, paramString);
    if (!getLimitEventAndDataUsage(paramContext)) {}
    for (boolean bool = true;; bool = false)
    {
      Utility.setAppEventAttributionParameters(localGraphObject1, str1, str5, bool);
      localGraphObject1.setProperty("auto_publish", Boolean.valueOf(paramBoolean));
      localGraphObject1.setProperty("application_package_name", paramContext.getPackageName());
      Request localRequest = Request.newPostRequest(null, String.format("%s/activities", new Object[] { paramString }), localGraphObject1, null);
      Object localObject1;
      if (l != 0L)
      {
        localObject1 = null;
        if (str4 == null) {}
      }
      try
      {
        GraphObject localGraphObject2 = GraphObject.Factory.create(new JSONObject(str4));
        localObject1 = localGraphObject2;
        localObject2 = localObject1;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          Response localResponse;
          SharedPreferences.Editor localEditor;
          Object localObject2 = null;
        }
      }
      if (localObject2 == null) {
        return (Response)Response.createResponsesFromString("true", null, new RequestBatch(new Request[] { localRequest }), true).get(0);
      }
      return new Response(null, null, localObject2, true);
      if (str1 == null) {
        throw new FacebookException("No attribution id returned from the Facebook application");
      }
      if (!Utility.queryAppSettings(paramString, false).supportsAttribution()) {
        throw new FacebookException("Install attribution has been disabled on the server.");
      }
      localResponse = localRequest.executeAndWait();
      localEditor = localSharedPreferences.edit();
      localEditor.putLong(str2, System.currentTimeMillis());
      if ((localResponse.getGraphObject() != null) && (localResponse.getGraphObject().getInnerJSONObject() != null)) {
        localEditor.putString(str3, localResponse.getGraphObject().getInnerJSONObject().toString());
      }
      localEditor.commit();
      return localResponse;
    }
  }
  
  @Deprecated
  public static void publishInstallAsync(Context paramContext, String paramString)
  {
    publishInstallAsync(paramContext, paramString, null);
  }
  
  @Deprecated
  public static void publishInstallAsync(Context paramContext, String paramString, Request.Callback paramCallback)
  {
    Context localContext = paramContext.getApplicationContext();
    getExecutor().execute(new Settings.2(localContext, paramString, paramCallback));
  }
  
  public static final void removeLoggingBehavior(LoggingBehavior paramLoggingBehavior)
  {
    synchronized (loggingBehaviors)
    {
      loggingBehaviors.remove(paramLoggingBehavior);
      return;
    }
  }
  
  public static void setAppVersion(String paramString)
  {
    appVersion = paramString;
  }
  
  public static void setExecutor(Executor paramExecutor)
  {
    Validate.notNull(paramExecutor, "executor");
    synchronized (LOCK)
    {
      executor = paramExecutor;
      return;
    }
  }
  
  public static void setFacebookDomain(String paramString)
  {
    facebookDomain = paramString;
  }
  
  public static void setLimitEventAndDataUsage(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit();
    localEditor.putBoolean("limitEventUsage", paramBoolean);
    localEditor.commit();
  }
  
  @Deprecated
  public static void setShouldAutoPublishInstall(boolean paramBoolean)
  {
    shouldAutoPublishInstall = paramBoolean;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.Settings
 * JD-Core Version:    0.7.0.1
 */