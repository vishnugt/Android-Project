package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

public final class cf
  implements ServiceConnection
{
  public cf(ce paramce) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (cd.a(this.a.h))
    {
      this.a.f = paramIBinder;
      this.a.g = paramComponentName;
      Iterator localIterator = this.a.c.iterator();
      if (localIterator.hasNext()) {
        ((cb)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
    this.a.d = 1;
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (cd.a(this.a.h))
    {
      this.a.f = null;
      this.a.g = paramComponentName;
      Iterator localIterator = this.a.c.iterator();
      if (localIterator.hasNext()) {
        ((cb)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
    }
    this.a.d = 2;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cf
 * JD-Core Version:    0.7.0.1
 */