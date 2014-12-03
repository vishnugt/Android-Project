package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class l
  implements Parcelable.Creator<TileOverlayOptions>
{
  static void a(TileOverlayOptions paramTileOverlayOptions, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramTileOverlayOptions.a());
    c.a(paramParcel, 2, paramTileOverlayOptions.b());
    c.a(paramParcel, 3, paramTileOverlayOptions.d());
    c.a(paramParcel, 4, paramTileOverlayOptions.c());
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.l
 * JD-Core Version:    0.7.0.1
 */