package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Set;

public final class el
  implements Parcelable.Creator<fv.c>
{
  static void a(fv.c paramc, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    Set localSet = paramc.e();
    if (localSet.contains(Integer.valueOf(1))) {
      c.b(paramParcel, 1, paramc.f());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      c.a(paramParcel, 2, paramc.g(), true);
    }
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.el
 * JD-Core Version:    0.7.0.1
 */