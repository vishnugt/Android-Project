package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

final class b
  extends d
{
  public final RoomEntity a(Parcel paramParcel)
  {
    if ((RoomEntity.a(RoomEntity.l())) || (RoomEntity.a(RoomEntity.class.getCanonicalName()))) {
      return super.a(paramParcel);
    }
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    long l = paramParcel.readLong();
    int i = paramParcel.readInt();
    String str3 = paramParcel.readString();
    int j = paramParcel.readInt();
    Bundle localBundle = paramParcel.readBundle();
    int k = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(k);
    for (int m = 0; m < k; m++) {
      localArrayList.add(ParticipantEntity.CREATOR.createFromParcel(paramParcel));
    }
    return new RoomEntity(2, str1, str2, l, i, str3, j, localBundle, localArrayList, -1);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.b
 * JD-Core Version:    0.7.0.1
 */