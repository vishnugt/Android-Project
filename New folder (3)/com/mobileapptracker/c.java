package com.mobileapptracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class c
  extends BroadcastReceiver
{
  c(MobileAppTracker paramMobileAppTracker) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((MobileAppTracker.a(paramContext)) && (MobileAppTracker.a(this.a) > 0)) {}
    try
    {
      MobileAppTracker.b(this.a);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.mobileapptracker.c
 * JD-Core Version:    0.7.0.1
 */