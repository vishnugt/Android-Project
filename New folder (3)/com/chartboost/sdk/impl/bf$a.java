package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class bf$a
  implements bi<Class<?>, T>
{
  private bf$a(bf parambf) {}
  
  public final T a(Class<?> paramClass)
  {
    Iterator localIterator = bf.a(paramClass).iterator();
    Object localObject;
    do
    {
      if (!localIterator.hasNext()) {
        return null;
      }
      Class localClass = (Class)localIterator.next();
      localObject = bf.a(this.a).get(localClass);
    } while (localObject == null);
    return localObject;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bf.a
 * JD-Core Version:    0.7.0.1
 */