package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

final class FileLruCache$BufferFile$2
  implements FilenameFilter
{
  public final boolean accept(File paramFile, String paramString)
  {
    return paramString.startsWith("buffer");
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.internal.FileLruCache.BufferFile.2
 * JD-Core Version:    0.7.0.1
 */