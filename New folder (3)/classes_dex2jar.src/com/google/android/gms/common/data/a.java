package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class a<T>
  implements Iterable<T>
{
  protected final d a;
  
  public a(d paramd)
  {
    this.a = paramd;
    if (this.a != null) {
      this.a.a(this);
    }
  }
  
  public final int a()
  {
    return this.a.g();
  }
  
  public abstract T a(int paramInt);
  
  public final void b()
  {
    this.a.h();
  }
  
  public Iterator<T> iterator()
  {
    return new c(this);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.a
 * JD-Core Version:    0.7.0.1
 */