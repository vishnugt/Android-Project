package com.facebook;

final class AppEventsLogger$5
  implements Request.Callback
{
  AppEventsLogger$5(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair, Request paramRequest, AppEventsLogger.SessionEventsState paramSessionEventsState, AppEventsLogger.FlushStatistics paramFlushStatistics) {}
  
  public final void onCompleted(Response paramResponse)
  {
    AppEventsLogger.access$500(this.val$accessTokenAppId, this.val$postRequest, paramResponse, this.val$sessionEventsState, this.val$flushState);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.5
 * JD-Core Version:    0.7.0.1
 */