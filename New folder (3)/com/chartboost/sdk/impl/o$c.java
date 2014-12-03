package com.chartboost.sdk.impl;

import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

class o$c
  extends BitmapDrawable
{
  private final WeakReference<o.a> a;
  
  public o$c(o.a parama)
  {
    this.a = new WeakReference(parama);
  }
  
  public o.a a()
  {
    return (o.a)this.a.get();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.o.c
 * JD-Core Version:    0.7.0.1
 */