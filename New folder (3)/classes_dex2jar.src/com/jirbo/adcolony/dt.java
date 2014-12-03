package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

final class dt
  extends View
{
  Rect a = new Rect();
  
  public dt(AdColonyBrowser paramAdColonyBrowser, Activity paramActivity)
  {
    super(paramActivity);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    if (!AdColonyBrowser.y)
    {
      paramCanvas.drawARGB(255, 0, 0, 0);
      getDrawingRect(this.a);
      this.b.i.a(paramCanvas, (this.a.width() - this.b.i.f) / 2, (this.a.height() - this.b.i.g) / 2);
      invalidate();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dt
 * JD-Core Version:    0.7.0.1
 */