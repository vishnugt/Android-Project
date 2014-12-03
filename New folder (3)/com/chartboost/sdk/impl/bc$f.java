package com.chartboost.sdk.impl;

import java.util.Iterator;

class bc$f<T>
  implements Iterator<T>
{
  private final Iterator<T> a;
  
  public bc$f(Iterator<T> paramIterator)
  {
    this.a = paramIterator;
  }
  
  public boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public T next()
  {
    return this.a.next();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bc.f
 * JD-Core Version:    0.7.0.1
 */