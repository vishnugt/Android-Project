package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class c
  implements Parcelable.Creator<LocationRequest>
{
  static void a(LocationRequest paramLocationRequest, Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, 1, paramLocationRequest.a);
    com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, 1000, paramLocationRequest.a());
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 2, paramLocationRequest.b);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 3, paramLocationRequest.c);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 4, paramLocationRequest.d);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 5, paramLocationRequest.e);
    com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, 6, paramLocationRequest.f);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 7, paramLocationRequest.g);
    com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.c
 * JD-Core Version:    0.7.0.1
 */