package com.chartboost.sdk.special;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Chartboost.CBAPIResponseCallback;
import com.chartboost.sdk.Libraries.CBUtility;
import java.lang.reflect.Method;

public final class ChartboostData
{
  public static void get(String paramString, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    Chartboost localChartboost = Chartboost.sharedChartboost();
    try
    {
      Method localMethod = Chartboost.class.getDeclaredMethod("cacheInterstitialData", new Class[] { String.class, Chartboost.CBAPIResponseCallback.class });
      localMethod.setAccessible(true);
      localMethod.invoke(localChartboost, new Object[] { paramString, paramCBAPIResponseCallback });
      return;
    }
    catch (Exception localException)
    {
      do
      {
        CBUtility.throwProguardError(localException);
      } while (paramCBAPIResponseCallback == null);
      paramCBAPIResponseCallback.onFailure(localException.toString());
    }
  }
  
  public static void getBatch(String paramString, int paramInt, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    Chartboost localChartboost = Chartboost.sharedChartboost();
    try
    {
      Class[] arrayOfClass = new Class[3];
      arrayOfClass[0] = String.class;
      arrayOfClass[1] = Integer.TYPE;
      arrayOfClass[2] = Chartboost.CBAPIResponseCallback.class;
      Method localMethod = Chartboost.class.getDeclaredMethod("cacheInterstitialDataBatch", arrayOfClass);
      localMethod.setAccessible(true);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = Integer.valueOf(paramInt);
      arrayOfObject[2] = paramCBAPIResponseCallback;
      localMethod.invoke(localChartboost, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      do
      {
        CBUtility.throwProguardError(localException);
      } while (paramCBAPIResponseCallback == null);
      paramCBAPIResponseCallback.onFailure(localException.toString());
    }
  }
  
  public static void show(String paramString, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    Chartboost localChartboost = Chartboost.sharedChartboost();
    try
    {
      Method localMethod = Chartboost.class.getDeclaredMethod("showInterstitialData", new Class[] { String.class, Chartboost.CBAPIResponseCallback.class });
      localMethod.setAccessible(true);
      localMethod.invoke(localChartboost, new Object[] { paramString, paramCBAPIResponseCallback });
      return;
    }
    catch (Exception localException)
    {
      do
      {
        CBUtility.throwProguardError(localException);
      } while (paramCBAPIResponseCallback == null);
      paramCBAPIResponseCallback.onFailure(localException.toString());
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.special.ChartboostData
 * JD-Core Version:    0.7.0.1
 */