package com.jirbo.adcolony;

import java.util.ArrayList;
import java.util.HashMap;

final class ad
  extends af
{
  HashMap<String, af> a = new HashMap();
  ArrayList<String> b = new ArrayList();
  
  final ad a(String paramString)
  {
    af localaf = (af)this.a.get(paramString);
    if ((localaf != null) && (localaf.l())) {}
    for (ad localad = localaf.m(); localad != null; localad = null) {
      return localad;
    }
    return new ad();
  }
  
  final String a(int paramInt)
  {
    return (String)this.b.get(paramInt);
  }
  
  final String a(String paramString1, String paramString2)
  {
    af localaf = (af)this.a.get(paramString1);
    if ((localaf != null) && (localaf.j())) {
      paramString2 = localaf.b();
    }
    return paramString2;
  }
  
  final void a(di paramdi)
  {
    int i = this.b.size();
    if (i == 0)
    {
      paramdi.a("{}");
      return;
    }
    if ((i == 1) && (((af)this.a.get(this.b.get(0))).g()))
    {
      paramdi.a("{");
      String str2 = (String)this.b.get(0);
      af localaf2 = (af)this.a.get(str2);
      a(paramdi, str2);
      paramdi.b(':');
      localaf2.a(paramdi);
      paramdi.a("}");
      return;
    }
    paramdi.b("{");
    paramdi.h = (2 + paramdi.h);
    int j = 0;
    int k = 1;
    if (j < i)
    {
      if (k != 0) {}
      for (int m = 0;; m = k)
      {
        String str1 = (String)this.b.get(j);
        af localaf1 = (af)this.a.get(str1);
        a(paramdi, str1);
        paramdi.b(':');
        if (!localaf1.g()) {
          paramdi.b('\n');
        }
        localaf1.a(paramdi);
        j++;
        k = m;
        break;
        paramdi.c();
      }
    }
    paramdi.b('\n');
    paramdi.h = (-2 + paramdi.h);
    paramdi.a("}");
  }
  
  final void a(String paramString, double paramDouble)
  {
    a(paramString, new ab(paramDouble));
  }
  
  final void a(String paramString, int paramInt)
  {
    a(paramString, new y(paramInt));
  }
  
  final void a(String paramString, af paramaf)
  {
    if (!this.a.containsKey(paramString)) {
      this.b.add(paramString);
    }
    this.a.put(paramString, paramaf);
  }
  
  final boolean a(String paramString, boolean paramBoolean)
  {
    af localaf = (af)this.a.get(paramString);
    if ((localaf != null) && ((localaf.a()) || (localaf.j()))) {
      paramBoolean = localaf.k();
    }
    return paramBoolean;
  }
  
  final z b(String paramString)
  {
    af localaf = (af)this.a.get(paramString);
    if ((localaf != null) && (localaf.f())) {}
    for (z localz = localaf.h(); localz != null; localz = null) {
      return localz;
    }
    return new z();
  }
  
  final void b(String paramString1, String paramString2)
  {
    a(paramString1, new ac(paramString2));
  }
  
  final void b(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (af localaf = w.a;; localaf = w.b)
    {
      a(paramString, localaf);
      return;
    }
  }
  
  final ArrayList<String> c(String paramString)
  {
    z localz = b(paramString);
    if (localz == null) {}
    ArrayList localArrayList;
    for (Object localObject = null;; localObject = localArrayList)
    {
      if (localObject == null) {
        localObject = new ArrayList();
      }
      return localObject;
      localArrayList = new ArrayList();
      int i = 0;
      if (i < localz.a.size())
      {
        af localaf = (af)localz.a.get(i);
        if ((localaf != null) && (localaf.j())) {}
        for (String str = localaf.b();; str = "")
        {
          if (str != null) {
            localArrayList.add(str);
          }
          i++;
          break;
        }
      }
    }
  }
  
  final double d(String paramString)
  {
    af localaf = (af)this.a.get(paramString);
    if ((localaf != null) && (localaf.n())) {
      return localaf.d();
    }
    return 0.0D;
  }
  
  final int e(String paramString)
  {
    af localaf = (af)this.a.get(paramString);
    if ((localaf != null) && (localaf.n())) {
      return localaf.e();
    }
    return 0;
  }
  
  final boolean g()
  {
    return (this.a.size() < 0) || ((this.a.size() == 1) && (((af)this.a.get(this.b.get(0))).g()));
  }
  
  final boolean l()
  {
    return true;
  }
  
  final ad m()
  {
    return this;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ad
 * JD-Core Version:    0.7.0.1
 */