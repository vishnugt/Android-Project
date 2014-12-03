package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cq;
import com.google.android.gms.internal.cr;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.en;
import java.util.ArrayList;
import java.util.Arrays;

public final class InvitationEntity
  extends en
  implements Invitation
{
  public static final Parcelable.Creator<InvitationEntity> CREATOR = new a();
  private final int b;
  private final GameEntity c;
  private final String d;
  private final long e;
  private final int f;
  private final ParticipantEntity g;
  private final ArrayList<ParticipantEntity> h;
  private final int i;
  
  InvitationEntity(int paramInt1, GameEntity paramGameEntity, String paramString, long paramLong, int paramInt2, ParticipantEntity paramParticipantEntity, ArrayList<ParticipantEntity> paramArrayList, int paramInt3)
  {
    this.b = paramInt1;
    this.c = paramGameEntity;
    this.d = paramString;
    this.e = paramLong;
    this.f = paramInt2;
    this.g = paramParticipantEntity;
    this.h = paramArrayList;
    this.i = paramInt3;
  }
  
  InvitationEntity(Invitation paramInvitation)
  {
    this.b = 1;
    this.c = new GameEntity(paramInvitation.b());
    this.d = paramInvitation.c();
    this.e = paramInvitation.e();
    this.f = paramInvitation.f();
    this.i = paramInvitation.g();
    String str = paramInvitation.d().i();
    Object localObject = null;
    ArrayList localArrayList = paramInvitation.i();
    int j = localArrayList.size();
    this.h = new ArrayList(j);
    for (int k = 0; k < j; k++)
    {
      Participant localParticipant = (Participant)localArrayList.get(k);
      if (localParticipant.i().equals(str)) {
        localObject = localParticipant;
      }
      this.h.add((ParticipantEntity)localParticipant.a());
    }
    cr.a(localObject, "Must have a valid inviter!");
    this.g = ((ParticipantEntity)localObject.a());
  }
  
  static int a(Invitation paramInvitation)
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = paramInvitation.b();
    arrayOfObject[1] = paramInvitation.c();
    arrayOfObject[2] = Long.valueOf(paramInvitation.e());
    arrayOfObject[3] = Integer.valueOf(paramInvitation.f());
    arrayOfObject[4] = paramInvitation.d();
    arrayOfObject[5] = paramInvitation.i();
    arrayOfObject[6] = Integer.valueOf(paramInvitation.g());
    return Arrays.hashCode(arrayOfObject);
  }
  
  static boolean a(Invitation paramInvitation, Object paramObject)
  {
    if (!(paramObject instanceof Invitation)) {}
    Invitation localInvitation;
    do
    {
      return false;
      if (paramInvitation == paramObject) {
        return true;
      }
      localInvitation = (Invitation)paramObject;
    } while ((!cp.a(localInvitation.b(), paramInvitation.b())) || (!cp.a(localInvitation.c(), paramInvitation.c())) || (!cp.a(Long.valueOf(localInvitation.e()), Long.valueOf(paramInvitation.e()))) || (!cp.a(Integer.valueOf(localInvitation.f()), Integer.valueOf(paramInvitation.f()))) || (!cp.a(localInvitation.d(), paramInvitation.d())) || (!cp.a(localInvitation.i(), paramInvitation.i())) || (!cp.a(Integer.valueOf(localInvitation.g()), Integer.valueOf(paramInvitation.g()))));
    return true;
  }
  
  static String b(Invitation paramInvitation)
  {
    return cp.a(paramInvitation).a("Game", paramInvitation.b()).a("InvitationId", paramInvitation.c()).a("CreationTimestamp", Long.valueOf(paramInvitation.e())).a("InvitationType", Integer.valueOf(paramInvitation.f())).a("Inviter", paramInvitation.d()).a("Participants", paramInvitation.i()).a("Variant", Integer.valueOf(paramInvitation.g())).toString();
  }
  
  public final Game b()
  {
    return this.c;
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public final Participant d()
  {
    return this.g;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final long e()
  {
    return this.e;
  }
  
  public final boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public final int f()
  {
    return this.f;
  }
  
  public final int g()
  {
    return this.i;
  }
  
  public final int h()
  {
    return this.b;
  }
  
  public final int hashCode()
  {
    return a(this);
  }
  
  public final ArrayList<Participant> i()
  {
    return new ArrayList(this.h);
  }
  
  public final String toString()
  {
    return b(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!this.a) {
      f.a(this, paramParcel, paramInt);
    }
    for (;;)
    {
      return;
      this.c.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.d);
      paramParcel.writeLong(this.e);
      paramParcel.writeInt(this.f);
      this.g.writeToParcel(paramParcel, paramInt);
      int j = this.h.size();
      paramParcel.writeInt(j);
      for (int k = 0; k < j; k++) {
        ((ParticipantEntity)this.h.get(k)).writeToParcel(paramParcel, paramInt);
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.InvitationEntity
 * JD-Core Version:    0.7.0.1
 */