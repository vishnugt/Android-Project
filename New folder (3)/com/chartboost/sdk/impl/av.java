package com.chartboost.sdk.impl;

import java.io.Serializable;
import java.util.Arrays;

public class av
  implements Serializable
{
  final byte a;
  final byte[] b;
  
  public byte a()
  {
    return this.a;
  }
  
  public byte[] b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    av localav;
    do
    {
      return true;
      if (!(paramObject instanceof av)) {
        return false;
      }
      localav = (av)paramObject;
      if (this.a != localav.a) {
        return false;
      }
    } while (Arrays.equals(this.b, localav.b));
    return false;
  }
  
  public int hashCode()
  {
    int i = 31 * this.a;
    if (this.b != null) {}
    for (int j = Arrays.hashCode(this.b);; j = 0) {
      return j + i;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.av
 * JD-Core Version:    0.7.0.1
 */