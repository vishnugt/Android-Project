package com.google.android.gms.internal;

import java.util.Map;

final class h
  implements k
{
  public final void a(ax paramax, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("u");
    if (str == null) {
      return;
    }
    ao.a(new au(paramax.getContext(), paramax.g().b, str).a);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.h
 * JD-Core Version:    0.7.0.1
 */