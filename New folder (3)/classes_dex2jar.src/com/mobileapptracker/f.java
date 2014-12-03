package com.mobileapptracker;

import java.util.Calendar;
import java.util.Comparator;

final class f
  implements Comparator
{
  public static int a(Calendar paramCalendar1, Calendar paramCalendar2)
  {
    if (paramCalendar1.get(1) != paramCalendar2.get(1)) {
      return paramCalendar1.get(1) - paramCalendar2.get(1);
    }
    if (paramCalendar1.get(2) != paramCalendar2.get(2)) {
      return paramCalendar1.get(2) - paramCalendar2.get(2);
    }
    return paramCalendar1.get(5) - paramCalendar2.get(5);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.mobileapptracker.f
 * JD-Core Version:    0.7.0.1
 */