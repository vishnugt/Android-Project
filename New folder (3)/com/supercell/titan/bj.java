package com.supercell.titan;

import com.facebook.FacebookException;
import com.facebook.Request;

final class bj
  implements Runnable
{
  bj(NativeFacebookManager paramNativeFacebookManager, Request paramRequest) {}
  
  public final void run()
  {
    try
    {
      this.a.executeAsync();
      return;
    }
    catch (FacebookException localFacebookException)
    {
      GameApp.debuggerException(localFacebookException);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bj
 * JD-Core Version:    0.7.0.1
 */