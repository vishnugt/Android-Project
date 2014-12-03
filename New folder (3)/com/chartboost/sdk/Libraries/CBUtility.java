package com.chartboost.sdk.Libraries;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.chartboost.sdk.Chartboost;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

public class CBUtility
{
  private static String a = null;
  private static final X500Principal b = new X500Principal("CN=Android Debug,O=Android,C=US");
  
  public static int a(int paramInt, Context paramContext)
  {
    return Math.round(paramInt * b(paramContext));
  }
  
  public static SharedPreferences a()
  {
    Chartboost localChartboost = Chartboost.sharedChartboost();
    if (localChartboost.getContext() == null) {
      throw new IllegalStateException("The context must be set through the Chartboost method onCreate() before modifying or accessing preferences.");
    }
    return localChartboost.getContext().getSharedPreferences("cbPrefs", 0);
  }
  
  public static String a(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (!paramMap.keySet().isEmpty()) {
      localStringBuilder.append("?");
    }
    Iterator localIterator = paramMap.keySet().iterator();
    if (!localIterator.hasNext()) {
      return localStringBuilder.toString();
    }
    String str1 = (String)localIterator.next();
    if (localStringBuilder.length() > 1) {
      localStringBuilder.append("&");
    }
    String str2 = paramMap.get(str1).toString();
    if (str1 != null) {}
    for (;;)
    {
      try
      {
        str3 = URLEncoder.encode(str1, "UTF-8");
        localStringBuilder.append(str3);
        localStringBuilder.append("=");
        if (str2 == null) {
          break label170;
        }
        str4 = URLEncoder.encode(str2, "UTF-8");
        localStringBuilder.append(str4);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new RuntimeException("This method requires UTF-8 encoding support", localUnsupportedEncodingException);
      }
      String str3 = "";
      continue;
      label170:
      String str4 = "";
    }
  }
  
  public static List<?> a(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      if (i >= paramJSONArray.length()) {
        return localArrayList;
      }
      try
      {
        Object localObject = paramJSONArray.get(i);
        if ((localObject instanceof JSONObject)) {
          localObject = a((JSONObject)localObject);
        }
        for (;;)
        {
          localArrayList.add(localObject);
          break;
          if ((localObject instanceof JSONArray))
          {
            localObject = a((JSONArray)localObject);
          }
          else
          {
            boolean bool = localObject.equals(JSONObject.NULL);
            if (bool) {
              localObject = null;
            }
          }
        }
      }
      catch (Exception localException)
      {
        i++;
      }
    }
  }
  
  public static Map<String, Object> a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramJSONObject.keys();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localHashMap;
      }
      try
      {
        String str = (String)localIterator.next();
        Object localObject = paramJSONObject.get(str);
        if ((localObject instanceof JSONObject)) {
          localObject = a((JSONObject)localObject);
        }
        for (;;)
        {
          localHashMap.put(str, localObject);
          break;
          if ((localObject instanceof JSONArray))
          {
            localObject = a((JSONArray)localObject);
          }
          else
          {
            boolean bool = localObject.equals(JSONObject.NULL);
            if (bool) {
              localObject = null;
            }
          }
        }
      }
      catch (Exception localException) {}
    }
  }
  
  public static JSONArray a(List<?> paramList)
  {
    if (paramList == null) {
      return null;
    }
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    for (;;)
    {
      if (i >= paramList.size()) {
        return localJSONArray;
      }
      try
      {
        Object localObject = paramList.get(i);
        if ((localObject instanceof Map)) {
          localObject = b((Map)localObject);
        }
        for (;;)
        {
          localJSONArray.put(localObject);
          break;
          if ((localObject instanceof List)) {
            localObject = a((List)localObject);
          } else if (localObject == null) {
            localObject = JSONObject.NULL;
          }
        }
      }
      catch (Exception localException)
      {
        i++;
      }
    }
  }
  
  public static JSONObject a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof JSONObject)) {
      return (JSONObject)paramObject;
    }
    if ((paramObject instanceof Map))
    {
      if (!d.a(new d.g[0]).a(paramObject)) {
        throw new IllegalArgumentException("The given Map must have all String keys in order to be converted to JSON.");
      }
      return new JSONObject((Map)paramObject);
    }
    throw new IllegalArgumentException("The given argument must be either a JSONObject or a Map that can be converted to a JSONObject.");
  }
  
  public static void a(HttpEntity paramHttpEntity)
  {
    try
    {
      paramHttpEntity.consumeContent();
      return;
    }
    catch (Exception localException) {}
  }
  
  public static void a(HttpResponse paramHttpResponse)
  {
    if (paramHttpResponse != null) {}
    try
    {
      if (paramHttpResponse.getEntity() != null) {
        a(paramHttpResponse.getEntity());
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static boolean a(Context paramContext)
  {
    try
    {
      arrayOfSignature = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures;
      k = 0;
      m = 0;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        Signature[] arrayOfSignature;
        int k;
        int n;
        label39:
        int j;
        label57:
        i = 0;
      }
    }
    try
    {
      n = arrayOfSignature.length;
      if (k < n) {
        break label57;
      }
      i = m;
    }
    catch (Exception localException2)
    {
      i = m;
      break label39;
    }
    if ((0x2 & paramContext.getApplicationInfo().flags) != 0) {}
    for (j = 1;; j = 0)
    {
      return i | j;
      boolean bool = ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(arrayOfSignature[k].toByteArray()))).getSubjectX500Principal().equals(b);
      i = bool;
      if (i != 0) {
        break label39;
      }
      k++;
      m = i;
      break;
    }
  }
  
  public static float b(int paramInt, Context paramContext)
  {
    return paramInt * b(paramContext);
  }
  
  public static float b(Context paramContext)
  {
    return paramContext.getResources().getDisplayMetrics().density;
  }
  
  public static String b()
  {
    if (c()) {
      return null;
    }
    if (a != null) {
      return a;
    }
    String str = c.a();
    a = str;
    return str;
  }
  
  public static JSONObject b(Map<?, ?> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramMap.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localJSONObject;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = localEntry.getKey().toString();
      Object localObject = localEntry.getValue();
      try
      {
        if ((localObject instanceof Map)) {
          localObject = b((Map)localObject);
        }
        for (;;)
        {
          localJSONObject.put(str, localObject);
          break;
          if ((localObject instanceof List)) {
            localObject = a((List)localObject);
          } else if (localObject == null) {
            localObject = JSONObject.NULL;
          }
        }
      }
      catch (Exception localException) {}
    }
  }
  
  public static CBOrientation c(Context paramContext)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int i = paramContext.getResources().getConfiguration().orientation;
    int j = localDisplay.getRotation();
    int k;
    int m;
    if (localDisplay.getWidth() == localDisplay.getHeight())
    {
      k = 3;
      if (k != 1) {
        break label123;
      }
      m = 1;
    }
    for (;;)
    {
      label55:
      if ((j == 0) || (j == 2)) {}
      for (;;)
      {
        if (m != 0) {
          switch (j)
          {
          default: 
            return CBOrientation.PORTRAIT;
            if (localDisplay.getWidth() < localDisplay.getHeight())
            {
              k = 1;
              break;
            }
            k = 2;
            break;
            if (k == 2)
            {
              m = 0;
              break label55;
            }
            if (i == 1)
            {
              m = 1;
              break label55;
            }
            if (i != 2) {
              break label228;
            }
            m = 0;
            break label55;
            if (m != 0) {
              m = 0;
            } else {
              m = 1;
            }
            break;
          case 1: 
            return CBOrientation.LANDSCAPE_LEFT;
          case 2: 
            return CBOrientation.PORTRAIT_REVERSE;
          case 3: 
            label123:
            return CBOrientation.LANDSCAPE_RIGHT;
          }
        }
      }
      switch (j)
      {
      default: 
        return CBOrientation.LANDSCAPE;
      case 1: 
        return CBOrientation.PORTRAIT_LEFT;
      case 2: 
        return CBOrientation.LANDSCAPE_REVERSE;
      }
      return CBOrientation.PORTRAIT_RIGHT;
      label228:
      m = 1;
    }
  }
  
  public static boolean c()
  {
    return a().getBoolean("cbIdentityTrackingDisabled", false);
  }
  
  public static boolean d()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  public static void throwProguardError(Exception paramException)
  {
    if ((paramException instanceof NoSuchMethodException)) {
      throw new IllegalStateException("Chartboost library error! Have you used proguard on your application? Make sure to add the line '-keep class com.chartboost.sdk.** { *; }' to your proguard config file.");
    }
    throw new RuntimeException(paramException);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.CBUtility
 * JD-Core Version:    0.7.0.1
 */