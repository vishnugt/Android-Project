package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

final class dg
  extends View
{
  Rect a = new Rect();
  
  public dg(cv paramcv, Activity paramActivity)
  {
    super(paramActivity);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawARGB(255, 0, 0, 0);
    getDrawingRect(this.a);
    this.b.ah.a(paramCanvas, (this.a.width() - this.b.ah.f) / 2, (this.a.height() - this.b.ah.g) / 2);
    invalidate();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dg
 * JD-Core Version:    0.7.0.1
 */