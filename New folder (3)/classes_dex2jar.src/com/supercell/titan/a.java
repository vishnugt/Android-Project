package com.supercell.titan;

import com.jirbo.adcolony.dl;
import java.util.ArrayList;

final class a
  implements Runnable
{
  a(GameApp paramGameApp, String paramString1, String paramString2, String[] paramArrayOfString) {}
  
  public final void run()
  {
    for (;;)
    {
      int i;
      try
      {
        dl.a(this.a, "version=" + this.b + ",store:google,skippable", this.c, this.d);
        AdColonyTitan.a(new d[this.d.length]);
        i = 0;
        if (i < this.d.length)
        {
          AdColonyTitan.a()[i] = new d(this.d[i]);
          d locald = AdColonyTitan.a()[i];
          if (!com.jirbo.adcolony.a.L.contains(locald)) {
            com.jirbo.adcolony.a.L.add(locald);
          }
        }
        else
        {
          AdColonyTitan.b();
          return;
        }
      }
      catch (Exception localException)
      {
        GameApp.debuggerException(localException);
        return;
      }
      i++;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.a
 * JD-Core Version:    0.7.0.1
 */