package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Set;

public final class ei
  implements Parcelable.Creator<fv.b>
{
  static void a(fv.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    Set localSet = paramb.e();
    if (localSet.contains(Integer.valueOf(1))) {
      c.b(paramParcel, 1, paramb.f());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      c.a(paramParcel, 2, paramb.g(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      c.a(paramParcel, 3, paramb.h(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      c.b(paramParcel, 4, paramb.i());
    }
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ei
 * JD-Core Version:    0.7.0.1
 */