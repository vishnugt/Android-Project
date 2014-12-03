package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;

public class u
  extends RelativeLayout
{
  private View a;
  private q b;
  private OrientationEventListener c;
  private CBOrientation.Difference d = null;
  
  public u(Context paramContext, u.a parama)
  {
    super(paramContext);
    this.a = ((View)parama);
    this.b = new q(paramContext);
    addView(this.b, new RelativeLayout.LayoutParams(-1, -1));
    addView(this.a, new RelativeLayout.LayoutParams(-1, -1));
    Chartboost localChartboost = Chartboost.sharedChartboost();
    if ((localChartboost.getOrientation() != null) && (localChartboost.getOrientation() != CBOrientation.UNSPECIFIED))
    {
      this.d = Chartboost.sharedChartboost().getForcedOrientationDifference();
      this.c = new u.1(this, paramContext, 1);
      this.c.enable();
    }
    setOnTouchListener(new u.2(this));
  }
  
  public void a()
  {
    if (this.c != null)
    {
      this.c.disable();
      this.c = null;
    }
  }
  
  public q b()
  {
    return this.b;
  }
  
  public View c()
  {
    return this.a;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.u
 * JD-Core Version:    0.7.0.1
 */