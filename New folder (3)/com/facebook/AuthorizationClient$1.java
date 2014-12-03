package com.facebook;

import android.app.Activity;
import android.content.Intent;

class AuthorizationClient$1
  implements AuthorizationClient.StartActivityDelegate
{
  AuthorizationClient$1(AuthorizationClient paramAuthorizationClient, Activity paramActivity) {}
  
  public Activity getActivityContext()
  {
    return this.val$activity;
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    this.val$activity.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.1
 * JD-Core Version:    0.7.0.1
 */