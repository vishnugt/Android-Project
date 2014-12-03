package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ak
  implements Parcelable.Creator<bu>
{
  static void a(bu parambu, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, parambu.a);
    c.a(paramParcel, 2, parambu.b);
    c.a(paramParcel, 3, parambu.c, paramInt, false);
    c.a(paramParcel, 4, parambu.d, paramInt, false);
    c.a(paramParcel, 5, parambu.e, false);
    c.a(paramParcel, 6, parambu.f, paramInt, false);
    c.a(paramParcel, 7, parambu.g, paramInt, false);
    c.a(paramParcel, 8, parambu.h, false);
    c.a(paramParcel, 9, parambu.i, false);
    c.a(paramParcel, 10, parambu.j, false);
    c.a(paramParcel, 11, parambu.k, paramInt, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ak
 * JD-Core Version:    0.7.0.1
 */