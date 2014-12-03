package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebView;
import com.chartboost.sdk.c.b;

public class x$a
  extends c.b
{
  public WebView c;
  
  public x$a(x paramx, Context paramContext, String paramString)
  {
    super(paramx, paramContext);
    setFocusable(false);
    this.c = new x.b(paramx, paramContext);
    this.c.setWebViewClient(new x.c(paramx, paramx));
    addView(this.c);
    this.c.loadDataWithBaseURL("file:///android_asset/", paramString, "text/html", "utf-8", null);
  }
  
  protected void a(int paramInt1, int paramInt2) {}
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.x.a
 * JD-Core Version:    0.7.0.1
 */