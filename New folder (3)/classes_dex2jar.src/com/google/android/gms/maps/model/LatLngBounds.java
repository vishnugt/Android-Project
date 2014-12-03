package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cq;
import com.google.android.gms.internal.cr;
import com.google.android.gms.maps.a.b;
import java.util.Arrays;

public final class LatLngBounds
  implements SafeParcelable
{
  public static final e CREATOR = new e();
  public final LatLng a;
  public final LatLng b;
  private final int c;
  
  LatLngBounds(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2)
  {
    cr.a(paramLatLng1, "null southwest");
    cr.a(paramLatLng2, "null northeast");
    if (paramLatLng2.a >= paramLatLng1.a) {}
    for (int i = 1;; i = 0)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Double.valueOf(paramLatLng1.a);
      arrayOfObject[1] = Double.valueOf(paramLatLng2.a);
      if (i != 0) {
        break;
      }
      throw new IllegalArgumentException(String.format("southern latitude exceeds northern latitude (%s > %s)", arrayOfObject));
    }
    this.c = paramInt;
    this.a = paramLatLng1;
    this.b = paramLatLng2;
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
    LatLngBounds localLatLngBounds;
    do
    {
      return true;
      if (!(paramObject instanceof LatLngBounds)) {
        return false;
      }
      localLatLngBounds = (LatLngBounds)paramObject;
    } while ((this.a.equals(localLatLngBounds.a)) && (this.b.equals(localLatLngBounds.b)));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = this.b;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    return cp.a(this).a("southwest", this.a).a("northeast", this.b).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (b.a())
    {
      int i = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.c);
      c.a(paramParcel, 2, this.a, paramInt, false);
      c.a(paramParcel, 3, this.b, paramInt, false);
      c.b(paramParcel, i);
      return;
    }
    e.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLngBounds
 * JD-Core Version:    0.7.0.1
 */