package com.chartboost.sdk;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;
import com.chartboost.sdk.impl.u.a;

public abstract class c$b
  extends RelativeLayout
  implements u.a
{
  protected boolean a = false;
  
  public c$b(c paramc, Context paramContext)
  {
    super(paramContext);
    setFocusableInTouchMode(true);
    requestFocus();
    setOnTouchListener(new c.b.1(this));
  }
  
  private boolean b(int paramInt1, int paramInt2)
  {
    try
    {
      a(paramInt1, paramInt2);
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public void a()
  {
    a((Activity)getContext());
  }
  
  protected abstract void a(int paramInt1, int paramInt2);
  
  public boolean a(Activity paramActivity)
  {
    try
    {
      m = getWidth();
      i = getHeight();
      if ((m != 0) && (i != 0)) {
        break label153;
      }
      View localView = paramActivity.getWindow().findViewById(16908290);
      if (localView == null) {
        localView = paramActivity.getWindow().getDecorView();
      }
      int n = localView.getWidth();
      int i1 = localView.getHeight();
      i = i1;
      j = n;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int m;
        DisplayMetrics localDisplayMetrics;
        int i = 0;
        int j = 0;
        continue;
        int k = i;
        i = j;
        j = k;
        continue;
        label153:
        j = m;
      }
    }
    if ((j == 0) || (i == 0))
    {
      localDisplayMetrics = new DisplayMetrics();
      paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      j = localDisplayMetrics.widthPixels;
      i = localDisplayMetrics.heightPixels;
    }
    if (Chartboost.sharedChartboost().getForcedOrientationDifference().isOdd()) {
      return b(i, j);
    }
  }
  
  public void b() {}
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a) {
      return;
    }
    if (Chartboost.sharedChartboost().getForcedOrientationDifference().isOdd())
    {
      b(paramInt2, paramInt1);
      return;
    }
    b(paramInt1, paramInt2);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.c.b
 * JD-Core Version:    0.7.0.1
 */