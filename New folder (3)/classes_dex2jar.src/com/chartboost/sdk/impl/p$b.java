package com.chartboost.sdk.impl;

public enum p$b
{
  static
  {
    b[] arrayOfb = new b[6];
    arrayOfb[0] = a;
    arrayOfb[1] = b;
    arrayOfb[2] = c;
    arrayOfb[3] = d;
    arrayOfb[4] = e;
    arrayOfb[5] = f;
    g = arrayOfb;
  }
  
  public static b a(int paramInt)
  {
    if (paramInt == 0) {}
    while ((paramInt <= 0) || (paramInt > values().length)) {
      return null;
    }
    return values()[(paramInt - 1)];
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.p.b
 * JD-Core Version:    0.7.0.1
 */