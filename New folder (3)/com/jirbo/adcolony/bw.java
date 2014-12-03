package com.jirbo.adcolony;

import android.app.Activity;
import java.io.PrintStream;

final class bw
  implements Runnable
{
  static String a = "MONITOR_MUTEX";
  static volatile bw b;
  static volatile long c;
  
  static void a()
  {
    synchronized (a)
    {
      c = System.currentTimeMillis();
      if (b == null)
      {
        a.g();
        b = new bw();
        new Thread(b).start();
      }
      return;
    }
  }
  
  public final void run()
  {
    a.a(a.e);
    aq.a.b("ADC Monitor Started.");
    a.c.a();
    int i = 0;
    if (!a.a().isFinishing())
    {
      a.i = false;
      a.c.f();
      long l;
      int k;
      if (a.i)
      {
        l = 50L;
        k = (int)((System.currentTimeMillis() - c) / 1000L);
        a.c.f();
        if (i == 0) {
          break label139;
        }
        if (k >= 10) {
          break label159;
        }
        if (k < 5)
        {
          a.c.a();
          a.g();
          i = 0;
        }
      }
      for (;;)
      {
        try
        {
          Thread.sleep(l);
        }
        catch (InterruptedException localInterruptedException) {}
        break;
        if (i != 0) {}
        for (int j = 2000;; j = 250)
        {
          l = j;
          break;
        }
        label139:
        if (k >= 5)
        {
          a.g();
          i = 1;
          a.c.b();
        }
      }
    }
    synchronized (a)
    {
      label159:
      b = null;
      if (i == 0) {
        a.c.b();
      }
      if (a.a().isFinishing())
      {
        g localg = a.c;
        new j(localg, localg);
        ck.a();
      }
      System.out.println("Exiting monitor");
      return;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.bw
 * JD-Core Version:    0.7.0.1
 */