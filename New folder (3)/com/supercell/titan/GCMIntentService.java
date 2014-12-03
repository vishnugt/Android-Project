package com.supercell.titan;

import android.content.Context;
import android.content.Intent;
import com.google.android.gcm.a;
import com.google.android.gcm.b;

public class GCMIntentService
  extends a
{
  public static boolean a;
  private static String b = "";
  private static String c = "";
  private static int d = -1;
  private final Class<?> e;
  
  public GCMIntentService(Class<?> paramClass, String paramString)
  {
    super(new String[] { paramString });
    this.e = paramClass;
  }
  
  private static void d(String paramString)
  {
    b = "";
    if (paramString == null) {
      paramString = "";
    }
    c = paramString;
    d = 0;
    a = true;
  }
  
  public static int getErrorCode()
  {
    return d;
  }
  
  public static String getErrorMessage()
  {
    return b;
  }
  
  public static String getID()
  {
    return c;
  }
  
  public static void onDestroy(Context paramContext)
  {
    try
    {
      if (!c.isEmpty()) {
        b.a(paramContext);
      }
      return;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
  
  public static void register()
  {
    GameApp localGameApp = GameApp.getInstance();
    String str1 = localGameApp.f();
    if (str1.isEmpty()) {
      return;
    }
    String str2 = b.c(localGameApp);
    if ((str2 == null) || (str2.isEmpty()))
    {
      String[] arrayOfString = { str1 };
      b.d(localGameApp);
      b.a(localGameApp, arrayOfString);
      return;
    }
    d(str2);
  }
  
  public final void a()
  {
    b = "";
    c = "";
    d = -1;
    a = true;
  }
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("data");
    if ((str1 == null) || (str1.isEmpty())) {
      return;
    }
    String str2 = paramIntent.getStringExtra("id");
    if (str2 == null) {
      str2 = "";
    }
    cr.a(paramContext, str1, "", -1, str2, this.e);
  }
  
  public final boolean a(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    b = paramString;
    c = "";
    d = 1;
    a = true;
    return true;
  }
  
  public final void b(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    b = paramString;
    c = "";
    d = 1;
    a = true;
  }
  
  public final void c(String paramString)
  {
    d(paramString);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.GCMIntentService
 * JD-Core Version:    0.7.0.1
 */