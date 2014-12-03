package com.jirbo.adcolony;

import android.graphics.Bitmap;
import java.util.ArrayList;

public final class dx
  extends dn
{
  dp e;
  boolean f = false;
  boolean g = false;
  
  public dx()
  {
    a.j = false;
    a.e();
  }
  
  final void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      if (a.c.a(this))
      {
        if (this.e != null) {
          this.e.a();
        }
        this.a = 4;
      }
    }
    for (;;)
    {
      if ((this.a != 4) && (this.e != null)) {
        this.e.a(this);
      }
      return;
      this.a = 3;
      continue;
      this.a = 1;
    }
  }
  
  public final boolean a()
  {
    if (this.b == null)
    {
      this.b = a.c.e();
      if (this.b == null) {
        return false;
      }
    }
    return a.c.f(this.b);
  }
  
  final void b()
  {
    String str3;
    if ((this.a == 4) && (this.g))
    {
      String str1 = e();
      String str2 = f();
      str3 = str2 + " " + str1;
      if (!"Result".equals("Confirmation")) {
        break label149;
      }
    }
    label149:
    for (a.t = new cp(str3, this);; a.t = new cq(str3, this))
    {
      if (this.e != null) {
        this.e.a(this);
      }
      a.j();
      if ((a.j) || (AdColonyBrowser.B)) {
        break label171;
      }
      for (int i = 0; i < a.J.size(); i++) {
        ((Bitmap)a.J.get(i)).recycle();
      }
    }
    a.J.clear();
    label171:
    a.v = null;
    if (!this.g) {
      a.k = true;
    }
    System.gc();
  }
  
  final boolean c()
  {
    return true;
  }
  
  public final String e()
  {
    if (!d()) {
      return "";
    }
    return this.c.j.d;
  }
  
  public final int f()
  {
    if (!d()) {
      return 0;
    }
    return this.c.j.c;
  }
  
  public final int g()
  {
    if (!d()) {
      return 0;
    }
    return this.c.j.f;
  }
  
  public final int h()
  {
    if (!d()) {
      return 0;
    }
    return this.c.j.f - a.c.d(this.c.j.d);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dx
 * JD-Core Version:    0.7.0.1
 */