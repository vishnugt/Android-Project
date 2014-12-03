package com.chartboost.sdk.Libraries;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings.Secure;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.an;
import com.chartboost.sdk.impl.ao;
import java.util.UUID;

public class c
{
  private static String a = null;
  
  public static String a()
  {
    return b.b(c());
  }
  
  private static String b()
  {
    if (CBUtility.c()) {
      return null;
    }
    return b.b(b.a(f()));
  }
  
  private static byte[] c()
  {
    String str1 = d();
    if ((str1 == null) || ("9774d56d682e549c".equals(str1))) {
      str1 = e();
    }
    String str2 = b();
    ao localao = new ao();
    localao.a("uuid", str1);
    localao.a("macid", str2);
    return new an().a(localao);
  }
  
  private static String d()
  {
    if (CBUtility.c()) {
      return null;
    }
    return Settings.Secure.getString(Chartboost.sharedChartboost().getContext().getContentResolver(), "android_id");
  }
  
  private static String e()
  {
    if (a == null)
    {
      SharedPreferences localSharedPreferences = CBUtility.a();
      String str = localSharedPreferences.getString("cbUUID", null);
      a = str;
      if (str == null)
      {
        a = UUID.randomUUID().toString();
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        localEditor.putString("cbUUID", a);
        localEditor.commit();
      }
    }
    return a;
  }
  
  private static byte[] f()
  {
    byte[] arrayOfByte;
    try
    {
      String str = ((WifiManager)Chartboost.sharedChartboost().getContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
      String[] arrayOfString;
      int i;
      if ((str != null) && (!str.equals("")))
      {
        arrayOfString = str.split(":");
        arrayOfByte = new byte[6];
        i = 0;
      }
      while (i < arrayOfString.length)
      {
        arrayOfByte[i] = Integer.valueOf(Integer.parseInt(arrayOfString[i], 16)).byteValue();
        i++;
        continue;
        arrayOfByte = null;
      }
    }
    catch (Exception localException)
    {
      return null;
    }
    return arrayOfByte;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.c
 * JD-Core Version:    0.7.0.1
 */