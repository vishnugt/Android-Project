package com.mobileapptracker;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONObject;
import org.json.JSONTokener;

final class g
{
  private HttpClient a;
  
  public g()
  {
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    localSchemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
    HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
    HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 8192);
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 60000);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, 60000);
    this.a = new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
  }
  
  public final JSONObject a(String paramString, JSONObject paramJSONObject)
  {
    Object localObject;
    StatusLine localStatusLine;
    StringBuilder localStringBuilder;
    if ((paramJSONObject == null) || (paramJSONObject.length() == 0))
    {
      try
      {
        HttpResponse localHttpResponse1 = this.a.execute(new HttpGet(paramString));
        localObject = localHttpResponse1;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          localException1.printStackTrace();
          localObject = null;
        }
      }
      if (localObject != null) {
        try
        {
          localStatusLine = ((HttpResponse)localObject).getStatusLine();
          if (localStatusLine.getStatusCode() == 200)
          {
            BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(((HttpResponse)localObject).getEntity().getContent(), "UTF-8"));
            localStringBuilder = new StringBuilder();
            for (;;)
            {
              String str = localBufferedReader.readLine();
              if (str == null) {
                break;
              }
              localStringBuilder.append(str).append("\n");
            }
            return null;
          }
        }
        catch (Exception localException2)
        {
          localException2.printStackTrace();
        }
      }
    }
    for (;;)
    {
      try
      {
        StringEntity localStringEntity = new StringEntity(paramJSONObject.toString());
        localStringEntity.setContentType("application/json");
        HttpPost localHttpPost = new HttpPost(paramString);
        localHttpPost.setEntity(localStringEntity);
        HttpResponse localHttpResponse2 = this.a.execute(localHttpPost);
        localObject = localHttpResponse2;
      }
      catch (Exception localException3)
      {
        localException3.printStackTrace();
        localObject = null;
      }
      break;
      if (localStringBuilder.length() > 0) {
        return new JSONObject(new JSONTokener(localStringBuilder.toString()));
      }
      return new JSONObject();
      new StringBuilder("Request failed with status ").append(localStatusLine.getStatusCode()).toString();
      ((HttpResponse)localObject).getEntity().getContent().close();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.mobileapptracker.g
 * JD-Core Version:    0.7.0.1
 */