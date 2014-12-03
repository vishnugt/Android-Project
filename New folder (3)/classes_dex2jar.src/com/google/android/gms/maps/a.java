package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator<GoogleMapOptions>
{
  static void a(GoogleMapOptions paramGoogleMapOptions, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramGoogleMapOptions.a());
    c.a(paramParcel, 2, paramGoogleMapOptions.b());
    c.a(paramParcel, 3, paramGoogleMapOptions.c());
    c.b(paramParcel, 4, paramGoogleMapOptions.j());
    c.a(paramParcel, 5, paramGoogleMapOptions.k(), paramInt, false);
    c.a(paramParcel, 6, paramGoogleMapOptions.d());
    c.a(paramParcel, 7, paramGoogleMapOptions.e());
    c.a(paramParcel, 8, paramGoogleMapOptions.f());
    c.a(paramParcel, 9, paramGoogleMapOptions.g());
    c.a(paramParcel, 10, paramGoogleMapOptions.h());
    c.a(paramParcel, 11, paramGoogleMapOptions.i());
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.a
 * JD-Core Version:    0.7.0.1
 */