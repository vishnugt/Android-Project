package com.jirbo.adcolony;

import android.os.Handler;
import android.os.Message;

public final class b
  extends Handler
{
  public final void a()
  {
    sendMessage(obtainMessage(1));
  }
  
  public final void b()
  {
    sendMessage(obtainMessage(0));
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    do
    {
      do
      {
        return;
        a.d("skip");
      } while (a.u == null);
      a.u.a = 1;
      a.u.b();
      return;
      ad localad = new ad();
      if (a.w.A.L) {
        localad.b("html5_endcard_loading_started", a.w.i);
      }
      if (a.w.A.L) {
        localad.b("html5_endcard_loading_finished", a.w.j);
      }
      if (a.w.A.L) {
        localad.a("html5_endcard_loading_time", a.w.n);
      }
      if (a.w.A.L) {
        localad.b("html5_endcard_loading_timeout", a.w.k);
      }
      localad.a("endcard_time_spent", a.w.o);
      localad.b("endcard_dissolved", a.w.l);
      localad.b("replay", ADCVideo.d);
      localad.b("reward", a.w.m);
      a.c.d.b("continue", localad);
      a.c.b.a();
    } while (a.u == null);
    a.u.b();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.b
 * JD-Core Version:    0.7.0.1
 */