package com.mobileapptracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class FacebookReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("mat_fb_intent", 0).edit();
    localEditor.putString("action", paramIntent.getAction());
    localEditor.commit();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.mobileapptracker.FacebookReceiver
 * JD-Core Version:    0.7.0.1
 */