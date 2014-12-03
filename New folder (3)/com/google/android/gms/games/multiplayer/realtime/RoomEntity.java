package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cq;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.en;
import java.util.ArrayList;
import java.util.Arrays;

public final class RoomEntity
  extends en
  implements Room
{
  public static final Parcelable.Creator<RoomEntity> CREATOR = new b();
  private final int b;
  private final String c;
  private final String d;
  private final long e;
  private final int f;
  private final String g;
  private final int h;
  private final Bundle i;
  private final ArrayList<ParticipantEntity> j;
  private final int k;
  
  RoomEntity(int paramInt1, String paramString1, String paramString2, long paramLong, int paramInt2, String paramString3, int paramInt3, Bundle paramBundle, ArrayList<ParticipantEntity> paramArrayList, int paramInt4)
  {
    this.b = paramInt1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramLong;
    this.f = paramInt2;
    this.g = paramString3;
    this.h = paramInt3;
    this.i = paramBundle;
    this.j = paramArrayList;
    this.k = paramInt4;
  }
  
  public RoomEntity(Room paramRoom)
  {
    this.b = 2;
    this.c = paramRoom.b();
    this.d = paramRoom.c();
    this.e = paramRoom.d();
    this.f = paramRoom.e();
    this.g = paramRoom.f();
    this.h = paramRoom.g();
    this.i = paramRoom.h();
    ArrayList localArrayList = paramRoom.i();
    int m = localArrayList.size();
    this.j = new ArrayList(m);
    for (int n = 0; n < m; n++) {
      this.j.add((ParticipantEntity)((Participant)localArrayList.get(n)).a());
    }
    this.k = paramRoom.j();
  }
  
  static int a(Room paramRoom)
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = paramRoom.b();
    arrayOfObject[1] = paramRoom.c();
    arrayOfObject[2] = Long.valueOf(paramRoom.d());
    arrayOfObject[3] = Integer.valueOf(paramRoom.e());
    arrayOfObject[4] = paramRoom.f();
    arrayOfObject[5] = Integer.valueOf(paramRoom.g());
    arrayOfObject[6] = paramRoom.h();
    arrayOfObject[7] = paramRoom.i();
    arrayOfObject[8] = Integer.valueOf(paramRoom.j());
    return Arrays.hashCode(arrayOfObject);
  }
  
  static boolean a(Room paramRoom, Object paramObject)
  {
    if (!(paramObject instanceof Room)) {}
    Room localRoom;
    do
    {
      return false;
      if (paramRoom == paramObject) {
        return true;
      }
      localRoom = (Room)paramObject;
    } while ((!cp.a(localRoom.b(), paramRoom.b())) || (!cp.a(localRoom.c(), paramRoom.c())) || (!cp.a(Long.valueOf(localRoom.d()), Long.valueOf(paramRoom.d()))) || (!cp.a(Integer.valueOf(localRoom.e()), Integer.valueOf(paramRoom.e()))) || (!cp.a(localRoom.f(), paramRoom.f())) || (!cp.a(Integer.valueOf(localRoom.g()), Integer.valueOf(paramRoom.g()))) || (!cp.a(localRoom.h(), paramRoom.h())) || (!cp.a(localRoom.i(), paramRoom.i())) || (!cp.a(Integer.valueOf(localRoom.j()), Integer.valueOf(paramRoom.j()))));
    return true;
  }
  
  static String b(Room paramRoom)
  {
    return cp.a(paramRoom).a("RoomId", paramRoom.b()).a("CreatorId", paramRoom.c()).a("CreationTimestamp", Long.valueOf(paramRoom.d())).a("RoomStatus", Integer.valueOf(paramRoom.e())).a("Description", paramRoom.f()).a("Variant", Integer.valueOf(paramRoom.g())).a("AutoMatchCriteria", paramRoom.h()).a("Participants", paramRoom.i()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(paramRoom.j())).toString();
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public final long d()
  {
    return this.e;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int e()
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
  
  public final int g()
  {
    return this.h;
  }
  
  public final Bundle h()
  {
    return this.i;
  }
  
  public final int hashCode()
  {
    return a(this);
  }
  
  public final ArrayList<Participant> i()
  {
    return new ArrayList(this.j);
  }
  
  public final int j()
  {
    return this.k;
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
    if (!this.a) {
      d.a(this, paramParcel);
    }
    for (;;)
    {
      return;
      paramParcel.writeString(this.c);
      paramParcel.writeString(this.d);
      paramParcel.writeLong(this.e);
      paramParcel.writeInt(this.f);
      paramParcel.writeString(this.g);
      paramParcel.writeInt(this.h);
      paramParcel.writeBundle(this.i);
      int m = this.j.size();
      paramParcel.writeInt(m);
      for (int n = 0; n < m; n++) {
        ((ParticipantEntity)this.j.get(n)).writeToParcel(paramParcel, paramInt);
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomEntity
 * JD-Core Version:    0.7.0.1
 */