package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class n
  implements Parcelable.Creator<VisibleRegion>
{
  static void a(VisibleRegion paramVisibleRegion, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramVisibleRegion.a());
    c.a(paramParcel, 2, paramVisibleRegion.a, paramInt, false);
    c.a(paramParcel, 3, paramVisibleRegion.b, paramInt, false);
    c.a(paramParcel, 4, paramVisibleRegion.c, paramInt, false);
    c.a(paramParcel, 5, paramVisibleRegion.d, paramInt, false);
    c.a(paramParcel, 6, paramVisibleRegion.e, paramInt, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.n
 * JD-Core Version:    0.7.0.1
 */