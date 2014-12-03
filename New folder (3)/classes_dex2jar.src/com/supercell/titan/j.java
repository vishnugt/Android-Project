package com.supercell.titan;

import com.chartboost.sdk.Chartboost;

final class j
  implements Runnable
{
  j(GameApp paramGameApp, String paramString1, String paramString2) {}
  
  public final void run()
  {
    try
    {
      Chartboost localChartboost = ChartboostTitan.a();
      int i = 0;
      if (localChartboost == null)
      {
        ChartboostTitan.a(Chartboost.sharedChartboost());
        ChartboostTitan.a().onCreate(this.a, this.b, this.c, ChartboostTitan.b());
        i = 1;
      }
      ChartboostTitan.a().startSession();
      if (i != 0) {
        ChartboostTitan.a().onStart(this.a);
      }
      return;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.j
 * JD-Core Version:    0.7.0.1
 */