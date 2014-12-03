package com.chartboost.sdk;

import com.chartboost.sdk.impl.j.b;
import com.chartboost.sdk.impl.k;
import org.json.JSONObject;

class d$1
  implements j.b
{
  d$1(d paramd, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback) {}
  
  public void a(k paramk, String paramString)
  {
    if (this.b != null) {
      this.b.onFailure(paramString);
    }
  }
  
  public void a(JSONObject paramJSONObject, k paramk)
  {
    if (this.b != null) {
      this.b.onSuccess(paramJSONObject);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.d.1
 * JD-Core Version:    0.7.0.1
 */