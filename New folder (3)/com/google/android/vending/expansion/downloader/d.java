package com.google.android.vending.expansion.downloader;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;

public final class d
  implements l
{
  j a = null;
  Messenger b;
  Context c;
  final Messenger d = new Messenger(new e(this));
  private Class<?> e;
  private boolean f;
  private ServiceConnection g = new f(this);
  
  public d(j paramj, Class<?> paramClass)
  {
    this.a = paramj;
    this.e = paramClass;
  }
  
  public final Messenger a()
  {
    return this.d;
  }
  
  public final void a(Context paramContext)
  {
    this.c = paramContext;
    Intent localIntent = new Intent(paramContext, this.e);
    localIntent.putExtra("EMH", this.d);
    if (paramContext.bindService(localIntent, this.g, 2)) {
      this.f = true;
    }
  }
  
  public final void b(Context paramContext)
  {
    if (this.f)
    {
      paramContext.unbindService(this.g);
      this.f = false;
    }
    this.c = null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.vending.expansion.downloader.d
 * JD-Core Version:    0.7.0.1
 */