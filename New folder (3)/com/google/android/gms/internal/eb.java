package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class eb
  implements Parcelable.Creator<fa>
{
  static void a(fa paramfa, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 1, paramfa.f(), false);
    c.b(paramParcel, 1000, paramfa.a());
    c.a(paramParcel, 2, paramfa.g());
    int j = paramfa.b();
    c.a(paramParcel, 3, 4);
    paramParcel.writeInt(j);
    c.a(paramParcel, 4, paramfa.c());
    c.a(paramParcel, 5, paramfa.d());
    c.a(paramParcel, 6, paramfa.e());
    c.b(paramParcel, 7, paramfa.h());
    c.b(paramParcel, 8, paramfa.i());
    c.b(paramParcel, 9, paramfa.j());
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eb
 * JD-Core Version:    0.7.0.1
 */