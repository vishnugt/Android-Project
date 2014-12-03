package com.chartboost.sdk.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

class af$i
  extends af.c
{
  af$i(ah paramah)
  {
    super(paramah);
  }
  
  public void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    Date localDate = (Date)paramObject;
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    localSimpleDateFormat.setCalendar(new GregorianCalendar(new SimpleTimeZone(0, "GMT")));
    this.a.a(new y("$date", localSimpleDateFormat.format(localDate)), paramStringBuilder);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.af.i
 * JD-Core Version:    0.7.0.1
 */