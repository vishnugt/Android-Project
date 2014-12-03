package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class al
  implements Parcelable.Creator<bw>
{
  static void a(bw parambw, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, parambw.a);
    c.a(paramParcel, 2, parambw.b, false);
    c.a(paramParcel, 3, parambw.c, false);
    c.a(paramParcel, 4, parambw.d, false);
    c.b(paramParcel, 5, parambw.e);
    c.a(paramParcel, 6, parambw.f, false);
    c.a(paramParcel, 7, parambw.g);
    c.a(paramParcel, 8, parambw.h);
    c.a(paramParcel, 9, parambw.i);
    c.a(paramParcel, 10, parambw.j, false);
    c.a(paramParcel, 11, parambw.k);
    c.b(paramParcel, 12, parambw.l);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.al
 * JD-Core Version:    0.7.0.1
 */