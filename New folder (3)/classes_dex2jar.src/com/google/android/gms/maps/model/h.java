package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class h
  implements Parcelable.Creator<PolygonOptions>
{
  static void a(PolygonOptions paramPolygonOptions, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramPolygonOptions.a());
    c.b(paramParcel, 2, paramPolygonOptions.c(), false);
    c.a(paramParcel, paramPolygonOptions.b());
    c.a(paramParcel, 4, paramPolygonOptions.d());
    c.b(paramParcel, 5, paramPolygonOptions.e());
    c.b(paramParcel, 6, paramPolygonOptions.f());
    c.a(paramParcel, 7, paramPolygonOptions.g());
    c.a(paramParcel, 8, paramPolygonOptions.h());
    c.a(paramParcel, 9, paramPolygonOptions.i());
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.h
 * JD-Core Version:    0.7.0.1
 */