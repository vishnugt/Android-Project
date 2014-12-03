package com.jirbo.adcolony;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

final class dr
  extends WebViewClient
{
  dr(AdColonyBrowser paramAdColonyBrowser) {}
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (!AdColonyBrowser.C)
    {
      AdColonyBrowser.y = true;
      AdColonyBrowser.x = false;
      this.a.r.setVisibility(4);
      AdColonyBrowser.v = this.a.b.canGoBack();
      AdColonyBrowser.w = this.a.b.canGoForward();
    }
    this.a.t.invalidate();
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if (!AdColonyBrowser.C)
    {
      AdColonyBrowser.x = true;
      AdColonyBrowser.y = false;
      this.a.r.setVisibility(0);
    }
    this.a.t.invalidate();
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    aq.d.a("Error viewing URL: ").b(paramString1);
    this.a.finish();
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if ((paramString.startsWith("market://")) || (paramString.startsWith("amzn://")))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      if (a.v != null) {
        a.v.startActivity(localIntent);
      }
      return true;
    }
    return false;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dr
 * JD-Core Version:    0.7.0.1
 */