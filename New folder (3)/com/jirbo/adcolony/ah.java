package com.jirbo.adcolony;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.telephony.TelephonyManager;

final class ah
{
  static int a()
  {
    Context localContext = a.a().getApplicationContext();
    a.a();
    return ((ActivityManager)localContext.getSystemService("activity")).getMemoryClass();
  }
  
  static String b()
  {
    try
    {
      String str = ((TelephonyManager)a.a().getSystemService("phone")).getDeviceId();
      return str;
    }
    catch (Exception localException) {}
    return "";
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ah
 * JD-Core Version:    0.7.0.1
 */