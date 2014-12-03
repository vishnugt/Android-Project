package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public final class bl
  extends ay
{
  public bl(ax paramax, boolean paramBoolean)
  {
    super(paramax, paramBoolean);
  }
  
  private static WebResourceResponse a(Context paramContext, String paramString1, String paramString2)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString2).openConnection();
    try
    {
      ar.a(paramContext, paramString1, localHttpURLConnection);
      localHttpURLConnection.connect();
      WebResourceResponse localWebResourceResponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(ar.a(new InputStreamReader(localHttpURLConnection.getInputStream())).getBytes("UTF-8")));
      return localWebResourceResponse;
    }
    finally
    {
      localHttpURLConnection.disconnect();
    }
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    try
    {
      if (!"mraid.js".equalsIgnoreCase(new File(paramString).getName())) {
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      if (!(paramWebView instanceof ax)) {
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      ax localax = (ax)paramWebView;
      localax.e().c();
      if (localax.d().e) {
        return a(localax.getContext(), this.a.g().b, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
      }
      if (localax.h()) {
        return a(localax.getContext(), this.a.g().b, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
      }
      WebResourceResponse localWebResourceResponse = a(localax.getContext(), this.a.g().b, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
      return localWebResourceResponse;
    }
    catch (IOException localIOException)
    {
      new StringBuilder("Could not fetching MRAID JS. ").append(localIOException.getMessage()).toString();
    }
    return super.shouldInterceptRequest(paramWebView, paramString);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bl
 * JD-Core Version:    0.7.0.1
 */