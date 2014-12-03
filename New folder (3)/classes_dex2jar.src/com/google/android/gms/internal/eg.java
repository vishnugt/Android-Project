package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Set;

public final class eg
  implements Parcelable.Creator<fv>
{
  static void a(fv paramfv, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    Set localSet = paramfv.e();
    if (localSet.contains(Integer.valueOf(1))) {
      c.b(paramParcel, 1, paramfv.f());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      c.a(paramParcel, 2, paramfv.g(), true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      c.a(paramParcel, 3, paramfv.h(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      c.a(paramParcel, 4, paramfv.i(), true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      c.a(paramParcel, 5, paramfv.j(), true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      c.b(paramParcel, 6, paramfv.k());
    }
    if (localSet.contains(Integer.valueOf(7))) {
      c.a(paramParcel, 7, paramfv.l(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(8))) {
      c.a(paramParcel, 8, paramfv.m(), true);
    }
    if (localSet.contains(Integer.valueOf(9))) {
      c.a(paramParcel, 9, paramfv.n(), true);
    }
    if (localSet.contains(Integer.valueOf(12))) {
      c.b(paramParcel, 12, paramfv.o());
    }
    if (localSet.contains(Integer.valueOf(14))) {
      c.a(paramParcel, 14, paramfv.p(), true);
    }
    if (localSet.contains(Integer.valueOf(15))) {
      c.a(paramParcel, 15, paramfv.q(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(16))) {
      c.a(paramParcel, 16, paramfv.r());
    }
    if (localSet.contains(Integer.valueOf(19))) {
      c.a(paramParcel, 19, paramfv.t(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(18))) {
      c.a(paramParcel, 18, paramfv.s(), true);
    }
    if (localSet.contains(Integer.valueOf(21))) {
      c.b(paramParcel, 21, paramfv.v());
    }
    if (localSet.contains(Integer.valueOf(20))) {
      c.a(paramParcel, 20, paramfv.u(), true);
    }
    if (localSet.contains(Integer.valueOf(23))) {
      c.b(paramParcel, 23, paramfv.x(), true);
    }
    if (localSet.contains(Integer.valueOf(22))) {
      c.b(paramParcel, 22, paramfv.w(), true);
    }
    if (localSet.contains(Integer.valueOf(25))) {
      c.b(paramParcel, 25, paramfv.z());
    }
    if (localSet.contains(Integer.valueOf(24))) {
      c.b(paramParcel, 24, paramfv.y());
    }
    if (localSet.contains(Integer.valueOf(27))) {
      c.a(paramParcel, 27, paramfv.B(), true);
    }
    if (localSet.contains(Integer.valueOf(26))) {
      c.a(paramParcel, 26, paramfv.A(), true);
    }
    if (localSet.contains(Integer.valueOf(29))) {
      c.a(paramParcel, 29, paramfv.D());
    }
    if (localSet.contains(Integer.valueOf(28))) {
      c.b(paramParcel, 28, paramfv.C(), true);
    }
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eg
 * JD-Core Version:    0.7.0.1
 */