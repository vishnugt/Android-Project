package com.facebook.internal;

import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

class FileLruCache$1
  implements FileLruCache.StreamCloseCallback
{
  FileLruCache$1(FileLruCache paramFileLruCache, long paramLong, File paramFile, String paramString) {}
  
  public void onClose()
  {
    if (this.val$bufferFileCreateTime < FileLruCache.access$000(this.this$0).get())
    {
      this.val$buffer.delete();
      return;
    }
    FileLruCache.access$100(this.this$0, this.val$key, this.val$buffer);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.internal.FileLruCache.1
 * JD-Core Version:    0.7.0.1
 */