package com.supercell.titan;

import com.facebook.Request.GraphUserCallback;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.model.GraphUser;
import org.json.JSONObject;

final class bx
  implements Request.GraphUserCallback
{
  bx(bw parambw) {}
  
  public final void onCompleted(GraphUser paramGraphUser, Response paramResponse)
  {
    if (paramGraphUser != null)
    {
      String str1 = paramGraphUser.getInnerJSONObject().toString();
      String str2 = bw.a(this.a).getAccessToken();
      if (str2 == null) {
        str2 = "";
      }
      bw.b(this.a).a(new by(this, str1, str2));
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bx
 * JD-Core Version:    0.7.0.1
 */