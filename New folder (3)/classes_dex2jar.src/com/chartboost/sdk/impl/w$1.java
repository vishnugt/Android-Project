package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;

class w$1
  implements Runnable
{
  w$1(w paramw) {}
  
  public void run()
  {
    CBOrientation.Difference localDifference = Chartboost.sharedChartboost().getForcedOrientationDifference();
    float f1 = this.a.getContext().getResources().getDisplayMetrics().density;
    w localw1 = this.a;
    w.a(localw1, w.a(localw1) + 1.0F * f1);
    if (localDifference.isOdd()) {}
    for (int i = this.a.getWidth();; i = this.a.getHeight())
    {
      float f2 = i - f1 * 9.0F;
      if (w.a(this.a) > f2)
      {
        w localw2 = this.a;
        w.a(localw2, w.a(localw2) - f2 * 2.0F);
      }
      if (this.a.getWindowVisibility() == 0) {
        this.a.invalidate();
      }
      return;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.w.1
 * JD-Core Version:    0.7.0.1
 */