package com.supercell.titan;

import android.os.Handler;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class ca
  implements Runnable
{
  public int a;
  private String b = "";
  private String c = "";
  private final String d;
  private cb e;
  private Handler f;
  private byte[] g;
  private cc h = cc.b;
  private byte[] i;
  private HttpClient j;
  private final String k;
  
  public ca()
  {
    this(new Handler(), "", "");
  }
  
  public ca(Handler paramHandler, String paramString1, String paramString2)
  {
    this.f = paramHandler;
    this.d = paramString1;
    this.k = paramString2;
  }
  
  private static byte[] a(File paramFile)
  {
    MessageDigest localMessageDigest;
    try
    {
      localMessageDigest = MessageDigest.getInstance("SHA-1");
      FileInputStream localFileInputStream = new FileInputStream(paramFile);
      byte[] arrayOfByte = new byte[8192];
      int m = 0;
      while (m != -1)
      {
        m = localFileInputStream.read(arrayOfByte);
        if (m > 0) {
          localMessageDigest.update(arrayOfByte, 0, m);
        }
      }
      localFileInputStream.close();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      return null;
    }
    return localMessageDigest.digest();
  }
  
  private static byte[] a(InputStream paramInputStream)
  {
    if ((paramInputStream instanceof ByteArrayInputStream))
    {
      int n = paramInputStream.available();
      byte[] arrayOfByte2 = new byte[n];
      paramInputStream.read(arrayOfByte2, 0, n);
      return arrayOfByte2;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte1 = new byte[1024];
    for (;;)
    {
      int m = paramInputStream.read(arrayOfByte1, 0, 1024);
      if (m == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte1, 0, m);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  private static DefaultHttpClient d()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
    HttpProtocolParams.setContentCharset(localBasicHttpParams, "utf-8");
    localBasicHttpParams.setBooleanParameter("http.protocol.expect-continue", false);
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    try
    {
      KeyStore localKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
      localKeyStore.load(null, null);
      t localt = new t(localKeyStore);
      localt.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
      localSchemeRegistry.register(new Scheme("https", localt, 443));
      return new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
    return null;
  }
  
  public final cc a()
  {
    return this.h;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.e = cb.a;
    this.b = paramString1;
    this.g = null;
    this.c = paramString2;
  }
  
  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    this.e = cb.b;
    this.b = paramString1;
    this.g = paramArrayOfByte;
    this.c = paramString2;
  }
  
  public final cb b()
  {
    return this.e;
  }
  
  public final byte[] c()
  {
    return this.i;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: getstatic 229	com/supercell/titan/cc:c	Lcom/supercell/titan/cc;
    //   6: putfield 46	com/supercell/titan/ca:h	Lcom/supercell/titan/cc;
    //   9: aload_0
    //   10: invokestatic 231	com/supercell/titan/ca:d	()Lorg/apache/http/impl/client/DefaultHttpClient;
    //   13: putfield 233	com/supercell/titan/ca:j	Lorg/apache/http/client/HttpClient;
    //   16: aload_0
    //   17: getfield 233	com/supercell/titan/ca:j	Lorg/apache/http/client/HttpClient;
    //   20: invokeinterface 239 1 0
    //   25: sipush 15000
    //   28: invokestatic 245	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   31: aload_0
    //   32: getfield 210	com/supercell/titan/ca:e	Lcom/supercell/titan/cb;
    //   35: getstatic 208	com/supercell/titan/cb:a	Lcom/supercell/titan/cb;
    //   38: if_acmpne +405 -> 443
    //   41: new 247	org/apache/http/client/methods/HttpGet
    //   44: dup
    //   45: aload_0
    //   46: getfield 38	com/supercell/titan/ca:b	Ljava/lang/String;
    //   49: invokespecial 250	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   52: astore_2
    //   53: aload_0
    //   54: getfield 233	com/supercell/titan/ca:j	Lorg/apache/http/client/HttpClient;
    //   57: aload_2
    //   58: invokeinterface 254 2 0
    //   63: invokeinterface 260 1 0
    //   68: invokeinterface 266 1 0
    //   73: astore 10
    //   75: aload_0
    //   76: getfield 52	com/supercell/titan/ca:k	Ljava/lang/String;
    //   79: invokevirtual 272	java/lang/String:isEmpty	()Z
    //   82: ifeq +53 -> 135
    //   85: aload_0
    //   86: aload 10
    //   88: invokestatic 274	com/supercell/titan/ca:a	(Ljava/io/InputStream;)[B
    //   91: putfield 218	com/supercell/titan/ca:i	[B
    //   94: iload_1
    //   95: istore 4
    //   97: iload 4
    //   99: ifeq +334 -> 433
    //   102: aload_0
    //   103: getstatic 276	com/supercell/titan/cc:d	Lcom/supercell/titan/cc;
    //   106: putfield 46	com/supercell/titan/ca:h	Lcom/supercell/titan/cc;
    //   109: new 278	android/os/Message
    //   112: dup
    //   113: invokespecial 279	android/os/Message:<init>	()V
    //   116: astore 5
    //   118: aload 5
    //   120: aload_0
    //   121: putfield 283	android/os/Message:obj	Ljava/lang/Object;
    //   124: aload_0
    //   125: getfield 48	com/supercell/titan/ca:f	Landroid/os/Handler;
    //   128: aload 5
    //   130: invokevirtual 287	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   133: pop
    //   134: return
    //   135: ldc_w 289
    //   138: ldc_w 291
    //   141: invokestatic 294	com/supercell/titan/GameApp:getInstance	()Lcom/supercell/titan/GameApp;
    //   144: invokevirtual 298	com/supercell/titan/GameApp:getCacheDir	()Ljava/io/File;
    //   147: invokestatic 304	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   150: astore 11
    //   152: new 306	java/io/FileOutputStream
    //   155: dup
    //   156: aload 11
    //   158: invokespecial 307	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   161: astore 12
    //   163: sipush 1024
    //   166: newarray byte
    //   168: astore 14
    //   170: aload 10
    //   172: aload 14
    //   174: iconst_0
    //   175: sipush 1024
    //   178: invokevirtual 95	java/io/InputStream:read	([BII)I
    //   181: istore 15
    //   183: iload 15
    //   185: iconst_m1
    //   186: if_icmpeq +44 -> 230
    //   189: aload 12
    //   191: aload 14
    //   193: iconst_0
    //   194: iload 15
    //   196: invokevirtual 308	java/io/FileOutputStream:write	([BII)V
    //   199: goto -29 -> 170
    //   202: astore 13
    //   204: aload 12
    //   206: ifnull +8 -> 214
    //   209: aload 12
    //   211: invokevirtual 309	java/io/FileOutputStream:close	()V
    //   214: aload 13
    //   216: athrow
    //   217: astore 9
    //   219: aload 9
    //   221: invokestatic 202	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   224: iconst_0
    //   225: istore 4
    //   227: goto -130 -> 97
    //   230: aload 12
    //   232: invokevirtual 309	java/io/FileOutputStream:close	()V
    //   235: aload_0
    //   236: getfield 50	com/supercell/titan/ca:d	Ljava/lang/String;
    //   239: invokevirtual 272	java/lang/String:isEmpty	()Z
    //   242: istore 17
    //   244: iload 17
    //   246: ifne +168 -> 414
    //   249: aload 11
    //   251: invokestatic 311	com/supercell/titan/ca:a	(Ljava/io/File;)[B
    //   254: astore 22
    //   256: aload 22
    //   258: ifnonnull +47 -> 305
    //   261: iload_1
    //   262: istore 18
    //   264: iload 18
    //   266: ifeq +22 -> 288
    //   269: aload 11
    //   271: new 300	java/io/File
    //   274: dup
    //   275: aload_0
    //   276: getfield 52	com/supercell/titan/ca:k	Ljava/lang/String;
    //   279: invokespecial 312	java/io/File:<init>	(Ljava/lang/String;)V
    //   282: invokevirtual 316	java/io/File:renameTo	(Ljava/io/File;)Z
    //   285: ifne +376 -> 661
    //   288: iload_1
    //   289: ifeq +9 -> 298
    //   292: aload 11
    //   294: invokevirtual 319	java/io/File:delete	()Z
    //   297: pop
    //   298: iload 18
    //   300: istore 4
    //   302: goto -205 -> 97
    //   305: new 321	java/lang/StringBuilder
    //   308: dup
    //   309: invokespecial 322	java/lang/StringBuilder:<init>	()V
    //   312: astore 23
    //   314: aload 22
    //   316: arraylength
    //   317: istore 24
    //   319: iconst_0
    //   320: istore 25
    //   322: iload 25
    //   324: iload 24
    //   326: if_icmpge +49 -> 375
    //   329: aload 22
    //   331: iload 25
    //   333: baload
    //   334: istore 26
    //   336: iconst_1
    //   337: anewarray 4	java/lang/Object
    //   340: astore 27
    //   342: aload 27
    //   344: iconst_0
    //   345: iload 26
    //   347: sipush 255
    //   350: iand
    //   351: invokestatic 328	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   354: aastore
    //   355: aload 23
    //   357: ldc_w 330
    //   360: aload 27
    //   362: invokestatic 334	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   365: invokevirtual 338	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: pop
    //   369: iinc 25 1
    //   372: goto -50 -> 322
    //   375: aload 23
    //   377: invokevirtual 341	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   380: aload_0
    //   381: getfield 50	com/supercell/titan/ca:d	Ljava/lang/String;
    //   384: invokevirtual 345	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   387: ifeq +9 -> 396
    //   390: iload_1
    //   391: istore 18
    //   393: goto -129 -> 264
    //   396: aload_0
    //   397: getfield 52	com/supercell/titan/ca:k	Ljava/lang/String;
    //   400: pop
    //   401: iconst_0
    //   402: istore 18
    //   404: goto -140 -> 264
    //   407: astore 21
    //   409: aload 21
    //   411: invokestatic 202	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   414: iload_1
    //   415: istore 18
    //   417: goto -153 -> 264
    //   420: astore 8
    //   422: aload 8
    //   424: invokestatic 202	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   427: iconst_0
    //   428: istore 4
    //   430: goto -333 -> 97
    //   433: aload_0
    //   434: getstatic 347	com/supercell/titan/cc:e	Lcom/supercell/titan/cc;
    //   437: putfield 46	com/supercell/titan/ca:h	Lcom/supercell/titan/cc;
    //   440: goto -331 -> 109
    //   443: aload_0
    //   444: getfield 210	com/supercell/titan/ca:e	Lcom/supercell/titan/cb;
    //   447: getstatic 215	com/supercell/titan/cb:b	Lcom/supercell/titan/cb;
    //   450: if_acmpne +137 -> 587
    //   453: new 349	org/apache/http/client/methods/HttpPost
    //   456: dup
    //   457: aload_0
    //   458: getfield 38	com/supercell/titan/ca:b	Ljava/lang/String;
    //   461: invokespecial 350	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   464: astore 30
    //   466: aload 30
    //   468: new 352	org/apache/http/entity/ByteArrayEntity
    //   471: dup
    //   472: aload_0
    //   473: getfield 212	com/supercell/titan/ca:g	[B
    //   476: invokespecial 355	org/apache/http/entity/ByteArrayEntity:<init>	([B)V
    //   479: invokevirtual 359	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   482: aload 30
    //   484: ldc_w 361
    //   487: ldc_w 363
    //   490: invokevirtual 366	org/apache/http/client/methods/HttpPost:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   493: aload 30
    //   495: ldc_w 368
    //   498: aload_0
    //   499: getfield 40	com/supercell/titan/ca:c	Ljava/lang/String;
    //   502: invokevirtual 366	org/apache/http/client/methods/HttpPost:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   505: aload_0
    //   506: aload_0
    //   507: getfield 233	com/supercell/titan/ca:j	Lorg/apache/http/client/HttpClient;
    //   510: aload 30
    //   512: invokeinterface 254 2 0
    //   517: invokeinterface 260 1 0
    //   522: invokeinterface 266 1 0
    //   527: invokestatic 274	com/supercell/titan/ca:a	(Ljava/io/InputStream;)[B
    //   530: putfield 218	com/supercell/titan/ca:i	[B
    //   533: iload_1
    //   534: istore 32
    //   536: iload 32
    //   538: ifeq +39 -> 577
    //   541: aload_0
    //   542: getstatic 276	com/supercell/titan/cc:d	Lcom/supercell/titan/cc;
    //   545: putfield 46	com/supercell/titan/ca:h	Lcom/supercell/titan/cc;
    //   548: goto -439 -> 109
    //   551: astore 36
    //   553: aload 36
    //   555: invokestatic 202	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   558: iconst_0
    //   559: istore 32
    //   561: goto -25 -> 536
    //   564: astore 35
    //   566: aload 35
    //   568: invokestatic 202	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   571: iconst_0
    //   572: istore 32
    //   574: goto -38 -> 536
    //   577: aload_0
    //   578: getstatic 347	com/supercell/titan/cc:e	Lcom/supercell/titan/cc;
    //   581: putfield 46	com/supercell/titan/ca:h	Lcom/supercell/titan/cc;
    //   584: goto -475 -> 109
    //   587: aload_0
    //   588: getstatic 347	com/supercell/titan/cc:e	Lcom/supercell/titan/cc;
    //   591: putfield 46	com/supercell/titan/ca:h	Lcom/supercell/titan/cc;
    //   594: goto -485 -> 109
    //   597: astore 34
    //   599: iconst_0
    //   600: istore 32
    //   602: goto -66 -> 536
    //   605: astore 33
    //   607: iconst_0
    //   608: istore 32
    //   610: goto -74 -> 536
    //   613: astore 31
    //   615: iconst_0
    //   616: istore 32
    //   618: goto -82 -> 536
    //   621: astore 7
    //   623: iconst_0
    //   624: istore 4
    //   626: goto -529 -> 97
    //   629: astore_3
    //   630: iconst_0
    //   631: istore 4
    //   633: goto -536 -> 97
    //   636: astore 16
    //   638: iload_1
    //   639: istore 4
    //   641: goto -544 -> 97
    //   644: astore 19
    //   646: iload 18
    //   648: istore 4
    //   650: goto -553 -> 97
    //   653: astore 13
    //   655: aconst_null
    //   656: astore 12
    //   658: goto -454 -> 204
    //   661: iconst_0
    //   662: istore_1
    //   663: goto -375 -> 288
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	666	0	this	ca
    //   1	662	1	m	int
    //   52	6	2	localHttpGet	org.apache.http.client.methods.HttpGet
    //   629	1	3	localUnknownHostException1	java.net.UnknownHostException
    //   95	554	4	n	int
    //   116	13	5	localMessage	android.os.Message
    //   621	1	7	localIOException1	java.io.IOException
    //   420	3	8	localException1	Exception
    //   217	3	9	localClientProtocolException1	org.apache.http.client.ClientProtocolException
    //   73	98	10	localInputStream	InputStream
    //   150	143	11	localFile	File
    //   161	496	12	localFileOutputStream	java.io.FileOutputStream
    //   202	13	13	localObject1	Object
    //   653	1	13	localObject2	Object
    //   168	24	14	arrayOfByte1	byte[]
    //   181	14	15	i1	int
    //   636	1	16	localUnknownHostException2	java.net.UnknownHostException
    //   242	3	17	bool	boolean
    //   262	385	18	i2	int
    //   644	1	19	localUnknownHostException3	java.net.UnknownHostException
    //   407	3	21	localException2	Exception
    //   254	76	22	arrayOfByte2	byte[]
    //   312	64	23	localStringBuilder	java.lang.StringBuilder
    //   317	10	24	i3	int
    //   320	50	25	i4	int
    //   334	17	26	i5	int
    //   340	21	27	arrayOfObject	Object[]
    //   464	47	30	localHttpPost	org.apache.http.client.methods.HttpPost
    //   613	1	31	localConnectTimeoutException	org.apache.http.conn.ConnectTimeoutException
    //   534	83	32	i6	int
    //   605	1	33	localUnknownHostException4	java.net.UnknownHostException
    //   597	1	34	localIOException2	java.io.IOException
    //   564	3	35	localException3	Exception
    //   551	3	36	localClientProtocolException2	org.apache.http.client.ClientProtocolException
    // Exception table:
    //   from	to	target	type
    //   163	170	202	finally
    //   170	183	202	finally
    //   189	199	202	finally
    //   53	94	217	org/apache/http/client/ClientProtocolException
    //   135	152	217	org/apache/http/client/ClientProtocolException
    //   209	214	217	org/apache/http/client/ClientProtocolException
    //   214	217	217	org/apache/http/client/ClientProtocolException
    //   230	244	217	org/apache/http/client/ClientProtocolException
    //   249	256	217	org/apache/http/client/ClientProtocolException
    //   269	288	217	org/apache/http/client/ClientProtocolException
    //   292	298	217	org/apache/http/client/ClientProtocolException
    //   305	319	217	org/apache/http/client/ClientProtocolException
    //   329	369	217	org/apache/http/client/ClientProtocolException
    //   375	390	217	org/apache/http/client/ClientProtocolException
    //   396	401	217	org/apache/http/client/ClientProtocolException
    //   409	414	217	org/apache/http/client/ClientProtocolException
    //   249	256	407	java/lang/Exception
    //   305	319	407	java/lang/Exception
    //   329	369	407	java/lang/Exception
    //   375	390	407	java/lang/Exception
    //   396	401	407	java/lang/Exception
    //   53	94	420	java/lang/Exception
    //   135	152	420	java/lang/Exception
    //   209	214	420	java/lang/Exception
    //   214	217	420	java/lang/Exception
    //   230	244	420	java/lang/Exception
    //   269	288	420	java/lang/Exception
    //   292	298	420	java/lang/Exception
    //   409	414	420	java/lang/Exception
    //   505	533	551	org/apache/http/client/ClientProtocolException
    //   505	533	564	java/lang/Exception
    //   505	533	597	java/io/IOException
    //   505	533	605	java/net/UnknownHostException
    //   505	533	613	org/apache/http/conn/ConnectTimeoutException
    //   53	94	621	java/io/IOException
    //   135	152	621	java/io/IOException
    //   209	214	621	java/io/IOException
    //   214	217	621	java/io/IOException
    //   230	244	621	java/io/IOException
    //   249	256	621	java/io/IOException
    //   269	288	621	java/io/IOException
    //   292	298	621	java/io/IOException
    //   305	319	621	java/io/IOException
    //   329	369	621	java/io/IOException
    //   375	390	621	java/io/IOException
    //   396	401	621	java/io/IOException
    //   409	414	621	java/io/IOException
    //   53	94	629	java/net/UnknownHostException
    //   135	152	629	java/net/UnknownHostException
    //   209	214	629	java/net/UnknownHostException
    //   214	217	629	java/net/UnknownHostException
    //   249	256	629	java/net/UnknownHostException
    //   305	319	629	java/net/UnknownHostException
    //   329	369	629	java/net/UnknownHostException
    //   375	390	629	java/net/UnknownHostException
    //   396	401	629	java/net/UnknownHostException
    //   230	244	636	java/net/UnknownHostException
    //   409	414	636	java/net/UnknownHostException
    //   269	288	644	java/net/UnknownHostException
    //   292	298	644	java/net/UnknownHostException
    //   152	163	653	finally
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.ca
 * JD-Core Version:    0.7.0.1
 */