package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator<Address>
{
  static void a(Address paramAddress, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramAddress.a());
    c.a(paramParcel, 2, paramAddress.a, false);
    c.a(paramParcel, 3, paramAddress.b, false);
    c.a(paramParcel, 4, paramAddress.c, false);
    c.a(paramParcel, 5, paramAddress.d, false);
    c.a(paramParcel, 6, paramAddress.e, false);
    c.a(paramParcel, 7, paramAddress.f, false);
    c.a(paramParcel, 8, paramAddress.g, false);
    c.a(paramParcel, 9, paramAddress.h, false);
    c.a(paramParcel, 10, paramAddress.i, false);
    c.a(paramParcel, 11, paramAddress.j);
    c.a(paramParcel, 12, paramAddress.k, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.a
 * JD-Core Version:    0.7.0.1
 */