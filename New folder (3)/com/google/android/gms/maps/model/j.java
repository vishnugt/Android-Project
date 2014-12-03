package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class j
  implements Parcelable.Creator<Tile>
{
  public static Tile a(Parcel paramParcel)
  {
    int i = 0;
    int j = a.a(paramParcel);
    byte[] arrayOfByte = null;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = paramParcel.readInt();
      switch (0xFFFF & n)
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        m = a.e(paramParcel, n);
        break;
      case 2: 
        k = a.e(paramParcel, n);
        break;
      case 3: 
        i = a.e(paramParcel, n);
        break;
      case 4: 
        arrayOfByte = a.n(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b("Overread allowed size end=" + j, paramParcel);
    }
    return new Tile(m, k, i, arrayOfByte);
  }
  
  static void a(Tile paramTile, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramTile.a());
    c.b(paramParcel, 2, paramTile.a);
    c.b(paramParcel, 3, paramTile.b);
    c.a(paramParcel, paramTile.c);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.j
 * JD-Core Version:    0.7.0.1
 */