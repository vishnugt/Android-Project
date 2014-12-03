package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class af$j
  extends af.c
{
  af$j(ah paramah)
  {
    super(paramah);
  }
  
  public void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    int i = 1;
    paramStringBuilder.append("{ ");
    Iterator localIterator = ((Map)paramObject).entrySet().iterator();
    if (!localIterator.hasNext())
    {
      paramStringBuilder.append("}");
      return;
    }
    Map.Entry localEntry = (Map.Entry)localIterator.next();
    if (i != 0) {
      i = 0;
    }
    for (;;)
    {
      ae.a(paramStringBuilder, localEntry.getKey().toString());
      paramStringBuilder.append(" : ");
      this.a.a(localEntry.getValue(), paramStringBuilder);
      break;
      paramStringBuilder.append(" , ");
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.af.j
 * JD-Core Version:    0.7.0.1
 */