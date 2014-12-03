package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class db
  implements Parcelable.Creator<ec>
{
  static void a(ec paramec, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramec.a());
    Parcel localParcel = paramec.e();
    if (localParcel != null)
    {
      int j = c.a(paramParcel, 2);
      paramParcel.appendFrom(localParcel, 0, localParcel.dataSize());
      c.b(paramParcel, j);
    }
    c.a(paramParcel, 3, paramec.f(), paramInt, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.db
 * JD-Core Version:    0.7.0.1
 */