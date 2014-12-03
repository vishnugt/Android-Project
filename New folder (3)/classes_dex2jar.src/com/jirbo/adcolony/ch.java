package com.jirbo.adcolony;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

final class ch
  extends InputStream
{
  InputStream a;
  byte[] b = new byte[1024];
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  
  ch(String paramString)
  {
    if (a.e != 0)
    {
      this.h = 23;
      this.g = 23;
    }
    this.c = ((int)new File(paramString).length());
    this.a = new FileInputStream(paramString);
  }
  
  private void a()
  {
    for (this.e = 0; this.e == 0; this.e = this.a.read(this.b, 0, 1024)) {}
    for (int i = 0; i < this.e; i++)
    {
      this.b[i] = ((byte)(this.b[i] ^ this.g));
      this.g += this.h;
    }
    this.f = 0;
  }
  
  public final int available()
  {
    return this.e - this.f + this.a.available();
  }
  
  public final void close()
  {
    this.a.close();
  }
  
  public final void mark(int paramInt) {}
  
  public final boolean markSupported()
  {
    return false;
  }
  
  public final int read()
  {
    if (this.d == this.c) {
      return -1;
    }
    if (this.f >= this.e) {
      a();
    }
    this.d = (1 + this.d);
    byte[] arrayOfByte = this.b;
    int i = this.f;
    this.f = (i + 1);
    return arrayOfByte[i];
  }
  
  public final int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.d == this.c) {
      return -1;
    }
    int i = this.c - this.d;
    if (paramInt2 > i) {
      paramInt2 = i;
    }
    int j = 0;
    int k = paramInt2;
    int i1;
    for (int m = paramInt1; k > 0; m = i1)
    {
      if (this.f == this.e) {
        a();
      }
      if (k < this.e) {}
      for (int n = k;; n = this.e)
      {
        i1 = m;
        int i2 = 0;
        while (i2 < n)
        {
          int i3 = i1 + 1;
          byte[] arrayOfByte = this.b;
          int i4 = this.f;
          this.f = (i4 + 1);
          paramArrayOfByte[i1] = arrayOfByte[i4];
          i2++;
          i1 = i3;
        }
      }
      k -= n;
      j += n;
      this.d = (n + this.d);
    }
    return j;
  }
  
  public final void reset()
  {
    throw new IOException("ADCStreamReader does not support reset().");
  }
  
  public final long skip(long paramLong)
  {
    throw new IOException("ADCStreamReader does not support skip().");
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ch
 * JD-Core Version:    0.7.0.1
 */