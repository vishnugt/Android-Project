package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

final class z
  implements Runnable
{
  private final WeakReference<w> c = new WeakReference(this.a);
  
  z(y paramy, w paramw) {}
  
  public final void run()
  {
    w localw = (w)this.c.get();
    if ((!this.b.b) && (localw != null))
    {
      localw.e();
      this.b.a();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.z
 * JD-Core Version:    0.7.0.1
 */