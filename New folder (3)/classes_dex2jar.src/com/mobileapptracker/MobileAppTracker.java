package com.mobileapptracker;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.provider.Settings.Secure;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class MobileAppTracker
{
  public static final int GENDER_FEMALE = 1;
  public static final int GENDER_MALE;
  private static final Uri a = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
  private static final List b = Arrays.asList(new String[] { "ir", "d", "db", "dm", "ma", "ov", "cc", "l", "an", "pn", "av", "dc", "ad", "android_id_md5", "android_id_sha1", "android_id_sha256", "r", "c", "id", "ua", "tpid", "ar", "ti", "age", "gender", "latitude", "longitude", "altitude", "connection_type", "mobile_country_code", "mobile_network_code", "screen_density", "screen_layout_size", "android_purchase_status", "referral_source", "referral_url", "app_ad_tracking", "facebook_user_id", "google_user_id", "twitter_user_id" });
  private MATResponse c;
  private g d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private ConcurrentHashMap k;
  private Context l;
  private Encryption m;
  private ScheduledExecutorService n;
  private Semaphore o;
  private SharedPreferences p;
  
  public MobileAppTracker(Context paramContext, String paramString1, String paramString2)
  {
    this(paramContext, paramString1, paramString2, true, true);
  }
  
  public MobileAppTracker(Context paramContext, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.l = paramContext.getApplicationContext();
    this.n = Executors.newSingleThreadScheduledExecutor();
    this.o = new Semaphore(1, true);
    this.d = new g();
    this.m = new Encryption(paramString2.trim(), "heF9BATUfWuISyO8");
    this.g = paramBoolean1;
    this.h = paramBoolean2;
    this.e = false;
    this.f = false;
    this.i = false;
    this.j = false;
    this.j = a(paramContext, paramString1);
    this.p = paramContext.getSharedPreferences("mat_queue", 0);
    if ((this.j) && (a() > 0) && (b(paramContext))) {}
    try
    {
      b();
      c localc = new c(this);
      if (this.e)
      {
        paramContext.getApplicationContext().unregisterReceiver(localc);
        this.e = false;
      }
      IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      paramContext.getApplicationContext().registerReceiver(localc, localIntentFilter);
      this.e = true;
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Thread.currentThread().interrupt();
      }
    }
  }
  
  private int a()
  {
    return this.p.getInt("queuesize", 0);
  }
  
  private int a(String paramString1, String paramString2, double paramDouble, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    label288:
    label299:
    for (;;)
    {
      int i4;
      String str1;
      try
      {
        boolean bool1 = this.j;
        if (!bool1)
        {
          i4 = -1;
          return i4;
        }
        if (b(this.l))
        {
          int i5 = a();
          if (i5 <= 0) {}
        }
        int i2;
        try
        {
          b();
          this.k.remove("ei");
          this.k.remove("en");
          this.k.remove("ar");
          this.k.remove("r");
          b("ac", "conversion");
          char[] arrayOfChar = paramString1.toCharArray();
          int i1 = arrayOfChar.length;
          i2 = 0;
          if (i2 >= i1) {
            break label209;
          }
          if (Character.isLetter(arrayOfChar[i2]))
          {
            i3 = 1;
            if (i3 == 0) {
              break label288;
            }
            if (!paramString1.equals("open")) {
              break label215;
            }
            b("ac", "open");
            str1 = c();
            if (str1 != null) {
              break label299;
            }
            i4 = -1;
          }
        }
        catch (InterruptedException localInterruptedException2)
        {
          localInterruptedException2.printStackTrace();
          Thread.currentThread().interrupt();
          continue;
        }
        i2++;
      }
      finally {}
      continue;
      label209:
      int i3 = 0;
      continue;
      label215:
      if (paramString1.equals("close"))
      {
        i4 = -1;
      }
      else if (paramString1.equals("install"))
      {
        b("ac", "install");
      }
      else if (paramString1.equals("update"))
      {
        b("ac", "update");
      }
      else
      {
        b("en", paramString1);
        continue;
        b("ei", paramString1);
        continue;
        String str2 = getAction();
        boolean bool2 = b(this.l);
        if (bool2)
        {
          try
          {
            if ((getReferrer() == null) || ((getInstallLogId() == null) && (getUpdateLogId() == null))) {
              this.n.schedule(new d(this, str1, paramString2, str2, paramDouble, paramString3, paramString4, paramString5, paramString6, true), 10000L, TimeUnit.MILLISECONDS);
            } else {
              this.n.execute(new d(this, str1, paramString2, str2, paramDouble, paramString3, paramString4, paramString5, paramString6, true));
            }
          }
          catch (Exception localException)
          {
            if (!this.i) {
              break label480;
            }
          }
          localException.printStackTrace();
        }
        else if (!str2.equals("open"))
        {
          try
          {
            a(str1, paramString2, str2, paramDouble, paramString3, paramString4, paramString5, paramString6, true);
          }
          catch (InterruptedException localInterruptedException1)
          {
            Thread.currentThread().interrupt();
          }
        }
        label480:
        i4 = 1;
      }
    }
  }
  
  private String a(String paramString1, String paramString2, double paramDouble, String paramString3, String paramString4)
  {
    StringBuilder localStringBuilder1 = new StringBuilder(paramString1);
    setRevenue(paramDouble);
    if (paramString3 != null) {
      setCurrencyCode(paramString3);
    }
    setRefId(paramString4);
    if ((getReferrer() == null) || (getReferrer().length() == 0)) {
      setReferrer(this.l.getSharedPreferences("mat_referrer", 0).getString("referrer", ""));
    }
    Object localObject1;
    if ((paramString2.equals("open")) || (paramString2.equals("conversion"))) {
      if (getInstallLogId().length() > 0)
      {
        localStringBuilder1.append("&install_log_id=" + getInstallLogId());
        localObject1 = localStringBuilder1;
      }
    }
    for (;;)
    {
      try
      {
        ContentResolver localContentResolver = this.l.getContentResolver();
        String[] arrayOfString = { "aid" };
        localCursor = localContentResolver.query(a, arrayOfString, null, null, null);
        if (localCursor == null) {
          break label1046;
        }
        if (localCursor.moveToFirst()) {
          continue;
        }
      }
      catch (Exception localException1)
      {
        Cursor localCursor;
        SharedPreferences localSharedPreferences;
        Object localObject2;
        localException1.printStackTrace();
        continue;
      }
      if (str4 != null) {
        ((StringBuilder)localObject1).append("&fb_cookie_id=").append(str4);
      }
      localSharedPreferences = this.l.getSharedPreferences("mat_fb_intent", 0);
      localObject2 = localSharedPreferences.getString("action", "");
      if (((String)localObject2).length() != 0) {}
      try
      {
        String str3 = URLEncoder.encode((String)localObject2, "UTF-8");
        localObject2 = str3;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        SharedPreferences.Editor localEditor;
        Iterator localIterator;
        String str2;
        StringBuilder localStringBuilder4;
        StringBuilder localStringBuilder5;
        String str5;
        Object localObject4;
        localUnsupportedEncodingException2.printStackTrace();
        continue;
        localObject3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date());
      }
      ((StringBuilder)localObject1).append("&source=").append((String)localObject2);
      localEditor = localSharedPreferences.edit();
      localEditor.remove("action");
      localEditor.commit();
      StringBuilder localStringBuilder2 = new StringBuilder();
      localIterator = b.iterator();
      if (localIterator.hasNext())
      {
        str2 = (String)localIterator.next();
        if (this.k.get(str2) == null) {
          continue;
        }
        localStringBuilder2.append("&").append(str2).append("=").append((String)this.k.get(str2));
        continue;
        if (getUpdateLogId().length() > 0)
        {
          localStringBuilder1.append("&update_log_id=" + getUpdateLogId());
          localObject1 = localStringBuilder1;
          continue;
        }
        if (a("mat_last_log_id", "lastLogIdDate"))
        {
          localStringBuilder4 = new StringBuilder("https://engine.mobileapptracking.com/v1/Integrations/Sdk/GetLog?sdk=android&package_name=").append(getPackageName()).append("&advertiser_id=").append(getAdvertiserId()).append("&keys[mac_address]=").append(getMacAddress()).append("&keys[device_id]=").append(getDeviceId());
          localStringBuilder5 = new StringBuilder("package_name=").append(getPackageName());
          try
          {
            localStringBuilder6 = new StringBuilder(Encryption.bytesToHex(this.m.encrypt(localStringBuilder5.toString())));
            localStringBuilder4.append("&data=").append(localStringBuilder6.toString());
            str5 = "";
            localObject4 = "";
            JSONObject localJSONObject1 = this.d.a(localStringBuilder4.toString(), null);
            if ((localJSONObject1 != null) && (!localJSONObject1.isNull("data"))) {}
            try
            {
              JSONObject localJSONObject2 = localJSONObject1.getJSONObject("data");
              str5 = localJSONObject2.getString("log_id");
              String str6 = localJSONObject2.getString("type");
              localObject4 = str6;
            }
            catch (Exception localException3)
            {
              localException3.printStackTrace();
              continue;
            }
            if (str5.length() <= 0) {
              continue;
            }
            if (((String)localObject4).equals("install"))
            {
              e(str5);
              localStringBuilder1.append("&install_log_id=" + str5);
              localObject1 = localStringBuilder1;
            }
          }
          catch (Exception localException4)
          {
            localException4.printStackTrace();
            StringBuilder localStringBuilder6 = localStringBuilder5;
            continue;
          }
          if (!((String)localObject4).equals("update")) {
            break label1039;
          }
          f(str5);
          localStringBuilder1.append("&update_log_id=" + str5);
          localObject1 = localStringBuilder1;
          continue;
          if (!paramString2.equals("open")) {
            break label1039;
          }
          localStringBuilder7 = new StringBuilder(localStringBuilder1.toString().replace("serve", "serve_no_log"));
          localObject1 = localStringBuilder7;
          continue;
        }
        if (paramString2.equals("open"))
        {
          localObject1 = new StringBuilder(localStringBuilder1.toString().replace("serve", "serve_no_log"));
          continue;
          str4 = localCursor.getString(localCursor.getColumnIndex("aid"));
          localCursor.close();
          continue;
        }
      }
      else
      {
        try
        {
          String str1 = URLEncoder.encode((String)localObject3, "UTF-8");
          localObject3 = str1;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException1)
        {
          try
          {
            Object localObject3;
            localStringBuilder3 = new StringBuilder(Encryption.bytesToHex(this.m.encrypt(localStringBuilder2.toString())));
            ((StringBuilder)localObject1).append("&da=").append(localStringBuilder3.toString());
            return ((StringBuilder)localObject1).toString();
            localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
            localUnsupportedEncodingException1.printStackTrace();
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              localException2.printStackTrace();
              StringBuilder localStringBuilder3 = localStringBuilder2;
            }
          }
        }
        localStringBuilder2.append("&sd=").append((String)localObject3);
      }
      localObject1 = localStringBuilder1;
      continue;
      label1039:
      StringBuilder localStringBuilder7 = localStringBuilder1;
      continue;
      label1046:
      String str4 = null;
    }
  }
  
  private void a(int paramInt)
  {
    SharedPreferences.Editor localEditor = this.p.edit();
    if (paramInt < 0) {
      paramInt = 0;
    }
    localEditor.putInt("queuesize", paramInt);
    localEditor.commit();
  }
  
  private void a(String paramString)
  {
    b("ac", paramString);
  }
  
  /* Error */
  private void a(String paramString1, String paramString2, String paramString3, double paramDouble, String paramString4, String paramString5, String paramString6, String paramString7, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 166	com/mobileapptracker/MobileAppTracker:o	Ljava/util/concurrent/Semaphore;
    //   4: invokevirtual 573	java/util/concurrent/Semaphore:acquire	()V
    //   7: new 500	org/json/JSONObject
    //   10: dup
    //   11: invokespecial 574	org/json/JSONObject:<init>	()V
    //   14: astore 11
    //   16: aload 11
    //   18: ldc_w 576
    //   21: aload_1
    //   22: invokevirtual 580	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   25: pop
    //   26: aload_2
    //   27: ifnull +13 -> 40
    //   30: aload 11
    //   32: ldc_w 582
    //   35: aload_2
    //   36: invokevirtual 580	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   39: pop
    //   40: aload 11
    //   42: ldc_w 408
    //   45: aload_3
    //   46: invokevirtual 580	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   49: pop
    //   50: aload 11
    //   52: ldc_w 584
    //   55: dload 4
    //   57: invokevirtual 587	org/json/JSONObject:put	(Ljava/lang/String;D)Lorg/json/JSONObject;
    //   60: pop
    //   61: aload 6
    //   63: ifnonnull +8 -> 71
    //   66: ldc_w 589
    //   69: astore 6
    //   71: aload 11
    //   73: ldc_w 591
    //   76: aload 6
    //   78: invokevirtual 580	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   81: pop
    //   82: aload 7
    //   84: ifnull +14 -> 98
    //   87: aload 11
    //   89: ldc_w 593
    //   92: aload 7
    //   94: invokevirtual 580	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   97: pop
    //   98: aload 8
    //   100: ifnull +14 -> 114
    //   103: aload 11
    //   105: ldc_w 595
    //   108: aload 8
    //   110: invokevirtual 580	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   113: pop
    //   114: aload 9
    //   116: ifnull +14 -> 130
    //   119: aload 11
    //   121: ldc_w 597
    //   124: aload 9
    //   126: invokevirtual 580	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   129: pop
    //   130: aload 11
    //   132: ldc_w 599
    //   135: iload 10
    //   137: invokevirtual 602	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   140: pop
    //   141: aload_0
    //   142: getfield 207	com/mobileapptracker/MobileAppTracker:p	Landroid/content/SharedPreferences;
    //   145: invokeinterface 421 1 0
    //   150: astore 23
    //   152: iconst_1
    //   153: aload_0
    //   154: invokespecial 210	com/mobileapptracker/MobileAppTracker:a	()I
    //   157: iadd
    //   158: istore 24
    //   160: aload_0
    //   161: iload 24
    //   163: invokespecial 604	com/mobileapptracker/MobileAppTracker:a	(I)V
    //   166: aload 23
    //   168: iload 24
    //   170: invokestatic 610	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   173: invokevirtual 611	java/lang/Integer:toString	()Ljava/lang/String;
    //   176: aload 11
    //   178: invokevirtual 612	org/json/JSONObject:toString	()Ljava/lang/String;
    //   181: invokeinterface 616 3 0
    //   186: pop
    //   187: aload 23
    //   189: invokeinterface 429 1 0
    //   194: pop
    //   195: aload_0
    //   196: getfield 166	com/mobileapptracker/MobileAppTracker:o	Ljava/util/concurrent/Semaphore;
    //   199: invokevirtual 619	java/util/concurrent/Semaphore:release	()V
    //   202: return
    //   203: astore 13
    //   205: aload_0
    //   206: getfield 194	com/mobileapptracker/MobileAppTracker:i	Z
    //   209: ifeq +8 -> 217
    //   212: aload 13
    //   214: invokevirtual 620	org/json/JSONException:printStackTrace	()V
    //   217: aload_0
    //   218: getfield 166	com/mobileapptracker/MobileAppTracker:o	Ljava/util/concurrent/Semaphore;
    //   221: invokevirtual 619	java/util/concurrent/Semaphore:release	()V
    //   224: return
    //   225: astore 12
    //   227: aload_0
    //   228: getfield 166	com/mobileapptracker/MobileAppTracker:o	Ljava/util/concurrent/Semaphore;
    //   231: invokevirtual 619	java/util/concurrent/Semaphore:release	()V
    //   234: aload 12
    //   236: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	this	MobileAppTracker
    //   0	237	1	paramString1	String
    //   0	237	2	paramString2	String
    //   0	237	3	paramString3	String
    //   0	237	4	paramDouble	double
    //   0	237	6	paramString4	String
    //   0	237	7	paramString5	String
    //   0	237	8	paramString6	String
    //   0	237	9	paramString7	String
    //   0	237	10	paramBoolean	boolean
    //   14	163	11	localJSONObject	JSONObject
    //   225	10	12	localObject	Object
    //   203	10	13	localJSONException	org.json.JSONException
    //   150	38	23	localEditor	SharedPreferences.Editor
    //   158	11	24	i1	int
    // Exception table:
    //   from	to	target	type
    //   16	26	203	org/json/JSONException
    //   30	40	203	org/json/JSONException
    //   40	61	203	org/json/JSONException
    //   71	82	203	org/json/JSONException
    //   87	98	203	org/json/JSONException
    //   103	114	203	org/json/JSONException
    //   119	130	203	org/json/JSONException
    //   130	141	203	org/json/JSONException
    //   7	16	225	finally
    //   16	26	225	finally
    //   30	40	225	finally
    //   40	61	225	finally
    //   71	82	225	finally
    //   87	98	225	finally
    //   103	114	225	finally
    //   119	130	225	finally
    //   130	141	225	finally
    //   141	195	225	finally
    //   205	217	225	finally
  }
  
  private void a(SimpleDateFormat paramSimpleDateFormat, Calendar paramCalendar, String paramString1, String paramString2)
  {
    String str = paramSimpleDateFormat.format(paramCalendar.getTime());
    SharedPreferences.Editor localEditor = this.l.getSharedPreferences(paramString1, 0).edit();
    localEditor.putString(paramString2, str);
    localEditor.commit();
  }
  
  /* Error */
  private boolean a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: new 262	java/util/concurrent/ConcurrentHashMap
    //   4: dup
    //   5: invokespecial 632	java/util/concurrent/ConcurrentHashMap:<init>	()V
    //   8: putfield 258	com/mobileapptracker/MobileAppTracker:k	Ljava/util/concurrent/ConcurrentHashMap;
    //   11: aload_1
    //   12: ldc_w 634
    //   15: invokevirtual 637	android/content/Context:checkCallingOrSelfPermission	(Ljava/lang/String;)I
    //   18: ifne +783 -> 801
    //   21: iconst_1
    //   22: istore_3
    //   23: aload_1
    //   24: ldc_w 639
    //   27: invokevirtual 637	android/content/Context:checkCallingOrSelfPermission	(Ljava/lang/String;)I
    //   30: ifne +776 -> 806
    //   33: iconst_1
    //   34: istore 4
    //   36: aload_0
    //   37: aload_2
    //   38: invokevirtual 177	java/lang/String:trim	()Ljava/lang/String;
    //   41: invokevirtual 642	com/mobileapptracker/MobileAppTracker:setAdvertiserId	(Ljava/lang/String;)V
    //   44: aload_0
    //   45: ldc_w 272
    //   48: invokespecial 644	com/mobileapptracker/MobileAppTracker:a	(Ljava/lang/String;)V
    //   51: aload_1
    //   52: invokevirtual 645	android/content/Context:getPackageName	()Ljava/lang/String;
    //   55: astore 6
    //   57: aload_0
    //   58: aload 6
    //   60: invokevirtual 648	com/mobileapptracker/MobileAppTracker:setPackageName	(Ljava/lang/String;)V
    //   63: aload_1
    //   64: invokevirtual 652	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   67: astore 7
    //   69: aload_0
    //   70: ldc 65
    //   72: aload 7
    //   74: aload 7
    //   76: aload 6
    //   78: iconst_0
    //   79: invokevirtual 658	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   82: invokevirtual 662	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   85: invokevirtual 663	java/lang/Object:toString	()Ljava/lang/String;
    //   88: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: new 552	java/util/Date
    //   94: dup
    //   95: new 665	java/io/File
    //   98: dup
    //   99: aload 7
    //   101: aload 6
    //   103: iconst_0
    //   104: invokevirtual 658	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   107: getfield 671	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   110: invokespecial 672	java/io/File:<init>	(Ljava/lang/String;)V
    //   113: invokevirtual 676	java/io/File:lastModified	()J
    //   116: invokespecial 679	java/util/Date:<init>	(J)V
    //   119: astore 30
    //   121: new 539	java/text/SimpleDateFormat
    //   124: dup
    //   125: ldc_w 541
    //   128: getstatic 547	java/util/Locale:US	Ljava/util/Locale;
    //   131: invokespecial 550	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   134: astore 31
    //   136: aload 31
    //   138: ldc_w 681
    //   141: invokestatic 687	java/util/TimeZone:getTimeZone	(Ljava/lang/String;)Ljava/util/TimeZone;
    //   144: invokevirtual 691	java/text/SimpleDateFormat:setTimeZone	(Ljava/util/TimeZone;)V
    //   147: aload_0
    //   148: ldc 84
    //   150: aload 31
    //   152: aload 30
    //   154: invokevirtual 557	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   157: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   160: aload_0
    //   161: aload 7
    //   163: aload 6
    //   165: iconst_0
    //   166: invokevirtual 695	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   169: getfield 700	android/content/pm/PackageInfo:versionCode	I
    //   172: invokespecial 702	com/mobileapptracker/MobileAppTracker:b	(I)V
    //   175: aload_0
    //   176: ldc 56
    //   178: getstatic 707	android/os/Build:MODEL	Ljava/lang/String;
    //   181: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   184: aload_0
    //   185: ldc 54
    //   187: getstatic 710	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   190: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: aload_0
    //   194: ldc 60
    //   196: getstatic 715	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   199: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: aload_0
    //   203: ldc 110
    //   205: aload_1
    //   206: invokevirtual 719	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   209: invokevirtual 725	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   212: getfield 731	android/util/DisplayMetrics:density	F
    //   215: invokestatic 736	java/lang/Float:toString	(F)Ljava/lang/String;
    //   218: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   221: aload_1
    //   222: ldc_w 738
    //   225: invokevirtual 742	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   228: checkcast 744	android/view/WindowManager
    //   231: astore 12
    //   233: getstatic 747	android/os/Build$VERSION:SDK_INT	I
    //   236: bipush 13
    //   238: if_icmplt +470 -> 708
    //   241: new 749	android/graphics/Point
    //   244: dup
    //   245: invokespecial 750	android/graphics/Point:<init>	()V
    //   248: astore 13
    //   250: aload 12
    //   252: invokeinterface 754 1 0
    //   257: aload 13
    //   259: invokevirtual 760	android/view/Display:getSize	(Landroid/graphics/Point;)V
    //   262: aload 13
    //   264: getfield 763	android/graphics/Point:x	I
    //   267: istore 14
    //   269: aload 13
    //   271: getfield 766	android/graphics/Point:y	I
    //   274: istore 15
    //   276: aload_0
    //   277: ldc 112
    //   279: new 348	java/lang/StringBuilder
    //   282: dup
    //   283: invokespecial 430	java/lang/StringBuilder:<init>	()V
    //   286: iload 14
    //   288: invokestatic 768	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   291: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: ldc_w 769
    //   297: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: iload 15
    //   302: invokestatic 768	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   305: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: invokevirtual 384	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   311: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   314: aload_1
    //   315: ldc_w 771
    //   318: invokevirtual 742	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   321: checkcast 773	android/net/ConnectivityManager
    //   324: iconst_1
    //   325: invokevirtual 777	android/net/ConnectivityManager:getNetworkInfo	(I)Landroid/net/NetworkInfo;
    //   328: invokevirtual 782	android/net/NetworkInfo:isConnected	()Z
    //   331: ifeq +404 -> 735
    //   334: aload_0
    //   335: ldc_w 784
    //   338: invokespecial 786	com/mobileapptracker/MobileAppTracker:c	(Ljava/lang/String;)V
    //   341: aload_0
    //   342: ldc 63
    //   344: invokestatic 790	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   347: getstatic 547	java/util/Locale:US	Ljava/util/Locale;
    //   350: invokevirtual 794	java/util/Locale:getDisplayLanguage	(Ljava/util/Locale;)Ljava/lang/String;
    //   353: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   356: aload_1
    //   357: ldc_w 796
    //   360: invokevirtual 742	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   363: checkcast 798	android/telephony/TelephonyManager
    //   366: astore 16
    //   368: aload 16
    //   370: ifnull +416 -> 786
    //   373: aload 16
    //   375: invokevirtual 801	android/telephony/TelephonyManager:getNetworkCountryIso	()Ljava/lang/String;
    //   378: ifnull +367 -> 745
    //   381: aload_0
    //   382: aload 16
    //   384: invokevirtual 801	android/telephony/TelephonyManager:getNetworkCountryIso	()Ljava/lang/String;
    //   387: invokespecial 803	com/mobileapptracker/MobileAppTracker:d	(Ljava/lang/String;)V
    //   390: aload_0
    //   391: ldc 71
    //   393: aload 16
    //   395: invokevirtual 806	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   398: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   401: aload 16
    //   403: invokevirtual 809	android/telephony/TelephonyManager:getNetworkOperator	()Ljava/lang/String;
    //   406: astore 17
    //   408: aload 17
    //   410: ifnull +36 -> 446
    //   413: aload 17
    //   415: iconst_0
    //   416: iconst_3
    //   417: invokevirtual 813	java/lang/String:substring	(II)Ljava/lang/String;
    //   420: astore 28
    //   422: aload 17
    //   424: iconst_3
    //   425: invokevirtual 815	java/lang/String:substring	(I)Ljava/lang/String;
    //   428: astore 29
    //   430: aload_0
    //   431: ldc 106
    //   433: aload 28
    //   435: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   438: aload_0
    //   439: ldc 108
    //   441: aload 29
    //   443: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   446: new 817	android/os/Handler
    //   449: dup
    //   450: invokestatic 823	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   453: invokespecial 826	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   456: new 828	com/mobileapptracker/e
    //   459: dup
    //   460: aload_0
    //   461: aload_1
    //   462: invokespecial 831	com/mobileapptracker/e:<init>	(Lcom/mobileapptracker/MobileAppTracker;Landroid/content/Context;)V
    //   465: invokevirtual 835	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   468: pop
    //   469: aload_0
    //   470: iconst_0
    //   471: invokevirtual 839	com/mobileapptracker/MobileAppTracker:setLimitAdTrackingEnabled	(Z)V
    //   474: aload_0
    //   475: ldc_w 589
    //   478: invokevirtual 356	com/mobileapptracker/MobileAppTracker:setCurrencyCode	(Ljava/lang/String;)V
    //   481: aload_1
    //   482: ldc_w 841
    //   485: iconst_0
    //   486: invokevirtual 205	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   489: astore 19
    //   491: aload 19
    //   493: ldc_w 841
    //   496: ldc_w 368
    //   499: invokeinterface 372 3 0
    //   504: astore 20
    //   506: aload 20
    //   508: invokevirtual 362	java/lang/String:length	()I
    //   511: ifne +41 -> 552
    //   514: invokestatic 847	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   517: invokevirtual 848	java/util/UUID:toString	()Ljava/lang/String;
    //   520: astore 20
    //   522: aload 19
    //   524: invokeinterface 421 1 0
    //   529: astore 23
    //   531: aload 23
    //   533: ldc_w 841
    //   536: aload 20
    //   538: invokeinterface 616 3 0
    //   543: pop
    //   544: aload 23
    //   546: invokeinterface 429 1 0
    //   551: pop
    //   552: aload_0
    //   553: ldc_w 850
    //   556: aload 20
    //   558: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   561: aload_0
    //   562: aload_1
    //   563: invokevirtual 388	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   566: ldc_w 852
    //   569: invokestatic 857	android/provider/Settings$Secure:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   572: invokespecial 859	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;)V
    //   575: aload_0
    //   576: getfield 186	com/mobileapptracker/MobileAppTracker:g	Z
    //   579: ifeq +26 -> 605
    //   582: iload_3
    //   583: ifeq +22 -> 605
    //   586: aload_0
    //   587: ldc 52
    //   589: aload_1
    //   590: ldc_w 796
    //   593: invokevirtual 742	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   596: checkcast 798	android/telephony/TelephonyManager
    //   599: invokevirtual 860	android/telephony/TelephonyManager:getDeviceId	()Ljava/lang/String;
    //   602: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   605: aload_0
    //   606: getfield 188	com/mobileapptracker/MobileAppTracker:h	Z
    //   609: ifeq +190 -> 799
    //   612: iload 4
    //   614: ifeq +185 -> 799
    //   617: aload_1
    //   618: ldc_w 862
    //   621: invokevirtual 742	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   624: checkcast 864	android/net/wifi/WifiManager
    //   627: astore 21
    //   629: aload 21
    //   631: ifnull +168 -> 799
    //   634: aload 21
    //   636: invokevirtual 868	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   639: astore 22
    //   641: aload 22
    //   643: ifnull +156 -> 799
    //   646: aload 22
    //   648: invokevirtual 871	android/net/wifi/WifiInfo:getMacAddress	()Ljava/lang/String;
    //   651: ifnull +148 -> 799
    //   654: aload_0
    //   655: ldc 58
    //   657: aload 22
    //   659: invokevirtual 871	android/net/wifi/WifiInfo:getMacAddress	()Ljava/lang/String;
    //   662: invokespecial 274	com/mobileapptracker/MobileAppTracker:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   665: iconst_1
    //   666: ireturn
    //   667: astore 8
    //   669: aload_0
    //   670: getfield 194	com/mobileapptracker/MobileAppTracker:i	Z
    //   673: pop
    //   674: goto -514 -> 160
    //   677: astore 10
    //   679: aload_0
    //   680: getfield 194	com/mobileapptracker/MobileAppTracker:i	Z
    //   683: pop
    //   684: aload_0
    //   685: iconst_0
    //   686: invokespecial 702	com/mobileapptracker/MobileAppTracker:b	(I)V
    //   689: goto -514 -> 175
    //   692: astore 5
    //   694: aload_0
    //   695: getfield 194	com/mobileapptracker/MobileAppTracker:i	Z
    //   698: ifeq +8 -> 706
    //   701: aload 5
    //   703: invokevirtual 337	java/lang/Exception:printStackTrace	()V
    //   706: iconst_0
    //   707: ireturn
    //   708: aload 12
    //   710: invokeinterface 754 1 0
    //   715: invokevirtual 874	android/view/Display:getWidth	()I
    //   718: istore 14
    //   720: aload 12
    //   722: invokeinterface 754 1 0
    //   727: invokevirtual 877	android/view/Display:getHeight	()I
    //   730: istore 15
    //   732: goto -456 -> 276
    //   735: aload_0
    //   736: ldc_w 879
    //   739: invokespecial 786	com/mobileapptracker/MobileAppTracker:c	(Ljava/lang/String;)V
    //   742: goto -401 -> 341
    //   745: aload_0
    //   746: getfield 186	com/mobileapptracker/MobileAppTracker:g	Z
    //   749: ifeq -359 -> 390
    //   752: iload_3
    //   753: ifeq -363 -> 390
    //   756: aload 16
    //   758: invokevirtual 882	android/telephony/TelephonyManager:getSimCountryIso	()Ljava/lang/String;
    //   761: ifnull -371 -> 390
    //   764: aload_0
    //   765: aload 16
    //   767: invokevirtual 882	android/telephony/TelephonyManager:getSimCountryIso	()Ljava/lang/String;
    //   770: invokespecial 803	com/mobileapptracker/MobileAppTracker:d	(Ljava/lang/String;)V
    //   773: goto -383 -> 390
    //   776: astore 26
    //   778: aload_0
    //   779: getfield 194	com/mobileapptracker/MobileAppTracker:i	Z
    //   782: pop
    //   783: goto -337 -> 446
    //   786: aload_0
    //   787: invokestatic 790	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   790: invokevirtual 885	java/util/Locale:getCountry	()Ljava/lang/String;
    //   793: invokespecial 803	com/mobileapptracker/MobileAppTracker:d	(Ljava/lang/String;)V
    //   796: goto -350 -> 446
    //   799: iconst_1
    //   800: ireturn
    //   801: iconst_0
    //   802: istore_3
    //   803: goto -780 -> 23
    //   806: iconst_0
    //   807: istore 4
    //   809: goto -773 -> 36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	812	0	this	MobileAppTracker
    //   0	812	1	paramContext	Context
    //   0	812	2	paramString	String
    //   22	781	3	i1	int
    //   34	774	4	i2	int
    //   692	10	5	localException	Exception
    //   55	109	6	str1	String
    //   67	95	7	localPackageManager	android.content.pm.PackageManager
    //   667	1	8	localNameNotFoundException1	android.content.pm.PackageManager.NameNotFoundException
    //   677	1	10	localNameNotFoundException2	android.content.pm.PackageManager.NameNotFoundException
    //   231	490	12	localWindowManager	android.view.WindowManager
    //   248	22	13	localPoint	android.graphics.Point
    //   267	452	14	i3	int
    //   274	457	15	i4	int
    //   366	400	16	localTelephonyManager	android.telephony.TelephonyManager
    //   406	17	17	str2	String
    //   489	34	19	localSharedPreferences	SharedPreferences
    //   504	53	20	str3	String
    //   627	8	21	localWifiManager	android.net.wifi.WifiManager
    //   639	19	22	localWifiInfo	android.net.wifi.WifiInfo
    //   529	16	23	localEditor	SharedPreferences.Editor
    //   776	1	26	localIndexOutOfBoundsException	java.lang.IndexOutOfBoundsException
    //   420	14	28	str4	String
    //   428	14	29	str5	String
    //   119	34	30	localDate	Date
    //   134	17	31	localSimpleDateFormat	SimpleDateFormat
    // Exception table:
    //   from	to	target	type
    //   69	160	667	android/content/pm/PackageManager$NameNotFoundException
    //   160	175	677	android/content/pm/PackageManager$NameNotFoundException
    //   36	69	692	java/lang/Exception
    //   69	160	692	java/lang/Exception
    //   160	175	692	java/lang/Exception
    //   175	276	692	java/lang/Exception
    //   276	341	692	java/lang/Exception
    //   341	368	692	java/lang/Exception
    //   373	390	692	java/lang/Exception
    //   390	408	692	java/lang/Exception
    //   413	446	692	java/lang/Exception
    //   446	552	692	java/lang/Exception
    //   552	582	692	java/lang/Exception
    //   586	605	692	java/lang/Exception
    //   605	612	692	java/lang/Exception
    //   617	629	692	java/lang/Exception
    //   634	641	692	java/lang/Exception
    //   646	665	692	java/lang/Exception
    //   669	674	692	java/lang/Exception
    //   679	689	692	java/lang/Exception
    //   708	732	692	java/lang/Exception
    //   735	742	692	java/lang/Exception
    //   745	752	692	java/lang/Exception
    //   756	773	692	java/lang/Exception
    //   778	783	692	java/lang/Exception
    //   786	796	692	java/lang/Exception
    //   413	446	776	java/lang/IndexOutOfBoundsException
  }
  
  private boolean a(String paramString1, String paramString2)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("MM-dd-yyyy", Locale.getDefault());
    Calendar localCalendar1 = Calendar.getInstance();
    String str = this.l.getSharedPreferences(paramString1, 0).getString(paramString2, "");
    if (str.length() > 0)
    {
      Calendar localCalendar2 = Calendar.getInstance();
      try
      {
        localCalendar2.setTime(localSimpleDateFormat.parse(str));
        new f();
        if (f.a(localCalendar1, localCalendar2) == 1)
        {
          a(localSimpleDateFormat, localCalendar1, paramString1, paramString2);
          return true;
        }
      }
      catch (ParseException localParseException)
      {
        for (;;)
        {
          localParseException.printStackTrace();
        }
      }
      return false;
    }
    a(localSimpleDateFormat, localCalendar1, paramString1, paramString2);
    return true;
  }
  
  /* Error */
  private void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 166	com/mobileapptracker/MobileAppTracker:o	Ljava/util/concurrent/Semaphore;
    //   6: invokevirtual 573	java/util/concurrent/Semaphore:acquire	()V
    //   9: aload_0
    //   10: invokespecial 210	com/mobileapptracker/MobileAppTracker:a	()I
    //   13: istore_3
    //   14: iload_3
    //   15: ifne +13 -> 28
    //   18: aload_0
    //   19: getfield 166	com/mobileapptracker/MobileAppTracker:o	Ljava/util/concurrent/Semaphore;
    //   22: invokevirtual 619	java/util/concurrent/Semaphore:release	()V
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: iload_3
    //   29: bipush 50
    //   31: if_icmple +404 -> 435
    //   34: iconst_1
    //   35: iload_3
    //   36: bipush 50
    //   38: isub
    //   39: iadd
    //   40: istore 4
    //   42: iload 4
    //   44: iload_3
    //   45: if_icmpgt +380 -> 425
    //   48: iload 4
    //   50: invokestatic 610	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: invokevirtual 611	java/lang/Integer:toString	()Ljava/lang/String;
    //   56: astore 5
    //   58: aload_0
    //   59: getfield 207	com/mobileapptracker/MobileAppTracker:p	Landroid/content/SharedPreferences;
    //   62: aload 5
    //   64: aconst_null
    //   65: invokeinterface 372 3 0
    //   70: astore 6
    //   72: aload 6
    //   74: ifnull +250 -> 324
    //   77: new 500	org/json/JSONObject
    //   80: dup
    //   81: aload 6
    //   83: invokespecial 911	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   86: astore 7
    //   88: aload 7
    //   90: ldc_w 576
    //   93: invokevirtual 513	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   96: astore 12
    //   98: aload 7
    //   100: ldc_w 582
    //   103: invokevirtual 914	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   106: istore 13
    //   108: aconst_null
    //   109: astore 14
    //   111: iload 13
    //   113: ifeq +13 -> 126
    //   116: aload 7
    //   118: ldc_w 582
    //   121: invokevirtual 513	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   124: astore 14
    //   126: aload 7
    //   128: ldc_w 408
    //   131: invokevirtual 513	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   134: astore 15
    //   136: aload 7
    //   138: ldc_w 584
    //   141: invokevirtual 918	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   144: dstore 16
    //   146: aload 7
    //   148: ldc_w 591
    //   151: invokevirtual 513	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   154: astore 18
    //   156: aload 7
    //   158: ldc_w 593
    //   161: invokevirtual 914	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   164: istore 19
    //   166: aconst_null
    //   167: astore 20
    //   169: iload 19
    //   171: ifeq +13 -> 184
    //   174: aload 7
    //   176: ldc_w 593
    //   179: invokevirtual 513	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   182: astore 20
    //   184: aload 7
    //   186: ldc_w 595
    //   189: invokevirtual 914	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   192: istore 21
    //   194: aconst_null
    //   195: astore 22
    //   197: iload 21
    //   199: ifeq +13 -> 212
    //   202: aload 7
    //   204: ldc_w 595
    //   207: invokevirtual 513	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   210: astore 22
    //   212: aload 7
    //   214: ldc_w 597
    //   217: invokevirtual 914	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   220: istore 23
    //   222: aconst_null
    //   223: astore 24
    //   225: iload 23
    //   227: ifeq +13 -> 240
    //   230: aload 7
    //   232: ldc_w 597
    //   235: invokevirtual 513	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   238: astore 24
    //   240: aload 7
    //   242: ldc_w 599
    //   245: invokevirtual 921	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   248: istore 25
    //   250: aload_0
    //   251: iconst_m1
    //   252: aload_0
    //   253: invokespecial 210	com/mobileapptracker/MobileAppTracker:a	()I
    //   256: iadd
    //   257: invokespecial 604	com/mobileapptracker/MobileAppTracker:a	(I)V
    //   260: aload_0
    //   261: getfield 207	com/mobileapptracker/MobileAppTracker:p	Landroid/content/SharedPreferences;
    //   264: invokeinterface 421 1 0
    //   269: astore 26
    //   271: aload 26
    //   273: aload 5
    //   275: invokeinterface 426 2 0
    //   280: pop
    //   281: aload 26
    //   283: invokeinterface 429 1 0
    //   288: pop
    //   289: aload_0
    //   290: getfield 159	com/mobileapptracker/MobileAppTracker:n	Ljava/util/concurrent/ScheduledExecutorService;
    //   293: new 315	com/mobileapptracker/d
    //   296: dup
    //   297: aload_0
    //   298: aload 12
    //   300: aload 14
    //   302: aload 15
    //   304: dload 16
    //   306: aload 18
    //   308: aload 20
    //   310: aload 22
    //   312: aload 24
    //   314: iload 25
    //   316: invokespecial 318	com/mobileapptracker/d:<init>	(Lcom/mobileapptracker/MobileAppTracker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   319: invokeinterface 336 2 0
    //   324: iinc 4 1
    //   327: goto -285 -> 42
    //   330: astore 8
    //   332: aload_0
    //   333: getfield 194	com/mobileapptracker/MobileAppTracker:i	Z
    //   336: ifeq +8 -> 344
    //   339: aload 8
    //   341: invokevirtual 620	org/json/JSONException:printStackTrace	()V
    //   344: aload_0
    //   345: iconst_m1
    //   346: aload_0
    //   347: invokespecial 210	com/mobileapptracker/MobileAppTracker:a	()I
    //   350: iadd
    //   351: invokespecial 604	com/mobileapptracker/MobileAppTracker:a	(I)V
    //   354: aload_0
    //   355: getfield 207	com/mobileapptracker/MobileAppTracker:p	Landroid/content/SharedPreferences;
    //   358: invokeinterface 421 1 0
    //   363: astore 9
    //   365: aload 9
    //   367: aload 5
    //   369: invokeinterface 426 2 0
    //   374: pop
    //   375: aload 9
    //   377: invokeinterface 429 1 0
    //   382: pop
    //   383: aload_0
    //   384: getfield 166	com/mobileapptracker/MobileAppTracker:o	Ljava/util/concurrent/Semaphore;
    //   387: invokevirtual 619	java/util/concurrent/Semaphore:release	()V
    //   390: goto -365 -> 25
    //   393: astore_1
    //   394: aload_0
    //   395: monitorexit
    //   396: aload_1
    //   397: athrow
    //   398: astore 29
    //   400: aload_0
    //   401: getfield 194	com/mobileapptracker/MobileAppTracker:i	Z
    //   404: ifeq -80 -> 324
    //   407: aload 29
    //   409: invokevirtual 337	java/lang/Exception:printStackTrace	()V
    //   412: goto -88 -> 324
    //   415: astore_2
    //   416: aload_0
    //   417: getfield 166	com/mobileapptracker/MobileAppTracker:o	Ljava/util/concurrent/Semaphore;
    //   420: invokevirtual 619	java/util/concurrent/Semaphore:release	()V
    //   423: aload_2
    //   424: athrow
    //   425: aload_0
    //   426: getfield 166	com/mobileapptracker/MobileAppTracker:o	Ljava/util/concurrent/Semaphore;
    //   429: invokevirtual 619	java/util/concurrent/Semaphore:release	()V
    //   432: goto -407 -> 25
    //   435: iconst_1
    //   436: istore 4
    //   438: goto -396 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	441	0	this	MobileAppTracker
    //   393	4	1	localObject1	Object
    //   415	9	2	localObject2	Object
    //   13	33	3	i1	int
    //   40	397	4	i2	int
    //   56	312	5	str1	String
    //   70	12	6	str2	String
    //   86	155	7	localJSONObject	JSONObject
    //   330	10	8	localJSONException	org.json.JSONException
    //   363	13	9	localEditor1	SharedPreferences.Editor
    //   96	203	12	str3	String
    //   106	6	13	bool1	boolean
    //   109	192	14	str4	String
    //   134	169	15	str5	String
    //   144	161	16	d1	double
    //   154	153	18	str6	String
    //   164	6	19	bool2	boolean
    //   167	142	20	str7	String
    //   192	6	21	bool3	boolean
    //   195	116	22	str8	String
    //   220	6	23	bool4	boolean
    //   223	90	24	str9	String
    //   248	67	25	bool5	boolean
    //   269	13	26	localEditor2	SharedPreferences.Editor
    //   398	10	29	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   77	108	330	org/json/JSONException
    //   116	126	330	org/json/JSONException
    //   126	166	330	org/json/JSONException
    //   174	184	330	org/json/JSONException
    //   184	194	330	org/json/JSONException
    //   202	212	330	org/json/JSONException
    //   212	222	330	org/json/JSONException
    //   230	240	330	org/json/JSONException
    //   240	250	330	org/json/JSONException
    //   2	9	393	finally
    //   18	25	393	finally
    //   383	390	393	finally
    //   416	425	393	finally
    //   425	432	393	finally
    //   289	324	398	java/lang/Exception
    //   9	14	415	finally
    //   48	72	415	finally
    //   77	108	415	finally
    //   116	126	415	finally
    //   126	166	415	finally
    //   174	184	415	finally
    //   184	194	415	finally
    //   202	212	415	finally
    //   212	222	415	finally
    //   230	240	415	finally
    //   240	250	415	finally
    //   250	289	415	finally
    //   289	324	415	finally
    //   332	344	415	finally
    //   344	383	415	finally
    //   400	412	415	finally
  }
  
  private void b(int paramInt)
  {
    b("av", Integer.toString(paramInt));
  }
  
  private void b(String paramString)
  {
    b("ad", paramString);
  }
  
  private void b(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {}
    try
    {
      String str = URLEncoder.encode(paramString2, "UTF-8");
      paramString2 = str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
    this.k.put(paramString1, paramString2);
  }
  
  private static boolean b(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
  }
  
  private String c()
  {
    StringBuilder localStringBuilder = new StringBuilder("https://").append(getAdvertiserId()).append(".");
    if (this.i) {
      localStringBuilder.append("debug.engine.mobileapptracking.com");
    }
    for (;;)
    {
      localStringBuilder.append("/serve?s=android&ver=2.7");
      String str1 = getPluginName();
      if (str1 != null) {
        localStringBuilder.append("&sdk_plugin=").append(str1);
      }
      localStringBuilder.append("&pn=").append(getPackageName());
      Iterator localIterator = this.k.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str5 = (String)localIterator.next();
        if (!b.contains(str5)) {
          localStringBuilder.append("&").append(str5).append("=").append((String)this.k.get(str5));
        }
      }
      localStringBuilder.append("engine.mobileapptracking.com");
    }
    if (this.f) {
      localStringBuilder.append("&skip_dup=1");
    }
    if (this.i) {
      localStringBuilder.append("&debug=1");
    }
    for (;;)
    {
      try
      {
        Uri localUri = Uri.parse("content://" + getPackageName() + "/referrer_apps");
        localCursor = this.l.getContentResolver().query(localUri, null, null, null, "publisher_package_name desc");
        if ((localCursor != null) && (localCursor.moveToFirst())) {
          str2 = localCursor.getString(localCursor.getColumnIndex("tracking_id"));
        }
      }
      catch (Exception localException)
      {
        Cursor localCursor;
        String str2;
        String str4;
        String str3;
        if (!this.i) {
          continue;
        }
        localException.printStackTrace();
        continue;
      }
      try
      {
        str4 = URLEncoder.encode(str2, "UTF-8");
        str3 = str4;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        str3 = str2;
      }
    }
    this.k.put("ti", str3);
    localCursor.close();
    return localStringBuilder.toString();
  }
  
  private void c(String paramString)
  {
    b("connection_type", paramString);
  }
  
  private void d(String paramString)
  {
    b("cc", paramString);
  }
  
  private void e(String paramString)
  {
    SharedPreferences.Editor localEditor = this.l.getSharedPreferences("mat_log_id_install", 0).edit();
    localEditor.putString("logId", paramString);
    localEditor.commit();
  }
  
  private void f(String paramString)
  {
    SharedPreferences.Editor localEditor = this.l.getSharedPreferences("mat_log_id_update", 0).edit();
    localEditor.putString("logId", paramString);
    localEditor.commit();
  }
  
  public String getAction()
  {
    return (String)this.k.get("ac");
  }
  
  public String getAdvertiserId()
  {
    return (String)this.k.get("adv");
  }
  
  public int getAge()
  {
    if (this.k.get("age") == null) {
      return 0;
    }
    return Integer.parseInt((String)this.k.get("age"));
  }
  
  public double getAltitude()
  {
    if (this.k.get("altitude") == null) {
      return 0.0D;
    }
    return Double.parseDouble((String)this.k.get("altitude"));
  }
  
  public String getAndroidId()
  {
    return (String)this.k.get("ad");
  }
  
  public String getAndroidIdMd5()
  {
    return (String)this.k.get("android_id_md5");
  }
  
  public String getAndroidIdSha1()
  {
    return (String)this.k.get("android_id_sha1");
  }
  
  public String getAndroidIdSha256()
  {
    return (String)this.k.get("android_id_sha256");
  }
  
  public String getAppName()
  {
    return (String)this.k.get("an");
  }
  
  public int getAppVersion()
  {
    if (this.k.get("av") == null) {
      return 0;
    }
    return Integer.parseInt((String)this.k.get("av"));
  }
  
  public String getCarrier()
  {
    return (String)this.k.get("dc");
  }
  
  public String getConnectionType()
  {
    return (String)this.k.get("connection_type");
  }
  
  public String getCountryCode()
  {
    return (String)this.k.get("cc");
  }
  
  public String getCurrencyCode()
  {
    return (String)this.k.get("c");
  }
  
  public String getDeviceBrand()
  {
    return (String)this.k.get("db");
  }
  
  public String getDeviceId()
  {
    return (String)this.k.get("d");
  }
  
  public String getDeviceModel()
  {
    return (String)this.k.get("dm");
  }
  
  public String getEventId()
  {
    return (String)this.k.get("ei");
  }
  
  public String getEventName()
  {
    return (String)this.k.get("en");
  }
  
  public int getGender()
  {
    if (this.k.get("gender") == null) {
      return 0;
    }
    return Integer.parseInt((String)this.k.get("gender"));
  }
  
  public String getInstallDate()
  {
    return (String)this.k.get("id");
  }
  
  public String getInstallLogId()
  {
    return this.l.getSharedPreferences("mat_log_id_install", 0).getString("logId", "");
  }
  
  public String getLanguage()
  {
    return (String)this.k.get("l");
  }
  
  public double getLatitude()
  {
    if (this.k.get("latitude") == null) {
      return 0.0D;
    }
    return Double.parseDouble((String)this.k.get("latitude"));
  }
  
  public boolean getLimitAdTrackingEnabled()
  {
    return Integer.parseInt((String)this.k.get("app_ad_tracking")) == 0;
  }
  
  public double getLongitude()
  {
    if (this.k.get("longitude") == null) {
      return 0.0D;
    }
    return Double.parseDouble((String)this.k.get("longitude"));
  }
  
  public String getMCC()
  {
    return (String)this.k.get("mobile_country_code");
  }
  
  public String getMNC()
  {
    return (String)this.k.get("mobile_network_code");
  }
  
  public String getMacAddress()
  {
    return (String)this.k.get("ma");
  }
  
  public String getMatId()
  {
    return (String)this.k.get("mi");
  }
  
  public String getOsVersion()
  {
    return (String)this.k.get("ov");
  }
  
  public String getPackageName()
  {
    return (String)this.k.get("pn");
  }
  
  public String getPluginName()
  {
    return (String)this.k.get("sdk_plugin");
  }
  
  public String getRefId()
  {
    return (String)this.k.get("ar");
  }
  
  public String getReferralSource()
  {
    return (String)this.k.get("referral_source");
  }
  
  public String getReferralUrl()
  {
    return (String)this.k.get("referral_url");
  }
  
  public String getReferrer()
  {
    return (String)this.k.get("ir");
  }
  
  public Double getRevenue()
  {
    if (this.k.get("r") == null) {
      return Double.valueOf(0.0D);
    }
    return Double.valueOf(Double.parseDouble((String)this.k.get("r")));
  }
  
  public String getSDKVersion()
  {
    return "2.7";
  }
  
  public String getScreenDensity()
  {
    return (String)this.k.get("screen_density");
  }
  
  public String getScreenSize()
  {
    return (String)this.k.get("screen_layout_size");
  }
  
  public String getSiteId()
  {
    return (String)this.k.get("si");
  }
  
  public String getTRUSTeId()
  {
    return (String)this.k.get("tpid");
  }
  
  public String getUpdateLogId()
  {
    return this.l.getSharedPreferences("mat_log_id_update", 0).getString("logId", "");
  }
  
  public String getUserAgent()
  {
    return (String)this.k.get("ua");
  }
  
  public String getUserId()
  {
    return (String)this.k.get("ui");
  }
  
  public void setAdvertiserId(String paramString)
  {
    b("adv", paramString);
  }
  
  public void setAge(int paramInt)
  {
    b("age", Integer.toString(paramInt));
  }
  
  public void setAllowDuplicates(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void setAltitude(double paramDouble)
  {
    b("altitude", Double.toString(paramDouble));
  }
  
  public void setCurrencyCode(String paramString)
  {
    b("c", paramString);
  }
  
  public void setDebugMode(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void setFacebookUserId(String paramString)
  {
    b("facebook_user_id", paramString);
  }
  
  public void setGender(int paramInt)
  {
    b("gender", Integer.toString(paramInt));
  }
  
  public void setGoogleUserId(String paramString)
  {
    b("google_user_id", paramString);
  }
  
  public void setKey(String paramString)
  {
    this.m = new Encryption(paramString.trim(), "heF9BATUfWuISyO8");
  }
  
  public void setLatitude(double paramDouble)
  {
    b("latitude", Double.toString(paramDouble));
  }
  
  public void setLimitAdTrackingEnabled(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      b("app_ad_tracking", Integer.toString(0));
      return;
    }
    b("app_ad_tracking", Integer.toString(1));
  }
  
  public void setLongitude(double paramDouble)
  {
    b("longitude", Double.toString(paramDouble));
  }
  
  public void setMATResponse(MATResponse paramMATResponse)
  {
    this.c = paramMATResponse;
  }
  
  public void setPackageName(String paramString)
  {
    b("pn", paramString);
  }
  
  public void setPluginName(String paramString)
  {
    if (Arrays.asList(a.a).contains(paramString)) {
      b("sdk_plugin", paramString);
    }
    while (!this.i) {
      return;
    }
    throw new IllegalArgumentException("Plugin name not acceptable");
  }
  
  public void setRefId(String paramString)
  {
    b("ar", paramString);
  }
  
  public void setReferralSources(Activity paramActivity)
  {
    b("referral_source", paramActivity.getCallingPackage());
    Intent localIntent = paramActivity.getIntent();
    if (localIntent != null)
    {
      Uri localUri = localIntent.getData();
      if (localUri != null) {
        b("referral_url", localUri.toString());
      }
    }
  }
  
  public void setReferrer(String paramString)
  {
    b("ir", paramString);
  }
  
  public void setRevenue(double paramDouble)
  {
    b("r", Double.toString(paramDouble));
  }
  
  public void setSiteId(String paramString)
  {
    b("si", paramString);
  }
  
  public void setTRUSTeId(String paramString)
  {
    b("tpid", paramString);
  }
  
  /* Error */
  public String setTracking(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 368
    //   3: astore 6
    //   5: ldc_w 368
    //   8: astore 7
    //   10: new 348	java/lang/StringBuilder
    //   13: dup
    //   14: ldc_w 1090
    //   17: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: astore 8
    //   22: aload 8
    //   24: ldc_w 1092
    //   27: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: aload_1
    //   31: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload 8
    //   37: ldc_w 1094
    //   40: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: aload_2
    //   44: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload_3
    //   49: ifnull +16 -> 65
    //   52: aload 8
    //   54: ldc_w 1096
    //   57: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload_3
    //   61: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload 4
    //   67: ifnull +17 -> 84
    //   70: aload 8
    //   72: ldc_w 1098
    //   75: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload 4
    //   80: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload 8
    //   86: ldc_w 1100
    //   89: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: aload_0
    //   94: getfield 171	com/mobileapptracker/MobileAppTracker:d	Lcom/mobileapptracker/g;
    //   97: aload 8
    //   99: invokevirtual 384	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: aconst_null
    //   103: invokevirtual 496	com/mobileapptracker/g:a	(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    //   106: astore 12
    //   108: aload 12
    //   110: ifnull +27 -> 137
    //   113: aload 12
    //   115: ldc_w 967
    //   118: invokevirtual 513	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   121: astore 6
    //   123: aload 12
    //   125: ldc_w 1102
    //   128: invokevirtual 513	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   131: astore 22
    //   133: aload 22
    //   135: astore 7
    //   137: new 1104	android/content/ContentValues
    //   140: dup
    //   141: invokespecial 1105	android/content/ContentValues:<init>	()V
    //   144: astore 13
    //   146: aload 13
    //   148: ldc_w 1107
    //   151: aload_0
    //   152: invokevirtual 466	com/mobileapptracker/MobileAppTracker:getPackageName	()Ljava/lang/String;
    //   155: invokevirtual 1109	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: aload 13
    //   160: ldc_w 967
    //   163: aload 6
    //   165: invokevirtual 1109	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   168: new 348	java/lang/StringBuilder
    //   171: dup
    //   172: ldc_w 961
    //   175: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   178: aload_2
    //   179: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: ldc_w 963
    //   185: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: invokevirtual 384	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: invokestatic 45	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   194: astore 14
    //   196: aload_0
    //   197: getfield 151	com/mobileapptracker/MobileAppTracker:l	Landroid/content/Context;
    //   200: invokevirtual 388	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   203: aload 14
    //   205: aload 13
    //   207: invokevirtual 1113	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   210: pop
    //   211: iload 5
    //   213: ifeq +38 -> 251
    //   216: new 1077	android/content/Intent
    //   219: dup
    //   220: ldc_w 1115
    //   223: aload 7
    //   225: invokestatic 45	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   228: invokespecial 1118	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   231: astore 16
    //   233: aload 16
    //   235: ldc_w 1119
    //   238: invokevirtual 1123	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   241: pop
    //   242: aload_0
    //   243: getfield 151	com/mobileapptracker/MobileAppTracker:l	Landroid/content/Context;
    //   246: aload 16
    //   248: invokevirtual 1127	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   251: aload 7
    //   253: areturn
    //   254: astore 20
    //   256: aload_0
    //   257: getfield 194	com/mobileapptracker/MobileAppTracker:i	Z
    //   260: pop
    //   261: ldc_w 368
    //   264: areturn
    //   265: astore 17
    //   267: aload_0
    //   268: getfield 194	com/mobileapptracker/MobileAppTracker:i	Z
    //   271: ifeq -20 -> 251
    //   274: new 348	java/lang/StringBuilder
    //   277: dup
    //   278: ldc_w 1129
    //   281: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   284: aload 7
    //   286: invokevirtual 381	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   289: invokevirtual 384	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   292: pop
    //   293: aload 7
    //   295: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	296	0	this	MobileAppTracker
    //   0	296	1	paramString1	String
    //   0	296	2	paramString2	String
    //   0	296	3	paramString3	String
    //   0	296	4	paramString4	String
    //   0	296	5	paramBoolean	boolean
    //   3	161	6	str1	String
    //   8	286	7	localObject	Object
    //   20	78	8	localStringBuilder	StringBuilder
    //   106	18	12	localJSONObject	JSONObject
    //   144	62	13	localContentValues	android.content.ContentValues
    //   194	10	14	localUri	Uri
    //   231	16	16	localIntent	Intent
    //   265	1	17	localActivityNotFoundException	android.content.ActivityNotFoundException
    //   254	1	20	localJSONException	org.json.JSONException
    //   131	3	22	str2	String
    // Exception table:
    //   from	to	target	type
    //   113	133	254	org/json/JSONException
    //   216	251	265	android/content/ActivityNotFoundException
  }
  
  public void setTwitterUserId(String paramString)
  {
    b("twitter_user_id", paramString);
  }
  
  public void setUseAndroidIdMd5()
  {
    b("android_id_md5", Encryption.md5(Settings.Secure.getString(this.l.getContentResolver(), "android_id")));
    b("ad", "");
  }
  
  public void setUseAndroidIdSha1()
  {
    b("android_id_sha1", Encryption.sha1(Settings.Secure.getString(this.l.getContentResolver(), "android_id")));
    b("ad", "");
  }
  
  public void setUseAndroidIdSha256()
  {
    b("android_id_sha256", Encryption.sha256(Settings.Secure.getString(this.l.getContentResolver(), "android_id")));
    b("ad", "");
  }
  
  public void setUserId(String paramString)
  {
    b("ui", paramString);
  }
  
  public int trackAction(String paramString)
  {
    return a(paramString, null, getRevenue().doubleValue(), getCurrencyCode(), getRefId(), null, null);
  }
  
  public int trackAction(String paramString, double paramDouble)
  {
    return a(paramString, null, paramDouble, getCurrencyCode(), getRefId(), null, null);
  }
  
  public int trackAction(String paramString1, double paramDouble, String paramString2)
  {
    return a(paramString1, null, paramDouble, paramString2, getRefId(), null, null);
  }
  
  public int trackAction(String paramString1, double paramDouble, String paramString2, String paramString3)
  {
    return a(paramString1, null, paramDouble, paramString2, paramString3, null, null);
  }
  
  public int trackAction(String paramString1, double paramDouble, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return a(paramString1, null, paramDouble, paramString2, paramString3, paramString4, paramString5);
  }
  
  public int trackAction(String paramString, MATEventItem paramMATEventItem)
  {
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put(paramMATEventItem.toJSON());
    return a(paramString, localJSONArray.toString(), getRevenue().doubleValue(), getCurrencyCode(), getRefId(), null, null);
  }
  
  public int trackAction(String paramString1, MATEventItem paramMATEventItem, String paramString2, String paramString3)
  {
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put(paramMATEventItem.toJSON());
    return a(paramString1, localJSONArray.toString(), getRevenue().doubleValue(), getCurrencyCode(), getRefId(), paramString2, paramString3);
  }
  
  public int trackAction(String paramString, List paramList)
  {
    JSONArray localJSONArray = new JSONArray();
    for (int i1 = 0; i1 < paramList.size(); i1++) {
      localJSONArray.put(((MATEventItem)paramList.get(i1)).toJSON());
    }
    return a(paramString, localJSONArray.toString(), getRevenue().doubleValue(), getCurrencyCode(), getRefId(), null, null);
  }
  
  public int trackAction(String paramString1, List paramList, String paramString2, String paramString3)
  {
    JSONArray localJSONArray = new JSONArray();
    for (int i1 = 0; i1 < paramList.size(); i1++) {
      localJSONArray.put(((MATEventItem)paramList.get(i1)).toJSON());
    }
    return a(paramString1, localJSONArray.toString(), getRevenue().doubleValue(), getCurrencyCode(), getRefId(), paramString2, paramString3);
  }
  
  public int trackInstall()
  {
    if (!this.l.getSharedPreferences("mat_install", 0).getString("install", "").equals(""))
    {
      SharedPreferences localSharedPreferences = this.l.getSharedPreferences("mat_app_version", 0);
      String str = localSharedPreferences.getString("version", "");
      if ((str.length() != 0) && (Integer.parseInt(str) != getAppVersion()))
      {
        a("update", null, getRevenue().doubleValue(), getCurrencyCode(), getRefId(), null, null);
        SharedPreferences.Editor localEditor3 = localSharedPreferences.edit();
        localEditor3.putString("version", Integer.toString(getAppVersion()));
        localEditor3.commit();
        return 3;
      }
      return 2;
    }
    SharedPreferences.Editor localEditor1 = this.l.getSharedPreferences("mat_install", 0).edit();
    localEditor1.putString("install", "installed");
    localEditor1.commit();
    SharedPreferences.Editor localEditor2 = this.l.getSharedPreferences("mat_app_version", 0).edit();
    localEditor2.putString("version", Integer.toString(getAppVersion()));
    localEditor2.commit();
    return a("install", null, getRevenue().doubleValue(), getCurrencyCode(), getRefId(), null, null);
  }
  
  public int trackPurchase(String paramString1, int paramInt, double paramDouble, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    b("android_purchase_status", Integer.toString(paramInt));
    return a(paramString1, null, paramDouble, paramString2, paramString3, paramString4, paramString5);
  }
  
  public int trackUpdate()
  {
    if (!this.l.getSharedPreferences("mat_install", 0).getString("install", "").equals(""))
    {
      SharedPreferences localSharedPreferences = this.l.getSharedPreferences("mat_app_version", 0);
      String str = localSharedPreferences.getString("version", "");
      if ((str.length() != 0) && (Integer.parseInt(str) != getAppVersion()))
      {
        a("update", null, getRevenue().doubleValue(), getCurrencyCode(), getRefId(), null, null);
        SharedPreferences.Editor localEditor3 = localSharedPreferences.edit();
        localEditor3.putString("version", Integer.toString(getAppVersion()));
        localEditor3.commit();
        return 3;
      }
      return 2;
    }
    SharedPreferences.Editor localEditor1 = this.l.getSharedPreferences("mat_install", 0).edit();
    localEditor1.putString("install", "installed");
    localEditor1.commit();
    SharedPreferences.Editor localEditor2 = this.l.getSharedPreferences("mat_app_version", 0).edit();
    localEditor2.putString("version", Integer.toString(getAppVersion()));
    localEditor2.commit();
    return a("update", null, getRevenue().doubleValue(), getCurrencyCode(), getRefId(), null, null);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.mobileapptracker.MobileAppTracker
 * JD-Core Version:    0.7.0.1
 */