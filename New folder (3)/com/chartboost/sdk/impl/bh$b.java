package com.chartboost.sdk.impl;

import java.util.HashMap;
import java.util.Map;

class bh$b<K, V>
  extends bh<K, V>
{
  bh$b(Map<? extends K, ? extends V> paramMap, bc.h.a parama)
  {
    super(paramMap, parama);
  }
  
  public <N extends Map<? extends K, ? extends V>> Map<K, V> a(N paramN)
  {
    return new HashMap(paramN);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bh.b
 * JD-Core Version:    0.7.0.1
 */