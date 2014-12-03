package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.chartboost.sdk.Chartboost;

public class m
{
  public static boolean a()
  {
    try
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)Chartboost.sharedChartboost().getContext().getSystemService("connectivity");
      if (localConnectivityManager != null)
      {
        NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
        if (localNetworkInfo != null)
        {
          boolean bool = localNetworkInfo.isConnectedOrConnecting();
          if (bool) {
            return true;
          }
        }
      }
      return false;
    }
    catch (Exception localException) {}
    return true;
  }
  
  public static int b()
  {
    try
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)Chartboost.sharedChartboost().getContext().getSystemService("connectivity");
      if (localConnectivityManager != null)
      {
        NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
        if ((localNetworkInfo != null) && (localNetworkInfo.isConnectedOrConnecting()))
        {
          int i = localNetworkInfo.getType();
          if (i == 1) {
            return 1;
          }
          return 2;
        }
        return 0;
      }
      return -1;
    }
    catch (Exception localException) {}
    return -1;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.m
 * JD-Core Version:    0.7.0.1
 */