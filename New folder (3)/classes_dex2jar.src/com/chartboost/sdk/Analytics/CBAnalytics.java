package com.chartboost.sdk.Analytics;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.impl.j;
import com.chartboost.sdk.impl.k;
import java.math.BigDecimal;
import java.util.Date;

public class CBAnalytics
{
  public static final String TAG = "Chartboost Analytics";
  private static CBAnalytics a = null;
  private j b = new j(null, "CBAnalytics");
  
  private CBAnalytics()
  {
    this.b.a();
  }
  
  private String a(double paramDouble, int paramInt1, int paramInt2)
  {
    return new BigDecimal(paramDouble).setScale(paramInt1, paramInt2).doubleValue();
  }
  
  public static CBAnalytics sharedAnalytics()
  {
    try
    {
      if (a == null) {
        a = new CBAnalytics();
      }
      CBAnalytics localCBAnalytics = a;
      return localCBAnalytics;
    }
    finally {}
  }
  
  public Boolean recordPaymentTransaction(String paramString1, String paramString2, double paramDouble, String paramString3, int paramInt, Object paramObject)
  {
    Chartboost localChartboost = Chartboost.sharedChartboost();
    if (localChartboost.getContext() == null) {
      throw new IllegalStateException("The context must be set through the Chartboost method onCreate() before calling recordPaymentTransaction().");
    }
    if ((localChartboost.getAppID() == null) || (localChartboost.getAppSignature() == null)) {
      return Boolean.valueOf(false);
    }
    k localk = new k("api/purchase");
    localk.a(localChartboost.getContext());
    localk.a("product_id", paramString1);
    localk.a("title", paramString2);
    localk.a("price", a(paramDouble, 2, 4));
    localk.a("currency", paramString3);
    localk.a("quantity", paramInt);
    localk.a("timestamp", Integer.valueOf(Long.valueOf(new Date().getTime() / 1000L).intValue()));
    if (paramObject != null) {
      localk.a("meta", CBUtility.a(paramObject));
    }
    localk.b(localChartboost.getAppID(), localChartboost.getAppSignature());
    this.b.a(localk);
    return Boolean.valueOf(true);
  }
  
  public Boolean trackEvent(String paramString)
  {
    return trackEvent(paramString, 1.0D, null);
  }
  
  public Boolean trackEvent(String paramString, double paramDouble)
  {
    return trackEvent(paramString, paramDouble, null);
  }
  
  public Boolean trackEvent(String paramString, double paramDouble, Object paramObject)
  {
    Chartboost localChartboost = Chartboost.sharedChartboost();
    if (localChartboost.getContext() == null) {
      throw new IllegalStateException("The context must be set through the Chartboost method onCreate() before calling trackEvent().");
    }
    if ((localChartboost.getAppID() == null) || (localChartboost.getAppSignature() == null)) {
      return Boolean.valueOf(false);
    }
    k localk = new k("api/event");
    localk.a(localChartboost.getContext());
    localk.a("key", paramString);
    localk.a("value", paramDouble);
    localk.a("timestamp", System.currentTimeMillis() / 1000.0D);
    if (paramObject != null) {
      localk.a("meta", CBUtility.a(paramObject));
    }
    localk.b(localChartboost.getAppID(), localChartboost.getAppSignature());
    localk.a(true);
    this.b.a(localk);
    return Boolean.valueOf(true);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Analytics.CBAnalytics
 * JD-Core Version:    0.7.0.1
 */