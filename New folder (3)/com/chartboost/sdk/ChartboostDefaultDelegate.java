package com.chartboost.sdk;

public abstract class ChartboostDefaultDelegate
  implements ChartboostDelegate
{
  public void didCacheInterstitial(String paramString) {}
  
  public void didCacheMoreApps() {}
  
  public void didClickInterstitial(String paramString) {}
  
  public void didClickMoreApps() {}
  
  public void didCloseInterstitial(String paramString) {}
  
  public void didCloseMoreApps() {}
  
  public void didDismissInterstitial(String paramString) {}
  
  public void didDismissMoreApps() {}
  
  public void didFailToLoadInterstitial(String paramString) {}
  
  public void didFailToLoadMoreApps() {}
  
  public void didFailToLoadUrl(String paramString) {}
  
  public void didShowInterstitial(String paramString) {}
  
  public void didShowMoreApps() {}
  
  public boolean shouldDisplayInterstitial(String paramString)
  {
    return true;
  }
  
  public boolean shouldDisplayLoadingViewForMoreApps()
  {
    return true;
  }
  
  public boolean shouldDisplayMoreApps()
  {
    return true;
  }
  
  public boolean shouldRequestInterstitial(String paramString)
  {
    return true;
  }
  
  public boolean shouldRequestInterstitialsInFirstSession()
  {
    return true;
  }
  
  public boolean shouldRequestMoreApps()
  {
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.ChartboostDefaultDelegate
 * JD-Core Version:    0.7.0.1
 */