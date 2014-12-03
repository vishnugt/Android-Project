package com.jirbo.adcolony;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  static boolean A;
  static boolean B;
  static boolean C;
  static int D;
  static String E;
  static String F;
  static String G;
  static String H;
  static long I;
  static ArrayList<Bitmap> J = new ArrayList();
  static ArrayList<AdColonyV4VCListener> K = new ArrayList();
  public static ArrayList<do> L = new ArrayList();
  static HashMap M;
  private static Activity N;
  public static String a = null;
  public static final String b = null;
  public static g c = new g();
  static boolean d;
  static int e = 2;
  static boolean f;
  static boolean g;
  static boolean h;
  static boolean i;
  static boolean j = false;
  public static boolean k = true;
  static int l = 0;
  static double m = 1.0D;
  static boolean n = false;
  static boolean o = false;
  static boolean p = false;
  static boolean q = false;
  static boolean r = true;
  static boolean s;
  static ai t;
  static dn u;
  public static ADCVideo v;
  static ADCVideo w;
  public static b x;
  static c y;
  static boolean z;
  
  static int a(String paramString)
  {
    return c.a(paramString);
  }
  
  static Activity a()
  {
    if (N == null) {
      throw new dv("AdColony.configure() must be called before any other AdColony methods. If you have called AdColony.configure(), the Activity reference you passed in is null.");
    }
    return N;
  }
  
  static void a(int paramInt)
  {
    e = paramInt;
    aq localaq1 = aq.a;
    boolean bool1;
    boolean bool2;
    label31:
    aq localaq3;
    if (paramInt <= 0)
    {
      bool1 = true;
      localaq1.f = bool1;
      aq localaq2 = aq.b;
      if (paramInt > 1) {
        break label103;
      }
      bool2 = true;
      localaq2.f = bool2;
      localaq3 = aq.c;
      if (paramInt > 2) {
        break label109;
      }
    }
    label103:
    label109:
    for (boolean bool3 = true;; bool3 = false)
    {
      localaq3.f = bool3;
      aq localaq4 = aq.d;
      boolean bool4 = false;
      if (paramInt <= 3) {
        bool4 = true;
      }
      localaq4.f = bool4;
      if ((paramInt > 0) || (paramInt <= 1)) {}
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label31;
    }
  }
  
  public static void a(Activity paramActivity)
  {
    if (paramActivity == N) {
      return;
    }
    N = paramActivity;
    x = new b();
    y = new c();
    new bx();
  }
  
  static void a(an paraman)
  {
    c.a(paraman);
  }
  
  static void a(RuntimeException paramRuntimeException)
  {
    s = true;
    paramRuntimeException.toString();
    paramRuntimeException.printStackTrace();
  }
  
  static void a(String paramString1, String paramString2)
  {
    c.a(paramString1, paramString2);
  }
  
  static void b(Activity paramActivity)
  {
    g = false;
    a(paramActivity);
    t = null;
    DisplayMetrics localDisplayMetrics = a().getResources().getDisplayMetrics();
    float f1 = localDisplayMetrics.widthPixels / localDisplayMetrics.xdpi;
    float f2 = localDisplayMetrics.heightPixels / localDisplayMetrics.ydpi;
    if (Math.sqrt(f1 * f1 + f2 * f2) >= 6.0D) {}
    for (boolean bool = true;; bool = false)
    {
      d = bool;
      if (s)
      {
        s = false;
        f = false;
        c = new g();
      }
      return;
    }
  }
  
  static boolean b()
  {
    return (s) || (h) || (!f);
  }
  
  static boolean b(String paramString)
  {
    return c.b(paramString);
  }
  
  static String c(String paramString)
  {
    return c.c(paramString);
  }
  
  static boolean c()
  {
    return (f) && (!s) && (!h);
  }
  
  static void d()
  {
    s = true;
  }
  
  static void d(String paramString)
  {
    c.a(paramString, null);
  }
  
  static void e()
  {
    a();
  }
  
  static void f() {}
  
  static void g() {}
  
  static void h() {}
  
  static void i() {}
  
  static void j()
  {
    if (c == null) {
      break label6;
    }
    label6:
    while ((L.size() == 0) || (M == null)) {
      return;
    }
    Iterator localIterator = M.entrySet().iterator();
    label129:
    label294:
    label314:
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      boolean bool1 = ((Boolean)localEntry.getValue()).booleanValue();
      String str = (String)localEntry.getKey();
      int i3;
      int i1;
      if ((c != null) && (c.b != null) && (c.b.j != null) && (c.b.j.n != null))
      {
        d locald = c.b;
        i3 = 0;
        if (i3 < locald.j.n.a.size())
        {
          bq localbq = locald.j.n.a(i3);
          if ((localbq.b(false)) && (localbq.a.equals(str)))
          {
            i1 = 1;
            label187:
            if (i1 == 0) {
              break label294;
            }
          }
        }
      }
      for (boolean bool2 = c.b((String)localEntry.getKey(), true, false);; bool2 = c.a((String)localEntry.getKey(), true, false))
      {
        if (bool1 == bool2) {
          break label314;
        }
        M.put(localEntry.getKey(), Boolean.valueOf(bool2));
        for (int i2 = 0; i2 < L.size(); i2++) {
          ((do)L.get(i2)).a(bool2, (String)localEntry.getKey());
        }
        break;
        i3++;
        break label129;
        i1 = 0;
        break label187;
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.a
 * JD-Core Version:    0.7.0.1
 */