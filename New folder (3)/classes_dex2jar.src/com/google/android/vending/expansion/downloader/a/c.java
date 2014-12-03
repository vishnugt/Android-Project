package com.google.android.vending.expansion.downloader.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.vending.expansion.downloader.i;
import com.google.android.vending.expansion.downloader.k;

public abstract class c
  extends a
  implements k
{
  public static int a(Context paramContext, PendingIntent paramPendingIntent, Class<?> paramClass)
  {
    int i = 1;
    int j = 0;
    String str1 = paramContext.getPackageName();
    String str2 = paramClass.getName();
    PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
    d locald = d.a(paramContext);
    int k;
    if (locald.d != localPackageInfo.versionCode)
    {
      k = i;
      label53:
      if (k == 0) {
        break label200;
      }
    }
    for (;;)
    {
      if (locald.e == 0)
      {
        b[] arrayOfb = locald.b();
        if (arrayOfb != null)
        {
          int m = arrayOfb.length;
          label83:
          if (j < m)
          {
            b localb = arrayOfb[j];
            if (i.a(paramContext, localb.c, localb.e)) {
              break label152;
            }
            locald.a();
          }
        }
      }
      for (i = 2;; i = 2) {
        switch (i)
        {
        default: 
          return i;
          k = 0;
          break label53;
          label152:
          j++;
          break label83;
        }
      }
      Intent localIntent = new Intent();
      localIntent.setClassName(str1, str2);
      localIntent.putExtra("EPI", paramPendingIntent);
      paramContext.startService(localIntent);
      return i;
      label200:
      i = 0;
    }
  }
  
  public static int a(Context paramContext, Intent paramIntent, Class<?> paramClass)
  {
    return a(paramContext, (PendingIntent)paramIntent.getParcelableExtra("EPI"), paramClass);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.vending.expansion.downloader.a.c
 * JD-Core Version:    0.7.0.1
 */