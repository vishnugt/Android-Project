package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Libraries.b;
import com.chartboost.sdk.Libraries.d;
import com.chartboost.sdk.Libraries.d.a;
import com.chartboost.sdk.Libraries.d.g;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class k
{
  private String a;
  private JSONObject b;
  private Map<String, Object> c;
  private Map<String, Object> d;
  private String e;
  private boolean f;
  private d.a g = null;
  
  public k(String paramString)
  {
    this.a = paramString;
    this.e = "POST";
  }
  
  public static k a(JSONObject paramJSONObject)
  {
    try
    {
      k localk = new k(paramJSONObject.getString("path"));
      localk.e = paramJSONObject.getString("method");
      localk.c = CBUtility.a(paramJSONObject.optJSONObject("query"));
      localk.b = paramJSONObject.optJSONObject("body");
      localk.d = CBUtility.a(paramJSONObject.optJSONObject("headers"));
      localk.f = paramJSONObject.getBoolean("ensureDelivery");
      return localk;
    }
    catch (Exception localException) {}
    return null;
  }
  
  /* Error */
  private void b(Context paramContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 77
    //   4: ifeq +176 -> 180
    //   7: aload_1
    //   8: checkcast 77	android/app/Activity
    //   11: astore 7
    //   13: new 79	android/graphics/Rect
    //   16: dup
    //   17: invokespecial 80	android/graphics/Rect:<init>	()V
    //   20: astore 8
    //   22: aload 7
    //   24: invokevirtual 84	android/app/Activity:getWindow	()Landroid/view/Window;
    //   27: invokevirtual 90	android/view/Window:getDecorView	()Landroid/view/View;
    //   30: aload 8
    //   32: invokevirtual 96	android/view/View:getWindowVisibleDisplayFrame	(Landroid/graphics/Rect;)V
    //   35: getstatic 102	android/os/Build$VERSION:SDK_INT	I
    //   38: bipush 9
    //   40: if_icmpge +9 -> 49
    //   43: aload 8
    //   45: iconst_0
    //   46: putfield 105	android/graphics/Rect:top	I
    //   49: aload 8
    //   51: invokevirtual 109	android/graphics/Rect:width	()I
    //   54: istore 9
    //   56: iload 9
    //   58: istore 4
    //   60: aload 8
    //   62: invokevirtual 112	android/graphics/Rect:height	()I
    //   65: istore 11
    //   67: iload 11
    //   69: istore 5
    //   71: aload_1
    //   72: ldc 114
    //   74: invokevirtual 120	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   77: checkcast 122	android/view/WindowManager
    //   80: invokeinterface 126 1 0
    //   85: astore 6
    //   87: iload 4
    //   89: ifle +63 -> 152
    //   92: iload 5
    //   94: ifle +68 -> 162
    //   97: aload_0
    //   98: ldc 128
    //   100: new 130	java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial 131	java/lang/StringBuilder:<init>	()V
    //   107: iload 4
    //   109: invokevirtual 135	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   112: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokevirtual 142	com/chartboost/sdk/impl/k:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   118: aload_0
    //   119: ldc 144
    //   121: new 130	java/lang/StringBuilder
    //   124: dup
    //   125: invokespecial 131	java/lang/StringBuilder:<init>	()V
    //   128: iload 5
    //   130: invokevirtual 135	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   133: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: invokevirtual 142	com/chartboost/sdk/impl/k:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   139: return
    //   140: astore_2
    //   141: iconst_0
    //   142: istore_3
    //   143: iload_3
    //   144: istore 4
    //   146: iconst_0
    //   147: istore 5
    //   149: goto -78 -> 71
    //   152: aload 6
    //   154: invokevirtual 149	android/view/Display:getWidth	()I
    //   157: istore 4
    //   159: goto -67 -> 92
    //   162: aload 6
    //   164: invokevirtual 152	android/view/Display:getHeight	()I
    //   167: istore 5
    //   169: goto -72 -> 97
    //   172: astore 10
    //   174: iload 4
    //   176: istore_3
    //   177: goto -34 -> 143
    //   180: iconst_0
    //   181: istore 5
    //   183: iconst_0
    //   184: istore 4
    //   186: goto -115 -> 71
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	k
    //   0	189	1	paramContext	Context
    //   140	1	2	localException1	Exception
    //   142	35	3	i	int
    //   58	127	4	j	int
    //   69	113	5	k	int
    //   85	78	6	localDisplay	android.view.Display
    //   11	12	7	localActivity	android.app.Activity
    //   20	41	8	localRect	android.graphics.Rect
    //   54	3	9	m	int
    //   172	1	10	localException2	Exception
    //   65	3	11	n	int
    // Exception table:
    //   from	to	target	type
    //   0	49	140	java/lang/Exception
    //   49	56	140	java/lang/Exception
    //   60	67	172	java/lang/Exception
  }
  
  public String a()
  {
    if (this.a.startsWith("/")) {}
    for (String str = "";; str = "/") {
      return str + this.a + CBUtility.a(this.c);
    }
  }
  
  public void a(Context paramContext)
  {
    Chartboost localChartboost = Chartboost.sharedChartboost();
    a("app", Chartboost.sharedChartboost().getAppID());
    if ("sdk".equals(Build.PRODUCT))
    {
      a("model", "Android Simulator");
      a("identity", CBUtility.b());
    }
    for (;;)
    {
      a("device_type", Build.MANUFACTURER + " " + Build.MODEL);
      a("os", "Android " + Build.VERSION.RELEASE);
      a("country", Locale.getDefault().getCountry());
      a("language", Locale.getDefault().getLanguage());
      a("sdk", "3.3.0");
      a("framework", localChartboost.getFramework());
      a("timestamp", String.valueOf(Long.valueOf(new Date().getTime() / 1000L).intValue()));
      a("session", Integer.valueOf(CBUtility.a().getInt("cbPrefSessionCount", 0)));
      int i = m.b();
      if (i != -1) {
        a("reachability", Integer.valueOf(i));
      }
      b(paramContext);
      a("scale", paramContext.getResources().getDisplayMetrics().density);
      try
      {
        String str = paramContext.getPackageName();
        a("bundle", paramContext.getPackageManager().getPackageInfo(str, 128).versionName);
        a("bundle_id", str);
        return;
      }
      catch (Exception localException) {}
      a("model", Build.MODEL);
      a("identity", CBUtility.b());
    }
  }
  
  public void a(String paramString, Object paramObject)
  {
    if (this.b == null) {
      this.b = new JSONObject();
    }
    try
    {
      this.b.put(paramString, paramObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if (this.d == null) {
      this.d = new HashMap();
    }
    this.d.put(paramString1, paramString2);
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void a(d.g... paramVarArgs)
  {
    this.g = d.a(paramVarArgs);
  }
  
  public String b()
  {
    return this.b.toString();
  }
  
  public void b(String paramString1, String paramString2)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.e;
    arrayOfObject[1] = a();
    arrayOfObject[2] = paramString2;
    arrayOfObject[3] = b();
    String str = b.b(b.a(String.format(localLocale, "%s %s\n%s\n%s", arrayOfObject).getBytes()));
    a("X-Chartboost-App", paramString1);
    a("X-Chartboost-Signature", str);
  }
  
  public String c()
  {
    return this.a;
  }
  
  public JSONObject d()
  {
    return this.b;
  }
  
  public Map<String, Object> e()
  {
    return this.d;
  }
  
  public boolean f()
  {
    return this.f;
  }
  
  public d.a g()
  {
    return this.g;
  }
  
  public JSONObject h()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("path", this.a);
      localJSONObject.put("method", this.e);
      localJSONObject.put("query", CBUtility.b(this.c));
      localJSONObject.put("body", this.b);
      localJSONObject.put("headers", CBUtility.b(this.d));
      localJSONObject.put("ensureDelivery", this.f);
      return localJSONObject;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.k
 * JD-Core Version:    0.7.0.1
 */