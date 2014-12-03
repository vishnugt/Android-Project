package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.View;
import android.widget.RelativeLayout;
import java.lang.reflect.Method;

final class du
  extends View
{
  Paint a = new Paint();
  ao b = new ao(a.c("close_image_normal"));
  ao c = new ao(a.c("close_image_down"));
  
  public du(AdColonyBrowser paramAdColonyBrowser, Activity paramActivity)
  {
    super(paramActivity);
    try
    {
      Class localClass = getClass();
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = Paint.class;
      Method localMethod = localClass.getMethod("setLayerType", arrayOfClass);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(1);
      arrayOfObject[1] = null;
      localMethod.invoke(this, arrayOfObject);
      label117:
      this.a.setColor(-3355444);
      this.a.setStrokeWidth(10.0F);
      this.a.setStyle(Paint.Style.STROKE);
      this.a.setShadowLayer(3.0F, 0.0F, 1.0F, -16777216);
      return;
    }
    catch (Exception localException)
    {
      break label117;
    }
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawRect(0.0F, 0.0F, this.d.l.getWidth(), 10.0F, this.a);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.du
 * JD-Core Version:    0.7.0.1
 */