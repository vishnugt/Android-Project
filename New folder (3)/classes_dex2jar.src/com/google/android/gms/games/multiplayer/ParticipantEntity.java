package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cq;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.en;
import java.util.Arrays;

public final class ParticipantEntity
  extends en
  implements Participant
{
  public static final Parcelable.Creator<ParticipantEntity> CREATOR = new c();
  private final int b;
  private final String c;
  private final String d;
  private final Uri e;
  private final Uri f;
  private final int g;
  private final String h;
  private final boolean i;
  private final PlayerEntity j;
  private final int k;
  
  ParticipantEntity(int paramInt1, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, int paramInt2, String paramString3, boolean paramBoolean, PlayerEntity paramPlayerEntity, int paramInt3)
  {
    this.b = paramInt1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramUri1;
    this.f = paramUri2;
    this.g = paramInt2;
    this.h = paramString3;
    this.i = paramBoolean;
    this.j = paramPlayerEntity;
    this.k = paramInt3;
  }
  
  public ParticipantEntity(Participant paramParticipant)
  {
    this.b = 1;
    this.c = paramParticipant.i();
    this.d = paramParticipant.f();
    this.e = paramParticipant.g();
    this.f = paramParticipant.h();
    this.g = paramParticipant.b();
    this.h = paramParticipant.c();
    this.i = paramParticipant.e();
    Player localPlayer = paramParticipant.j();
    if (localPlayer == null) {}
    for (PlayerEntity localPlayerEntity = null;; localPlayerEntity = new PlayerEntity(localPlayer))
    {
      this.j = localPlayerEntity;
      this.k = paramParticipant.d();
      return;
    }
  }
  
  static int a(Participant paramParticipant)
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = paramParticipant.j();
    arrayOfObject[1] = Integer.valueOf(paramParticipant.b());
    arrayOfObject[2] = paramParticipant.c();
    arrayOfObject[3] = Boolean.valueOf(paramParticipant.e());
    arrayOfObject[4] = paramParticipant.f();
    arrayOfObject[5] = paramParticipant.g();
    arrayOfObject[6] = paramParticipant.h();
    arrayOfObject[7] = Integer.valueOf(paramParticipant.d());
    return Arrays.hashCode(arrayOfObject);
  }
  
  static boolean a(Participant paramParticipant, Object paramObject)
  {
    if (!(paramObject instanceof Participant)) {}
    Participant localParticipant;
    do
    {
      return false;
      if (paramParticipant == paramObject) {
        return true;
      }
      localParticipant = (Participant)paramObject;
    } while ((!cp.a(localParticipant.j(), paramParticipant.j())) || (!cp.a(Integer.valueOf(localParticipant.b()), Integer.valueOf(paramParticipant.b()))) || (!cp.a(localParticipant.c(), paramParticipant.c())) || (!cp.a(Boolean.valueOf(localParticipant.e()), Boolean.valueOf(paramParticipant.e()))) || (!cp.a(localParticipant.f(), paramParticipant.f())) || (!cp.a(localParticipant.g(), paramParticipant.g())) || (!cp.a(localParticipant.h(), paramParticipant.h())) || (!cp.a(Integer.valueOf(localParticipant.d()), Integer.valueOf(paramParticipant.d()))));
    return true;
  }
  
  static String b(Participant paramParticipant)
  {
    return cp.a(paramParticipant).a("Player", paramParticipant.j()).a("Status", Integer.valueOf(paramParticipant.b())).a("ClientAddress", paramParticipant.c()).a("ConnectedToRoom", Boolean.valueOf(paramParticipant.e())).a("DisplayName", paramParticipant.f()).a("IconImage", paramParticipant.g()).a("HiResImage", paramParticipant.h()).a("Capabilities", Integer.valueOf(paramParticipant.d())).toString();
  }
  
  public final int b()
  {
    return this.g;
  }
  
  public final String c()
  {
    return this.h;
  }
  
  public final int d()
  {
    return this.k;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean e()
  {
    return this.i;
  }
  
  public final boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public final String f()
  {
    if (this.j == null) {
      return this.d;
    }
    return this.j.c();
  }
  
  public final Uri g()
  {
    if (this.j == null) {
      return this.e;
    }
    return this.j.d();
  }
  
  public final Uri h()
  {
    if (this.j == null) {
      return this.f;
    }
    return this.j.e();
  }
  
  public final int hashCode()
  {
    return a(this);
  }
  
  public final String i()
  {
    return this.c;
  }
  
  public final Player j()
  {
    return this.j;
  }
  
  public final int k()
  {
    return this.b;
  }
  
  public final String toString()
  {
    return b(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!this.a)
    {
      g.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    String str1;
    label39:
    String str2;
    label58:
    int m;
    label90:
    int n;
    if (this.e == null)
    {
      str1 = null;
      paramParcel.writeString(str1);
      Uri localUri = this.f;
      str2 = null;
      if (localUri != null) {
        break label144;
      }
      paramParcel.writeString(str2);
      paramParcel.writeInt(this.g);
      paramParcel.writeString(this.h);
      if (!this.i) {
        break label156;
      }
      m = 1;
      paramParcel.writeInt(m);
      PlayerEntity localPlayerEntity = this.j;
      n = 0;
      if (localPlayerEntity != null) {
        break label162;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(n);
      if (this.j == null) {
        break;
      }
      this.j.writeToParcel(paramParcel, paramInt);
      return;
      str1 = this.e.toString();
      break label39;
      label144:
      str2 = this.f.toString();
      break label58;
      label156:
      m = 0;
      break label90;
      label162:
      n = 1;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.ParticipantEntity
 * JD-Core Version:    0.7.0.1
 */