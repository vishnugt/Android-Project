package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cq;
import com.google.android.gms.maps.a.b;
import java.util.Arrays;

public final class VisibleRegion
  implements SafeParcelable
{
  public static final n CREATOR = new n();
  public final LatLng a;
  public final LatLng b;
  public final LatLng c;
  public final LatLng d;
  public final LatLngBounds e;
  private final int f;
  
  VisibleRegion(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2, LatLng paramLatLng3, LatLng paramLatLng4, LatLngBounds paramLatLngBounds)
  {
    this.f = paramInt;
    this.a = paramLatLng1;
    this.b = paramLatLng2;
    this.c = paramLatLng3;
    this.d = paramLatLng4;
    this.e = paramLatLngBounds;
  }
  
  final int a()
  {
    return this.f;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    VisibleRegion localVisibleRegion;
    do
    {
      return true;
      if (!(paramObject instanceof VisibleRegion)) {
        return false;
      }
      localVisibleRegion = (VisibleRegion)paramObject;
    } while ((this.a.equals(localVisibleRegion.a)) && (this.b.equals(localVisibleRegion.b)) && (this.c.equals(localVisibleRegion.c)) && (this.d.equals(localVisibleRegion.d)) && (this.e.equals(localVisibleRegion.e)));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    arrayOfObject[4] = this.e;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    return cp.a(this).a("nearLeft", this.a).a("nearRight", this.b).a("farLeft", this.c).a("farRight", this.d).a("latLngBounds", this.e).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (b.a())
    {
      int i = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.f);
      c.a(paramParcel, 2, this.a, paramInt, false);
      c.a(paramParcel, 3, this.b, paramInt, false);
      c.a(paramParcel, 4, this.c, paramInt, false);
      c.a(paramParcel, 5, this.d, paramInt, false);
      c.a(paramParcel, 6, this.e, paramInt, false);
      c.b(paramParcel, i);
      return;
    }
    n.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.VisibleRegion
 * JD-Core Version:    0.7.0.1
 */