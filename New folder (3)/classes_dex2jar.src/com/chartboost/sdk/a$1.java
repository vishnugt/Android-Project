package com.chartboost.sdk;

import android.content.Context;
import com.chartboost.sdk.impl.a.b;
import com.chartboost.sdk.impl.a.c;
import com.chartboost.sdk.impl.j;
import com.chartboost.sdk.impl.k;
import com.chartboost.sdk.impl.n.a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class a$1
  implements com.chartboost.sdk.impl.a.a
{
  a$1(a parama) {}
  
  private void a(JSONObject paramJSONObject, String paramString, k paramk)
  {
    if (paramJSONObject != null) {}
    try
    {
      if (paramJSONObject.getString(paramString) != null) {
        paramk.a(paramString, paramJSONObject.optString(paramString));
      }
      return;
    }
    catch (JSONException localJSONException) {}
  }
  
  public void a(com.chartboost.sdk.impl.a parama)
  {
    a.b localb1 = parama.c;
    a.b localb2 = a.b.e;
    int i = 0;
    if (localb1 == localb2) {}
    for (;;)
    {
      try
      {
        a.a locala = this.a.a(parama.d, parama.e);
        i = 0;
        if (locala != null)
        {
          boolean bool = a.a.a(locala);
          i = 0;
          if (!bool) {
            i = 1;
          }
        }
        if ((parama.d == a.c.b) && (parama.e != null))
        {
          a.a(this.a).put(parama.e, parama);
          if ((a.b(this.a).getDelegate() != null) && (i == 0)) {
            a.b(this.a).getDelegate().didCacheInterstitial(parama.e);
          }
          parama.c = a.b.f;
          if ((parama.c == a.b.b) || (i != 0))
          {
            if (i == 0) {
              parama.c = a.b.a;
            }
            if (parama.d != a.c.b) {
              break label265;
            }
            a.b(this.a, parama);
          }
          this.a.b(parama.d, parama.e);
          return;
        }
      }
      finally {}
      if (parama.d == a.c.c)
      {
        a.a(this.a, parama);
        if ((a.b(this.a).getDelegate() != null) && (i == 0))
        {
          a.b(this.a).getDelegate().didCacheMoreApps();
          continue;
          label265:
          if (parama.d == a.c.c) {
            a.c(this.a, parama);
          }
        }
      }
    }
  }
  
  public void a(com.chartboost.sdk.impl.a parama, String paramString, JSONObject paramJSONObject)
  {
    a.d(this.a, null);
    int i;
    boolean bool2;
    label142:
    label150:
    k localk;
    if ((paramString != null) && (!paramString.equals("")) && (!paramString.equals("null")))
    {
      i = 1;
      if (parama.d != a.c.b) {
        break label377;
      }
      if (a.b(this.a).getDelegate() != null) {
        a.b(this.a).getDelegate().didDismissInterstitial(parama.e);
      }
      if (a.b(this.a).getDelegate() != null) {
        a.b(this.a).getDelegate().didClickInterstitial(parama.e);
      }
      if (parama.c == a.b.c)
      {
        b localb2 = a.b(this.a).a();
        if (localb2 != null)
        {
          if (i == 0) {
            break label371;
          }
          bool2 = false;
          localb2.a(parama, bool2);
        }
      }
      localk = new k("api/click");
      if (a.b(this.a).a != null) {
        break label495;
      }
    }
    label495:
    for (Object localObject = a.b(this.a).c();; localObject = a.b(this.a).a.b())
    {
      if (localObject == null) {
        localObject = a.b(this.a).getContext();
      }
      localk.a((Context)localObject);
      a(parama.a, "to", localk);
      a(parama.a, "cgn", localk);
      a(parama.a, "creative", localk);
      a(parama.a, "ad_id", localk);
      a(paramJSONObject, "cgn", localk);
      a(paramJSONObject, "creative", localk);
      a(paramJSONObject, "type", localk);
      a(paramJSONObject, "more_type", localk);
      localk.b(a.b(this.a).getAppID(), a.b(this.a).getAppSignature());
      if (i == 0) {
        break label513;
      }
      a.b(this.a).a(new b.a(true, null));
      a.c(this.a).a(localk, new a.1.1(this, paramString));
      return;
      i = 0;
      break;
      label371:
      bool2 = true;
      break label142;
      label377:
      if (parama.d != a.c.c) {
        break label150;
      }
      if (a.b(this.a).getDelegate() != null) {
        a.b(this.a).getDelegate().didDismissMoreApps();
      }
      if (a.b(this.a).getDelegate() != null) {
        a.b(this.a).getDelegate().didClickMoreApps();
      }
      if (parama.c != a.b.c) {
        break label150;
      }
      b localb1 = a.b(this.a).a();
      if (localb1 == null) {
        break label150;
      }
      if (i != 0) {}
      for (boolean bool1 = false;; bool1 = true)
      {
        localb1.a(parama, bool1);
        break;
      }
    }
    label513:
    a.d(this.a).a(false, paramString);
    a.c(this.a).a(localk);
  }
  
  public void b(com.chartboost.sdk.impl.a parama)
  {
    a.d(this.a, null);
    if (parama.d == a.c.b)
    {
      if (a.b(this.a).getDelegate() != null) {
        a.b(this.a).getDelegate().didDismissInterstitial(parama.e);
      }
      if (a.b(this.a).getDelegate() != null) {
        a.b(this.a).getDelegate().didCloseInterstitial(parama.e);
      }
      if (parama.c == a.b.c)
      {
        b localb2 = a.b(this.a).a();
        if (localb2 != null) {
          localb2.a(parama, true);
        }
      }
    }
    b localb1;
    do
    {
      do
      {
        do
        {
          return;
        } while (parama.d != a.c.c);
        if (a.b(this.a).getDelegate() != null) {
          a.b(this.a).getDelegate().didDismissMoreApps();
        }
        if (a.b(this.a).getDelegate() != null) {
          a.b(this.a).getDelegate().didCloseMoreApps();
        }
      } while (parama.c != a.b.c);
      localb1 = a.b(this.a).a();
    } while (localb1 == null);
    localb1.a(parama, true);
  }
  
  public void c(com.chartboost.sdk.impl.a parama)
  {
    a locala = this.a;
    a.c localc = parama.d;
    if (parama.d == a.c.b) {}
    for (String str = parama.e;; str = null)
    {
      a.a(locala, localc, str);
      return;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.a.1
 * JD-Core Version:    0.7.0.1
 */