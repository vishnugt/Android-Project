package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.locks.Lock;

class bc$b
  extends bc.a<Map.Entry<K, V>>
  implements Set<Map.Entry<K, V>>
{
  private bc$b(bc parambc) {}
  
  Collection<Map.Entry<K, V>> a()
  {
    return bc.a(this.a).entrySet();
  }
  
  public void clear()
  {
    bc.b(this.a).lock();
    try
    {
      Map localMap = this.a.a();
      localMap.entrySet().clear();
      this.a.b(localMap);
      return;
    }
    finally
    {
      bc.b(this.a).unlock();
    }
  }
  
  /* Error */
  public boolean remove(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   4: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 41 1 0
    //   12: aload_0
    //   13: aload_1
    //   14: invokevirtual 57	com/chartboost/sdk/impl/bc$b:contains	(Ljava/lang/Object;)Z
    //   17: istore_3
    //   18: iload_3
    //   19: ifne +17 -> 36
    //   22: aload_0
    //   23: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   26: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   29: invokeinterface 52 1 0
    //   34: iconst_0
    //   35: ireturn
    //   36: aload_0
    //   37: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   40: invokevirtual 44	com/chartboost/sdk/impl/bc:a	()Ljava/util/Map;
    //   43: astore 4
    //   45: aload 4
    //   47: invokeinterface 31 1 0
    //   52: aload_1
    //   53: invokeinterface 59 2 0
    //   58: istore 6
    //   60: aload_0
    //   61: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   64: aload 4
    //   66: invokevirtual 49	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   69: aload_0
    //   70: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   73: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   76: invokeinterface 52 1 0
    //   81: iload 6
    //   83: ireturn
    //   84: astore 5
    //   86: aload_0
    //   87: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   90: aload 4
    //   92: invokevirtual 49	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   95: aload 5
    //   97: athrow
    //   98: astore_2
    //   99: aload_0
    //   100: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   103: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   106: invokeinterface 52 1 0
    //   111: aload_2
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	b
    //   0	113	1	paramObject	Object
    //   98	14	2	localObject1	Object
    //   17	2	3	bool1	boolean
    //   43	48	4	localMap	Map
    //   84	12	5	localObject2	Object
    //   58	24	6	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   45	60	84	finally
    //   12	18	98	finally
    //   36	45	98	finally
    //   60	69	98	finally
    //   86	98	98	finally
  }
  
  /* Error */
  public boolean removeAll(Collection<?> paramCollection)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   4: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 41 1 0
    //   12: aload_0
    //   13: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   16: invokevirtual 44	com/chartboost/sdk/impl/bc:a	()Ljava/util/Map;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface 31 1 0
    //   26: aload_1
    //   27: invokeinterface 63 2 0
    //   32: istore 5
    //   34: aload_0
    //   35: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   38: aload_3
    //   39: invokevirtual 49	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   42: aload_0
    //   43: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   46: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   49: invokeinterface 52 1 0
    //   54: iload 5
    //   56: ireturn
    //   57: astore 4
    //   59: aload_0
    //   60: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   63: aload_3
    //   64: invokevirtual 49	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   67: aload 4
    //   69: athrow
    //   70: astore_2
    //   71: aload_0
    //   72: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   75: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   78: invokeinterface 52 1 0
    //   83: aload_2
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	b
    //   0	85	1	paramCollection	Collection<?>
    //   70	14	2	localObject1	Object
    //   19	45	3	localMap	Map
    //   57	11	4	localObject2	Object
    //   32	23	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   20	34	57	finally
    //   12	20	70	finally
    //   34	42	70	finally
    //   59	70	70	finally
  }
  
  /* Error */
  public boolean retainAll(Collection<?> paramCollection)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   4: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 41 1 0
    //   12: aload_0
    //   13: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   16: invokevirtual 44	com/chartboost/sdk/impl/bc:a	()Ljava/util/Map;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface 31 1 0
    //   26: aload_1
    //   27: invokeinterface 66 2 0
    //   32: istore 5
    //   34: aload_0
    //   35: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   38: aload_3
    //   39: invokevirtual 49	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   42: aload_0
    //   43: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   46: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   49: invokeinterface 52 1 0
    //   54: iload 5
    //   56: ireturn
    //   57: astore 4
    //   59: aload_0
    //   60: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   63: aload_3
    //   64: invokevirtual 49	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   67: aload 4
    //   69: athrow
    //   70: astore_2
    //   71: aload_0
    //   72: getfield 13	com/chartboost/sdk/impl/bc$b:a	Lcom/chartboost/sdk/impl/bc;
    //   75: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   78: invokeinterface 52 1 0
    //   83: aload_2
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	b
    //   0	85	1	paramCollection	Collection<?>
    //   70	14	2	localObject1	Object
    //   19	45	3	localMap	Map
    //   57	11	4	localObject2	Object
    //   32	23	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   20	34	57	finally
    //   12	20	70	finally
    //   34	42	70	finally
    //   59	70	70	finally
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bc.b
 * JD-Core Version:    0.7.0.1
 */