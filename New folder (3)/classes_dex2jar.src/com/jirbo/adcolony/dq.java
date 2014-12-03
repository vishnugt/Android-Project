package com.jirbo.adcolony;

import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

final class dq
  extends WebChromeClient
{
  dq(AdColonyBrowser paramAdColonyBrowser) {}
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    paramCallback.invoke(paramString, true, false);
  }
  
  public final void onProgressChanged(WebView paramWebView, int paramInt)
  {
    this.a.setProgress(paramInt * 1000);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dq
 * JD-Core Version:    0.7.0.1
 */