package com.jirbo.adcolony;

class af
{
  static void a(di paramdi, String paramString)
  {
    paramdi.b('"');
    int i = paramString.length();
    int j = 0;
    if (j < i)
    {
      char c1 = paramString.charAt(j);
      switch (c1)
      {
      default: 
        if ((c1 >= ' ') && (c1 <= '~')) {
          paramdi.b(c1);
        }
        break;
      case '"': 
      case '\\': 
      case '/': 
      case '\b': 
      case '\f': 
      case '\n': 
      case '\r': 
      case '\t': 
        for (;;)
        {
          j++;
          break;
          paramdi.a("\\\"");
          continue;
          paramdi.a("\\\\");
          continue;
          paramdi.a("\\/");
          continue;
          paramdi.a("\\b");
          continue;
          paramdi.a("\\f");
          continue;
          paramdi.a("\\n");
          continue;
          paramdi.a("\\r");
          continue;
          paramdi.a("\\t");
        }
      }
      paramdi.a("\\u");
      char c2 = c1;
      int m = 0;
      label211:
      int n;
      if (m < 4)
      {
        n = 0xF & c2 >> '\f';
        int k;
        c2 <<= '\004';
        if (n > 9) {
          break label253;
        }
        paramdi.a(n);
      }
      for (;;)
      {
        m++;
        break label211;
        break;
        label253:
        paramdi.b((char)(97 + (n - 10)));
      }
    }
    paramdi.b('"');
  }
  
  void a(di paramdi) {}
  
  boolean a()
  {
    return false;
  }
  
  String b()
  {
    return o();
  }
  
  boolean c()
  {
    return false;
  }
  
  double d()
  {
    return 0.0D;
  }
  
  int e()
  {
    return 0;
  }
  
  boolean f()
  {
    return false;
  }
  
  boolean g()
  {
    return true;
  }
  
  z h()
  {
    return null;
  }
  
  boolean i()
  {
    return false;
  }
  
  boolean j()
  {
    return false;
  }
  
  boolean k()
  {
    return false;
  }
  
  boolean l()
  {
    return false;
  }
  
  ad m()
  {
    return null;
  }
  
  final boolean n()
  {
    return (i()) || (c());
  }
  
  final String o()
  {
    cj localcj = new cj();
    a(localcj);
    return localcj.toString();
  }
  
  public String toString()
  {
    return o();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.af
 * JD-Core Version:    0.7.0.1
 */