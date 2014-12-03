package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ed
  implements Parcelable.Creator<fn>
{
  static void a(fn paramfn, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 1, paramfn.b(), false);
    c.b(paramParcel, 1000, paramfn.a());
    c.a(paramParcel, 2, paramfn.c());
    c.a(paramParcel, 3, paramfn.d());
    c.a(paramParcel, 4, paramfn.e());
    c.a(paramParcel, 5, paramfn.f(), false);
    c.a(paramParcel, 6, paramfn.g(), false);
    c.a(paramParcel, 7, paramfn.h(), false);
    c.a(paramParcel, 8, paramfn.i(), false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ed
 * JD-Core Version:    0.7.0.1
 */