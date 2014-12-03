package com.chartboost.sdk.impl;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.chartboost.sdk.c.a;
import com.chartboost.sdk.c.c;
import java.net.URI;
import java.net.URLDecoder;
import org.json.JSONObject;
import org.json.JSONTokener;

class x$c
  extends WebViewClient
{
  private x b;
  
  public x$c(x paramx1, x paramx2)
  {
    this.b = paramx2;
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    if ((this.b != null) && (this.b.c != null)) {
      this.b.c.a();
    }
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    if (this.b.d != null) {
      this.b.d.a();
    }
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    String[] arrayOfString;
    Integer localInteger;
    label97:
    do
    {
      try
      {
        String str1 = new URI(paramString).getScheme();
        if (!str1.equals("chartboost")) {
          break label135;
        }
        arrayOfString = paramString.split("/");
        localInteger = Integer.valueOf(arrayOfString.length);
        if (localInteger.intValue() >= 3) {
          break label97;
        }
        if (this.b.a != null) {
          this.b.a.a();
        }
      }
      catch (Exception localException1)
      {
        while (this.b.a == null) {}
        this.b.a.a();
        return false;
      }
      return false;
      String str2 = arrayOfString[2];
      if (str2.equals("close")) {
        if (this.b.a != null) {
          this.b.a.a();
        }
      }
      while (!str2.equals("link")) {
        return true;
      }
      if (localInteger.intValue() >= 4) {
        break;
      }
    } while (this.b.a == null);
    label135:
    this.b.a.a();
    return false;
    for (;;)
    {
      try
      {
        String str4 = URLDecoder.decode(arrayOfString[3], "UTF-8");
        str3 = str4;
      }
      catch (Exception localException2)
      {
        try
        {
          if (localInteger.intValue() <= 4) {
            break label272;
          }
          localJSONObject = new JSONObject(new JSONTokener(URLDecoder.decode(arrayOfString[4], "UTF-8")));
          if (this.b.b == null) {
            break;
          }
          this.b.b.a(str3, localJSONObject);
        }
        catch (Exception localException4)
        {
          String str3;
          JSONObject localJSONObject;
          Exception localException3;
          break label267;
        }
        localException2 = localException2;
        localException3 = localException2;
        str3 = null;
      }
      label267:
      localException3.printStackTrace();
      label272:
      localJSONObject = null;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.x.c
 * JD-Core Version:    0.7.0.1
 */