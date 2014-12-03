package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class ca
  extends cj
{
  private bx a;
  
  public ca(bx parambx)
  {
    this.a = parambx;
  }
  
  public final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    cr.a("onPostInitComplete can be called only once per call to getServiceFromBroker", this.a);
    this.a.a(paramInt, paramIBinder, paramBundle);
    this.a = null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ca
 * JD-Core Version:    0.7.0.1
 */