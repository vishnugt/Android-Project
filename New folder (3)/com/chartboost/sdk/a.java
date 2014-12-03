package com.chartboost.sdk;

import android.content.SharedPreferences;
import android.os.Handler;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.impl.j;
import com.chartboost.sdk.impl.k;
import com.chartboost.sdk.impl.m;
import com.chartboost.sdk.impl.n;
import com.chartboost.sdk.impl.n.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

class a
{
  private ArrayList<a.a> a = new ArrayList();
  private a.a b = null;
  private Chartboost c;
  private j d;
  private n e;
  private Map<String, com.chartboost.sdk.impl.a> f;
  private com.chartboost.sdk.impl.a g;
  private com.chartboost.sdk.impl.a h;
  private com.chartboost.sdk.impl.a.a i = new a.1(this);
  private n.a j = new a.2(this);
  
  public a(Chartboost paramChartboost)
  {
    this.c = paramChartboost;
    this.d = this.c.b;
    this.e = new n(this.j);
    this.f = new HashMap();
    this.g = null;
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    b localb = this.c.a();
    if ((!paramBoolean) && (localb != null) && (localb.c())) {
      if (this.c.getDelegate() != null) {
        this.c.getDelegate().didFailToLoadInterstitial(paramString);
      }
    }
    do
    {
      do
      {
        return;
      } while ((this.c.getDelegate() != null) && (!this.c.getDelegate().shouldRequestInterstitial(paramString)));
      if (m.a()) {
        break;
      }
    } while (this.c.getDelegate() == null);
    this.c.getDelegate().didFailToLoadInterstitial(paramString);
    return;
    try
    {
      a.a locala = a(com.chartboost.sdk.impl.a.c.b, paramString);
      if (locala == null) {
        break label174;
      }
      if ((!paramBoolean) && (a.a.a(locala)))
      {
        a.a.a(locala, false);
        return;
      }
    }
    finally {}
    if (this.c.getDelegate() != null) {
      this.c.getDelegate().didFailToLoadInterstitial(paramString);
    }
    return;
    label174:
    a(com.chartboost.sdk.impl.a.c.b, paramString, paramBoolean);
    k localk = new k("api/get");
    localk.a(this.c.a.b());
    localk.a("location", paramString);
    if (paramBoolean) {
      localk.a("cache", "1");
    }
    localk.b(this.c.getAppID(), this.c.getAppSignature());
    this.d.a(localk, new a.3(this, paramBoolean, paramString));
  }
  
  private void a(JSONObject paramJSONObject, com.chartboost.sdk.impl.a.c paramc, boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    if (!paramJSONObject.optString("status", "").equals("200"))
    {
      c(paramc, paramString);
      return;
    }
    if ((paramc == com.chartboost.sdk.impl.a.c.c) && (!paramBoolean1))
    {
      b localb1 = this.c.a();
      int k = 0;
      if (localb1 != null)
      {
        boolean bool = this.c.a().a();
        k = 0;
        if (bool) {
          k = 1;
        }
      }
      if ((paramBoolean2) && (k == 0))
      {
        b(paramc, paramString);
        return;
      }
    }
    if (paramBoolean1) {}
    for (com.chartboost.sdk.impl.a.b localb = com.chartboost.sdk.impl.a.b.e;; localb = com.chartboost.sdk.impl.a.b.b)
    {
      new com.chartboost.sdk.impl.a(paramJSONObject, paramc, this.i, localb, paramString, paramBoolean2);
      return;
    }
  }
  
  private void a(JSONObject paramJSONObject, String paramString)
  {
    this.e.a(paramString, this.c.getHostActivity());
  }
  
  private void b(com.chartboost.sdk.impl.a parama)
  {
    if ((!parama.k) && (this.c.getDelegate() != null) && (!this.c.getDelegate().shouldDisplayInterstitial(parama.e)))
    {
      b(parama.d, parama.e);
      return;
    }
    if ((parama.c == com.chartboost.sdk.impl.a.b.f) && (this.f.get(parama.e) == parama))
    {
      this.f.remove(parama.e);
      k localk = new k("api/show");
      localk.a(this.c.a.b());
      String str = parama.a.optString("ad_id");
      if (str != null) {
        localk.a("ad_id", str);
      }
      localk.b(this.c.getAppID(), this.c.getAppSignature());
      this.d.a(localk);
    }
    parama.c = com.chartboost.sdk.impl.a.b.b;
    this.c.a(new b.a(parama));
  }
  
  private void c(com.chartboost.sdk.impl.a.c paramc, String paramString)
  {
    b(paramc, paramString);
    b localb = this.c.a();
    if ((paramc == com.chartboost.sdk.impl.a.c.c) && (localb != null) && (localb.a())) {
      localb.a(true);
    }
    a(null);
    if ((paramc == com.chartboost.sdk.impl.a.c.b) && (this.c.getDelegate() != null)) {
      this.c.getDelegate().didFailToLoadInterstitial(paramString);
    }
    if ((paramc == com.chartboost.sdk.impl.a.c.c) && (this.c.getDelegate() != null)) {
      this.c.getDelegate().didFailToLoadMoreApps();
    }
  }
  
  private void c(com.chartboost.sdk.impl.a parama)
  {
    if ((!parama.k) && (this.c.getDelegate() != null) && (!this.c.getDelegate().shouldDisplayMoreApps()))
    {
      b(parama.d, parama.e);
      return;
    }
    if (parama == this.g) {
      this.g = null;
    }
    int k;
    if (parama.c == com.chartboost.sdk.impl.a.b.f)
    {
      k = 1;
      parama.c = com.chartboost.sdk.impl.a.b.a;
      boolean bool = parama.l;
      b localb = this.c.a();
      if (localb != null)
      {
        if ((!localb.a()) && (bool)) {
          break label146;
        }
        if (bool) {
          localb.a(false);
        }
      }
    }
    label146:
    while ((k != 0) || (parama.j))
    {
      parama.c = com.chartboost.sdk.impl.a.b.b;
      this.c.a(new b.a(parama));
      return;
      k = 0;
      break;
    }
  }
  
  public a.a a(com.chartboost.sdk.impl.a.c paramc, String paramString)
  {
    label111:
    for (;;)
    {
      try
      {
        a.a locala;
        if (paramc == com.chartboost.sdk.impl.a.c.c)
        {
          locala = this.b;
          return locala;
        }
        if (paramc == com.chartboost.sdk.impl.a.c.b)
        {
          if (paramString == null)
          {
            paramString = "";
            break label111;
            if (k >= this.a.size())
            {
              locala = null;
              continue;
            }
            if (paramString.equals(a.a.b((a.a)this.a.get(k))))
            {
              locala = (a.a)this.a.get(k);
              continue;
            }
            k++;
            continue;
          }
        }
        else
        {
          locala = null;
          continue;
        }
        int k = 0;
      }
      finally {}
    }
  }
  
  protected com.chartboost.sdk.impl.a a()
  {
    return this.h;
  }
  
  /* Error */
  public void a(com.chartboost.sdk.impl.a.c paramc, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 125	com/chartboost/sdk/a$a
    //   5: dup
    //   6: aload_1
    //   7: aload_2
    //   8: iload_3
    //   9: invokespecial 309	com/chartboost/sdk/a$a:<init>	(Lcom/chartboost/sdk/impl/a$c;Ljava/lang/String;Z)V
    //   12: astore 4
    //   14: aload_1
    //   15: getstatic 200	com/chartboost/sdk/impl/a$c:c	Lcom/chartboost/sdk/impl/a$c;
    //   18: if_acmpne +12 -> 30
    //   21: aload_0
    //   22: aload 4
    //   24: putfield 37	com/chartboost/sdk/a:b	Lcom/chartboost/sdk/a$a;
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: aload_1
    //   31: getstatic 120	com/chartboost/sdk/impl/a$c:b	Lcom/chartboost/sdk/impl/a$c;
    //   34: if_acmpne -7 -> 27
    //   37: aload_0
    //   38: getfield 35	com/chartboost/sdk/a:a	Ljava/util/ArrayList;
    //   41: aload 4
    //   43: invokevirtual 312	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   46: pop
    //   47: goto -20 -> 27
    //   50: astore 5
    //   52: aload_0
    //   53: monitorexit
    //   54: aload 5
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	a
    //   0	57	1	paramc	com.chartboost.sdk.impl.a.c
    //   0	57	2	paramString	String
    //   0	57	3	paramBoolean	boolean
    //   12	30	4	locala	a.a
    //   50	5	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	27	50	finally
    //   30	47	50	finally
  }
  
  protected void a(com.chartboost.sdk.impl.a parama)
  {
    this.h = parama;
  }
  
  public void a(String paramString)
  {
    if ((this.c.getDelegate() != null) && (!this.c.getDelegate().shouldRequestInterstitialsInFirstSession()) && (CBUtility.a().getInt("cbPrefSessionCount", 0) <= 1)) {
      return;
    }
    a(paramString, true);
  }
  
  protected void a(boolean paramBoolean)
  {
    boolean bool = true;
    b localb = this.c.a();
    if ((!paramBoolean) && (localb != null) && (localb.c())) {
      if (this.c.getDelegate() != null) {
        this.c.getDelegate().didFailToLoadMoreApps();
      }
    }
    do
    {
      do
      {
        return;
      } while ((this.c.getDelegate() != null) && (!this.c.getDelegate().shouldRequestMoreApps()));
      if (m.a()) {
        break;
      }
    } while (this.c.getDelegate() == null);
    this.c.getDelegate().didFailToLoadMoreApps();
    return;
    try
    {
      a.a locala = a(com.chartboost.sdk.impl.a.c.c, null);
      if (locala == null) {
        break label172;
      }
      if ((!paramBoolean) && (a.a.a(locala)))
      {
        a.a.a(locala, false);
        return;
      }
    }
    finally {}
    if (this.c.getDelegate() != null) {
      this.c.getDelegate().didFailToLoadMoreApps();
    }
    return;
    label172:
    a(com.chartboost.sdk.impl.a.c.c, null, paramBoolean);
    if ((!paramBoolean) && ((this.c.getDelegate() == null) || (this.c.getDelegate().shouldDisplayLoadingViewForMoreApps()))) {
      this.c.a(new b.a(bool, null));
    }
    for (;;)
    {
      k localk = new k("api/more");
      localk.a(this.c.a.b());
      if (paramBoolean) {
        localk.a("cache", "1");
      }
      localk.b(this.c.getAppID(), this.c.getAppSignature());
      this.d.a(localk, new a.4(this, paramBoolean, bool));
      return;
      bool = false;
    }
  }
  
  protected void b()
  {
    a.c localc = new a.c(this, null);
    this.c.getHandler().post(localc);
  }
  
  /* Error */
  public void b(com.chartboost.sdk.impl.a.c paramc, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: getstatic 200	com/chartboost/sdk/impl/a$c:c	Lcom/chartboost/sdk/impl/a$c;
    //   6: if_acmpne +11 -> 17
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield 37	com/chartboost/sdk/a:b	Lcom/chartboost/sdk/a$a;
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_1
    //   18: getstatic 120	com/chartboost/sdk/impl/a$c:b	Lcom/chartboost/sdk/impl/a$c;
    //   21: if_acmpne -7 -> 14
    //   24: aload_0
    //   25: aload_1
    //   26: aload_2
    //   27: invokevirtual 123	com/chartboost/sdk/a:a	(Lcom/chartboost/sdk/impl/a$c;Ljava/lang/String;)Lcom/chartboost/sdk/a$a;
    //   30: astore 4
    //   32: aload 4
    //   34: ifnull -20 -> 14
    //   37: aload_0
    //   38: getfield 35	com/chartboost/sdk/a:a	Ljava/util/ArrayList;
    //   41: aload 4
    //   43: invokevirtual 361	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   46: pop
    //   47: goto -33 -> 14
    //   50: astore_3
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_3
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	a
    //   0	55	1	paramc	com.chartboost.sdk.impl.a.c
    //   0	55	2	paramString	String
    //   50	4	3	localObject	Object
    //   30	12	4	locala	a.a
    // Exception table:
    //   from	to	target	type
    //   2	14	50	finally
    //   17	32	50	finally
    //   37	47	50	finally
  }
  
  protected void b(String paramString)
  {
    if ((this.c.getDelegate() != null) && (!this.c.getDelegate().shouldRequestInterstitialsInFirstSession()) && (CBUtility.a().getInt("cbPrefSessionCount", 0) == 1)) {
      return;
    }
    a.b localb = new a.b(this, paramString);
    this.c.getHandler().post(localb);
  }
  
  protected boolean c()
  {
    return this.g != null;
  }
  
  protected boolean c(String paramString)
  {
    com.chartboost.sdk.impl.a locala = (com.chartboost.sdk.impl.a)this.f.get(paramString);
    if (locala == null) {
      return false;
    }
    return TimeUnit.MILLISECONDS.toSeconds(new Date().getTime() - locala.b.getTime()) < 86400L;
  }
  
  protected void d()
  {
    if (this.h == null) {
      return;
    }
    this.i.b(this.h);
  }
  
  protected void e()
  {
    this.f = new HashMap();
    this.g = null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.a
 * JD-Core Version:    0.7.0.1
 */