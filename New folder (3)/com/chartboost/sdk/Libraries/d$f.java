package com.chartboost.sdk.Libraries;

import java.math.BigInteger;

class d$f
  extends d.a
{
  public String a()
  {
    return "object must be a number w/o decimals (int, long, short, or byte).";
  }
  
  public boolean a(Object paramObject)
  {
    return (Integer.class.isInstance(paramObject)) || (Long.class.isInstance(paramObject)) || (Short.class.isInstance(paramObject)) || (Byte.class.isInstance(paramObject)) || (BigInteger.class.isInstance(paramObject)) || (Integer.TYPE.isInstance(paramObject)) || (Long.TYPE.isInstance(paramObject)) || (Short.TYPE.isInstance(paramObject)) || (Byte.TYPE.isInstance(paramObject));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.d.f
 * JD-Core Version:    0.7.0.1
 */