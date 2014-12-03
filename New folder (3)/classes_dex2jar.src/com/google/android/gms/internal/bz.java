package com.google.android.gms.internal;

import java.util.ArrayList;

public abstract class bz<TListener>
{
  private TListener b;
  private boolean c;
  
  public bz(TListener paramTListener)
  {
    Object localObject;
    this.b = localObject;
    this.c = false;
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 21	com/google/android/gms/internal/bz:b	Ljava/lang/Object;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 23	com/google/android/gms/internal/bz:c	Z
    //   11: ifeq +25 -> 36
    //   14: new 27	java/lang/StringBuilder
    //   17: dup
    //   18: ldc 29
    //   20: invokespecial 32	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   23: aload_0
    //   24: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   27: ldc 38
    //   29: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: pop
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: ifnull +8 -> 47
    //   42: aload_0
    //   43: aload_2
    //   44: invokevirtual 48	com/google/android/gms/internal/bz:a	(Ljava/lang/Object;)V
    //   47: aload_0
    //   48: monitorenter
    //   49: aload_0
    //   50: iconst_1
    //   51: putfield 23	com/google/android/gms/internal/bz:c	Z
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_0
    //   57: invokevirtual 50	com/google/android/gms/internal/bz:b	()V
    //   60: return
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    //   66: astore 4
    //   68: aload 4
    //   70: athrow
    //   71: astore_3
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_3
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	bz
    //   61	4	1	localObject1	Object
    //   6	38	2	localObject2	Object
    //   71	4	3	localObject3	Object
    //   66	3	4	localRuntimeException	java.lang.RuntimeException
    // Exception table:
    //   from	to	target	type
    //   2	36	61	finally
    //   36	38	61	finally
    //   42	47	66	java/lang/RuntimeException
    //   49	56	71	finally
  }
  
  protected abstract void a(TListener paramTListener);
  
  public final void b()
  {
    c();
    synchronized (bx.c(this.a))
    {
      bx.c(this.a).remove(this);
      return;
    }
  }
  
  public final void c()
  {
    try
    {
      this.b = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bz
 * JD-Core Version:    0.7.0.1
 */