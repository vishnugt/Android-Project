package com.facebook;

import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient.CompletedListener;
import org.json.JSONException;
import org.json.JSONObject;

final class AppLinkData$1
  implements PlatformServiceClient.CompletedListener
{
  AppLinkData$1(AppLinkData.CompletionHandler paramCompletionHandler) {}
  
  public final void completed(Bundle paramBundle)
  {
    AppLinkData localAppLinkData = null;
    long l;
    if (paramBundle != null)
    {
      String str = paramBundle.getString("com.facebook.platform.APPLINK_ARGS");
      l = paramBundle.getLong("com.facebook.platform.APPLINK_TAP_TIME_UTC", -1L);
      localAppLinkData = AppLinkData.access$000(str);
      if (l == -1L) {}
    }
    try
    {
      localAppLinkData.getArguments().put("com.facebook.platform.APPLINK_TAP_TIME_UTC", l);
      this.val$completionHandler.onDeferredAppLinkDataFetched(localAppLinkData);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        AppLinkData.access$100();
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppLinkData.1
 * JD-Core Version:    0.7.0.1
 */