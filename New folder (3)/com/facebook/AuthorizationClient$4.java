package com.facebook;

import com.facebook.model.GraphMultiResult;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import java.util.ArrayList;
import java.util.Map;

class AuthorizationClient$4
  implements Request.Callback
{
  AuthorizationClient$4(AuthorizationClient paramAuthorizationClient, ArrayList paramArrayList) {}
  
  public void onCompleted(Response paramResponse)
  {
    try
    {
      GraphMultiResult localGraphMultiResult = (GraphMultiResult)paramResponse.getGraphObjectAs(GraphMultiResult.class);
      if (localGraphMultiResult != null)
      {
        GraphObjectList localGraphObjectList = localGraphMultiResult.getData();
        if ((localGraphObjectList != null) && (localGraphObjectList.size() == 1))
        {
          GraphObject localGraphObject = (GraphObject)localGraphObjectList.get(0);
          this.val$tokenPermissions.addAll(localGraphObject.asMap().keySet());
        }
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.4
 * JD-Core Version:    0.7.0.1
 */