package com.mobileapptracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.net.URLDecoder;

public class Tracker
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent != null) {}
    try
    {
      if (paramIntent.getAction().equals("com.android.vending.INSTALL_REFERRER"))
      {
        String str1 = paramIntent.getStringExtra("referrer");
        if (str1 != null)
        {
          String str2 = URLDecoder.decode(str1, "UTF-8");
          new StringBuilder("MAT received referrer ").append(str2).toString();
          paramContext.getSharedPreferences("mat_referrer", 0).edit().putString("referrer", str2).commit();
        }
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.mobileapptracker.Tracker
 * JD-Core Version:    0.7.0.1
 */