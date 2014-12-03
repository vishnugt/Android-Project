package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class dx
{
  public IBinder a;
  public int b;
  public int c = -1;
  public int d = 0;
  public int e = 0;
  public int f = 0;
  public int g = 0;
  
  private dx(int paramInt, IBinder paramIBinder)
  {
    this.b = paramInt;
    this.a = paramIBinder;
  }
  
  public final Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("popupLocationInfo.gravity", this.b);
    localBundle.putInt("popupLocationInfo.displayId", this.c);
    localBundle.putInt("popupLocationInfo.left", this.d);
    localBundle.putInt("popupLocationInfo.top", this.e);
    localBundle.putInt("popupLocationInfo.right", this.f);
    localBundle.putInt("popupLocationInfo.bottom", this.g);
    return localBundle;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dx
 * JD-Core Version:    0.7.0.1
 */