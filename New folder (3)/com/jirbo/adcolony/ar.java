package com.jirbo.adcolony;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.webkit.WebView;
import android.widget.Toast;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

final class ar
{
  WebView a;
  Activity b;
  ADCVideo c;
  Handler d;
  Runnable e;
  dn f;
  String g;
  
  public ar(ADCVideo paramADCVideo, WebView paramWebView, Activity paramActivity)
  {
    this.a = paramWebView;
    this.b = paramActivity;
    this.c = paramADCVideo;
    this.d = new Handler();
    this.e = new as(this);
  }
  
  static String b(String paramString)
  {
    if (paramString.equals(null)) {
      return "";
    }
    return URLDecoder.decode(paramString);
  }
  
  final void a(String paramString)
  {
    this.a.loadUrl("javascript:" + paramString);
  }
  
  final void a(HashMap paramHashMap)
  {
    aq.a.a("ADC [info] MRAIDCommandCreateCalendarEvent called with parameters: ").b(paramHashMap);
    a.p = true;
    this.d.postDelayed(this.e, 1000L);
    a.a("html5_interaction", this.g);
    SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mmZ");
    SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZ");
    SimpleDateFormat localSimpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
    String str1 = b((String)paramHashMap.get("description"));
    b((String)paramHashMap.get("location"));
    String str2 = b((String)paramHashMap.get("start"));
    String str3 = b((String)paramHashMap.get("end"));
    String str4 = b((String)paramHashMap.get("summary"));
    String str5 = b((String)paramHashMap.get("recurrence"));
    String str6 = "";
    String str7 = "";
    HashMap localHashMap = new HashMap();
    String str8 = str5.replace("\"", "").replace("{", "").replace("}", "");
    if (!str8.equals(""))
    {
      for (String str11 : str8.split(",")) {
        localHashMap.put(str11.split(":")[0], str11.split(":")[1]);
      }
      str6 = b((String)localHashMap.get("expires"));
      str7 = b((String)localHashMap.get("frequency")).toUpperCase();
      aq.a.a("Calendar Recurrence - ").b(str8);
      aq.a.a("Calendar Recurrence - frequency = ").b(str7);
      aq.a.a("Calendar Recurrence - expires =  ").b(str6);
    }
    String str9 = str6;
    String str10 = str7;
    if (str4.equals("")) {
      str4 = b((String)paramHashMap.get("description"));
    }
    Object localObject;
    Date localDate2;
    Date localDate3;
    for (;;)
    {
      Date localDate1;
      try
      {
        Date localDate6 = localSimpleDateFormat1.parse(str2);
        localDate1 = localDate6;
      }
      catch (Exception localException1)
      {
        Date localDate7;
        Date localDate5;
        Date localDate4;
        localDate1 = null;
      }
      for (;;)
      {
        try
        {
          localDate7 = localSimpleDateFormat1.parse(str3);
          localObject = localDate7;
          if (localDate1 != null) {
            continue;
          }
        }
        catch (Exception localException5)
        {
          long l1;
          long l2;
          long l3;
          Intent localIntent;
          continue;
          long l4 = 0L;
          continue;
        }
        try
        {
          localDate1 = localSimpleDateFormat2.parse(str2);
          localDate5 = localSimpleDateFormat2.parse(str3);
          localObject = localDate5;
          localDate2 = localDate1;
        }
        catch (Exception localException4) {}
      }
      try
      {
        localDate4 = localSimpleDateFormat3.parse(str9);
        localDate3 = localDate4;
      }
      catch (Exception localException2)
      {
        localDate3 = null;
        continue;
        l1 = localDate2.getTime();
        l2 = ((Date)localObject).getTime();
        l3 = 0L;
        if (localDate3 == null) {
          break label533;
        }
        l3 = (localDate3.getTime() - localDate2.getTime()) / 1000L;
        if (!str10.equals("DAILY")) {
          break label680;
        }
      }
      if (localDate2 != null) {
        break;
      }
      Toast.makeText(this.b, "Unable to create Calendar Event.", 0).show();
      return;
      localObject = null;
      continue;
      localDate2 = localDate1;
    }
    label533:
    l4 = 1L + l3 / 86400L;
    if (!str8.equals(""))
    {
      localIntent = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", str4).putExtra("description", str1).putExtra("beginTime", l1).putExtra("endTime", l2).putExtra("rrule", "FREQ=" + str10 + ";COUNT=" + l4);
      aq.a.a("Calendar Recurrence - count = ").b(l4);
    }
    for (;;)
    {
      try
      {
        this.b.startActivity(localIntent);
        return;
      }
      catch (Exception localException3)
      {
        Toast.makeText(this.b, "Unable to create Calendar Event.", 0).show();
        return;
      }
      label680:
      if (str10.equals("WEEKLY"))
      {
        l4 = 1L + l3 / 604800L;
        break;
      }
      if (str10.equals("MONTHLY"))
      {
        l4 = 1L + l3 / 2629800L;
        break;
      }
      if (!str10.equals("YEARLY")) {
        break label802;
      }
      l4 = 1L + l3 / 31557600L;
      break;
      localIntent = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", str4).putExtra("description", str1).putExtra("beginTime", l1).putExtra("endTime", l2);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ar
 * JD-Core Version:    0.7.0.1
 */