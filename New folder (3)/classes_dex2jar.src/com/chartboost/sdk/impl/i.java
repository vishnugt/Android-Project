package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebView;
import android.widget.LinearLayout.LayoutParams;
import com.chartboost.sdk.Libraries.CBUtility;
import org.json.JSONObject;

public class i
  extends c
  implements h.b
{
  private WebView b;
  
  public i(Context paramContext)
  {
    super(paramContext);
    this.b = new WebView(paramContext);
    addView(this.b, new LinearLayout.LayoutParams(-1, -1));
    this.b.setBackgroundColor(0);
    this.b.setWebViewClient(new i.1(this));
  }
  
  public int a()
  {
    return CBUtility.a(100, getContext());
  }
  
  public void a(JSONObject paramJSONObject, int paramInt)
  {
    String str = paramJSONObject.optString("html");
    if (str != null) {}
    try
    {
      this.b.loadDataWithBaseURL("file:///android_res/", str, "text/html", "UTF-8", null);
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.i
 * JD-Core Version:    0.7.0.1
 */