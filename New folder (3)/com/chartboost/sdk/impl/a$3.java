package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.c.c;
import java.util.List;
import org.json.JSONObject;

class a$3
  implements c.c
{
  a$3(a parama1, a parama2) {}
  
  public void a(String paramString, JSONObject paramJSONObject)
  {
    if (paramString != null) {}
    for (;;)
    {
      String str = this.b.a.optString("deep-link");
      if ((str != null) && (!str.equals(""))) {}
      try
      {
        Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        int i = Chartboost.sharedChartboost().getContext().getPackageManager().queryIntentActivities(localIntent, 65536).size();
        if (i > 0) {
          paramString = str;
        }
      }
      catch (Exception localException)
      {
        label75:
        break label75;
      }
      this.b.g.a(this.b, paramString, paramJSONObject);
      return;
      paramString = this.b.a.optString("link");
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.a.3
 * JD-Core Version:    0.7.0.1
 */