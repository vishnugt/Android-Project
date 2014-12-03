package com.google.android.gms.maps.model.a;

import android.os.IBinder;

final class c
  implements a
{
  private IBinder a;
  
  c(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public final com.google.android.gms.maps.model.Tile a(int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: iload_1
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload 4
    //   25: iload_2
    //   26: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   29: aload 4
    //   31: iload_3
    //   32: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   35: aload_0
    //   36: getfield 15	com/google/android/gms/maps/model/a/c:a	Landroid/os/IBinder;
    //   39: iconst_1
    //   40: aload 4
    //   42: aload 5
    //   44: iconst_0
    //   45: invokeinterface 38 5 0
    //   50: pop
    //   51: aload 5
    //   53: invokevirtual 41	android/os/Parcel:readException	()V
    //   56: aload 5
    //   58: invokevirtual 45	android/os/Parcel:readInt	()I
    //   61: ifeq +31 -> 92
    //   64: getstatic 51	com/google/android/gms/maps/model/Tile:CREATOR	Lcom/google/android/gms/maps/model/j;
    //   67: pop
    //   68: aload 5
    //   70: invokestatic 56	com/google/android/gms/maps/model/j:a	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/Tile;
    //   73: astore 10
    //   75: aload 10
    //   77: astore 8
    //   79: aload 5
    //   81: invokevirtual 59	android/os/Parcel:recycle	()V
    //   84: aload 4
    //   86: invokevirtual 59	android/os/Parcel:recycle	()V
    //   89: aload 8
    //   91: areturn
    //   92: aconst_null
    //   93: astore 8
    //   95: goto -16 -> 79
    //   98: astore 6
    //   100: aload 5
    //   102: invokevirtual 59	android/os/Parcel:recycle	()V
    //   105: aload 4
    //   107: invokevirtual 59	android/os/Parcel:recycle	()V
    //   110: aload 6
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	c
    //   0	113	1	paramInt1	int
    //   0	113	2	paramInt2	int
    //   0	113	3	paramInt3	int
    //   3	103	4	localParcel1	android.os.Parcel
    //   8	93	5	localParcel2	android.os.Parcel
    //   98	13	6	localObject	Object
    //   77	17	8	localTile1	com.google.android.gms.maps.model.Tile
    //   73	3	10	localTile2	com.google.android.gms.maps.model.Tile
    // Exception table:
    //   from	to	target	type
    //   10	75	98	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.a.c
 * JD-Core Version:    0.7.0.1
 */