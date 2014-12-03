package com.chartboost.sdk.impl;

import java.util.regex.Pattern;

class af$o
  extends af.c
{
  af$o(ah paramah)
  {
    super(paramah);
  }
  
  public void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    y localy = new y();
    localy.a("$regex", paramObject.toString());
    if (((Pattern)paramObject).flags() != 0) {
      localy.a("$options", z.a(((Pattern)paramObject).flags()));
    }
    this.a.a(localy, paramStringBuilder);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.af.o
 * JD-Core Version:    0.7.0.1
 */