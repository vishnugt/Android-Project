package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

public final class b
  extends e
  implements Invitation
{
  private final Game c;
  private final d d;
  private final ArrayList<Participant> e;
  
  private Invitation h()
  {
    return new InvitationEntity(this);
  }
  
  public final Game b()
  {
    return this.c;
  }
  
  public final String c()
  {
    return d("external_invitation_id");
  }
  
  public final Participant d()
  {
    return this.d;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final long e()
  {
    return a("creation_timestamp");
  }
  
  public final boolean equals(Object paramObject)
  {
    return InvitationEntity.a(this, paramObject);
  }
  
  public final int f()
  {
    return b("type");
  }
  
  public final int g()
  {
    return b("variant");
  }
  
  public final int hashCode()
  {
    return InvitationEntity.a(this);
  }
  
  public final ArrayList<Participant> i()
  {
    return this.e;
  }
  
  public final String toString()
  {
    return InvitationEntity.b(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((InvitationEntity)h()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.b
 * JD-Core Version:    0.7.0.1
 */