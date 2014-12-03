package com.supercell.titan;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;

public final class cr
{
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, Class<?> paramClass)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    String str = paramContext.getString(localApplicationInfo.labelRes);
    int i = localApplicationInfo.icon;
    Intent localIntent = new Intent(paramContext, paramClass);
    localIntent.setFlags(603979776);
    if (!paramString3.isEmpty()) {
      localIntent.putExtra("userId", paramString3);
    }
    PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, paramInt, localIntent, 0);
    Notification.Builder localBuilder = new Notification.Builder(paramContext).setContentIntent(localPendingIntent).setSmallIcon(i);
    if ((str != null) && (!str.isEmpty())) {
      localBuilder.setContentTitle(str);
    }
    if ((paramString1 != null) && (!paramString1.isEmpty()))
    {
      localBuilder.setContentText(paramString1);
      localBuilder.setTicker(paramString1);
    }
    if ((paramString2 != null) && (!paramString2.isEmpty())) {
      localBuilder.setSound(Uri.parse(paramString2));
    }
    Notification localNotification = localBuilder.getNotification();
    if ((paramString2 == null) || (paramString2.isEmpty())) {
      localNotification.defaults = (0x1 | localNotification.defaults);
    }
    localNotification.defaults = (0x6 | localNotification.defaults);
    localNotification.flags = (0x10 | localNotification.flags);
    NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
    if (localNotificationManager == null) {
      return;
    }
    try
    {
      localNotificationManager.notify(paramInt, localNotification);
      return;
    }
    catch (SecurityException localSecurityException) {}catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.cr
 * JD-Core Version:    0.7.0.1
 */