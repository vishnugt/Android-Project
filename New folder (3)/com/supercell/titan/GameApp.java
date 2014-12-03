package com.supercell.titan;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.chartboost.sdk.Chartboost;
import com.google.android.vending.expansion.downloader.DownloadProgressInfo;
import com.google.android.vending.expansion.downloader.a.c;
import com.google.android.vending.expansion.downloader.d;
import com.google.android.vending.expansion.downloader.h;
import com.google.android.vending.expansion.downloader.i;
import com.google.android.vending.expansion.downloader.j;
import com.google.android.vending.expansion.downloader.k;
import com.google.android.vending.expansion.downloader.l;
import com.mobileapptracker.MobileAppTracker;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import org.fmod.FMODAudioDevice;
import org.json.JSONArray;
import org.json.JSONObject;

public class GameApp
  extends Activity
  implements j
{
  private static GameApp b;
  private static int j = (int)(System.currentTimeMillis() / 1000L);
  private static final Vector<ag> k = new Vector();
  private static final Vector<Long> l = new Vector();
  private MobileAppTracker A;
  private boolean B;
  private final Class<?> C;
  private final Vector<String> D = new Vector();
  private boolean E;
  private ProgressBar F;
  private TextView G;
  private TextView H;
  private TextView I;
  private TextView J;
  private TextView K;
  private View L;
  private Button M;
  private boolean N;
  private int O;
  private k P;
  private l Q;
  private boolean R;
  private int S = -12345333;
  public int a;
  private WifiManager.WifiLock c;
  private boolean d;
  private FMODAudioDevice e;
  private v f;
  private boolean g;
  private boolean h;
  private boolean i;
  private cs m;
  private AlarmManager n;
  private String o = "";
  private final int p;
  private String q = "this game";
  private final int r;
  private Bundle s;
  private final Class<?> t;
  private PurchaseManager u;
  private cp v;
  private cp w;
  private boolean x = true;
  private boolean y;
  private GoogleServiceClient z;
  
  public GameApp(int paramInt1, int paramInt2, Class<?> paramClass)
  {
    this(paramInt1, paramInt2, paramClass, null);
  }
  
  public GameApp(int paramInt1, int paramInt2, Class<?> paramClass1, Class<?> paramClass2)
  {
    this.r = paramInt1;
    this.p = paramInt2;
    this.t = paramClass1;
    this.C = paramClass2;
  }
  
  @Deprecated
  public GameApp(String paramString1, String paramString2, Class<?> paramClass)
  {
    this(-1, -1, paramClass, null);
    this.q = paramString1;
    this.o = paramString2;
  }
  
  private static ag a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    Intent localIntent = new Intent(b, b.t);
    localIntent.putExtra("msg", paramString2);
    localIntent.putExtra("id", paramInt);
    localIntent.putExtra("snd", "");
    localIntent.putExtra("userId", paramString1);
    ag localag = new ag((byte)0);
    localag.c = paramInt;
    localag.d = paramString2;
    localag.b = paramString1;
    localag.e = paramString3;
    localag.a = PendingIntent.getBroadcast(b, paramInt, localIntent, 1073741824);
    return localag;
  }
  
  private static String a(Intent paramIntent)
  {
    if (paramIntent != null)
    {
      Bundle localBundle = paramIntent.getExtras();
      if (localBundle != null)
      {
        String str = localBundle.getString("userId");
        if (str != null) {
          return str;
        }
      }
    }
    return "";
  }
  
  private static void a(long paramLong)
  {
    int i2;
    for (int i1 = k.size();; i1 = i2)
    {
      i2 = i1 - 1;
      if (i2 < 0) {
        break;
      }
      if (paramLong >= ((Long)l.get(i2)).longValue())
      {
        k.remove(i2);
        l.remove(i2);
      }
    }
  }
  
  private void a(boolean paramBoolean)
  {
    int i1 = 0;
    this.g = false;
    WifiManager localWifiManager = (WifiManager)getSystemService("wifi");
    if (localWifiManager != null) {}
    try
    {
      localWifiManager.reconnect();
      label26:
      if ((this.c != null) && (!this.c.isHeld())) {
        this.c.acquire();
      }
      if (this.f != null) {
        this.f.onResume();
      }
      if (this.x)
      {
        this.y = true;
        this.x = false;
      }
      label81:
      label88:
      cf localcf;
      do
      {
        break label88;
        break label88;
        if (!this.h) {}
        for (;;)
        {
          return;
          if (this.f == null) {
            break label81;
          }
          this.f.b = true;
          break label81;
          if (!VirtualKeyboardHandler.a) {
            VirtualKeyboardHandler.hideKeyboard();
          }
          if (paramBoolean) {
            break;
          }
          this.z.onStart();
          this.e.a();
          NotificationManager localNotificationManager = (NotificationManager)getSystemService("notification");
          if (localNotificationManager != null) {
            localNotificationManager.cancelAll();
          }
          AlarmManager localAlarmManager = b.n;
          synchronized (k)
          {
            while (i1 < k.size())
            {
              ag localag = (ag)k.get(i1);
              localAlarmManager.cancel(localag.a);
              i1++;
            }
            if (NativeFacebookManager.getInstance() != null)
            {
              NativeFacebookManager.getInstance();
              NativeFacebookManager.onStart();
            }
            try
            {
              Chartboost localChartboost = ChartboostTitan.getChartboost();
              if (localChartboost != null) {
                localChartboost.onStart(this);
              }
            }
            catch (NullPointerException localNullPointerException)
            {
              for (;;)
              {
                debuggerException(localNullPointerException);
              }
            }
            if ((this.u instanceof cf))
            {
              localcf = (cf)this.u;
              if (!localcf.h())
              {
                localcf.f();
                return;
              }
            }
          }
        }
      } while ((localcf.i()) || (localcf.e() <= 0));
      PurchaseManager.updateDetails();
      return;
    }
    catch (Exception localException)
    {
      break label26;
    }
  }
  
  private void b(boolean paramBoolean)
  {
    this.N = paramBoolean;
    if (paramBoolean) {}
    for (int i1 = co.text_button_resume;; i1 = co.text_button_pause)
    {
      this.M.setText(i1);
      return;
    }
  }
  
  public static native boolean backButtonPressed();
  
  public static void cancelAllNotifications()
  {
    AlarmManager localAlarmManager = b.n;
    k.clear();
    l.clear();
    String str1 = b.w.b("localNotifications");
    if (!str1.isEmpty())
    {
      b.w.a("localNotifications");
      try
      {
        JSONArray localJSONArray = new JSONArray(str1);
        for (int i1 = 0; i1 < localJSONArray.length(); i1++)
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i1);
          String str2 = localJSONObject.getString("userId");
          String str3 = localJSONObject.getString("snd");
          localAlarmManager.cancel(a(str2, localJSONObject.getString("msg"), str3, localJSONObject.getInt("id")).a);
        }
        return;
      }
      catch (Exception localException)
      {
        debuggerException(localException);
      }
    }
  }
  
  public static void cancelNotification(int paramInt)
  {
    int i2;
    for (int i1 = k.size();; i1 = i2)
    {
      i2 = i1 - 1;
      if (i2 < 0) {
        break;
      }
      if (((ag)k.get(i2)).c == paramInt)
      {
        k.remove(i2);
        l.remove(i2);
      }
    }
    if (b == null) {}
    String str1;
    do
    {
      do
      {
        return;
      } while (b.w == null);
      str1 = b.w.b("localNotifications");
    } while (str1.isEmpty());
    AlarmManager localAlarmManager = b.n;
    for (;;)
    {
      JSONArray localJSONArray1;
      JSONArray localJSONArray2;
      int i3;
      try
      {
        localJSONArray1 = new JSONArray(str1);
        localJSONArray2 = new JSONArray();
        i3 = 0;
        if (i3 < localJSONArray1.length())
        {
          JSONObject localJSONObject = localJSONArray1.getJSONObject(i3);
          if (paramInt == localJSONObject.getInt("id"))
          {
            String str3 = localJSONObject.getString("userId");
            String str4 = localJSONObject.getString("snd");
            String str5 = localJSONObject.getString("msg");
            if (localAlarmManager != null) {
              localAlarmManager.cancel(a(str3, str5, str4, paramInt).a);
            }
          }
          else
          {
            localJSONArray2.put(localJSONObject);
          }
        }
      }
      catch (Exception localException)
      {
        debuggerException(localException);
        return;
      }
      int i4 = localJSONArray2.length();
      if (i4 == localJSONArray1.length()) {
        break;
      }
      if (i4 == 0)
      {
        b.w.a("localNotifications");
        return;
      }
      String str2 = localJSONArray2.toString();
      b.w.a("localNotifications", str2);
      return;
      i3++;
    }
  }
  
  public static native void clearTouches();
  
  public static native String createGameMain(AssetManager paramAssetManager, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3);
  
  public static int createNotification(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    int i1 = 1 + j;
    j = i1;
    cancelNotification(i1);
    ag localag = a(paramString1, paramString2, paramString3, i1);
    k.add(localag);
    long l1 = System.currentTimeMillis();
    l.add(Long.valueOf(l1 + paramInt * 1000));
    return i1;
  }
  
  public static void debuggerException(Exception paramException)
  {
    if ((paramException != null) && (b != null))
    {
      StringWriter localStringWriter = new StringWriter();
      paramException.printStackTrace(new PrintWriter(localStringWriter));
      String str = localStringWriter.toString();
      b.D.add(str);
    }
  }
  
  public static void debuggerWarning(String paramString)
  {
    if (paramString != null) {
      b.D.add(paramString);
    }
  }
  
  public static native void deinit();
  
  public static native void dialogDismissed(int paramInt1, int paramInt2);
  
  public static native int getAllowedScreenRotations();
  
  public static native int getDepthBits();
  
  public static GameApp getInstance()
  {
    return b;
  }
  
  public static native int getSurfaceFormat();
  
  /* Error */
  private void i()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 451	com/supercell/titan/GameApp:i	Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: iconst_1
    //   10: putfield 451	com/supercell/titan/GameApp:i	Z
    //   13: aload_0
    //   14: invokevirtual 455	com/supercell/titan/GameApp:getApplicationContext	()Landroid/content/Context;
    //   17: astore_1
    //   18: ldc 104
    //   20: astore_2
    //   21: aload_0
    //   22: getfield 125	com/supercell/titan/GameApp:C	Ljava/lang/Class;
    //   25: ifnull +23 -> 48
    //   28: aload_0
    //   29: aload_0
    //   30: aload_0
    //   31: invokespecial 457	com/supercell/titan/GameApp:j	()I
    //   34: invokestatic 462	com/google/android/vending/expansion/downloader/i:a	(Landroid/content/Context;I)Ljava/lang/String;
    //   37: invokestatic 465	com/google/android/vending/expansion/downloader/i:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   40: astore_2
    //   41: aload_2
    //   42: ifnonnull +6 -> 48
    //   45: ldc 104
    //   47: astore_2
    //   48: ldc_w 466
    //   51: invokestatic 469	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   54: aload_0
    //   55: iconst_1
    //   56: putfield 245	com/supercell/titan/GameApp:h	Z
    //   59: aload_0
    //   60: new 265	org/fmod/FMODAudioDevice
    //   63: dup
    //   64: invokespecial 470	org/fmod/FMODAudioDevice:<init>	()V
    //   67: putfield 263	com/supercell/titan/GameApp:e	Lorg/fmod/FMODAudioDevice;
    //   70: aload_1
    //   71: invokevirtual 476	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   74: getfield 481	android/content/pm/ApplicationInfo:dataDir	Ljava/lang/String;
    //   77: astore 5
    //   79: aload_1
    //   80: invokevirtual 484	android/content/Context:getCacheDir	()Ljava/io/File;
    //   83: invokevirtual 489	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   86: astore 6
    //   88: aload_0
    //   89: invokevirtual 493	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   92: ldc_w 495
    //   95: invokestatic 500	android/provider/Settings$Secure:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   98: astore 7
    //   100: aload 7
    //   102: ifnull +11 -> 113
    //   105: aload 7
    //   107: invokevirtual 363	java/lang/String:isEmpty	()Z
    //   110: ifeq +15 -> 125
    //   113: aload_0
    //   114: invokevirtual 503	android/content/Context:getPackageName	()Ljava/lang/String;
    //   117: getstatic 509	java/util/Locale:ENGLISH	Ljava/util/Locale;
    //   120: invokevirtual 513	java/lang/String:toUpperCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   123: astore 7
    //   125: aload_0
    //   126: new 356	com/supercell/titan/cp
    //   129: dup
    //   130: aload_0
    //   131: ldc_w 515
    //   134: aload 7
    //   136: invokespecial 518	com/supercell/titan/cp:<init>	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   139: putfield 520	com/supercell/titan/GameApp:v	Lcom/supercell/titan/cp;
    //   142: aload_1
    //   143: invokevirtual 493	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   146: ldc_w 495
    //   149: invokestatic 500	android/provider/Settings$Secure:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   152: astore 8
    //   154: aload 8
    //   156: ifnull +11 -> 167
    //   159: aload 8
    //   161: invokevirtual 363	java/lang/String:isEmpty	()Z
    //   164: ifeq +468 -> 632
    //   167: new 522	java/lang/StringBuilder
    //   170: dup
    //   171: invokespecial 523	java/lang/StringBuilder:<init>	()V
    //   174: aload 7
    //   176: invokevirtual 527	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: ldc_w 529
    //   182: invokevirtual 527	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: invokevirtual 530	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   188: astore 9
    //   190: aload_0
    //   191: new 356	com/supercell/titan/cp
    //   194: dup
    //   195: aload_0
    //   196: ldc_w 532
    //   199: aload 9
    //   201: invokespecial 518	com/supercell/titan/cp:<init>	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   204: putfield 352	com/supercell/titan/GameApp:w	Lcom/supercell/titan/cp;
    //   207: invokestatic 537	com/supercell/titan/NativeHTTPClientManager:getInstance	()Lcom/supercell/titan/NativeHTTPClientManager;
    //   210: pop
    //   211: aload_0
    //   212: invokestatic 540	com/supercell/titan/NativeFacebookManager:createInstance	(Lcom/supercell/titan/GameApp;)V
    //   215: aload_0
    //   216: invokestatic 545	org/OpenUDID/OpenUDID_manager:a	(Landroid/content/Context;)V
    //   219: aload_0
    //   220: invokevirtual 549	com/supercell/titan/GameApp:getWindowManager	()Landroid/view/WindowManager;
    //   223: invokeinterface 555 1 0
    //   228: astore 12
    //   230: new 557	android/util/DisplayMetrics
    //   233: dup
    //   234: invokespecial 558	android/util/DisplayMetrics:<init>	()V
    //   237: astore 13
    //   239: aload 12
    //   241: aload 13
    //   243: invokevirtual 564	android/view/Display:getMetrics	(Landroid/util/DisplayMetrics;)V
    //   246: aload 13
    //   248: getfield 567	android/util/DisplayMetrics:densityDpi	I
    //   251: istore 14
    //   253: new 569	android/graphics/Point
    //   256: dup
    //   257: invokespecial 570	android/graphics/Point:<init>	()V
    //   260: astore 15
    //   262: aload 12
    //   264: aload 15
    //   266: invokevirtual 574	android/view/Display:getSize	(Landroid/graphics/Point;)V
    //   269: aload 15
    //   271: getfield 576	android/graphics/Point:x	I
    //   274: istore 16
    //   276: aload 15
    //   278: getfield 578	android/graphics/Point:y	I
    //   281: istore 17
    //   283: aload_1
    //   284: invokevirtual 582	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   287: aload 5
    //   289: aload 6
    //   291: iload 16
    //   293: iload 17
    //   295: iload 14
    //   297: aload_2
    //   298: invokestatic 584	com/supercell/titan/GameApp:createGameMain	(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;
    //   301: astore 18
    //   303: invokestatic 586	com/supercell/titan/GameApp:getSurfaceFormat	()I
    //   306: sipush 565
    //   309: if_icmpne +304 -> 613
    //   312: iconst_5
    //   313: istore 19
    //   315: bipush 6
    //   317: istore 20
    //   319: iconst_5
    //   320: istore 21
    //   322: iconst_0
    //   323: istore 22
    //   325: aload_0
    //   326: new 238	com/supercell/titan/v
    //   329: dup
    //   330: aload_1
    //   331: iload 19
    //   333: iload 20
    //   335: iload 21
    //   337: iload 22
    //   339: invokestatic 588	com/supercell/titan/GameApp:getDepthBits	()I
    //   342: invokespecial 591	com/supercell/titan/v:<init>	(Landroid/content/Context;IIIII)V
    //   345: putfield 236	com/supercell/titan/GameApp:f	Lcom/supercell/titan/v;
    //   348: aload_0
    //   349: getfield 236	com/supercell/titan/GameApp:f	Lcom/supercell/titan/v;
    //   352: aload_0
    //   353: invokevirtual 595	com/supercell/titan/GameApp:getIntent	()Landroid/content/Intent;
    //   356: invokestatic 597	com/supercell/titan/GameApp:a	(Landroid/content/Intent;)Ljava/lang/String;
    //   359: putfield 599	com/supercell/titan/v:a	Ljava/lang/String;
    //   362: aload_0
    //   363: getfield 236	com/supercell/titan/GameApp:f	Lcom/supercell/titan/v;
    //   366: iconst_1
    //   367: invokevirtual 602	com/supercell/titan/v:setFocusable	(Z)V
    //   370: aload_0
    //   371: getfield 236	com/supercell/titan/GameApp:f	Lcom/supercell/titan/v;
    //   374: iconst_1
    //   375: invokevirtual 605	com/supercell/titan/v:setFocusableInTouchMode	(Z)V
    //   378: aload_0
    //   379: aload_0
    //   380: getfield 236	com/supercell/titan/GameApp:f	Lcom/supercell/titan/v;
    //   383: invokevirtual 609	com/supercell/titan/GameApp:setContentView	(Landroid/view/View;)V
    //   386: aload_0
    //   387: invokevirtual 611	com/supercell/titan/GameApp:d	()V
    //   390: aload_0
    //   391: new 258	com/supercell/titan/GoogleServiceClient
    //   394: dup
    //   395: aload_0
    //   396: invokespecial 613	com/supercell/titan/GoogleServiceClient:<init>	(Lcom/supercell/titan/GameApp;)V
    //   399: putfield 256	com/supercell/titan/GameApp:z	Lcom/supercell/titan/GoogleServiceClient;
    //   402: aload_0
    //   403: new 304	com/supercell/titan/cf
    //   406: dup
    //   407: aload_0
    //   408: aload 18
    //   410: invokespecial 616	com/supercell/titan/cf:<init>	(Lcom/supercell/titan/GameApp;Ljava/lang/String;)V
    //   413: putfield 302	com/supercell/titan/GameApp:u	Lcom/supercell/titan/PurchaseManager;
    //   416: aload_0
    //   417: new 618	com/supercell/titan/cs
    //   420: dup
    //   421: aload_0
    //   422: invokespecial 620	com/supercell/titan/cs:<init>	(Landroid/content/Context;)V
    //   425: putfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   428: aload_0
    //   429: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   432: iconst_1
    //   433: invokevirtual 623	com/supercell/titan/cs:setFocusable	(Z)V
    //   436: aload_0
    //   437: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   440: sipush 144
    //   443: invokevirtual 626	com/supercell/titan/cs:setInputType	(I)V
    //   446: aload_0
    //   447: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   450: invokevirtual 629	com/supercell/titan/cs:setSingleLine	()V
    //   453: aload_0
    //   454: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   457: iconst_0
    //   458: invokevirtual 632	com/supercell/titan/cs:setBackgroundColor	(I)V
    //   461: aload_0
    //   462: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   465: iconst_0
    //   466: invokevirtual 635	com/supercell/titan/cs:setTextColor	(I)V
    //   469: aload_0
    //   470: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   473: iconst_0
    //   474: invokevirtual 638	com/supercell/titan/cs:setMinWidth	(I)V
    //   477: aload_0
    //   478: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   481: iconst_0
    //   482: invokevirtual 641	com/supercell/titan/cs:setMinHeight	(I)V
    //   485: aload_0
    //   486: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   489: iconst_0
    //   490: invokevirtual 644	com/supercell/titan/cs:setMaxWidth	(I)V
    //   493: aload_0
    //   494: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   497: iconst_0
    //   498: invokevirtual 647	com/supercell/titan/cs:setMaxHeight	(I)V
    //   501: aload_0
    //   502: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   505: iconst_0
    //   506: invokevirtual 650	com/supercell/titan/cs:setWidth	(I)V
    //   509: aload_0
    //   510: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   513: iconst_0
    //   514: invokevirtual 653	com/supercell/titan/cs:setHeight	(I)V
    //   517: aload_0
    //   518: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   521: ldc_w 654
    //   524: invokevirtual 658	com/supercell/titan/cs:setX	(F)V
    //   527: new 660	android/view/ViewGroup$LayoutParams
    //   530: dup
    //   531: bipush 254
    //   533: bipush 254
    //   535: invokespecial 662	android/view/ViewGroup$LayoutParams:<init>	(II)V
    //   538: astore 23
    //   540: aload_0
    //   541: aload_0
    //   542: getfield 622	com/supercell/titan/GameApp:m	Lcom/supercell/titan/cs;
    //   545: aload 23
    //   547: invokevirtual 666	com/supercell/titan/GameApp:addContentView	(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   550: return
    //   551: astore_3
    //   552: aload_0
    //   553: new 238	com/supercell/titan/v
    //   556: dup
    //   557: aload_1
    //   558: bipush 8
    //   560: bipush 8
    //   562: bipush 8
    //   564: bipush 8
    //   566: iconst_0
    //   567: invokespecial 591	com/supercell/titan/v:<init>	(Landroid/content/Context;IIIII)V
    //   570: putfield 236	com/supercell/titan/GameApp:f	Lcom/supercell/titan/v;
    //   573: aload_0
    //   574: aload_0
    //   575: getfield 236	com/supercell/titan/GameApp:f	Lcom/supercell/titan/v;
    //   578: invokevirtual 609	com/supercell/titan/GameApp:setContentView	(Landroid/view/View;)V
    //   581: aload_0
    //   582: getfield 236	com/supercell/titan/GameApp:f	Lcom/supercell/titan/v;
    //   585: new 668	com/supercell/titan/aa
    //   588: dup
    //   589: aload_0
    //   590: invokespecial 669	com/supercell/titan/aa:<init>	(Lcom/supercell/titan/GameApp;)V
    //   593: invokevirtual 673	com/supercell/titan/v:post	(Ljava/lang/Runnable;)Z
    //   596: pop
    //   597: aload_0
    //   598: iconst_0
    //   599: putfield 245	com/supercell/titan/GameApp:h	Z
    //   602: return
    //   603: astore 11
    //   605: aload 11
    //   607: invokestatic 312	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   610: goto -391 -> 219
    //   613: bipush 8
    //   615: istore 19
    //   617: bipush 8
    //   619: istore 20
    //   621: bipush 8
    //   623: istore 21
    //   625: bipush 8
    //   627: istore 22
    //   629: goto -304 -> 325
    //   632: aload 8
    //   634: astore 9
    //   636: goto -446 -> 190
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	639	0	this	GameApp
    //   17	541	1	localContext	android.content.Context
    //   20	278	2	str1	String
    //   551	1	3	localUnsatisfiedLinkError	java.lang.UnsatisfiedLinkError
    //   77	211	5	str2	String
    //   86	204	6	str3	String
    //   98	77	7	str4	String
    //   152	481	8	str5	String
    //   188	447	9	str6	String
    //   603	3	11	localException	Exception
    //   228	35	12	localDisplay	android.view.Display
    //   237	10	13	localDisplayMetrics	android.util.DisplayMetrics
    //   251	45	14	i1	int
    //   260	17	15	localPoint	android.graphics.Point
    //   274	18	16	i2	int
    //   281	13	17	i3	int
    //   301	108	18	str7	String
    //   313	303	19	i4	int
    //   317	303	20	i5	int
    //   320	304	21	i6	int
    //   323	305	22	i7	int
    //   538	8	23	localLayoutParams	android.view.ViewGroup.LayoutParams
    // Exception table:
    //   from	to	target	type
    //   48	59	551	java/lang/UnsatisfiedLinkError
    //   215	219	603	java/lang/Exception
  }
  
  public static native boolean init(int paramInt1, int paramInt2, String paramString);
  
  public static native void inputKeyboardDismissed();
  
  public static native void inputOkPressed();
  
  public static native void inputTextChanged(String paramString);
  
  public static boolean isNativeLibraryLoaded()
  {
    return b.h;
  }
  
  private int j()
  {
    try
    {
      int i1 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
      return i1;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  private File k()
  {
    return new File(i.a(this, i.a(this, j())));
  }
  
  private boolean l()
  {
    return k().exists();
  }
  
  public static native void logDebuggerException(String paramString);
  
  public static void mobileAppTrackerStart(String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    try
    {
      if (b.A == null)
      {
        b.A = new MobileAppTracker(b.getApplicationContext(), paramString1, paramString2, true, true);
        if (!paramString3.isEmpty()) {
          b.A.setUserId(paramString3);
        }
      }
      if (b.A != null)
      {
        if (paramBoolean)
        {
          b.A.trackUpdate();
          return;
        }
        b.A.trackInstall();
        return;
      }
    }
    catch (Exception localException)
    {
      debuggerException(localException);
    }
  }
  
  public static void removeOutOfDateNotifications()
  {
    if (!k.isEmpty()) {
      a(System.currentTimeMillis());
    }
  }
  
  public static native void setPushNotificationValues(int paramInt, String paramString1, String paramString2);
  
  public static native void setTouch(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public static native void start(String paramString);
  
  public static native void stop();
  
  public static native boolean update();
  
  public final cs a()
  {
    return this.m;
  }
  
  public final void a(int paramInt)
  {
    boolean bool1 = true;
    if (paramInt == this.S) {
      return;
    }
    this.S = paramInt;
    if (this.O != paramInt)
    {
      this.O = paramInt;
      int i2 = i.a(paramInt);
      this.G.setText(i2);
    }
    boolean bool2;
    boolean bool3;
    int i1;
    switch (paramInt)
    {
    case 6: 
    case 10: 
    case 11: 
    case 13: 
    case 17: 
    default: 
      bool2 = bool1;
      bool3 = bool1;
      i1 = 0;
      if (!bool2) {
        break;
      }
    }
    for (;;)
    {
      if (this.L.getVisibility() != i1) {
        this.L.setVisibility(i1);
      }
      this.F.setIndeterminate(bool1);
      b(bool3);
      return;
      bool2 = bool1;
      bool3 = false;
      break;
      bool2 = bool1;
      bool3 = false;
      break;
      bool2 = bool1;
      bool1 = false;
      bool3 = false;
      break;
      bool3 = bool1;
      bool1 = false;
      bool2 = false;
      break;
      bool3 = bool1;
      bool1 = false;
      bool2 = false;
      break;
      bool2 = bool1;
      bool3 = bool1;
      bool1 = false;
      break;
      bool2 = bool1;
      bool3 = bool1;
      bool1 = false;
      break;
      if (l())
      {
        ad localad = new ad(this);
        Object[] arrayOfObject = new Object[bool1];
        arrayOfObject[0] = new Object();
        localad.execute(arrayOfObject);
        return;
      }
      i();
      return;
      i1 = 8;
    }
  }
  
  public final void a(Messenger paramMessenger)
  {
    this.P = new h(paramMessenger);
    this.P.b();
    this.P.a(this.Q.a());
  }
  
  public final void a(DownloadProgressInfo paramDownloadProgressInfo)
  {
    TextView localTextView1 = this.J;
    int i1 = co.kilobytes_per_second;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = i.a(paramDownloadProgressInfo.d);
    localTextView1.setText(getString(i1, arrayOfObject1));
    TextView localTextView2 = this.K;
    int i2 = co.time_remaining;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = i.a(paramDownloadProgressInfo.c);
    localTextView2.setText(getString(i2, arrayOfObject2));
    this.F.setMax((int)(paramDownloadProgressInfo.a >> 8));
    this.F.setProgress((int)(paramDownloadProgressInfo.b >> 8));
    this.I.setText(Long.toString(100L * paramDownloadProgressInfo.b / paramDownloadProgressInfo.a) + "%");
    this.H.setText(i.a(paramDownloadProgressInfo.b, paramDownloadProgressInfo.a));
  }
  
  public final void a(Runnable paramRunnable)
  {
    if (paramRunnable == null) {
      return;
    }
    if (this.f == null)
    {
      logDebuggerException("runOnView when view = null, " + paramRunnable.toString());
      return;
    }
    this.f.queueEvent(paramRunnable);
  }
  
  public final PurchaseManager b()
  {
    return this.u;
  }
  
  public final Bundle c()
  {
    return this.s;
  }
  
  public final void d()
  {
    if (this.f == null) {
      return;
    }
    if (Build.VERSION.SDK_INT < 19)
    {
      this.f.setSystemUiVisibility(1024);
      return;
    }
    this.f.setSystemUiVisibility(5894);
  }
  
  public final v e()
  {
    return this.f;
  }
  
  public final String f()
  {
    return this.o;
  }
  
  public final cp g()
  {
    return this.v;
  }
  
  public final Vector<String> h()
  {
    return this.D;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.z != null) {
      this.z.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    if ((this.u != null) && (paramInt1 == 10000004)) {
      ((cf)this.u).a(paramInt2, paramIntent);
    }
    if (NativeFacebookManager.getInstance() != null) {
      NativeFacebookManager.getInstance().a(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onBackPressed()
  {
    try
    {
      if (ChartboostTitan.getChartboost() != null)
      {
        boolean bool = ChartboostTitan.getChartboost().onBackPressed();
        if (bool) {
          return;
        }
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      do
      {
        debuggerException(localIllegalStateException);
      } while (this.f == null);
      this.f.a();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    b = this;
    if (this.p != -1) {
      this.o = getResources().getString(this.p);
    }
    if (this.r != -1) {
      this.q = getResources().getString(this.r);
    }
    FragmentManager localFragmentManager = getFragmentManager();
    if (localFragmentManager != null)
    {
      Fragment localFragment = localFragmentManager.findFragmentByTag("NativeDialog");
      if ((localFragment instanceof NativeDialogManager)) {
        ((NativeDialogManager)localFragment).a();
      }
    }
    this.s = paramBundle;
    WifiManager localWifiManager = (WifiManager)getSystemService("wifi");
    if (localWifiManager != null) {
      this.c = localWifiManager.createWifiLock(1, getPackageName());
    }
    try
    {
      localWifiManager.reconnect();
      label136:
      this.n = ((AlarmManager)getSystemService("alarm"));
      getWindow().setFlags(1024, 1024);
      this.a = getRequestedOrientation();
      Intent localIntent2;
      if ((this.C != null) && (!l())) {
        try
        {
          Intent localIntent1 = getIntent();
          localIntent2 = new Intent(this, getClass());
          localIntent2.setFlags(335544320);
          localIntent2.setAction(localIntent1.getAction());
          Set localSet = localIntent1.getCategories();
          if (localSet != null)
          {
            Iterator localIterator = localSet.iterator();
            while (localIterator.hasNext())
            {
              localIntent2.addCategory((String)localIterator.next());
              continue;
              i();
            }
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
      }
      while (c.a(this, PendingIntent.getActivity(this, 0, localIntent2, 134217728), this.C) == 0) {
        return;
      }
      this.Q = new d(this, this.C);
      setContentView(cn.apk_expansion_loader);
      ((TextView)findViewById(cm.titleText)).setText(this.q);
      this.F = ((ProgressBar)findViewById(cm.progressBar));
      this.G = ((TextView)findViewById(cm.statusText));
      this.H = ((TextView)findViewById(cm.progressAsFraction));
      this.I = ((TextView)findViewById(cm.progressAsPercentage));
      this.J = ((TextView)findViewById(cm.progressAverageSpeed));
      this.K = ((TextView)findViewById(cm.progressTimeRemaining));
      this.L = findViewById(cm.downloaderDashboard);
      this.M = ((Button)findViewById(cm.pauseButton));
      this.M.setOnClickListener(new af(this));
      return;
    }
    catch (Exception localException)
    {
      break label136;
    }
  }
  
  protected void onDestroy()
  {
    this.R = true;
    super.onDestroy();
    if (this.h)
    {
      deinit();
      NativeFacebookManager.destructInstance();
    }
    if (this.u != null) {
      this.u.a();
    }
    if (ChartboostTitan.getChartboost() != null) {}
    try
    {
      ChartboostTitan.getChartboost().onDestroy(this);
      label49:
      GCMIntentService.onDestroy(this);
      Process.killProcess(Process.myPid());
      return;
    }
    catch (Exception localException)
    {
      break label49;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((VirtualKeyboardHandler.a) && (this.m.onKeyDown(paramInt, paramKeyEvent))) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 25) || (paramInt == 24) || (paramInt == 164) || (paramInt == 4))
    {
      d();
      new Handler().postDelayed(new ac(this), 5000L);
    }
    if ((VirtualKeyboardHandler.a) && (this.m.onKeyUp(paramInt, paramKeyEvent))) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    if ((this.f != null) && (paramIntent != null)) {
      this.f.a = a(paramIntent);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    AdColonyTitan.onPause();
    if (NativeFacebookManager.getInstance() != null) {
      NativeFacebookManager.getInstance().c();
    }
    if ((!this.d) && (this.f != null)) {
      this.f.onPause();
    }
    this.d = true;
  }
  
  protected void onRestart()
  {
    super.onRestart();
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.d)
    {
      this.d = false;
      if (!this.E) {
        a(true);
      }
    }
    AdColonyTitan.onResume(this);
    if (NativeFacebookManager.getInstance() != null) {
      NativeFacebookManager.getInstance().b();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (NativeFacebookManager.getInstance() != null) {
      NativeFacebookManager.getInstance().a(paramBundle);
    }
  }
  
  protected void onStart()
  {
    if (this.Q != null) {
      this.Q.a(this);
    }
    if (this.B) {
      this.E = true;
    }
    for (;;)
    {
      super.onStart();
      return;
      this.E = false;
      this.B = false;
      a(false);
    }
  }
  
  protected void onStop()
  {
    if (this.Q != null) {
      this.Q.b(this);
    }
    if (this.g)
    {
      super.onStop();
      return;
    }
    this.g = true;
    if (this.e != null) {
      this.e.b();
    }
    if (this.z != null) {
      this.z.onStop();
    }
    if (NativeFacebookManager.getInstance() != null) {
      NativeFacebookManager.getInstance().a();
    }
    if ((this.c != null) && (this.c.isHeld())) {
      this.c.release();
    }
    if (this.w != null)
    {
      long l1 = System.currentTimeMillis();
      a(l1);
      AlarmManager localAlarmManager = b.n;
      JSONArray localJSONArray = new JSONArray();
      int i1 = 0;
      int i2 = 0;
      for (;;)
      {
        if (i1 >= k.size()) {
          break label288;
        }
        long l2 = ((Long)l.get(i1)).longValue();
        ag localag;
        JSONObject localJSONObject;
        if (l1 < l2)
        {
          localag = (ag)k.get(i1);
          localAlarmManager.set(0, l2, localag.a);
          localJSONObject = new JSONObject();
        }
        try
        {
          localJSONObject.put("msg", localag.d);
          localJSONObject.put("snd", localag.e);
          localJSONObject.put("userId", localag.b);
          localJSONObject.put("id", localag.c);
          localJSONArray.put(localJSONObject);
          i2 = 1;
          i1++;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            debuggerException(localException);
          }
        }
      }
      label288:
      if (i2 == 0) {
        break label335;
      }
      String str = localJSONArray.toString();
      this.w.a("localNotifications", str);
    }
    for (;;)
    {
      if (ChartboostTitan.getChartboost() != null) {
        ChartboostTitan.getChartboost().onStop(this);
      }
      this.d = false;
      super.onStop();
      return;
      label335:
      this.w.a("localNotifications");
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean)
    {
      if ((this.B) && (this.E))
      {
        this.E = false;
        a(false);
      }
      d();
    }
    boolean bool = false;
    if (!paramBoolean) {
      bool = true;
    }
    this.B = bool;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.GameApp
 * JD-Core Version:    0.7.0.1
 */