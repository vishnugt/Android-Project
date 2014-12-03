package com.google.android.gms.internal;

import java.util.Map;

final class j
  implements k
{
  public final void a(ax paramax, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("tx");
    String str2 = (String)paramMap.get("ty");
    String str3 = (String)paramMap.get("td");
    try
    {
      Integer.parseInt(str1);
      Integer.parseInt(str2);
      Integer.parseInt(str3);
      er localer = paramax.f();
      if (localer != null) {
        localer.a();
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException) {}
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.j
 * JD-Core Version:    0.7.0.1
 */