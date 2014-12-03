package com.chartboost.sdk.Libraries;

import android.graphics.Bitmap;

public class a$a
{
  private Bitmap a;
  private int b;
  private boolean c;
  
  public a$a(Bitmap paramBitmap, int paramInt)
  {
    a(paramBitmap);
    a(paramInt);
    a(true);
  }
  
  public void a()
  {
    if (this.c) {}
    for (;;)
    {
      return;
      try
      {
        if ((this.a != null) && (!this.a.isRecycled()))
        {
          this.a.recycle();
          return;
        }
      }
      catch (Exception localException) {}
    }
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.a = paramBitmap;
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public Bitmap b()
  {
    return this.a;
  }
  
  public int c()
  {
    return this.a.getWidth() * this.b;
  }
  
  public int d()
  {
    return this.a.getHeight() * this.b;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.a.a
 * JD-Core Version:    0.7.0.1
 */