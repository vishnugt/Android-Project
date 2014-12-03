package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.c;
import com.chartboost.sdk.c.b;
import org.json.JSONObject;

public class x
  extends c
{
  private String h = null;
  
  public x(a parama)
  {
    super(parama);
  }
  
  protected c.b a(Context paramContext)
  {
    return new x.a(this, paramContext, this.h);
  }
  
  public void a(JSONObject paramJSONObject)
  {
    String str = paramJSONObject.optString("html");
    if (str == null) {
      return;
    }
    this.h = str;
    a();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.x
 * JD-Core Version:    0.7.0.1
 */