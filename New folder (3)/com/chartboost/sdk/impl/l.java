package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import com.chartboost.sdk.Chartboost;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

public class l
{
  private static ExecutorService a = null;
  private static ThreadFactory b = null;
  private static HttpClient c = null;
  
  public static ExecutorService a()
  {
    if (b == null) {
      b = new l.1();
    }
    if (a == null) {
      a = Executors.newFixedThreadPool(5, b);
    }
    return a;
  }
  
  private static String b(Application paramApplication, String paramString)
  {
    try
    {
      String str = paramApplication.getPackageManager().getPackageInfo(paramApplication.getPackageName(), 0).versionName;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramApplication.getPackageName());
      localStringBuilder.append("/");
      localStringBuilder.append(str);
      localStringBuilder.append(" (");
      localStringBuilder.append("Linux; U; Android ");
      localStringBuilder.append(Build.VERSION.RELEASE);
      localStringBuilder.append("; ");
      localStringBuilder.append(Locale.getDefault());
      localStringBuilder.append("; ");
      localStringBuilder.append(Build.PRODUCT);
      localStringBuilder.append(")");
      if (paramString != null)
      {
        localStringBuilder.append(" ");
        localStringBuilder.append(paramString);
      }
      return localStringBuilder.toString();
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException(localNameNotFoundException);
    }
  }
  
  protected static HttpClient b()
  {
    if (c != null) {
      return c;
    }
    try
    {
      l.2 local2 = new l.2((Application)Chartboost.sharedChartboost().getContext().getApplicationContext());
      c = local2;
      return local2;
    }
    catch (Exception localException1)
    {
      try
      {
        DefaultHttpClient localDefaultHttpClient1 = new DefaultHttpClient();
        ClientConnectionManager localClientConnectionManager = localDefaultHttpClient1.getConnectionManager();
        HttpParams localHttpParams = localDefaultHttpClient1.getParams();
        DefaultHttpClient localDefaultHttpClient3 = new DefaultHttpClient(new ThreadSafeClientConnManager(localHttpParams, localClientConnectionManager.getSchemeRegistry()), localHttpParams);
        c = localDefaultHttpClient3;
        return localDefaultHttpClient3;
      }
      catch (Exception localException2)
      {
        DefaultHttpClient localDefaultHttpClient2 = new DefaultHttpClient();
        c = localDefaultHttpClient2;
        return localDefaultHttpClient2;
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.l
 * JD-Core Version:    0.7.0.1
 */