package com.mobileapptracker;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

final class e
  implements Runnable
{
  private final WeakReference b;
  
  public e(MobileAppTracker paramMobileAppTracker, Context paramContext)
  {
    this.b = new WeakReference(paramContext);
  }
  
  public final void run()
  {
    try
    {
      WebView localWebView = new WebView((Context)this.b.get());
      String str = localWebView.getSettings().getUserAgentString();
      localWebView.destroy();
      MobileAppTracker.a(this.a, str);
      return;
    }
    catch (Exception localException)
    {
      while (!MobileAppTracker.c(this.a)) {}
      localException.printStackTrace();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.mobileapptracker.e
 * JD-Core Version:    0.7.0.1
 */