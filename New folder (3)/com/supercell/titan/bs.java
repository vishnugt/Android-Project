package com.supercell.titan;

import com.facebook.FacebookRequestError;
import com.facebook.Request.Callback;
import com.facebook.Response;
import com.facebook.model.GraphObject;

public final class bs
  implements Request.Callback
{
  private final GameApp a;
  
  public bs(GameApp paramGameApp)
  {
    this.a = paramGameApp;
  }
  
  public final void onCompleted(Response paramResponse)
  {
    FacebookRequestError localFacebookRequestError = paramResponse.getError();
    if (localFacebookRequestError == null)
    {
      GraphObject localGraphObject = paramResponse.getGraphObject();
      this.a.a(new bt(this, localGraphObject));
      return;
    }
    GameApp.debuggerWarning("NativeFacebookRequestFriendsCallback: " + localFacebookRequestError.getErrorMessage());
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bs
 * JD-Core Version:    0.7.0.1
 */