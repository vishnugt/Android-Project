package com.jirbo.adcolony;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

final class ca
{
  g a;
  ArrayList<cb> b = new ArrayList();
  HashMap<Integer, Integer> c = new HashMap();
  HashMap<String, Integer> d = new HashMap();
  boolean e = false;
  boolean f = false;
  
  ca(g paramg)
  {
    this.a = paramg;
  }
  
  final int a(int paramInt, double paramDouble)
  {
    for (;;)
    {
      int i;
      try
      {
        double d1 = cm.b() - paramDouble;
        i = 0;
        int j = -1 + this.b.size();
        if ((j >= 0) && (((cb)this.b.get(j)).d >= d1))
        {
          int k = ((cb)this.b.get(j)).b;
          if (paramInt == k)
          {
            m = i + 1;
            j--;
            i = m;
          }
        }
        else
        {
          return i;
        }
      }
      finally {}
      int m = i;
    }
  }
  
  final int a(String paramString)
  {
    int i = 0;
    try
    {
      String str = this.a.e.h;
      int j = -1 + this.b.size();
      int k = 0;
      if ((j >= 0) && (this.b.get(j) != null) && (((cb)this.b.get(j)).c != null))
      {
        int m;
        if (((cb)this.b.get(j)).c.equals(str))
        {
          k = 1;
          boolean bool = ((cb)this.b.get(j)).a.equals(paramString);
          if (!bool) {
            break label144;
          }
          m = i + 1;
        }
        for (int n = k;; n = k)
        {
          j--;
          k = n;
          i = m;
          break;
          if (k != 0) {
            break label154;
          }
          label144:
          m = i;
        }
      }
      label154:
      return i;
    }
    finally {}
  }
  
  final int a(String paramString, double paramDouble)
  {
    for (;;)
    {
      int i;
      try
      {
        double d1 = cm.b() - paramDouble;
        i = 0;
        int j = -1 + this.b.size();
        if ((j >= 0) && (((cb)this.b.get(j)).d >= d1))
        {
          boolean bool = paramString.equals(((cb)this.b.get(j)).a);
          if (bool)
          {
            k = i + 1;
            j--;
            i = k;
          }
        }
        else
        {
          return i;
        }
      }
      finally {}
      int k = i;
    }
  }
  
  final void a()
  {
    int i = 0;
    a.i = true;
    if ((this.f) && (((cb)this.b.get(-1 + this.b.size())).c == this.a.e.h)) {}
    ad localad1;
    do
    {
      return;
      localad1 = ap.a(new ag("play_history_info.txt"));
    } while (localad1 == null);
    this.b.clear();
    this.d = new HashMap();
    ad localad2 = localad1.a("reward_credit");
    for (int j = 0; j < localad2.b.size(); j++)
    {
      String str2 = localad2.a(j);
      int i2 = localad2.e(str2);
      this.d.put(str2, Integer.valueOf(i2));
    }
    z localz = localad1.b("play_events");
    for (int k = 0; k < localz.a.size(); k++)
    {
      ad localad4 = localz.a(k);
      double d1 = localad4.d("timestamp");
      String str1 = localad4.a("zone_id", "");
      int i1 = localad4.e("ad_id");
      if ((d1 != 0.0D) && (str1 != null) && (i1 != 0)) {
        this.b.add(new cb(null, d1, str1, i1));
      }
    }
    this.c = new HashMap();
    ad localad3 = localad1.a("play_counts");
    while (i < localad3.b.size())
    {
      int m = Integer.parseInt(localad3.a(i));
      int n = localad3.e(m);
      this.c.put(Integer.valueOf(m), Integer.valueOf(n));
      i++;
    }
    this.f = true;
  }
  
  final void a(String paramString, int paramInt)
  {
    aq.a.b("Adding play event to play history");
    this.e = true;
    this.b.add(new cb(this.a.e.h, cm.b(), paramString, paramInt));
    Integer localInteger = (Integer)this.c.get(Integer.valueOf(paramInt));
    aq.a.a("Got play count of ").a(localInteger).b(" for this ad");
    if (localInteger == null)
    {
      this.c.put(Integer.valueOf(paramInt), Integer.valueOf(1));
      return;
    }
    this.c.put(Integer.valueOf(paramInt), Integer.valueOf(1 + localInteger.intValue()));
  }
  
  final int b(String paramString)
  {
    Integer localInteger = (Integer)this.d.get(paramString);
    if (localInteger == null) {
      return 0;
    }
    return localInteger.intValue();
  }
  
  final void b()
  {
    z localz = new z();
    ad localad1 = new ad();
    ad localad2 = new ad();
    double d1 = cm.b() - 2678400.0D;
    for (int i = -1 + this.b.size(); i >= 0; i--)
    {
      cb localcb = (cb)this.b.get(i);
      if (localcb.d < d1) {
        break;
      }
      ad localad4 = new ad();
      localad4.b("zone_id", localcb.a);
      localad4.a("ad_id", localcb.b);
      localad4.a("timestamp", localcb.d);
      localz.a(localad4);
    }
    localad1.a("play_events", localz);
    Iterator localIterator1 = this.c.keySet().iterator();
    while (localIterator1.hasNext())
    {
      int j = ((Integer)localIterator1.next()).intValue();
      int k = ((Integer)this.c.get(Integer.valueOf(j))).intValue();
      localad2.a(j, k);
    }
    localad1.a("play_counts", localad2);
    ad localad3 = new ad();
    if (this.d.size() > 0)
    {
      Iterator localIterator2 = this.d.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        localad3.a(str, ((Integer)this.d.get(str)).intValue());
      }
    }
    localad1.a("reward_credit", localad3);
    aq.a.a("Saving play history");
    ap.a(new ag("play_history_info.txt"), localad1);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ca
 * JD-Core Version:    0.7.0.1
 */