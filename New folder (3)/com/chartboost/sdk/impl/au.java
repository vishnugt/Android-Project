package com.chartboost.sdk.impl;

import java.io.Serializable;
import java.util.Date;

public class au
  implements Serializable, Comparable<au>
{
  static final boolean a = Boolean.getBoolean("DEBUG.DBTIMESTAMP");
  final int b = 0;
  final Date c = null;
  
  public int a()
  {
    if (this.c == null) {
      return 0;
    }
    return (int)(this.c.getTime() / 1000L);
  }
  
  public int a(au paramau)
  {
    if (a() != paramau.a()) {
      return a() - paramau.a();
    }
    return b() - paramau.b();
  }
  
  public int b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    au localau;
    do
    {
      return true;
      if (!(paramObject instanceof au)) {
        break;
      }
      localau = (au)paramObject;
    } while ((a() == localau.a()) && (b() == localau.b()));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    return 31 * (31 + this.b) + a();
  }
  
  public String toString()
  {
    return "TS time:" + this.c + " inc:" + this.b;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.au
 * JD-Core Version:    0.7.0.1
 */