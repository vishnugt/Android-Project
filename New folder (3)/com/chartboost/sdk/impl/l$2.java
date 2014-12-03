package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import com.chartboost.sdk.Chartboost;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

class l$2
  extends DefaultHttpClient
{
  l$2(Application paramApplication) {}
  
  protected SocketFactory a()
  {
    try
    {
      Class localClass1 = Class.forName("android.net.SSLSessionCache");
      Constructor localConstructor = localClass1.getConstructor(new Class[] { Context.class });
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.a;
      Object localObject = localConstructor.newInstance(arrayOfObject1);
      Class localClass2 = Class.forName("android.net.SSLCertificateSocketFactory");
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = localClass1;
      Method localMethod = localClass2.getMethod("getHttpSocketFactory", arrayOfClass);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(Chartboost.sharedChartboost().getTimeout());
      arrayOfObject2[1] = localObject;
      SocketFactory localSocketFactory = (SocketFactory)localMethod.invoke(null, arrayOfObject2);
      return localSocketFactory;
    }
    catch (Exception localException) {}
    return SSLSocketFactory.getSocketFactory();
  }
  
  protected ClientConnectionManager createClientConnectionManager()
  {
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    localSchemeRegistry.register(new Scheme("https", a(), 443));
    HttpParams localHttpParams = getParams();
    HttpConnectionParams.setConnectionTimeout(localHttpParams, Chartboost.sharedChartboost().getTimeout());
    HttpConnectionParams.setSoTimeout(localHttpParams, Chartboost.sharedChartboost().getTimeout());
    HttpProtocolParams.setUserAgent(localHttpParams, l.a(this.a, HttpProtocolParams.getUserAgent(localHttpParams)));
    return new ThreadSafeClientConnManager(localHttpParams, localSchemeRegistry);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.l.2
 * JD-Core Version:    0.7.0.1
 */