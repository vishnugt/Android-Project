package com.facebook;

import com.facebook.internal.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class NativeAppCallAttachmentStore$2
  implements NativeAppCallAttachmentStore.ProcessAttachment<File>
{
  NativeAppCallAttachmentStore$2(NativeAppCallAttachmentStore paramNativeAppCallAttachmentStore) {}
  
  public void processAttachment(File paramFile1, File paramFile2)
  {
    FileOutputStream localFileOutputStream = new FileOutputStream(paramFile2);
    try
    {
      localFileInputStream = new FileInputStream(paramFile1);
      try
      {
        byte[] arrayOfByte = new byte[1024];
        for (;;)
        {
          int i = localFileInputStream.read(arrayOfByte);
          if (i <= 0) {
            break;
          }
          localFileOutputStream.write(arrayOfByte, 0, i);
        }
        Utility.closeQuietly(localFileOutputStream);
      }
      finally {}
    }
    finally
    {
      for (;;)
      {
        FileInputStream localFileInputStream = null;
      }
    }
    Utility.closeQuietly(localFileInputStream);
    throw localObject1;
    Utility.closeQuietly(localFileOutputStream);
    Utility.closeQuietly(localFileInputStream);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.NativeAppCallAttachmentStore.2
 * JD-Core Version:    0.7.0.1
 */