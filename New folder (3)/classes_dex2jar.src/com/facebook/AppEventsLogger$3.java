package com.facebook;

import com.facebook.internal.Utility;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;

final class AppEventsLogger$3
  extends TimerTask
{
  public final void run()
  {
    HashSet localHashSet = new HashSet();
    synchronized (AppEventsLogger.access$200())
    {
      Iterator localIterator1 = AppEventsLogger.access$300().keySet().iterator();
      if (localIterator1.hasNext()) {
        localHashSet.add(((AppEventsLogger.AccessTokenAppIdPair)localIterator1.next()).getApplicationId());
      }
    }
    Iterator localIterator2 = localHashSet.iterator();
    while (localIterator2.hasNext()) {
      Utility.queryAppSettings((String)localIterator2.next(), true);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.3
 * JD-Core Version:    0.7.0.1
 */