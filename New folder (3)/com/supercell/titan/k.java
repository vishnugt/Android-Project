package com.supercell.titan;

import com.chartboost.sdk.Chartboost.CBAPIResponseCallback;
import org.json.JSONObject;

final class k
  implements Chartboost.CBAPIResponseCallback
{
  k(String paramString) {}
  
  public final void onFailure(String paramString)
  {
    GameApp.getInstance().a(new m(this, paramString));
  }
  
  public final void onSuccess(JSONObject paramJSONObject)
  {
    GameApp.getInstance().a(new l(this));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.k
 * JD-Core Version:    0.7.0.1
 */