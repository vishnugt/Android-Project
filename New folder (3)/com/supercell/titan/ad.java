package com.supercell.titan;

import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;
import com.google.android.vending.expansion.downloader.DownloadProgressInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

final class ad
  extends AsyncTask<Object, DownloadProgressInfo, Boolean>
{
  ad(GameApp paramGameApp) {}
  
  private static int a(InputStream paramInputStream)
  {
    return paramInputStream.read() | paramInputStream.read() << 8 | paramInputStream.read() << 16 | paramInputStream.read() << 24;
  }
  
  /* Error */
  private static Boolean a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: invokestatic 30	com/supercell/titan/GameApp:getInstance	()Lcom/supercell/titan/GameApp;
    //   5: invokestatic 34	com/supercell/titan/GameApp:d	(Lcom/supercell/titan/GameApp;)Ljava/io/File;
    //   8: astore_1
    //   9: new 36	java/io/DataInputStream
    //   12: dup
    //   13: new 38	java/io/FileInputStream
    //   16: dup
    //   17: aload_1
    //   18: invokespecial 41	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   21: invokespecial 44	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   24: astore_2
    //   25: ldc 45
    //   27: newarray byte
    //   29: astore 7
    //   31: aload_2
    //   32: invokestatic 47	com/supercell/titan/ad:a	(Ljava/io/InputStream;)I
    //   35: ldc 48
    //   37: if_icmpne +222 -> 259
    //   40: aload_2
    //   41: bipush 10
    //   43: invokestatic 51	com/supercell/titan/ad:a	(Ljava/io/InputStream;I)V
    //   46: aload_2
    //   47: invokestatic 47	com/supercell/titan/ad:a	(Ljava/io/InputStream;)I
    //   50: istore 9
    //   52: aload_2
    //   53: invokestatic 47	com/supercell/titan/ad:a	(Ljava/io/InputStream;)I
    //   56: istore 10
    //   58: aload_2
    //   59: invokestatic 47	com/supercell/titan/ad:a	(Ljava/io/InputStream;)I
    //   62: istore 11
    //   64: iload 10
    //   66: iload 11
    //   68: if_icmpeq +26 -> 94
    //   71: iconst_0
    //   72: invokestatic 57	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   75: astore 12
    //   77: aload_2
    //   78: invokevirtual 60	java/io/InputStream:close	()V
    //   81: aload 12
    //   83: areturn
    //   84: astore 13
    //   86: aload 13
    //   88: invokestatic 64	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   91: aload 12
    //   93: areturn
    //   94: aload_2
    //   95: invokestatic 67	com/supercell/titan/ad:b	(Ljava/io/InputStream;)I
    //   98: istore 14
    //   100: aload_2
    //   101: invokestatic 67	com/supercell/titan/ad:b	(Ljava/io/InputStream;)I
    //   104: istore 15
    //   106: aload_2
    //   107: iload 14
    //   109: invokestatic 70	com/supercell/titan/ad:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   112: ifnonnull +26 -> 138
    //   115: iconst_0
    //   116: invokestatic 57	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   119: astore 22
    //   121: aload_2
    //   122: invokevirtual 60	java/io/InputStream:close	()V
    //   125: aload 22
    //   127: areturn
    //   128: astore 23
    //   130: aload 23
    //   132: invokestatic 64	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   135: aload 22
    //   137: areturn
    //   138: aload_2
    //   139: iload 15
    //   141: invokestatic 51	com/supercell/titan/ad:a	(Ljava/io/InputStream;I)V
    //   144: new 72	java/util/zip/CRC32
    //   147: dup
    //   148: invokespecial 73	java/util/zip/CRC32:<init>	()V
    //   151: astore 16
    //   153: iload 11
    //   155: ifle +70 -> 225
    //   158: iload 11
    //   160: aload 7
    //   162: arraylength
    //   163: invokestatic 79	java/lang/Math:min	(II)I
    //   166: istore 17
    //   168: aload_2
    //   169: aload 7
    //   171: iconst_0
    //   172: iload 17
    //   174: invokevirtual 82	java/io/InputStream:read	([BII)I
    //   177: iload 17
    //   179: if_icmpeq +26 -> 205
    //   182: iconst_0
    //   183: invokestatic 57	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   186: astore 18
    //   188: aload_2
    //   189: invokevirtual 60	java/io/InputStream:close	()V
    //   192: aload 18
    //   194: areturn
    //   195: astore 19
    //   197: aload 19
    //   199: invokestatic 64	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   202: aload 18
    //   204: areturn
    //   205: aload 16
    //   207: aload 7
    //   209: iconst_0
    //   210: iload 17
    //   212: invokevirtual 86	java/util/zip/CRC32:update	([BII)V
    //   215: iload 11
    //   217: iload 17
    //   219: isub
    //   220: istore 11
    //   222: goto -69 -> 153
    //   225: aload 16
    //   227: invokevirtual 90	java/util/zip/CRC32:getValue	()J
    //   230: l2i
    //   231: iload 9
    //   233: if_icmpeq +28 -> 261
    //   236: iconst_0
    //   237: invokestatic 57	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   240: astore 20
    //   242: aload_2
    //   243: invokevirtual 60	java/io/InputStream:close	()V
    //   246: aload 20
    //   248: areturn
    //   249: astore 21
    //   251: aload 21
    //   253: invokestatic 64	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   256: aload 20
    //   258: areturn
    //   259: iconst_1
    //   260: istore_0
    //   261: iload_0
    //   262: ifeq -231 -> 31
    //   265: aload_2
    //   266: invokevirtual 60	java/io/InputStream:close	()V
    //   269: iconst_1
    //   270: invokestatic 57	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   273: areturn
    //   274: astore 8
    //   276: aload 8
    //   278: invokestatic 64	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   281: goto -12 -> 269
    //   284: astore_3
    //   285: aconst_null
    //   286: astore_2
    //   287: aload_3
    //   288: invokestatic 64	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   291: aload_2
    //   292: ifnull -23 -> 269
    //   295: aload_2
    //   296: invokevirtual 60	java/io/InputStream:close	()V
    //   299: goto -30 -> 269
    //   302: astore 6
    //   304: aload 6
    //   306: invokestatic 64	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   309: goto -40 -> 269
    //   312: astore 4
    //   314: aconst_null
    //   315: astore_2
    //   316: aload_2
    //   317: ifnull +7 -> 324
    //   320: aload_2
    //   321: invokevirtual 60	java/io/InputStream:close	()V
    //   324: aload 4
    //   326: athrow
    //   327: astore 5
    //   329: aload 5
    //   331: invokestatic 64	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   334: goto -10 -> 324
    //   337: astore 4
    //   339: goto -23 -> 316
    //   342: astore_3
    //   343: goto -56 -> 287
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	261	0	i	int
    //   8	10	1	localFile	java.io.File
    //   24	297	2	localDataInputStream	java.io.DataInputStream
    //   284	4	3	localIOException1	IOException
    //   342	1	3	localIOException2	IOException
    //   312	13	4	localObject1	Object
    //   337	1	4	localObject2	Object
    //   327	3	5	localIOException3	IOException
    //   302	3	6	localIOException4	IOException
    //   29	179	7	arrayOfByte	byte[]
    //   274	3	8	localIOException5	IOException
    //   50	184	9	j	int
    //   56	13	10	k	int
    //   62	159	11	m	int
    //   75	17	12	localBoolean1	Boolean
    //   84	3	13	localIOException6	IOException
    //   98	10	14	n	int
    //   104	36	15	i1	int
    //   151	75	16	localCRC32	java.util.zip.CRC32
    //   166	54	17	i2	int
    //   186	17	18	localBoolean2	Boolean
    //   195	3	19	localIOException7	IOException
    //   240	17	20	localBoolean3	Boolean
    //   249	3	21	localIOException8	IOException
    //   119	17	22	localBoolean4	Boolean
    //   128	3	23	localIOException9	IOException
    // Exception table:
    //   from	to	target	type
    //   77	81	84	java/io/IOException
    //   121	125	128	java/io/IOException
    //   188	192	195	java/io/IOException
    //   242	246	249	java/io/IOException
    //   265	269	274	java/io/IOException
    //   9	25	284	java/io/IOException
    //   295	299	302	java/io/IOException
    //   9	25	312	finally
    //   320	324	327	java/io/IOException
    //   25	31	337	finally
    //   31	64	337	finally
    //   71	77	337	finally
    //   94	121	337	finally
    //   138	153	337	finally
    //   158	188	337	finally
    //   205	215	337	finally
    //   225	242	337	finally
    //   287	291	337	finally
    //   25	31	342	java/io/IOException
    //   31	64	342	java/io/IOException
    //   71	77	342	java/io/IOException
    //   94	121	342	java/io/IOException
    //   138	153	342	java/io/IOException
    //   158	188	342	java/io/IOException
    //   205	215	342	java/io/IOException
    //   225	242	342	java/io/IOException
  }
  
  private static void a(InputStream paramInputStream, int paramInt)
  {
    if (paramInputStream.skip(paramInt) != paramInt) {
      throw new IOException("skip failed");
    }
  }
  
  private static int b(InputStream paramInputStream)
  {
    return paramInputStream.read() | paramInputStream.read() << 8;
  }
  
  private static String b(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt + 1];
    if (paramInputStream.read(arrayOfByte, 0, paramInt) != paramInt) {
      throw new IOException("reading string failed");
    }
    try
    {
      String str = new String(arrayOfByte, 0, paramInt, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      GameApp.debuggerException(localUnsupportedEncodingException);
    }
    return null;
  }
  
  protected final void onPreExecute()
  {
    GameApp.b(this.a).setVisibility(0);
    GameApp.c(this.a).setText(co.text_verifying_download);
    super.onPreExecute();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.ad
 * JD-Core Version:    0.7.0.1
 */