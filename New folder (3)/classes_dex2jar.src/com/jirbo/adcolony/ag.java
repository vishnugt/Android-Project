package com.jirbo.adcolony;

import java.io.File;
import java.io.IOException;

final class ag
{
  static byte[] a = new byte[1024];
  String b;
  
  ag(String paramString)
  {
    this.b = (a.c.f.d + paramString);
  }
  
  final ci a()
  {
    return new ci(this.b);
  }
  
  final void a(String paramString)
  {
    ci localci = a();
    int i = paramString.length();
    for (int j = 0; j < i; j++) {
      localci.a(paramString.charAt(j));
    }
    localci.a();
  }
  
  final bz b()
  {
    try
    {
      bz localbz = new bz(new ch(this.b));
      return localbz;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  final void c()
  {
    new File(this.b).delete();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ag
 * JD-Core Version:    0.7.0.1
 */