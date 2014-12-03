package com.facebook;

 enum AppEventsLogger$SuppressionTimeoutBehavior
{
  static
  {
    RESET_TIMEOUT_WHEN_LOG_ATTEMPTED = new SuppressionTimeoutBehavior("RESET_TIMEOUT_WHEN_LOG_ATTEMPTED", 1);
    SuppressionTimeoutBehavior[] arrayOfSuppressionTimeoutBehavior = new SuppressionTimeoutBehavior[2];
    arrayOfSuppressionTimeoutBehavior[0] = RESET_TIMEOUT_WHEN_LOG_SUCCESSFUL;
    arrayOfSuppressionTimeoutBehavior[1] = RESET_TIMEOUT_WHEN_LOG_ATTEMPTED;
    $VALUES = arrayOfSuppressionTimeoutBehavior;
  }
  
  private AppEventsLogger$SuppressionTimeoutBehavior() {}
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.SuppressionTimeoutBehavior
 * JD-Core Version:    0.7.0.1
 */