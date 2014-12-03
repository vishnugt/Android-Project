package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout.LayoutParams;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation;
import com.chartboost.sdk.Libraries.CBUtility;
import org.json.JSONObject;

public class d
  extends c
  implements h.b
{
  private static int b = 100;
  private static int c = 5;
  private g d;
  
  public d(Context paramContext)
  {
    super(paramContext);
    this.d = new g(paramContext);
    addView(this.d, new LinearLayout.LayoutParams(-1, -1));
  }
  
  public int a()
  {
    return CBUtility.a(b + 2 * c, getContext());
  }
  
  public void a(JSONObject paramJSONObject, int paramInt)
  {
    boolean bool = Chartboost.sharedChartboost().getOrientation().isPortrait();
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("assets");
    if (localJSONObject1 != null) {
      if (!bool) {
        break label90;
      }
    }
    label90:
    for (String str = "portrait";; str = "landscape")
    {
      JSONObject localJSONObject2 = localJSONObject1.optJSONObject(str);
      if (localJSONObject2 != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("index", paramInt);
        o.a().a(localJSONObject2.optString("url"), localJSONObject2.optString("checksum"), null, this.d, localBundle);
      }
      return;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.d
 * JD-Core Version:    0.7.0.1
 */