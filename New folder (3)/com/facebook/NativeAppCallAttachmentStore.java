package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;

public final class NativeAppCallAttachmentStore
  implements NativeAppCallContentProvider.AttachmentDataSource
{
  static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";
  private static final String TAG = NativeAppCallAttachmentStore.class.getName();
  private static File attachmentsDirectory;
  
  /* Error */
  private <T> void addAttachments(Context paramContext, UUID paramUUID, Map<String, T> paramMap, NativeAppCallAttachmentStore.ProcessAttachment<T> paramProcessAttachment)
  {
    // Byte code:
    //   0: aload_3
    //   1: invokeinterface 38 1 0
    //   6: ifne +4 -> 10
    //   9: return
    //   10: getstatic 40	com/facebook/NativeAppCallAttachmentStore:attachmentsDirectory	Ljava/io/File;
    //   13: ifnonnull +10 -> 23
    //   16: aload_1
    //   17: invokestatic 44	com/facebook/NativeAppCallAttachmentStore:getAttachmentsDirectory	(Landroid/content/Context;)Ljava/io/File;
    //   20: invokestatic 50	com/facebook/internal/Utility:deleteDirectory	(Ljava/io/File;)V
    //   23: aload_0
    //   24: aload_1
    //   25: invokevirtual 53	com/facebook/NativeAppCallAttachmentStore:ensureAttachmentsDirectoryExists	(Landroid/content/Context;)Ljava/io/File;
    //   28: pop
    //   29: new 55	java/util/ArrayList
    //   32: dup
    //   33: invokespecial 56	java/util/ArrayList:<init>	()V
    //   36: astore 6
    //   38: aload_3
    //   39: invokeinterface 60 1 0
    //   44: invokeinterface 66 1 0
    //   49: astore 14
    //   51: aload 14
    //   53: invokeinterface 72 1 0
    //   58: ifeq -49 -> 9
    //   61: aload 14
    //   63: invokeinterface 76 1 0
    //   68: checkcast 78	java/util/Map$Entry
    //   71: astore 15
    //   73: aload 15
    //   75: invokeinterface 81 1 0
    //   80: checkcast 83	java/lang/String
    //   83: astore 16
    //   85: aload 15
    //   87: invokeinterface 86 1 0
    //   92: astore 17
    //   94: aload_0
    //   95: aload_2
    //   96: aload 16
    //   98: iconst_1
    //   99: invokevirtual 90	com/facebook/NativeAppCallAttachmentStore:getAttachmentFile	(Ljava/util/UUID;Ljava/lang/String;Z)Ljava/io/File;
    //   102: astore 18
    //   104: aload 6
    //   106: aload 18
    //   108: invokeinterface 96 2 0
    //   113: pop
    //   114: aload 4
    //   116: aload 17
    //   118: aload 18
    //   120: invokeinterface 102 3 0
    //   125: goto -74 -> 51
    //   128: astore 7
    //   130: getstatic 23	com/facebook/NativeAppCallAttachmentStore:TAG	Ljava/lang/String;
    //   133: pop
    //   134: new 104	java/lang/StringBuilder
    //   137: dup
    //   138: ldc 106
    //   140: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   143: aload 7
    //   145: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   148: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   151: pop
    //   152: aload 6
    //   154: invokeinterface 117 1 0
    //   159: astore 10
    //   161: aload 10
    //   163: invokeinterface 72 1 0
    //   168: ifeq +29 -> 197
    //   171: aload 10
    //   173: invokeinterface 76 1 0
    //   178: checkcast 119	java/io/File
    //   181: astore 11
    //   183: aload 11
    //   185: invokevirtual 122	java/io/File:delete	()Z
    //   188: pop
    //   189: goto -28 -> 161
    //   192: astore 12
    //   194: goto -33 -> 161
    //   197: new 124	com/facebook/FacebookException
    //   200: dup
    //   201: aload 7
    //   203: invokespecial 127	com/facebook/FacebookException:<init>	(Ljava/lang/Throwable;)V
    //   206: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	207	0	this	NativeAppCallAttachmentStore
    //   0	207	1	paramContext	Context
    //   0	207	2	paramUUID	UUID
    //   0	207	3	paramMap	Map<String, T>
    //   0	207	4	paramProcessAttachment	NativeAppCallAttachmentStore.ProcessAttachment<T>
    //   36	117	6	localArrayList	java.util.ArrayList
    //   128	74	7	localIOException	IOException
    //   159	13	10	localIterator1	java.util.Iterator
    //   181	3	11	localFile1	File
    //   192	1	12	localException	java.lang.Exception
    //   49	13	14	localIterator2	java.util.Iterator
    //   71	15	15	localEntry	java.util.Map.Entry
    //   83	14	16	str	String
    //   92	25	17	localObject	Object
    //   102	17	18	localFile2	File
    // Exception table:
    //   from	to	target	type
    //   38	51	128	java/io/IOException
    //   51	125	128	java/io/IOException
    //   183	189	192	java/lang/Exception
  }
  
  static File getAttachmentsDirectory(Context paramContext)
  {
    try
    {
      if (attachmentsDirectory == null) {
        attachmentsDirectory = new File(paramContext.getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
      }
      File localFile = attachmentsDirectory;
      return localFile;
    }
    finally {}
  }
  
  public final void addAttachmentFilesForCall(Context paramContext, UUID paramUUID, Map<String, File> paramMap)
  {
    Validate.notNull(paramContext, "context");
    Validate.notNull(paramUUID, "callId");
    Validate.containsNoNulls(paramMap.values(), "imageAttachmentFiles");
    Validate.containsNoNullOrEmpty(paramMap.keySet(), "imageAttachmentFiles");
    addAttachments(paramContext, paramUUID, paramMap, new NativeAppCallAttachmentStore.2(this));
  }
  
  public final void addAttachmentsForCall(Context paramContext, UUID paramUUID, Map<String, Bitmap> paramMap)
  {
    Validate.notNull(paramContext, "context");
    Validate.notNull(paramUUID, "callId");
    Validate.containsNoNulls(paramMap.values(), "imageAttachments");
    Validate.containsNoNullOrEmpty(paramMap.keySet(), "imageAttachments");
    addAttachments(paramContext, paramUUID, paramMap, new NativeAppCallAttachmentStore.1(this));
  }
  
  final void cleanupAllAttachments(Context paramContext)
  {
    Utility.deleteDirectory(getAttachmentsDirectory(paramContext));
  }
  
  public final void cleanupAttachmentsForCall(Context paramContext, UUID paramUUID)
  {
    Utility.deleteDirectory(getAttachmentsDirectoryForCall(paramUUID, false));
  }
  
  final File ensureAttachmentsDirectoryExists(Context paramContext)
  {
    File localFile = getAttachmentsDirectory(paramContext);
    localFile.mkdirs();
    return localFile;
  }
  
  final File getAttachmentFile(UUID paramUUID, String paramString, boolean paramBoolean)
  {
    File localFile1 = getAttachmentsDirectoryForCall(paramUUID, paramBoolean);
    if (localFile1 == null) {
      return null;
    }
    try
    {
      File localFile2 = new File(localFile1, URLEncoder.encode(paramString, "UTF-8"));
      return localFile2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
    return null;
  }
  
  final File getAttachmentsDirectoryForCall(UUID paramUUID, boolean paramBoolean)
  {
    File localFile;
    if (attachmentsDirectory == null) {
      localFile = null;
    }
    do
    {
      return localFile;
      localFile = new File(attachmentsDirectory, paramUUID.toString());
    } while ((!paramBoolean) || (localFile.exists()));
    localFile.mkdirs();
    return localFile;
  }
  
  public final File openAttachment(UUID paramUUID, String paramString)
  {
    if ((Utility.isNullOrEmpty(paramString)) || (paramUUID == null)) {
      throw new FileNotFoundException();
    }
    try
    {
      File localFile = getAttachmentFile(paramUUID, paramString, false);
      return localFile;
    }
    catch (IOException localIOException)
    {
      throw new FileNotFoundException();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.NativeAppCallAttachmentStore
 * JD-Core Version:    0.7.0.1
 */