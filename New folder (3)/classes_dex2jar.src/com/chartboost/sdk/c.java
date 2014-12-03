package com.chartboost.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.chartboost.sdk.Libraries.a.a;
import com.chartboost.sdk.impl.a;
import com.chartboost.sdk.impl.a.b;
import com.chartboost.sdk.impl.o;
import com.chartboost.sdk.impl.o.b;
import org.json.JSONObject;

public abstract class c
{
  public c.a a = null;
  public c.c b = null;
  public c.a c = null;
  public c.a d = null;
  protected int e = 0;
  protected JSONObject f;
  protected a g;
  private int h;
  private int i;
  private int j;
  private c.b k;
  
  public c(a parama)
  {
    this.g = parama;
    this.k = null;
  }
  
  protected abstract c.b a(Context paramContext);
  
  protected void a(a.a parama)
  {
    if (parama != null) {
      this.h = (1 + this.h);
    }
    this.i = (1 + this.i);
    if ((this.i != this.e) || (a())) {}
    while (this.d == null) {
      return;
    }
    this.d.a();
  }
  
  protected void a(String paramString, o.b paramb)
  {
    a(paramString, paramb, false);
  }
  
  protected void a(String paramString, o.b paramb, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("paramNoMemoryCache", paramBoolean);
    a(this.f, paramString, paramb, localBundle);
  }
  
  public void a(JSONObject paramJSONObject)
  {
    this.i = 0;
    this.j = 0;
    this.h = 0;
    this.f = paramJSONObject.optJSONObject("assets");
    if ((this.f == null) && (this.d != null)) {
      this.d.a();
    }
  }
  
  protected void a(JSONObject paramJSONObject, String paramString, o.b paramb, Bundle paramBundle)
  {
    JSONObject localJSONObject = paramJSONObject.optJSONObject(paramString);
    if (localJSONObject != null)
    {
      this.j = (1 + this.j);
      String str1 = localJSONObject.optString("url");
      String str2 = localJSONObject.optString("checksum");
      o.a().a(str1, str2, paramb, null, paramBundle);
      return;
    }
    a(null);
  }
  
  public boolean a()
  {
    if (this.h != this.j) {
      return false;
    }
    if (this.c != null) {
      this.c.a();
    }
    return true;
  }
  
  public boolean b()
  {
    if (this.g.c != a.b.b) {
      return false;
    }
    Chartboost.sharedChartboost().a(this.g);
    Activity localActivity = Chartboost.sharedChartboost().c();
    if (localActivity == null)
    {
      this.k = null;
      return false;
    }
    this.k = a(localActivity);
    if (this.k.a(localActivity)) {
      return true;
    }
    this.k = null;
    return false;
  }
  
  public void c()
  {
    e();
    this.c = null;
    this.d = null;
    this.b = null;
    this.a = null;
    this.f = null;
  }
  
  public c.b d()
  {
    return this.k;
  }
  
  public void e()
  {
    if (this.k != null) {
      this.k.b();
    }
    this.k = null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.c
 * JD-Core Version:    0.7.0.1
 */