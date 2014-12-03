package com.chartboost.sdk.impl;

import java.lang.reflect.Array;

class af$m
  extends af.c
{
  af$m(ah paramah)
  {
    super(paramah);
  }
  
  public void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append("[ ");
    for (int i = 0;; i++)
    {
      if (i >= Array.getLength(paramObject))
      {
        paramStringBuilder.append("]");
        return;
      }
      if (i > 0) {
        paramStringBuilder.append(" , ");
      }
      this.a.a(Array.get(paramObject, i), paramStringBuilder);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.af.m
 * JD-Core Version:    0.7.0.1
 */