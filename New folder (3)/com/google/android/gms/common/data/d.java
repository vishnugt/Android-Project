package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.cr;

public final class d
  implements SafeParcelable
{
  public static final h CREATOR = new h();
  private static final g l = new f(new String[0]);
  Bundle a;
  int[] b;
  int c;
  boolean d = false;
  private final int e;
  private final String[] f;
  private final CursorWindow[] g;
  private final int h;
  private final Bundle i;
  private Object j;
  private boolean k = true;
  
  d(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.e = paramInt1;
    this.f = paramArrayOfString;
    this.g = paramArrayOfCursorWindow;
    this.h = paramInt2;
    this.i = paramBundle;
  }
  
  private void a(String paramString, int paramInt)
  {
    if ((this.a == null) || (!this.a.containsKey(paramString))) {
      throw new IllegalArgumentException("No such column: " + paramString);
    }
    if (i()) {
      throw new IllegalArgumentException("Buffer is closed.");
    }
    if ((paramInt < 0) || (paramInt >= this.c)) {
      throw new CursorIndexOutOfBoundsException(paramInt, this.c);
    }
  }
  
  private boolean i()
  {
    try
    {
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final int a(int paramInt)
  {
    int m = 0;
    boolean bool;
    if ((paramInt >= 0) && (paramInt < this.c))
    {
      bool = true;
      cr.a(bool);
    }
    for (;;)
    {
      if (m < this.b.length)
      {
        if (paramInt < this.b[m]) {
          m--;
        }
      }
      else
      {
        if (m == this.b.length) {
          m--;
        }
        return m;
        bool = false;
        break;
      }
      m++;
    }
  }
  
  public final long a(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.g[paramInt2].getLong(paramInt1 - this.b[paramInt2], this.a.getInt(paramString));
  }
  
  public final void a()
  {
    int m = 0;
    this.a = new Bundle();
    for (int n = 0; n < this.f.length; n++) {
      this.a.putInt(this.f[n], n);
    }
    this.b = new int[this.g.length];
    int i1 = 0;
    while (m < this.g.length)
    {
      this.b[m] = i1;
      i1 += this.g[m].getNumRows();
      m++;
    }
    this.c = i1;
  }
  
  public final void a(Object paramObject)
  {
    this.j = paramObject;
  }
  
  final int b()
  {
    return this.e;
  }
  
  public final int b(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.g[paramInt2].getInt(paramInt1 - this.b[paramInt2], this.a.getInt(paramString));
  }
  
  public final String c(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.g[paramInt2].getString(paramInt1 - this.b[paramInt2], this.a.getInt(paramString));
  }
  
  final String[] c()
  {
    return this.f;
  }
  
  public final boolean d(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return Long.valueOf(this.g[paramInt2].getLong(paramInt1 - this.b[paramInt2], this.a.getInt(paramString))).longValue() == 1L;
  }
  
  final CursorWindow[] d()
  {
    return this.g;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int e()
  {
    return this.h;
  }
  
  public final Uri e(String paramString, int paramInt1, int paramInt2)
  {
    String str = c(paramString, paramInt1, paramInt2);
    if (str == null) {
      return null;
    }
    return Uri.parse(str);
  }
  
  public final Bundle f()
  {
    return this.i;
  }
  
  public final boolean f(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.g[paramInt2].isNull(paramInt1 - this.b[paramInt2], this.a.getInt(paramString));
  }
  
  /* Error */
  protected final void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 52	com/google/android/gms/common/data/d:k	Z
    //   4: ifeq +71 -> 75
    //   7: aload_0
    //   8: getfield 58	com/google/android/gms/common/data/d:g	[Landroid/database/CursorWindow;
    //   11: arraylength
    //   12: ifle +63 -> 75
    //   15: aload_0
    //   16: invokespecial 92	com/google/android/gms/common/data/d:i	()Z
    //   19: ifne +56 -> 75
    //   22: aload_0
    //   23: getfield 133	com/google/android/gms/common/data/d:j	Ljava/lang/Object;
    //   26: ifnonnull +54 -> 80
    //   29: new 75	java/lang/StringBuilder
    //   32: dup
    //   33: ldc 173
    //   35: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: aload_0
    //   39: invokevirtual 174	java/lang/Object:toString	()Ljava/lang/String;
    //   42: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: astore_3
    //   49: new 75	java/lang/StringBuilder
    //   52: dup
    //   53: ldc 176
    //   55: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   58: aload_3
    //   59: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: ldc 178
    //   64: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: pop
    //   71: aload_0
    //   72: invokevirtual 180	com/google/android/gms/common/data/d:h	()V
    //   75: aload_0
    //   76: invokespecial 182	java/lang/Object:finalize	()V
    //   79: return
    //   80: aload_0
    //   81: getfield 133	com/google/android/gms/common/data/d:j	Ljava/lang/Object;
    //   84: invokevirtual 174	java/lang/Object:toString	()Ljava/lang/String;
    //   87: astore_2
    //   88: aload_2
    //   89: astore_3
    //   90: goto -41 -> 49
    //   93: astore_1
    //   94: aload_0
    //   95: invokespecial 182	java/lang/Object:finalize	()V
    //   98: aload_1
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	d
    //   93	6	1	localObject1	Object
    //   87	2	2	str	String
    //   48	42	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	49	93	finally
    //   49	75	93	finally
    //   80	88	93	finally
  }
  
  public final int g()
  {
    return this.c;
  }
  
  public final void h()
  {
    try
    {
      if (!this.d)
      {
        this.d = true;
        for (int m = 0; m < this.g.length; m++) {
          this.g[m].close();
        }
      }
      return;
    }
    finally {}
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.d
 * JD-Core Version:    0.7.0.1
 */