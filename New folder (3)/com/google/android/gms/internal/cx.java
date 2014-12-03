package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class cx
  implements Parcelable.Creator<dw.a>
{
  static void a(dw.a parama, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, parama.a());
    c.b(paramParcel, 2, parama.b());
    c.a(paramParcel, 3, parama.c());
    c.b(paramParcel, 4, parama.d());
    c.a(paramParcel, 5, parama.e());
    c.a(paramParcel, 6, parama.f(), false);
    c.b(paramParcel, 7, parama.g());
    c.a(paramParcel, 8, parama.i(), false);
    c.a(paramParcel, 9, parama.k(), paramInt, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cx
 * JD-Core Version:    0.7.0.1
 */