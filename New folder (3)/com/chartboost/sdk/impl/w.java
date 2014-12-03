package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;
import java.lang.reflect.Method;

public class w
  extends View
{
  private Handler a;
  private float b;
  private long c;
  private Paint d;
  private Paint e;
  private Path f;
  private Path g;
  private RectF h;
  private RectF i;
  private Bitmap j = null;
  private Canvas k = null;
  private Runnable l = new w.1(this);
  
  public w(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.b = 0.0F;
    this.a = new Handler();
    this.c = ((System.nanoTime() / 1000000.0D));
    this.d = new Paint();
    this.d.setColor(-1);
    this.d.setStyle(Paint.Style.STROKE);
    this.d.setStrokeWidth(f1 * 3.0F);
    this.d.setAntiAlias(true);
    this.e = new Paint();
    this.e.setColor(-1);
    this.e.setStyle(Paint.Style.FILL);
    this.e.setAntiAlias(true);
    this.f = new Path();
    this.g = new Path();
    this.i = new RectF();
    this.h = new RectF();
    try
    {
      Class localClass = getClass();
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = Paint.class;
      Method localMethod = localClass.getMethod("setLayerType", arrayOfClass);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(1);
      localMethod.invoke(this, arrayOfObject);
      return;
    }
    catch (Exception localException) {}
  }
  
  private boolean a(Canvas paramCanvas)
  {
    try
    {
      boolean bool = ((Boolean)Canvas.class.getMethod("isHardwareAccelerated", new Class[0]).invoke(paramCanvas, new Object[0])).booleanValue();
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  protected void onAttachedToWindow()
  {
    this.a.removeCallbacks(this.l);
    this.a.post(this.l);
  }
  
  protected void onDetachedFromWindow()
  {
    this.a.removeCallbacks(this.l);
    if ((this.j != null) && (!this.j.isRecycled())) {
      this.j.recycle();
    }
    this.j = null;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    float f1 = getContext().getResources().getDisplayMetrics().density;
    boolean bool = a(paramCanvas);
    if (bool) {
      if ((this.j == null) || (this.j.getWidth() != paramCanvas.getWidth()) || (this.j.getHeight() != paramCanvas.getHeight())) {
        if ((this.j != null) && (!this.j.isRecycled())) {
          this.j.recycle();
        }
      }
    }
    for (;;)
    {
      try
      {
        this.j = Bitmap.createBitmap(paramCanvas.getWidth(), paramCanvas.getHeight(), Bitmap.Config.ARGB_8888);
        this.k = new Canvas(this.j);
        this.j.eraseColor(0);
        Canvas localCanvas = this.k;
        CBOrientation.Difference localDifference = Chartboost.sharedChartboost().getForcedOrientationDifference();
        localCanvas.save();
        if (localDifference.isReverse()) {
          localCanvas.rotate(180.0F, getWidth() / 2.0F, getHeight() / 2.0F);
        }
        this.h.set(0.0F, 0.0F, getWidth(), getHeight());
        this.h.inset(1.5F * f1, 1.5F * f1);
        int m;
        float f3;
        float f5;
        int n;
        if (localDifference.isOdd())
        {
          m = getWidth();
          float f2 = m / 2.0F;
          localCanvas.drawRoundRect(this.h, f2, f2, this.d);
          this.i.set(this.h);
          this.i.inset(3.0F * f1, f1 * 3.0F);
          if (!localDifference.isOdd()) {
            continue;
          }
          f3 = this.i.width();
          float f4 = f3 / 2.0F;
          this.f.reset();
          this.f.addRoundRect(this.i, f4, f4, Path.Direction.CW);
          if (!localDifference.isOdd()) {
            continue;
          }
          f5 = this.i.width();
          this.g.reset();
          if (!localDifference.isOdd()) {
            continue;
          }
          this.g.moveTo(f5, 0.0F);
          this.g.lineTo(f5, f5);
          this.g.lineTo(0.0F, f5 * 2.0F);
          this.g.lineTo(0.0F, f5);
          this.g.close();
          localCanvas.save();
          n = 1;
        }
        try
        {
          localCanvas.clipPath(this.f);
          if (n != 0)
          {
            f6 = -f5 + this.b;
            if (!localDifference.isOdd()) {
              continue;
            }
            f7 = this.i.height();
            if (f6 < f7 + f5) {}
          }
          else
          {
            localCanvas.restore();
            localCanvas.restore();
            if ((bool) && (paramCanvas != null)) {
              paramCanvas.drawBitmap(this.j, 0.0F, 0.0F, null);
            }
            long l1 = Math.max(0L, 16L - ((System.nanoTime() / 1000000.0D) - this.c));
            this.a.removeCallbacks(this.l);
            this.a.postDelayed(this.l, l1);
            return;
            m = getHeight();
            continue;
            f3 = this.i.height();
            continue;
            f5 = this.i.height();
            continue;
            this.g.moveTo(0.0F, f5);
            this.g.lineTo(f5, f5);
            this.g.lineTo(f5 * 2.0F, 0.0F);
            this.g.lineTo(f5, 0.0F);
          }
        }
        catch (UnsupportedOperationException localUnsupportedOperationException)
        {
          float f6;
          n = 0;
          continue;
          float f8;
          float f9;
          if (localDifference.isOdd())
          {
            f8 = this.i.top;
            f9 = f8 + f6;
            localCanvas.save();
            if (localDifference.isOdd())
            {
              localCanvas.translate(this.i.left, f9);
              localCanvas.drawPath(this.g, this.e);
              localCanvas.restore();
              f6 += 2.0F * f5;
            }
          }
          else
          {
            f8 = this.i.left;
            continue;
          }
          localCanvas.translate(f9, this.i.top);
          continue;
          float f7 = this.i.width();
          continue;
        }
        localCanvas = paramCanvas;
      }
      catch (Throwable localThrowable)
      {
        return;
      }
      paramCanvas = null;
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.a.removeCallbacks(this.l);
    if (paramInt == 0) {
      this.a.post(this.l);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.w
 * JD-Core Version:    0.7.0.1
 */