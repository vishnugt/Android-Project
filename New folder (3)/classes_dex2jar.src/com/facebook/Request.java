package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.Logger;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphMultiResult;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import com.facebook.model.GraphPlace;
import com.facebook.model.GraphUser;
import com.facebook.model.OpenGraphAction;
import com.facebook.model.OpenGraphObject;
import com.facebook.model.OpenGraphObject.Factory;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Request
{
  private static final String ACCESS_TOKEN_PARAM = "access_token";
  private static final String ATTACHED_FILES_PARAM = "attached_files";
  private static final String ATTACHMENT_FILENAME_PREFIX = "file";
  private static final String BATCH_APP_ID_PARAM = "batch_app_id";
  private static final String BATCH_BODY_PARAM = "body";
  private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
  private static final String BATCH_ENTRY_NAME_PARAM = "name";
  private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
  private static final String BATCH_METHOD_PARAM = "method";
  private static final String BATCH_PARAM = "batch";
  private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
  private static final String CONTENT_TYPE_HEADER = "Content-Type";
  private static final String FORMAT_JSON = "json";
  private static final String FORMAT_PARAM = "format";
  private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
  public static final int MAXIMUM_BATCH_SIZE = 50;
  private static final String ME = "me";
  private static final String MIGRATION_BUNDLE_PARAM = "migration_bundle";
  private static final String MIME_BOUNDARY = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f";
  private static final String MY_ACTION_FORMAT = "me/%s";
  private static final String MY_FEED = "me/feed";
  private static final String MY_FRIENDS = "me/friends";
  private static final String MY_OBJECTS_FORMAT = "me/objects/%s";
  private static final String MY_PHOTOS = "me/photos";
  private static final String MY_STAGING_RESOURCES = "me/staging_resources";
  private static final String MY_VIDEOS = "me/videos";
  private static final String OBJECT_PARAM = "object";
  private static final String PICTURE_PARAM = "picture";
  private static final String SDK_ANDROID = "android";
  private static final String SDK_PARAM = "sdk";
  private static final String SEARCH = "search";
  private static final String STAGING_PARAM = "file";
  private static final String USER_AGENT_BASE = "FBAndroidSDK";
  private static final String USER_AGENT_HEADER = "User-Agent";
  private static String defaultBatchApplicationId;
  private static volatile String userAgent;
  private String batchEntryDependsOn;
  private String batchEntryName;
  private boolean batchEntryOmitResultOnSuccess = true;
  private Request.Callback callback;
  private GraphObject graphObject;
  private String graphPath;
  private HttpMethod httpMethod;
  private String overriddenURL;
  private Bundle parameters;
  private String restMethod;
  private Session session;
  private Object tag;
  
  public Request()
  {
    this(null, null, null, null, null);
  }
  
  public Request(Session paramSession, String paramString)
  {
    this(paramSession, paramString, null, null, null);
  }
  
  public Request(Session paramSession, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod)
  {
    this(paramSession, paramString, paramBundle, paramHttpMethod, null);
  }
  
  public Request(Session paramSession, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod, Request.Callback paramCallback)
  {
    this.session = paramSession;
    this.graphPath = paramString;
    this.callback = paramCallback;
    setHttpMethod(paramHttpMethod);
    if (paramBundle != null) {}
    for (this.parameters = new Bundle(paramBundle);; this.parameters = new Bundle())
    {
      if (!this.parameters.containsKey("migration_bundle")) {
        this.parameters.putString("migration_bundle", "fbsdk:20131203");
      }
      return;
    }
  }
  
  Request(Session paramSession, URL paramURL)
  {
    this.session = paramSession;
    this.overriddenURL = paramURL.toString();
    setHttpMethod(HttpMethod.GET);
    this.parameters = new Bundle();
  }
  
  private void addCommonParameters()
  {
    if (this.session != null)
    {
      if (!this.session.isOpened()) {
        throw new FacebookException("Session provided to a Request in un-opened state.");
      }
      if (!this.parameters.containsKey("access_token"))
      {
        String str = this.session.getAccessToken();
        Logger.registerAccessToken(str);
        this.parameters.putString("access_token", str);
      }
    }
    this.parameters.putString("sdk", "android");
    this.parameters.putString("format", "json");
  }
  
  private String appendParametersToBaseUrl(String paramString)
  {
    Uri.Builder localBuilder = new Uri.Builder().encodedPath(paramString);
    Iterator localIterator = this.parameters.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = this.parameters.get(str);
      if (localObject == null) {
        localObject = "";
      }
      if (isSupportedParameterType(localObject))
      {
        localBuilder.appendQueryParameter(str, parameterToString(localObject).toString());
      }
      else if (this.httpMethod == HttpMethod.GET)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localObject.getClass().getSimpleName();
        throw new IllegalArgumentException(String.format("Unsupported parameter type for GET request: %s", arrayOfObject));
      }
    }
    return localBuilder.toString();
  }
  
  static HttpURLConnection createConnection(URL paramURL)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
    localHttpURLConnection.setRequestProperty("User-Agent", getUserAgent());
    localHttpURLConnection.setRequestProperty("Content-Type", getMimeContentType());
    localHttpURLConnection.setChunkedStreamingMode(0);
    return localHttpURLConnection;
  }
  
  public static Response executeAndWait(Request paramRequest)
  {
    List localList = executeBatchAndWait(new Request[] { paramRequest });
    if ((localList == null) || (localList.size() != 1)) {
      throw new FacebookException("invalid state: expected a single response");
    }
    return (Response)localList.get(0);
  }
  
  public static List<Response> executeBatchAndWait(RequestBatch paramRequestBatch)
  {
    Validate.notEmptyAndContainsNoNulls(paramRequestBatch, "requests");
    try
    {
      HttpURLConnection localHttpURLConnection = toHttpConnection(paramRequestBatch);
      return executeConnectionAndWait(localHttpURLConnection, paramRequestBatch);
    }
    catch (Exception localException)
    {
      List localList = Response.constructErrorResponses(paramRequestBatch.getRequests(), null, new FacebookException(localException));
      runCallbacks(paramRequestBatch, localList);
      return localList;
    }
  }
  
  public static List<Response> executeBatchAndWait(Collection<Request> paramCollection)
  {
    return executeBatchAndWait(new RequestBatch(paramCollection));
  }
  
  public static List<Response> executeBatchAndWait(Request... paramVarArgs)
  {
    Validate.notNull(paramVarArgs, "requests");
    return executeBatchAndWait(Arrays.asList(paramVarArgs));
  }
  
  public static RequestAsyncTask executeBatchAsync(RequestBatch paramRequestBatch)
  {
    Validate.notEmptyAndContainsNoNulls(paramRequestBatch, "requests");
    RequestAsyncTask localRequestAsyncTask = new RequestAsyncTask(paramRequestBatch);
    localRequestAsyncTask.executeOnSettingsExecutor();
    return localRequestAsyncTask;
  }
  
  public static RequestAsyncTask executeBatchAsync(Collection<Request> paramCollection)
  {
    return executeBatchAsync(new RequestBatch(paramCollection));
  }
  
  public static RequestAsyncTask executeBatchAsync(Request... paramVarArgs)
  {
    Validate.notNull(paramVarArgs, "requests");
    return executeBatchAsync(Arrays.asList(paramVarArgs));
  }
  
  public static List<Response> executeConnectionAndWait(HttpURLConnection paramHttpURLConnection, RequestBatch paramRequestBatch)
  {
    List localList = Response.fromHttpConnection(paramHttpURLConnection, paramRequestBatch);
    Utility.disconnectQuietly(paramHttpURLConnection);
    int i = paramRequestBatch.size();
    if (i != localList.size())
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localList.size());
      arrayOfObject[1] = Integer.valueOf(i);
      throw new FacebookException(String.format("Received %d responses while expecting %d", arrayOfObject));
    }
    runCallbacks(paramRequestBatch, localList);
    HashSet localHashSet = new HashSet();
    Iterator localIterator1 = paramRequestBatch.iterator();
    while (localIterator1.hasNext())
    {
      Request localRequest = (Request)localIterator1.next();
      if (localRequest.session != null) {
        localHashSet.add(localRequest.session);
      }
    }
    Iterator localIterator2 = localHashSet.iterator();
    while (localIterator2.hasNext()) {
      ((Session)localIterator2.next()).extendAccessTokenIfNeeded();
    }
    return localList;
  }
  
  public static List<Response> executeConnectionAndWait(HttpURLConnection paramHttpURLConnection, Collection<Request> paramCollection)
  {
    return executeConnectionAndWait(paramHttpURLConnection, new RequestBatch(paramCollection));
  }
  
  public static RequestAsyncTask executeConnectionAsync(Handler paramHandler, HttpURLConnection paramHttpURLConnection, RequestBatch paramRequestBatch)
  {
    Validate.notNull(paramHttpURLConnection, "connection");
    RequestAsyncTask localRequestAsyncTask = new RequestAsyncTask(paramHttpURLConnection, paramRequestBatch);
    paramRequestBatch.setCallbackHandler(paramHandler);
    localRequestAsyncTask.executeOnSettingsExecutor();
    return localRequestAsyncTask;
  }
  
  public static RequestAsyncTask executeConnectionAsync(HttpURLConnection paramHttpURLConnection, RequestBatch paramRequestBatch)
  {
    return executeConnectionAsync(null, paramHttpURLConnection, paramRequestBatch);
  }
  
  @Deprecated
  public static RequestAsyncTask executeGraphPathRequestAsync(Session paramSession, String paramString, Request.Callback paramCallback)
  {
    return newGraphPathRequest(paramSession, paramString, paramCallback).executeAsync();
  }
  
  @Deprecated
  public static RequestAsyncTask executeMeRequestAsync(Session paramSession, Request.GraphUserCallback paramGraphUserCallback)
  {
    return newMeRequest(paramSession, paramGraphUserCallback).executeAsync();
  }
  
  @Deprecated
  public static RequestAsyncTask executeMyFriendsRequestAsync(Session paramSession, Request.GraphUserListCallback paramGraphUserListCallback)
  {
    return newMyFriendsRequest(paramSession, paramGraphUserListCallback).executeAsync();
  }
  
  @Deprecated
  public static RequestAsyncTask executePlacesSearchRequestAsync(Session paramSession, Location paramLocation, int paramInt1, int paramInt2, String paramString, Request.GraphPlaceListCallback paramGraphPlaceListCallback)
  {
    return newPlacesSearchRequest(paramSession, paramLocation, paramInt1, paramInt2, paramString, paramGraphPlaceListCallback).executeAsync();
  }
  
  @Deprecated
  public static RequestAsyncTask executePostRequestAsync(Session paramSession, String paramString, GraphObject paramGraphObject, Request.Callback paramCallback)
  {
    return newPostRequest(paramSession, paramString, paramGraphObject, paramCallback).executeAsync();
  }
  
  @Deprecated
  public static RequestAsyncTask executeRestRequestAsync(Session paramSession, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod)
  {
    return newRestRequest(paramSession, paramString, paramBundle, paramHttpMethod).executeAsync();
  }
  
  @Deprecated
  public static RequestAsyncTask executeStatusUpdateRequestAsync(Session paramSession, String paramString, Request.Callback paramCallback)
  {
    return newStatusUpdateRequest(paramSession, paramString, paramCallback).executeAsync();
  }
  
  @Deprecated
  public static RequestAsyncTask executeUploadPhotoRequestAsync(Session paramSession, Bitmap paramBitmap, Request.Callback paramCallback)
  {
    return newUploadPhotoRequest(paramSession, paramBitmap, paramCallback).executeAsync();
  }
  
  @Deprecated
  public static RequestAsyncTask executeUploadPhotoRequestAsync(Session paramSession, File paramFile, Request.Callback paramCallback)
  {
    return newUploadPhotoRequest(paramSession, paramFile, paramCallback).executeAsync();
  }
  
  private static String getBatchAppId(RequestBatch paramRequestBatch)
  {
    if (!Utility.isNullOrEmpty(paramRequestBatch.getBatchApplicationId())) {
      return paramRequestBatch.getBatchApplicationId();
    }
    Iterator localIterator = paramRequestBatch.iterator();
    while (localIterator.hasNext())
    {
      Session localSession = ((Request)localIterator.next()).session;
      if (localSession != null) {
        return localSession.getApplicationId();
      }
    }
    return defaultBatchApplicationId;
  }
  
  public static final String getDefaultBatchApplicationId()
  {
    return defaultBatchApplicationId;
  }
  
  private static String getMimeContentType()
  {
    return String.format("multipart/form-data; boundary=%s", new Object[] { "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" });
  }
  
  private static String getUserAgent()
  {
    if (userAgent == null) {
      userAgent = String.format("%s.%s", new Object[] { "FBAndroidSDK", "3.6.0" });
    }
    return userAgent;
  }
  
  private static boolean isSupportedAttachmentType(Object paramObject)
  {
    return ((paramObject instanceof Bitmap)) || ((paramObject instanceof byte[])) || ((paramObject instanceof ParcelFileDescriptor)) || ((paramObject instanceof Request.ParcelFileDescriptorWithMimeType));
  }
  
  private static boolean isSupportedParameterType(Object paramObject)
  {
    return ((paramObject instanceof String)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof Number)) || ((paramObject instanceof Date));
  }
  
  public static Request newCustomAudienceThirdPartyIdRequest(Session paramSession, Context paramContext, Request.Callback paramCallback)
  {
    return newCustomAudienceThirdPartyIdRequest(paramSession, paramContext, null, paramCallback);
  }
  
  public static Request newCustomAudienceThirdPartyIdRequest(Session paramSession, Context paramContext, String paramString, Request.Callback paramCallback)
  {
    if (paramSession == null) {}
    for (Session localSession = Session.getActiveSession();; localSession = paramSession)
    {
      if ((localSession != null) && (!localSession.isOpened())) {
        localSession = null;
      }
      if (paramString == null) {
        if (localSession == null) {
          break label55;
        }
      }
      label55:
      for (paramString = localSession.getApplicationId(); paramString == null; paramString = Utility.getMetadataApplicationId(paramContext)) {
        throw new FacebookException("Facebook App ID cannot be determined");
      }
      String str1 = paramString + "/custom_audience_third_party_id";
      Bundle localBundle = new Bundle();
      if (localSession == null)
      {
        String str2 = Settings.getAttributionId(paramContext.getContentResolver());
        if (str2 != null) {
          localBundle.putString("udid", str2);
        }
      }
      if (Settings.getLimitEventAndDataUsage(paramContext)) {
        localBundle.putString("limit_event_usage", "1");
      }
      return new Request(localSession, str1, localBundle, HttpMethod.GET, paramCallback);
    }
  }
  
  public static Request newDeleteObjectRequest(Session paramSession, String paramString, Request.Callback paramCallback)
  {
    return new Request(paramSession, paramString, null, HttpMethod.DELETE, paramCallback);
  }
  
  public static Request newGraphPathRequest(Session paramSession, String paramString, Request.Callback paramCallback)
  {
    return new Request(paramSession, paramString, null, null, paramCallback);
  }
  
  public static Request newMeRequest(Session paramSession, Request.GraphUserCallback paramGraphUserCallback)
  {
    return new Request(paramSession, "me", null, null, new Request.1(paramGraphUserCallback));
  }
  
  public static Request newMyFriendsRequest(Session paramSession, Request.GraphUserListCallback paramGraphUserListCallback)
  {
    return new Request(paramSession, "me/friends", null, null, new Request.2(paramGraphUserListCallback));
  }
  
  public static Request newPlacesSearchRequest(Session paramSession, Location paramLocation, int paramInt1, int paramInt2, String paramString, Request.GraphPlaceListCallback paramGraphPlaceListCallback)
  {
    if ((paramLocation == null) && (Utility.isNullOrEmpty(paramString))) {
      throw new FacebookException("Either location or searchText must be specified.");
    }
    Bundle localBundle = new Bundle(5);
    localBundle.putString("type", "place");
    localBundle.putInt("limit", paramInt2);
    if (paramLocation != null)
    {
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Double.valueOf(paramLocation.getLatitude());
      arrayOfObject[1] = Double.valueOf(paramLocation.getLongitude());
      localBundle.putString("center", String.format(localLocale, "%f,%f", arrayOfObject));
      localBundle.putInt("distance", paramInt1);
    }
    if (!Utility.isNullOrEmpty(paramString)) {
      localBundle.putString("q", paramString);
    }
    Request.3 local3 = new Request.3(paramGraphPlaceListCallback);
    return new Request(paramSession, "search", localBundle, HttpMethod.GET, local3);
  }
  
  public static Request newPostOpenGraphActionRequest(Session paramSession, OpenGraphAction paramOpenGraphAction, Request.Callback paramCallback)
  {
    if (paramOpenGraphAction == null) {
      throw new FacebookException("openGraphAction cannot be null");
    }
    if (Utility.isNullOrEmpty(paramOpenGraphAction.getType())) {
      throw new FacebookException("openGraphAction must have non-null 'type' property");
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramOpenGraphAction.getType();
    return newPostRequest(paramSession, String.format("me/%s", arrayOfObject), paramOpenGraphAction, paramCallback);
  }
  
  public static Request newPostOpenGraphObjectRequest(Session paramSession, OpenGraphObject paramOpenGraphObject, Request.Callback paramCallback)
  {
    if (paramOpenGraphObject == null) {
      throw new FacebookException("openGraphObject cannot be null");
    }
    if (Utility.isNullOrEmpty(paramOpenGraphObject.getType())) {
      throw new FacebookException("openGraphObject must have non-null 'type' property");
    }
    if (Utility.isNullOrEmpty(paramOpenGraphObject.getTitle())) {
      throw new FacebookException("openGraphObject must have non-null 'title' property");
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramOpenGraphObject.getType();
    String str = String.format("me/objects/%s", arrayOfObject);
    Bundle localBundle = new Bundle();
    localBundle.putString("object", paramOpenGraphObject.getInnerJSONObject().toString());
    return new Request(paramSession, str, localBundle, HttpMethod.POST, paramCallback);
  }
  
  public static Request newPostOpenGraphObjectRequest(Session paramSession, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, GraphObject paramGraphObject, Request.Callback paramCallback)
  {
    OpenGraphObject localOpenGraphObject = OpenGraphObject.Factory.createForPost(OpenGraphObject.class, paramString1, paramString2, paramString3, paramString4, paramString5);
    if (paramGraphObject != null) {
      localOpenGraphObject.setData(paramGraphObject);
    }
    return newPostOpenGraphObjectRequest(paramSession, localOpenGraphObject, paramCallback);
  }
  
  public static Request newPostRequest(Session paramSession, String paramString, GraphObject paramGraphObject, Request.Callback paramCallback)
  {
    Request localRequest = new Request(paramSession, paramString, null, HttpMethod.POST, paramCallback);
    localRequest.graphObject = paramGraphObject;
    return localRequest;
  }
  
  public static Request newRestRequest(Session paramSession, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod)
  {
    Request localRequest = new Request(paramSession, null, paramBundle, paramHttpMethod);
    localRequest.restMethod = paramString;
    return localRequest;
  }
  
  public static Request newStatusUpdateRequest(Session paramSession, String paramString, Request.Callback paramCallback)
  {
    return newStatusUpdateRequest(paramSession, paramString, null, null, paramCallback);
  }
  
  public static Request newStatusUpdateRequest(Session paramSession, String paramString, GraphPlace paramGraphPlace, List<GraphUser> paramList, Request.Callback paramCallback)
  {
    if (paramList != null)
    {
      localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((GraphUser)localIterator.next()).getId());
      }
    }
    ArrayList localArrayList = null;
    if (paramGraphPlace == null) {}
    for (String str = null;; str = paramGraphPlace.getId()) {
      return newStatusUpdateRequest(paramSession, paramString, str, localArrayList, paramCallback);
    }
  }
  
  private static Request newStatusUpdateRequest(Session paramSession, String paramString1, String paramString2, List<String> paramList, Request.Callback paramCallback)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("message", paramString1);
    if (paramString2 != null) {
      localBundle.putString("place", paramString2);
    }
    if ((paramList != null) && (paramList.size() > 0)) {
      localBundle.putString("tags", TextUtils.join(",", paramList));
    }
    return new Request(paramSession, "me/feed", localBundle, HttpMethod.POST, paramCallback);
  }
  
  public static Request newUpdateOpenGraphObjectRequest(Session paramSession, OpenGraphObject paramOpenGraphObject, Request.Callback paramCallback)
  {
    if (paramOpenGraphObject == null) {
      throw new FacebookException("openGraphObject cannot be null");
    }
    String str = paramOpenGraphObject.getId();
    if (str == null) {
      throw new FacebookException("openGraphObject must have an id");
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("object", paramOpenGraphObject.getInnerJSONObject().toString());
    return new Request(paramSession, str, localBundle, HttpMethod.POST, paramCallback);
  }
  
  public static Request newUpdateOpenGraphObjectRequest(Session paramSession, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, GraphObject paramGraphObject, Request.Callback paramCallback)
  {
    OpenGraphObject localOpenGraphObject = OpenGraphObject.Factory.createForPost(OpenGraphObject.class, null, paramString2, paramString3, paramString4, paramString5);
    localOpenGraphObject.setId(paramString1);
    localOpenGraphObject.setData(paramGraphObject);
    return newUpdateOpenGraphObjectRequest(paramSession, localOpenGraphObject, paramCallback);
  }
  
  public static Request newUploadPhotoRequest(Session paramSession, Bitmap paramBitmap, Request.Callback paramCallback)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("picture", paramBitmap);
    return new Request(paramSession, "me/photos", localBundle, HttpMethod.POST, paramCallback);
  }
  
  public static Request newUploadPhotoRequest(Session paramSession, File paramFile, Request.Callback paramCallback)
  {
    ParcelFileDescriptor localParcelFileDescriptor = ParcelFileDescriptor.open(paramFile, 268435456);
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("picture", localParcelFileDescriptor);
    return new Request(paramSession, "me/photos", localBundle, HttpMethod.POST, paramCallback);
  }
  
  public static Request newUploadStagingResourceWithImageRequest(Session paramSession, Bitmap paramBitmap, Request.Callback paramCallback)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("file", paramBitmap);
    return new Request(paramSession, "me/staging_resources", localBundle, HttpMethod.POST, paramCallback);
  }
  
  public static Request newUploadStagingResourceWithImageRequest(Session paramSession, File paramFile, Request.Callback paramCallback)
  {
    Request.ParcelFileDescriptorWithMimeType localParcelFileDescriptorWithMimeType = new Request.ParcelFileDescriptorWithMimeType(ParcelFileDescriptor.open(paramFile, 268435456), "image/png");
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("file", localParcelFileDescriptorWithMimeType);
    return new Request(paramSession, "me/staging_resources", localBundle, HttpMethod.POST, paramCallback);
  }
  
  public static Request newUploadVideoRequest(Session paramSession, File paramFile, Request.Callback paramCallback)
  {
    ParcelFileDescriptor localParcelFileDescriptor = ParcelFileDescriptor.open(paramFile, 268435456);
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable(paramFile.getName(), localParcelFileDescriptor);
    return new Request(paramSession, "me/videos", localBundle, HttpMethod.POST, paramCallback);
  }
  
  private static String parameterToString(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if (((paramObject instanceof Boolean)) || ((paramObject instanceof Number))) {
      return paramObject.toString();
    }
    if ((paramObject instanceof Date)) {
      return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(paramObject);
    }
    throw new IllegalArgumentException("Unsupported parameter type.");
  }
  
  private static void processGraphObject(GraphObject paramGraphObject, String paramString, Request.KeyValueSerializer paramKeyValueSerializer)
  {
    int k;
    if ((paramString.startsWith("me/")) || (paramString.startsWith("/me/")))
    {
      int i = paramString.indexOf(":");
      int j = paramString.indexOf("?");
      if ((i > 3) && ((j == -1) || (i < j))) {
        k = 1;
      }
    }
    for (int m = k;; m = 0)
    {
      Iterator localIterator = paramGraphObject.asMap().entrySet().iterator();
      label79:
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if ((m != 0) && (((String)localEntry.getKey()).equalsIgnoreCase("image"))) {}
        for (boolean bool = true;; bool = false)
        {
          processGraphObjectProperty((String)localEntry.getKey(), localEntry.getValue(), paramKeyValueSerializer, bool);
          break label79;
          k = 0;
          break;
        }
      }
      return;
    }
  }
  
  private static void processGraphObjectProperty(String paramString, Object paramObject, Request.KeyValueSerializer paramKeyValueSerializer, boolean paramBoolean)
  {
    Object localObject1 = paramObject;
    Object localObject2;
    for (;;)
    {
      localObject2 = localObject1.getClass();
      if (GraphObject.class.isAssignableFrom((Class)localObject2))
      {
        JSONObject localJSONObject2 = ((GraphObject)localObject1).getInnerJSONObject();
        Class localClass2 = localJSONObject2.getClass();
        localObject1 = localJSONObject2;
        localObject2 = localClass2;
      }
      JSONObject localJSONObject1;
      for (;;)
      {
        if (!JSONObject.class.isAssignableFrom((Class)localObject2)) {
          break label222;
        }
        localJSONObject1 = (JSONObject)localObject1;
        if (!paramBoolean) {
          break;
        }
        Iterator localIterator = localJSONObject1.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          processGraphObjectProperty(String.format("%s[%s]", new Object[] { paramString, str }), localJSONObject1.opt(str), paramKeyValueSerializer, paramBoolean);
        }
        if (GraphObjectList.class.isAssignableFrom((Class)localObject2))
        {
          JSONArray localJSONArray1 = ((GraphObjectList)localObject1).getInnerJSONArray();
          Class localClass1 = localJSONArray1.getClass();
          localObject1 = localJSONArray1;
          localObject2 = localClass1;
        }
      }
      if (localJSONObject1.has("id"))
      {
        localObject1 = localJSONObject1.optString("id");
      }
      else
      {
        if (!localJSONObject1.has("url")) {
          break label347;
        }
        localObject1 = localJSONObject1.optString("url");
      }
    }
    label222:
    if (JSONArray.class.isAssignableFrom((Class)localObject2))
    {
      JSONArray localJSONArray2 = (JSONArray)localObject1;
      int i = localJSONArray2.length();
      for (int j = 0; j < i; j++)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString;
        arrayOfObject[1] = Integer.valueOf(j);
        processGraphObjectProperty(String.format("%s[%d]", arrayOfObject), localJSONArray2.opt(j), paramKeyValueSerializer, paramBoolean);
      }
    }
    if ((String.class.isAssignableFrom((Class)localObject2)) || (Number.class.isAssignableFrom((Class)localObject2)) || (Boolean.class.isAssignableFrom((Class)localObject2))) {
      paramKeyValueSerializer.writeString(paramString, localObject1.toString());
    }
    label347:
    while (!Date.class.isAssignableFrom((Class)localObject2)) {
      return;
    }
    Date localDate = (Date)localObject1;
    paramKeyValueSerializer.writeString(paramString, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(localDate));
  }
  
  static void runCallbacks(RequestBatch paramRequestBatch, List<Response> paramList)
  {
    int i = paramRequestBatch.size();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      Request localRequest = paramRequestBatch.get(j);
      if (localRequest.callback != null) {
        localArrayList.add(new Pair(localRequest.callback, paramList.get(j)));
      }
    }
    Request.4 local4;
    Handler localHandler;
    if (localArrayList.size() > 0)
    {
      local4 = new Request.4(localArrayList, paramRequestBatch);
      localHandler = paramRequestBatch.getCallbackHandler();
      if (localHandler == null) {
        local4.run();
      }
    }
    else
    {
      return;
    }
    localHandler.post(local4);
  }
  
  private static void serializeAttachments(Bundle paramBundle, Request.Serializer paramSerializer)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if (isSupportedAttachmentType(localObject)) {
        paramSerializer.writeObject(str, localObject);
      }
    }
  }
  
  private static void serializeParameters(Bundle paramBundle, Request.Serializer paramSerializer)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if (isSupportedParameterType(localObject)) {
        paramSerializer.writeObject(str, localObject);
      }
    }
  }
  
  private static void serializeRequestsAsJSON(Request.Serializer paramSerializer, Collection<Request> paramCollection, Bundle paramBundle)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      ((Request)localIterator.next()).serializeToBatch(localJSONArray, paramBundle);
    }
    paramSerializer.writeString("batch", localJSONArray.toString());
  }
  
  private void serializeToBatch(JSONArray paramJSONArray, Bundle paramBundle)
  {
    JSONObject localJSONObject = new JSONObject();
    if (this.batchEntryName != null)
    {
      localJSONObject.put("name", this.batchEntryName);
      localJSONObject.put("omit_response_on_success", this.batchEntryOmitResultOnSuccess);
    }
    if (this.batchEntryDependsOn != null) {
      localJSONObject.put("depends_on", this.batchEntryDependsOn);
    }
    String str1 = getUrlForBatchedRequest();
    localJSONObject.put("relative_url", str1);
    localJSONObject.put("method", this.httpMethod);
    if (this.session != null) {
      Logger.registerAccessToken(this.session.getAccessToken());
    }
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator = this.parameters.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      Object localObject = this.parameters.get(str2);
      if (isSupportedAttachmentType(localObject))
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = "file";
        arrayOfObject[1] = Integer.valueOf(paramBundle.size());
        String str3 = String.format("%s%d", arrayOfObject);
        localArrayList1.add(str3);
        Utility.putObjectInBundle(paramBundle, str3, localObject);
      }
    }
    if (!localArrayList1.isEmpty()) {
      localJSONObject.put("attached_files", TextUtils.join(",", localArrayList1));
    }
    if (this.graphObject != null)
    {
      ArrayList localArrayList2 = new ArrayList();
      processGraphObject(this.graphObject, str1, new Request.5(this, localArrayList2));
      localJSONObject.put("body", TextUtils.join("&", localArrayList2));
    }
    paramJSONArray.put(localJSONObject);
  }
  
  static final void serializeToUrlConnection(RequestBatch paramRequestBatch, HttpURLConnection paramHttpURLConnection)
  {
    Logger localLogger = new Logger(LoggingBehavior.REQUESTS, "Request");
    int i = paramRequestBatch.size();
    HttpMethod localHttpMethod;
    URL localURL;
    if (i == 1)
    {
      localHttpMethod = paramRequestBatch.get(0).httpMethod;
      paramHttpURLConnection.setRequestMethod(localHttpMethod.name());
      localURL = paramHttpURLConnection.getURL();
      localLogger.append("Request:\n");
      localLogger.appendKeyValue("Id", paramRequestBatch.getId());
      localLogger.appendKeyValue("URL", localURL);
      localLogger.appendKeyValue("Method", paramHttpURLConnection.getRequestMethod());
      localLogger.appendKeyValue("User-Agent", paramHttpURLConnection.getRequestProperty("User-Agent"));
      localLogger.appendKeyValue("Content-Type", paramHttpURLConnection.getRequestProperty("Content-Type"));
      paramHttpURLConnection.setConnectTimeout(paramRequestBatch.getTimeout());
      paramHttpURLConnection.setReadTimeout(paramRequestBatch.getTimeout());
      if (localHttpMethod != HttpMethod.POST) {
        break label156;
      }
    }
    label156:
    for (int j = 1;; j = 0)
    {
      if (j != 0) {
        break label162;
      }
      localLogger.log();
      return;
      localHttpMethod = HttpMethod.POST;
      break;
    }
    label162:
    paramHttpURLConnection.setDoOutput(true);
    BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(paramHttpURLConnection.getOutputStream());
    for (;;)
    {
      Request.Serializer localSerializer;
      String str;
      try
      {
        localSerializer = new Request.Serializer(localBufferedOutputStream, localLogger);
        if (i == 1)
        {
          Request localRequest = paramRequestBatch.get(0);
          localLogger.append("  Parameters:\n");
          serializeParameters(localRequest.parameters, localSerializer);
          localLogger.append("  Attachments:\n");
          serializeAttachments(localRequest.parameters, localSerializer);
          if (localRequest.graphObject != null) {
            processGraphObject(localRequest.graphObject, localURL.getPath(), localSerializer);
          }
          localBufferedOutputStream.close();
          return;
        }
        str = getBatchAppId(paramRequestBatch);
        if (Utility.isNullOrEmpty(str)) {
          throw new FacebookException("At least one request in a batch must have an open Session, or a default app ID must be specified.");
        }
      }
      finally
      {
        localBufferedOutputStream.close();
      }
      localSerializer.writeString("batch_app_id", str);
      Bundle localBundle = new Bundle();
      serializeRequestsAsJSON(localSerializer, paramRequestBatch, localBundle);
      localLogger.append("  Attachments:\n");
      serializeAttachments(localBundle, localSerializer);
    }
  }
  
  public static final void setDefaultBatchApplicationId(String paramString)
  {
    defaultBatchApplicationId = paramString;
  }
  
  public static HttpURLConnection toHttpConnection(RequestBatch paramRequestBatch)
  {
    Iterator localIterator = paramRequestBatch.iterator();
    while (localIterator.hasNext()) {
      ((Request)localIterator.next()).validate();
    }
    for (;;)
    {
      try
      {
        if (paramRequestBatch.size() == 1) {
          localURL = new URL(paramRequestBatch.get(0).getUrlForSingleRequest());
        }
      }
      catch (MalformedURLException localMalformedURLException)
      {
        URL localURL;
        HttpURLConnection localHttpURLConnection;
        throw new FacebookException("could not construct URL for request", localMalformedURLException);
      }
      try
      {
        localHttpURLConnection = createConnection(localURL);
        serializeToUrlConnection(paramRequestBatch, localHttpURLConnection);
        return localHttpURLConnection;
      }
      catch (IOException localIOException)
      {
        throw new FacebookException("could not construct request body", localIOException);
      }
      catch (JSONException localJSONException)
      {
        throw new FacebookException("could not construct request body", localJSONException);
      }
      localURL = new URL(ServerProtocol.getGraphUrlBase());
    }
  }
  
  public static HttpURLConnection toHttpConnection(Collection<Request> paramCollection)
  {
    Validate.notEmptyAndContainsNoNulls(paramCollection, "requests");
    return toHttpConnection(new RequestBatch(paramCollection));
  }
  
  public static HttpURLConnection toHttpConnection(Request... paramVarArgs)
  {
    return toHttpConnection(Arrays.asList(paramVarArgs));
  }
  
  private static <T extends GraphObject> List<T> typedListFromResponse(Response paramResponse, Class<T> paramClass)
  {
    GraphMultiResult localGraphMultiResult = (GraphMultiResult)paramResponse.getGraphObjectAs(GraphMultiResult.class);
    if (localGraphMultiResult == null) {
      return null;
    }
    GraphObjectList localGraphObjectList = localGraphMultiResult.getData();
    if (localGraphObjectList == null) {
      return null;
    }
    return localGraphObjectList.castToListOf(paramClass);
  }
  
  private void validate()
  {
    if ((this.graphPath != null) && (this.restMethod != null)) {
      throw new IllegalArgumentException("Only one of a graph path or REST method may be specified per request.");
    }
  }
  
  public final Response executeAndWait()
  {
    return executeAndWait(this);
  }
  
  public final RequestAsyncTask executeAsync()
  {
    return executeBatchAsync(new Request[] { this });
  }
  
  public final String getBatchEntryDependsOn()
  {
    return this.batchEntryDependsOn;
  }
  
  public final String getBatchEntryName()
  {
    return this.batchEntryName;
  }
  
  public final boolean getBatchEntryOmitResultOnSuccess()
  {
    return this.batchEntryOmitResultOnSuccess;
  }
  
  public final Request.Callback getCallback()
  {
    return this.callback;
  }
  
  public final GraphObject getGraphObject()
  {
    return this.graphObject;
  }
  
  public final String getGraphPath()
  {
    return this.graphPath;
  }
  
  public final HttpMethod getHttpMethod()
  {
    return this.httpMethod;
  }
  
  public final Bundle getParameters()
  {
    return this.parameters;
  }
  
  public final String getRestMethod()
  {
    return this.restMethod;
  }
  
  public final Session getSession()
  {
    return this.session;
  }
  
  public final Object getTag()
  {
    return this.tag;
  }
  
  final String getUrlForBatchedRequest()
  {
    if (this.overriddenURL != null) {
      throw new FacebookException("Can't override URL for a batch request");
    }
    if (this.restMethod != null) {}
    for (String str = "method/" + this.restMethod;; str = this.graphPath)
    {
      addCommonParameters();
      return appendParametersToBaseUrl(str);
    }
  }
  
  final String getUrlForSingleRequest()
  {
    if (this.overriddenURL != null) {
      return this.overriddenURL.toString();
    }
    Object[] arrayOfObject2;
    if (this.restMethod != null)
    {
      arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = ServerProtocol.getRestUrlBase();
      arrayOfObject2[1] = this.restMethod;
    }
    Object[] arrayOfObject1;
    for (String str = String.format("%s/%s", arrayOfObject2);; str = String.format("%s/%s", arrayOfObject1))
    {
      addCommonParameters();
      return appendParametersToBaseUrl(str);
      arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = ServerProtocol.getGraphUrlBase();
      arrayOfObject1[1] = this.graphPath;
    }
  }
  
  public final void setBatchEntryDependsOn(String paramString)
  {
    this.batchEntryDependsOn = paramString;
  }
  
  public final void setBatchEntryName(String paramString)
  {
    this.batchEntryName = paramString;
  }
  
  public final void setBatchEntryOmitResultOnSuccess(boolean paramBoolean)
  {
    this.batchEntryOmitResultOnSuccess = paramBoolean;
  }
  
  public final void setCallback(Request.Callback paramCallback)
  {
    this.callback = paramCallback;
  }
  
  public final void setGraphObject(GraphObject paramGraphObject)
  {
    this.graphObject = paramGraphObject;
  }
  
  public final void setGraphPath(String paramString)
  {
    this.graphPath = paramString;
  }
  
  public final void setHttpMethod(HttpMethod paramHttpMethod)
  {
    if ((this.overriddenURL != null) && (paramHttpMethod != HttpMethod.GET)) {
      throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }
    if (paramHttpMethod != null) {}
    for (;;)
    {
      this.httpMethod = paramHttpMethod;
      return;
      paramHttpMethod = HttpMethod.GET;
    }
  }
  
  public final void setParameters(Bundle paramBundle)
  {
    this.parameters = paramBundle;
  }
  
  public final void setRestMethod(String paramString)
  {
    this.restMethod = paramString;
  }
  
  public final void setSession(Session paramSession)
  {
    this.session = paramSession;
  }
  
  public final void setTag(Object paramObject)
  {
    this.tag = paramObject;
  }
  
  public String toString()
  {
    return "{Request:  session: " + this.session + ", graphPath: " + this.graphPath + ", graphObject: " + this.graphObject + ", restMethod: " + this.restMethod + ", httpMethod: " + this.httpMethod + ", parameters: " + this.parameters + "}";
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.Request
 * JD-Core Version:    0.7.0.1
 */