package com.google.android.gms.common.data;

import com.google.android.gms.internal.cr;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c<T>
  implements Iterator<T>
{
  private final a<T> a;
  private int b;
  
  public c(a<T> parama)
  {
    this.a = ((a)cr.a(parama));
    this.b = -1;
  }
  
  public final boolean hasNext()
  {
    return this.b < -1 + this.a.a();
  }
  
  public final T next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }
    a locala = this.a;
    int i = 1 + this.b;
    this.b = i;
    return locala.a(i);
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.c
 * JD-Core Version:    0.7.0.1
 */