package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

class f$1
  extends Drawable
{
  boolean a = false;
  
  f$1(f paramf) {}
  
  public void draw(Canvas paramCanvas)
  {
    int i = 0;
    float f1 = this.b.getContext().getResources().getDisplayMetrics().density;
    int[] arrayOfInt = getState();
    int j = 0;
    float f2;
    Paint localPaint;
    if (i >= arrayOfInt.length)
    {
      f2 = 6.0F * f1;
      f.a(this.b).reset();
      f.b(this.b).set(getBounds());
      f.a(this.b).addRoundRect(f.b(this.b), f2, f2, Path.Direction.CW);
      f.c(this.b);
      localPaint = f.d(this.b);
      if (j == 0) {
        break label334;
      }
    }
    label334:
    for (Shader localShader = f.e(this.b);; localShader = f.f(this.b))
    {
      localPaint.setShader(localShader);
      paramCanvas.drawPath(f.a(this.b), f.d(this.b));
      float f3 = 1.0F * f1;
      f.g(this.b).reset();
      f.b(this.b).inset(f3 / 2.0F, f3 / 2.0F);
      f.g(this.b).addRoundRect(f.b(this.b), f2, f2, Path.Direction.CW);
      f.h(this.b).reset();
      f.b(this.b).offset(0.0F, f3 / 2.0F);
      f.h(this.b).addRoundRect(f.b(this.b), f2, f2, Path.Direction.CW);
      if (j == 0)
      {
        f.i(this.b).setColor(-1);
        paramCanvas.drawPath(f.h(this.b), f.i(this.b));
      }
      f.i(this.b).setColor(-4496384);
      paramCanvas.drawPath(f.g(this.b), f.i(this.b));
      return;
      if (arrayOfInt[i] == 16842919) {
        j = 1;
      }
      i++;
      break;
    }
  }
  
  public int getOpacity()
  {
    return 1;
  }
  
  public boolean isStateful()
  {
    return true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    int i = 0;
    boolean bool = false;
    for (;;)
    {
      if (i >= paramArrayOfInt.length)
      {
        if (this.a == bool) {
          break;
        }
        this.a = bool;
        invalidateSelf();
        return true;
      }
      if (paramArrayOfInt[i] == 16842919) {
        bool = true;
      }
      i++;
    }
    return false;
  }
  
  public void setAlpha(int paramInt)
  {
    f.i(this.b).setAlpha(paramInt);
    f.d(this.b).setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    f.i(this.b).setColorFilter(paramColorFilter);
    f.d(this.b).setColorFilter(paramColorFilter);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.f.1
 * JD-Core Version:    0.7.0.1
 */