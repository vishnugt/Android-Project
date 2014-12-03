package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.ParcelFileDescriptor;

final class c
  implements Runnable
{
  private final Uri b;
  private final ParcelFileDescriptor c;
  
  public c(ImageManager paramImageManager, Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.b = paramUri;
    this.c = paramParcelFileDescriptor;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 36	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   3: invokevirtual 40	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   6: invokestatic 45	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   9: if_acmpne +51 -> 60
    //   12: new 47	java/lang/StringBuilder
    //   15: dup
    //   16: ldc 49
    //   18: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: invokestatic 45	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   24: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   27: ldc 58
    //   29: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokestatic 36	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   35: invokevirtual 40	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   38: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   41: ldc 63
    //   43: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: pop
    //   50: new 69	java/lang/IllegalStateException
    //   53: dup
    //   54: ldc 71
    //   56: invokespecial 72	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   59: athrow
    //   60: aload_0
    //   61: getfield 23	com/google/android/gms/common/images/c:c	Landroid/os/ParcelFileDescriptor;
    //   64: astore_1
    //   65: aconst_null
    //   66: astore_2
    //   67: iconst_0
    //   68: istore_3
    //   69: aload_1
    //   70: ifnull +25 -> 95
    //   73: aload_0
    //   74: getfield 23	com/google/android/gms/common/images/c:c	Landroid/os/ParcelFileDescriptor;
    //   77: invokevirtual 78	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   80: invokestatic 84	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
    //   83: astore 11
    //   85: aload 11
    //   87: astore_2
    //   88: aload_0
    //   89: getfield 23	com/google/android/gms/common/images/c:c	Landroid/os/ParcelFileDescriptor;
    //   92: invokevirtual 87	android/os/ParcelFileDescriptor:close	()V
    //   95: new 89	java/util/concurrent/CountDownLatch
    //   98: dup
    //   99: iconst_1
    //   100: invokespecial 92	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   103: astore 4
    //   105: aload_0
    //   106: getfield 16	com/google/android/gms/common/images/c:a	Lcom/google/android/gms/common/images/ImageManager;
    //   109: invokestatic 98	com/google/android/gms/common/images/ImageManager:e	(Lcom/google/android/gms/common/images/ImageManager;)Landroid/os/Handler;
    //   112: new 100	com/google/android/gms/common/images/d
    //   115: dup
    //   116: aload_0
    //   117: getfield 16	com/google/android/gms/common/images/c:a	Lcom/google/android/gms/common/images/ImageManager;
    //   120: aload_0
    //   121: getfield 21	com/google/android/gms/common/images/c:b	Landroid/net/Uri;
    //   124: aload_2
    //   125: iload_3
    //   126: aload 4
    //   128: invokespecial 103	com/google/android/gms/common/images/d:<init>	(Lcom/google/android/gms/common/images/ImageManager;Landroid/net/Uri;Landroid/graphics/Bitmap;ZLjava/util/concurrent/CountDownLatch;)V
    //   131: invokevirtual 109	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   134: pop
    //   135: aload 4
    //   137: invokevirtual 112	java/util/concurrent/CountDownLatch:await	()V
    //   140: return
    //   141: astore 8
    //   143: new 47	java/lang/StringBuilder
    //   146: dup
    //   147: ldc 114
    //   149: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   152: aload_0
    //   153: getfield 21	com/google/android/gms/common/images/c:b	Landroid/net/Uri;
    //   156: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   159: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: pop
    //   163: iconst_1
    //   164: istore_3
    //   165: aconst_null
    //   166: astore_2
    //   167: goto -79 -> 88
    //   170: astore 6
    //   172: new 47	java/lang/StringBuilder
    //   175: dup
    //   176: ldc 116
    //   178: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   181: aload_0
    //   182: getfield 21	com/google/android/gms/common/images/c:b	Landroid/net/Uri;
    //   185: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   188: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: pop
    //   192: return
    //   193: astore 10
    //   195: goto -100 -> 95
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	this	c
    //   64	6	1	localParcelFileDescriptor	ParcelFileDescriptor
    //   66	101	2	localObject	Object
    //   68	97	3	bool	boolean
    //   103	33	4	localCountDownLatch	java.util.concurrent.CountDownLatch
    //   170	1	6	localInterruptedException	java.lang.InterruptedException
    //   141	1	8	localOutOfMemoryError	java.lang.OutOfMemoryError
    //   193	1	10	localIOException	java.io.IOException
    //   83	3	11	localBitmap	android.graphics.Bitmap
    // Exception table:
    //   from	to	target	type
    //   73	85	141	java/lang/OutOfMemoryError
    //   135	140	170	java/lang/InterruptedException
    //   88	95	193	java/io/IOException
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.c
 * JD-Core Version:    0.7.0.1
 */