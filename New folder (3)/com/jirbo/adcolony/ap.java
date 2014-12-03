package com.jirbo.adcolony;

final class ap
{
  static cj a = new cj();
  
  static ad a(ag paramag)
  {
    af localaf = c(paramag);
    if ((localaf == null) || (!localaf.l())) {
      return null;
    }
    return localaf.m();
  }
  
  static ad a(String paramString)
  {
    if (paramString == null) {}
    for (af localaf = null; (localaf == null) || (!localaf.l()); localaf = a(new bz(paramString))) {
      return null;
    }
    return localaf.m();
  }
  
  private static af a(bz parambz)
  {
    boolean bool1 = true;
    b(parambz);
    int i = parambz.b();
    if (i == 123)
    {
      b(parambz);
      if (parambz.a('{')) {}
    }
    do
    {
      z localz;
      do
      {
        do
        {
          ad localad;
          do
          {
            return null;
            b(parambz);
            localad = new ad();
            if (parambz.a('}')) {
              break;
            }
            boolean bool2 = bool1;
            if ((bool2) || (parambz.a(',')))
            {
              String str3 = d(parambz);
              b(parambz);
              if (!parambz.a(':')) {
                localad.b(str3, bool1);
              }
              for (;;)
              {
                b(parambz);
                bool2 = false;
                break;
                b(parambz);
                localad.a(str3, a(parambz));
              }
            }
          } while (!parambz.a('}'));
          return localad;
          if (i != 91) {
            break;
          }
          b(parambz);
        } while (!parambz.a('['));
        b(parambz);
        localz = new z();
        if (parambz.a(']')) {
          break;
        }
        while ((bool1) || (parambz.a(',')))
        {
          localz.a(a(parambz));
          b(parambz);
          bool1 = false;
        }
      } while (!parambz.a(']'));
      return localz;
      if (i == 45) {
        return e(parambz);
      }
      if ((i >= 48) && (i <= 57)) {
        return e(parambz);
      }
      if ((i == 34) || (i == 39))
      {
        String str1 = c(parambz);
        if (str1.length() == 0) {
          return new ac("");
        }
        int j = str1.charAt(0);
        if ((j == 116) && (str1.equals("true"))) {
          return w.a;
        }
        if ((j == 102) && (str1.equals("false"))) {
          return w.b;
        }
        if ((j == 110) && (str1.equals("null"))) {
          return w.c;
        }
        return new ac(str1);
      }
    } while (((i < 97) || (i > 122)) && ((i < 65) || (i > 90)) && (i != 95) && (i != 36));
    String str2 = d(parambz);
    if (str2.length() == 0) {
      return new ac("");
    }
    int k = str2.charAt(0);
    if ((k == 116) && (str2.equals("true"))) {
      return w.a;
    }
    if ((k == 102) && (str2.equals("false"))) {
      return w.b;
    }
    if ((k == 110) && (str2.equals("null"))) {
      return w.c;
    }
    return new ac(str2);
  }
  
  static void a(ag paramag, ad paramad)
  {
    ci localci = paramag.a();
    if (paramad != null)
    {
      paramad.a(localci);
      localci.b('\n');
    }
    for (;;)
    {
      localci.a();
      return;
      aq.b.b("Saving empty property table.");
      localci.b("{}");
    }
  }
  
  static void a(ag paramag, z paramz)
  {
    ci localci = paramag.a();
    if (paramz != null)
    {
      paramz.a(localci);
      localci.b('\n');
    }
    for (;;)
    {
      localci.a();
      return;
      aq.b.b("Saving empty property list.");
      localci.b("[]");
    }
  }
  
  static z b(ag paramag)
  {
    af localaf = c(paramag);
    if ((localaf == null) || (!localaf.f())) {
      return null;
    }
    return localaf.h();
  }
  
  private static void b(bz parambz)
  {
    for (int i = parambz.b(); (parambz.a()) && ((i <= 32) || (i > 126)); i = parambz.b()) {
      parambz.c();
    }
  }
  
  private static af c(ag paramag)
  {
    bz localbz = paramag.b();
    if (localbz == null) {
      return null;
    }
    return a(localbz);
  }
  
  private static String c(bz parambz)
  {
    char c1 = '"';
    b(parambz);
    if (parambz.a(c1)) {}
    while (!parambz.a())
    {
      return "";
      if (parambz.a('\'')) {
        c1 = '\'';
      }
    }
    a.a();
    char c2 = parambz.c();
    if ((parambz.a()) && (c2 != c1))
    {
      char c3;
      if (c2 == '\\')
      {
        c3 = parambz.c();
        if (c3 == 'b') {
          a.b('\b');
        }
      }
      for (;;)
      {
        c2 = parambz.c();
        break;
        if (c3 == 'f')
        {
          a.b('\f');
        }
        else if (c3 == 'n')
        {
          a.b('\n');
        }
        else if (c3 == 'r')
        {
          a.b('\r');
        }
        else if (c3 == 't')
        {
          a.b('\t');
        }
        else if (c3 == 'u')
        {
          cj localcj = a;
          int i = 0;
          int j = 0;
          while (i < 4)
          {
            if (parambz.a()) {
              j = j << 4 | parambz.c();
            }
            i++;
          }
          localcj.b((char)j);
        }
        else
        {
          a.b(c3);
          continue;
          a.b(c2);
        }
      }
    }
    return a.toString();
  }
  
  private static String d(bz parambz)
  {
    b(parambz);
    char c = parambz.b();
    if ((c == '"') || (c == '\'')) {
      return c(parambz);
    }
    a.a();
    int i = 0;
    while ((i == 0) && (parambz.a())) {
      if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')) || (c == '_') || (c == '$'))
      {
        parambz.c();
        a.b(c);
        c = parambz.b();
      }
      else
      {
        i = 1;
      }
    }
    return a.toString();
  }
  
  private static af e(bz parambz)
  {
    b(parambz);
    double d1 = 1.0D;
    if (parambz.a('-'))
    {
      d1 = -1.0D;
      b(parambz);
    }
    double d2 = 0.0D;
    for (int i = parambz.b(); (parambz.a()) && (i >= 48) && (i <= 57); i = parambz.b())
    {
      parambz.c();
      d2 = d2 * 10.0D + (i - 48);
    }
    boolean bool1 = parambz.a('.');
    int j = 0;
    if (bool1)
    {
      double d5 = 0.0D;
      double d6 = 0.0D;
      for (int n = parambz.b(); (parambz.a()) && (n >= 48) && (n <= 57); n = parambz.b())
      {
        parambz.c();
        d5 = d5 * 10.0D + (n - 48);
        d6 += 1.0D;
      }
      d2 += d5 / Math.pow(10.0D, d6);
      j = 1;
    }
    double d3;
    if ((parambz.a('e')) || (parambz.a('E')))
    {
      boolean bool2 = parambz.a('+');
      int k = 0;
      if (!bool2)
      {
        boolean bool3 = parambz.a('-');
        k = 0;
        if (bool3) {
          k = 1;
        }
      }
      d3 = 0.0D;
      for (int m = parambz.b(); (parambz.a()) && (m >= 48) && (m <= 57); m = parambz.b())
      {
        parambz.c();
        d3 = d3 * 10.0D + (m - 48);
      }
      if (k == 0) {
        break label338;
      }
    }
    double d4;
    label338:
    for (d2 /= Math.pow(10.0D, d3);; d2 *= Math.pow(10.0D, d3))
    {
      d4 = d2 * d1;
      if ((j == 0) && (d4 == (int)d4)) {
        break;
      }
      return new ab(d4);
    }
    return new y((int)d4);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ap
 * JD-Core Version:    0.7.0.1
 */