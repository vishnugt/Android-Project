package com.supercell.titan;

import com.google.android.gms.ads.a.a;
import com.google.android.gms.common.e;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

final class i
  extends Thread
{
  public final void run()
  {
    try
    {
      ApplicationUtil.a(a.a(GameApp.getInstance()));
      ApplicationUtil.a.compareAndSet(false, true);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        ApplicationUtil.a(null);
      }
    }
    catch (e locale)
    {
      for (;;)
      {
        ApplicationUtil.a(null);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        ApplicationUtil.a(null);
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.i
 * JD-Core Version:    0.7.0.1
 */