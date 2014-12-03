package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class i
  implements Parcelable.Creator<PolylineOptions>
{
  static void a(PolylineOptions paramPolylineOptions, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramPolylineOptions.a());
    c.b(paramParcel, 2, paramPolylineOptions.b(), false);
    c.a(paramParcel, 3, paramPolylineOptions.c());
    c.b(paramParcel, 4, paramPolylineOptions.d());
    c.a(paramParcel, 5, paramPolylineOptions.e());
    c.a(paramParcel, 6, paramPolylineOptions.f());
    c.a(paramParcel, 7, paramPolylineOptions.g());
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.i
 * JD-Core Version:    0.7.0.1
 */