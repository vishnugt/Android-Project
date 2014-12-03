package com.facebook;

import android.content.ActivityNotFoundException;
import android.content.Intent;

abstract class AuthorizationClient$KatanaAuthHandler
  extends AuthorizationClient.AuthHandler
{
  private static final long serialVersionUID = 1L;
  
  AuthorizationClient$KatanaAuthHandler(AuthorizationClient paramAuthorizationClient)
  {
    super(paramAuthorizationClient);
  }
  
  protected boolean tryIntent(Intent paramIntent, int paramInt)
  {
    if (paramIntent == null) {
      return false;
    }
    try
    {
      this.this$0.getStartActivityDelegate().startActivityForResult(paramIntent, paramInt);
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException) {}
    return false;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.KatanaAuthHandler
 * JD-Core Version:    0.7.0.1
 */