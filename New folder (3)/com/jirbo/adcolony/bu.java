package com.jirbo.adcolony;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

final class bu
  implements am
{
  g a;
  ArrayList<bv> b = new ArrayList();
  HashMap<String, bv> c = new HashMap();
  int d = 1;
  co e = new co(2.0D);
  int f;
  ArrayList<String> g = new ArrayList();
  boolean h;
  boolean i;
  double j;
  
  bu(g paramg)
  {
    this.a = paramg;
  }
  
  final void a()
  {
    aq.a.b("Loading media info");
    ad localad1 = ap.a(new ag("media_info.txt"));
    if (localad1 == null)
    {
      localad1 = new ad();
      aq.a.b("No saved media info exists.");
    }
    for (;;)
    {
      this.d = localad1.e("next_file_number");
      if (this.d <= 0) {
        this.d = 1;
      }
      z localz = localad1.b("assets");
      if (localz == null) {
        break;
      }
      this.b.clear();
      for (int i4 = 0; i4 < localz.a.size(); i4++)
      {
        ad localad2 = localz.a(i4);
        bv localbv3 = new bv();
        localbv3.a = localad2.a("url", "");
        localbv3.b = localad2.a("filepath", "");
        localbv3.c = localad2.a("last_modified", "");
        localbv3.f = localad2.e("file_number");
        localbv3.g = localad2.e("size");
        localbv3.e = localad2.a("ready", false);
        localbv3.h = localad2.d("last_accessed");
        if (localbv3.f > this.d) {
          this.d = (1 + localbv3.f);
        }
        this.b.add(localbv3);
      }
      aq.a.b("Loaded media info");
    }
    HashMap localHashMap1 = new HashMap();
    String str1 = this.a.f.c;
    String[] arrayOfString1 = new File(str1).list();
    if (arrayOfString1 == null) {}
    for (String[] arrayOfString2 = new String[0];; arrayOfString2 = arrayOfString1)
    {
      int k = arrayOfString2.length;
      for (int m = 0; m < k; m++)
      {
        String str5 = arrayOfString2[m];
        String str6 = str1 + str5;
        localHashMap1.put(str6, str6);
      }
      HashMap localHashMap2 = new HashMap();
      this.j = 0.0D;
      ArrayList localArrayList = new ArrayList();
      for (int n = 0; n < this.b.size(); n++)
      {
        bv localbv2 = (bv)this.b.get(n);
        if ((!localbv2.d) && (localbv2.e))
        {
          String str4 = localbv2.b;
          if ((localHashMap1.containsKey(str4)) && (new File(str4).length() == localbv2.g))
          {
            this.j += localbv2.g;
            localArrayList.add(localbv2);
            localHashMap2.put(str4, str4);
          }
        }
      }
      this.b = localArrayList;
      int i1 = arrayOfString2.length;
      for (int i2 = 0; i2 < i1; i2++)
      {
        String str2 = arrayOfString2[i2];
        String str3 = str1 + str2;
        if (!localHashMap2.containsKey(str3))
        {
          aq.b.a("Deleting unused media ").b(str3);
          new File(str3).delete();
        }
      }
      this.c.clear();
      for (int i3 = 0; i3 < this.b.size(); i3++)
      {
        bv localbv1 = (bv)this.b.get(i3);
        this.c.put(localbv1.a, localbv1);
      }
      double d1 = this.a.b.j.g;
      if (d1 > 0.0D) {
        aq.b.a("Media pool at ").a(this.j / 1048576.0D).a("/").a(d1 / 1048576.0D).b(" MB");
      }
      return;
    }
  }
  
  public final void a(aj paramaj)
  {
    bv localbv = (bv)paramaj.e;
    this.f = (-1 + this.f);
    this.i = true;
    this.e.a(2.0D);
    localbv.e = paramaj.i;
    localbv.d = false;
    if (paramaj.i)
    {
      localbv.g = paramaj.k;
      this.j += localbv.g;
      aq.a.a("Downloaded ").b(localbv.a);
    }
    a.j();
    c();
  }
  
  final void a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.equals(""))) {}
    bv localbv;
    do
    {
      return;
      if (paramString2 == null) {
        paramString2 = "";
      }
      localbv = (bv)this.c.get(paramString1);
      if (localbv == null) {
        break;
      }
      localbv.h = cm.b();
    } while ((localbv.c.equals(paramString2)) && ((localbv.e) || (localbv.d)));
    int k;
    int m;
    if (localbv.f == 0)
    {
      this.i = true;
      this.e.a(2.0D);
      k = this.d;
      this.d = (k + 1);
      m = paramString1.lastIndexOf('.');
      if (m != -1) {
        break label284;
      }
    }
    label284:
    for (String str1 = k;; str1 = k + paramString1.substring(m))
    {
      String str2 = this.a.f.c + str1;
      localbv.f = k;
      localbv.b = str2;
      localbv.c = paramString2;
      localbv.d = true;
      localbv.e = false;
      aq.a.a("Adding ").a(paramString1).b(" to pending downloads.");
      this.g.add(paramString1);
      this.i = true;
      this.e.a(2.0D);
      a.i = true;
      return;
      localbv = new bv();
      localbv.a = paramString1;
      this.b.add(localbv);
      localbv.h = cm.b();
      this.c.put(paramString1, localbv);
      break;
    }
  }
  
  final boolean a(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return false;
    }
    bv localbv = (bv)this.c.get(paramString);
    if (localbv == null)
    {
      this.a.b.j.a();
      return false;
    }
    if (localbv.e)
    {
      if (localbv.d) {
        return false;
      }
      localbv.h = cm.b();
      return true;
    }
    if (!localbv.d) {
      this.a.b.j.a();
    }
    return false;
  }
  
  final String b(String paramString)
  {
    bv localbv = (bv)this.c.get(paramString);
    if ((localbv == null) || (localbv.b == null)) {
      return "(file not found)";
    }
    localbv.h = cm.b();
    this.i = true;
    this.e.a(2.0D);
    return localbv.b;
  }
  
  final void b()
  {
    aq.a.b("Saving media info");
    z localz = new z();
    for (int k = 0; k < this.b.size(); k++)
    {
      bv localbv = (bv)this.b.get(k);
      if ((localbv.e) && (!localbv.d))
      {
        ad localad2 = new ad();
        localad2.b("url", localbv.a);
        localad2.b("filepath", localbv.b);
        localad2.b("last_modified", localbv.c);
        localad2.a("file_number", localbv.f);
        localad2.a("size", localbv.g);
        localad2.b("ready", localbv.e);
        localad2.a("last_accessed", localbv.h);
        localz.a(localad2);
      }
    }
    ad localad1 = new ad();
    localad1.a("next_file_number", this.d);
    localad1.a("assets", localz);
    ap.a(new ag("media_info.txt"), localad1);
    this.i = false;
  }
  
  final void c()
  {
    if ((this.a.b.j.j.equals("wifi")) && (!by.a())) {
      aq.a.b("Skipping asset download due to CACHE_FILTER_WIFI");
    }
    for (;;)
    {
      return;
      if ((this.a.b.j.j.equals("cell")) && (!by.b()))
      {
        aq.a.b("Skipping asset download due to CACHE_FILTER_CELL.");
        return;
      }
      while ((this.f < 3) && (this.g.size() > 0))
      {
        String str = (String)this.g.remove(0);
        bv localbv = (bv)this.c.get(str);
        if ((localbv != null) && ((str == null) || (str.equals(""))))
        {
          aq.d.b("[ADC ERROR] - NULL URL");
          new RuntimeException().printStackTrace();
        }
        if ((localbv != null) && (str != null) && (!str.equals("")))
        {
          a.i = true;
          this.f = (1 + this.f);
          new aj(this.a, str, this, localbv.b).a(localbv).b();
        }
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.bu
 * JD-Core Version:    0.7.0.1
 */