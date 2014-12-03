package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class o
  implements Parcelable.Creator<be>
{
  static void a(be parambe, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, parambe.a);
    c.a(paramParcel, 2, parambe.b, false);
    c.a(paramParcel, 3, parambe.c, false);
    c.a(paramParcel, 4, parambe.d, false);
    c.a(paramParcel, 5, parambe.e, false);
    c.a(paramParcel, 6, parambe.f, false);
    c.a(paramParcel, 7, parambe.g, false);
    c.a(paramParcel, 8, parambe.h, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.o
 * JD-Core Version:    0.7.0.1
 */