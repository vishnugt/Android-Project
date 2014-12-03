package com.jirbo.adcolony;

import java.util.ArrayList;
import java.util.HashMap;

final class cc
  implements am
{
  g a;
  ArrayList<cd> b = new ArrayList();
  ArrayList<cd> c = new ArrayList();
  int d = 0;
  boolean e = false;
  
  cc(g paramg)
  {
    this.a = paramg;
  }
  
  private void a(String paramString1, String paramString2, ad paramad)
  {
    if ((paramString2 == null) || (paramString2.equals(""))) {
      return;
    }
    if (paramad == null) {
      paramad = new ad();
    }
    String str = cm.a();
    paramad.b("asi", this.a.e.h);
    paramad.b("guid", str);
    paramad.b("guid_key", cm.b(str + "DUBu6wJ27y6xs7VWmNDw67DD"));
    cd localcd = new cd();
    localcd.a = paramString1;
    localcd.b = paramString2;
    aq.a.b("EVENT ----------------------------");
    aq.a.a("EVENT - TYPE = ").b(paramString1);
    aq.a.a("EVENT - URL  = ").b(paramString2);
    localcd.c = paramad.o();
    if (paramString1.equals("reward_v4vc"))
    {
      localcd.d = paramad.a("v4vc_name", "");
      localcd.h = paramad.e("v4vc_amount");
    }
    this.b.add(localcd);
    this.e = true;
    a.i = true;
  }
  
  private void a(String paramString, ArrayList<String> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0)) {
      return;
    }
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      String str = (String)paramArrayList.get(i);
      cd localcd = new cd();
      localcd.a = paramString;
      localcd.b = str;
      localcd.k = true;
      this.b.add(localcd);
    }
    this.e = true;
    a.i = true;
  }
  
  final void a()
  {
    a.i = true;
    z localz = ap.b(new ag("tracking_info.txt"));
    if (localz != null)
    {
      this.b.clear();
      for (int i = 0; i < localz.a.size(); i++)
      {
        ad localad = localz.a(i);
        cd localcd = new cd();
        localcd.a = localad.a("type", "");
        localcd.b = localad.a("url", "");
        localcd.c = localad.a("payload", null);
        localcd.f = localad.e("attempts");
        localcd.k = localad.a("third_party", false);
        if ((localcd.a.equals("v4vc_callback")) || (localcd.a.equals("reward_v4vc")))
        {
          localcd.d = localad.a("v4vc_name", "");
          localcd.h = localad.e("v4vc_amount");
        }
        this.b.add(localcd);
      }
    }
    aq.a.a("Loaded ").a(this.b.size()).b(" events");
  }
  
  public final void a(aj paramaj)
  {
    int i = 10000;
    a.i = true;
    this.e = true;
    this.d = (-1 + this.d);
    cd localcd1 = (cd)paramaj.e;
    aq.a.a("on_download_finished - event.type = ").b(localcd1.a);
    localcd1.j = false;
    boolean bool = paramaj.i;
    if ((bool) && (localcd1.c != null))
    {
      ad localad = ap.a(paramaj.l);
      if (localad == null) {
        break label352;
      }
      bool = localad.a("status", "").equals("success");
      if ((bool) && (localcd1.a.equals("reward_v4vc")))
      {
        if (!localad.a("v4vc_status", false)) {
          break label339;
        }
        String str = localad.a("v4vc_callback", "");
        if (str.length() <= 0) {
          break label320;
        }
        cd localcd2 = new cd();
        localcd2.a = "v4vc_callback";
        localcd2.b = str;
        localcd2.d = localcd1.d;
        localcd2.h = localcd1.h;
        this.b.add(localcd2);
      }
    }
    if ((bool) && (localcd1.a.equals("v4vc_callback")))
    {
      aq.a.b("v4vc_callback response:").b(paramaj.l);
      if (paramaj.l.indexOf("vc_success") != -1)
      {
        a.v.m = true;
        aq.a.b("v4vc_callback success");
        this.a.a(true, localcd1.d, localcd1.h);
      }
    }
    else
    {
      label276:
      if (!bool) {
        break label436;
      }
      aq.a.a("Event submission SUCCESS for type: ").b(localcd1.a);
      localcd1.i = true;
    }
    for (;;)
    {
      if (!this.a.e.b) {
        b();
      }
      return;
      label320:
      a.v.m = true;
      aq.a.b("Client-side V4VC success");
      break;
      label339:
      aq.a.b("Client-side V4VC failure");
      break;
      label352:
      bool = false;
      break;
      if (paramaj.l.indexOf("vc_decline") != -1)
      {
        aq.c.a("Server-side V4VC failure: ").b(paramaj.c);
        aq.a.b("v4vc_callback declined");
        this.a.a(false, "", 0);
        break label276;
      }
      aq.c.a("Server-side V4VC failure: ").b(paramaj.c);
      bool = false;
      break label276;
      label436:
      aq.a.a("Event submission FAILED for type: ").a(localcd1.a).a(" on try ").b(1 + localcd1.f);
      localcd1.f = (1 + localcd1.f);
      if (localcd1.f < 24) {
        break label528;
      }
      aq.d.b("Discarding event after 24 attempts to report.");
      localcd1.i = true;
      if (localcd1.a.equals("v4vc_callback")) {
        this.a.a(false, "", 0);
      }
    }
    label528:
    int j = 20;
    if (localcd1.g > 0) {
      j = 3 * localcd1.g;
    }
    if (j > i) {}
    for (;;)
    {
      aq.a.a("Retrying in ").a(i).a(" seconds (attempt ").a(localcd1.f).b(")");
      localcd1.g = i;
      localcd1.e = (cm.b() + i);
      break;
      i = j;
    }
  }
  
  final void a(String paramString)
  {
    if ((this.a == null) || (this.a.b == null) || (this.a.b.j == null) || (this.a.b.j.n == null) || (this.a.b.j.n.a(paramString) == null)) {}
    bq localbq;
    do
    {
      return;
      aq.a.a("Ad request for zone ").b(paramString);
      localbq = this.a.b.j.n.a(paramString);
    } while ((localbq == null) || (localbq.h == null) || (localbq.h.a == null));
    a("request", localbq.h.a, null);
    aq.a.a("Tracking ad request - URL : ").b(localbq.h.a);
  }
  
  final void a(String paramString, ad paramad)
  {
    az localaz = this.a.b.j.k;
    if (localaz != null) {
      a(paramString, localaz.h.a(paramString, ""), paramad);
    }
    bm localbm = this.a.b.j.l;
    if (localbm != null) {
      a(paramString, (ArrayList)localbm.d.get(paramString));
    }
  }
  
  final void b()
  {
    this.c.clear();
    this.c.addAll(this.b);
    this.b.clear();
    z localz = new z();
    for (int i = 0; i < this.c.size(); i++)
    {
      cd localcd = (cd)this.c.get(i);
      if (!localcd.i)
      {
        this.b.add(localcd);
        ad localad = new ad();
        localad.b("type", localcd.a);
        localad.b("url", localcd.b);
        if (localcd.c != null) {
          localad.b("payload", localcd.c);
        }
        localad.a("attempts", localcd.f);
        if (localcd.d != null)
        {
          localad.b("v4vc_name", localcd.d);
          localad.a("v4vc_amount", localcd.h);
        }
        if (localcd.k) {
          localad.b("third_party", true);
        }
        localz.a(localad);
      }
    }
    this.c.clear();
    aq.a.a("Saving tracking_info (").a(this.b.size()).b(" events)");
    ap.a(new ag("tracking_info.txt"), localz);
  }
  
  final void b(String paramString, ad paramad)
  {
    if (paramString == null)
    {
      aq.d.b("No such event type:").b(paramString);
      return;
    }
    a(paramString, this.a.a.l.s.r.a(paramString, ""), paramad);
    a(paramString, (ArrayList)this.a.a.l.p.q.get(paramString));
  }
  
  final void c()
  {
    if (this.b.size() == 0) {}
    label219:
    for (;;)
    {
      return;
      while (this.b.size() > 1000) {
        this.b.remove(-1 + this.b.size());
      }
      if (by.c())
      {
        double d1 = cm.b();
        for (int i = 0;; i++)
        {
          if (i >= this.b.size()) {
            break label219;
          }
          cd localcd = (cd)this.b.get(i);
          if ((localcd.e < d1) && (!localcd.j))
          {
            if (this.d == 5) {
              break;
            }
            this.d = (1 + this.d);
            localcd.j = true;
            aj localaj = new aj(this.a, localcd.b, this).a(localcd);
            if (localcd.k) {
              localaj.h = true;
            }
            if (localcd.c != null) {
              localaj.a("application/json", localcd.c);
            }
            aq.b.a("Submitting '").a(localcd.a).b("' event.");
            localaj.b();
            a.i = true;
          }
        }
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.cc
 * JD-Core Version:    0.7.0.1
 */