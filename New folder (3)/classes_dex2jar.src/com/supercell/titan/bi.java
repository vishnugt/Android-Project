package com.supercell.titan;

import com.facebook.FacebookException;
import com.facebook.Request;

final class bi
  implements Runnable
{
  bi(NativeFacebookManager paramNativeFacebookManager, Request paramRequest) {}
  
  public final void run()
  {
    try
    {
      Request[] arrayOfRequest = new Request[1];
      arrayOfRequest[0] = this.a;
      Request.executeBatchAsync(arrayOfRequest);
      return;
    }
    catch (FacebookException localFacebookException)
    {
      GameApp.debuggerException(localFacebookException);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bi
 * JD-Core Version:    0.7.0.1
 */