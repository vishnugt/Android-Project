package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Set;

public final class eo
  implements Parcelable.Creator<fv.f>
{
  static void a(fv.f paramf, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    Set localSet = paramf.e();
    if (localSet.contains(Integer.valueOf(1))) {
      c.b(paramParcel, 1, paramf.f());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      c.a(paramParcel, 2, paramf.g(), true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      c.a(paramParcel, 3, paramf.h(), true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      c.a(paramParcel, 4, paramf.i(), true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      c.a(paramParcel, 5, paramf.j(), true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      c.a(paramParcel, 6, paramf.k(), true);
    }
    if (localSet.contains(Integer.valueOf(7))) {
      c.a(paramParcel, 7, paramf.l());
    }
    if (localSet.contains(Integer.valueOf(8))) {
      c.a(paramParcel, 8, paramf.m(), true);
    }
    if (localSet.contains(Integer.valueOf(9))) {
      c.a(paramParcel, 9, paramf.n(), true);
    }
    if (localSet.contains(Integer.valueOf(10))) {
      c.b(paramParcel, 10, paramf.o());
    }
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eo
 * JD-Core Version:    0.7.0.1
 */