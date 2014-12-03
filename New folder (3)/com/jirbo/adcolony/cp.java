package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import java.util.ArrayList;

final class cp
  extends ai
{
  boolean y;
  boolean z;
  
  public cp(String paramString, dx paramdx)
  {
    this.w = paramString;
    this.x = paramdx;
    a();
    a.a().addContentView(this, new FrameLayout.LayoutParams(-1, -1, 17));
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    b();
    int i = 255 * (int)(System.currentTimeMillis() - this.o) / 1000;
    if (i > 128) {
      i = 128;
    }
    paramCanvas.drawARGB(i, 0, 0, 0);
    this.a.a(paramCanvas, this.p, this.q);
    int j = 3 * (int)ai.m.getTextSize() / 2;
    int k = this.x.h();
    if (this.x.g() == 1)
    {
      a(this.w, "");
      if (!l)
      {
        a("Watch a video to earn", this.r, (int)(this.s - 2.8D * j), paramCanvas);
        a(j, this.r, (int)(this.s - 2.05D * j), paramCanvas);
        a(k + ".", this.r, (int)(this.s - 1.3D * j), paramCanvas);
        this.b.a(paramCanvas, this.r - this.b.f / 2, this.s - this.b.g / 2);
        if (this.z) {
          break label660;
        }
        this.c.a(paramCanvas, this.t, this.v);
        label253:
        if (this.y) {
          break label679;
        }
        this.e.a(paramCanvas, this.u, this.v);
      }
    }
    for (;;)
    {
      b("Yes", this.t, this.v, paramCanvas);
      b("No", this.u, this.v, paramCanvas);
      if (i != 128) {
        invalidate();
      }
      return;
      a("Watch a video to earn", this.r, (int)(this.s - 2.5D * j), paramCanvas);
      a(j + ".", this.r, (int)(this.s - 1.5D * j), paramCanvas);
      break;
      if (k == 1) {}
      for (String str = "video";; str = "videos")
      {
        a(this.w, k + " more " + str + " to earn )?");
        if (l) {
          break label572;
        }
        a("Watch a sponsored video now (Only", this.r, (int)(this.s - 2.8D * j), paramCanvas);
        a(k + " more " + str + " to earn " + j, this.r, (int)(this.s - 2.05D * j), paramCanvas);
        a(k + ")?", this.r, (int)(this.s - 1.3D * j), paramCanvas);
        break;
      }
      label572:
      a("Watch a sponsored video now (Only", this.r, (int)(this.s - 2.5D * j), paramCanvas);
      a(k + " more " + str + " to earn " + j + ")?", this.r, (int)(this.s - 1.5D * j), paramCanvas);
      break;
      label660:
      this.d.a(paramCanvas, this.t, this.v);
      break label253;
      label679:
      this.f.a(paramCanvas, this.u, this.v);
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    if (paramMotionEvent.getAction() == 1)
    {
      if ((a(i, j, this.t, this.v)) && (this.z))
      {
        a.t = null;
        ((ViewGroup)getParent()).removeView(this);
        this.x.a(true);
        this.y = false;
        this.z = false;
        invalidate();
      }
    }
    else if (paramMotionEvent.getAction() == 0)
    {
      if (!a(i, j, this.t, this.v)) {
        break label210;
      }
      this.z = true;
      invalidate();
    }
    label210:
    while (!a(i, j, this.u, this.v))
    {
      return true;
      if ((!a(i, j, this.u, this.v)) || (!this.y)) {
        break;
      }
      a.t = null;
      ((ViewGroup)getParent()).removeView(this);
      this.x.a(false);
      a.k = true;
      for (int k = 0; k < a.J.size(); k++) {
        ((Bitmap)a.J.get(k)).recycle();
      }
      a.J.clear();
      break;
    }
    this.y = true;
    invalidate();
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.cp
 * JD-Core Version:    0.7.0.1
 */