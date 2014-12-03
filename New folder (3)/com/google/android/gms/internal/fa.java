package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class fa
  implements SafeParcelable
{
  public static final eb CREATOR = new eb();
  private final int a;
  private final String b;
  private final long c;
  private final short d;
  private final double e;
  private final double f;
  private final float g;
  private final int h;
  private final int i;
  private final int j;
  
  public fa(int paramInt1, String paramString, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt3, int paramInt4)
  {
    if ((paramString == null) || (paramString.length() > 100)) {
      throw new IllegalArgumentException("requestId is null or too long: " + paramString);
    }
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("invalid radius: " + paramFloat);
    }
    if ((paramDouble1 > 90.0D) || (paramDouble1 < -90.0D)) {
      throw new IllegalArgumentException("invalid latitude: " + paramDouble1);
    }
    if ((paramDouble2 > 180.0D) || (paramDouble2 < -180.0D)) {
      throw new IllegalArgumentException("invalid longitude: " + paramDouble2);
    }
    int k = paramInt2 & 0x7;
    if (k == 0) {
      throw new IllegalArgumentException("No supported transition specified: " + paramInt2);
    }
    this.a = paramInt1;
    this.d = paramShort;
    this.b = paramString;
    this.e = paramDouble1;
    this.f = paramDouble2;
    this.g = paramFloat;
    this.c = paramLong;
    this.h = k;
    this.i = paramInt3;
    this.j = paramInt4;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public final short b()
  {
    return this.d;
  }
  
  public final double c()
  {
    return this.e;
  }
  
  public final double d()
  {
    return this.f;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final float e()
  {
    return this.g;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    fa localfa;
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof fa)) {
        return false;
      }
      localfa = (fa)paramObject;
      if (this.g != localfa.g) {
        return false;
      }
      if (this.e != localfa.e) {
        return false;
      }
      if (this.f != localfa.f) {
        return false;
      }
    } while (this.d == localfa.d);
    return false;
  }
  
  public final String f()
  {
    return this.b;
  }
  
  public final long g()
  {
    return this.c;
  }
  
  public final int h()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    long l1 = Double.doubleToLongBits(this.e);
    int k = 31 + (int)(l1 ^ l1 >>> 32);
    long l2 = Double.doubleToLongBits(this.f);
    return 31 * (31 * (31 * (k * 31 + (int)(l2 ^ l2 >>> 32)) + Float.floatToIntBits(this.g)) + this.d) + this.h;
  }
  
  public final int i()
  {
    return this.i;
  }
  
  public final int j()
  {
    return this.j;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[9];
    switch (this.d)
    {
    }
    for (String str = null;; str = "CIRCLE")
    {
      arrayOfObject[0] = str;
      arrayOfObject[1] = this.b;
      arrayOfObject[2] = Integer.valueOf(this.h);
      arrayOfObject[3] = Double.valueOf(this.e);
      arrayOfObject[4] = Double.valueOf(this.f);
      arrayOfObject[5] = Float.valueOf(this.g);
      arrayOfObject[6] = Integer.valueOf(this.i / 1000);
      arrayOfObject[7] = Integer.valueOf(this.j);
      arrayOfObject[8] = Long.valueOf(this.c);
      return String.format(localLocale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", arrayOfObject);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    eb.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fa
 * JD-Core Version:    0.7.0.1
 */