package com.facebook;

import java.util.TimerTask;

final class AppEventsLogger$2
  extends TimerTask
{
  public final void run()
  {
    if (AppEventsLogger.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
      AppEventsLogger.access$100(AppEventsLogger.FlushReason.TIMER);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.2
 * JD-Core Version:    0.7.0.1
 */