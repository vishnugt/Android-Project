package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Set;

public final class ep
  implements Parcelable.Creator<fv.g>
{
  static void a(fv.g paramg, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    Set localSet = paramg.e();
    if (localSet.contains(Integer.valueOf(1))) {
      c.b(paramParcel, 1, paramg.f());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      c.a(paramParcel, 2, paramg.g());
    }
    if (localSet.contains(Integer.valueOf(3))) {
      c.a(paramParcel, 3, paramg.h(), true);
    }
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ep
 * JD-Core Version:    0.7.0.1
 */