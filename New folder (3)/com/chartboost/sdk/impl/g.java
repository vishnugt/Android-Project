package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public class g
  extends ImageView
{
  private RectF a;
  private Paint b;
  private Xfermode c;
  
  public g(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    float f = getContext().getResources().getDisplayMetrics().density;
    this.c = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    this.a = new RectF();
    this.b = new Paint();
    this.b.setStyle(Paint.Style.STROKE);
    this.b.setColor(-1509949440);
    this.b.setStrokeWidth(Math.max(1.0F, f * 1.0F));
    this.b.setAntiAlias(true);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    float f1 = getContext().getResources().getDisplayMetrics().density;
    float f2 = 10.0F * f1;
    float f3 = 1.0F * f1;
    Drawable localDrawable = getDrawable();
    if ((localDrawable instanceof BitmapDrawable))
    {
      Paint localPaint = ((BitmapDrawable)localDrawable).getPaint();
      Rect localRect = localDrawable.getBounds();
      this.a.set(localRect);
      if (getImageMatrix() != null) {
        getImageMatrix().mapRect(this.a);
      }
      int i = paramCanvas.saveLayer(this.a, null, 31);
      localPaint.setAntiAlias(true);
      paramCanvas.drawARGB(0, 0, 0, 0);
      localPaint.setColor(-16777216);
      paramCanvas.drawRoundRect(this.a, f2, f2, localPaint);
      Xfermode localXfermode = localPaint.getXfermode();
      localPaint.setXfermode(this.c);
      super.onDraw(paramCanvas);
      localPaint.setXfermode(localXfermode);
      paramCanvas.restoreToCount(i);
    }
    for (;;)
    {
      this.a.set(0.0F, 0.0F, getWidth(), getHeight());
      this.a.inset(f3 / 2.0F, f3 / 2.0F);
      paramCanvas.drawRoundRect(this.a, f2, f2, this.b);
      return;
      super.onDraw(paramCanvas);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.g
 * JD-Core Version:    0.7.0.1
 */