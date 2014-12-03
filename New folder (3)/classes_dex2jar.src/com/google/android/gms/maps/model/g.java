package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class g
  implements Parcelable.Creator<MarkerOptions>
{
  static void a(MarkerOptions paramMarkerOptions, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramMarkerOptions.a());
    c.a(paramParcel, 2, paramMarkerOptions.c(), paramInt, false);
    c.a(paramParcel, 3, paramMarkerOptions.d(), false);
    c.a(paramParcel, 4, paramMarkerOptions.e(), false);
    c.a(paramParcel, 5, paramMarkerOptions.b());
    c.a(paramParcel, 6, paramMarkerOptions.f());
    c.a(paramParcel, 7, paramMarkerOptions.g());
    c.a(paramParcel, 8, paramMarkerOptions.h());
    c.a(paramParcel, 9, paramMarkerOptions.i());
    c.a(paramParcel, 10, paramMarkerOptions.j());
    c.a(paramParcel, 11, paramMarkerOptions.k());
    c.a(paramParcel, 12, paramMarkerOptions.l());
    c.a(paramParcel, 13, paramMarkerOptions.m());
    c.a(paramParcel, 14, paramMarkerOptions.n());
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.g
 * JD-Core Version:    0.7.0.1
 */