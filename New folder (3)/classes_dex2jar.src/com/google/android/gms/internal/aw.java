package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class aw
  implements Parcelable.Creator<co>
{
  static void a(co paramco, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramco.a);
    c.a(paramParcel, 2, paramco.b, false);
    c.b(paramParcel, 3, paramco.c);
    c.b(paramParcel, 4, paramco.d);
    c.a(paramParcel, 5, paramco.e);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.aw
 * JD-Core Version:    0.7.0.1
 */