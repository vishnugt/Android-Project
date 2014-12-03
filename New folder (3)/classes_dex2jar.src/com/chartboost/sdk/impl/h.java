package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.chartboost.sdk.Libraries.a.a;
import com.chartboost.sdk.c;
import com.chartboost.sdk.c.a;
import com.chartboost.sdk.c.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class h
  extends c
{
  private static int h = 50;
  private static int i = 50;
  private static int j = 30;
  private List<JSONObject> k = new ArrayList();
  private a.a l;
  private a.a m;
  private a.a n;
  private SparseArray<a.a> o;
  
  public h(a parama)
  {
    super(parama);
    this.e = 3;
  }
  
  protected c.b a(Context paramContext)
  {
    return new h.a(this, paramContext, null);
  }
  
  public void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("cells");
    if (localJSONArray == null)
    {
      if (this.d != null) {
        this.d.a();
      }
      return;
    }
    this.o = new SparseArray();
    h.1 local1 = new h.1(this);
    int i1 = 0;
    if (i1 >= localJSONArray.length())
    {
      h.2 local2 = new h.2(this);
      h.3 local3 = new h.3(this);
      h.4 local4 = new h.4(this);
      a("close", local2);
      a("header-center", local3);
      a("header-tile", local4);
      return;
    }
    JSONObject localJSONObject1 = localJSONArray.optJSONObject(i1);
    this.k.add(localJSONObject1);
    String str = localJSONObject1.optString("type", "");
    if (str.equals("regular"))
    {
      JSONObject localJSONObject3 = localJSONObject1.optJSONObject("assets");
      if (localJSONObject3 != null)
      {
        this.e = (1 + this.e);
        Bundle localBundle3 = new Bundle();
        localBundle3.putInt("index", i1);
        a(localJSONObject3, "icon", local1, localBundle3);
      }
    }
    for (;;)
    {
      i1++;
      break;
      if (str.equals("featured"))
      {
        JSONObject localJSONObject2 = localJSONObject1.optJSONObject("assets");
        if (localJSONObject2 != null)
        {
          this.e = (1 + this.e);
          Bundle localBundle1 = new Bundle();
          localBundle1.putInt("index", i1);
          a(localJSONObject2, "portrait", local1, localBundle1);
          this.e = (1 + this.e);
          Bundle localBundle2 = new Bundle();
          localBundle2.putInt("index", i1);
          a(localJSONObject2, "landscape", local1, localBundle2);
        }
      }
      else
      {
        str.equals("webview");
      }
    }
  }
  
  public void c()
  {
    super.c();
    this.k = null;
    this.l = null;
    this.n = null;
    this.m = null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.h
 * JD-Core Version:    0.7.0.1
 */