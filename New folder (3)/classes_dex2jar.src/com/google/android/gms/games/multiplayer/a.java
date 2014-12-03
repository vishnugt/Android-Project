package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

final class a
  extends f
{
  public final InvitationEntity a(Parcel paramParcel)
  {
    if ((InvitationEntity.a(InvitationEntity.j())) || (InvitationEntity.a(InvitationEntity.class.getCanonicalName()))) {
      return super.a(paramParcel);
    }
    GameEntity localGameEntity = (GameEntity)GameEntity.CREATOR.createFromParcel(paramParcel);
    String str = paramParcel.readString();
    long l = paramParcel.readLong();
    int i = paramParcel.readInt();
    ParticipantEntity localParticipantEntity = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(paramParcel);
    int j = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(j);
    for (int k = 0; k < j; k++) {
      localArrayList.add(ParticipantEntity.CREATOR.createFromParcel(paramParcel));
    }
    return new InvitationEntity(1, localGameEntity, str, l, i, localParticipantEntity, localArrayList, -1);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.a
 * JD-Core Version:    0.7.0.1
 */