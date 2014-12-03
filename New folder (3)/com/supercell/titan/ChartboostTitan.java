package com.supercell.titan;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.special.ChartboostData;

public class ChartboostTitan
{
  private static Chartboost a;
  private static ChartboostDelegate b;
  
  static void a(String paramString)
  {
    ChartboostData.get(paramString, new o());
  }
  
  public static void adShown(String paramString)
  {
    ChartboostData.show(paramString, new k(paramString));
  }
  
  public static void cacheInterstitial(String paramString)
  {
    a.cacheInterstitial(paramString);
  }
  
  public static native void chartboostAdShowFailed(String paramString1, int paramInt, String paramString2);
  
  public static native void chartboostAdShowSuccess(String paramString);
  
  public static native void chartboostReceivedAd(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11);
  
  public static native void chartboostRequestAdFailed(int paramInt, String paramString);
  
  public static Chartboost getChartboost()
  {
    return a;
  }
  
  public static void requestAd(String paramString)
  {
    GameApp.getInstance().runOnUiThread(new n(paramString));
  }
  
  public static void showInterstitial(String paramString)
  {
    a.showInterstitial(paramString);
  }
  
  public static void startSession(String paramString1, String paramString2)
  {
    GameApp localGameApp = GameApp.getInstance();
    localGameApp.runOnUiThread(new j(localGameApp, paramString1, paramString2));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.ChartboostTitan
 * JD-Core Version:    0.7.0.1
 */