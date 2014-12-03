package com.chartboost.sdk.impl;

import java.util.HashMap;
import java.util.Map;

 enum ai$a
{
  private static final Map<Character, a> m;
  public final int j;
  public final char k;
  public final String l;
  
  static
  {
    int i1 = 0;
    a = new a("CANON_EQ", 0, 128, 'c', "Pattern.CANON_EQ");
    b = new a("UNIX_LINES", 1, 1, 'd', "Pattern.UNIX_LINES");
    c = new a("GLOBAL", 2, 256, 'g', null);
    d = new a("CASE_INSENSITIVE", 3, 2, 'i', null);
    e = new a("MULTILINE", 4, 8, 'm', null);
    f = new a("DOTALL", 5, 32, 's', "Pattern.DOTALL");
    g = new a("LITERAL", 6, 16, 't', "Pattern.LITERAL");
    h = new a("UNICODE_CASE", 7, 64, 'u', "Pattern.UNICODE_CASE");
    i = new a("COMMENTS", 8, 4, 'x', null);
    a[] arrayOfa1 = new a[9];
    arrayOfa1[0] = a;
    arrayOfa1[1] = b;
    arrayOfa1[2] = c;
    arrayOfa1[3] = d;
    arrayOfa1[4] = e;
    arrayOfa1[5] = f;
    arrayOfa1[6] = g;
    arrayOfa1[7] = h;
    arrayOfa1[8] = i;
    n = arrayOfa1;
    m = new HashMap();
    a[] arrayOfa2 = values();
    int i2 = arrayOfa2.length;
    for (;;)
    {
      if (i1 >= i2) {
        return;
      }
      a locala = arrayOfa2[i1];
      m.put(Character.valueOf(locala.k), locala);
      i1++;
    }
  }
  
  private ai$a(int paramInt, char paramChar, String paramString)
  {
    this.j = paramInt;
    this.k = paramChar;
    this.l = paramString;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.ai.a
 * JD-Core Version:    0.7.0.1
 */