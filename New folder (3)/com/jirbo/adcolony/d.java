package com.jirbo.adcolony;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

final class d
  implements am
{
  g a;
  boolean b;
  boolean c;
  boolean d;
  boolean e = true;
  boolean f = false;
  double g;
  Handler h;
  Runnable i;
  ay j = new ay();
  
  d(g paramg)
  {
    this.a = paramg;
    this.h = new Handler();
    this.i = new e(this);
  }
  
  final void a()
  {
    if ((this.e) || (a.o))
    {
      this.e = false;
      this.c = true;
      this.f = false;
      this.h.postDelayed(this.i, 60000L);
      return;
    }
    this.f = true;
  }
  
  public final void a(aj paramaj)
  {
    a.i = true;
    ad localad;
    if (paramaj.i)
    {
      aq.c.b("Finished downloading:");
      aq.c.b(paramaj.c);
      localad = ap.a(paramaj.l);
      if (localad == null)
      {
        aq.a.b("Invalid JSON in manifest.  Raw data:");
        aq.a.b(paramaj.l);
      }
    }
    else
    {
      aq.c.b("Error downloading:");
      aq.c.b(paramaj.c);
      return;
    }
    if (a(localad))
    {
      aq.b.b("Ad manifest updated.");
      new ag("manifest.txt").a(paramaj.l);
      this.b = true;
      this.j.a();
      if ((this.j.i == null) || (this.j.i.equals(""))) {
        this.j.i = "all";
      }
      if ((this.j.j == null) || (this.j.j.equals(""))) {
        this.j.j = "all";
      }
      a.j();
      return;
    }
    aq.b.b("Invalid manifest.");
  }
  
  final boolean a(ad paramad)
  {
    if (paramad == null) {}
    while (!paramad.a("status", "").equals("success")) {
      return false;
    }
    ay localay = this.j;
    ad localad1 = paramad.a("app");
    int m;
    if (localad1 == null)
    {
      m = 0;
      label41:
      if (m == 0) {
        break label1315;
      }
      aq.a.b("Finished parsing manifest");
      if (this.j.h.equalsIgnoreCase("none")) {
        break label1317;
      }
      aq.c.b("Enabling debug logging.");
      a.a(1);
    }
    for (;;)
    {
      return true;
      localay.a = localad1.a("enabled", false);
      localay.b = localad1.a("log_screen_overlay", false);
      localay.c = localad1.a("last_country", "");
      localay.d = localad1.a("last_ip", "");
      localay.f = localad1.a("collect_iap_enabled", false);
      localay.g = localad1.d("media_pool_size");
      localay.h = localad1.a("log_level", "");
      localay.i = localad1.a("view_network_pass_filter", "");
      localay.j = localad1.a("cache_network_pass_filter", "");
      localay.e = localad1.a("hardware_acceleration_disabled", false);
      if ((localay.i == null) || (localay.i.equals(""))) {
        localay.i = "all";
      }
      if ((localay.j == null) || (localay.j.equals(""))) {
        localay.j = "all";
      }
      localay.k = new az();
      az localaz = localay.k;
      ad localad2 = localad1.a("tracking");
      if (localad2 != null)
      {
        localaz.a = localad2.a("update", null);
        localaz.b = localad2.a("install", null);
        localaz.c = localad2.a("dynamic_interests", null);
        localaz.d = localad2.a("user_meta_data", null);
        localaz.e = localad2.a("in_app_purchase", null);
        localaz.g = localad2.a("session_end", null);
        localaz.f = localad2.a("session_start", null);
        localaz.h = new ad();
        localaz.h.b("update", localaz.a);
        localaz.h.b("install", localaz.b);
        localaz.h.b("dynamic_interests", localaz.c);
        localaz.h.b("user_meta_data", localaz.d);
        localaz.h.b("in_app_purchase", localaz.e);
        localaz.h.b("session_end", localaz.g);
        localaz.h.b("session_start", localaz.f);
      }
      localay.l = new bm();
      bm localbm = localay.l;
      ad localad3 = localad1.a("third_party_tracking");
      int k;
      if (localad3 == null) {
        k = 0;
      }
      for (;;)
      {
        if (k != 0) {
          break label666;
        }
        m = 0;
        break;
        ArrayList localArrayList1 = localad3.c("update");
        localbm.a = localArrayList1;
        if (localArrayList1 == null)
        {
          k = 0;
        }
        else
        {
          ArrayList localArrayList3 = localad3.c("install");
          localbm.b = localArrayList3;
          if (localArrayList3 == null)
          {
            k = 0;
          }
          else
          {
            ArrayList localArrayList4 = localad3.c("session_start");
            localbm.c = localArrayList4;
            if (localArrayList4 == null)
            {
              k = 0;
            }
            else
            {
              localbm.d.put("update", localbm.a);
              localbm.d.put("install", localbm.b);
              localbm.d.put("session_start", localbm.c);
              k = 1;
            }
          }
        }
      }
      label666:
      localay.m = localad1.c("console_messages");
      aq.a.b("Parsing zones");
      localay.n = new bt();
      bt localbt = localay.n;
      z localz = localad1.b("zones");
      localbt.a = new ArrayList();
      int i2;
      if (localz == null) {
        i2 = 0;
      }
      for (;;)
      {
        if (i2 != 0) {
          break label1301;
        }
        m = 0;
        break;
        for (int n = 0;; n++)
        {
          if (n >= localz.a.size()) {
            break label1295;
          }
          bq localbq = new bq();
          ad localad4 = localz.a(n);
          int i1;
          if (localad4 == null) {
            i1 = 0;
          }
          for (;;)
          {
            if (i1 != 0) {
              break label1278;
            }
            i2 = 0;
            break;
            localbq.a = localad4.a("uuid", "");
            localbq.e = localad4.a("enabled", false);
            localbq.f = localad4.a("active", false);
            if ((!localbq.e) || (!localbq.f))
            {
              i1 = 1;
            }
            else
            {
              localbq.b = localad4.e("play_interval");
              localbq.c = localad4.e("daily_play_cap");
              localbq.d = localad4.e("session_play_cap");
              localbq.g = new ArrayList();
              ArrayList localArrayList2 = localad4.c("play_order");
              localbq.g = localArrayList2;
              if (localArrayList2 == null)
              {
                i1 = 0;
              }
              else
              {
                localbq.h = new br();
                br localbr = localbq.h;
                ad localad5 = localad4.a("tracking");
                if (localad5 != null) {
                  localbr.a = localad5.a("request", null);
                }
                localbq.i = new ax();
                if (!localbq.i.a(localad4.b("ads")))
                {
                  i1 = 0;
                }
                else
                {
                  localbq.j = new bs();
                  bs localbs = localbq.j;
                  ad localad6 = localad4.a("v4vc");
                  int i4;
                  if (localad6 == null) {
                    i4 = 0;
                  }
                  for (;;)
                  {
                    if (i4 != 0) {
                      break label1253;
                    }
                    i1 = 0;
                    break;
                    localbs.a = localad6.a("enabled", false);
                    if (!localbs.a)
                    {
                      i4 = 1;
                    }
                    else
                    {
                      localbs.b = new bo();
                      bo localbo = localbs.b;
                      ad localad7 = localad6.a("limits");
                      if (localad7 == null) {}
                      for (int i3 = 0;; i3 = 1)
                      {
                        if (i3 != 0) {
                          break label1192;
                        }
                        i4 = 0;
                        break;
                        localbo.a = localad7.e("daily_play_cap");
                        localbo.b = localad7.e("custom_play_cap");
                        localbo.c = localad7.e("custom_play_cap_period");
                      }
                      label1192:
                      localbs.c = localad6.e("reward_amount");
                      localbs.d = localad6.a("reward_name", "");
                      localbs.e = localad6.a("client_side", false);
                      localbs.f = localad6.e("videos_per_reward");
                      i4 = 1;
                    }
                  }
                  label1253:
                  localbq.k = a.c.g.a(localbq.a);
                  i1 = 1;
                }
              }
            }
          }
          label1278:
          localbt.a.add(localbq);
        }
        label1295:
        i2 = 1;
      }
      label1301:
      aq.a.b("Finished parsing app info");
      m = 1;
      break label41;
      label1315:
      break;
      label1317:
      a.a(2);
    }
  }
  
  final boolean a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (!this.b) {
        return false;
      }
      if (paramBoolean) {
        return this.j.a(paramString, true, false);
      }
      return this.j.a(paramString, false, true);
    }
    if (!this.b) {
      return aq.c.b("Ads are not ready to be played, as they are still downloading.");
    }
    if (paramBoolean) {
      return this.j.a(paramString, true, false);
    }
    return this.j.a(paramString, false, true);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.d
 * JD-Core Version:    0.7.0.1
 */