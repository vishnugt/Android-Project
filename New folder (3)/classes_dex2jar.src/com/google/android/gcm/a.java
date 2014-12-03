package com.google.android.gcm;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class a
  extends IntentService
{
  private static PowerManager.WakeLock a;
  private static final Object b = a.class;
  private static int d = 0;
  private static final Random e = new Random();
  private static final int f = (int)TimeUnit.SECONDS.toMillis(3600L);
  private static final String g = Long.toBinaryString(e.nextLong());
  private final String[] c;
  
  protected a()
  {
    this(d("DynamicSenderIds"), null);
  }
  
  private a(String paramString, String[] paramArrayOfString)
  {
    super(paramString);
    this.c = paramArrayOfString;
  }
  
  public a(String... paramVarArgs)
  {
    this(d(b.a(paramVarArgs)), paramVarArgs);
  }
  
  static void a(Context paramContext, Intent paramIntent, String paramString)
  {
    synchronized (b)
    {
      if (a == null) {
        a = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "GCM_LIB");
      }
      a.acquire();
      paramIntent.setClassName(paramContext, paramString);
      paramContext.startService(paramIntent);
      return;
    }
  }
  
  private static String d(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("GCMIntentService-").append(paramString).append("-");
    int i = 1 + d;
    d = i;
    String str = i;
    new StringBuilder("Intent service name: ").append(str).toString();
    return str;
  }
  
  protected abstract void a();
  
  protected abstract void a(Context paramContext, Intent paramIntent);
  
  protected boolean a(String paramString)
  {
    return true;
  }
  
  protected abstract void b(String paramString);
  
  protected abstract void c(String paramString);
  
  /* Error */
  public final void onHandleIntent(Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 139	com/google/android/gcm/a:getApplicationContext	()Landroid/content/Context;
    //   4: astore 5
    //   6: aload_1
    //   7: invokevirtual 142	android/content/Intent:getAction	()Ljava/lang/String;
    //   10: astore 6
    //   12: aload 6
    //   14: ldc 144
    //   16: invokevirtual 150	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   19: ifeq +354 -> 373
    //   22: aload 5
    //   24: invokestatic 153	com/google/android/gcm/b:b	(Landroid/content/Context;)V
    //   27: aload_1
    //   28: ldc 155
    //   30: invokevirtual 158	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   33: astore 27
    //   35: aload_1
    //   36: ldc 160
    //   38: invokevirtual 158	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   41: astore 28
    //   43: aload_1
    //   44: ldc 162
    //   46: invokevirtual 158	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   49: astore 29
    //   51: new 111	java/lang/StringBuilder
    //   54: dup
    //   55: ldc 164
    //   57: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   60: aload 27
    //   62: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: ldc 166
    //   67: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: aload 28
    //   72: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: ldc 168
    //   77: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: aload 29
    //   82: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: pop
    //   89: aload 27
    //   91: ifnull +46 -> 137
    //   94: aload 5
    //   96: invokestatic 170	com/google/android/gcm/b:d	(Landroid/content/Context;)V
    //   99: aload 5
    //   101: aload 27
    //   103: invokestatic 173	com/google/android/gcm/b:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   106: pop
    //   107: aload_0
    //   108: aload 27
    //   110: invokevirtual 175	com/google/android/gcm/a:c	(Ljava/lang/String;)V
    //   113: getstatic 21	com/google/android/gcm/a:b	Ljava/lang/Object;
    //   116: astore 15
    //   118: aload 15
    //   120: monitorenter
    //   121: getstatic 78	com/google/android/gcm/a:a	Landroid/os/PowerManager$WakeLock;
    //   124: ifnull +9 -> 133
    //   127: getstatic 78	com/google/android/gcm/a:a	Landroid/os/PowerManager$WakeLock;
    //   130: invokevirtual 178	android/os/PowerManager$WakeLock:release	()V
    //   133: aload 15
    //   135: monitorexit
    //   136: return
    //   137: aload 29
    //   139: ifnull +46 -> 185
    //   142: aload 5
    //   144: invokestatic 170	com/google/android/gcm/b:d	(Landroid/content/Context;)V
    //   147: aload 5
    //   149: ldc 180
    //   151: invokestatic 173	com/google/android/gcm/b:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   154: pop
    //   155: aload_0
    //   156: invokevirtual 182	com/google/android/gcm/a:a	()V
    //   159: goto -46 -> 113
    //   162: astore_2
    //   163: getstatic 21	com/google/android/gcm/a:b	Ljava/lang/Object;
    //   166: astore_3
    //   167: aload_3
    //   168: monitorenter
    //   169: getstatic 78	com/google/android/gcm/a:a	Landroid/os/PowerManager$WakeLock;
    //   172: ifnull +9 -> 181
    //   175: getstatic 78	com/google/android/gcm/a:a	Landroid/os/PowerManager$WakeLock;
    //   178: invokevirtual 178	android/os/PowerManager$WakeLock:release	()V
    //   181: aload_3
    //   182: monitorexit
    //   183: aload_2
    //   184: athrow
    //   185: new 111	java/lang/StringBuilder
    //   188: dup
    //   189: ldc 184
    //   191: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   194: aload 28
    //   196: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   202: pop
    //   203: ldc 186
    //   205: aload 28
    //   207: invokevirtual 150	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   210: ifeq +154 -> 364
    //   213: aload_0
    //   214: aload 28
    //   216: invokevirtual 188	com/google/android/gcm/a:a	(Ljava/lang/String;)Z
    //   219: pop
    //   220: aload 5
    //   222: ldc 190
    //   224: iconst_0
    //   225: invokevirtual 194	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   228: ldc 196
    //   230: sipush 3000
    //   233: invokeinterface 202 3 0
    //   238: istore 34
    //   240: iload 34
    //   242: iconst_2
    //   243: idiv
    //   244: getstatic 30	com/google/android/gcm/a:e	Ljava/util/Random;
    //   247: iload 34
    //   249: invokevirtual 206	java/util/Random:nextInt	(I)I
    //   252: iadd
    //   253: istore 35
    //   255: new 111	java/lang/StringBuilder
    //   258: dup
    //   259: ldc 208
    //   261: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   264: iload 35
    //   266: invokevirtual 123	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   269: ldc 210
    //   271: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: iload 34
    //   276: invokevirtual 123	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   279: ldc 212
    //   281: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   284: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   287: pop
    //   288: new 101	android/content/Intent
    //   291: dup
    //   292: ldc 214
    //   294: invokespecial 215	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   297: astore 37
    //   299: aload 37
    //   301: ldc 217
    //   303: getstatic 56	com/google/android/gcm/a:g	Ljava/lang/String;
    //   306: invokevirtual 221	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   309: pop
    //   310: aload 5
    //   312: iconst_0
    //   313: aload 37
    //   315: iconst_0
    //   316: invokestatic 227	android/app/PendingIntent:getBroadcast	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   319: astore 39
    //   321: aload 5
    //   323: ldc 229
    //   325: invokevirtual 86	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   328: checkcast 231	android/app/AlarmManager
    //   331: iconst_3
    //   332: invokestatic 236	android/os/SystemClock:elapsedRealtime	()J
    //   335: iload 35
    //   337: i2l
    //   338: ladd
    //   339: aload 39
    //   341: invokevirtual 240	android/app/AlarmManager:set	(IJLandroid/app/PendingIntent;)V
    //   344: iload 34
    //   346: getstatic 44	com/google/android/gcm/a:f	I
    //   349: if_icmpge -236 -> 113
    //   352: aload 5
    //   354: iload 34
    //   356: iconst_2
    //   357: imul
    //   358: invokestatic 243	com/google/android/gcm/b:a	(Landroid/content/Context;I)V
    //   361: goto -248 -> 113
    //   364: aload_0
    //   365: aload 28
    //   367: invokevirtual 245	com/google/android/gcm/a:b	(Ljava/lang/String;)V
    //   370: goto -257 -> 113
    //   373: aload 6
    //   375: ldc 247
    //   377: invokevirtual 150	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   380: ifeq +124 -> 504
    //   383: aload_1
    //   384: ldc 249
    //   386: invokevirtual 158	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   389: astore 20
    //   391: aload 20
    //   393: ifnull +101 -> 494
    //   396: aload 20
    //   398: ldc 251
    //   400: invokevirtual 150	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   403: ifeq +69 -> 472
    //   406: aload_1
    //   407: ldc 253
    //   409: invokevirtual 158	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   412: astore 22
    //   414: aload 22
    //   416: ifnull -303 -> 113
    //   419: aload 22
    //   421: invokestatic 259	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   424: istore 25
    //   426: new 111	java/lang/StringBuilder
    //   429: dup
    //   430: ldc_w 261
    //   433: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   436: iload 25
    //   438: invokevirtual 123	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   441: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   444: pop
    //   445: goto -332 -> 113
    //   448: astore 23
    //   450: new 111	java/lang/StringBuilder
    //   453: dup
    //   454: ldc_w 263
    //   457: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   460: aload 22
    //   462: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   465: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   468: pop
    //   469: goto -356 -> 113
    //   472: new 111	java/lang/StringBuilder
    //   475: dup
    //   476: ldc_w 265
    //   479: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   482: aload 20
    //   484: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   487: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   490: pop
    //   491: goto -378 -> 113
    //   494: aload_0
    //   495: aload 5
    //   497: aload_1
    //   498: invokevirtual 267	com/google/android/gcm/a:a	(Landroid/content/Context;Landroid/content/Intent;)V
    //   501: goto -388 -> 113
    //   504: aload 6
    //   506: ldc 214
    //   508: invokevirtual 150	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   511: ifeq -398 -> 113
    //   514: aload_1
    //   515: ldc 217
    //   517: invokevirtual 158	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   520: astore 7
    //   522: getstatic 56	com/google/android/gcm/a:g	Ljava/lang/String;
    //   525: aload 7
    //   527: invokevirtual 150	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   530: ifne +54 -> 584
    //   533: new 111	java/lang/StringBuilder
    //   536: dup
    //   537: ldc_w 269
    //   540: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   543: aload 7
    //   545: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   548: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   551: pop
    //   552: getstatic 21	com/google/android/gcm/a:b	Ljava/lang/Object;
    //   555: astore 18
    //   557: aload 18
    //   559: monitorenter
    //   560: getstatic 78	com/google/android/gcm/a:a	Landroid/os/PowerManager$WakeLock;
    //   563: ifnull +9 -> 572
    //   566: getstatic 78	com/google/android/gcm/a:a	Landroid/os/PowerManager$WakeLock;
    //   569: invokevirtual 178	android/os/PowerManager$WakeLock:release	()V
    //   572: aload 18
    //   574: monitorexit
    //   575: return
    //   576: astore 19
    //   578: aload 18
    //   580: monitorexit
    //   581: aload 19
    //   583: athrow
    //   584: aload 5
    //   586: invokestatic 272	com/google/android/gcm/b:c	(Landroid/content/Context;)Ljava/lang/String;
    //   589: invokevirtual 276	java/lang/String:length	()I
    //   592: istore 8
    //   594: iconst_0
    //   595: istore 9
    //   597: iload 8
    //   599: ifle +6 -> 605
    //   602: iconst_1
    //   603: istore 9
    //   605: iload 9
    //   607: ifeq +80 -> 687
    //   610: new 111	java/lang/StringBuilder
    //   613: dup
    //   614: ldc_w 278
    //   617: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   620: aload 5
    //   622: invokevirtual 281	android/content/Context:getPackageName	()Ljava/lang/String;
    //   625: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   628: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   631: pop
    //   632: new 101	android/content/Intent
    //   635: dup
    //   636: ldc_w 283
    //   639: invokespecial 215	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   642: astore 11
    //   644: aload 11
    //   646: ldc_w 285
    //   649: invokevirtual 289	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   652: pop
    //   653: aload 11
    //   655: ldc_w 291
    //   658: aload 5
    //   660: iconst_0
    //   661: new 101	android/content/Intent
    //   664: dup
    //   665: invokespecial 292	android/content/Intent:<init>	()V
    //   668: iconst_0
    //   669: invokestatic 227	android/app/PendingIntent:getBroadcast	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   672: invokevirtual 295	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   675: pop
    //   676: aload 5
    //   678: aload 11
    //   680: invokevirtual 109	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   683: pop
    //   684: goto -571 -> 113
    //   687: aload_0
    //   688: getfield 69	com/google/android/gcm/a:c	[Ljava/lang/String;
    //   691: ifnonnull +14 -> 705
    //   694: new 297	java/lang/IllegalStateException
    //   697: dup
    //   698: ldc_w 299
    //   701: invokespecial 300	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   704: athrow
    //   705: aload 5
    //   707: aload_0
    //   708: getfield 69	com/google/android/gcm/a:c	[Ljava/lang/String;
    //   711: invokestatic 303	com/google/android/gcm/b:a	(Landroid/content/Context;[Ljava/lang/String;)V
    //   714: goto -601 -> 113
    //   717: astore 16
    //   719: aload 15
    //   721: monitorexit
    //   722: aload 16
    //   724: athrow
    //   725: astore 4
    //   727: aload_3
    //   728: monitorexit
    //   729: aload 4
    //   731: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	732	0	this	a
    //   0	732	1	paramIntent	Intent
    //   162	22	2	localObject1	Object
    //   725	5	4	localObject3	Object
    //   4	702	5	localContext	Context
    //   10	495	6	str1	String
    //   520	24	7	str2	String
    //   592	6	8	i	int
    //   595	11	9	j	int
    //   642	37	11	localIntent1	Intent
    //   717	6	16	localObject5	Object
    //   576	6	19	localObject7	Object
    //   389	94	20	str3	String
    //   412	49	22	str4	String
    //   448	1	23	localNumberFormatException	java.lang.NumberFormatException
    //   424	13	25	k	int
    //   33	76	27	str5	String
    //   41	325	28	str6	String
    //   49	89	29	str7	String
    //   238	120	34	m	int
    //   253	83	35	n	int
    //   297	17	37	localIntent2	Intent
    //   319	21	39	localPendingIntent	android.app.PendingIntent
    // Exception table:
    //   from	to	target	type
    //   0	89	162	finally
    //   94	113	162	finally
    //   142	159	162	finally
    //   185	361	162	finally
    //   364	370	162	finally
    //   373	391	162	finally
    //   396	414	162	finally
    //   419	445	162	finally
    //   450	469	162	finally
    //   472	491	162	finally
    //   494	501	162	finally
    //   504	552	162	finally
    //   584	594	162	finally
    //   610	684	162	finally
    //   687	705	162	finally
    //   705	714	162	finally
    //   419	445	448	java/lang/NumberFormatException
    //   560	572	576	finally
    //   572	575	576	finally
    //   121	133	717	finally
    //   133	136	717	finally
    //   169	181	725	finally
    //   181	183	725	finally
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gcm.a
 * JD-Core Version:    0.7.0.1
 */