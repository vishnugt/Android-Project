package com.supercell.titan;

import com.jirbo.adcolony.ADCVideo;

public class AdColonyTitan
{
  private static boolean a;
  private static boolean b;
  private static String c = "";
  private static d[] d;
  
  public static void init(String paramString1, String paramString2)
  {
    if (!a)
    {
      GameApp localGameApp = GameApp.getInstance();
      localGameApp.runOnUiThread(new a(localGameApp, ApplicationUtil.getAppVersion(), paramString1, paramString2.split(",")));
    }
  }
  
  public static boolean isVideoReadyForZone(String paramString)
  {
    boolean bool1 = a;
    boolean bool2 = false;
    if (bool1) {}
    try
    {
      d[] arrayOfd = d;
      int i = arrayOfd.length;
      for (int j = 0;; j++)
      {
        bool2 = false;
        if (j < i)
        {
          d locald = arrayOfd[j];
          if (locald.a.equals(paramString)) {
            bool2 = locald.b;
          }
        }
        else
        {
          return bool2;
        }
      }
      return false;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
  
  public static native void onAdColonyAdAttemptFinished(String paramString, boolean paramBoolean);
  
  public static native void onAdColonyAdStartedInZone(String paramString);
  
  public static void onPause()
  {
    if (a) {}
  }
  
  public static void onResume(GameApp paramGameApp)
  {
    if (a) {}
    try
    {
      com.jirbo.adcolony.a.a(paramGameApp);
      if (b)
      {
        b = false;
        if (com.jirbo.adcolony.a.v != null)
        {
          com.jirbo.adcolony.a.v.finish();
          com.jirbo.adcolony.a.x.b();
        }
        GameApp.getInstance().a(new b());
      }
      return;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
  
  public static void playVideoAdForZone(String paramString)
  {
    GameApp.getInstance().a(new c(paramString));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.AdColonyTitan
 * JD-Core Version:    0.7.0.1
 */