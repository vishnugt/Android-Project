package com.facebook.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.Settings;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public final class FileLruCache
{
  private static final String HEADER_CACHEKEY_KEY = "key";
  private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
  static final String TAG = FileLruCache.class.getSimpleName();
  private static final AtomicLong bufferIndex = new AtomicLong();
  private final File directory;
  private boolean isTrimPending;
  private AtomicLong lastClearCacheTime = new AtomicLong(0L);
  private final FileLruCache.Limits limits;
  private final Object lock;
  private final String tag;
  
  public FileLruCache(Context paramContext, String paramString, FileLruCache.Limits paramLimits)
  {
    this.tag = paramString;
    this.limits = paramLimits;
    this.directory = new File(paramContext.getCacheDir(), paramString);
    this.lock = new Object();
    if ((this.directory.mkdirs()) || (this.directory.isDirectory())) {
      FileLruCache.BufferFile.deleteAll(this.directory);
    }
  }
  
  private void postTrim()
  {
    synchronized (this.lock)
    {
      if (!this.isTrimPending)
      {
        this.isTrimPending = true;
        Settings.getExecutor().execute(new FileLruCache.3(this));
      }
      return;
    }
  }
  
  private void renameToTargetAndTrim(String paramString, File paramFile)
  {
    if (!paramFile.renameTo(new File(this.directory, Utility.md5hash(paramString)))) {
      paramFile.delete();
    }
    postTrim();
  }
  
  private void trim()
  {
    for (;;)
    {
      try
      {
        Logger.log(LoggingBehavior.CACHE, TAG, "trim started");
        localPriorityQueue = new PriorityQueue();
        l1 = 0L;
        l2 = 0L;
        File[] arrayOfFile = this.directory.listFiles(FileLruCache.BufferFile.excludeBufferFiles());
        if (arrayOfFile == null) {
          continue;
        }
        int i = arrayOfFile.length;
        int j = 0;
        if (j >= i) {
          continue;
        }
        File localFile1 = arrayOfFile[j];
        FileLruCache.ModifiedFile localModifiedFile = new FileLruCache.ModifiedFile(localFile1);
        localPriorityQueue.add(localModifiedFile);
        Logger.log(LoggingBehavior.CACHE, TAG, "  trim considering time=" + Long.valueOf(localModifiedFile.getModified()) + " name=" + localModifiedFile.getFile().getName());
        long l3 = l1 + localFile1.length();
        long l4 = l2 + 1L;
        j++;
        l2 = l4;
        l1 = l3;
        continue;
      }
      finally
      {
        long l1;
        long l2;
        synchronized (this.lock)
        {
          PriorityQueue localPriorityQueue;
          Object localObject4;
          Object localObject5;
          File localFile2;
          long l8;
          this.isTrimPending = false;
          this.lock.notifyAll();
          throw localObject1;
        }
        long l5 = l2;
        long l6 = l1;
        long l7 = l5;
        continue;
      }
      if ((localObject4 <= this.limits.getByteCount()) && (localObject5 <= this.limits.getFileCount())) {
        continue;
      }
      localFile2 = ((FileLruCache.ModifiedFile)localPriorityQueue.remove()).getFile();
      Logger.log(LoggingBehavior.CACHE, TAG, "  trim removing " + localFile2.getName());
      localObject4 -= localFile2.length();
      l8 = localObject5 - 1L;
      localFile2.delete();
      l7 = l8;
    }
    synchronized (this.lock)
    {
      this.isTrimPending = false;
      this.lock.notifyAll();
      return;
    }
  }
  
  public final void clearCache()
  {
    File[] arrayOfFile = this.directory.listFiles(FileLruCache.BufferFile.excludeBufferFiles());
    this.lastClearCacheTime.set(System.currentTimeMillis());
    if (arrayOfFile != null) {
      Settings.getExecutor().execute(new FileLruCache.2(this, arrayOfFile));
    }
  }
  
  public final InputStream get(String paramString)
  {
    return get(paramString, null);
  }
  
  public final InputStream get(String paramString1, String paramString2)
  {
    File localFile = new File(this.directory, Utility.md5hash(paramString1));
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(localFile);
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(localFileInputStream, 8192);
      try
      {
        JSONObject localJSONObject = FileLruCache.StreamHeader.readHeader(localBufferedInputStream);
        if (localJSONObject == null) {
          return null;
        }
        String str1 = localJSONObject.optString("key");
        if (str1 != null)
        {
          boolean bool1 = str1.equals(paramString1);
          if (bool1) {}
        }
        else
        {
          return null;
        }
        String str2 = localJSONObject.optString("tag", null);
        if ((paramString2 != null) || (str2 == null))
        {
          if (paramString2 != null)
          {
            boolean bool2 = paramString2.equals(str2);
            if (bool2) {}
          }
        }
        else {
          return null;
        }
        long l = new Date().getTime();
        Logger.log(LoggingBehavior.CACHE, TAG, "Setting lastModified to " + Long.valueOf(l) + " for " + localFile.getName());
        localFile.setLastModified(l);
        return localBufferedInputStream;
      }
      finally
      {
        localBufferedInputStream.close();
      }
      return null;
    }
    catch (IOException localIOException) {}
  }
  
  public final InputStream interceptAndPut(String paramString, InputStream paramInputStream)
  {
    return new FileLruCache.CopyingInputStream(paramInputStream, openPutStream(paramString));
  }
  
  final OutputStream openPutStream(String paramString)
  {
    return openPutStream(paramString, null);
  }
  
  /* Error */
  public final OutputStream openPutStream(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 64	com/facebook/internal/FileLruCache:directory	Ljava/io/File;
    //   4: invokestatic 304	com/facebook/internal/FileLruCache$BufferFile:newFile	(Ljava/io/File;)Ljava/io/File;
    //   7: astore_3
    //   8: aload_3
    //   9: invokevirtual 126	java/io/File:delete	()Z
    //   12: pop
    //   13: aload_3
    //   14: invokevirtual 307	java/io/File:createNewFile	()Z
    //   17: ifne +31 -> 48
    //   20: new 238	java/io/IOException
    //   23: dup
    //   24: new 163	java/lang/StringBuilder
    //   27: dup
    //   28: ldc_w 309
    //   31: invokespecial 168	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: aload_3
    //   35: invokevirtual 312	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokespecial 313	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   47: athrow
    //   48: new 315	java/io/FileOutputStream
    //   51: dup
    //   52: aload_3
    //   53: invokespecial 316	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   56: astore 5
    //   58: new 318	java/io/BufferedOutputStream
    //   61: dup
    //   62: new 320	com/facebook/internal/FileLruCache$CloseCallbackOutputStream
    //   65: dup
    //   66: aload 5
    //   68: new 322	com/facebook/internal/FileLruCache$1
    //   71: dup
    //   72: aload_0
    //   73: invokestatic 223	java/lang/System:currentTimeMillis	()J
    //   76: aload_3
    //   77: aload_1
    //   78: invokespecial 325	com/facebook/internal/FileLruCache$1:<init>	(Lcom/facebook/internal/FileLruCache;JLjava/io/File;Ljava/lang/String;)V
    //   81: invokespecial 328	com/facebook/internal/FileLruCache$CloseCallbackOutputStream:<init>	(Ljava/io/OutputStream;Lcom/facebook/internal/FileLruCache$StreamCloseCallback;)V
    //   84: sipush 8192
    //   87: invokespecial 331	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   90: astore 6
    //   92: new 257	org/json/JSONObject
    //   95: dup
    //   96: invokespecial 332	org/json/JSONObject:<init>	()V
    //   99: astore 7
    //   101: aload 7
    //   103: ldc 8
    //   105: aload_1
    //   106: invokevirtual 336	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   109: pop
    //   110: aload_2
    //   111: invokestatic 340	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   114: ifne +12 -> 126
    //   117: aload 7
    //   119: ldc 11
    //   121: aload_2
    //   122: invokevirtual 336	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   125: pop
    //   126: aload 6
    //   128: aload 7
    //   130: invokestatic 344	com/facebook/internal/FileLruCache$StreamHeader:writeHeader	(Ljava/io/OutputStream;Lorg/json/JSONObject;)V
    //   133: aload 6
    //   135: areturn
    //   136: astore 12
    //   138: getstatic 134	com/facebook/LoggingBehavior:CACHE	Lcom/facebook/LoggingBehavior;
    //   141: iconst_5
    //   142: getstatic 33	com/facebook/internal/FileLruCache:TAG	Ljava/lang/String;
    //   145: new 163	java/lang/StringBuilder
    //   148: dup
    //   149: ldc_w 346
    //   152: invokespecial 168	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   155: aload 12
    //   157: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 349	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //   166: new 238	java/io/IOException
    //   169: dup
    //   170: aload 12
    //   172: invokevirtual 352	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   175: invokespecial 313	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   178: athrow
    //   179: astore 9
    //   181: getstatic 134	com/facebook/LoggingBehavior:CACHE	Lcom/facebook/LoggingBehavior;
    //   184: iconst_5
    //   185: getstatic 33	com/facebook/internal/FileLruCache:TAG	Ljava/lang/String;
    //   188: new 163	java/lang/StringBuilder
    //   191: dup
    //   192: ldc_w 354
    //   195: invokespecial 168	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   198: aload 9
    //   200: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 196	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: invokestatic 349	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //   209: new 238	java/io/IOException
    //   212: dup
    //   213: aload 9
    //   215: invokevirtual 355	org/json/JSONException:getMessage	()Ljava/lang/String;
    //   218: invokespecial 313	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   221: athrow
    //   222: astore 8
    //   224: aload 6
    //   226: invokevirtual 356	java/io/BufferedOutputStream:close	()V
    //   229: aload 8
    //   231: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	this	FileLruCache
    //   0	232	1	paramString1	String
    //   0	232	2	paramString2	String
    //   7	70	3	localFile	File
    //   56	11	5	localFileOutputStream	java.io.FileOutputStream
    //   90	135	6	localBufferedOutputStream	java.io.BufferedOutputStream
    //   99	30	7	localJSONObject	JSONObject
    //   222	8	8	localObject	Object
    //   179	35	9	localJSONException	org.json.JSONException
    //   136	35	12	localFileNotFoundException	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   48	58	136	java/io/FileNotFoundException
    //   92	126	179	org/json/JSONException
    //   126	133	179	org/json/JSONException
    //   92	126	222	finally
    //   126	133	222	finally
    //   181	222	222	finally
  }
  
  final long sizeInBytesForTest()
  {
    long l1;
    synchronized (this.lock)
    {
      for (;;)
      {
        boolean bool = this.isTrimPending;
        if (!bool) {
          break;
        }
        try
        {
          this.lock.wait();
        }
        catch (InterruptedException localInterruptedException) {}
      }
      File[] arrayOfFile = this.directory.listFiles();
      l1 = 0L;
      if (arrayOfFile != null)
      {
        int i = arrayOfFile.length;
        int j = 0;
        if (j < i)
        {
          long l2 = l1 + arrayOfFile[j].length();
          j++;
          l1 = l2;
        }
      }
    }
    return l1;
  }
  
  public final String toString()
  {
    return "{FileLruCache: tag:" + this.tag + " file:" + this.directory.getName() + "}";
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.internal.FileLruCache
 * JD-Core Version:    0.7.0.1
 */