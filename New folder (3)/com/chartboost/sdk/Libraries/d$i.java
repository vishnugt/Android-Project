package com.chartboost.sdk.Libraries;

class d$i
  extends d.a
{
  public String a()
  {
    return "object must be a number (primitive type or derived from Number).";
  }
  
  public boolean a(Object paramObject)
  {
    return ((paramObject instanceof Number)) || (Integer.TYPE.isInstance(paramObject)) || (Long.TYPE.isInstance(paramObject)) || (Short.TYPE.isInstance(paramObject)) || (Float.TYPE.isInstance(paramObject)) || (Double.TYPE.isInstance(paramObject)) || (Byte.TYPE.isInstance(paramObject));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.d.i
 * JD-Core Version:    0.7.0.1
 */