package com.jirbo.adcolony;

import android.graphics.Bitmap;
import java.util.ArrayList;

public final class dz
  extends dn
{
  public dp e;
  
  public dz()
  {
    a.j = false;
    a.e();
  }
  
  public dz(String paramString)
  {
    a.e();
    this.b = paramString;
  }
  
  public final boolean a()
  {
    if (this.b == null)
    {
      this.b = a.c.d();
      if (this.b == null) {
        return false;
      }
    }
    return a.c.e(this.b);
  }
  
  final void b()
  {
    if (this.e != null) {
      this.e.a(this);
    }
    a.j();
    System.gc();
    if ((!a.j) && (!AdColonyBrowser.B))
    {
      for (int i = 0; i < a.J.size(); i++) {
        ((Bitmap)a.J.get(i)).recycle();
      }
      a.J.clear();
    }
    a.v = null;
    a.k = true;
  }
  
  final boolean c()
  {
    return false;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dz
 * JD-Core Version:    0.7.0.1
 */