package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.Logger;
import java.io.BufferedOutputStream;

class Request$Serializer
  implements Request.KeyValueSerializer
{
  private boolean firstWrite = true;
  private final Logger logger;
  private final BufferedOutputStream outputStream;
  
  public Request$Serializer(BufferedOutputStream paramBufferedOutputStream, Logger paramLogger)
  {
    this.outputStream = paramBufferedOutputStream;
    this.logger = paramLogger;
  }
  
  public void write(String paramString, Object... paramVarArgs)
  {
    if (this.firstWrite)
    {
      this.outputStream.write("--".getBytes());
      this.outputStream.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
      this.outputStream.write("\r\n".getBytes());
      this.firstWrite = false;
    }
    this.outputStream.write(String.format(paramString, paramVarArgs).getBytes());
  }
  
  public void writeBitmap(String paramString, Bitmap paramBitmap)
  {
    writeContentDisposition(paramString, paramString, "image/png");
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
    writeLine("", new Object[0]);
    writeRecordBoundary();
    this.logger.appendKeyValue("    " + paramString, "<Image>");
  }
  
  public void writeBytes(String paramString, byte[] paramArrayOfByte)
  {
    writeContentDisposition(paramString, paramString, "content/unknown");
    this.outputStream.write(paramArrayOfByte);
    writeLine("", new Object[0]);
    writeRecordBoundary();
    Logger localLogger = this.logger;
    String str = "    " + paramString;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramArrayOfByte.length);
    localLogger.appendKeyValue(str, String.format("<Data: %d>", arrayOfObject));
  }
  
  public void writeContentDisposition(String paramString1, String paramString2, String paramString3)
  {
    write("Content-Disposition: form-data; name=\"%s\"", new Object[] { paramString1 });
    if (paramString2 != null) {
      write("; filename=\"%s\"", new Object[] { paramString2 });
    }
    writeLine("", new Object[0]);
    if (paramString3 != null) {
      writeLine("%s: %s", new Object[] { "Content-Type", paramString3 });
    }
    writeLine("", new Object[0]);
  }
  
  /* Error */
  public void writeFile(String paramString1, ParcelFileDescriptor paramParcelFileDescriptor, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_3
    //   4: ifnonnull +6 -> 10
    //   7: ldc 101
    //   9: astore_3
    //   10: aload_0
    //   11: aload_1
    //   12: aload_1
    //   13: aload_3
    //   14: invokevirtual 54	com/facebook/Request$Serializer:writeContentDisposition	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   17: new 123	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   20: dup
    //   21: aload_2
    //   22: invokespecial 126	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   25: astore 5
    //   27: new 128	java/io/BufferedInputStream
    //   30: dup
    //   31: aload 5
    //   33: invokespecial 131	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   36: astore 6
    //   38: sipush 8192
    //   41: newarray byte
    //   43: astore 8
    //   45: iconst_0
    //   46: istore 9
    //   48: aload 6
    //   50: aload 8
    //   52: invokevirtual 135	java/io/BufferedInputStream:read	([B)I
    //   55: istore 10
    //   57: iload 10
    //   59: iconst_m1
    //   60: if_icmpeq +25 -> 85
    //   63: aload_0
    //   64: getfield 21	com/facebook/Request$Serializer:outputStream	Ljava/io/BufferedOutputStream;
    //   67: aload 8
    //   69: iconst_0
    //   70: iload 10
    //   72: invokevirtual 138	java/io/BufferedOutputStream:write	([BII)V
    //   75: iload 9
    //   77: iload 10
    //   79: iadd
    //   80: istore 9
    //   82: goto -34 -> 48
    //   85: aload 6
    //   87: invokevirtual 141	java/io/BufferedInputStream:close	()V
    //   90: aload 5
    //   92: invokevirtual 142	android/os/ParcelFileDescriptor$AutoCloseInputStream:close	()V
    //   95: aload_0
    //   96: ldc 68
    //   98: iconst_0
    //   99: anewarray 4	java/lang/Object
    //   102: invokevirtual 71	com/facebook/Request$Serializer:writeLine	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: aload_0
    //   106: invokevirtual 74	com/facebook/Request$Serializer:writeRecordBoundary	()V
    //   109: aload_0
    //   110: getfield 23	com/facebook/Request$Serializer:logger	Lcom/facebook/internal/Logger;
    //   113: astore 11
    //   115: new 76	java/lang/StringBuilder
    //   118: dup
    //   119: ldc 78
    //   121: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   124: aload_1
    //   125: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: astore 12
    //   133: iconst_1
    //   134: anewarray 4	java/lang/Object
    //   137: astore 13
    //   139: aload 13
    //   141: iconst_0
    //   142: iload 9
    //   144: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   147: aastore
    //   148: aload 11
    //   150: aload 12
    //   152: ldc 109
    //   154: aload 13
    //   156: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   159: invokevirtual 97	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   162: return
    //   163: astore 7
    //   165: aconst_null
    //   166: astore 6
    //   168: aload 6
    //   170: ifnull +8 -> 178
    //   173: aload 6
    //   175: invokevirtual 141	java/io/BufferedInputStream:close	()V
    //   178: aload 4
    //   180: ifnull +8 -> 188
    //   183: aload 4
    //   185: invokevirtual 142	android/os/ParcelFileDescriptor$AutoCloseInputStream:close	()V
    //   188: aload 7
    //   190: athrow
    //   191: astore 7
    //   193: aload 5
    //   195: astore 4
    //   197: aconst_null
    //   198: astore 6
    //   200: goto -32 -> 168
    //   203: astore 7
    //   205: aload 5
    //   207: astore 4
    //   209: goto -41 -> 168
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	this	Serializer
    //   0	212	1	paramString1	String
    //   0	212	2	paramParcelFileDescriptor	ParcelFileDescriptor
    //   0	212	3	paramString2	String
    //   1	207	4	localObject1	Object
    //   25	181	5	localAutoCloseInputStream	android.os.ParcelFileDescriptor.AutoCloseInputStream
    //   36	163	6	localBufferedInputStream	java.io.BufferedInputStream
    //   163	26	7	localObject2	Object
    //   191	1	7	localObject3	Object
    //   203	1	7	localObject4	Object
    //   43	25	8	arrayOfByte	byte[]
    //   46	97	9	i	int
    //   55	25	10	j	int
    //   113	36	11	localLogger	Logger
    //   131	20	12	str	String
    //   137	18	13	arrayOfObject	Object[]
    // Exception table:
    //   from	to	target	type
    //   17	27	163	finally
    //   27	38	191	finally
    //   38	45	203	finally
    //   48	57	203	finally
    //   63	75	203	finally
  }
  
  public void writeFile(String paramString, Request.ParcelFileDescriptorWithMimeType paramParcelFileDescriptorWithMimeType)
  {
    writeFile(paramString, paramParcelFileDescriptorWithMimeType.getFileDescriptor(), paramParcelFileDescriptorWithMimeType.getMimeType());
  }
  
  public void writeLine(String paramString, Object... paramVarArgs)
  {
    write(paramString, paramVarArgs);
    write("\r\n", new Object[0]);
  }
  
  public void writeObject(String paramString, Object paramObject)
  {
    if (Request.access$100(paramObject))
    {
      writeString(paramString, Request.access$200(paramObject));
      return;
    }
    if ((paramObject instanceof Bitmap))
    {
      writeBitmap(paramString, (Bitmap)paramObject);
      return;
    }
    if ((paramObject instanceof byte[]))
    {
      writeBytes(paramString, (byte[])paramObject);
      return;
    }
    if ((paramObject instanceof ParcelFileDescriptor))
    {
      writeFile(paramString, (ParcelFileDescriptor)paramObject, null);
      return;
    }
    if ((paramObject instanceof Request.ParcelFileDescriptorWithMimeType))
    {
      writeFile(paramString, (Request.ParcelFileDescriptorWithMimeType)paramObject);
      return;
    }
    throw new IllegalArgumentException("value is not a supported type: String, Bitmap, byte[]");
  }
  
  public void writeRecordBoundary()
  {
    writeLine("--%s", new Object[] { "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" });
  }
  
  public void writeString(String paramString1, String paramString2)
  {
    writeContentDisposition(paramString1, null, null);
    writeLine("%s", new Object[] { paramString2 });
    writeRecordBoundary();
    if (this.logger != null) {
      this.logger.appendKeyValue("    " + paramString1, paramString2);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.Request.Serializer
 * JD-Core Version:    0.7.0.1
 */