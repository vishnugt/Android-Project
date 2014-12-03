package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;

class q$a
  extends View
{
  public q$a(q paramq, Context paramContext)
  {
    super(paramContext);
    setFocusable(false);
  }
  
  public void a()
  {
    int i = -872415232;
    int j;
    if (q.a(this.a))
    {
      j = -2013265920;
      if (!q.a(this.a)) {
        break label100;
      }
    }
    for (;;)
    {
      GradientDrawable localGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[] { i, j });
      localGradientDrawable.setGradientType(1);
      localGradientDrawable.setGradientRadius(Math.min(getWidth(), getHeight()) / 2.0F);
      localGradientDrawable.setGradientCenter(getWidth() / 2.0F, getHeight() / 2.0F);
      setBackgroundDrawable(localGradientDrawable);
      return;
      j = i;
      break;
      label100:
      i = -2013265920;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.q.a
 * JD-Core Version:    0.7.0.1
 */