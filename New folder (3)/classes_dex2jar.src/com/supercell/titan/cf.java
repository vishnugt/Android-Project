package com.supercell.titan;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.android.vending.billing.IInAppBillingService;
import java.util.ArrayList;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cf
  extends PurchaseManager
{
  private IInAppBillingService l;
  private Vector<String> m = new Vector();
  private String n = "";
  private int o = 0;
  private String p = "";
  private String q = "";
  private boolean r;
  private boolean s;
  private boolean t;
  private boolean u;
  private String v = "";
  private final ServiceConnection w = new cg(this);
  
  public cf(GameApp paramGameApp, String paramString)
  {
    super(paramGameApp);
    this.v = paramString;
    f();
  }
  
  private int a(ce paramce)
  {
    int i = -1;
    if (this.l != null) {}
    try
    {
      int j = this.l.b(3, this.i.getPackageName(), paramce.e);
      i = j;
      return i;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
    return i;
  }
  
  private void a(JSONArray paramJSONArray)
  {
    Integer.toString(this.m.size());
    int i = Math.min(this.m.size(), 20);
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(this.m.remove(0));
    }
    if (localArrayList.isEmpty()) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putStringArrayList("ITEM_ID_LIST", localArrayList);
    Integer.toString(localArrayList.size());
    new ci(this, localBundle, paramJSONArray).start();
  }
  
  private static int b(Bundle paramBundle, String paramString)
  {
    Object localObject = paramBundle.get(paramString);
    if ((localObject instanceof Integer)) {
      return ((Integer)localObject).intValue();
    }
    if ((localObject instanceof Long)) {
      return ((Long)localObject).intValue();
    }
    return -1;
  }
  
  private void j()
  {
    if (this.l != null) {
      b();
    }
    if ((this.l != null) && (this.l != null)) {}
    label485:
    label489:
    for (;;)
    {
      int j;
      try
      {
        localBundle = this.l.a(3, this.i.getPackageName(), "inapp", null);
        if (localBundle != null) {
          continue;
        }
      }
      catch (Exception localException)
      {
        Bundle localBundle;
        ArrayList localArrayList1;
        ArrayList localArrayList2;
        ArrayList localArrayList3;
        String str1;
        String str2;
        String str3;
        GameApp.debuggerException(localException);
        continue;
      }
      if (!this.q.isEmpty())
      {
        if (this.l != null) {
          c(this.q);
        }
        this.q = "";
      }
      return;
      int i = b(localBundle, "RESPONSE_CODE");
      if (i == 0)
      {
        this.s = true;
        localArrayList1 = localBundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        localArrayList2 = localBundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        localArrayList3 = localBundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if ((localArrayList1 == null) || (localArrayList2 == null) || (localArrayList3 == null)) {
          continue;
        }
        j = 0;
        if (j >= localArrayList1.size()) {
          break label489;
        }
        str1 = (String)localArrayList1.get(j);
        if (a(str1))
        {
          str2 = (String)localArrayList2.get(j);
          str3 = (String)localArrayList3.get(j);
          ce localce;
          try
          {
            JSONObject localJSONObject = new JSONObject(str2);
            String str4 = localJSONObject.getString("productId");
            if (!str1.equals(str4)) {
              break label485;
            }
            String str5 = localJSONObject.getString("developerPayload");
            if ((str5 == null) || (!str5.equals(this.v)) || (str3 == null) || (str3.isEmpty())) {
              break label485;
            }
            String str6 = localJSONObject.getString("orderId");
            String str7 = localJSONObject.getString("purchaseToken");
            int k = localJSONObject.getInt("purchaseState");
            if ((str6 == null) || (str6.isEmpty()) || (str4 == null) || (str4.isEmpty()) || (str7 == null) || (str7.isEmpty())) {
              break label485;
            }
            localce = new ce(this);
            localce.c = str6;
            localce.b = str4;
            localce.a = str2;
            localce.d = str3;
            localce.e = str7;
            if (k == 0) {
              this.b.add(localce);
            } else if (k == 1) {
              this.d.add(str4);
            }
          }
          catch (JSONException localJSONException)
          {
            GameApp.debuggerException(localJSONException);
          }
        }
      }
      else
      {
        if (i != 3) {
          continue;
        }
        this.s = false;
        continue;
      }
      j++;
    }
  }
  
  public final void a()
  {
    this.i.unbindService(this.w);
    super.a();
  }
  
  /* Error */
  public final void a(int paramInt, Intent paramIntent)
  {
    // Byte code:
    //   0: new 289	com/supercell/titan/cd
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 290	com/supercell/titan/cd:<init>	(Lcom/supercell/titan/PurchaseManager;)V
    //   8: astore_3
    //   9: aload_3
    //   10: iload_1
    //   11: putfield 292	com/supercell/titan/cd:c	I
    //   14: aload_3
    //   15: aload_0
    //   16: getfield 43	com/supercell/titan/cf:p	Ljava/lang/String;
    //   19: putfield 293	com/supercell/titan/cd:a	Ljava/lang/String;
    //   22: ldc 37
    //   24: astore 4
    //   26: iload_1
    //   27: iconst_m1
    //   28: if_icmpne +343 -> 371
    //   31: aload_2
    //   32: ldc_w 295
    //   35: invokevirtual 300	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   38: astore 11
    //   40: aload_2
    //   41: ldc_w 302
    //   44: invokevirtual 300	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   47: astore 12
    //   49: aload 11
    //   51: ifnull +307 -> 358
    //   54: aload 12
    //   56: ifnull +302 -> 358
    //   59: new 242	org/json/JSONObject
    //   62: dup
    //   63: aload 11
    //   65: invokespecial 243	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   68: astore 13
    //   70: aload 13
    //   72: ldc 245
    //   74: invokevirtual 249	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   77: astore 15
    //   79: aload 15
    //   81: astore 5
    //   83: aload 5
    //   85: ifnull +9 -> 94
    //   88: aload_3
    //   89: aload 5
    //   91: putfield 293	com/supercell/titan/cd:a	Ljava/lang/String;
    //   94: aload 13
    //   96: ldc 254
    //   98: invokevirtual 249	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   101: astore 17
    //   103: aload 17
    //   105: ifnull +228 -> 333
    //   108: aload 17
    //   110: aload_0
    //   111: getfield 47	com/supercell/titan/cf:v	Ljava/lang/String;
    //   114: invokevirtual 252	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   117: ifeq +216 -> 333
    //   120: aload 12
    //   122: ifnull +211 -> 333
    //   125: aload 12
    //   127: invokevirtual 221	java/lang/String:isEmpty	()Z
    //   130: ifne +203 -> 333
    //   133: aload 13
    //   135: ldc_w 256
    //   138: invokevirtual 249	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   141: astore 18
    //   143: aload 13
    //   145: ldc_w 258
    //   148: invokevirtual 249	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   151: astore 19
    //   153: aload 13
    //   155: ldc_w 260
    //   158: invokevirtual 264	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   161: istore 20
    //   163: aload 18
    //   165: ifnull +168 -> 333
    //   168: aload 18
    //   170: invokevirtual 221	java/lang/String:isEmpty	()Z
    //   173: ifne +160 -> 333
    //   176: aload 5
    //   178: ifnull +155 -> 333
    //   181: aload 5
    //   183: invokevirtual 221	java/lang/String:isEmpty	()Z
    //   186: ifne +147 -> 333
    //   189: aload 19
    //   191: ifnull +142 -> 333
    //   194: aload 19
    //   196: invokevirtual 221	java/lang/String:isEmpty	()Z
    //   199: ifne +134 -> 333
    //   202: new 79	com/supercell/titan/ce
    //   205: dup
    //   206: aload_0
    //   207: invokespecial 267	com/supercell/titan/ce:<init>	(Lcom/supercell/titan/PurchaseManager;)V
    //   210: astore 21
    //   212: aload 21
    //   214: aload 18
    //   216: putfield 269	com/supercell/titan/ce:c	Ljava/lang/String;
    //   219: aload 21
    //   221: aload 5
    //   223: putfield 271	com/supercell/titan/ce:b	Ljava/lang/String;
    //   226: aload 21
    //   228: aload 11
    //   230: putfield 273	com/supercell/titan/ce:a	Ljava/lang/String;
    //   233: aload 21
    //   235: aload 12
    //   237: putfield 275	com/supercell/titan/ce:d	Ljava/lang/String;
    //   240: aload 21
    //   242: aload 19
    //   244: putfield 82	com/supercell/titan/ce:e	Ljava/lang/String;
    //   247: aload_0
    //   248: aload 5
    //   250: invokevirtual 240	com/supercell/titan/cf:a	(Ljava/lang/String;)Z
    //   253: ifeq +80 -> 333
    //   256: iload 20
    //   258: ifne +53 -> 311
    //   261: aload_0
    //   262: getfield 277	com/supercell/titan/cf:b	Ljava/util/Vector;
    //   265: aload 21
    //   267: invokevirtual 278	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   270: pop
    //   271: iconst_0
    //   272: istore 6
    //   274: iconst_1
    //   275: istore 7
    //   277: iload 6
    //   279: ifeq +127 -> 406
    //   282: aload_0
    //   283: getfield 280	com/supercell/titan/cf:d	Ljava/util/Vector;
    //   286: aload 5
    //   288: invokevirtual 278	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   291: pop
    //   292: aload_0
    //   293: monitorenter
    //   294: aload_0
    //   295: iconst_m1
    //   296: aload_0
    //   297: getfield 304	com/supercell/titan/cf:j	I
    //   300: iadd
    //   301: iconst_0
    //   302: invokestatic 307	java/lang/Math:max	(II)I
    //   305: putfield 304	com/supercell/titan/cf:j	I
    //   308: aload_0
    //   309: monitorexit
    //   310: return
    //   311: iload 20
    //   313: iconst_1
    //   314: if_icmpne +12 -> 326
    //   317: iconst_1
    //   318: istore 6
    //   320: iconst_0
    //   321: istore 7
    //   323: goto -46 -> 277
    //   326: aload_3
    //   327: ldc_w 309
    //   330: putfield 310	com/supercell/titan/cd:b	Ljava/lang/String;
    //   333: iconst_0
    //   334: istore 6
    //   336: iconst_0
    //   337: istore 7
    //   339: goto -62 -> 277
    //   342: astore 14
    //   344: aload_3
    //   345: aload 14
    //   347: invokevirtual 313	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   350: putfield 310	com/supercell/titan/cd:b	Ljava/lang/String;
    //   353: aload 14
    //   355: invokestatic 91	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   358: aload 4
    //   360: astore 5
    //   362: iconst_0
    //   363: istore 6
    //   365: iconst_0
    //   366: istore 7
    //   368: goto -91 -> 277
    //   371: iload_1
    //   372: ifne +71 -> 443
    //   375: aload_0
    //   376: getfield 43	com/supercell/titan/cf:p	Ljava/lang/String;
    //   379: invokevirtual 221	java/lang/String:isEmpty	()Z
    //   382: ifne +61 -> 443
    //   385: aload_0
    //   386: getfield 43	com/supercell/titan/cf:p	Ljava/lang/String;
    //   389: astore 5
    //   391: aload_0
    //   392: ldc 37
    //   394: putfield 43	com/supercell/titan/cf:p	Ljava/lang/String;
    //   397: iconst_1
    //   398: istore 6
    //   400: iconst_0
    //   401: istore 7
    //   403: goto -126 -> 277
    //   406: iload 7
    //   408: ifne -116 -> 292
    //   411: aload_0
    //   412: getfield 315	com/supercell/titan/cf:c	Ljava/util/Vector;
    //   415: aload_3
    //   416: invokevirtual 278	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   419: pop
    //   420: goto -128 -> 292
    //   423: astore 9
    //   425: aload_0
    //   426: monitorexit
    //   427: aload 9
    //   429: athrow
    //   430: astore 16
    //   432: aload 5
    //   434: astore 4
    //   436: aload 16
    //   438: astore 14
    //   440: goto -96 -> 344
    //   443: aload 4
    //   445: astore 5
    //   447: iconst_0
    //   448: istore 6
    //   450: iconst_0
    //   451: istore 7
    //   453: goto -176 -> 277
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	456	0	this	cf
    //   0	456	1	paramInt	int
    //   0	456	2	paramIntent	Intent
    //   8	408	3	localcd	cd
    //   24	420	4	localObject1	Object
    //   81	365	5	localObject2	Object
    //   272	177	6	i	int
    //   275	177	7	j	int
    //   423	5	9	localObject3	Object
    //   38	191	11	str1	String
    //   47	189	12	str2	String
    //   68	86	13	localJSONObject	JSONObject
    //   342	12	14	localException1	Exception
    //   438	1	14	localObject4	Object
    //   77	3	15	str3	String
    //   430	7	16	localException2	Exception
    //   101	8	17	str4	String
    //   141	74	18	str5	String
    //   151	92	19	str6	String
    //   161	154	20	k	int
    //   210	56	21	localce	ce
    // Exception table:
    //   from	to	target	type
    //   59	79	342	java/lang/Exception
    //   294	310	423	finally
    //   88	94	430	java/lang/Exception
    //   94	103	430	java/lang/Exception
    //   108	120	430	java/lang/Exception
    //   125	163	430	java/lang/Exception
    //   168	176	430	java/lang/Exception
    //   181	189	430	java/lang/Exception
    //   194	256	430	java/lang/Exception
    //   261	271	430	java/lang/Exception
    //   326	333	430	java/lang/Exception
  }
  
  public final String b(String paramString)
  {
    if (this.l == null) {
      return "";
    }
    ArrayList localArrayList1 = new ArrayList(1);
    localArrayList1.add(paramString);
    Bundle localBundle1 = new Bundle();
    localBundle1.putStringArrayList("ITEM_ID_LIST", localArrayList1);
    try
    {
      Bundle localBundle2 = this.l.a(3, this.i.getPackageName(), "inapp", localBundle1);
      if (b(localBundle2, "RESPONSE_CODE") == 0)
      {
        ArrayList localArrayList2 = localBundle2.getStringArrayList("DETAILS_LIST");
        if ((localArrayList2 != null) && (!localArrayList2.isEmpty()))
        {
          String str = (String)localArrayList2.get(0);
          return str;
        }
      }
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
    return "";
  }
  
  protected final void b()
  {
    this.n = "";
    this.o = 0;
    if (this.l == null)
    {
      this.e = "";
      this.f = "No Billing service available";
      if (!this.u)
      {
        this.g = -100;
        return;
      }
      this.g = -101;
      return;
    }
    if (this.m.isEmpty()) {
      this.m.addAll(this.h);
    }
    a(new JSONArray());
  }
  
  protected final void c(String paramString)
  {
    if (this.l == null)
    {
      this.q = paramString;
      return;
    }
    this.p = paramString;
    try
    {
      this.j = (1 + this.j);
      new cj(this, paramString).start();
      return;
    }
    finally {}
  }
  
  protected final void d(String paramString)
  {
    for (int i = 0;; i++) {
      if (i < this.k.size())
      {
        ce localce = (ce)this.k.get(i);
        if (paramString.equals(localce.c))
        {
          a(i);
          new ck(this, localce).start();
        }
      }
      else
      {
        return;
      }
    }
  }
  
  protected final boolean d()
  {
    return (this.t) && (this.s) && (this.r);
  }
  
  public final void f()
  {
    this.r = false;
    this.s = true;
    this.t = true;
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    this.u = this.i.bindService(localIntent, this.w, 1);
    this.t = this.u;
  }
  
  public final void g()
  {
    if ((!this.s) && (this.r) && (this.l != null)) {
      j();
    }
  }
  
  public final boolean h()
  {
    return this.u;
  }
  
  public final boolean i()
  {
    return this.s;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.cf
 * JD-Core Version:    0.7.0.1
 */