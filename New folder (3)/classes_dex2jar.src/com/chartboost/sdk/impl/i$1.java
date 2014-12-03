package com.chartboost.sdk.impl;

import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class i$1
  extends WebViewClient
{
  i$1(i parami) {}
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString == null) {
      return false;
    }
    if ((paramString.contains("chartboost")) && (paramString.contains("click")) && (this.a.a != null)) {
      this.a.a.onClick(this.a);
    }
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.i.1
 * JD-Core Version:    0.7.0.1
 */