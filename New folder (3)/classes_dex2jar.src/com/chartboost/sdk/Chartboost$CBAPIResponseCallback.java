package com.chartboost.sdk;

import org.json.JSONObject;

public abstract interface Chartboost$CBAPIResponseCallback
{
  public abstract void onFailure(String paramString);
  
  public abstract void onSuccess(JSONObject paramJSONObject);
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Chartboost.CBAPIResponseCallback
 * JD-Core Version:    0.7.0.1
 */