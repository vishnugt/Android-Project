package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.a.b;

public final class LatLng
  implements SafeParcelable
{
  public static final f CREATOR = new f();
  public final double a;
  public final double b;
  private final int c;
  
  LatLng(int paramInt, double paramDouble1, double paramDouble2)
  {
    this.c = paramInt;
    if ((-180.0D <= paramDouble2) && (paramDouble2 < 180.0D)) {}
    for (this.b = paramDouble2;; this.b = ((360.0D + (paramDouble2 - 180.0D) % 360.0D) % 360.0D - 180.0D))
    {
      this.a = Math.max(-90.0D, Math.min(90.0D, paramDouble1));
      return;
    }
  }
  
  final int a()
  {
    return this.c;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LatLng localLatLng;
    do
    {
      return true;
      if (!(paramObject instanceof LatLng)) {
        return false;
      }
      localLatLng = (LatLng)paramObject;
    } while ((Double.doubleToLongBits(this.a) == Double.doubleToLongBits(localLatLng.a)) && (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(localLatLng.b)));
    return false;
  }
  
  public final int hashCode()
  {
    long l1 = Double.doubleToLongBits(this.a);
    int i = 31 + (int)(l1 ^ l1 >>> 32);
    long l2 = Double.doubleToLongBits(this.b);
    return i * 31 + (int)(l2 ^ l2 >>> 32);
  }
  
  public final String toString()
  {
    return "lat/lng: (" + this.a + "," + this.b + ")";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (b.a())
    {
      int i = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.c);
      c.a(paramParcel, 2, this.a);
      c.a(paramParcel, 3, this.b);
      c.b(paramParcel, i);
      return;
    }
    f.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLng
 * JD-Core Version:    0.7.0.1
 */