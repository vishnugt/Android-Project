package com.chartboost.sdk.impl;

import com.chartboost.sdk.c;
import com.chartboost.sdk.c.b;
import java.util.Date;
import org.json.JSONObject;

public class a
{
  public JSONObject a;
  public Date b;
  public a.b c;
  public a.c d;
  public String e;
  public c f;
  public a.a g;
  public u h;
  public boolean i;
  public boolean j;
  public boolean k;
  public boolean l;
  
  public a(JSONObject paramJSONObject, a.c paramc, a.a parama, a.b paramb, String paramString, boolean paramBoolean)
  {
    if (paramJSONObject == null) {
      paramJSONObject = new JSONObject();
    }
    this.c = paramb;
    this.e = paramString;
    this.a = paramJSONObject;
    this.b = new Date();
    this.g = parama;
    this.d = paramc;
    this.l = paramBoolean;
    this.i = false;
    this.j = false;
    this.k = false;
    boolean bool = paramJSONObject.optString("type", "").equals("native");
    if ((bool) && (this.d == a.c.b)) {
      this.f = new b(this);
    }
    for (;;)
    {
      this.f.c = new a.1(this, this);
      this.f.a = new a.2(this, this);
      this.f.b = new a.3(this, this);
      this.f.d = new a.4(this, this);
      this.f.a(paramJSONObject);
      return;
      if ((bool) && (this.d == a.c.c)) {
        this.f = new h(this);
      } else {
        this.f = new x(this);
      }
    }
  }
  
  public boolean a()
  {
    this.i = true;
    this.j = true;
    this.k = true;
    this.f.a();
    if (this.f.d() != null) {
      return true;
    }
    this.i = false;
    this.j = false;
    this.k = false;
    return false;
  }
  
  public void b()
  {
    if (this.h != null) {
      this.h.a();
    }
    try
    {
      if (this.f.d().getParent() != null) {
        this.h.removeView(this.f.d());
      }
      label41:
      if (this.f != null) {
        this.f.c();
      }
      this.a = null;
      this.b = null;
      this.g = null;
      this.f = null;
      this.h = null;
      return;
    }
    catch (Exception localException)
    {
      break label41;
    }
  }
  
  public void c()
  {
    if (this.h != null) {
      this.h.a();
    }
    try
    {
      if (this.f.d().getParent() != null) {
        this.h.removeView(this.f.d());
      }
      label41:
      if (this.f != null) {
        this.f.e();
      }
      return;
    }
    catch (Exception localException)
    {
      break label41;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.a
 * JD-Core Version:    0.7.0.1
 */