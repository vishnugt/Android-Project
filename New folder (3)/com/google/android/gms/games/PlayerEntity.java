package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cq;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.en;
import java.util.Arrays;

public final class PlayerEntity
  extends en
  implements Player
{
  public static final Parcelable.Creator<PlayerEntity> CREATOR = new h();
  private final int b;
  private final String c;
  private final String d;
  private final Uri e;
  private final Uri f;
  private final long g;
  
  PlayerEntity(int paramInt, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, long paramLong)
  {
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramUri1;
    this.f = paramUri2;
    this.g = paramLong;
  }
  
  public PlayerEntity(Player paramPlayer)
  {
    this.b = i;
    this.c = paramPlayer.b();
    this.d = paramPlayer.c();
    this.e = paramPlayer.d();
    this.f = paramPlayer.e();
    this.g = paramPlayer.f();
    bt.a(this.c);
    bt.a(this.d);
    if (this.g > 0L) {}
    while (i == 0)
    {
      throw new IllegalStateException();
      i = 0;
    }
  }
  
  static int a(Player paramPlayer)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramPlayer.b();
    arrayOfObject[1] = paramPlayer.c();
    arrayOfObject[2] = paramPlayer.d();
    arrayOfObject[3] = paramPlayer.e();
    arrayOfObject[4] = Long.valueOf(paramPlayer.f());
    return Arrays.hashCode(arrayOfObject);
  }
  
  static boolean a(Player paramPlayer, Object paramObject)
  {
    if (!(paramObject instanceof Player)) {}
    Player localPlayer;
    do
    {
      return false;
      if (paramPlayer == paramObject) {
        return true;
      }
      localPlayer = (Player)paramObject;
    } while ((!cp.a(localPlayer.b(), paramPlayer.b())) || (!cp.a(localPlayer.c(), paramPlayer.c())) || (!cp.a(localPlayer.d(), paramPlayer.d())) || (!cp.a(localPlayer.e(), paramPlayer.e())) || (!cp.a(Long.valueOf(localPlayer.f()), Long.valueOf(paramPlayer.f()))));
    return true;
  }
  
  static String b(Player paramPlayer)
  {
    return cp.a(paramPlayer).a("PlayerId", paramPlayer.b()).a("DisplayName", paramPlayer.c()).a("IconImageUri", paramPlayer.d()).a("HiResImageUri", paramPlayer.e()).a("RetrievedTimestamp", Long.valueOf(paramPlayer.f())).toString();
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public final Uri d()
  {
    return this.e;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final Uri e()
  {
    return this.f;
  }
  
  public final boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public final long f()
  {
    return this.g;
  }
  
  public final int g()
  {
    return this.b;
  }
  
  public final int hashCode()
  {
    return a(this);
  }
  
  public final String toString()
  {
    return b(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!this.a)
    {
      j.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    String str1;
    String str2;
    if (this.e == null)
    {
      str1 = null;
      paramParcel.writeString(str1);
      Uri localUri = this.f;
      str2 = null;
      if (localUri != null) {
        break label84;
      }
    }
    for (;;)
    {
      paramParcel.writeString(str2);
      paramParcel.writeLong(this.g);
      return;
      str1 = this.e.toString();
      break;
      label84:
      str2 = this.f.toString();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.PlayerEntity
 * JD-Core Version:    0.7.0.1
 */