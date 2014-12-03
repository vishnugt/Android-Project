package com.supercell.titan;

import com.facebook.Request.Callback;
import com.facebook.Response;
import com.facebook.model.GraphObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bu
  implements Request.Callback
{
  private final String a;
  
  public bu(String paramString)
  {
    this.a = paramString;
  }
  
  public final void onCompleted(Response paramResponse)
  {
    GraphObject localGraphObject = paramResponse.getGraphObject();
    JSONObject localJSONObject1;
    if (localGraphObject != null)
    {
      localJSONObject1 = localGraphObject.getInnerJSONObject();
      if ((paramResponse.getError() != null) || (localJSONObject1 == null)) {}
    }
    for (;;)
    {
      int i;
      int j;
      boolean bool1;
      label44:
      boolean bool3;
      int m;
      try
      {
        JSONArray localJSONArray1 = localJSONObject1.getJSONArray("data");
        i = 0;
        j = 0;
        bool1 = false;
        if (i < localJSONArray1.length())
        {
          JSONObject localJSONObject2 = localJSONArray1.getJSONObject(i);
          String str = localJSONObject2.getString("name");
          if (str.equalsIgnoreCase("urllike"))
          {
            if (localJSONObject2.getJSONArray("fql_result_set").length() <= 0) {
              break label232;
            }
            bool3 = true;
            break label201;
          }
          if (str.equalsIgnoreCase("likecount"))
          {
            JSONArray localJSONArray2 = localJSONObject2.getJSONArray("fql_result_set");
            m = 0;
            if (m < localJSONArray2.length())
            {
              JSONObject localJSONObject3 = localJSONArray2.getJSONObject(m);
              if (!localJSONObject3.has("like_count")) {
                break label238;
              }
              k = localJSONObject3.getInt("like_count");
              bool2 = bool1;
              break label213;
            }
          }
        }
        else
        {
          GameApp.getInstance().a(new bv(this, bool1, j));
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        return;
      }
      int k = j;
      boolean bool2 = bool1;
      for (;;)
      {
        label201:
        int n = j;
        bool2 = bool3;
        k = n;
        label213:
        i++;
        bool1 = bool2;
        j = k;
        break label44;
        localJSONObject1 = null;
        break;
        label232:
        bool3 = false;
      }
      label238:
      m++;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bu
 * JD-Core Version:    0.7.0.1
 */