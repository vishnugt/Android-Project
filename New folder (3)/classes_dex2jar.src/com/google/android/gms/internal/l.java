package com.google.android.gms.internal;

import java.util.Map;

public final class l
  implements k
{
  private static boolean a(Map<String, String> paramMap)
  {
    return "1".equals(paramMap.get("custom_close"));
  }
  
  private static int b(Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("o");
    if (str != null)
    {
      if ("p".equalsIgnoreCase(str)) {
        return ar.b();
      }
      if ("l".equalsIgnoreCase(str)) {
        return ar.a();
      }
    }
    return -1;
  }
  
  public final void a(ax paramax, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("a");
    if (str1 == null) {}
    ay localay;
    do
    {
      return;
      localay = paramax.e();
      if (!"expand".equalsIgnoreCase(str1)) {
        break;
      }
    } while (paramax.h());
    localay.a(a(paramMap), b(paramMap));
    return;
    if ("webapp".equalsIgnoreCase(str1))
    {
      String str2 = (String)paramMap.get("u");
      if (str2 != null)
      {
        localay.a(a(paramMap), b(paramMap), str2);
        return;
      }
      localay.a(a(paramMap), b(paramMap), (String)paramMap.get("html"), (String)paramMap.get("baseurl"));
      return;
    }
    localay.a(new be((String)paramMap.get("i"), (String)paramMap.get("u"), (String)paramMap.get("m"), (String)paramMap.get("p"), (String)paramMap.get("c"), (String)paramMap.get("f"), (String)paramMap.get("e")));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.l
 * JD-Core Version:    0.7.0.1
 */