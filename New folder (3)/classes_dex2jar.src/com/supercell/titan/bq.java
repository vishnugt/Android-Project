package com.supercell.titan;

import com.facebook.Request.Callback;
import com.facebook.Response;
import com.facebook.model.GraphObject;
import org.json.JSONObject;

public final class bq
  implements Request.Callback
{
  private final GameApp a;
  
  public bq(GameApp paramGameApp)
  {
    this.a = paramGameApp;
  }
  
  public final void onCompleted(Response paramResponse)
  {
    GraphObject localGraphObject = paramResponse.getGraphObject();
    if (localGraphObject != null) {}
    for (String str = localGraphObject.getInnerJSONObject().toString();; str = "")
    {
      if (paramResponse.getError() == null) {
        this.a.a(new br(this, str));
      }
      return;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bq
 * JD-Core Version:    0.7.0.1
 */