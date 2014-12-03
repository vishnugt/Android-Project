package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

class bc$d
  extends bc.a<K>
  implements Set<K>
{
  private bc$d(bc parambc) {}
  
  Collection<K> a()
  {
    return bc.a(this.a).keySet();
  }
  
  public void clear()
  {
    bc.b(this.a).lock();
    try
    {
      Map localMap = this.a.a();
      localMap.keySet().clear();
      this.a.b(localMap);
      return;
    }
    finally
    {
      bc.b(this.a).unlock();
    }
  }
  
  public boolean remove(Object paramObject)
  {
    return this.a.remove(paramObject) != null;
  }
  
  /* Error */
  public boolean removeAll(Collection<?> paramCollection)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   4: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 41 1 0
    //   12: aload_0
    //   13: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   16: invokevirtual 44	com/chartboost/sdk/impl/bc:a	()Ljava/util/Map;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface 31 1 0
    //   26: aload_1
    //   27: invokeinterface 61 2 0
    //   32: istore 5
    //   34: aload_0
    //   35: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   38: aload_3
    //   39: invokevirtual 49	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   42: aload_0
    //   43: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   46: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   49: invokeinterface 52 1 0
    //   54: iload 5
    //   56: ireturn
    //   57: astore 4
    //   59: aload_0
    //   60: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   63: aload_3
    //   64: invokevirtual 49	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   67: aload 4
    //   69: athrow
    //   70: astore_2
    //   71: aload_0
    //   72: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   75: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   78: invokeinterface 52 1 0
    //   83: aload_2
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	d
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
    //   1: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   4: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 41 1 0
    //   12: aload_0
    //   13: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   16: invokevirtual 44	com/chartboost/sdk/impl/bc:a	()Ljava/util/Map;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface 31 1 0
    //   26: aload_1
    //   27: invokeinterface 64 2 0
    //   32: istore 5
    //   34: aload_0
    //   35: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   38: aload_3
    //   39: invokevirtual 49	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   42: aload_0
    //   43: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   46: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   49: invokeinterface 52 1 0
    //   54: iload 5
    //   56: ireturn
    //   57: astore 4
    //   59: aload_0
    //   60: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   63: aload_3
    //   64: invokevirtual 49	com/chartboost/sdk/impl/bc:b	(Ljava/util/Map;)V
    //   67: aload 4
    //   69: athrow
    //   70: astore_2
    //   71: aload_0
    //   72: getfield 13	com/chartboost/sdk/impl/bc$d:a	Lcom/chartboost/sdk/impl/bc;
    //   75: invokestatic 36	com/chartboost/sdk/impl/bc:b	(Lcom/chartboost/sdk/impl/bc;)Ljava/util/concurrent/locks/Lock;
    //   78: invokeinterface 52 1 0
    //   83: aload_2
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	d
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
 * Qualified Name:     com.chartboost.sdk.impl.bc.d
 * JD-Core Version:    0.7.0.1
 */