package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.DisplayMetrics;
import android.widget.Button;

public class f
  extends Button
{
  private Path a;
  private Path b;
  private Path c;
  private RectF d;
  private Paint e;
  private Paint f;
  private Shader g;
  private Shader h;
  private int i;
  
  public f(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  private void a()
  {
    int j = getHeight();
    if (j == this.i) {
      return;
    }
    this.i = j;
    int[] arrayOfInt1 = { -81366, -89600, -97280 };
    this.g = new LinearGradient(0.0F, 0.0F, 0.0F, getHeight(), arrayOfInt1, null, Shader.TileMode.CLAMP);
    int[] arrayOfInt2 = { -97280, -89600, -81366 };
    this.h = new LinearGradient(0.0F, 0.0F, 0.0F, getHeight(), arrayOfInt2, null, Shader.TileMode.CLAMP);
  }
  
  private void a(Context paramContext)
  {
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    setTextSize(2, 13.0F);
    setShadowLayer(1.0F * f1, 1.0F * f1, 1.0F * f1, -16757901);
    setTypeface(null, 1);
    setTextColor(-1);
    setClickable(true);
    setGravity(17);
    setPadding(Math.round(12.0F * f1), Math.round(5.0F * f1), Math.round(12.0F * f1), Math.round(f1 * 5.0F));
    this.a = new Path();
    this.b = new Path();
    this.c = new Path();
    this.d = new RectF();
    this.e = new Paint();
    this.e.setStyle(Paint.Style.STROKE);
    this.e.setColor(-4496384);
    this.e.setAntiAlias(true);
    this.i = -1;
    this.f = new Paint();
    this.f.setStyle(Paint.Style.FILL);
    this.f.setAntiAlias(true);
    setBackgroundDrawable(new f.1(this));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.f
 * JD-Core Version:    0.7.0.1
 */