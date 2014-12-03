package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ey
  implements Parcelable.Creator<x>
{
  static void a(x paramx, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramx.a);
    c.a(paramParcel, 2, paramx.b, false);
    c.b(paramParcel, 3, paramx.c);
    c.b(paramParcel, 4, paramx.d);
    c.a(paramParcel, 5, paramx.e);
    c.b(paramParcel, 6, paramx.f);
    c.b(paramParcel, 7, paramx.g);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ey
 * JD-Core Version:    0.7.0.1
 */