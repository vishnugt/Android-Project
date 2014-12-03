package com.jirbo.adcolony;

import android.app.Activity;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

public final class dl
{
  public static void a(Activity paramActivity, String paramString1, String paramString2, String... paramVarArgs)
  {
    Handler localHandler = new Handler();
    dm localdm = new dm();
    if ((!a.n) || (a.o)) {
      if (!a.h) {}
    }
    for (;;)
    {
      return;
      if (paramString2 == null)
      {
        a.d();
        return;
      }
      if (paramVarArgs == null)
      {
        a.d();
        return;
      }
      if (paramVarArgs.length == 0)
      {
        a.d();
        return;
      }
      a.b(paramActivity);
      a.c.a(paramString1, paramString2, paramVarArgs);
      a.f = true;
      a.n = true;
      localHandler.postDelayed(localdm, 120000L);
      if (a.v == null) {
        a.k = true;
      }
      a.K.clear();
      a.L.clear();
      a.M = new HashMap();
      for (int i = 0; i < paramVarArgs.length; i++) {
        a.M.put(paramVarArgs[i], Boolean.valueOf(false));
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dl
 * JD-Core Version:    0.7.0.1
 */