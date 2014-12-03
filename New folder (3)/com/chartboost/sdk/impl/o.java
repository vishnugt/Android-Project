package com.chartboost.sdk.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.a;
import com.chartboost.sdk.Libraries.a.a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class o
{
  private static o a = null;
  private o.d b = new o.d(Chartboost.sharedChartboost().getContext());
  private a c = new a();
  
  public static o a()
  {
    try
    {
      if (a == null) {
        a = new o();
      }
      o localo = a;
      return localo;
    }
    finally {}
  }
  
  private static o.a b(ImageView paramImageView)
  {
    if (paramImageView != null)
    {
      Drawable localDrawable = paramImageView.getDrawable();
      if ((localDrawable instanceof o.c)) {
        return ((o.c)localDrawable).a();
      }
    }
    return null;
  }
  
  protected a.a a(String paramString)
  {
    File localFile = this.b.a(paramString + ".png");
    if (localFile == null) {}
    for (;;)
    {
      return null;
      if (localFile.exists())
      {
        BufferedInputStream localBufferedInputStream = new BufferedInputStream(new FileInputStream(localFile));
        long l = localFile.length();
        if (l > 2147483647L) {}
        try
        {
          localBufferedInputStream.close();
          throw new IOException("Cannot read files larger than 2147483647 bytes");
          int i = (int)l;
          arrayOfByte = new byte[i];
          localBufferedInputStream.read(arrayOfByte, 0, i);
          localBufferedInputStream.close();
          BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
          localOptions1.inJustDecodeBounds = true;
          BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions1);
          localOptions2 = new BitmapFactory.Options();
          localOptions2.inJustDecodeBounds = false;
          localOptions2.inDither = false;
          localOptions2.inPurgeable = true;
          localOptions2.inInputShareable = true;
          localOptions2.inTempStorage = new byte[32768];
          localOptions2.inSampleSize = 1;
          if (localOptions2.inSampleSize >= 32)
          {
            localObject = null;
            if (localObject == null) {
              continue;
            }
            return new a.a((Bitmap)localObject, localOptions2.inSampleSize);
          }
        }
        catch (IOException localIOException)
        {
          try
          {
            byte[] arrayOfByte;
            Bitmap localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions2);
            Object localObject = localBitmap;
          }
          catch (OutOfMemoryError localOutOfMemoryError)
          {
            for (;;)
            {
              BitmapFactory.Options localOptions2;
              localOptions2.inSampleSize = (2 * localOptions2.inSampleSize);
              continue;
              localIOException = localIOException;
            }
          }
          catch (Exception localException) {}
        }
      }
    }
    return null;
  }
  
  /* Error */
  public void a(String paramString1, String paramString2, o.b paramb, ImageView paramImageView, android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload 5
    //   2: ifnull +116 -> 118
    //   5: aload 5
    //   7: ldc 158
    //   9: invokevirtual 164	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   12: istore 6
    //   14: aconst_null
    //   15: astore 7
    //   17: iload 6
    //   19: ifne +17 -> 36
    //   22: aload_0
    //   23: getfield 39	com/chartboost/sdk/impl/o:c	Lcom/chartboost/sdk/Libraries/a;
    //   26: aload_2
    //   27: invokevirtual 166	com/chartboost/sdk/Libraries/a:a	(Ljava/lang/String;)Lcom/chartboost/sdk/Libraries/a$a;
    //   30: astore 12
    //   32: aload 12
    //   34: astore 7
    //   36: aload 7
    //   38: ifnonnull +45 -> 83
    //   41: aload_0
    //   42: aload_2
    //   43: invokevirtual 167	com/chartboost/sdk/impl/o:a	(Ljava/lang/String;)Lcom/chartboost/sdk/Libraries/a$a;
    //   46: astore 7
    //   48: aload 7
    //   50: ifnull +33 -> 83
    //   53: iconst_0
    //   54: istore 11
    //   56: iload 6
    //   58: ifeq +66 -> 124
    //   61: aload 7
    //   63: iload 11
    //   65: invokevirtual 170	com/chartboost/sdk/Libraries/a$a:a	(Z)V
    //   68: iload 6
    //   70: ifne +13 -> 83
    //   73: aload_0
    //   74: getfield 39	com/chartboost/sdk/impl/o:c	Lcom/chartboost/sdk/Libraries/a;
    //   77: aload_2
    //   78: aload 7
    //   80: invokevirtual 173	com/chartboost/sdk/Libraries/a:a	(Ljava/lang/String;Lcom/chartboost/sdk/Libraries/a$a;)V
    //   83: aload 7
    //   85: ifnull +62 -> 147
    //   88: aload 4
    //   90: ifnull +13 -> 103
    //   93: aload 4
    //   95: aload 7
    //   97: invokevirtual 176	com/chartboost/sdk/Libraries/a$a:b	()Landroid/graphics/Bitmap;
    //   100: invokevirtual 180	android/widget/ImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   103: aload_3
    //   104: ifnull +13 -> 117
    //   107: aload_3
    //   108: aload 7
    //   110: aload 5
    //   112: invokeinterface 185 3 0
    //   117: return
    //   118: iconst_0
    //   119: istore 6
    //   121: goto -107 -> 14
    //   124: iconst_1
    //   125: istore 11
    //   127: goto -66 -> 61
    //   130: astore 9
    //   132: aconst_null
    //   133: astore 10
    //   135: aload 9
    //   137: invokevirtual 188	java/lang/Exception:printStackTrace	()V
    //   140: aload 10
    //   142: astore 7
    //   144: goto -61 -> 83
    //   147: new 190	com/chartboost/sdk/impl/o$a
    //   150: dup
    //   151: aload_0
    //   152: aload 4
    //   154: aload_3
    //   155: aload_2
    //   156: aload 5
    //   158: aload_1
    //   159: invokespecial 193	com/chartboost/sdk/impl/o$a:<init>	(Lcom/chartboost/sdk/impl/o;Landroid/widget/ImageView;Lcom/chartboost/sdk/impl/o$b;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V
    //   162: astore 8
    //   164: invokestatic 198	com/chartboost/sdk/impl/l:a	()Ljava/util/concurrent/ExecutorService;
    //   167: aload 8
    //   169: invokeinterface 204 2 0
    //   174: return
    //   175: astore 9
    //   177: aload 7
    //   179: astore 10
    //   181: goto -46 -> 135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	this	o
    //   0	184	1	paramString1	String
    //   0	184	2	paramString2	String
    //   0	184	3	paramb	o.b
    //   0	184	4	paramImageView	ImageView
    //   0	184	5	paramBundle	android.os.Bundle
    //   12	108	6	bool1	boolean
    //   15	163	7	localObject1	Object
    //   162	6	8	locala	o.a
    //   130	6	9	localException1	Exception
    //   175	1	9	localException2	Exception
    //   133	47	10	localObject2	Object
    //   54	72	11	bool2	boolean
    //   30	3	12	locala1	a.a
    // Exception table:
    //   from	to	target	type
    //   22	32	130	java/lang/Exception
    //   41	48	175	java/lang/Exception
    //   61	68	175	java/lang/Exception
    //   73	83	175	java/lang/Exception
  }
  
  /* Error */
  protected boolean a(String paramString, o.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/chartboost/sdk/impl/o:b	Lcom/chartboost/sdk/impl/o$d;
    //   4: new 65	java/lang/StringBuilder
    //   7: dup
    //   8: aload_1
    //   9: invokestatic 71	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   12: invokespecial 74	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: ldc 76
    //   17: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: invokevirtual 84	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   23: invokevirtual 87	com/chartboost/sdk/impl/o$d:a	(Ljava/lang/String;)Ljava/io/File;
    //   26: astore_3
    //   27: aload_3
    //   28: ifnonnull +5 -> 33
    //   31: iconst_0
    //   32: ireturn
    //   33: new 207	java/io/FileOutputStream
    //   36: dup
    //   37: aload_3
    //   38: invokespecial 208	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   41: astore 4
    //   43: sipush 4096
    //   46: newarray byte
    //   48: astore 9
    //   50: aload_2
    //   51: aload 9
    //   53: invokevirtual 213	com/chartboost/sdk/impl/o$e:read	([B)I
    //   56: istore 10
    //   58: iload 10
    //   60: iconst_m1
    //   61: if_icmpne +10 -> 71
    //   64: aload 4
    //   66: invokevirtual 214	java/io/FileOutputStream:close	()V
    //   69: iconst_1
    //   70: ireturn
    //   71: aload 4
    //   73: aload 9
    //   75: iconst_0
    //   76: iload 10
    //   78: invokevirtual 218	java/io/FileOutputStream:write	([BII)V
    //   81: goto -31 -> 50
    //   84: astore 7
    //   86: aload 4
    //   88: ifnull -57 -> 31
    //   91: aload 4
    //   93: invokevirtual 214	java/io/FileOutputStream:close	()V
    //   96: iconst_0
    //   97: ireturn
    //   98: astore 8
    //   100: iconst_0
    //   101: ireturn
    //   102: astore 5
    //   104: aconst_null
    //   105: astore 4
    //   107: aload 4
    //   109: ifnull +8 -> 117
    //   112: aload 4
    //   114: invokevirtual 214	java/io/FileOutputStream:close	()V
    //   117: aload 5
    //   119: athrow
    //   120: astore 11
    //   122: goto -53 -> 69
    //   125: astore 6
    //   127: goto -10 -> 117
    //   130: astore 5
    //   132: goto -25 -> 107
    //   135: astore 12
    //   137: aconst_null
    //   138: astore 4
    //   140: goto -54 -> 86
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	o
    //   0	143	1	paramString	String
    //   0	143	2	parame	o.e
    //   26	12	3	localFile	File
    //   41	98	4	localFileOutputStream	java.io.FileOutputStream
    //   102	16	5	localObject1	Object
    //   130	1	5	localObject2	Object
    //   125	1	6	localException1	Exception
    //   84	1	7	localException2	Exception
    //   98	1	8	localException3	Exception
    //   48	26	9	arrayOfByte	byte[]
    //   56	21	10	i	int
    //   120	1	11	localException4	Exception
    //   135	1	12	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   43	50	84	java/lang/Exception
    //   50	58	84	java/lang/Exception
    //   71	81	84	java/lang/Exception
    //   91	96	98	java/lang/Exception
    //   33	43	102	finally
    //   64	69	120	java/lang/Exception
    //   112	117	125	java/lang/Exception
    //   43	50	130	finally
    //   50	58	130	finally
    //   71	81	130	finally
    //   33	43	135	java/lang/Exception
  }
  
  public void b()
  {
    this.b.a();
    this.c.a();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.o
 * JD-Core Version:    0.7.0.1
 */