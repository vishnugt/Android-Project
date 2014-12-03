package com.supercell.clashofclans;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.supercell.titan.cr;

public class TimeAlarm
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    if (localBundle != null)
    {
      String str1 = localBundle.getString("msg");
      String str2 = localBundle.getString("snd");
      int i = localBundle.getInt("id");
      cr.a(paramContext, str1, str2, i, localBundle.getString("userId"), GameApp.class);
      com.supercell.titan.GameApp.cancelNotification(i);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.clashofclans.TimeAlarm
 * JD-Core Version:    0.7.0.1
 */