package com.chartboost.sdk.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

abstract class bc<K, V, M extends Map<K, V>>
  implements Serializable, ConcurrentMap<K, V>
{
  private volatile M a = (Map)bd.a("delegate", a((Map)bd.a("map", paramN)));
  private final transient Lock b = new ReentrantLock();
  private final bc.h<K, V> c;
  
  protected <N extends Map<? extends K, ? extends V>> bc(N paramN, bc.h.a parama)
  {
    this.c = ((bc.h.a)bd.a("viewType", parama)).a(this);
  }
  
  private boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  protected M a()
  {
    this.b.lock();
    try
    {
      Map localMap = a(this.a);
      return localMap;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  abstract <N extends Map<? extends K, ? extends V>> M a(N paramN);
  
  protected void b(M paramM)
  {
    this.a = paramM;
  }
  
  public final void clear()
  {
    this.b.lock();
    try
    {
      b(a(Collections.emptyMap()));
      return;
    }
    finally
    {
      this.b.unlock();
    }
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
    return this.c.b();
  }
  
  public final boolean equals(Object paramObject)
  {
    return this.a.equals(paramObject);
  }
  
  public final V get(Object paramObject)
  {
    return this.a.get(paramObject);
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
    return this.c.a();
  }
  
  /* Error */
  public final V put(K paramK, V paramV)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 65 1 0
    //   9: aload_0
    //   10: invokevirtual 108	com/chartboost/sdk/impl/bc:a	()Ljava/util/Map;
    //   13: astore 4
    //   15: aload 4
    //   17: aload_1
    //   18: aload_2
    //   19: invokeinterface 110 3 0
    //   24: astore 6
    //   26: aload_0
    //   27: aload 4
    //   29: invokevirtual 77	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   32: aload_0
    //   33: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   36: invokeinterface 68 1 0
    //   41: aload 6
    //   43: areturn
    //   44: astore 5
    //   46: aload_0
    //   47: aload 4
    //   49: invokevirtual 77	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   52: aload 5
    //   54: athrow
    //   55: astore_3
    //   56: aload_0
    //   57: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   60: invokeinterface 68 1 0
    //   65: aload_3
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	bc
    //   0	67	1	paramK	K
    //   0	67	2	paramV	V
    //   55	11	3	localObject1	Object
    //   13	35	4	localMap	Map
    //   44	9	5	localObject2	Object
    //   24	18	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   15	26	44	finally
    //   9	15	55	finally
    //   26	32	55	finally
    //   46	55	55	finally
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    this.b.lock();
    try
    {
      Map localMap = a();
      localMap.putAll(paramMap);
      b(localMap);
      return;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public V putIfAbsent(K paramK, V paramV)
  {
    this.b.lock();
    try
    {
      if (!this.a.containsKey(paramK))
      {
        Map localMap = a();
        try
        {
          Object localObject4 = localMap.put(paramK, paramV);
          b(localMap);
          return localObject4;
        }
        finally
        {
          b(localMap);
        }
      }
      localObject2 = this.a.get(paramK);
    }
    finally
    {
      this.b.unlock();
    }
    Object localObject2;
    this.b.unlock();
    return localObject2;
  }
  
  /* Error */
  public final V remove(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 65 1 0
    //   9: aload_0
    //   10: getfield 43	com/chartboost/sdk/impl/bc:a	Ljava/util/Map;
    //   13: aload_1
    //   14: invokeinterface 80 2 0
    //   19: istore_3
    //   20: iload_3
    //   21: ifne +14 -> 35
    //   24: aload_0
    //   25: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   28: invokeinterface 68 1 0
    //   33: aconst_null
    //   34: areturn
    //   35: aload_0
    //   36: invokevirtual 108	com/chartboost/sdk/impl/bc:a	()Ljava/util/Map;
    //   39: astore 4
    //   41: aload 4
    //   43: aload_1
    //   44: invokeinterface 117 2 0
    //   49: astore 6
    //   51: aload_0
    //   52: aload 4
    //   54: invokevirtual 77	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   57: aload_0
    //   58: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   61: invokeinterface 68 1 0
    //   66: aload 6
    //   68: areturn
    //   69: astore 5
    //   71: aload_0
    //   72: aload 4
    //   74: invokevirtual 77	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   77: aload 5
    //   79: athrow
    //   80: astore_2
    //   81: aload_0
    //   82: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   85: invokeinterface 68 1 0
    //   90: aload_2
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	bc
    //   0	92	1	paramObject	Object
    //   80	11	2	localObject1	Object
    //   19	2	3	bool	boolean
    //   39	34	4	localMap	Map
    //   69	9	5	localObject2	Object
    //   49	18	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   41	51	69	finally
    //   9	20	80	finally
    //   35	41	80	finally
    //   51	57	80	finally
    //   71	80	80	finally
  }
  
  public boolean remove(Object paramObject1, Object paramObject2)
  {
    this.b.lock();
    try
    {
      if ((this.a.containsKey(paramObject1)) && (a(paramObject2, this.a.get(paramObject1))))
      {
        Map localMap = a();
        localMap.remove(paramObject1);
        b(localMap);
        return true;
      }
      return false;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  /* Error */
  public V replace(K paramK, V paramV)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 65 1 0
    //   9: aload_0
    //   10: getfield 43	com/chartboost/sdk/impl/bc:a	Ljava/util/Map;
    //   13: aload_1
    //   14: invokeinterface 80 2 0
    //   19: istore 4
    //   21: iload 4
    //   23: ifne +14 -> 37
    //   26: aload_0
    //   27: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   30: invokeinterface 68 1 0
    //   35: aconst_null
    //   36: areturn
    //   37: aload_0
    //   38: invokevirtual 108	com/chartboost/sdk/impl/bc:a	()Ljava/util/Map;
    //   41: astore 5
    //   43: aload 5
    //   45: aload_1
    //   46: aload_2
    //   47: invokeinterface 110 3 0
    //   52: astore 7
    //   54: aload_0
    //   55: aload 5
    //   57: invokevirtual 77	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   60: aload_0
    //   61: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   64: invokeinterface 68 1 0
    //   69: aload 7
    //   71: areturn
    //   72: astore 6
    //   74: aload_0
    //   75: aload 5
    //   77: invokevirtual 77	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   80: aload 6
    //   82: athrow
    //   83: astore_3
    //   84: aload_0
    //   85: getfield 27	com/chartboost/sdk/impl/bc:b	Ljava/util/concurrent/locks/Lock;
    //   88: invokeinterface 68 1 0
    //   93: aload_3
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	bc
    //   0	95	1	paramK	K
    //   0	95	2	paramV	V
    //   83	11	3	localObject1	Object
    //   19	3	4	bool	boolean
    //   41	35	5	localMap	Map
    //   72	9	6	localObject2	Object
    //   52	18	7	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   43	54	72	finally
    //   9	21	83	finally
    //   37	43	83	finally
    //   54	60	83	finally
    //   74	83	83	finally
  }
  
  public boolean replace(K paramK, V paramV1, V paramV2)
  {
    this.b.lock();
    try
    {
      if (this.a.containsKey(paramK))
      {
        boolean bool = a(paramV1, this.a.get(paramK));
        if (bool) {}
      }
      else
      {
        return false;
      }
      Map localMap = a();
      localMap.put(paramK, paramV2);
      b(localMap);
      return true;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public final int size()
  {
    return this.a.size();
  }
  
  public String toString()
  {
    return this.a.toString();
  }
  
  public final Collection<V> values()
  {
    return this.c.c();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bc
 * JD-Core Version:    0.7.0.1
 */