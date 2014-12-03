package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class d
  implements Parcelable.Creator<RoomEntity>
{
  static void a(RoomEntity paramRoomEntity, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 1, paramRoomEntity.b(), false);
    c.b(paramParcel, 1000, paramRoomEntity.k());
    c.a(paramParcel, 2, paramRoomEntity.c(), false);
    c.a(paramParcel, 3, paramRoomEntity.d());
    c.b(paramParcel, 4, paramRoomEntity.e());
    c.a(paramParcel, 5, paramRoomEntity.f(), false);
    c.b(paramParcel, 6, paramRoomEntity.g());
    c.a(paramParcel, 7, paramRoomEntity.h());
    c.b(paramParcel, 8, paramRoomEntity.i(), false);
    c.b(paramParcel, 9, paramRoomEntity.j());
    c.b(paramParcel, i);
  }
  
  public RoomEntity a(Parcel paramParcel)
  {
    int i = 0;
    ArrayList localArrayList = null;
    int j = a.a(paramParcel);
    long l = 0L;
    Bundle localBundle = null;
    int k = 0;
    String str1 = null;
    int m = 0;
    String str2 = null;
    String str3 = null;
    int n = 0;
    while (paramParcel.dataPosition() < j)
    {
      int i1 = paramParcel.readInt();
      switch (0xFFFF & i1)
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        str3 = a.k(paramParcel, i1);
        break;
      case 1000: 
        n = a.e(paramParcel, i1);
        break;
      case 2: 
        str2 = a.k(paramParcel, i1);
        break;
      case 3: 
        l = a.f(paramParcel, i1);
        break;
      case 4: 
        m = a.e(paramParcel, i1);
        break;
      case 5: 
        str1 = a.k(paramParcel, i1);
        break;
      case 6: 
        k = a.e(paramParcel, i1);
        break;
      case 7: 
        localBundle = a.m(paramParcel, i1);
        break;
      case 8: 
        localArrayList = a.c(paramParcel, i1, ParticipantEntity.CREATOR);
        break;
      case 9: 
        i = a.e(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b("Overread allowed size end=" + j, paramParcel);
    }
    return new RoomEntity(n, str3, str2, l, m, str1, k, localBundle, localArrayList, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.d
 * JD-Core Version:    0.7.0.1
 */