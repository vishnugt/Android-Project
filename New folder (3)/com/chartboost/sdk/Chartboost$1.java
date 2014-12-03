package com.chartboost.sdk;

import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.impl.j.c;
import com.chartboost.sdk.impl.k;
import org.json.JSONObject;

class Chartboost$1
  extends j.c
{
  Chartboost$1(Chartboost paramChartboost) {}
  
  public void a(JSONObject paramJSONObject, k paramk)
  {
    if (CBUtility.a(this.a.getContext()))
    {
      String str = paramJSONObject.optString("latest-sdk-version");
      if ((str != null) && (!str.equals("")) && (!str.equals("3.3.0"))) {
        String.format("WARNING: you have an outdated version of the SDK (Current: %s, Latest: %s). Get the latest version at chartboost.com/support/sdk#android", new Object[] { str, "3.3.0" });
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Chartboost.1
 * JD-Core Version:    0.7.0.1
 */