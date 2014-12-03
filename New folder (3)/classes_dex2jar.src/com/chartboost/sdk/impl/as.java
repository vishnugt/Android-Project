package com.chartboost.sdk.impl;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class as
  extends ar
{
  private static bj<byte[]> g = new as.1(640);
  final byte[] a = new byte[16384];
  final char[] b = new char[16384];
  final List<byte[]> c = new ArrayList();
  final at d = new at();
  private final as.a e = new as.a();
  private final as.a f = new as.a();
  
  public as()
  {
    d();
  }
  
  public int a()
  {
    return this.e.b();
  }
  
  public int a(OutputStream paramOutputStream)
  {
    if (paramOutputStream == null) {
      throw new NullPointerException("out is null");
    }
    int i = -1;
    int j = 0;
    for (;;)
    {
      if (i >= this.c.size()) {
        return j;
      }
      byte[] arrayOfByte = b(i);
      int k = this.f.c(i);
      paramOutputStream.write(arrayOfByte, 0, k);
      j += k;
      i++;
    }
  }
  
  public void a(int paramInt)
  {
    this.e.a(paramInt);
  }
  
  public int b()
  {
    return this.f.b();
  }
  
  byte[] b(int paramInt)
  {
    if (paramInt < 0) {
      return this.a;
    }
    return (byte[])this.c.get(paramInt);
  }
  
  public void d()
  {
    this.e.a();
    this.f.a();
    for (int i = 0;; i++)
    {
      if (i >= this.c.size())
      {
        this.c.clear();
        return;
      }
      g.b((byte[])this.c.get(i));
    }
  }
  
  void e()
  {
    if (this.e.b() < this.f.b()) {
      if (this.e.b == 16384) {
        this.e.d();
      }
    }
    do
    {
      return;
      this.f.a(this.e);
    } while (this.f.b < 16384);
    this.c.add((byte[])g.c());
    this.f.d();
    this.e.a(this.f);
  }
  
  byte[] f()
  {
    return b(this.e.a);
  }
  
  public void write(int paramInt)
  {
    f()[this.e.c()] = ((byte)(paramInt & 0xFF));
    e();
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      if (paramInt2 <= 0) {
        return;
      }
      byte[] arrayOfByte = f();
      int i = Math.min(arrayOfByte.length - this.e.b, paramInt2);
      System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, this.e.b, i);
      this.e.b(i);
      paramInt2 -= i;
      paramInt1 += i;
      e();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.as
 * JD-Core Version:    0.7.0.1
 */