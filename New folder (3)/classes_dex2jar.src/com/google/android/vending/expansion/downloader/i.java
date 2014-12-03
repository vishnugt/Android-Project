package com.google.android.vending.expansion.downloader;

import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import com.android.vending.a.a.b;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;

public final class i
{
  public static Random a = new Random(SystemClock.uptimeMillis());
  private static final Pattern b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
  
  public static int a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return b.state_unknown;
    case 1: 
      return b.state_idle;
    case 2: 
      return b.state_fetching_url;
    case 3: 
      return b.state_connecting;
    case 4: 
      return b.state_downloading;
    case 5: 
      return b.state_completed;
    case 6: 
      return b.state_paused_network_unavailable;
    case 7: 
      return b.state_paused_by_request;
    case 8: 
      return b.state_paused_wifi_disabled;
    case 9: 
      return b.state_paused_wifi_unavailable;
    case 10: 
      return b.state_paused_wifi_disabled;
    case 11: 
      return b.state_paused_wifi_unavailable;
    case 12: 
      return b.state_paused_roaming;
    case 13: 
      return b.state_paused_network_setup_failure;
    case 14: 
      return b.state_paused_sdcard_unavailable;
    case 15: 
      return b.state_failed_unlicensed;
    case 16: 
      return b.state_failed_fetching_url;
    case 17: 
      return b.state_failed_sdcard_full;
    }
    return b.state_failed_cancelled;
  }
  
  public static String a(float paramFloat)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Float.valueOf(1000.0F * paramFloat / 1024.0F);
    return String.format("%.2f", arrayOfObject);
  }
  
  public static String a(long paramLong)
  {
    if (paramLong > 3600000L) {}
    for (SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());; localSimpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault())) {
      return localSimpleDateFormat.format(new Date(paramLong - TimeZone.getDefault().getRawOffset()));
    }
  }
  
  public static String a(long paramLong1, long paramLong2)
  {
    if (paramLong2 == 0L) {
      return "";
    }
    StringBuilder localStringBuilder1 = new StringBuilder();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Float.valueOf((float)paramLong1 / 1048576.0F);
    StringBuilder localStringBuilder2 = localStringBuilder1.append(String.format("%.2f", arrayOfObject1)).append("MB /");
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Float.valueOf((float)paramLong2 / 1048576.0F);
    return String.format("%.2f", arrayOfObject2) + "MB";
  }
  
  public static String a(Context paramContext, int paramInt)
  {
    return "main." + paramInt + "." + paramContext.getPackageName() + ".obb";
  }
  
  public static String a(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    File localFile = Environment.getExternalStorageDirectory();
    return new StringBuilder().append(localFile.toString()).append(a.a).append(paramContext.getPackageName()).toString() + File.separator + paramString;
  }
  
  public static boolean a(Context paramContext, String paramString, long paramLong)
  {
    File localFile = new File(a(paramContext, paramString));
    if (localFile.exists())
    {
      if (localFile.length() == paramLong) {
        return true;
      }
      localFile.delete();
    }
    return false;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.vending.expansion.downloader.i
 * JD-Core Version:    0.7.0.1
 */