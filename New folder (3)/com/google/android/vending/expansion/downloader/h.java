package com.google.android.vending.expansion.downloader;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public final class h
  implements k
{
  private Messenger a;
  
  public h(Messenger paramMessenger)
  {
    this.a = paramMessenger;
  }
  
  private void a(int paramInt, Bundle paramBundle)
  {
    Message localMessage = Message.obtain(null, paramInt);
    localMessage.setData(paramBundle);
    try
    {
      this.a.send(localMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
    }
  }
  
  public final void a()
  {
    a(2, new Bundle());
  }
  
  public final void a(Messenger paramMessenger)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("EMH", paramMessenger);
    a(6, localBundle);
  }
  
  public final void b()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("flags", 1);
    a(3, localBundle);
  }
  
  public final void c()
  {
    a(4, new Bundle());
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.vending.expansion.downloader.h
 * JD-Core Version:    0.7.0.1
 */