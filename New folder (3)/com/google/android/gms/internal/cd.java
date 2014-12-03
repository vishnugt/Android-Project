package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;

public final class cd
  implements Handler.Callback
{
  private static final Object a = new Object();
  private static cd b;
  private final Context c;
  private final HashMap<String, ce> d = new HashMap();
  private final Handler e = new Handler(paramContext.getMainLooper(), this);
  
  private cd(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
  }
  
  public static cd a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null) {
        b = new cd(paramContext.getApplicationContext());
      }
      return b;
    }
  }
  
  public final boolean a(String paramString, bx<?>.cb parambx)
  {
    for (;;)
    {
      ce localce;
      synchronized (this.d)
      {
        localce = (ce)this.d.get(paramString);
        if (localce == null)
        {
          localce = new ce(this, paramString);
          localce.a(parambx);
          Intent localIntent1 = new Intent(paramString).setPackage("com.google.android.gms");
          localce.e = this.c.bindService(localIntent1, localce.b, 129);
          this.d.put(paramString, localce);
          boolean bool = localce.e;
          return bool;
        }
        this.e.removeMessages(0, localce);
        if (localce.b(parambx)) {
          throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + paramString);
        }
      }
      localce.a(parambx);
      switch (localce.d)
      {
      case 1: 
        parambx.onServiceConnected(localce.g, localce.f);
        break;
      case 2: 
        Intent localIntent2 = new Intent(paramString).setPackage("com.google.android.gms");
        localce.e = this.c.bindService(localIntent2, localce.b, 129);
      }
    }
  }
  
  public final void b(String paramString, bx<?>.cb parambx)
  {
    ce localce;
    synchronized (this.d)
    {
      localce = (ce)this.d.get(paramString);
      if (localce == null) {
        throw new IllegalStateException("Nonexistent connection status for service action: " + paramString);
      }
    }
    if (!localce.b(parambx)) {
      throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + paramString);
    }
    localce.c.remove(parambx);
    if (localce.c.isEmpty())
    {
      Message localMessage = this.e.obtainMessage(0, localce);
      this.e.sendMessageDelayed(localMessage, 5000L);
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    }
    ce localce = (ce)paramMessage.obj;
    synchronized (this.d)
    {
      if (localce.c.isEmpty())
      {
        this.c.unbindService(localce.b);
        this.d.remove(localce.a);
      }
      return true;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cd
 * JD-Core Version:    0.7.0.1
 */