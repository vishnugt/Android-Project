package com.chartboost.sdk;

public abstract interface ChartboostDelegate
{
  public abstract void didCacheInterstitial(String paramString);
  
  public abstract void didCacheMoreApps();
  
  public abstract void didClickInterstitial(String paramString);
  
  public abstract void didClickMoreApps();
  
  public abstract void didCloseInterstitial(String paramString);
  
  public abstract void didCloseMoreApps();
  
  public abstract void didDismissInterstitial(String paramString);
  
  public abstract void didDismissMoreApps();
  
  public abstract void didFailToLoadInterstitial(String paramString);
  
  public abstract void didFailToLoadMoreApps();
  
  public abstract void didFailToLoadUrl(String paramString);
  
  public abstract void didShowInterstitial(String paramString);
  
  public abstract void didShowMoreApps();
  
  public abstract boolean shouldDisplayInterstitial(String paramString);
  
  public abstract boolean shouldDisplayLoadingViewForMoreApps();
  
  public abstract boolean shouldDisplayMoreApps();
  
  public abstract boolean shouldRequestInterstitial(String paramString);
  
  public abstract boolean shouldRequestInterstitialsInFirstSession();
  
  public abstract boolean shouldRequestMoreApps();
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.ChartboostDelegate
 * JD-Core Version:    0.7.0.1
 */