package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class LocationRequest
  implements SafeParcelable
{
  public static final c CREATOR = new c();
  int a;
  long b;
  long c;
  boolean d;
  long e;
  int f;
  float g;
  private final int h;
  
  public LocationRequest()
  {
    this.h = 1;
    this.a = 102;
    this.b = 3600000L;
    this.c = 600000L;
    this.d = false;
    this.e = 9223372036854775807L;
    this.f = 2147483647;
    this.g = 0.0F;
  }
  
  LocationRequest(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, int paramInt3, float paramFloat)
  {
    this.h = paramInt1;
    this.a = paramInt2;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramBoolean;
    this.e = paramLong3;
    this.f = paramInt3;
    this.g = paramFloat;
  }
  
  final int a()
  {
    return this.h;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LocationRequest localLocationRequest;
    do
    {
      return true;
      if (!(paramObject instanceof LocationRequest)) {
        return false;
      }
      localLocationRequest = (LocationRequest)paramObject;
    } while ((this.a == localLocationRequest.a) && (this.b == localLocationRequest.b) && (this.c == localLocationRequest.c) && (this.d == localLocationRequest.d) && (this.e == localLocationRequest.e) && (this.f == localLocationRequest.f) && (this.g == localLocationRequest.g));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Long.valueOf(this.b);
    arrayOfObject[2] = Long.valueOf(this.c);
    arrayOfObject[3] = Boolean.valueOf(this.d);
    arrayOfObject[4] = Long.valueOf(this.e);
    arrayOfObject[5] = Integer.valueOf(this.f);
    arrayOfObject[6] = Float.valueOf(this.g);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("Request[");
    String str;
    switch (this.a)
    {
    case 101: 
    case 103: 
    default: 
      str = "???";
    }
    for (;;)
    {
      localStringBuilder2.append(str);
      if (this.a != 105)
      {
        localStringBuilder1.append(" requested=");
        localStringBuilder1.append(this.b + "ms");
      }
      localStringBuilder1.append(" fastest=");
      localStringBuilder1.append(this.c + "ms");
      if (this.e != 9223372036854775807L)
      {
        long l = this.e - SystemClock.elapsedRealtime();
        localStringBuilder1.append(" expireIn=");
        localStringBuilder1.append(l + "ms");
      }
      if (this.f != 2147483647) {
        localStringBuilder1.append(" num=").append(this.f);
      }
      localStringBuilder1.append(']');
      return localStringBuilder1.toString();
      str = "PRIORITY_HIGH_ACCURACY";
      continue;
      str = "PRIORITY_BALANCED_POWER_ACCURACY";
      continue;
      str = "PRIORITY_LOW_POWER";
      continue;
      str = "PRIORITY_NO_POWER";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationRequest
 * JD-Core Version:    0.7.0.1
 */