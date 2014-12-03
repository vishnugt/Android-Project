package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.Player;

public final class d
  extends e
  implements Participant
{
  private final com.google.android.gms.games.d c;
  
  public d(com.google.android.gms.common.data.d paramd, int paramInt)
  {
    super(paramd, paramInt);
    this.c = new com.google.android.gms.games.d(paramd, paramInt);
  }
  
  private Participant k()
  {
    return new ParticipantEntity(this);
  }
  
  public final int b()
  {
    return b("player_status");
  }
  
  public final String c()
  {
    return d("client_address");
  }
  
  public final int d()
  {
    return b("capabilities");
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean e()
  {
    return b("connected") > 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ParticipantEntity.a(this, paramObject);
  }
  
  public final String f()
  {
    if (f("external_player_id")) {
      return d("default_display_name");
    }
    return this.c.c();
  }
  
  public final Uri g()
  {
    if (f("external_player_id")) {
      return e("default_display_image_uri");
    }
    return this.c.d();
  }
  
  public final Uri h()
  {
    if (f("external_player_id")) {
      return null;
    }
    return this.c.e();
  }
  
  public final int hashCode()
  {
    return ParticipantEntity.a(this);
  }
  
  public final String i()
  {
    return d("external_participant_id");
  }
  
  public final Player j()
  {
    if (f("external_player_id")) {
      return null;
    }
    return this.c;
  }
  
  public final String toString()
  {
    return ParticipantEntity.b(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((ParticipantEntity)k()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.d
 * JD-Core Version:    0.7.0.1
 */