package com.jirbo.adcolony;

import java.util.ArrayList;

final class z
  extends af
{
  ArrayList<af> a = new ArrayList();
  
  final ad a(int paramInt)
  {
    af localaf = (af)this.a.get(paramInt);
    if ((localaf != null) && (localaf.l())) {}
    for (ad localad = localaf.m(); localad != null; localad = null) {
      return localad;
    }
    return new ad();
  }
  
  final z a(af paramaf)
  {
    this.a.add(paramaf);
    return this;
  }
  
  final void a(di paramdi)
  {
    int i = this.a.size();
    if (i == 0)
    {
      paramdi.a("[]");
      return;
    }
    if ((i == 1) && (((af)this.a.get(0)).g()))
    {
      paramdi.a("[");
      ((af)this.a.get(0)).a(paramdi);
      paramdi.a("]");
      return;
    }
    paramdi.b("[");
    paramdi.h = (2 + paramdi.h);
    int j = 0;
    int k = 1;
    if (j < i)
    {
      if (k != 0) {}
      for (int m = 0;; m = k)
      {
        ((af)this.a.get(j)).a(paramdi);
        j++;
        k = m;
        break;
        paramdi.c();
      }
    }
    paramdi.b('\n');
    paramdi.h = (-2 + paramdi.h);
    paramdi.a("]");
  }
  
  final boolean f()
  {
    return true;
  }
  
  final boolean g()
  {
    return (this.a.size() == 0) || ((this.a.size() == 1) && (((af)this.a.get(0)).g()));
  }
  
  final z h()
  {
    return this;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.z
 * JD-Core Version:    0.7.0.1
 */