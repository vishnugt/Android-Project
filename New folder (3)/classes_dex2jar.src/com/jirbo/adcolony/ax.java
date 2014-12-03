package com.jirbo.adcolony;

import java.util.ArrayList;
import java.util.HashMap;

final class ax
{
  ArrayList<au> a = new ArrayList();
  
  final au a()
  {
    return (au)this.a.get(0);
  }
  
  final boolean a(z paramz)
  {
    if (paramz == null) {}
    label1287:
    label3116:
    label3774:
    label3778:
    for (;;)
    {
      return false;
      int i = 0;
      if (i >= paramz.a.size()) {
        break;
      }
      au localau = new au();
      ad localad1 = paramz.a(i);
      int k;
      if (localad1 == null) {
        k = 0;
      }
      for (;;)
      {
        if (k == 0) {
          break label3778;
        }
        this.a.add(localau);
        i++;
        break;
        localau.a = localad1.a("uuid", "");
        localau.b = localad1.a("title", "");
        localau.c = localad1.e("ad_campaign_id");
        localau.d = localad1.e("ad_id");
        localau.e = localad1.e("ad_group_id");
        localau.f = localad1.e("cpcv_bid");
        localau.g = localad1.e("net_earnings");
        localau.h = localad1.e("expires");
        localau.i = localad1.a("enable_in_app_store", false);
        localau.j = localad1.a("video_events_on_replays", false);
        localau.k = localad1.a("test_ad", false);
        localau.l = localad1.a("fullscreen", false);
        localau.m = localad1.a("house_ad", false);
        localau.n = localad1.a("contracted", false);
        localau.o = new bf();
        bf localbf = localau.o;
        ad localad2 = localad1.a("limits");
        if (localad2 == null) {}
        for (int j = 0;; j = 1)
        {
          if (j != 0) {
            break label373;
          }
          k = 0;
          break;
          localbf.a = localad2.e("daily_play_cap");
          localbf.b = localad2.e("custom_play_cap");
          localbf.c = localad2.e("custom_play_cap_period");
          localbf.d = localad2.e("total_play_cap");
          localbf.e = localad2.e("monthly_play_cap");
          localbf.f = localad2.e("weekly_play_cap");
          localbf.g = localad2.e("volatile_expiration");
          localbf.h = localad2.e("volatile_play_cap");
        }
        label373:
        localau.p = new bn();
        bn localbn = localau.p;
        ad localad3 = localad1.a("third_party_tracking");
        if (localad3 == null) {}
        for (int m = 0;; m = 1)
        {
          if (m != 0) {
            break label872;
          }
          k = 0;
          break;
          localbn.a = localad3.c("replay");
          localbn.b = localad3.c("card_shown");
          localbn.c = localad3.c("html5_interaction");
          localbn.d = localad3.c("cancel");
          localbn.e = localad3.c("download");
          localbn.f = localad3.c("skip");
          localbn.g = localad3.c("info");
          localbn.h = localad3.c("midpoint");
          localbn.i = localad3.c("card_dissolved");
          localbn.j = localad3.c("start");
          localbn.k = localad3.c("third_quartile");
          localbn.l = localad3.c("complete");
          localbn.m = localad3.c("continue");
          localbn.n = localad3.c("in_video_engagement");
          localbn.o = localad3.c("reward_v4vc");
          localbn.p = localad3.c("first_quartile");
          localbn.q.put("replay", localbn.a);
          localbn.q.put("card_shown", localbn.b);
          localbn.q.put("html5_interaction", localbn.c);
          localbn.q.put("cancel", localbn.d);
          localbn.q.put("download", localbn.e);
          localbn.q.put("skip", localbn.f);
          localbn.q.put("info", localbn.g);
          localbn.q.put("midpoint", localbn.h);
          localbn.q.put("card_dissolved", localbn.i);
          localbn.q.put("start", localbn.j);
          localbn.q.put("third_quartile", localbn.k);
          localbn.q.put("complete", localbn.l);
          localbn.q.put("continue", localbn.m);
          localbn.q.put("in_video_engagement", localbn.n);
          localbn.q.put("reward_v4vc", localbn.o);
          localbn.q.put("first_quartile", localbn.p);
        }
        label872:
        localau.q = new be();
        be localbe = localau.q;
        ad localad4 = localad1.a("in_app_browser");
        int n;
        if (localad4 == null) {
          n = 0;
        }
        for (;;)
        {
          if (n != 0) {
            break label1287;
          }
          k = 0;
          break;
          localbe.a = localad4.a("tiny_glow_image", "");
          localbe.b = localad4.a("tiny_glow_image_last_modified;", "");
          localbe.c = localad4.a("background_bar_image", "");
          localbe.d = localad4.a("background_bar_image_last_modified", "");
          localbe.e = localad4.a("background_tile_image", "");
          localbe.f = localad4.a("background_tile_image_last_modified", "");
          localbe.g = localad4.a("background_color", "");
          localbe.h = new bd();
          if (!localbe.h.a(localad4.a("logo")))
          {
            n = 0;
          }
          else
          {
            localbe.h = new bd();
            if (!localbe.h.a(localad4.a("logo")))
            {
              n = 0;
            }
            else
            {
              localbe.i = new ba();
              if (!localbe.i.a(localad4.a("stop")))
              {
                n = 0;
              }
              else
              {
                localbe.j = new ba();
                if (!localbe.j.a(localad4.a("back")))
                {
                  n = 0;
                }
                else
                {
                  localbe.k = new ba();
                  if (!localbe.k.a(localad4.a("close")))
                  {
                    n = 0;
                  }
                  else
                  {
                    localbe.l = new ba();
                    if (!localbe.l.a(localad4.a("forward")))
                    {
                      n = 0;
                    }
                    else
                    {
                      localbe.m = new ba();
                      if (!localbe.m.a(localad4.a("reload"))) {
                        n = 0;
                      } else {
                        n = 1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        localau.r = new aw();
        aw localaw = localau.r;
        ad localad5 = localad1.a("v4vc");
        int i1;
        if (localad5 == null) {
          i1 = 0;
        }
        for (;;)
        {
          if (i1 != 0) {
            break label2170;
          }
          k = 0;
          break;
          localaw.a = localad5.a("enabled", false);
          if (localaw.a)
          {
            localaw.b = new bk();
            bk localbk = localaw.b;
            ad localad12 = localad5.a("pre_popup");
            localbk.a = localad12.a("background_image", "");
            localbk.b = localad12.a("background_image_last_modified", "");
            localbk.c = new bd();
            int i8;
            if (!localbk.c.a(localad12.a("background_logo"))) {
              i8 = 0;
            }
            for (;;)
            {
              if (i8 != 0) {
                break label1778;
              }
              i1 = 0;
              break;
              localbk.d = new bj();
              bj localbj = localbk.d;
              ad localad13 = localad12.a("dialog");
              localbj.a = localad13.e("scale");
              localbj.b = localad13.a("label_reward", "");
              localbj.c = localad13.e("width");
              localbj.d = localad13.e("height");
              localbj.e = localad13.a("image", "");
              localbj.f = localad13.a("image_last_modified", "");
              localbj.g = localad13.a("label", "");
              localbj.h = localad13.a("label_rgba", "");
              localbj.i = localad13.a("label_shadow_rgba", "");
              localbj.j = localad13.a("label_fraction", "");
              localbj.k = localad13.a("label_html", "");
              localbj.l = new bd();
              int i7;
              if (!localbj.l.a(localad13.a("logo"))) {
                i7 = 0;
              }
              for (;;)
              {
                if (i7 != 0) {
                  break label1772;
                }
                i8 = 0;
                break;
                localbj.m = new ba();
                if (!localbj.m.a(localad13.a("option_yes")))
                {
                  i7 = 0;
                }
                else
                {
                  localbj.n = new ba();
                  if (!localbj.n.a(localad13.a("option_no"))) {
                    i7 = 0;
                  } else {
                    i7 = 1;
                  }
                }
              }
              label1772:
              i8 = 1;
            }
            label1778:
            localaw.c = new bi();
            bi localbi = localaw.c;
            ad localad14 = localad5.a("post_popup");
            localbi.a = localad14.a("background_image", "");
            localbi.b = localad14.a("background_image_last_modified", "");
            localbi.c = new bd();
            int i10;
            if (!localbi.c.a(localad14.a("background_logo"))) {
              i10 = 0;
            }
            for (;;)
            {
              if (i10 != 0) {
                break label2164;
              }
              i1 = 0;
              break;
              localbi.d = new bh();
              bh localbh = localbi.d;
              ad localad15 = localad14.a("dialog");
              localbh.a = localad15.e("scale");
              localbh.b = localad15.a("label_reward", "");
              localbh.c = localad15.e("width");
              localbh.d = localad15.e("height");
              localbh.e = localad15.a("image", "");
              localbh.f = localad15.a("image_last_modified", "");
              localbh.g = localad15.a("label", "");
              localbh.h = localad15.a("label_rgba", "");
              localbh.i = localad15.a("label_shadow_rgba", "");
              localbh.j = localad15.a("label_fraction", "");
              localbh.k = localad15.a("label_html", "");
              localbh.l = new bd();
              int i9;
              if (!localbh.l.a(localad15.a("logo"))) {
                i9 = 0;
              }
              for (;;)
              {
                if (i9 != 0) {
                  break label2158;
                }
                i10 = 0;
                break;
                localbh.m = new ba();
                if (!localbh.m.a(localad15.a("option_done"))) {
                  i9 = 0;
                } else {
                  i9 = 1;
                }
              }
              label2158:
              i10 = 1;
            }
          }
          label2164:
          i1 = 1;
        }
        label2170:
        localau.s = new av();
        av localav = localau.s;
        ad localad6 = localad1.a("ad_tracking");
        if (localad6 != null)
        {
          localav.a = localad6.a("replay", null);
          localav.b = localad6.a("card_shown", null);
          localav.c = localad6.a("html5_interaction", null);
          localav.d = localad6.a("cancel", null);
          localav.e = localad6.a("download", null);
          localav.f = localad6.a("skip", null);
          localav.g = localad6.a("info", null);
          localav.h = localad6.a("custom_event", null);
          localav.i = localad6.a("midpoint", null);
          localav.j = localad6.a("card_dissolved", null);
          localav.k = localad6.a("start", null);
          localav.l = localad6.a("third_quartile", null);
          localav.m = localad6.a("complete", null);
          localav.n = localad6.a("continue", null);
          localav.o = localad6.a("in_video_engagement", null);
          localav.p = localad6.a("reward_v4vc", null);
          localav.q = localad6.a("first_quartile", null);
          localav.r.b("replay", localav.a);
          localav.r.b("card_shown", localav.b);
          localav.r.b("html5_interaction", localav.c);
          localav.r.b("cancel", localav.d);
          localav.r.b("download", localav.e);
          localav.r.b("skip", localav.f);
          localav.r.b("info", localav.g);
          localav.r.b("custom_event", localav.h);
          localav.r.b("midpoint", localav.i);
          localav.r.b("card_dissolved", localav.j);
          localav.r.b("start", localav.k);
          localav.r.b("third_quartile", localav.l);
          localav.r.b("complete", localav.m);
          localav.r.b("continue", localav.n);
          localav.r.b("in_video_engagement", localav.o);
          localav.r.b("reward_v4vc", localav.p);
          localav.r.b("first_quartile", localav.q);
        }
        localau.t = new bb();
        bb localbb = localau.t;
        ad localad7 = localad1.a("companion_ad");
        int i2;
        if (localad7 == null) {
          i2 = 0;
        }
        for (;;)
        {
          if (i2 != 0) {
            break label3483;
          }
          k = 0;
          break;
          localbb.d = localad7.a("enabled", false);
          if (localbb.d)
          {
            localbb.a = localad7.a("uuid", "");
            localbb.b = localad7.e("ad_id");
            localbb.c = localad7.e("ad_campaign_id");
            localbb.e = localad7.a("dissolve", false);
            localbb.f = localad7.a("enable_in_app_store", false);
            localbb.g = localad7.d("dissolve_delay");
            localbb.h = new bl();
            bl localbl = localbb.h;
            ad localad9 = localad7.a("static");
            int i4;
            if (localad9 == null) {
              i4 = 0;
            }
            for (;;)
            {
              if (i4 != 0) {
                break label3116;
              }
              i2 = 0;
              break;
              localbl.a = localad9.a("enabled", false);
              if (localbl.a)
              {
                localbl.b = localad9.e("width");
                localbl.c = localad9.e("height");
                localbl.d = localad9.a("background_image", "");
                localbl.e = localad9.a("background_image_last_modified", "");
                if (a.b != null) {
                  localbl.d = a.b;
                }
                localbl.h = new ba();
                if (!localbl.h.a(localad9.a("replay")))
                {
                  i4 = 0;
                  continue;
                }
                localbl.i = new ba();
                if (!localbl.i.a(localad9.a("continue")))
                {
                  i4 = 0;
                  continue;
                }
                localbl.g = new ba();
                if (!localbl.g.a(localad9.a("download")))
                {
                  i4 = 0;
                  continue;
                }
                localbl.f = new ba();
                if (!localbl.f.a(localad9.a("info")))
                {
                  i4 = 0;
                  continue;
                }
              }
              i4 = 1;
            }
            localbb.i = new bc();
            bc localbc = localbb.i;
            ad localad10 = localad7.a("html5");
            int i6;
            if (localad10 == null) {
              i6 = 0;
            }
            for (;;)
            {
              if (i6 != 0) {
                break label3477;
              }
              i2 = 0;
              break;
              localbc.a = localad10.a("enabled", false);
              localbc.b = localad10.d("load_timeout");
              localbc.c = localad10.a("load_timeout_enabled", false);
              localbc.d = localad10.a("load_spinner_enabled", false);
              localbc.e = localad10.a("background_color", "");
              localbc.g = localad10.a("html5_tag", "");
              localbc.f = new bg();
              bg localbg = localbc.f;
              ad localad11 = localad10.a("mraid_js");
              int i5;
              if (localad11 == null) {
                i5 = 0;
              }
              for (;;)
              {
                if (i5 != 0) {
                  break label3361;
                }
                i6 = 0;
                break;
                localbg.a = localad11.a("enabled", false);
                if (!localbg.a)
                {
                  i5 = 1;
                }
                else
                {
                  localbg.b = localad11.a("url", "");
                  localbg.c = localad11.a("last_modified", "");
                  i5 = 1;
                }
              }
              localbc.h = new bd();
              if (!localbc.h.a(localad10.a("background_logo")))
              {
                i6 = 0;
              }
              else
              {
                localbc.i = new ba();
                if (!localbc.i.a(localad10.a("replay")))
                {
                  i6 = 0;
                }
                else
                {
                  localbc.j = new ba();
                  if (!localbc.j.a(localad10.a("close"))) {
                    i6 = 0;
                  } else {
                    i6 = 1;
                  }
                }
              }
            }
          }
          i2 = 1;
        }
        localau.u = new bp();
        bp localbp = localau.u;
        ad localad8 = localad1.a("video");
        int i3;
        if (localad8 == null) {
          i3 = 0;
        }
        for (;;)
        {
          if (i3 != 0) {
            break label3774;
          }
          k = 0;
          break;
          localbp.a = localad8.a("enabled", false);
          if (localbp.a)
          {
            localbp.b = localad8.e("width");
            localbp.c = localad8.e("height");
            localbp.d = localad8.a("url", "");
            localbp.e = localad8.a("last_modified", "");
            localbp.f = localad8.a("video_frame_rate", "");
            localbp.g = localad8.a("audio_channels", "");
            localbp.h = localad8.a("audio_codec", "");
            localbp.i = localad8.a("audio_sample_rate", "");
            localbp.j = localad8.a("video_codec", "");
            localbp.k = localad8.d("duration");
            localbp.l = new ba();
            if (!localbp.l.a(localad8.a("skip_video")))
            {
              i3 = 0;
              continue;
            }
            localbp.m = new ba();
            if (!localbp.m.a(localad8.a("in_video_engagement")))
            {
              i3 = 0;
              continue;
            }
          }
          i3 = 1;
        }
        k = 1;
      }
    }
    label3361:
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ax
 * JD-Core Version:    0.7.0.1
 */