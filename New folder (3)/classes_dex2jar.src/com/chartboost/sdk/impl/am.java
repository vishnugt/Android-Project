package com.chartboost.sdk.impl;

public class am
  implements aj
{
  static final String[] a = new String[''];
  private byte[] b = new byte[1024];
  private byte[] c = new byte[1024];
  private as d = new as();
  
  static
  {
    a((byte)48, (byte)57);
    a((byte)97, (byte)122);
    a((byte)65, (byte)90);
  }
  
  static void a(byte paramByte1, byte paramByte2)
  {
    for (;;)
    {
      if (paramByte1 >= paramByte2) {
        return;
      }
      String str = "" + (char)paramByte1;
      a[paramByte1] = str;
      paramByte1 = (byte)(paramByte1 + 1);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.am
 * JD-Core Version:    0.7.0.1
 */