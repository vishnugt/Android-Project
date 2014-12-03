package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

final class bg<K, V>
  implements bi<K, V>, Map<K, V>
{
  private final ConcurrentMap<K, V> a;
  private final bi<K, V> b;
  
  bg(ConcurrentMap<K, V> paramConcurrentMap, bi<K, V> parambi)
  {
    this.a = ((ConcurrentMap)bd.a("map", paramConcurrentMap));
    this.b = ((bi)bd.a("function", parambi));
  }
  
  public static <K, V> Map<K, V> a(bi<K, V> parambi)
  {
    return new bg(bh.c(), parambi);
  }
  
  public final V a(K paramK)
  {
    return get(paramK);
  }
  
  public final void clear()
  {
    this.a.clear();
  }
  
  public final boolean containsKey(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }
  
  public final boolean containsValue(Object paramObject)
  {
    return this.a.containsValue(paramObject);
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    return this.a.entrySet();
  }
  
  public final boolean equals(Object paramObject)
  {
    return this.a.equals(paramObject);
  }
  
  public final V get(Object paramObject)
  {
    for (;;)
    {
      Object localObject1 = this.a.get(paramObject);
      if (localObject1 != null) {
        return localObject1;
      }
      Object localObject2 = this.b.a(paramObject);
      if (localObject2 == null) {
        return null;
      }
      this.a.putIfAbsent(paramObject, localObject2);
    }
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final boolean isEmpty()
  {
    return this.a.isEmpty();
  }
  
  public final Set<K> keySet()
  {
    return this.a.keySet();
  }
  
  public final V put(K paramK, V paramV)
  {
    return this.a.put(paramK, paramV);
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    this.a.putAll(paramMap);
  }
  
  public final V remove(Object paramObject)
  {
    return this.a.remove(paramObject);
  }
  
  public final int size()
  {
    return this.a.size();
  }
  
  public final Collection<V> values()
  {
    return this.a.values();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bg
 * JD-Core Version:    0.7.0.1
 */