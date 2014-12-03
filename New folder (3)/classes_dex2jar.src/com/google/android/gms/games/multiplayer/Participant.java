package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;

public abstract interface Participant
  extends Parcelable, b<Participant>
{
  public abstract int b();
  
  public abstract String c();
  
  public abstract int d();
  
  public abstract boolean e();
  
  public abstract String f();
  
  public abstract Uri g();
  
  public abstract Uri h();
  
  public abstract String i();
  
  public abstract Player j();
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.Participant
 * JD-Core Version:    0.7.0.1
 */