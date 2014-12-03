package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.Set;

class af$d
  extends af.c
{
  af$d(ah paramah)
  {
    super(paramah);
  }
  
  public void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append("{ ");
    aa localaa = (aa)paramObject;
    Iterator localIterator = localaa.keySet().iterator();
    int i = 1;
    if (!localIterator.hasNext())
    {
      paramStringBuilder.append("}");
      return;
    }
    String str = (String)localIterator.next();
    if (i != 0) {
      i = 0;
    }
    for (;;)
    {
      ae.a(paramStringBuilder, str);
      paramStringBuilder.append(" : ");
      this.a.a(localaa.a(str), paramStringBuilder);
      break;
      paramStringBuilder.append(" , ");
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.af.d
 * JD-Core Version:    0.7.0.1
 */