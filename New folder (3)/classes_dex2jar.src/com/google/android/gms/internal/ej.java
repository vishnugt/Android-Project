package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Set;

public final class ej
  implements Parcelable.Creator<fv.b.a>
{
  static void a(fv.b.a parama, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    Set localSet = parama.e();
    if (localSet.contains(Integer.valueOf(1))) {
      c.b(paramParcel, 1, parama.f());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      c.b(paramParcel, 2, parama.g());
    }
    if (localSet.contains(Integer.valueOf(3))) {
      c.b(paramParcel, 3, parama.h());
    }
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ej
 * JD-Core Version:    0.7.0.1
 */