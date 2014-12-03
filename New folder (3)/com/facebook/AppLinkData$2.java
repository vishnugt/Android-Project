package com.facebook;

final class AppLinkData$2
  implements Runnable
{
  AppLinkData$2(AppLinkData.CompletionHandler paramCompletionHandler) {}
  
  public final void run()
  {
    this.val$completionHandler.onDeferredAppLinkDataFetched(null);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppLinkData.2
 * JD-Core Version:    0.7.0.1
 */