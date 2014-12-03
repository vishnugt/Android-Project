package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cq;
import com.google.android.gms.internal.cr;
import java.util.Arrays;

public final class CameraPosition
  implements SafeParcelable
{
  public static final b CREATOR = new b();
  public final LatLng a;
  public final float b;
  public final float c;
  public final float d;
  private final int e;
  
  CameraPosition(int paramInt, LatLng paramLatLng, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    cr.a(paramLatLng, "null camera target");
    if ((0.0F <= paramFloat2) && (paramFloat2 <= 90.0F)) {}
    for (int i = 1; i == 0; i = 0) {
      throw new IllegalArgumentException(String.valueOf("Tilt needs to be between 0 and 90 inclusive"));
    }
    this.e = paramInt;
    this.a = paramLatLng;
    this.b = paramFloat1;
    this.c = (paramFloat2 + 0.0F);
    if (paramFloat3 <= 0.0D) {
      paramFloat3 = 360.0F + paramFloat3 % 360.0F;
    }
    this.d = (paramFloat3 % 360.0F);
  }
  
  final int a()
  {
    return this.e;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    CameraPosition localCameraPosition;
    do
    {
      return true;
      if (!(paramObject instanceof CameraPosition)) {
        return false;
      }
      localCameraPosition = (CameraPosition)paramObject;
    } while ((this.a.equals(localCameraPosition.a)) && (Float.floatToIntBits(this.b) == Float.floatToIntBits(localCameraPosition.b)) && (Float.floatToIntBits(this.c) == Float.floatToIntBits(localCameraPosition.c)) && (Float.floatToIntBits(this.d) == Float.floatToIntBits(localCameraPosition.d)));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Float.valueOf(this.b);
    arrayOfObject[2] = Float.valueOf(this.c);
    arrayOfObject[3] = Float.valueOf(this.d);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    return cp.a(this).a("target", this.a).a("zoom", Float.valueOf(this.b)).a("tilt", Float.valueOf(this.c)).a("bearing", Float.valueOf(this.d)).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (com.google.android.gms.maps.a.b.a())
    {
      int i = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.e);
      c.a(paramParcel, 2, this.a, paramInt, false);
      c.a(paramParcel, 3, this.b);
      c.a(paramParcel, 4, this.c);
      c.a(paramParcel, 5, this.d);
      c.b(paramParcel, i);
      return;
    }
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.CameraPosition
 * JD-Core Version:    0.7.0.1
 */