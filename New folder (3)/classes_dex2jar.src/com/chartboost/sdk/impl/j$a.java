package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.chartboost.sdk.Libraries.CBUtility;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

class j$a
  implements Serializable
{
  private k b;
  private JSONObject c;
  private Integer d;
  private j.b e;
  
  public j$a(j paramj, int paramInt, k paramk, j.b paramb)
  {
    this.d = Integer.valueOf(paramInt);
    this.b = paramk;
    this.e = paramb;
    this.c = null;
  }
  
  public void a(String paramString)
  {
    SharedPreferences localSharedPreferences;
    String str1;
    if ((this.b.f()) && (j.a(this.a) != null))
    {
      localSharedPreferences = CBUtility.a();
      str1 = "CBQueuedRequests-" + j.a(this.a);
    }
    try
    {
      JSONObject localJSONObject = this.b.h();
      if (localJSONObject != null)
      {
        String str2 = localSharedPreferences.getString(str1, null);
        if (str2 != null) {}
        for (;;)
        {
          try
          {
            localJSONArray = new JSONArray(new JSONTokener(str2));
            localJSONArray.put(localJSONObject);
            SharedPreferences.Editor localEditor = localSharedPreferences.edit();
            localEditor.putString(str1, localJSONArray.toString());
            localEditor.commit();
            return;
          }
          catch (Exception localException2)
          {
            localJSONArray = new JSONArray();
            continue;
          }
          JSONArray localJSONArray = new JSONArray();
        }
        if (this.e != null) {
          this.e.a(this.b, paramString);
        }
      }
      return;
    }
    catch (Exception localException1) {}
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.j.a
 * JD-Core Version:    0.7.0.1
 */