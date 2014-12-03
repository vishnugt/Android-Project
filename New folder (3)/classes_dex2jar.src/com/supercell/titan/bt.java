package com.supercell.titan;

import com.facebook.model.GraphObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class bt
  implements Runnable
{
  bt(bs parambs, GraphObject paramGraphObject) {}
  
  public final void run()
  {
    String str;
    if (this.a != null)
    {
      JSONObject localJSONObject1 = this.a.getInnerJSONObject();
      try
      {
        JSONArray localJSONArray = localJSONObject1.getJSONArray("data");
        int i = localJSONArray.length();
        for (int j = 0; j < i; j++)
        {
          JSONObject localJSONObject2 = localJSONArray.getJSONObject(j);
          localJSONObject2.putOpt("uid", String.valueOf(localJSONObject2.getLong("uid")));
        }
        NativeFacebookManager.facebookFriends(str);
      }
      catch (JSONException localJSONException)
      {
        GameApp.debuggerException(localJSONException);
        str = localJSONObject1.toString();
      }
    }
    for (;;)
    {
      return;
      str = "";
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bt
 * JD-Core Version:    0.7.0.1
 */