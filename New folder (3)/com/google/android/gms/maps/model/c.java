package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class c
  implements Parcelable.Creator<CircleOptions>
{
  static void a(CircleOptions paramCircleOptions, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, 1, paramCircleOptions.a());
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 2, paramCircleOptions.b(), paramInt, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 3, paramCircleOptions.c());
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 4, paramCircleOptions.d());
    com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, 5, paramCircleOptions.e());
    com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, 6, paramCircleOptions.f());
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 7, paramCircleOptions.g());
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 8, paramCircleOptions.h());
    com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.c
 * JD-Core Version:    0.7.0.1
 */