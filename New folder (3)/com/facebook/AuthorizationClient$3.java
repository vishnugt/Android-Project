package com.facebook;

import com.facebook.model.GraphUser;
import java.util.ArrayList;

class AuthorizationClient$3
  implements Request.Callback
{
  AuthorizationClient$3(AuthorizationClient paramAuthorizationClient, ArrayList paramArrayList) {}
  
  public void onCompleted(Response paramResponse)
  {
    try
    {
      GraphUser localGraphUser = (GraphUser)paramResponse.getGraphObjectAs(GraphUser.class);
      if (localGraphUser != null) {
        this.val$fbids.add(localGraphUser.getId());
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.3
 * JD-Core Version:    0.7.0.1
 */