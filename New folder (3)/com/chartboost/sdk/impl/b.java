package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Libraries.a.a;
import com.chartboost.sdk.c;
import com.chartboost.sdk.c.b;
import org.json.JSONObject;

public class b
  extends c
{
  public a.a h = null;
  public a.a i = null;
  public a.a j = null;
  public a.a k = null;
  public a.a l = null;
  
  public b(a parama)
  {
    super(parama);
    this.e = 5;
  }
  
  protected c.b a(Context paramContext)
  {
    return new b.a(this, paramContext, null);
  }
  
  public void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    b.1 local1 = new b.1(this);
    b.2 local2 = new b.2(this);
    b.3 local3 = new b.3(this);
    b.4 local4 = new b.4(this);
    b.5 local5 = new b.5(this);
    a("ad-landscape", local1, true);
    a("ad-portrait", local2, true);
    a("frame-landscape", local3);
    a("frame-portrait", local4);
    a("close", local5);
  }
  
  public void c()
  {
    super.c();
    if (this.i != null)
    {
      this.i.a();
      this.i = null;
    }
    if (this.h != null)
    {
      this.h.a();
      this.h = null;
    }
    this.k = null;
    this.j = null;
    this.l = null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.b
 * JD-Core Version:    0.7.0.1
 */