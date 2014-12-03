package com.supercell.titan;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.vending.expansion.downloader.a.c;

public class TitanDownloaderAlarmReceiver
  extends BroadcastReceiver
{
  private final Class<?> a;
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      c.a(paramContext, paramIntent, this.a);
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.TitanDownloaderAlarmReceiver
 * JD-Core Version:    0.7.0.1
 */