package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class bq
  extends Drawable.ConstantState
{
  int a;
  int b;
  
  bq(bq parambq)
  {
    if (parambq != null)
    {
      this.a = parambq.a;
      this.b = parambq.b;
    }
  }
  
  public final int getChangingConfigurations()
  {
    return this.a;
  }
  
  public final Drawable newDrawable()
  {
    return new bn(this);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bq
 * JD-Core Version:    0.7.0.1
 */