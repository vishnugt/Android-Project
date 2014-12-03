package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

class be
{
  private static final ConcurrentMap<Class<?>, List<Class<?>>> a = ;
  
  public static <T> List<Class<?>> a(Class<T> paramClass)
  {
    ConcurrentMap localConcurrentMap = a();
    for (;;)
    {
      List localList = (List)localConcurrentMap.get(paramClass);
      if (localList != null) {
        return localList;
      }
      localConcurrentMap.putIfAbsent(paramClass, b(paramClass));
    }
  }
  
  private static ConcurrentMap<Class<?>, List<Class<?>>> a()
  {
    return a;
  }
  
  private static <T> void a(Class<T> paramClass, List<Class<?>> paramList)
  {
    if ((paramClass == null) || (paramClass == Object.class)) {
      return;
    }
    Class[] arrayOfClass = paramClass.getInterfaces();
    for (int i = -1 + arrayOfClass.length;; i--)
    {
      if (i < 0)
      {
        a(paramClass.getSuperclass(), paramList);
        if (paramList.contains(paramClass)) {
          break;
        }
        paramList.add(paramClass);
        return;
      }
      a(arrayOfClass[i], paramList);
    }
  }
  
  private static List<Class<?>> b(Class<?> paramClass)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Object.class);
    a(paramClass, localArrayList);
    Collections.reverse(localArrayList);
    return Collections.unmodifiableList(new ArrayList(localArrayList));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.be
 * JD-Core Version:    0.7.0.1
 */