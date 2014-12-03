package com.facebook;

class AppEventsLogger$EventSuppression
{
  private AppEventsLogger.SuppressionTimeoutBehavior behavior;
  private int timeoutPeriod;
  
  AppEventsLogger$EventSuppression(int paramInt, AppEventsLogger.SuppressionTimeoutBehavior paramSuppressionTimeoutBehavior)
  {
    this.timeoutPeriod = paramInt;
    this.behavior = paramSuppressionTimeoutBehavior;
  }
  
  AppEventsLogger.SuppressionTimeoutBehavior getBehavior()
  {
    return this.behavior;
  }
  
  int getTimeoutPeriod()
  {
    return this.timeoutPeriod;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.EventSuppression
 * JD-Core Version:    0.7.0.1
 */