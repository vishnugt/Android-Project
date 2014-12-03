package com.jirbo.adcolony;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.UUID;

final class cm
{
  static byte[] a = new byte[1024];
  static StringBuilder b = new StringBuilder();
  
  static String a()
  {
    return UUID.randomUUID().toString();
  }
  
  static String a(double paramDouble)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(paramDouble, localStringBuilder);
    return localStringBuilder.toString();
  }
  
  static String a(String paramString1, String paramString2)
  {
    if (paramString1 != null) {}
    for (;;)
    {
      int i;
      int j;
      try
      {
        aq.a.a("Loading ").b(paramString1);
        FileInputStream localFileInputStream = new FileInputStream(paramString1);
        synchronized (a)
        {
          b.setLength(0);
          b.append(paramString2);
          i = localFileInputStream.read(a, 0, a.length);
          break label160;
          if (j < i)
          {
            b.append((char)a[j]);
            j++;
            continue;
          }
          i = localFileInputStream.read(a, 0, a.length);
          break label160;
          localFileInputStream.close();
          String str = b.toString();
          return str;
        }
        return "";
      }
      catch (IOException localIOException)
      {
        aq.d.a("Unable to load ").b(paramString1);
        return "";
      }
      label160:
      if (i != -1) {
        j = 0;
      }
    }
  }
  
  static void a(double paramDouble, StringBuilder paramStringBuilder)
  {
    if ((Double.isNaN(paramDouble)) || (Double.isInfinite(paramDouble))) {
      paramStringBuilder.append(paramDouble);
    }
    long l1;
    long l3;
    for (;;)
    {
      return;
      if (paramDouble < 0.0D)
      {
        paramDouble = -paramDouble;
        paramStringBuilder.append('-');
      }
      l1 = Math.pow(10.0D, 2.0D);
      long l2 = Math.round(paramDouble * l1);
      paramStringBuilder.append(l2 / l1);
      paramStringBuilder.append('.');
      l3 = l2 % l1;
      if (l3 != 0L) {
        break;
      }
      for (int i = 0; i < 2; i++) {
        paramStringBuilder.append('0');
      }
    }
    for (long l4 = l3 * 10L; l4 < l1; l4 *= 10L) {
      paramStringBuilder.append('0');
    }
    paramStringBuilder.append(l3);
  }
  
  static boolean a(String paramString)
  {
    try
    {
      a.a().getApplication().getPackageManager().getApplicationInfo(paramString, 0);
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  static double b()
  {
    return System.currentTimeMillis() / 1000.0D;
  }
  
  static String b(String paramString)
  {
    for (;;)
    {
      char c;
      int i1;
      int i2;
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
        localMessageDigest.update(paramString.getBytes("iso-8859-1"), 0, paramString.length());
        byte[] arrayOfByte = localMessageDigest.digest();
        StringBuilder localStringBuilder = new StringBuilder();
        int i = arrayOfByte.length;
        int j = 0;
        if (j < i)
        {
          int k = arrayOfByte[j];
          m = 0xF & k >>> 4;
          n = 0;
          break label123;
          localStringBuilder.append(c);
          i1 = k & 0xF;
          i2 = n + 1;
          if (n > 0) {
            j++;
          }
        }
        else
        {
          String str = localStringBuilder.toString();
          return str;
        }
      }
      catch (Exception localException)
      {
        return null;
      }
      int n = i2;
      int m = i1;
      label123:
      if ((m >= 0) && (m <= 9)) {
        c = (char)(m + 48);
      } else {
        c = (char)(97 + (m - 10));
      }
    }
  }
  
  static String c()
  {
    return a.a().getPackageName();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.cm
 * JD-Core Version:    0.7.0.1
 */