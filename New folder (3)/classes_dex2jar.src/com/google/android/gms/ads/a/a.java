package com.google.android.gms.ads.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.e;
import com.google.android.gms.common.g;
import com.google.android.gms.common.i;
import java.io.IOException;

public final class a
{
  /* Error */
  public static b a(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 16	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   3: invokestatic 19	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   6: if_acmpne +13 -> 19
    //   9: new 21	java/lang/IllegalStateException
    //   12: dup
    //   13: ldc 23
    //   15: invokespecial 27	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   18: athrow
    //   19: aload_0
    //   20: invokestatic 31	com/google/android/gms/ads/a/a:b	(Landroid/content/Context;)Lcom/google/android/gms/common/i;
    //   23: astore_1
    //   24: aload_1
    //   25: invokevirtual 36	com/google/android/gms/common/i:a	()Landroid/os/IBinder;
    //   28: invokestatic 41	com/google/android/gms/internal/eu:a	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/et;
    //   31: astore 5
    //   33: new 43	com/google/android/gms/ads/a/b
    //   36: dup
    //   37: aload 5
    //   39: invokeinterface 48 1 0
    //   44: aload 5
    //   46: iconst_1
    //   47: invokeinterface 51 2 0
    //   52: invokespecial 54	com/google/android/gms/ads/a/b:<init>	(Ljava/lang/String;Z)V
    //   55: astore 6
    //   57: aload_0
    //   58: aload_1
    //   59: invokevirtual 60	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   62: aload 6
    //   64: areturn
    //   65: astore 4
    //   67: new 62	java/io/IOException
    //   70: dup
    //   71: ldc 64
    //   73: invokespecial 65	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   76: athrow
    //   77: astore_3
    //   78: aload_0
    //   79: aload_1
    //   80: invokevirtual 60	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   83: aload_3
    //   84: athrow
    //   85: astore_2
    //   86: new 62	java/io/IOException
    //   89: dup
    //   90: ldc 67
    //   92: invokespecial 65	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	paramContext	Context
    //   23	57	1	locali	i
    //   85	1	2	localInterruptedException	java.lang.InterruptedException
    //   77	7	3	localObject	Object
    //   65	1	4	localRemoteException	android.os.RemoteException
    //   31	14	5	localet	com.google.android.gms.internal.et
    //   55	8	6	localb	b
    // Exception table:
    //   from	to	target	type
    //   24	57	65	android/os/RemoteException
    //   24	57	77	finally
    //   67	77	77	finally
    //   86	96	77	finally
    //   24	57	85	java/lang/InterruptedException
  }
  
  private static i b(Context paramContext)
  {
    try
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      i locali;
      Intent localIntent;
      throw new IOException("Connection failure");
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      try
      {
        g.b(paramContext);
        locali = new i();
        localIntent = new Intent("com.google.android.gms.ads.identifier.service.START");
        localIntent.setPackage("com.google.android.gms");
        if (!paramContext.bindService(localIntent, locali, 1)) {
          break label79;
        }
        return locali;
      }
      catch (e locale)
      {
        throw new IOException(locale);
      }
      localNameNotFoundException = localNameNotFoundException;
      throw new e(9);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.a.a
 * JD-Core Version:    0.7.0.1
 */