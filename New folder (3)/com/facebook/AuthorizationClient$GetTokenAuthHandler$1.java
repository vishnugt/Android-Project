package com.facebook;

import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient.CompletedListener;

class AuthorizationClient$GetTokenAuthHandler$1
  implements PlatformServiceClient.CompletedListener
{
  AuthorizationClient$GetTokenAuthHandler$1(AuthorizationClient.GetTokenAuthHandler paramGetTokenAuthHandler, AuthorizationClient.AuthorizationRequest paramAuthorizationRequest) {}
  
  public void completed(Bundle paramBundle)
  {
    this.this$1.getTokenCompleted(this.val$request, paramBundle);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.GetTokenAuthHandler.1
 * JD-Core Version:    0.7.0.1
 */