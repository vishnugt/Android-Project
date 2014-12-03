package com.jirbo.adcolony;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

final class da
  extends WebViewClient
{
  String a = a.E;
  
  da(cv paramcv) {}
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    aq.a.a("DEC onLoad: ").b(paramString);
    if (paramString.equals(this.a))
    {
      aq.a.b("DEC disabling mouse events");
      this.b.a("javascript:\nif (typeof(CN) != 'undefined' && CN.div) {\n  if (typeof(cn_dispatch_on_touch_begin) != 'undefined') CN.div.removeEventListener('mousedown',  cn_dispatch_on_touch_begin, true);\n  if (typeof(cn_dispatch_on_touch_end) != 'undefined')   CN.div.removeEventListener('mouseup',  cn_dispatch_on_touch_end, true);\n  if (typeof(cn_dispatch_on_touch_move) != 'undefined')  CN.div.removeEventListener('mousemove',  cn_dispatch_on_touch_move, true);\n}\n");
    }
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (paramString.equals(this.a))
    {
      this.b.A = false;
      this.b.c.j = true;
      this.b.u = System.currentTimeMillis();
      this.b.c.n = ((this.b.u - this.b.t) / 1000.0D);
    }
    this.b.c.C.removeView(this.b.b);
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if (paramString.equals(this.a))
    {
      this.b.c.i = true;
      this.b.t = System.currentTimeMillis();
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    aq.a.a("DEC request: ").b(paramString);
    ar localar;
    String str2;
    HashMap localHashMap;
    if (paramString.contains("mraid:"))
    {
      localar = this.b.ak;
      String str1 = paramString.replace("mraid://", "");
      String[] arrayOfString1;
      if (str1.contains("?"))
      {
        arrayOfString1 = str1.split("\\?");
        str2 = arrayOfString1[0];
        if (arrayOfString1 == null) {
          break label153;
        }
      }
      label153:
      for (String[] arrayOfString2 = arrayOfString1[1].split("&");; arrayOfString2 = new String[0])
      {
        localHashMap = new HashMap();
        int i = arrayOfString2.length;
        for (int j = 0; j < i; j++)
        {
          String str22 = arrayOfString2[j];
          localHashMap.put(str22.split("=")[0], str22.split("=")[1]);
        }
        str2 = str1;
        arrayOfString1 = null;
        break;
      }
      localar.f = a.u;
      localar.g = ("{\"ad_slot\":" + localar.f.c.k.d + "}");
      if (str2.contains("send_adc_event"))
      {
        String str21 = (String)localHashMap.get("type");
        aq.a.a("ADC [info] MRAIDCommandSendADCEvent called with type: ").b(str21);
        a.d(str21);
      }
    }
    for (;;)
    {
      localar.a("adc_bridge.nativeCallComplete()");
      return true;
      if (str2.contains("close"))
      {
        aq.a.b("ADC [info] MRAIDCommandClose called");
        localar.b.finish();
        a.x.a();
        continue;
      }
      if ((str2.contains("open_store")) && (!a.p))
      {
        String str19 = (String)localHashMap.get("item");
        aq.a.a("ADC [info] MRAIDCommandOpenStore called with item: ").b(str19);
        a.p = true;
        localar.d.postDelayed(localar.e, 1000L);
        a.a("html5_interaction", localar.g);
        String str20 = ar.b(str19);
        try
        {
          Intent localIntent10 = new Intent("android.intent.action.VIEW", Uri.parse(str20));
          localar.b.startActivity(localIntent10);
        }
        catch (Exception localException7)
        {
          Toast.makeText(localar.b, "Unable to open store.", 0).show();
        }
        continue;
      }
      if ((str2.contains("open")) && (!a.p))
      {
        String str14 = (String)localHashMap.get("url");
        aq.a.a("ADC [info] MRAIDCommandOpen called with url: ").b(str14);
        a.p = true;
        localar.d.postDelayed(localar.e, 1000L);
        String str15 = ar.b(str14);
        if (str15.startsWith("adcvideo"))
        {
          String str18 = str15.replace("adcvideo", "http");
          localar.c.a(str18);
          continue;
        }
        if (str14.contains("youtube"))
        {
          try
          {
            String str17 = str15.substring(2 + str15.indexOf('v'));
            Intent localIntent9 = new Intent("android.intent.action.VIEW", Uri.parse("vnd.youtube:" + str17));
            localar.b.startActivity(localIntent9);
          }
          catch (Exception localException6)
          {
            String str16 = ar.b(str14);
            if (str16.contains("safari")) {
              str16 = str16.replace("safari", "http");
            }
            Intent localIntent8 = new Intent("android.intent.action.VIEW", Uri.parse(str16));
            localar.b.startActivity(localIntent8);
          }
          continue;
        }
        if (str15.startsWith("browser"))
        {
          a.d("html5_interaction");
          Intent localIntent7 = new Intent("android.intent.action.VIEW", Uri.parse(str15.replace("browser", "http")));
          localar.b.startActivity(localIntent7);
          continue;
        }
        a.a("html5_interaction", localar.g);
        AdColonyBrowser.a = str15;
        Intent localIntent6 = new Intent(localar.b, AdColonyBrowser.class);
        localar.b.startActivity(localIntent6);
        continue;
      }
      if (str2.contains("expand"))
      {
        String str13 = (String)localHashMap.get("url");
        aq.a.a("ADC [info] MRAIDCommandExpand called with url: ").b(str13);
        localar.a("adc_bridge.fireChangeEvent({state:'expanded'});");
        continue;
      }
      if ((str2.contains("create_calendar_event")) && (!a.p))
      {
        localar.a(localHashMap);
        continue;
      }
      if ((str2.contains("mail")) && (!a.p))
      {
        aq.a.a("ADC [info] MRAIDCommandMail called with parameters: ").b(localHashMap);
        a.p = true;
        localar.d.postDelayed(localar.e, 1000L);
        String str10 = ar.b((String)localHashMap.get("subject"));
        String str11 = ar.b((String)localHashMap.get("body"));
        String str12 = ar.b((String)localHashMap.get("to"));
        a.a("html5_interaction", localar.g);
        try
        {
          Intent localIntent5 = new Intent("android.intent.action.SEND");
          localIntent5.setType("plain/text");
          localIntent5.putExtra("android.intent.extra.SUBJECT", str10).putExtra("android.intent.extra.TEXT", str11).putExtra("android.intent.extra.EMAIL", new String[] { str12 });
          localar.b.startActivity(localIntent5);
        }
        catch (Exception localException5)
        {
          localException5.printStackTrace();
          Toast.makeText(localar.b, "Unable to launch email client.", 0).show();
        }
        continue;
      }
      if ((str2.contains("sms")) && (!a.p))
      {
        aq.a.a("ADC [info] MRAIDCommandSMS called with parameters: ").b(localHashMap);
        a.p = true;
        localar.d.postDelayed(localar.e, 1000L);
        String str8 = ar.b((String)localHashMap.get("to"));
        String str9 = ar.b((String)localHashMap.get("body"));
        a.a("html5_interaction", localar.g);
        try
        {
          Intent localIntent4 = new Intent("android.intent.action.VIEW", Uri.parse("sms:" + str8)).putExtra("sms_body", str9);
          localar.b.startActivity(localIntent4);
        }
        catch (Exception localException4)
        {
          localException4.printStackTrace();
          Toast.makeText(localar.b, "Failed to create sms.", 0).show();
        }
        continue;
      }
      if ((str2.contains("tel")) && (!a.p))
      {
        aq.a.a("ADC [info] MRAIDCommandTel called with parameters: ").b(localHashMap);
        a.p = true;
        localar.d.postDelayed(localar.e, 1000L);
        String str7 = ar.b((String)localHashMap.get("number"));
        a.a("html5_interaction", localar.g);
        try
        {
          Intent localIntent3 = new Intent("android.intent.action.DIAL").setData(Uri.parse("tel:" + str7));
          localar.b.startActivity(localIntent3);
        }
        catch (Exception localException3)
        {
          Toast.makeText(localar.b, "Failed to dial number.", 0).show();
        }
        continue;
      }
      if (str2.contains("custom_event"))
      {
        aq.a.a("ADC [info] MRAIDCommandSendCustomADCEvent called with parameters: ").b(localHashMap);
        String str6 = ar.b((String)localHashMap.get("event_type"));
        a.a("custom_event", "{\"event_type\":\"" + str6 + "\",\"ad_slot\":" + localar.f.c.k.d + "}");
        continue;
      }
      if ((str2.contains("launch_app")) && (!a.p))
      {
        aq.a.a("ADC [info] MRAIDCommandLaunchApp called with parameters: ").b(localHashMap);
        a.p = true;
        localar.d.postDelayed(localar.e, 1000L);
        String str5 = ar.b((String)localHashMap.get("handle"));
        a.a("html5_interaction", localar.g);
        try
        {
          Intent localIntent2 = localar.b.getPackageManager().getLaunchIntentForPackage(str5);
          localar.b.startActivity(localIntent2);
        }
        catch (Exception localException2)
        {
          Toast.makeText(localar.b, "Failed to launch external application.", 0).show();
        }
        continue;
      }
      if (str2.contains("check_app_presence"))
      {
        aq.a.a("ADC [info] MRAIDCommandCheckAppPresence called with parameters: ").b(localHashMap);
        String str4 = ar.b((String)localHashMap.get("handle"));
        boolean bool = cm.a(str4);
        localar.a("adc_bridge.fireAppPresenceEvent('" + str4 + "'," + bool + ")");
        continue;
      }
      if (str2.contains("auto_play"))
      {
        aq.a.a("ADC [info] MRAIDCommandCheckAutoPlay called with parameters: ").b(localHashMap);
        continue;
      }
      if (!str2.contains("save_screenshot")) {
        continue;
      }
      a.p = true;
      localar.d.postDelayed(localar.e, 1000L);
      a.a("html5_interaction", localar.g);
      String str3 = Environment.getExternalStorageDirectory().toString() + "/Pictures/AdColony_Screenshots/AdColony_Screenshot_" + System.currentTimeMillis() + ".jpg";
      View localView = localar.a.getRootView();
      localView.setDrawingCacheEnabled(true);
      Bitmap localBitmap = Bitmap.createBitmap(localView.getDrawingCache());
      localView.setDrawingCacheEnabled(false);
      File localFile1 = new File(Environment.getExternalStorageDirectory().toString() + "/Pictures");
      File localFile2 = new File(Environment.getExternalStorageDirectory().toString() + "/Pictures/AdColony_Screenshots");
      try
      {
        localFile1.mkdir();
        localFile2.mkdir();
        label1920:
        File localFile3 = new File(str3);
        try
        {
          FileOutputStream localFileOutputStream = new FileOutputStream(localFile3);
          localBitmap.compress(Bitmap.CompressFormat.JPEG, 90, localFileOutputStream);
          localFileOutputStream.flush();
          localFileOutputStream.close();
          Toast.makeText(localar.b, "Screenshot saved to Gallery!", 0).show();
          localar.b.sendBroadcast(new Intent("android.intent.action.MEDIA_MOUNTED", Uri.parse("file://" + Environment.getExternalStorageDirectory())));
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          for (;;)
          {
            Toast.makeText(localar.b, "Error saving screenshot.", 0).show();
            aq.a.a("ADC [info] FileNotFoundException in MRAIDCommandTakeScreenshot");
          }
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            Toast.makeText(localar.b, "Error saving screenshot.", 0).show();
            aq.a.a("ADC [info] IOException in MRAIDCommandTakeScreenshot");
          }
        }
        if (paramString.contains("youtube"))
        {
          Intent localIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("vnd.youtube:" + paramString));
          localIntent1.putExtra("VIDEO_ID", paramString);
          this.b.c.startActivity(localIntent1);
          return true;
        }
        return paramString.contains("mraid.js");
      }
      catch (Exception localException1)
      {
        break label1920;
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.da
 * JD-Core Version:    0.7.0.1
 */