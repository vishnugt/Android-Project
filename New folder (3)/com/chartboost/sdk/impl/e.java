package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.chartboost.sdk.Libraries.CBUtility;
import org.json.JSONObject;

public class e
  extends c
  implements h.b
{
  private static int c = 50;
  private static int d = 10;
  public f b;
  private g e;
  private TextView f;
  
  public e(Context paramContext)
  {
    super(paramContext);
    this.e = new g(paramContext);
    this.b = new f(paramContext);
    this.f = new TextView(paramContext);
    this.f.setTypeface(null, 1);
    this.f.setTextSize(2, 16.0F);
    this.f.setShadowLayer(1.0F, 1.0F, 1.0F, -1);
    this.f.setBackgroundColor(0);
    this.f.setTextColor(-16777216);
    this.f.setEllipsize(TextUtils.TruncateAt.END);
    setBackgroundColor(-3355444);
    setFocusable(false);
    addView(this.e);
    addView(this.f);
    addView(this.b);
  }
  
  public int a()
  {
    return CBUtility.a(c + 2 * d, getContext());
  }
  
  public void a(JSONObject paramJSONObject, int paramInt)
  {
    this.f.setText(paramJSONObject.optString("name", "Unknown App"));
    String str1 = paramJSONObject.optString("deep-text");
    if ((str1 != null) && (!str1.equals(""))) {
      this.b.setText(str1);
    }
    for (;;)
    {
      JSONObject localJSONObject1 = paramJSONObject.optJSONObject("assets");
      if (localJSONObject1 != null)
      {
        JSONObject localJSONObject2 = localJSONObject1.optJSONObject("icon");
        if (localJSONObject2 != null)
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("index", paramInt);
          o.a().a(localJSONObject2.optString("url"), localJSONObject2.optString("checksum"), null, this.e, localBundle);
        }
      }
      b();
      return;
      String str2 = paramJSONObject.optString("text", "VIEW");
      this.b.setText(str2);
    }
  }
  
  protected void b()
  {
    int i = CBUtility.a(c, getContext());
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(i, i);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -1);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-2, -2);
    int j = CBUtility.a(d, getContext());
    localLayoutParams1.setMargins(j, j, j, j);
    localLayoutParams2.setMargins(j, j, j, j);
    localLayoutParams3.setMargins(j, j, j, j);
    localLayoutParams2.weight = 1.0F;
    this.f.setGravity(16);
    localLayoutParams3.gravity = 16;
    this.e.setLayoutParams(localLayoutParams1);
    this.e.setScaleType(ImageView.ScaleType.FIT_CENTER);
    this.f.setLayoutParams(localLayoutParams2);
    this.b.setLayoutParams(localLayoutParams3);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.e
 * JD-Core Version:    0.7.0.1
 */