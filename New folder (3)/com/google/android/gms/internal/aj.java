package com.google.android.gms.internal;

import android.os.IBinder;

final class aj
  implements ah
{
  private IBinder a;
  
  aj(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public final IBinder a(com.google.android.gms.a.a parama)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +52 -> 67
    //   18: aload_1
    //   19: invokeinterface 34 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/internal/aj:a	Landroid/os/IBinder;
    //   36: iconst_1
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 43 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 46	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 49	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   54: astore 7
    //   56: aload_3
    //   57: invokevirtual 52	android/os/Parcel:recycle	()V
    //   60: aload_2
    //   61: invokevirtual 52	android/os/Parcel:recycle	()V
    //   64: aload 7
    //   66: areturn
    //   67: aconst_null
    //   68: astore 5
    //   70: goto -44 -> 26
    //   73: astore 4
    //   75: aload_3
    //   76: invokevirtual 52	android/os/Parcel:recycle	()V
    //   79: aload_2
    //   80: invokevirtual 52	android/os/Parcel:recycle	()V
    //   83: aload 4
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	aj
    //   0	86	1	parama	com.google.android.gms.a.a
    //   3	77	2	localParcel1	android.os.Parcel
    //   7	69	3	localParcel2	android.os.Parcel
    //   73	11	4	localObject	Object
    //   24	45	5	localIBinder1	IBinder
    //   54	11	7	localIBinder2	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	73	finally
    //   18	26	73	finally
    //   26	56	73	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.aj
 * JD-Core Version:    0.7.0.1
 */