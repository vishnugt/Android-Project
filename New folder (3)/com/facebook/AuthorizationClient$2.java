package com.facebook;

import android.app.Activity;
import android.content.Intent;

class AuthorizationClient$2
  implements AuthorizationClient.StartActivityDelegate
{
  AuthorizationClient$2(AuthorizationClient paramAuthorizationClient) {}
  
  public Activity getActivityContext()
  {
    return this.this$0.pendingRequest.getStartActivityDelegate().getActivityContext();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    this.this$0.pendingRequest.getStartActivityDelegate().startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.2
 * JD-Core Version:    0.7.0.1
 */