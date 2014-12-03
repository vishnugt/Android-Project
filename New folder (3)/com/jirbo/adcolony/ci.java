package com.jirbo.adcolony;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class ci
  extends di
{
  String a;
  OutputStream b;
  byte[] c = new byte[1024];
  int d = 0;
  int e;
  int f;
  
  ci(String paramString)
  {
    this.a = paramString;
    if (a.e != 0)
    {
      this.f = 23;
      this.e = this.f;
    }
    try
    {
      if ((a.c != null) && (a.c.f != null)) {
        a.c.f.a();
      }
      this.b = new FileOutputStream(paramString);
      return;
    }
    catch (IOException localIOException)
    {
      a(localIOException);
    }
  }
  
  private void a(IOException paramIOException)
  {
    aq.d.a("Error writing \"").a(this.a).b("\":");
    aq.d.b(paramIOException.toString());
    a();
  }
  
  private void d()
  {
    if ((this.d > 0) && (this.b != null)) {}
    try
    {
      this.b.write(this.c, 0, this.d);
      this.d = 0;
      this.b.flush();
      return;
    }
    catch (IOException localIOException)
    {
      this.d = 0;
      a(localIOException);
    }
  }
  
  final void a()
  {
    d();
    try
    {
      if (this.b != null)
      {
        this.b.close();
        this.b = null;
      }
      return;
    }
    catch (IOException localIOException)
    {
      this.b = null;
      a(localIOException);
    }
  }
  
  final void a(char paramChar)
  {
    this.c[this.d] = ((byte)(paramChar ^ this.e));
    this.e += this.f;
    int i = 1 + this.d;
    this.d = i;
    if (i == 1024) {
      d();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ci
 * JD-Core Version:    0.7.0.1
 */