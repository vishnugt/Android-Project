package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.OrientationEventListener;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;

class u$1
  extends OrientationEventListener
{
  u$1(u paramu, Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public void onOrientationChanged(int paramInt)
  {
    CBOrientation.Difference localDifference = Chartboost.sharedChartboost().getForcedOrientationDifference();
    if (u.a(this.a) == localDifference) {
      return;
    }
    u.a(this.a, localDifference);
    ((u.a)u.b(this.a)).a();
    this.a.invalidate();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.u.1
 * JD-Core Version:    0.7.0.1
 */