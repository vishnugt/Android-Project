package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.PlayerEntity;

final class c
  extends g
{
  public final ParticipantEntity a(Parcel paramParcel)
  {
    if ((ParticipantEntity.a(ParticipantEntity.l())) || (ParticipantEntity.a(ParticipantEntity.class.getCanonicalName()))) {
      return super.a(paramParcel);
    }
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    String str3 = paramParcel.readString();
    Uri localUri1;
    String str4;
    Uri localUri2;
    label64:
    int i;
    String str5;
    boolean bool;
    if (str3 == null)
    {
      localUri1 = null;
      str4 = paramParcel.readString();
      if (str4 != null) {
        break label157;
      }
      localUri2 = null;
      i = paramParcel.readInt();
      str5 = paramParcel.readString();
      if (paramParcel.readInt() <= 0) {
        break label167;
      }
      bool = true;
      label86:
      int j = paramParcel.readInt();
      int k = 0;
      if (j > 0) {
        k = 1;
      }
      if (k == 0) {
        break label173;
      }
    }
    label157:
    label167:
    label173:
    for (PlayerEntity localPlayerEntity = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(paramParcel);; localPlayerEntity = null)
    {
      return new ParticipantEntity(1, str1, str2, localUri1, localUri2, i, str5, bool, localPlayerEntity, 7);
      localUri1 = Uri.parse(str3);
      break;
      localUri2 = Uri.parse(str4);
      break label64;
      bool = false;
      break label86;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.c
 * JD-Core Version:    0.7.0.1
 */