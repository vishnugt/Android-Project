package com.chartboost.sdk.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class bc$c
  extends bc.h<K, V>
  implements Serializable
{
  bc$c(bc parambc) {}
  
  public final Set<K> a()
  {
    return Collections.unmodifiableSet(bc.a(this.a).keySet());
  }
  
  public final Set<Map.Entry<K, V>> b()
  {
    return Collections.unmodifiableSet(bc.a(this.a).entrySet());
  }
  
  public final Collection<V> c()
  {
    return Collections.unmodifiableCollection(bc.a(this.a).values());
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bc.c
 * JD-Core Version:    0.7.0.1
 */