package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLinkData
{
  private static final String APPLINK_BRIDGE_ARGS_KEY = "bridge_args";
  private static final String APPLINK_METHOD_ARGS_KEY = "method_args";
  private static final String APPLINK_VERSION_KEY = "version";
  public static final String ARGUMENTS_TAPTIME_KEY = "com.facebook.platform.APPLINK_TAP_TIME_UTC";
  private static final String BRIDGE_ARGS_METHOD_KEY = "method";
  private static final String BUNDLE_APPLINK_ARGS_KEY = "com.facebook.platform.APPLINK_ARGS";
  private static final String METHOD_ARGS_REF_KEY = "ref";
  private static final String METHOD_ARGS_TARGET_URL_KEY = "target_url";
  private static final String TAG = AppLinkData.class.getCanonicalName();
  private JSONObject arguments;
  private String[] ref;
  private Uri targetUri;
  private String version;
  
  public static AppLinkData createFromActivity(Activity paramActivity)
  {
    Validate.notNull(paramActivity, "activity");
    Intent localIntent = paramActivity.getIntent();
    AppLinkData localAppLinkData;
    if (localIntent == null) {
      localAppLinkData = null;
    }
    do
    {
      return localAppLinkData;
      localAppLinkData = createFromJson(localIntent.getStringExtra("com.facebook.platform.APPLINK_ARGS"));
    } while (localAppLinkData != null);
    return createFromUri(localIntent.getData());
  }
  
  private static AppLinkData createFromJson(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return null;
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString);
        String str1 = localJSONObject.getString("version");
        if ((localJSONObject.getJSONObject("bridge_args").getString("method").equals("applink")) && (str1.equals("2")))
        {
          AppLinkData localAppLinkData = new AppLinkData();
          localAppLinkData.version = str1;
          localAppLinkData.arguments = localJSONObject.getJSONObject("method_args");
          if (localAppLinkData.arguments.has("ref"))
          {
            String str2 = localAppLinkData.arguments.getString("ref");
            if (str2 != null) {
              localAppLinkData.ref = str2.split(",");
            }
          }
          if (localAppLinkData.arguments.has("target_url")) {
            localAppLinkData.targetUri = Uri.parse(localAppLinkData.arguments.getString("target_url"));
          }
          return localAppLinkData;
        }
      }
      catch (JSONException localJSONException) {}
    }
    return null;
  }
  
  private static AppLinkData createFromUri(Uri paramUri)
  {
    if (paramUri == null) {}
    return null;
  }
  
  public static void fetchDeferredAppLinkData(Context paramContext, AppLinkData.CompletionHandler paramCompletionHandler)
  {
    fetchDeferredAppLinkData(paramContext, null, paramCompletionHandler);
  }
  
  public static void fetchDeferredAppLinkData(Context paramContext, String paramString, AppLinkData.CompletionHandler paramCompletionHandler)
  {
    Validate.notNull(paramContext, "context");
    Validate.notNull(paramCompletionHandler, "completionHandler");
    if (paramString == null) {
      paramString = Utility.getMetadataApplicationId(paramContext);
    }
    Validate.notNull(paramString, "applicationId");
    AppLinkData.DeferredAppLinkDataClient localDeferredAppLinkDataClient = new AppLinkData.DeferredAppLinkDataClient(paramContext, paramString);
    localDeferredAppLinkDataClient.setCompletedListener(new AppLinkData.1(paramCompletionHandler));
    if (!localDeferredAppLinkDataClient.start()) {
      new Handler(Looper.getMainLooper()).post(new AppLinkData.2(paramCompletionHandler));
    }
  }
  
  public JSONObject getArguments()
  {
    return this.arguments;
  }
  
  public String[] getRef()
  {
    return this.ref;
  }
  
  public Uri getTargetUri()
  {
    return this.targetUri;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppLinkData
 * JD-Core Version:    0.7.0.1
 */