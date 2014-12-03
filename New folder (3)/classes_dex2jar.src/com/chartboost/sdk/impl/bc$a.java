package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.Iterator;

public abstract class bc$a<E>
  implements Collection<E>
{
  abstract Collection<E> a();
  
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean contains(Object paramObject)
  {
    return a().contains(paramObject);
  }
  
  public final boolean containsAll(Collection<?> paramCollection)
  {
    return a().containsAll(paramCollection);
  }
  
  public boolean equals(Object paramObject)
  {
    return a().equals(paramObject);
  }
  
  public int hashCode()
  {
    return a().hashCode();
  }
  
  public final boolean isEmpty()
  {
    return a().isEmpty();
  }
  
  public final Iterator<E> iterator()
  {
    return new bc.f(a().iterator());
  }
  
  public final int size()
  {
    return a().size();
  }
  
  public final Object[] toArray()
  {
    return a().toArray();
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    return a().toArray(paramArrayOfT);
  }
  
  public String toString()
  {
    return a().toString();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bc.a
 * JD-Core Version:    0.7.0.1
 */