package com.facebook;

import java.util.HashMap;

final class AppEventsLogger$1
  extends HashMap<String, AppEventsLogger.EventSuppression>
{
  AppEventsLogger$1()
  {
    put("fb_mobile_activate_app", new AppEventsLogger.EventSuppression(300, AppEventsLogger.SuppressionTimeoutBehavior.RESET_TIMEOUT_WHEN_LOG_ATTEMPTED));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.1
 * JD-Core Version:    0.7.0.1
 */