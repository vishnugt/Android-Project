package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.multiplayer.e;

public abstract interface Room
  extends Parcelable, b<Room>, e
{
  public abstract String b();
  
  public abstract String c();
  
  public abstract long d();
  
  public abstract int e();
  
  public abstract String f();
  
  public abstract int g();
  
  public abstract Bundle h();
  
  public abstract int j();
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.Room
 * JD-Core Version:    0.7.0.1
 */