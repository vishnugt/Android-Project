package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class ex
  implements Parcelable.Creator<v>
{
  static void a(v paramv, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramv.a);
    c.a(paramParcel, 2, paramv.b);
    c.a(paramParcel, 3, paramv.c);
    c.b(paramParcel, 4, paramv.d);
    c.a(paramParcel, 5, paramv.e, false);
    c.a(paramParcel, 6, paramv.f);
    c.b(paramParcel, 7, paramv.g);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ex
 * JD-Core Version:    0.7.0.1
 */