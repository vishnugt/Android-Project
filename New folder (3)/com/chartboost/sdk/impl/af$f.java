package com.chartboost.sdk.impl;

import java.util.Iterator;

class af$f
  extends af.c
{
  af$f(ah paramah)
  {
    super(paramah);
  }
  
  public void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    int i = 1;
    paramStringBuilder.append("[ ");
    Iterator localIterator = ((Iterable)paramObject).iterator();
    if (!localIterator.hasNext())
    {
      paramStringBuilder.append("]");
      return;
    }
    Object localObject = localIterator.next();
    if (i != 0) {
      i = 0;
    }
    for (;;)
    {
      this.a.a(localObject, paramStringBuilder);
      break;
      paramStringBuilder.append(" , ");
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.af.f
 * JD-Core Version:    0.7.0.1
 */