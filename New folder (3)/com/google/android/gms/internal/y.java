package com.google.android.gms.internal;

import android.os.Handler;

final class y
{
  final Runnable a;
  volatile boolean b = false;
  
  public y(w paramw)
  {
    this.a = new z(this, paramw);
  }
  
  public final void a()
  {
    av.a.postDelayed(this.a, 250L);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.y
 * JD-Core Version:    0.7.0.1
 */