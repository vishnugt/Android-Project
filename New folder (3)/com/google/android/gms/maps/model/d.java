package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class d
  implements Parcelable.Creator<GroundOverlayOptions>
{
  static void a(GroundOverlayOptions paramGroundOverlayOptions, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramGroundOverlayOptions.b());
    c.a(paramParcel, 2, paramGroundOverlayOptions.a());
    c.a(paramParcel, 3, paramGroundOverlayOptions.c(), paramInt, false);
    c.a(paramParcel, 4, paramGroundOverlayOptions.d());
    c.a(paramParcel, 5, paramGroundOverlayOptions.e());
    c.a(paramParcel, 6, paramGroundOverlayOptions.f(), paramInt, false);
    c.a(paramParcel, 7, paramGroundOverlayOptions.g());
    c.a(paramParcel, 8, paramGroundOverlayOptions.h());
    c.a(paramParcel, 9, paramGroundOverlayOptions.l());
    c.a(paramParcel, 10, paramGroundOverlayOptions.i());
    c.a(paramParcel, 11, paramGroundOverlayOptions.j());
    c.a(paramParcel, 12, paramGroundOverlayOptions.k());
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.d
 * JD-Core Version:    0.7.0.1
 */