package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

final class ds
  extends View
{
  Rect a = new Rect();
  Paint b = new Paint();
  
  public ds(AdColonyBrowser paramAdColonyBrowser, Activity paramActivity)
  {
    super(paramActivity);
  }
  
  private static boolean a(ao paramao, int paramInt1, int paramInt2)
  {
    return (paramInt1 < 16 + (paramao.e.left + paramao.f)) && (paramInt1 > -16 + paramao.e.left) && (paramInt2 < 16 + (paramao.e.top + paramao.g)) && (paramInt2 > -16 + paramao.e.top);
  }
  
  public final void a()
  {
    this.c.n = false;
    this.c.o = false;
    this.c.p = false;
    this.c.q = false;
    invalidate();
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    getDrawingRect(this.a);
    int i = (this.c.l.getHeight() - this.c.c.g) / 2;
    if (!AdColonyBrowser.v)
    {
      this.c.c.a(paramCanvas, this.c.c.f, i);
      if (AdColonyBrowser.w) {
        break label886;
      }
      this.c.f.a(paramCanvas, this.c.c.e.left + this.c.l.getWidth() / 10 + this.c.c.f, i);
      label116:
      if (!AdColonyBrowser.x) {
        break label939;
      }
      this.c.d.a(paramCanvas, this.c.f.e.left + this.c.f.f + this.c.l.getWidth() / 10, i);
    }
    for (;;)
    {
      this.c.g.a(paramCanvas, this.c.l.getWidth() - 2 * this.c.g.f, i);
      if (this.c.n)
      {
        this.c.h.b(this.c.c.e.left - this.c.h.f / 2 + this.c.c.f / 2, this.c.c.e.top - this.c.h.g / 2 + this.c.c.g / 2);
        this.c.h.a(paramCanvas);
      }
      if (this.c.o)
      {
        this.c.h.b(this.c.f.e.left - this.c.h.f / 2 + this.c.f.f / 2, this.c.f.e.top - this.c.h.g / 2 + this.c.f.g / 2);
        this.c.h.a(paramCanvas);
      }
      if (this.c.p)
      {
        this.c.h.b(this.c.e.e.left - this.c.h.f / 2 + this.c.e.f / 2, this.c.e.e.top - this.c.h.g / 2 + this.c.e.g / 2);
        this.c.h.a(paramCanvas);
      }
      if (this.c.q)
      {
        this.c.h.b(this.c.g.e.left - this.c.h.f / 2 + this.c.g.f / 2, this.c.g.e.top - this.c.h.g / 2 + this.c.g.g / 2);
        this.c.h.a(paramCanvas);
      }
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(this.c.r.getWidth(), this.c.r.getHeight());
      localLayoutParams.topMargin = ((this.c.l.getHeight() - this.c.d.g) / 2);
      localLayoutParams.leftMargin = (this.c.l.getWidth() / 10 + this.c.d.e.left + this.c.d.f);
      if ((AdColonyBrowser.z) && (this.c.d.e.left != 0))
      {
        this.c.m.removeView(this.c.r);
        this.c.m.addView(this.c.r, localLayoutParams);
        AdColonyBrowser.z = false;
      }
      if (this.c.r.getLayoutParams() != null)
      {
        this.c.r.getLayoutParams().height = this.c.d.g;
        this.c.r.getLayoutParams().width = this.c.d.f;
      }
      return;
      this.c.j.a(paramCanvas, this.c.c.f, i);
      break;
      label886:
      this.c.k.a(paramCanvas, this.c.c.e.left + this.c.l.getWidth() / 10 + this.c.c.f, i);
      break label116;
      label939:
      this.c.e.a(paramCanvas, this.c.f.e.left + this.c.f.f + this.c.l.getWidth() / 10, i);
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if (i == 0)
    {
      if ((a(this.c.c, j, k)) && (AdColonyBrowser.v))
      {
        this.c.n = true;
        invalidate();
        return true;
      }
      if ((a(this.c.f, j, k)) && (AdColonyBrowser.w))
      {
        this.c.o = true;
        invalidate();
        return true;
      }
      if (a(this.c.e, j, k))
      {
        this.c.p = true;
        invalidate();
        return true;
      }
      if (a(this.c.g, j, k))
      {
        this.c.q = true;
        invalidate();
        return true;
      }
    }
    if (i == 1)
    {
      if ((a(this.c.c, j, k)) && (AdColonyBrowser.v))
      {
        this.c.b.goBack();
        a();
        return true;
      }
      if ((a(this.c.f, j, k)) && (AdColonyBrowser.w))
      {
        this.c.b.goForward();
        a();
        return true;
      }
      if ((a(this.c.e, j, k)) && (AdColonyBrowser.x))
      {
        this.c.b.stopLoading();
        a();
        return true;
      }
      if ((a(this.c.e, j, k)) && (!AdColonyBrowser.x))
      {
        this.c.b.reload();
        a();
        return true;
      }
      if (a(this.c.g, j, k))
      {
        AdColonyBrowser.C = true;
        this.c.b.loadData("", "text/html", "utf-8");
        AdColonyBrowser.w = false;
        AdColonyBrowser.v = false;
        AdColonyBrowser.x = false;
        a();
        this.c.finish();
        return true;
      }
      a();
    }
    return false;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ds
 * JD-Core Version:    0.7.0.1
 */