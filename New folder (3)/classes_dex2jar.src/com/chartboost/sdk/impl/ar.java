package com.chartboost.sdk.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class ar
  extends OutputStream
{
  public abstract int a();
  
  public abstract int a(OutputStream paramOutputStream);
  
  public void a(double paramDouble)
  {
    a(Double.doubleToRawLongBits(paramDouble));
  }
  
  public abstract void a(int paramInt);
  
  public void a(int paramInt1, int paramInt2)
  {
    int i = a();
    a(paramInt1);
    c(paramInt2);
    a(i);
  }
  
  public void a(long paramLong)
  {
    write((byte)(int)(0xFF & paramLong >> 0));
    write((byte)(int)(0xFF & paramLong >> 8));
    write((byte)(int)(0xFF & paramLong >> 16));
    write((byte)(int)(0xFF & paramLong >> 24));
    write((byte)(int)(0xFF & paramLong >> 32));
    write((byte)(int)(0xFF & paramLong >> 40));
    write((byte)(int)(0xFF & paramLong >> 48));
    write((byte)(int)(0xFF & paramLong >> 56));
  }
  
  public abstract int b();
  
  public void c(int paramInt)
  {
    write(paramInt >> 0);
    write(paramInt >> 8);
    write(paramInt >> 16);
    write(paramInt >> 24);
  }
  
  public byte[] c()
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(b());
      a(localByteArrayOutputStream);
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("should be impossible", localIOException);
    }
  }
  
  public void d(int paramInt)
  {
    write(paramInt >> 24);
    write(paramInt >> 16);
    write(paramInt >> 8);
    write(paramInt);
  }
  
  public String toString()
  {
    return getClass().getName() + " size: " + b() + " pos: " + a();
  }
  
  public abstract void write(int paramInt);
  
  public abstract void write(byte[] paramArrayOfByte);
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.ar
 * JD-Core Version:    0.7.0.1
 */