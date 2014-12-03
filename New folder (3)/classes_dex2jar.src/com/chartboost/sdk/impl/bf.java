package com.chartboost.sdk.impl;

import java.util.List;
import java.util.Map;

public class bf<T>
{
  private final Map<Class<?>, T> a = bh.c();
  private final Map<Class<?>, T> b = bg.a(new bf.a(this, null));
  
  public static <T> List<Class<?>> a(Class<T> paramClass)
  {
    return be.a(paramClass);
  }
  
  public int a()
  {
    return this.a.size();
  }
  
  public T a(Class<?> paramClass, T paramT)
  {
    try
    {
      Object localObject2 = this.a.put(paramClass, paramT);
      return localObject2;
    }
    finally
    {
      this.b.clear();
    }
  }
  
  public T a(Object paramObject)
  {
    return this.b.get(paramObject);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bf
 * JD-Core Version:    0.7.0.1
 */