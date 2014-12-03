package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import java.util.ArrayList;

final class by
  extends Handler
{
  public by(bx parambx, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what == 1) && (!this.a.e()))
    {
      ((bz)paramMessage.obj).b();
      return;
    }
    synchronized (bx.a(this.a))
    {
      this.a.f = false;
      if (paramMessage.what == 3)
      {
        this.a.a(new a(((Integer)paramMessage.obj).intValue(), null));
        return;
      }
    }
    if (paramMessage.what == 4) {
      synchronized (bx.b(this.a))
      {
        if ((this.a.e) && (this.a.d()) && (bx.b(this.a).contains(paramMessage.obj))) {
          ((c)paramMessage.obj).onConnected(this.a.i());
        }
        return;
      }
    }
    if ((paramMessage.what == 2) && (!this.a.d()))
    {
      ((bz)paramMessage.obj).b();
      return;
    }
    if ((paramMessage.what == 2) || (paramMessage.what == 1))
    {
      ((bz)paramMessage.obj).a();
      return;
    }
    Log.wtf("GmsClient", "Don't know how to handle this message.");
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.by
 * JD-Core Version:    0.7.0.1
 */