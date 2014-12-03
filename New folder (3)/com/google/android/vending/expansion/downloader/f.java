package com.google.android.vending.expansion.downloader;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;

final class f
  implements ServiceConnection
{
  f(d paramd) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.a.b = new Messenger(paramIBinder);
    this.a.a.a(this.a.b);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.a.b = null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.vending.expansion.downloader.f
 * JD-Core Version:    0.7.0.1
 */