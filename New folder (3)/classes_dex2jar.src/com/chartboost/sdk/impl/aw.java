package com.chartboost.sdk.impl;

import java.io.Serializable;

public class aw
  implements Serializable
{
  final String a;
  
  public String a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof aw)) {
      return false;
    }
    aw localaw = (aw)paramObject;
    return this.a.equals(localaw.a);
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    return a();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.aw
 * JD-Core Version:    0.7.0.1
 */