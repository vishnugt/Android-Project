package com.supercell.titan;

import com.jirbo.adcolony.a;
import com.jirbo.adcolony.dp;
import com.jirbo.adcolony.dz;
import com.jirbo.adcolony.ea;
import com.jirbo.adcolony.eb;
import com.jirbo.adcolony.g;

final class c
  implements Runnable
{
  c(String paramString) {}
  
  public final void run()
  {
    dz localdz;
    try
    {
      AdColonyTitan.a(this.a);
      AdColonyTitan.a(true);
      localdz = new dz(AdColonyTitan.c());
      localdz.e = new e(AdColonyTitan.c());
      if (!localdz.a())
      {
        new ea(localdz, a.c);
        localdz.a = 2;
        if (localdz.e == null) {
          return;
        }
        localdz.e.a(localdz);
        return;
      }
      if (!a.k) {
        break label177;
      }
      new eb(localdz, a.c);
      a.k = false;
      localdz.d();
      if (!a.c.a(localdz))
      {
        if (localdz.e != null) {
          localdz.e.a(localdz);
        }
        a.k = true;
        return;
      }
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
      return;
    }
    if (localdz.e != null) {
      localdz.e.a();
    }
    label177:
    localdz.a = 4;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.c
 * JD-Core Version:    0.7.0.1
 */