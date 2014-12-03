package com.chartboost.sdk.impl;

import java.io.FilterInputStream;
import java.io.InputStream;

class o$e
  extends FilterInputStream
{
  public o$e(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public long skip(long paramLong)
  {
    long l2;
    for (long l1 = 0L;; l1 = l2 + l1)
    {
      if (l1 >= paramLong) {}
      do
      {
        return l1;
        l2 = this.in.skip(paramLong - l1);
        if (l2 != 0L) {
          break;
        }
      } while (read() < 0);
      l2 = 1L;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.o.e
 * JD-Core Version:    0.7.0.1
 */