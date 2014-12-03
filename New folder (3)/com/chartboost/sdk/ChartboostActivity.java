package com.chartboost.sdk;

import android.app.Activity;
import android.os.Bundle;

public abstract class ChartboostActivity
  extends Activity
  implements ChartboostDelegate
{
  private Chartboost a;
  
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
  
  protected abstract String getChartboostAppID();
  
  protected abstract String getChartboostAppSignature();
  
  public void onBackPressed()
  {
    if (this.a.onBackPressed()) {
      return;
    }
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = Chartboost.sharedChartboost();
    String str1 = getChartboostAppID();
    String str2 = getChartboostAppSignature();
    this.a.onCreate(this, str1, str2, this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.a.onDestroy(this);
  }
  
  protected void onStart()
  {
    super.onStart();
    this.a.onStart(this);
    this.a.startSession();
  }
  
  protected void onStop()
  {
    super.onStop();
    this.a.onStop(this);
  }
  
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
 * Qualified Name:     com.chartboost.sdk.ChartboostActivity
 * JD-Core Version:    0.7.0.1
 */