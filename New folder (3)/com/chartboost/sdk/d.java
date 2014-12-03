package com.chartboost.sdk;

import com.chartboost.sdk.impl.j;
import com.chartboost.sdk.impl.k;

final class d
{
  private static d a = null;
  private j b = new j("https://live.chartboost.com", null);
  
  private static d a()
  {
    if (a == null) {
      a = new d();
    }
    return a;
  }
  
  protected static void a(Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    k localk = new k("api/more");
    localk.a("format", "data");
    a().a(localk, paramCBAPIResponseCallback);
  }
  
  private void a(k paramk, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    Chartboost localChartboost = Chartboost.sharedChartboost();
    paramk.a(localChartboost.a.b());
    paramk.b(localChartboost.getAppID(), localChartboost.getAppSignature());
    this.b.a(paramk, new d.1(this, paramCBAPIResponseCallback));
  }
  
  protected static void a(String paramString, int paramInt, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    k localk = new k("api/get_batch");
    localk.a("raw", Integer.valueOf(1));
    localk.a("cache", Integer.valueOf(1));
    if (paramString != null) {
      localk.a("location", paramString);
    }
    if (paramInt > 10) {
      paramInt = 10;
    }
    localk.a("amount", Integer.valueOf(paramInt));
    a().a(localk, paramCBAPIResponseCallback);
  }
  
  protected static void a(String paramString, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    k localk = new k("api/get");
    localk.a("raw", Integer.valueOf(1));
    localk.a("cache", Integer.valueOf(1));
    if (paramString != null) {
      localk.a("location", paramString);
    }
    a().a(localk, paramCBAPIResponseCallback);
  }
  
  protected static void b(String paramString, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    k localk = new k("api/show");
    localk.a("ad_id", paramString);
    a().a(localk, paramCBAPIResponseCallback);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.d
 * JD-Core Version:    0.7.0.1
 */