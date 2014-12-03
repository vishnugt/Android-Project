package com.jirbo.adcolony;

final class aq
{
  static aq a = new aq(0, false);
  static aq b = new aq(1, false);
  static aq c = new aq(2, true);
  static aq d = new aq(3, true);
  int e;
  boolean f;
  StringBuilder g = new StringBuilder();
  
  private aq(int paramInt, boolean paramBoolean)
  {
    this.e = paramInt;
    this.f = paramBoolean;
  }
  
  /* Error */
  private aq a(char paramChar)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	com/jirbo/adcolony/aq:f	Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifne +11 -> 19
    //   11: aload_0
    //   12: astore 7
    //   14: aload_0
    //   15: monitorexit
    //   16: aload 7
    //   18: areturn
    //   19: aload_0
    //   20: getfield 36	com/jirbo/adcolony/aq:g	Ljava/lang/StringBuilder;
    //   23: iload_1
    //   24: invokevirtual 45	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: iload_1
    //   29: bipush 10
    //   31: if_icmpne +27 -> 58
    //   34: aload_0
    //   35: getfield 38	com/jirbo/adcolony/aq:e	I
    //   38: pop
    //   39: aload_0
    //   40: getfield 36	com/jirbo/adcolony/aq:g	Ljava/lang/StringBuilder;
    //   43: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: pop
    //   47: invokestatic 53	com/jirbo/adcolony/a:f	()V
    //   50: aload_0
    //   51: getfield 36	com/jirbo/adcolony/aq:g	Ljava/lang/StringBuilder;
    //   54: iconst_0
    //   55: invokevirtual 57	java/lang/StringBuilder:setLength	(I)V
    //   58: aload_0
    //   59: astore 7
    //   61: goto -47 -> 14
    //   64: astore_2
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_2
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	this	aq
    //   0	69	1	paramChar	char
    //   64	4	2	localObject	Object
    //   6	2	3	bool	boolean
    //   12	48	7	localaq	aq
    // Exception table:
    //   from	to	target	type
    //   2	7	64	finally
    //   19	28	64	finally
    //   34	58	64	finally
  }
  
  /* Error */
  final aq a(double paramDouble)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	com/jirbo/adcolony/aq:f	Z
    //   6: istore 4
    //   8: iload 4
    //   10: ifne +11 -> 21
    //   13: aload_0
    //   14: astore 5
    //   16: aload_0
    //   17: monitorexit
    //   18: aload 5
    //   20: areturn
    //   21: dload_1
    //   22: aload_0
    //   23: getfield 36	com/jirbo/adcolony/aq:g	Ljava/lang/StringBuilder;
    //   26: invokestatic 63	com/jirbo/adcolony/cm:a	(DLjava/lang/StringBuilder;)V
    //   29: aload_0
    //   30: astore 5
    //   32: goto -16 -> 16
    //   35: astore_3
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_3
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	aq
    //   0	40	1	paramDouble	double
    //   35	4	3	localObject	Object
    //   6	3	4	bool	boolean
    //   14	17	5	localaq	aq
    // Exception table:
    //   from	to	target	type
    //   2	8	35	finally
    //   21	29	35	finally
  }
  
  /* Error */
  final aq a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	com/jirbo/adcolony/aq:f	Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifne +11 -> 19
    //   11: aload_0
    //   12: astore 5
    //   14: aload_0
    //   15: monitorexit
    //   16: aload 5
    //   18: areturn
    //   19: aload_0
    //   20: getfield 36	com/jirbo/adcolony/aq:g	Ljava/lang/StringBuilder;
    //   23: iload_1
    //   24: invokevirtual 67	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload_0
    //   29: astore 5
    //   31: goto -17 -> 14
    //   34: astore_2
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	aq
    //   0	39	1	paramInt	int
    //   34	4	2	localObject	Object
    //   6	2	3	bool	boolean
    //   12	18	5	localaq	aq
    // Exception table:
    //   from	to	target	type
    //   2	7	34	finally
    //   19	28	34	finally
  }
  
  /* Error */
  final aq a(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	com/jirbo/adcolony/aq:f	Z
    //   6: ifeq +14 -> 20
    //   9: aload_1
    //   10: ifnonnull +14 -> 24
    //   13: aload_0
    //   14: ldc 70
    //   16: invokevirtual 73	com/jirbo/adcolony/aq:a	(Ljava/lang/String;)Lcom/jirbo/adcolony/aq;
    //   19: pop
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_0
    //   23: areturn
    //   24: aload_0
    //   25: aload_1
    //   26: invokevirtual 74	java/lang/Object:toString	()Ljava/lang/String;
    //   29: invokevirtual 73	com/jirbo/adcolony/aq:a	(Ljava/lang/String;)Lcom/jirbo/adcolony/aq;
    //   32: pop
    //   33: goto -13 -> 20
    //   36: astore_2
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_2
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	aq
    //   0	41	1	paramObject	Object
    //   36	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	9	36	finally
    //   13	20	36	finally
    //   24	33	36	finally
  }
  
  final aq a(String paramString)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.f;
        if (!bool)
        {
          localaq = this;
          return localaq;
        }
        if (paramString == null)
        {
          this.g.append("null");
        }
        else
        {
          int i = paramString.length();
          int j = 0;
          if (j < i)
          {
            a(paramString.charAt(j));
            j++;
            continue;
          }
        }
        aq localaq = this;
      }
      finally {}
    }
  }
  
  /* Error */
  final aq a(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	com/jirbo/adcolony/aq:f	Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifne +11 -> 19
    //   11: aload_0
    //   12: astore 5
    //   14: aload_0
    //   15: monitorexit
    //   16: aload 5
    //   18: areturn
    //   19: aload_0
    //   20: getfield 36	com/jirbo/adcolony/aq:g	Ljava/lang/StringBuilder;
    //   23: iload_1
    //   24: invokevirtual 93	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload_0
    //   29: astore 5
    //   31: goto -17 -> 14
    //   34: astore_2
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	aq
    //   0	39	1	paramBoolean	boolean
    //   34	4	2	localObject	Object
    //   6	2	3	bool	boolean
    //   12	18	5	localaq	aq
    // Exception table:
    //   from	to	target	type
    //   2	7	34	finally
    //   19	28	34	finally
  }
  
  final aq b(double paramDouble)
  {
    try
    {
      a(paramDouble);
      aq localaq = a('\n');
      return localaq;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final aq b(int paramInt)
  {
    try
    {
      a(paramInt);
      aq localaq = a('\n');
      return localaq;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final aq b(Object paramObject)
  {
    try
    {
      a(paramObject);
      aq localaq = a('\n');
      return localaq;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final aq b(boolean paramBoolean)
  {
    try
    {
      a(paramBoolean);
      aq localaq = a('\n');
      return localaq;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final boolean b(String paramString)
  {
    a(paramString + '\n');
    return false;
  }
  
  final int c(String paramString)
  {
    a(paramString + '\n');
    return 0;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.aq
 * JD-Core Version:    0.7.0.1
 */