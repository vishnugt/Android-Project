package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cq;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.en;
import java.util.Arrays;

public final class GameEntity
  extends en
  implements Game
{
  public static final Parcelable.Creator<GameEntity> CREATOR = new a();
  private final int b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  private final String h;
  private final Uri i;
  private final Uri j;
  private final Uri k;
  private final boolean l;
  private final boolean m;
  private final String n;
  private final int o;
  private final int p;
  private final int q;
  
  GameEntity(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri1, Uri paramUri2, Uri paramUri3, boolean paramBoolean1, boolean paramBoolean2, String paramString7, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b = paramInt1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramString5;
    this.h = paramString6;
    this.i = paramUri1;
    this.j = paramUri2;
    this.k = paramUri3;
    this.l = paramBoolean1;
    this.m = paramBoolean2;
    this.n = paramString7;
    this.o = paramInt2;
    this.p = paramInt3;
    this.q = paramInt4;
  }
  
  public GameEntity(Game paramGame)
  {
    this.b = 1;
    this.c = paramGame.b();
    this.e = paramGame.d();
    this.f = paramGame.e();
    this.g = paramGame.f();
    this.h = paramGame.g();
    this.d = paramGame.c();
    this.i = paramGame.h();
    this.j = paramGame.i();
    this.k = paramGame.j();
    this.l = paramGame.k();
    this.m = paramGame.l();
    this.n = paramGame.m();
    this.o = paramGame.n();
    this.p = paramGame.o();
    this.q = paramGame.p();
  }
  
  static int a(Game paramGame)
  {
    Object[] arrayOfObject = new Object[15];
    arrayOfObject[0] = paramGame.b();
    arrayOfObject[1] = paramGame.c();
    arrayOfObject[2] = paramGame.d();
    arrayOfObject[3] = paramGame.e();
    arrayOfObject[4] = paramGame.f();
    arrayOfObject[5] = paramGame.g();
    arrayOfObject[6] = paramGame.h();
    arrayOfObject[7] = paramGame.i();
    arrayOfObject[8] = paramGame.j();
    arrayOfObject[9] = Boolean.valueOf(paramGame.k());
    arrayOfObject[10] = Boolean.valueOf(paramGame.l());
    arrayOfObject[11] = paramGame.m();
    arrayOfObject[12] = Integer.valueOf(paramGame.n());
    arrayOfObject[13] = Integer.valueOf(paramGame.o());
    arrayOfObject[14] = Integer.valueOf(paramGame.p());
    return Arrays.hashCode(arrayOfObject);
  }
  
  static boolean a(Game paramGame, Object paramObject)
  {
    if (!(paramObject instanceof Game)) {}
    Game localGame;
    do
    {
      return false;
      if (paramGame == paramObject) {
        return true;
      }
      localGame = (Game)paramObject;
    } while ((!cp.a(localGame.b(), paramGame.b())) || (!cp.a(localGame.c(), paramGame.c())) || (!cp.a(localGame.d(), paramGame.d())) || (!cp.a(localGame.e(), paramGame.e())) || (!cp.a(localGame.f(), paramGame.f())) || (!cp.a(localGame.g(), paramGame.g())) || (!cp.a(localGame.h(), paramGame.h())) || (!cp.a(localGame.i(), paramGame.i())) || (!cp.a(localGame.j(), paramGame.j())) || (!cp.a(Boolean.valueOf(localGame.k()), Boolean.valueOf(paramGame.k()))) || (!cp.a(Boolean.valueOf(localGame.l()), Boolean.valueOf(paramGame.l()))) || (!cp.a(localGame.m(), paramGame.m())) || (!cp.a(Integer.valueOf(localGame.n()), Integer.valueOf(paramGame.n()))) || (!cp.a(Integer.valueOf(localGame.o()), Integer.valueOf(paramGame.o()))) || (!cp.a(Integer.valueOf(localGame.p()), Integer.valueOf(paramGame.p()))));
    return true;
  }
  
  static String b(Game paramGame)
  {
    return cp.a(paramGame).a("ApplicationId", paramGame.b()).a("DisplayName", paramGame.c()).a("PrimaryCategory", paramGame.d()).a("SecondaryCategory", paramGame.e()).a("Description", paramGame.f()).a("DeveloperName", paramGame.g()).a("IconImageUri", paramGame.h()).a("HiResImageUri", paramGame.i()).a("FeaturedImageUri", paramGame.j()).a("PlayEnabledGame", Boolean.valueOf(paramGame.k())).a("InstanceInstalled", Boolean.valueOf(paramGame.l())).a("InstancePackageName", paramGame.m()).a("GameplayAclStatus", Integer.valueOf(paramGame.n())).a("AchievementTotalCount", Integer.valueOf(paramGame.o())).a("LeaderboardCount", Integer.valueOf(paramGame.p())).toString();
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public final String d()
  {
    return this.e;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String e()
  {
    return this.f;
  }
  
  public final boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public final String f()
  {
    return this.g;
  }
  
  public final String g()
  {
    return this.h;
  }
  
  public final Uri h()
  {
    return this.i;
  }
  
  public final int hashCode()
  {
    return a(this);
  }
  
  public final Uri i()
  {
    return this.j;
  }
  
  public final Uri j()
  {
    return this.k;
  }
  
  public final boolean k()
  {
    return this.l;
  }
  
  public final boolean l()
  {
    return this.m;
  }
  
  public final String m()
  {
    return this.n;
  }
  
  public final int n()
  {
    return this.o;
  }
  
  public final int o()
  {
    return this.p;
  }
  
  public final int p()
  {
    return this.q;
  }
  
  public final int q()
  {
    return this.b;
  }
  
  public final String toString()
  {
    return b(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = 1;
    if (!this.a)
    {
      i.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.h);
    String str1;
    String str2;
    label90:
    String str3;
    label110:
    int i2;
    if (this.i == null)
    {
      str1 = null;
      paramParcel.writeString(str1);
      if (this.j != null) {
        break label189;
      }
      str2 = null;
      paramParcel.writeString(str2);
      Uri localUri = this.k;
      str3 = null;
      if (localUri != null) {
        break label201;
      }
      paramParcel.writeString(str3);
      if (!this.l) {
        break label213;
      }
      i2 = i1;
      label126:
      paramParcel.writeInt(i2);
      if (!this.m) {
        break label219;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i1);
      paramParcel.writeString(this.n);
      paramParcel.writeInt(this.o);
      paramParcel.writeInt(this.p);
      paramParcel.writeInt(this.q);
      return;
      str1 = this.i.toString();
      break;
      label189:
      str2 = this.j.toString();
      break label90;
      label201:
      str3 = this.k.toString();
      break label110;
      label213:
      i2 = 0;
      break label126;
      label219:
      i1 = 0;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.GameEntity
 * JD-Core Version:    0.7.0.1
 */