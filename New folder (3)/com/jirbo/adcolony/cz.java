package com.jirbo.adcolony;

import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;

final class cz
  extends WebChromeClient
{
  cz(cv paramcv) {}
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str = paramConsoleMessage.sourceId();
    if (str == null) {
      str = "Internal";
    }
    for (;;)
    {
      aq.b.a(paramConsoleMessage.message()).a(" [").a(str).a(" line ").a(paramConsoleMessage.lineNumber()).b("]");
      return true;
      int i = str.lastIndexOf('/');
      if (i != -1) {
        str = str.substring(i + 1);
      }
    }
  }
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    paramCallback.invoke(paramString, true, false);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.cz
 * JD-Core Version:    0.7.0.1
 */