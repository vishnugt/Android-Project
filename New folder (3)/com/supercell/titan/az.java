package com.supercell.titan;

import com.facebook.Session;
import com.facebook.Session.StatusCallback;
import com.facebook.SessionState;

final class az
  implements Session.StatusCallback
{
  az(NativeFacebookManager paramNativeFacebookManager) {}
  
  public final void call(Session paramSession, SessionState paramSessionState, Exception paramException)
  {
    if (paramSessionState.equals(SessionState.OPENED_TOKEN_UPDATED)) {
      if (NativeFacebookManager.a(this.a) != NativeFacebookManager.d()) {
        NativeFacebookManager.a(this.a, NativeFacebookManager.a(this.a));
      }
    }
    while (paramSessionState.equals(SessionState.OPENING))
    {
      return;
      NativeFacebookManager.a(this.a, NativeFacebookManager.e());
      return;
    }
    if (paramSession.isOpened())
    {
      if (!NativeFacebookManager.f()) {
        GameApp.debuggerWarning("Facebook session opened but there is no access token");
      }
      NativeFacebookManager.a(this.a, NativeFacebookManager.e());
      return;
    }
    if (paramException != null)
    {
      NativeFacebookManager.b(this.a).a(new ba(this, paramException));
      return;
    }
    NativeFacebookManager.b(this.a).a(new bb(this));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.az
 * JD-Core Version:    0.7.0.1
 */