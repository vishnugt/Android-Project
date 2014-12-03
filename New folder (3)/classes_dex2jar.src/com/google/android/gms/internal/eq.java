package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Set;

public final class eq
  implements Parcelable.Creator<fv.h>
{
  static void a(fv.h paramh, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    Set localSet = paramh.e();
    if (localSet.contains(Integer.valueOf(1))) {
      c.b(paramParcel, 1, paramh.f());
    }
    if (localSet.contains(Integer.valueOf(3))) {
      c.b(paramParcel, 3, fv.h.h());
    }
    if (localSet.contains(Integer.valueOf(4))) {
      c.a(paramParcel, 4, paramh.j(), true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      c.a(paramParcel, 5, paramh.g(), true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      c.b(paramParcel, 6, paramh.i());
    }
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eq
 * JD-Core Version:    0.7.0.1
 */