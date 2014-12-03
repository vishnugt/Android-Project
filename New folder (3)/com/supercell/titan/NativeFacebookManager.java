package com.supercell.titan;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.Session;
import com.facebook.Session.NewPermissionsRequest;
import com.facebook.Session.OpenRequest;
import com.facebook.Session.StatusCallback;
import com.facebook.SessionDefaultAudience;
import com.facebook.SessionLoginBehavior;
import com.facebook.SessionState;
import com.facebook.Settings;
import com.facebook.UiLifecycleHelper;
import java.util.ArrayList;
import java.util.List;

public class NativeFacebookManager
{
  private static NativeFacebookManager b;
  private static int d = 0;
  private static int e = 1;
  private static int f = 2;
  private static int g = 3;
  private final GameApp a;
  private final ArrayList<String> c = new ArrayList(2);
  private int h = d;
  private String i = "";
  private boolean j;
  private UiLifecycleHelper k;
  private final Session.StatusCallback l = new az(this);
  
  private NativeFacebookManager(GameApp paramGameApp)
  {
    this.a = paramGameApp;
    this.c.add("email");
    Settings.addLoggingBehavior(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
    Bundle localBundle = paramGameApp.c();
    this.k = new UiLifecycleHelper(paramGameApp, this.l);
    this.k.onCreate(localBundle);
    Session localSession = Session.getActiveSession();
    if (localSession == null)
    {
      if (localBundle != null) {
        localSession = Session.restoreSession(paramGameApp, null, this.l, localBundle);
      }
      if (localSession == null) {
        localSession = new Session(paramGameApp);
      }
      Session.setActiveSession(localSession);
      if (!localSession.getState().equals(SessionState.CREATED_TOKEN_LOADED)) {}
    }
    try
    {
      localSession.openForRead(n());
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      GameApp.debuggerException(localUnsupportedOperationException);
    }
  }
  
  public static void createInstance(GameApp paramGameApp)
  {
    b = new NativeFacebookManager(paramGameApp);
  }
  
  public static void destructInstance()
  {
    if (b != null)
    {
      b.k.onDestroy();
      b = null;
    }
  }
  
  public static native void facebookFriends(String paramString);
  
  public static native void facebookLinkStatistics(boolean paramBoolean, int paramInt, String paramString);
  
  public static native void facebookLogged(String paramString1, String paramString2);
  
  public static native void facebookLoginFailedWithError(String paramString1, String paramString2);
  
  public static native void facebookLogout();
  
  public static native void facebookReceivedAppRequest(String paramString);
  
  public static native void facebookSentAppRequest(String paramString1, String paramString2);
  
  public static native void facebookUserInfo(String paramString);
  
  public static NativeFacebookManager getInstance()
  {
    return b;
  }
  
  public static void jniAppRequestDialog(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GameApp.getInstance().runOnUiThread(new bd(paramString1, paramString2, paramString3, paramString4));
  }
  
  public static void jniAuthorize()
  {
    GameApp.getInstance().runOnUiThread(new bl());
  }
  
  public static boolean jniCanPublish()
  {
    return m();
  }
  
  public static void jniCheckAppRequests()
  {
    GameApp.getInstance().runOnUiThread(new bp());
  }
  
  public static void jniDeleteAppRequest(String paramString)
  {
    GameApp.getInstance().runOnUiThread(new be(paramString));
  }
  
  public static void jniFeedDialog(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GameApp.getInstance().runOnUiThread(new bc(paramString1, paramString2, paramString3, paramString4, paramString5));
  }
  
  public static String jniGetAttributionID()
  {
    String str = Settings.getAttributionId(GameApp.getInstance().getContentResolver());
    if (str != null) {
      return str;
    }
    return "";
  }
  
  public static boolean jniIsLogged()
  {
    return Session.getActiveSession().isOpened();
  }
  
  public static void jniLike(String paramString)
  {
    GameApp.getInstance().runOnUiThread(new bg(paramString));
  }
  
  public static void jniLinkStatistics(String paramString)
  {
    GameApp.getInstance().runOnUiThread(new bf(paramString));
  }
  
  public static void jniLogout()
  {
    GameApp.getInstance().runOnUiThread(new bm());
  }
  
  public static void jniRequestFriends()
  {
    GameApp.getInstance().runOnUiThread(new bn());
  }
  
  public static void jniRequestNewPublishPermissions()
  {
    GameApp.getInstance().runOnUiThread(new bh());
  }
  
  public static void jniRequestUserInfo(String paramString)
  {
    if (paramString == null) {
      return;
    }
    GameApp.getInstance().runOnUiThread(new bo(paramString));
  }
  
  private static boolean m()
  {
    Session localSession = Session.getActiveSession();
    if (localSession == null) {}
    List localList;
    do
    {
      do
      {
        return false;
      } while (localSession.isClosed());
      localList = localSession.getPermissions();
    } while (localList == null);
    return localList.contains("publish_actions");
  }
  
  private Session.OpenRequest n()
  {
    Session.OpenRequest localOpenRequest = new Session.OpenRequest(this.a);
    localOpenRequest.setCallback(this.l);
    localOpenRequest.setPermissions(this.c);
    localOpenRequest.setDefaultAudience(SessionDefaultAudience.EVERYONE);
    localOpenRequest.setLoginBehavior(SessionLoginBehavior.SSO_WITH_FALLBACK);
    return localOpenRequest;
  }
  
  private void o()
  {
    Session localSession = Session.getActiveSession();
    localSession.isOpened();
    localSession.isClosed();
    if ((!localSession.isOpened()) && (!localSession.isClosed())) {
      try
      {
        localSession.openForRead(n());
        return;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        GameApp.debuggerException(localUnsupportedOperationException);
        return;
      }
    }
    Session.openActiveSession(this.a, true, this.l);
  }
  
  public static void onStart() {}
  
  private boolean p()
  {
    Session localSession1 = Session.getActiveSession();
    if ((localSession1 != null) && (!localSession1.isOpened()))
    {
      Session localSession2 = Session.getActiveSession();
      if ((localSession2 != null) && (!localSession2.isOpened())) {
        break label47;
      }
    }
    for (;;)
    {
      localSession1 = Session.getActiveSession();
      if ((localSession1 != null) && (localSession1.isOpened())) {
        break;
      }
      return false;
      label47:
      o();
    }
    return true;
  }
  
  private void q()
  {
    if (m()) {
      return;
    }
    this.j = true;
    Session.getActiveSession().requestNewPublishPermissions(new Session.NewPermissionsRequest(this.a, new String[] { "publish_actions" }));
  }
  
  public final void a()
  {
    this.k.onStop();
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.k.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public final void a(Bundle paramBundle)
  {
    try
    {
      this.k.onSaveInstanceState(paramBundle);
      return;
    }
    catch (StackOverflowError localStackOverflowError) {}
  }
  
  public final void b()
  {
    this.k.onResume();
  }
  
  public final void c()
  {
    this.k.onPause();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.NativeFacebookManager
 * JD-Core Version:    0.7.0.1
 */