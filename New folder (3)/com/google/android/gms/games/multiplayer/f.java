package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class f
  implements Parcelable.Creator<InvitationEntity>
{
  static void a(InvitationEntity paramInvitationEntity, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 1, paramInvitationEntity.b(), paramInt, false);
    c.b(paramParcel, 1000, paramInvitationEntity.h());
    c.a(paramParcel, 2, paramInvitationEntity.c(), false);
    c.a(paramParcel, 3, paramInvitationEntity.e());
    c.b(paramParcel, 4, paramInvitationEntity.f());
    c.a(paramParcel, 5, paramInvitationEntity.d(), paramInt, false);
    c.b(paramParcel, 6, paramInvitationEntity.i(), false);
    c.b(paramParcel, 7, paramInvitationEntity.g());
    c.b(paramParcel, i);
  }
  
  public InvitationEntity a(Parcel paramParcel)
  {
    int i = 0;
    ArrayList localArrayList = null;
    int j = a.a(paramParcel);
    long l = 0L;
    ParticipantEntity localParticipantEntity = null;
    int k = 0;
    String str = null;
    GameEntity localGameEntity = null;
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
        localGameEntity = (GameEntity)a.a(paramParcel, n, GameEntity.CREATOR);
        break;
      case 1000: 
        m = a.e(paramParcel, n);
        break;
      case 2: 
        str = a.k(paramParcel, n);
        break;
      case 3: 
        l = a.f(paramParcel, n);
        break;
      case 4: 
        k = a.e(paramParcel, n);
        break;
      case 5: 
        localParticipantEntity = (ParticipantEntity)a.a(paramParcel, n, ParticipantEntity.CREATOR);
        break;
      case 6: 
        localArrayList = a.c(paramParcel, n, ParticipantEntity.CREATOR);
        break;
      case 7: 
        i = a.e(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b("Overread allowed size end=" + j, paramParcel);
    }
    return new InvitationEntity(m, localGameEntity, str, l, k, localParticipantEntity, localArrayList, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.f
 * JD-Core Version:    0.7.0.1
 */