package com.google.android.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public final class b
{
  static String a;
  private static GCMBroadcastReceiver b;
  
  static String a(Context paramContext, String paramString)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.google.android.gcm", 0);
    String str = localSharedPreferences.getString("regId", "");
    int i = e(paramContext);
    new StringBuilder("Saving regId on app version ").append(i).toString();
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putString("regId", paramString);
    localEditor.putInt("appVersion", i);
    localEditor.commit();
    return str;
  }
  
  static String a(String... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      throw new IllegalArgumentException("No senderIds");
    }
    StringBuilder localStringBuilder = new StringBuilder(paramVarArgs[0]);
    for (int i = 1; i < paramVarArgs.length; i++) {
      localStringBuilder.append(',').append(paramVarArgs[i]);
    }
    return localStringBuilder.toString();
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      if (b != null)
      {
        paramContext.unregisterReceiver(b);
        b = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  static void a(Context paramContext, int paramInt)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("com.google.android.gcm", 0).edit();
    localEditor.putInt("backoff_ms", paramInt);
    localEditor.commit();
  }
  
  public static void a(Context paramContext, String... paramVarArgs)
  {
    String str = a(paramVarArgs);
    new StringBuilder("Registering app ").append(paramContext.getPackageName()).append(" of senders ").append(str).toString();
    Intent localIntent = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent.setPackage("com.google.android.gsf");
    localIntent.putExtra("app", PendingIntent.getBroadcast(paramContext, 0, new Intent(), 0));
    localIntent.putExtra("sender", str);
    paramContext.startService(localIntent);
  }
  
  /* Error */
  static void b(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 82	com/google/android/gcm/b:b	Lcom/google/android/gcm/GCMBroadcastReceiver;
    //   6: ifnonnull +78 -> 84
    //   9: getstatic 138	com/google/android/gcm/b:a	Ljava/lang/String;
    //   12: ifnonnull +76 -> 88
    //   15: new 140	com/google/android/gcm/GCMBroadcastReceiver
    //   18: dup
    //   19: invokespecial 141	com/google/android/gcm/GCMBroadcastReceiver:<init>	()V
    //   22: putstatic 82	com/google/android/gcm/b:b	Lcom/google/android/gcm/GCMBroadcastReceiver;
    //   25: aload_0
    //   26: invokevirtual 97	android/content/Context:getPackageName	()Ljava/lang/String;
    //   29: astore 4
    //   31: new 143	android/content/IntentFilter
    //   34: dup
    //   35: ldc 145
    //   37: invokespecial 146	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   40: astore 5
    //   42: aload 5
    //   44: aload 4
    //   46: invokevirtual 149	android/content/IntentFilter:addCategory	(Ljava/lang/String;)V
    //   49: new 33	java/lang/StringBuilder
    //   52: dup
    //   53: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   56: aload 4
    //   58: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: ldc 152
    //   63: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: astore 6
    //   71: aload_0
    //   72: getstatic 82	com/google/android/gcm/b:b	Lcom/google/android/gcm/GCMBroadcastReceiver;
    //   75: aload 5
    //   77: aload 6
    //   79: aconst_null
    //   80: invokevirtual 156	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    //   83: pop
    //   84: ldc 2
    //   86: monitorexit
    //   87: return
    //   88: getstatic 138	com/google/android/gcm/b:a	Ljava/lang/String;
    //   91: invokestatic 162	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   94: invokevirtual 166	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   97: checkcast 140	com/google/android/gcm/GCMBroadcastReceiver
    //   100: putstatic 82	com/google/android/gcm/b:b	Lcom/google/android/gcm/GCMBroadcastReceiver;
    //   103: goto -78 -> 25
    //   106: astore_2
    //   107: new 33	java/lang/StringBuilder
    //   110: dup
    //   111: ldc 168
    //   113: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   116: getstatic 138	com/google/android/gcm/b:a	Ljava/lang/String;
    //   119: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: ldc 170
    //   124: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: ldc 140
    //   129: invokevirtual 173	java/lang/Class:getName	()Ljava/lang/String;
    //   132: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: ldc 175
    //   137: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   143: pop
    //   144: new 140	com/google/android/gcm/GCMBroadcastReceiver
    //   147: dup
    //   148: invokespecial 141	com/google/android/gcm/GCMBroadcastReceiver:<init>	()V
    //   151: putstatic 82	com/google/android/gcm/b:b	Lcom/google/android/gcm/GCMBroadcastReceiver;
    //   154: goto -129 -> 25
    //   157: astore_1
    //   158: ldc 2
    //   160: monitorexit
    //   161: aload_1
    //   162: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	paramContext	Context
    //   157	5	1	localObject	Object
    //   106	1	2	localException	java.lang.Exception
    //   29	28	4	str1	String
    //   40	36	5	localIntentFilter	android.content.IntentFilter
    //   69	9	6	str2	String
    // Exception table:
    //   from	to	target	type
    //   88	103	106	java/lang/Exception
    //   3	25	157	finally
    //   25	84	157	finally
    //   88	103	157	finally
    //   107	154	157	finally
  }
  
  public static String c(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.google.android.gcm", 0);
    String str = localSharedPreferences.getString("regId", "");
    int i = localSharedPreferences.getInt("appVersion", -2147483648);
    int j = e(paramContext);
    if ((i != -2147483648) && (i != j))
    {
      new StringBuilder("App version changed from ").append(i).append(" to ").append(j).append("; resetting registration id").toString();
      a(paramContext, "");
      str = "";
    }
    return str;
  }
  
  public static void d(Context paramContext)
  {
    new StringBuilder("resetting backoff for ").append(paramContext.getPackageName()).toString();
    a(paramContext, 3000);
  }
  
  private static int e(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException("Coult not get package name: " + localNameNotFoundException);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gcm.b
 * JD-Core Version:    0.7.0.1
 */