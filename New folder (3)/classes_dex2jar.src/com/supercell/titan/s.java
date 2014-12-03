package com.supercell.titan;

import org.json.JSONException;
import org.json.JSONObject;

public final class s
{
  public String a = "";
  public String b = "";
  public String c = "";
  public String d = "";
  public String e = "";
  public String f = "";
  public String g = "";
  public String h = "";
  public String i = "";
  public String j = "";
  public String k = "";
  
  public static s a(String paramString)
  {
    s locals = new s();
    try
    {
      JSONObject localJSONObject1 = new JSONObject(paramString);
      if (localJSONObject1.has("ad_id")) {
        locals.a = localJSONObject1.getString("ad_id");
      }
      if (localJSONObject1.has("message")) {
        locals.i = localJSONObject1.getString("message");
      }
      if (localJSONObject1.has("link")) {
        locals.e = localJSONObject1.getString("link");
      }
      if (localJSONObject1.has("name")) {
        locals.b = localJSONObject1.getString("name");
      }
      if (localJSONObject1.has("more_apps"))
      {
        JSONObject localJSONObject3 = localJSONObject1.getJSONObject("more_apps");
        if (localJSONObject3.has("button_text")) {
          locals.d = localJSONObject3.getString("button_text");
        }
        if (localJSONObject3.has("featured_text")) {
          locals.c = localJSONObject3.getString("featured_text");
        }
      }
      if (localJSONObject1.has("icons"))
      {
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("icons");
        if (localJSONObject2.has("sm")) {
          locals.f = localJSONObject2.getString("sm");
        }
        if (localJSONObject2.has("md")) {
          locals.g = localJSONObject2.getString("md");
        }
        if (localJSONObject2.has("lg")) {
          locals.h = localJSONObject2.getString("lg");
        }
      }
      if (localJSONObject1.has("to")) {
        locals.j = localJSONObject1.getString("to");
      }
      if (localJSONObject1.has("cgn"))
      {
        String str = localJSONObject1.getString("cgn");
        if ((str != null) && (str.length() > 0))
        {
          int m = str.indexOf("-");
          if (m >= 0) {
            locals.k = str.substring(0, m);
          }
        }
      }
      return locals;
    }
    catch (JSONException localJSONException) {}
    return locals;
  }
  
  public final String toString()
  {
    return "ad_id:" + this.a + " name:" + this.b + " promoText:" + this.c + " buttonLabel:" + this.d + " link:" + this.e + " smallIcon:" + this.f + " mediumIcon:" + this.g + " largeIcon:" + this.h + " message:" + this.i + " toApp:" + this.j + " campaign:" + this.k;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.s
 * JD-Core Version:    0.7.0.1
 */