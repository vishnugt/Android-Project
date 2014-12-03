package com.supercell.titan;

final class cj
  extends Thread
{
  cj(cf paramcf, String paramString) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: new 24	com/supercell/titan/cd
    //   3: dup
    //   4: aload_0
    //   5: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   8: invokespecial 27	com/supercell/titan/cd:<init>	(Lcom/supercell/titan/PurchaseManager;)V
    //   11: astore_1
    //   12: aload_1
    //   13: aload_0
    //   14: getfield 14	com/supercell/titan/cj:a	Ljava/lang/String;
    //   17: putfield 28	com/supercell/titan/cd:a	Ljava/lang/String;
    //   20: aload_0
    //   21: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   24: invokestatic 33	com/supercell/titan/cf:a	(Lcom/supercell/titan/cf;)Lcom/android/vending/billing/IInAppBillingService;
    //   27: iconst_3
    //   28: aload_0
    //   29: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   32: getfield 37	com/supercell/titan/cf:i	Lcom/supercell/titan/GameApp;
    //   35: invokevirtual 43	com/supercell/titan/GameApp:getPackageName	()Ljava/lang/String;
    //   38: aload_0
    //   39: getfield 14	com/supercell/titan/cj:a	Ljava/lang/String;
    //   42: ldc 45
    //   44: aload_0
    //   45: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   48: invokestatic 49	com/supercell/titan/cf:f	(Lcom/supercell/titan/cf;)Ljava/lang/String;
    //   51: invokeinterface 54 6 0
    //   56: astore 9
    //   58: aload_0
    //   59: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   62: pop
    //   63: aload 9
    //   65: ldc 56
    //   67: invokestatic 59	com/supercell/titan/cf:a	(Landroid/os/Bundle;Ljava/lang/String;)I
    //   70: istore 11
    //   72: aload_1
    //   73: iload 11
    //   75: putfield 63	com/supercell/titan/cd:c	I
    //   78: iload 11
    //   80: ifne +142 -> 222
    //   83: aload 9
    //   85: ldc 65
    //   87: invokevirtual 71	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   90: checkcast 73	android/app/PendingIntent
    //   93: astore 12
    //   95: aload 12
    //   97: ifnull +165 -> 262
    //   100: aload_0
    //   101: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   104: getfield 37	com/supercell/titan/cf:i	Lcom/supercell/titan/GameApp;
    //   107: aload 12
    //   109: invokevirtual 77	android/app/PendingIntent:getIntentSender	()Landroid/content/IntentSender;
    //   112: ldc 78
    //   114: new 80	android/content/Intent
    //   117: dup
    //   118: invokespecial 81	android/content/Intent:<init>	()V
    //   121: iconst_0
    //   122: iconst_0
    //   123: iconst_0
    //   124: invokevirtual 85	com/supercell/titan/GameApp:startIntentSenderForResult	(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    //   127: aload_0
    //   128: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   131: getfield 88	com/supercell/titan/cf:a	Ljava/util/Vector;
    //   134: aload_0
    //   135: getfield 14	com/supercell/titan/cj:a	Ljava/lang/String;
    //   138: invokevirtual 94	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   141: pop
    //   142: iconst_1
    //   143: istore_3
    //   144: iload_3
    //   145: ifne +57 -> 202
    //   148: aload_1
    //   149: getfield 96	com/supercell/titan/cd:b	Ljava/lang/String;
    //   152: pop
    //   153: aload_1
    //   154: getfield 28	com/supercell/titan/cd:a	Ljava/lang/String;
    //   157: pop
    //   158: aload_0
    //   159: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   162: astore 6
    //   164: aload 6
    //   166: monitorenter
    //   167: aload_0
    //   168: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   171: iconst_m1
    //   172: aload_0
    //   173: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   176: getfield 99	com/supercell/titan/cf:j	I
    //   179: iadd
    //   180: iconst_0
    //   181: invokestatic 105	java/lang/Math:max	(II)I
    //   184: putfield 99	com/supercell/titan/cf:j	I
    //   187: aload 6
    //   189: monitorexit
    //   190: aload_0
    //   191: getfield 12	com/supercell/titan/cj:b	Lcom/supercell/titan/cf;
    //   194: getfield 107	com/supercell/titan/cf:c	Ljava/util/Vector;
    //   197: aload_1
    //   198: invokevirtual 94	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   201: pop
    //   202: return
    //   203: astore 13
    //   205: aload_1
    //   206: aload 13
    //   208: invokevirtual 110	android/content/IntentSender$SendIntentException:getMessage	()Ljava/lang/String;
    //   211: putfield 96	com/supercell/titan/cd:b	Ljava/lang/String;
    //   214: aload 13
    //   216: invokestatic 114	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   219: goto +43 -> 262
    //   222: aload_1
    //   223: iload 11
    //   225: invokestatic 117	com/supercell/titan/cf:b	(I)Ljava/lang/String;
    //   228: putfield 96	com/supercell/titan/cd:b	Ljava/lang/String;
    //   231: iconst_0
    //   232: istore_3
    //   233: goto -89 -> 144
    //   236: astore_2
    //   237: aload_1
    //   238: aload_2
    //   239: invokevirtual 118	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   242: putfield 96	com/supercell/titan/cd:b	Ljava/lang/String;
    //   245: aload_2
    //   246: invokestatic 114	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   249: iconst_0
    //   250: istore_3
    //   251: goto -107 -> 144
    //   254: astore 7
    //   256: aload 6
    //   258: monitorexit
    //   259: aload 7
    //   261: athrow
    //   262: iconst_0
    //   263: istore_3
    //   264: goto -120 -> 144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	267	0	this	cj
    //   11	227	1	localcd	cd
    //   236	10	2	localException	java.lang.Exception
    //   143	121	3	i	int
    //   254	6	7	localObject	java.lang.Object
    //   56	28	9	localBundle	android.os.Bundle
    //   70	154	11	j	int
    //   93	15	12	localPendingIntent	android.app.PendingIntent
    //   203	12	13	localSendIntentException	android.content.IntentSender.SendIntentException
    // Exception table:
    //   from	to	target	type
    //   100	142	203	android/content/IntentSender$SendIntentException
    //   20	78	236	java/lang/Exception
    //   83	95	236	java/lang/Exception
    //   100	142	236	java/lang/Exception
    //   205	219	236	java/lang/Exception
    //   222	231	236	java/lang/Exception
    //   167	190	254	finally
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.cj
 * JD-Core Version:    0.7.0.1
 */