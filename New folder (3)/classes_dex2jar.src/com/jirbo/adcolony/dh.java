package com.jirbo.adcolony;

import android.os.Handler;
import android.os.Message;

final class dh
  extends Handler
{
  dh(cv paramcv)
  {
    a();
  }
  
  private void a()
  {
    sendMessageDelayed(obtainMessage(), 500L);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    a();
    if (this.a.c.isFinishing()) {}
    while (this.a.c.z == null) {
      return;
    }
    try
    {
      if ((this.a.Q != null) && (this.a.Q.a()) && (!this.a.c.z.isPlaying()))
      {
        this.a.Q = null;
        this.a.r = 0;
        if (this.a.c.z != null) {
          this.a.c.z.a();
        }
        this.a.c.l = true;
        this.a.c();
      }
      return;
    }
    finally {}
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dh
 * JD-Core Version:    0.7.0.1
 */