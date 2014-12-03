package com.chartboost.sdk.impl;

import java.io.Serializable;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ba
  implements Serializable, Comparable<ba>
{
  static final Logger a = Logger.getLogger("org.bson.ObjectId");
  private static AtomicInteger f = new AtomicInteger(new Random().nextInt());
  private static final int g;
  final int b;
  final int c;
  final int d;
  boolean e;
  
  static
  {
    for (;;)
    {
      try
      {
        localStringBuilder1 = new StringBuilder();
        localEnumeration = NetworkInterface.getNetworkInterfaces();
        if (localEnumeration.hasMoreElements()) {
          continue;
        }
        int i1 = localStringBuilder1.toString().hashCode();
        j = i1 << 16;
      }
      catch (Throwable localThrowable)
      {
        StringBuilder localStringBuilder1;
        Enumeration localEnumeration;
        int k;
        ClassLoader localClassLoader;
        StringBuilder localStringBuilder2;
        int n;
        a.log(Level.WARNING, localThrowable.getMessage(), localThrowable);
        int i = new Random().nextInt();
        int j = i << 16;
        continue;
        int m = 0;
        continue;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
      a.fine("machine piece post: " + Integer.toHexString(j));
      k = new Random().nextInt();
      localClassLoader = ba.class.getClassLoader();
      if (localClassLoader == null) {
        continue;
      }
      m = System.identityHashCode(localClassLoader);
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(Integer.toHexString(k));
      localStringBuilder2.append(Integer.toHexString(m));
      n = 0xFFFF & localStringBuilder2.toString().hashCode();
      a.fine("process piece: " + Integer.toHexString(n));
      g = n | j;
      a.fine("machine : " + Integer.toHexString(g));
      return;
      localStringBuilder1.append(((NetworkInterface)localEnumeration.nextElement()).toString());
    }
  }
  
  public ba()
  {
    this.b = ((int)(System.currentTimeMillis() / 1000L));
    this.c = g;
    this.d = f.getAndIncrement();
    this.e = true;
  }
  
  public ba(int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = false;
  }
  
  public ba(String paramString)
  {
    this(paramString, false);
  }
  
  public ba(String paramString, boolean paramBoolean)
  {
    if (!a(paramString)) {
      throw new IllegalArgumentException("invalid ObjectId [" + paramString + "]");
    }
    if (paramBoolean) {
      paramString = b(paramString);
    }
    byte[] arrayOfByte = new byte[12];
    for (int i = 0;; i++)
    {
      if (i >= arrayOfByte.length)
      {
        ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
        this.b = localByteBuffer.getInt();
        this.c = localByteBuffer.getInt();
        this.d = localByteBuffer.getInt();
        this.e = false;
        return;
      }
      arrayOfByte[i] = ((byte)Integer.parseInt(paramString.substring(i * 2, 2 + i * 2), 16));
    }
  }
  
  public static ba a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof ba)) {
      return (ba)paramObject;
    }
    if ((paramObject instanceof String))
    {
      String str = paramObject.toString();
      if (a(str)) {
        return new ba(str);
      }
    }
    return null;
  }
  
  static String a(String paramString, int paramInt)
  {
    return paramString.substring(paramInt * 2, 2 + paramInt * 2);
  }
  
  public static boolean a(String paramString)
  {
    if (paramString == null) {}
    int i;
    do
    {
      return false;
      i = paramString.length();
    } while (i != 24);
    for (int j = 0;; j++)
    {
      if (j >= i) {
        return true;
      }
      int k = paramString.charAt(j);
      if (((k < 48) || (k > 57)) && ((k < 97) || (k > 102)) && ((k < 65) || (k > 70))) {
        break;
      }
    }
  }
  
  public static String b(String paramString)
  {
    if (!a(paramString)) {
      throw new IllegalArgumentException("invalid object id: " + paramString);
    }
    StringBuilder localStringBuilder = new StringBuilder(24);
    int i = 7;
    if (i < 0) {}
    for (int j = 11;; j--)
    {
      if (j < 8)
      {
        return localStringBuilder.toString();
        localStringBuilder.append(a(paramString, i));
        i--;
        break;
      }
      localStringBuilder.append(a(paramString, j));
    }
  }
  
  int a(int paramInt1, int paramInt2)
  {
    long l = (0xFFFFFFFF & paramInt1) - (0xFFFFFFFF & paramInt2);
    if (l < -2147483648L) {
      return -2147483648;
    }
    if (l > 2147483647L) {
      return 2147483647;
    }
    return (int)l;
  }
  
  public int a(ba paramba)
  {
    int i;
    if (paramba == null) {
      i = -1;
    }
    do
    {
      do
      {
        return i;
        i = a(this.b, paramba.b);
      } while (i != 0);
      i = a(this.c, paramba.c);
    } while (i != 0);
    return a(this.d, paramba.d);
  }
  
  public String a()
  {
    byte[] arrayOfByte = b();
    StringBuilder localStringBuilder = new StringBuilder(24);
    for (int i = 0;; i++)
    {
      if (i >= arrayOfByte.length) {
        return localStringBuilder.toString();
      }
      String str = Integer.toHexString(0xFF & arrayOfByte[i]);
      if (str.length() == 1) {
        localStringBuilder.append("0");
      }
      localStringBuilder.append(str);
    }
  }
  
  public byte[] b()
  {
    byte[] arrayOfByte = new byte[12];
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
    localByteBuffer.putInt(this.b);
    localByteBuffer.putInt(this.c);
    localByteBuffer.putInt(this.d);
    return arrayOfByte;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public int e()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ba localba;
    do
    {
      return true;
      localba = a(paramObject);
      if (localba == null) {
        return false;
      }
    } while ((this.b == localba.b) && (this.c == localba.c) && (this.d == localba.d));
    return false;
  }
  
  public int hashCode()
  {
    return this.b + 111 * this.c + 17 * this.d;
  }
  
  public String toString()
  {
    return a();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.ba
 * JD-Core Version:    0.7.0.1
 */