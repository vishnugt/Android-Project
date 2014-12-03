package com.supercell.titan;

import com.chartboost.sdk.Chartboost.CBAPIResponseCallback;
import org.json.JSONException;
import org.json.JSONObject;

final class o
  implements Chartboost.CBAPIResponseCallback
{
  public final void onFailure(String paramString)
  {
    GameApp.getInstance().a(new r(this, paramString));
  }
  
  public final void onSuccess(JSONObject paramJSONObject)
  {
    try
    {
      int j = paramJSONObject.getInt("status");
      i = j;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        s locals;
        int i = 0;
      }
    }
    if (i == 200)
    {
      locals = s.a(paramJSONObject.toString());
      GameApp.getInstance().a(new p(this, locals));
      return;
    }
    GameApp.getInstance().a(new q(this, i));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.o
 * JD-Core Version:    0.7.0.1
 */