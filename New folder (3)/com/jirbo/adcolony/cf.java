package com.jirbo.adcolony;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;

final class cf
  extends ai
{
  static boolean y;
  static cf z;
  boolean A;
  boolean B;
  ADCVideo C;
  
  public cf(ADCVideo paramADCVideo, dx paramdx)
  {
    this.C = paramADCVideo;
    this.x = paramdx;
    paramADCVideo.z.pause();
    z = this;
    a();
  }
  
  final void b()
  {
    int i = this.C.r;
    int j = this.C.s;
    this.p = ((i - this.a.f) / 2);
    this.q = ((j - this.a.g) / 2);
    this.r = (this.p + this.a.f / 2);
    this.s = (this.q + this.a.g / 2);
    this.v = (this.q + (int)(this.a.g - (this.c.g + 16.0D * i)));
    this.t = (this.p + (int)(16.0D * i));
    this.u = (this.p + (int)(this.a.f - (this.c.f + 16.0D * i)));
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    int i = 128;
    if (this.C.z == null) {
      return;
    }
    y = true;
    b();
    int j = 255 * (int)(System.currentTimeMillis() - this.o) / 1000;
    if (j > i) {}
    for (;;)
    {
      paramCanvas.drawARGB(i, 0, 0, 0);
      this.a.a(paramCanvas, this.p, this.q);
      int k = 3 * (int)ai.m.getTextSize() / 2;
      a("Completion is required to receive", this.r, (int)(this.s - 2.75D * k), paramCanvas);
      a("your reward.", this.r, this.s - k * 2, paramCanvas);
      a("Are you sure you want to skip?", this.r, (int)(this.s - 1.25D * k), paramCanvas);
      this.b.a(paramCanvas, this.r - this.b.f / 2, this.s - this.b.g / 2);
      if (!this.A)
      {
        this.c.a(paramCanvas, this.t, this.v);
        if (this.B) {
          break label282;
        }
        this.e.a(paramCanvas, this.u, this.v);
      }
      for (;;)
      {
        b("Yes", this.t, this.v, paramCanvas);
        b("No", this.u, this.v, paramCanvas);
        return;
        this.d.a(paramCanvas, this.t, this.v);
        break;
        label282:
        this.f.a(paramCanvas, this.u, this.v);
      }
      i = j;
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.C.z == null) {}
    while (paramInt != 4) {
      return false;
    }
    return true;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    if (ADCVideo.c)
    {
      z = null;
      i = this.C.A.onTouchEvent(paramMotionEvent);
    }
    int j;
    int k;
    label155:
    label202:
    do
    {
      return i;
      j = (int)paramMotionEvent.getX();
      k = (int)paramMotionEvent.getY();
      if (paramMotionEvent.getAction() == i)
      {
        if ((!a(j, k, this.t, this.v)) || (!this.A)) {
          break label155;
        }
        z = null;
        y = false;
        a.j = false;
        a.x.b();
        this.C.finish();
      }
      for (;;)
      {
        this.A = false;
        this.B = false;
        invalidate();
        if (paramMotionEvent.getAction() != 0) {
          break;
        }
        if (!a(j, k, this.t, this.v)) {
          break label202;
        }
        this.A = i;
        invalidate();
        return i;
        if ((a(j, k, this.u, this.v)) && (this.B))
        {
          z = null;
          y = false;
          this.C.z.start();
        }
      }
    } while (!a(j, k, this.u, this.v));
    this.B = i;
    invalidate();
    return i;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.cf
 * JD-Core Version:    0.7.0.1
 */