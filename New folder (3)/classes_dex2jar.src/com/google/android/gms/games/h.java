package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

final class h
  extends j
{
  public final PlayerEntity a(Parcel paramParcel)
  {
    if ((PlayerEntity.a(PlayerEntity.h())) || (PlayerEntity.a(PlayerEntity.class.getCanonicalName()))) {
      return super.a(paramParcel);
    }
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    String str3 = paramParcel.readString();
    String str4 = paramParcel.readString();
    Uri localUri1;
    Uri localUri2;
    if (str3 == null)
    {
      localUri1 = null;
      localUri2 = null;
      if (str4 != null) {
        break label93;
      }
    }
    for (;;)
    {
      return new PlayerEntity(1, str1, str2, localUri1, localUri2, paramParcel.readLong());
      localUri1 = Uri.parse(str3);
      break;
      label93:
      localUri2 = Uri.parse(str4);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.h
 * JD-Core Version:    0.7.0.1
 */