package com.supercell.titan;

import com.jirbo.adcolony.dn;
import com.jirbo.adcolony.dp;

final class e
  implements dp
{
  final String a;
  
  public e(String paramString)
  {
    this.a = paramString;
  }
  
  public final void a()
  {
    GameApp.getInstance().a(new g(this));
  }
  
  public final void a(dn paramdn)
  {
    AdColonyTitan.a(false);
    int i = paramdn.a;
    boolean bool = false;
    if (i == 4) {
      bool = true;
    }
    GameApp.getInstance().a(new f(this, bool));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.e
 * JD-Core Version:    0.7.0.1
 */