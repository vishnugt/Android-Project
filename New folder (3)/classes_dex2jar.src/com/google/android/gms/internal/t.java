package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class t
  implements Parcelable.Creator<bh>
{
  static void a(bh parambh, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, parambh.a);
    c.a(paramParcel, 2, parambh.b, paramInt, false);
    c.a(paramParcel, 3, parambh.a());
    c.a(paramParcel, 4, parambh.b());
    c.a(paramParcel, 5, parambh.c());
    c.a(paramParcel, 6, parambh.d());
    c.a(paramParcel, 7, parambh.g, false);
    c.a(paramParcel, 8, parambh.h);
    c.a(paramParcel, 9, parambh.i, false);
    c.a(paramParcel, 10, parambh.e());
    c.b(paramParcel, 11, parambh.k);
    c.b(paramParcel, 12, parambh.l);
    c.a(paramParcel, 13, parambh.m, false);
    c.a(paramParcel, 14, parambh.n, paramInt, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.t
 * JD-Core Version:    0.7.0.1
 */