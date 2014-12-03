package com.chartboost.sdk.impl;

import java.util.Map;

abstract class bh<K, V>
  extends bc<K, V, Map<K, V>>
{
  protected bh(Map<? extends K, ? extends V> paramMap, bc.h.a parama)
  {
    super(paramMap, parama);
  }
  
  public static <K, V> bh.a<K, V> b()
  {
    return new bh.a();
  }
  
  public static <K, V> bh<K, V> c()
  {
    return b().a();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bh
 * JD-Core Version:    0.7.0.1
 */