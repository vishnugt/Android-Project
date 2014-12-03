package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.d.c;

class j$1
  extends d.c
{
  public String a()
  {
    return "Must be a valid status code (>=200 && <300)";
  }
  
  public boolean a(Object paramObject)
  {
    int i = ((Number)paramObject).intValue();
    return (i >= 200) && (i < 300);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.j.1
 * JD-Core Version:    0.7.0.1
 */