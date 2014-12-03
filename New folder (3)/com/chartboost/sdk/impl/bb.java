package com.chartboost.sdk.impl;

import java.io.Serializable;

public class bb
  implements Serializable
{
  private final String a;
  
  public String a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    String str;
    label28:
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof bb)) {
        break;
      }
      str = ((bb)paramObject).a;
      if (this.a == null) {
        break label65;
      }
    } while (this.a.equals(str));
    for (;;)
    {
      return false;
      if ((paramObject instanceof String))
      {
        str = (String)paramObject;
        break label28;
      }
      return false;
      label65:
      if (str == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    if (this.a != null) {
      return this.a.hashCode();
    }
    return 0;
  }
  
  public String toString()
  {
    return this.a;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bb
 * JD-Core Version:    0.7.0.1
 */