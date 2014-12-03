package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class b
  implements Parcelable.Creator<CameraPosition>
{
  static void a(CameraPosition paramCameraPosition, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramCameraPosition.a());
    c.a(paramParcel, 2, paramCameraPosition.a, paramInt, false);
    c.a(paramParcel, 3, paramCameraPosition.b);
    c.a(paramParcel, 4, paramCameraPosition.c);
    c.a(paramParcel, 5, paramCameraPosition.d);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.b
 * JD-Core Version:    0.7.0.1
 */