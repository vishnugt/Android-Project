package com.chartboost.sdk.impl;

import java.io.OutputStream;

public class aq
  extends ar
{
  private int a;
  private int b;
  private byte[] c = new byte[512];
  
  public int a()
  {
    return this.a;
  }
  
  public int a(OutputStream paramOutputStream)
  {
    paramOutputStream.write(this.c, 0, this.b);
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public int b()
  {
    return this.b;
  }
  
  void b(int paramInt)
  {
    int i = paramInt + this.a;
    if (i < this.c.length) {
      return;
    }
    int j = 2 * this.c.length;
    if (j <= i) {
      j = i + 128;
    }
    byte[] arrayOfByte = new byte[j];
    System.arraycopy(this.c, 0, arrayOfByte, 0, this.b);
    this.c = arrayOfByte;
  }
  
  public void write(int paramInt)
  {
    b(1);
    byte[] arrayOfByte = this.c;
    int i = this.a;
    this.a = (i + 1);
    arrayOfByte[i] = ((byte)(paramInt & 0xFF));
    this.b = Math.max(this.a, this.b);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    b(paramInt2);
    System.arraycopy(paramArrayOfByte, paramInt1, this.c, this.a, paramInt2);
    this.a = (paramInt2 + this.a);
    this.b = Math.max(this.a, this.b);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.aq
 * JD-Core Version:    0.7.0.1
 */