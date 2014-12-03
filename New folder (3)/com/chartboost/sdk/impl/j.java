package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.util.SparseArray;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Libraries.d;
import com.chartboost.sdk.Libraries.d.a;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONTokener;

public class j
{
  public static d.a a;
  private static int g = 0;
  private String b;
  private String c;
  private SparseArray<j.a> d;
  private int e;
  private Handler f = Chartboost.sharedChartboost().getHandler();
  
  static
  {
    d.a[] arrayOfa = new d.a[2];
    arrayOfa[0] = d.a();
    arrayOfa[1] = new j.1();
    a = d.a(arrayOfa);
  }
  
  public j(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      paramString1 = "https://live.chartboost.com";
    }
    this.b = paramString1;
    this.c = paramString2;
    this.d = new SparseArray();
    this.e = 1;
  }
  
  public void a()
  {
    if (!m.a()) {}
    SharedPreferences localSharedPreferences;
    String str1;
    String str2;
    do
    {
      return;
      localSharedPreferences = CBUtility.a();
      str1 = "CBQueuedRequests-" + this.c;
      str2 = localSharedPreferences.getString(str1, null);
    } while (str2 == null);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putString(str1, null);
    localEditor.commit();
    for (;;)
    {
      try
      {
        localJSONArray = new JSONArray(new JSONTokener(str2));
        i = 0;
        int j = localJSONArray.length();
        if (i >= j) {
          break;
        }
      }
      catch (Exception localException1)
      {
        JSONArray localJSONArray;
        int i;
        k localk;
        return;
      }
      try
      {
        localk = k.a(localJSONArray.getJSONObject(i));
        if (localk != null) {
          a(localk);
        }
        i++;
      }
      catch (Exception localException2) {}
    }
  }
  
  public void a(k paramk)
  {
    a(paramk, null);
  }
  
  public void a(k paramk, j.b paramb)
  {
    int i = this.e;
    this.e = (i + 1);
    j.a locala = new j.a(this, i, paramk, paramb);
    if (!m.a())
    {
      locala.a("network unreachable");
      return;
    }
    this.d.put(i, locala);
    j.d locald = new j.d(this, locala);
    l.a().execute(locald);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.j
 * JD-Core Version:    0.7.0.1
 */