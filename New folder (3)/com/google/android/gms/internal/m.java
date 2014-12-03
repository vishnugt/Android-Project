package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

public final class m
  implements k
{
  private static int a(DisplayMetrics paramDisplayMetrics, Map<String, String> paramMap, String paramString, int paramInt)
  {
    String str = (String)paramMap.get(paramString);
    if (str != null) {}
    try
    {
      int i = av.a(paramDisplayMetrics, Integer.parseInt(str));
      paramInt = i;
      return paramInt;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      new StringBuilder("Could not parse ").append(paramString).append(" in a video GMSG: ").append(str).toString();
    }
    return paramInt;
  }
  
  public final void a(ax paramax, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("action");
    if (str1 == null) {}
    w localw;
    String str2;
    do
    {
      String str3;
      do
      {
        p localp;
        do
        {
          return;
          localp = paramax.c();
        } while (localp == null);
        boolean bool1 = "new".equalsIgnoreCase(str1);
        boolean bool2 = "position".equalsIgnoreCase(str1);
        if ((bool1) || (bool2))
        {
          DisplayMetrics localDisplayMetrics1 = paramax.getContext().getResources().getDisplayMetrics();
          int i = a(localDisplayMetrics1, paramMap, "x", 0);
          int j = a(localDisplayMetrics1, paramMap, "y", 0);
          int k = a(localDisplayMetrics1, paramMap, "w", -1);
          int m = a(localDisplayMetrics1, paramMap, "h", -1);
          if ((bool1) && (localp.b() == null))
          {
            localp.b(i, j, k, m);
            return;
          }
          localp.a(i, j, k, m);
          return;
        }
        localw = localp.b();
        if (localw == null)
        {
          w.a(paramax, "no_video_view", null);
          return;
        }
        if ("click".equalsIgnoreCase(str1))
        {
          DisplayMetrics localDisplayMetrics2 = paramax.getContext().getResources().getDisplayMetrics();
          int n = a(localDisplayMetrics2, paramMap, "x", 0);
          int i1 = a(localDisplayMetrics2, paramMap, "y", 0);
          long l = SystemClock.uptimeMillis();
          MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, n, i1, 0);
          localw.a(localMotionEvent);
          localMotionEvent.recycle();
          return;
        }
        if (!"controls".equalsIgnoreCase(str1)) {
          break;
        }
        str3 = (String)paramMap.get("enabled");
      } while (str3 == null);
      localw.a(Boolean.parseBoolean(str3));
      return;
      if (!"currentTime".equalsIgnoreCase(str1)) {
        break;
      }
      str2 = (String)paramMap.get("time");
    } while (str2 == null);
    try
    {
      localw.a((int)(1000.0F * Float.parseFloat(str2)));
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      new StringBuilder("Could not parse time parameter from currentTime video GMSG: ").append(str2).toString();
      return;
    }
    if ("hide".equalsIgnoreCase(str1))
    {
      localw.setVisibility(4);
      return;
    }
    if ("load".equalsIgnoreCase(str1))
    {
      localw.b();
      return;
    }
    if ("pause".equalsIgnoreCase(str1))
    {
      localw.c();
      return;
    }
    if ("play".equalsIgnoreCase(str1))
    {
      localw.d();
      return;
    }
    if ("show".equalsIgnoreCase(str1))
    {
      localw.setVisibility(0);
      return;
    }
    if ("src".equalsIgnoreCase(str1))
    {
      localw.a((String)paramMap.get("src"));
      return;
    }
    new StringBuilder("Unknown video action: ").append(str1).toString();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.m
 * JD-Core Version:    0.7.0.1
 */