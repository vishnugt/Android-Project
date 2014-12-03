package com.jirbo.adcolony;

import android.app.Activity;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;

final class f
{
  static String c;
  String A;
  String B;
  String C;
  String D;
  String E;
  String F;
  String G;
  String H;
  g a;
  String b = "2.0.4";
  int d = 300;
  boolean e = false;
  boolean f = false;
  String g;
  ad h = new ad();
  String i;
  String[] j;
  bq k;
  au l;
  double m = 0.0D;
  String n = "android";
  String o = "android_native";
  String p = "1.0";
  String q = "google";
  boolean r = false;
  String s;
  String t;
  String u;
  String v;
  String w = "";
  String x;
  String y;
  String z;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 10) {}
    for (String str = "https://androidads20staging.adcolony.com/configure";; str = "http://androidads20staging.adcolony.com/configure")
    {
      c = str;
      return;
    }
  }
  
  f(g paramg)
  {
    this.a = paramg;
  }
  
  private void b()
  {
    bl localbl = this.l.t.h;
    bc localbc = this.l.t.i;
    bu localbu = this.a.c;
    if (!this.l.t.d) {
      return;
    }
    if (localbc.a())
    {
      a.z = true;
      a.E = localbc.g;
      a.F = localbu.b(localbc.f.b);
      this.h.b("close_image_normal", localbu.b(localbc.j.f));
      this.h.b("close_image_down", localbu.b(localbc.j.h));
      this.h.b("reload_image_normal", localbu.b(localbc.i.f));
      this.h.b("reload_image_down", localbu.b(localbc.i.h));
    }
    for (;;)
    {
      this.h.b("end_card_enabled", this.l.t.d);
      this.h.b("load_timeout_enabled", this.l.t.i.c);
      this.h.a("load_timeout", this.l.t.i.b);
      this.h.b("hardware_acceleration_disabled", this.a.b.j.e);
      return;
      a.z = false;
      this.h.b("end_card_filepath", localbu.b(localbl.d));
      this.h.b("info_image_normal", localbu.b(localbl.f.f));
      this.h.b("info_image_down", localbu.b(localbl.f.h));
      this.h.b("info_url", localbl.f.j);
      this.h.b("replay_image_normal", localbu.b(localbl.h.f));
      this.h.b("replay_image_down", localbu.b(localbl.h.h));
      this.h.b("continue_image_normal", localbu.b(localbl.i.f));
      this.h.b("continue_image_down", localbu.b(localbl.i.h));
      this.h.b("download_image_normal", localbu.b(localbl.g.f));
      this.h.b("download_image_down", localbu.b(localbl.g.h));
      this.h.b("download_url", localbl.g.j);
    }
  }
  
  final void a()
  {
    dk localdk = this.a.g;
    z localz = ap.b(new ag("zone_state.txt"));
    if (localz != null)
    {
      localdk.c.clear();
      int i4 = 0;
      if (i4 < localz.a.size())
      {
        ad localad = localz.a(i4);
        dj localdj = new dj();
        if (localad == null) {}
        for (int i5 = 0;; i5 = 1)
        {
          if (i5 != 0) {
            localdk.c.add(localdj);
          }
          i4++;
          break;
          localdj.a = localad.a("uuid", "error");
          localdj.b = localad.e("skipped_plays");
          localdj.c = localad.e("play_order_index");
        }
      }
    }
    String[] arrayOfString = localdk.a.a.j;
    int i1 = arrayOfString.length;
    for (int i2 = 0; i2 < i1; i2++) {
      localdk.a(arrayOfString[i2]);
    }
    String str1 = Settings.Secure.getString(a.a().getContentResolver(), "android_id");
    String str2;
    label220:
    String str3;
    label261:
    String str12;
    label287:
    String str4;
    label303:
    String str5;
    label319:
    String str6;
    label338:
    String str7;
    label360:
    String str8;
    label376:
    String str9;
    label396:
    String str10;
    label425:
    String str11;
    label475:
    label508:
    cg localcg;
    if (str1 != null)
    {
      this.s = str1;
      str2 = cm.b(this.s);
      if (str2 == null) {
        break label1863;
      }
      this.t = str2;
      str3 = ((TelephonyManager)a.a().getSystemService("phone")).getNetworkOperatorName();
      if (str3.length() == 0) {
        str3 = "unknown";
      }
      if (str3 == null) {
        break label1870;
      }
      this.v = str3;
      if (this.x == null)
      {
        str12 = ec.a(a.a());
        if (str12 == null) {
          break label1877;
        }
        this.x = str12;
      }
      str4 = Build.MANUFACTURER;
      if (str4 == null) {
        break label1884;
      }
      this.y = str4;
      str5 = Build.MODEL;
      if (str5 == null) {
        break label1891;
      }
      this.z = str5;
      str6 = Locale.getDefault().getLanguage();
      if (str6 == null) {
        break label1898;
      }
      this.D = str6;
      this.E = "";
      str7 = Build.VERSION.RELEASE;
      if (str7 == null) {
        break label1906;
      }
      this.F = str7;
      str8 = ah.b();
      if (str8 == null) {
        break label1913;
      }
      this.B = str8;
      str9 = cm.b(this.B);
      if (str9 == null) {
        break label1920;
      }
      this.C = str9;
      str10 = ah.a();
      if (str10 == null) {
        break label1927;
      }
      this.G = str10;
      StringBuilder localStringBuilder = new StringBuilder();
      Runtime localRuntime = Runtime.getRuntime();
      str11 = (localRuntime.totalMemory() - localRuntime.freeMemory()) / 1048576L;
      if (str11 == null) {
        break label1934;
      }
      this.H = str11;
      a.G = this.F;
      a.H = this.b;
      if (!a.d) {
        break label1941;
      }
      this.A = "tablet";
      this.u = "";
      if ((cm.a("com.android.vending")) || (cm.a("com.android.market"))) {
        this.u = "google";
      }
      if (cm.a("com.amazon.venezia"))
      {
        if (this.u.length() > 0) {
          this.u += ",";
        }
        this.u += "amazon";
      }
      if (aq.b.f)
      {
        aq.b.a("sdk_version:").b(this.b);
        aq.b.a("ad_manifest_url:").b(c);
        aq.b.a("app_id:").b(this.i);
        aq.b.a("zone_ids:").b(this.j);
        aq.b.a("os_name:").b(this.n);
        aq.b.a("sdk_type:").b(this.o);
        aq.b.a("app_version:").b(this.p);
        aq.b.a("origin_store:").b(this.q);
        aq.b.a("skippable:").b(this.r);
        aq.b.a("android_id:").b(this.s);
        aq.b.a("android_id_sha1:").b(this.t);
        aq.b.a("available_stores:").b(this.u);
        aq.b.a("carrier_name:").b(this.v);
        aq.b.a("custom_id:").b(this.w);
        aq.b.a("device_id:").b(this.x);
        aq.b.a("device_manufacturer:").b(this.y);
        aq.b.a("device_model:").b(this.z);
        aq.b.a("device_type:").b(this.A);
        aq.b.a("imei:").b(this.B);
        aq.b.a("imei_sha1:").b(this.C);
        aq.b.a("language:").b(this.D);
        aq.b.a("open_udid:").b(this.E);
        aq.b.a("os_version:").b(this.F);
      }
      cj localcj = new cj();
      localcj.a("&os_name=");
      localcj.a(by.a(this.n));
      localcj.a("&os_version=");
      localcj.a(by.a(this.F));
      localcj.a("&app_version=");
      localcj.a(by.a(this.p));
      localcj.a("&android_id_sha1=");
      localcj.a(by.a(this.t));
      localcj.a("&device_id=");
      localcj.a(by.a(this.x));
      localcj.a("&open_udid=");
      localcj.a(by.a(this.E));
      localcj.a("&device_type=");
      localcj.a(by.a(this.A));
      localcj.a("&ln=");
      localcj.a(by.a(this.D));
      localcj.a("&device_brand=");
      localcj.a(by.a(this.y));
      localcj.a("&device_model=");
      localcj.a(by.a(this.z));
      localcj.a("&screen_width=");
      localcj.a(by.a(a.a().getWindowManager().getDefaultDisplay().getWidth()));
      localcj.a("&screen_height=");
      localcj.a(by.a(a.a().getWindowManager().getDefaultDisplay().getHeight()));
      localcj.a("&sdk_type=");
      localcj.a(by.a(this.o));
      localcj.a("&sdk_version=");
      localcj.a(by.a(this.b));
      localcj.a("&origin_store=");
      localcj.a(by.a(this.q));
      localcj.a("&available_stores=");
      localcj.a(by.a(this.u));
      localcj.a("&imei_sha1=");
      localcj.a(by.a(this.C));
      localcj.a("&memory_class=");
      localcj.a(by.a(this.G));
      localcj.a("&memory_used_mb=");
      localcj.a(by.a(this.H));
      this.g = localcj.toString();
      localcg = this.a.f;
      aq.a.b("Configuring storage");
      if ((cg.c() == null) || (cg.a(cg.c()) <= 1048576.0D + cg.a(cg.b())) || (cg.a(cg.b()) >= 31457280.0D)) {
        break label2184;
      }
    }
    label1920:
    label1927:
    label2184:
    for (int i3 = 0;; i3 = 1)
    {
      if (i3 != 0)
      {
        aq.b.b("Using internal storage:");
        localcg.b = (cg.b() + "/adc/");
        label1557:
        localcg.c = (localcg.b + "media/");
        aq.a.b(localcg.c);
        localcg.e = new File(localcg.c);
        if (!localcg.e.isDirectory())
        {
          localcg.e.delete();
          localcg.e.mkdirs();
        }
        if (localcg.e.isDirectory()) {
          break label2003;
        }
        a.d();
      }
      for (;;)
      {
        bu localbu = this.a.c;
        localbu.a();
        localbu.h = true;
        cc localcc = this.a.d;
        localcc.a();
        localcc.d = 0;
        ca localca = this.a.h;
        localca.a();
        localca.e = false;
        this.f = true;
        this.a.b.a();
        if ((this.a.b.j.i == null) || (this.a.b.j.i.equals(""))) {
          this.a.b.j.i = "all";
        }
        if ((this.a.b.j.j == null) || (this.a.b.j.j.equals(""))) {
          this.a.b.j.j = "all";
        }
        return;
        str1 = "";
        break;
        label1863:
        str2 = "";
        break label220;
        label1870:
        str3 = "";
        break label261;
        label1877:
        str12 = "";
        break label287;
        label1884:
        str4 = "";
        break label303;
        label1891:
        str5 = "";
        break label319;
        label1898:
        str6 = "en";
        break label338;
        label1906:
        str7 = "";
        break label360;
        label1913:
        str8 = "";
        break label376;
        str9 = "";
        break label396;
        str10 = "";
        break label425;
        label1934:
        str11 = "";
        break label475;
        label1941:
        this.A = "phone";
        break label508;
        localcg.b = (cg.c() + "/.adc2/" + cm.c() + "/");
        aq.b.b("Using external storage:");
        break label1557;
        label2003:
        if (cg.a(localcg.c) < 20971520.0D)
        {
          new StringBuilder("Not enough space to store temporary files (").append(cg.a(localcg.c)).append(" bytes available).").toString();
          a.d();
        }
        else
        {
          localcg.d = (cg.b() + "/adc/data/");
          if (a.e == 0) {
            localcg.d = (localcg.b + "data/");
          }
          aq.a.a("Internal data path: ").b(localcg.d);
          localcg.f = new File(localcg.d);
          if (!localcg.f.isDirectory()) {
            localcg.f.delete();
          }
          localcg.f.mkdirs();
        }
      }
    }
  }
  
  final void a(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    String[] arrayOfString1 = paramString.split(",");
    int i1 = arrayOfString1.length;
    int i2 = 0;
    if (i2 < i1)
    {
      String[] arrayOfString2 = arrayOfString1[i2].split(":");
      String str1;
      String str2;
      if (arrayOfString2.length == 2)
      {
        str1 = arrayOfString2[0];
        str2 = arrayOfString2[1];
        if (str1.equals("version")) {
          this.p = str2;
        }
      }
      for (;;)
      {
        i2++;
        break;
        if (str1.equals("store"))
        {
          if ((str2.toLowerCase().equals("google")) || (str2.toLowerCase().equals("amazon"))) {
            this.q = str2;
          } else {
            throw new dv("Origin store in client options must be set to either 'google' or 'amazon'");
          }
        }
        else if (str1.equals("skippable"))
        {
          this.r = str2.equals("true");
          continue;
          if (arrayOfString2[0].equals("skippable")) {
            this.r = true;
          }
        }
      }
    }
  }
  
  final void b(String paramString)
  {
    this.k = this.a.b.j.n.a(paramString);
    this.l = this.k.a();
    bu localbu = this.a.c;
    bp localbp = this.l.u;
    this.h.b("video_enabled", localbp.a);
    this.h.b("video_filepath", localbp.a());
    this.h.a("video_width", localbp.b);
    this.h.a("video_height", localbp.c);
    this.h.a("video_duration", localbp.k);
    this.h.a("engagement_delay", localbp.m.e);
    this.h.a("skip_delay", localbp.l.e);
    this.h.b("browser_close_image_normal", localbu.b(this.l.q.k.f));
    this.h.b("browser_close_image_down", localbu.b(this.l.q.k.h));
    this.h.b("browser_reload_image_normal", localbu.b(this.l.q.m.f));
    this.h.b("browser_reload_image_down", localbu.b(this.l.q.m.h));
    this.h.b("browser_back_image_normal", localbu.b(this.l.q.j.f));
    this.h.b("browser_back_image_down", localbu.b(this.l.q.j.h));
    this.h.b("browser_forward_image_normal", localbu.b(this.l.q.l.f));
    this.h.b("browser_forward_image_down", localbu.b(this.l.q.l.h));
    this.h.b("browser_stop_image_normal", localbu.b(this.l.q.i.f));
    this.h.b("browser_stop_image_down", localbu.b(this.l.q.i.h));
    this.h.b("browser_glow_button", localbu.b(this.l.q.a));
    this.h.b("browser_icon", localbu.b(this.l.q.h.d));
    this.h.b("skip_video_image_normal", localbu.b(localbp.l.f));
    this.h.b("skip_video_image_down", localbu.b(localbp.l.h));
    this.h.b("engagement_image_normal", localbu.b(localbp.m.f));
    this.h.b("engagement_image_down", localbu.b(localbp.m.h));
    b();
  }
  
  final void c(String paramString)
  {
    this.k = this.a.b.j.n.a(paramString);
    this.l = this.k.a();
    bu localbu = this.a.c;
    bp localbp = this.l.u;
    this.h.b("video_enabled", localbp.a);
    this.h.b("video_filepath", localbp.a());
    this.h.a("video_width", localbp.b);
    this.h.a("video_height", localbp.c);
    this.h.a("video_duration", localbp.k);
    this.h.a("engagement_delay", localbp.m.e);
    this.h.a("skip_delay", localbp.l.e);
    b();
    aw localaw = this.l.r;
    this.h.b("pre_popup_bg", localbu.b(localaw.b.d.e));
    this.h.b("v4vc_logo", localbu.b(localaw.b.d.l.d));
    this.h.b("no_button_normal", localbu.b(localaw.b.d.n.f));
    this.h.b("no_button_down", localbu.b(localaw.b.d.n.h));
    this.h.b("yes_button_normal", localbu.b(localaw.b.d.m.f));
    this.h.b("yes_button_down", localbu.b(localaw.b.d.m.h));
    this.h.b("done_button_normal", localbu.b(localaw.c.d.m.f));
    this.h.b("done_button_down", localbu.b(localaw.c.d.m.h));
    this.h.b("browser_close_image_normal", localbu.b(this.l.q.k.f));
    this.h.b("browser_close_image_down", localbu.b(this.l.q.k.h));
    this.h.b("browser_reload_image_normal", localbu.b(this.l.q.m.f));
    this.h.b("browser_reload_image_down", localbu.b(this.l.q.m.h));
    this.h.b("browser_back_image_normal", localbu.b(this.l.q.j.f));
    this.h.b("browser_back_image_down", localbu.b(this.l.q.j.h));
    this.h.b("browser_forward_image_normal", localbu.b(this.l.q.l.f));
    this.h.b("browser_forward_image_down", localbu.b(this.l.q.l.h));
    this.h.b("browser_stop_image_normal", localbu.b(this.l.q.i.f));
    this.h.b("browser_stop_image_down", localbu.b(this.l.q.i.h));
    this.h.b("browser_glow_button", localbu.b(this.l.q.a));
    this.h.b("browser_icon", localbu.b(this.l.q.h.d));
    this.h.b("skip_video_image_normal", localbu.b(localbp.l.f));
    this.h.b("skip_video_image_down", localbu.b(localbp.l.h));
    this.h.b("engagement_image_normal", localbu.b(localbp.m.f));
    this.h.b("engagement_image_down", localbu.b(localbp.m.h));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.f
 * JD-Core Version:    0.7.0.1
 */