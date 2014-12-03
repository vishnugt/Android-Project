package com.supercell.titan;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.a.b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.OpenUDID.OpenUDID_manager;

public class ApplicationUtil
{
  public static AtomicBoolean a = new AtomicBoolean(false);
  private static b b;
  private static int c = -267522035;
  
  public static boolean existsKeyValue(String paramString)
  {
    return !getKeyValue(paramString).isEmpty();
  }
  
  public static String getAdvertiserID()
  {
    if (b != null) {
      return b.a;
    }
    return "";
  }
  
  public static boolean getAdvertiserTrackingEnabled()
  {
    if (b == null) {}
    while (b.b) {
      return false;
    }
    return true;
  }
  
  public static String getAndroidID()
  {
    return Settings.Secure.getString(GameApp.getInstance().getContentResolver(), "android_id");
  }
  
  public static String getAppVersion()
  {
    GameApp localGameApp = GameApp.getInstance();
    try
    {
      String str = localGameApp.getPackageManager().getPackageInfo(localGameApp.getPackageName(), 0).versionName;
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      GameApp.debuggerException(localNameNotFoundException);
    }
    return "";
  }
  
  public static String getDeviceType()
  {
    String str = Build.MODEL;
    if ((str == null) || (str.isEmpty()))
    {
      str = Build.PRODUCT;
      if (str == null) {}
    }
    else
    {
      return str;
    }
    return "";
  }
  
  public static String getHostname()
  {
    return "";
  }
  
  public static String getIMEI()
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)GameApp.getInstance().getSystemService("phone");
    String str;
    if (localTelephonyManager == null) {
      str = "";
    }
    do
    {
      return str;
      str = localTelephonyManager.getDeviceId();
    } while (str != null);
    return "";
  }
  
  public static String getKeyValue(String paramString)
  {
    return GameApp.getInstance().g().b(paramString);
  }
  
  public static String getMacAddress()
  {
    WifiManager localWifiManager = (WifiManager)GameApp.getInstance().getSystemService("wifi");
    String str;
    if (localWifiManager == null) {
      str = "";
    }
    do
    {
      return str;
      WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
      if (localWifiInfo == null) {
        return "";
      }
      str = localWifiInfo.getMacAddress();
    } while (str != null);
    return "";
  }
  
  public static String getOpenUDID()
  {
    if (OpenUDID_manager.b())
    {
      String str = OpenUDID_manager.a();
      if (str == null) {
        str = "";
      }
      return str;
    }
    return "";
  }
  
  public static String getPreferredLanguage()
  {
    return Locale.getDefault().getLanguage();
  }
  
  public static String getSystemVersion()
  {
    String str = Build.VERSION.RELEASE;
    if (str == null) {
      str = "";
    }
    return str;
  }
  
  public static int getTotalMemory()
  {
    if (c == -267522035) {}
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
      c = Integer.valueOf(localBufferedReader.readLine().split("\\s+")[1]).intValue() >> 10;
      localBufferedReader.close();
      return c;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        c = 0;
        GameApp.debuggerException(localException);
      }
    }
  }
  
  public static void openMarketURL()
  {
    GameApp localGameApp = GameApp.getInstance();
    localGameApp.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + localGameApp.getPackageName())));
  }
  
  public static void openURL(String paramString)
  {
    GameApp localGameApp = GameApp.getInstance();
    if ((paramString.startsWith("https://")) || (paramString.startsWith("http://")) || (paramString.startsWith("market://")))
    {
      localGameApp.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString.replace("market://play.google.com/store/apps/details?id=", "market://details?id="))));
      return;
    }
    if (paramString.startsWith("mailto:")) {
      try
      {
        localGameApp.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException2)
      {
        Uri localUri = Uri.parse(paramString);
        Intent localIntent = new Intent("android.intent.action.SENDTO");
        localIntent.setData(localUri);
        localGameApp.startActivity(Intent.createChooser(localIntent, "Send email"));
        return;
      }
    }
    if (paramString.startsWith("settings://")) {
      try
      {
        localGameApp.startActivity(new Intent(paramString.substring(11 + paramString.indexOf("settings://"))));
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException1)
      {
        GameApp.debuggerException(localActivityNotFoundException1);
        return;
      }
    }
    localGameApp.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://" + paramString)));
  }
  
  public static void removeKeyValue(String paramString)
  {
    storeKeyValue(paramString, "");
  }
  
  public static void requestAdvertiserInfoOnNewThread()
  {
    new i().start();
  }
  
  public static void setKeepScreenOn(boolean paramBoolean)
  {
    GameApp localGameApp = GameApp.getInstance();
    v localv = localGameApp.e();
    if (localv == null) {
      return;
    }
    localGameApp.runOnUiThread(new h(localv, paramBoolean));
  }
  
  public static void storeKeyValue(String paramString1, String paramString2)
  {
    if (paramString2 == null) {
      paramString2 = "";
    }
    cp localcp = GameApp.getInstance().g();
    if (localcp.b(paramString1).equals(paramString2)) {
      return;
    }
    if (paramString2.isEmpty())
    {
      localcp.a(paramString1);
      return;
    }
    localcp.a(paramString1, paramString2);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.ApplicationUtil
 * JD-Core Version:    0.7.0.1
 */