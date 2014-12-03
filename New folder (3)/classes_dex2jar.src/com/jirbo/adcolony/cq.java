package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import java.util.ArrayList;

final class cq
  extends ai
{
  boolean y;
  
  public cq(String paramString, dx paramdx)
  {
    this.w = paramString;
    this.x = paramdx;
    a();
    a.a().addContentView(this, new FrameLayout.LayoutParams(-1, -1, 17));
  }
  
  final void b()
  {
    Display localDisplay = a.a().getWindowManager().getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    this.p = ((i - this.a.f) / 2);
    this.q = (-80 + (j - this.a.g) / 2);
    this.r = (this.p + this.a.f / 2);
    this.s = (this.q + this.a.g / 2);
    this.v = (this.q + (int)(this.a.g - (this.h.g + 16.0D * i)));
    this.t = (this.r - this.h.f / 2);
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
    if ((k == this.x.g()) || (k == 0))
    {
      a(this.w, "video. You earned");
      if (l)
      {
        a("Thanks for watching the sponsored", this.r, (int)(this.s - 2.5D * j), paramCanvas);
        a("video. You earned " + j + ".", this.r, (int)(this.s - 1.5D * j), paramCanvas);
        this.b.a(paramCanvas, this.r - this.b.f / 2, this.s - this.b.g / 2);
        if (this.y) {
          break label631;
        }
        this.h.a(paramCanvas, this.t, this.v);
      }
    }
    for (;;)
    {
      b("Ok", this.t, this.v, paramCanvas);
      if (i != 128) {
        invalidate();
      }
      return;
      a("Thanks for watching the sponsored", this.r, (int)(this.s - 2.8D * j), paramCanvas);
      a("video. You earned " + j, this.r, (int)(this.s - 2.05D * j), paramCanvas);
      a(k + ".", this.r, (int)(this.s - 1.3D * j), paramCanvas);
      break;
      a(this.w, "to earn ");
      if (k == 1) {}
      for (String str = "video";; str = "videos")
      {
        if (!l) {
          break label499;
        }
        a("Thank you. Watch " + k + " more " + str, this.r, (int)(this.s - 2.5D * j), paramCanvas);
        a("to earn " + j + ".", this.r, (int)(this.s - 1.5D * j), paramCanvas);
        break;
      }
      label499:
      a("Thank you. Watch " + k + " more " + str, this.r, (int)(this.s - 2.8D * j), paramCanvas);
      a("to earn " + j, this.r, (int)(this.s - 2.05D * j), paramCanvas);
      a(k + ".", this.r, (int)(this.s - 1.3D * j), paramCanvas);
      break;
      label631:
      this.g.a(paramCanvas, this.t, this.v);
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    if (paramMotionEvent.getAction() == 1)
    {
      if ((a(i, j, this.t, this.v)) && (this.y))
      {
        a.t = null;
        ((ViewGroup)getParent()).removeView(this);
        for (int k = 0; k < a.J.size(); k++) {
          ((Bitmap)a.J.get(k)).recycle();
        }
        a.J.clear();
        a.k = true;
      }
      this.y = false;
      invalidate();
    }
    if ((paramMotionEvent.getAction() == 0) && (a(i, j, this.t, this.v)))
    {
      this.y = true;
      invalidate();
    }
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.cq
 * JD-Core Version:    0.7.0.1
 */