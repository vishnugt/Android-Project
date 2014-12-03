package com.jirbo.adcolony;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class by
{
  public static String a = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx  x          xxxxxxx                          xxxx x                          xxxxx";
  public static String b = "0123456789ABCDEF";
  public static String c = "0123456789abcdef";
  
  public static String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramString.length();
    int j = 0;
    if (j < i)
    {
      char c1 = paramString.charAt(j);
      if ((c1 < '') && (a.charAt(c1) == ' ')) {
        localStringBuilder.append(c1);
      }
      for (;;)
      {
        j++;
        break;
        localStringBuilder.append('%');
        int k = 0xF & c1 >> '\004';
        int m = c1 & 0xF;
        if (k < 10) {
          localStringBuilder.append((char)(k + 48));
        }
        for (;;)
        {
          if (m >= 10) {
            break label140;
          }
          localStringBuilder.append((char)(m + 48));
          break;
          localStringBuilder.append((char)(-10 + (k + 65)));
        }
        label140:
        localStringBuilder.append((char)(-10 + (m + 65)));
      }
    }
    return localStringBuilder.toString();
  }
  
  static boolean a()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)a.a().getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo == null) {
      return false;
    }
    return localNetworkInfo.getType() == 1;
  }
  
  static boolean b()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)a.a().getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo == null) {
      return false;
    }
    int i = localNetworkInfo.getType();
    return (i == 0) || (i >= 2);
  }
  
  static boolean c()
  {
    return (a()) || (b());
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.by
 * JD-Core Version:    0.7.0.1
 */