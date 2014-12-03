package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

final class e
  implements k
{
  public final void a(ax paramax, Map<String, String> paramMap)
  {
    str1 = (String)paramMap.get("u");
    if (str1 == null) {
      return;
    }
    localUri1 = Uri.parse(str1);
    try
    {
      er localer = paramax.f();
      if ((localer == null) || (!localer.a(localUri1))) {
        break label115;
      }
      paramax.getContext();
      Uri localUri3 = localer.b(localUri1);
      localUri2 = localUri3;
    }
    catch (es locales)
    {
      for (;;)
      {
        String str2;
        new StringBuilder("Unable to append parameter to URL: ").append(str1).toString();
        Uri localUri2 = localUri1;
      }
    }
    str2 = localUri2.toString();
    ao.a(new au(paramax.getContext(), paramax.g().b, str2).a);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.e
 * JD-Core Version:    0.7.0.1
 */