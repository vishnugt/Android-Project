package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class j
  implements Parcelable.Creator<PlayerEntity>
{
  static void a(PlayerEntity paramPlayerEntity, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 1, paramPlayerEntity.b(), false);
    c.b(paramParcel, 1000, paramPlayerEntity.g());
    c.a(paramParcel, 2, paramPlayerEntity.c(), false);
    c.a(paramParcel, 3, paramPlayerEntity.d(), paramInt, false);
    c.a(paramParcel, 4, paramPlayerEntity.e(), paramInt, false);
    c.a(paramParcel, 5, paramPlayerEntity.f());
    c.b(paramParcel, i);
  }
  
  public PlayerEntity a(Parcel paramParcel)
  {
    Uri localUri1 = null;
    int i = a.a(paramParcel);
    int j = 0;
    long l = 0L;
    Uri localUri2 = null;
    String str1 = null;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str2 = a.k(paramParcel, k);
        break;
      case 1000: 
        j = a.e(paramParcel, k);
        break;
      case 2: 
        str1 = a.k(paramParcel, k);
        break;
      case 3: 
        localUri2 = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 4: 
        localUri1 = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 5: 
        l = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new PlayerEntity(j, str2, str1, localUri2, localUri1, l);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.j
 * JD-Core Version:    0.7.0.1
 */