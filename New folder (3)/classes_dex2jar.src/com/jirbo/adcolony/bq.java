package com.jirbo.adcolony;

import java.util.ArrayList;

final class bq
{
  String a;
  int b;
  int c;
  int d;
  boolean e;
  boolean f;
  ArrayList<String> g;
  br h;
  ax i;
  bs j;
  dj k;
  
  private static int a(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0) {
      paramInt2 = 0;
    }
    while ((paramInt1 == -1) || (paramInt1 >= paramInt2)) {
      return paramInt2;
    }
    return paramInt1;
  }
  
  /* Error */
  private int a(au paramau)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: getstatic 35	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   7: getfield 40	com/jirbo/adcolony/g:h	Lcom/jirbo/adcolony/ca;
    //   10: aload_0
    //   11: getfield 42	com/jirbo/adcolony/bq:a	Ljava/lang/String;
    //   14: ldc2_w 43
    //   17: invokevirtual 49	com/jirbo/adcolony/ca:a	(Ljava/lang/String;D)I
    //   20: istore 4
    //   22: aload_1
    //   23: getfield 55	com/jirbo/adcolony/au:o	Lcom/jirbo/adcolony/bf;
    //   26: getfield 59	com/jirbo/adcolony/bf:g	I
    //   29: istore 5
    //   31: iload 5
    //   33: ifeq +49 -> 82
    //   36: getstatic 62	com/jirbo/adcolony/a:I	J
    //   39: lconst_0
    //   40: lcmp
    //   41: ifeq +41 -> 82
    //   44: invokestatic 68	java/lang/System:currentTimeMillis	()J
    //   47: getstatic 62	com/jirbo/adcolony/a:I	J
    //   50: lsub
    //   51: ldc2_w 69
    //   54: ldiv
    //   55: iload 5
    //   57: i2l
    //   58: lcmp
    //   59: iflt +23 -> 82
    //   62: invokestatic 72	com/jirbo/adcolony/bq:c	()V
    //   65: getstatic 77	com/jirbo/adcolony/aq:c	Lcom/jirbo/adcolony/aq;
    //   68: ldc 79
    //   70: invokevirtual 82	com/jirbo/adcolony/aq:c	(Ljava/lang/String;)I
    //   73: istore 20
    //   75: iload 20
    //   77: istore_2
    //   78: aload_0
    //   79: monitorexit
    //   80: iload_2
    //   81: ireturn
    //   82: aload_1
    //   83: getfield 55	com/jirbo/adcolony/au:o	Lcom/jirbo/adcolony/bf;
    //   86: getfield 84	com/jirbo/adcolony/bf:h	I
    //   89: istore 6
    //   91: iload 6
    //   93: ifle +36 -> 129
    //   96: iconst_m1
    //   97: iload 6
    //   99: getstatic 35	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   102: getfield 40	com/jirbo/adcolony/g:h	Lcom/jirbo/adcolony/ca;
    //   105: aload_1
    //   106: getfield 86	com/jirbo/adcolony/au:d	I
    //   109: invokestatic 68	java/lang/System:currentTimeMillis	()J
    //   112: getstatic 62	com/jirbo/adcolony/a:I	J
    //   115: lsub
    //   116: ldc2_w 69
    //   119: ldiv
    //   120: l2d
    //   121: invokevirtual 89	com/jirbo/adcolony/ca:a	(ID)I
    //   124: isub
    //   125: invokestatic 91	com/jirbo/adcolony/bq:a	(II)I
    //   128: istore_2
    //   129: iload_2
    //   130: ifne +23 -> 153
    //   133: iload 6
    //   135: ifeq +18 -> 153
    //   138: invokestatic 72	com/jirbo/adcolony/bq:c	()V
    //   141: getstatic 77	com/jirbo/adcolony/aq:c	Lcom/jirbo/adcolony/aq;
    //   144: ldc 93
    //   146: invokevirtual 82	com/jirbo/adcolony/aq:c	(Ljava/lang/String;)I
    //   149: istore_2
    //   150: goto -72 -> 78
    //   153: aload_0
    //   154: getfield 95	com/jirbo/adcolony/bq:c	I
    //   157: istore 7
    //   159: iload 7
    //   161: ifle +13 -> 174
    //   164: iload_2
    //   165: iload 7
    //   167: iload 4
    //   169: isub
    //   170: invokestatic 91	com/jirbo/adcolony/bq:a	(II)I
    //   173: istore_2
    //   174: iload_2
    //   175: ifne +32 -> 207
    //   178: getstatic 77	com/jirbo/adcolony/aq:c	Lcom/jirbo/adcolony/aq;
    //   181: new 97	java/lang/StringBuilder
    //   184: dup
    //   185: ldc 99
    //   187: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   190: aload_0
    //   191: getfield 42	com/jirbo/adcolony/bq:a	Ljava/lang/String;
    //   194: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   200: invokevirtual 82	com/jirbo/adcolony/aq:c	(Ljava/lang/String;)I
    //   203: istore_2
    //   204: goto -126 -> 78
    //   207: aload_0
    //   208: getfield 111	com/jirbo/adcolony/bq:d	I
    //   211: istore 8
    //   213: iload 8
    //   215: ifle +24 -> 239
    //   218: iload_2
    //   219: iload 8
    //   221: getstatic 35	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   224: getfield 40	com/jirbo/adcolony/g:h	Lcom/jirbo/adcolony/ca;
    //   227: aload_0
    //   228: getfield 42	com/jirbo/adcolony/bq:a	Ljava/lang/String;
    //   231: invokevirtual 113	com/jirbo/adcolony/ca:a	(Ljava/lang/String;)I
    //   234: isub
    //   235: invokestatic 91	com/jirbo/adcolony/bq:a	(II)I
    //   238: istore_2
    //   239: iload_2
    //   240: ifne +32 -> 272
    //   243: getstatic 77	com/jirbo/adcolony/aq:c	Lcom/jirbo/adcolony/aq;
    //   246: new 97	java/lang/StringBuilder
    //   249: dup
    //   250: ldc 115
    //   252: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   255: aload_0
    //   256: getfield 42	com/jirbo/adcolony/bq:a	Ljava/lang/String;
    //   259: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   265: invokevirtual 82	com/jirbo/adcolony/aq:c	(Ljava/lang/String;)I
    //   268: istore_2
    //   269: goto -191 -> 78
    //   272: aload_0
    //   273: getfield 117	com/jirbo/adcolony/bq:j	Lcom/jirbo/adcolony/bs;
    //   276: getfield 121	com/jirbo/adcolony/bs:a	Z
    //   279: ifeq +115 -> 394
    //   282: aload_0
    //   283: getfield 117	com/jirbo/adcolony/bq:j	Lcom/jirbo/adcolony/bs;
    //   286: getfield 124	com/jirbo/adcolony/bs:b	Lcom/jirbo/adcolony/bo;
    //   289: getfield 128	com/jirbo/adcolony/bo:a	I
    //   292: istore 17
    //   294: iload 17
    //   296: ifle +13 -> 309
    //   299: iload_2
    //   300: iload 17
    //   302: iload 4
    //   304: isub
    //   305: invokestatic 91	com/jirbo/adcolony/bq:a	(II)I
    //   308: istore_2
    //   309: iload_2
    //   310: ifne +15 -> 325
    //   313: getstatic 77	com/jirbo/adcolony/aq:c	Lcom/jirbo/adcolony/aq;
    //   316: ldc 130
    //   318: invokevirtual 82	com/jirbo/adcolony/aq:c	(Ljava/lang/String;)I
    //   321: istore_2
    //   322: goto -244 -> 78
    //   325: aload_0
    //   326: getfield 117	com/jirbo/adcolony/bq:j	Lcom/jirbo/adcolony/bs;
    //   329: getfield 124	com/jirbo/adcolony/bs:b	Lcom/jirbo/adcolony/bo;
    //   332: getfield 131	com/jirbo/adcolony/bo:c	I
    //   335: istore 18
    //   337: aload_0
    //   338: getfield 117	com/jirbo/adcolony/bq:j	Lcom/jirbo/adcolony/bs;
    //   341: getfield 124	com/jirbo/adcolony/bs:b	Lcom/jirbo/adcolony/bo;
    //   344: getfield 133	com/jirbo/adcolony/bo:b	I
    //   347: istore 19
    //   349: iload 19
    //   351: ifle +27 -> 378
    //   354: iload_2
    //   355: iload 19
    //   357: getstatic 35	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   360: getfield 40	com/jirbo/adcolony/g:h	Lcom/jirbo/adcolony/ca;
    //   363: aload_0
    //   364: getfield 42	com/jirbo/adcolony/bq:a	Ljava/lang/String;
    //   367: iload 18
    //   369: i2d
    //   370: invokevirtual 49	com/jirbo/adcolony/ca:a	(Ljava/lang/String;D)I
    //   373: isub
    //   374: invokestatic 91	com/jirbo/adcolony/bq:a	(II)I
    //   377: istore_2
    //   378: iload_2
    //   379: ifne +15 -> 394
    //   382: getstatic 77	com/jirbo/adcolony/aq:c	Lcom/jirbo/adcolony/aq;
    //   385: ldc 135
    //   387: invokevirtual 82	com/jirbo/adcolony/aq:c	(Ljava/lang/String;)I
    //   390: istore_2
    //   391: goto -313 -> 78
    //   394: aload_1
    //   395: getfield 86	com/jirbo/adcolony/au:d	I
    //   398: istore 9
    //   400: aload_1
    //   401: getfield 55	com/jirbo/adcolony/au:o	Lcom/jirbo/adcolony/bf;
    //   404: getfield 136	com/jirbo/adcolony/bf:a	I
    //   407: istore 10
    //   409: iload 10
    //   411: ifle +25 -> 436
    //   414: iload_2
    //   415: iload 10
    //   417: getstatic 35	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   420: getfield 40	com/jirbo/adcolony/g:h	Lcom/jirbo/adcolony/ca;
    //   423: iload 9
    //   425: ldc2_w 43
    //   428: invokevirtual 89	com/jirbo/adcolony/ca:a	(ID)I
    //   431: isub
    //   432: invokestatic 91	com/jirbo/adcolony/bq:a	(II)I
    //   435: istore_2
    //   436: iload_2
    //   437: ifne +18 -> 455
    //   440: invokestatic 72	com/jirbo/adcolony/bq:c	()V
    //   443: getstatic 77	com/jirbo/adcolony/aq:c	Lcom/jirbo/adcolony/aq;
    //   446: ldc 138
    //   448: invokevirtual 82	com/jirbo/adcolony/aq:c	(Ljava/lang/String;)I
    //   451: istore_2
    //   452: goto -374 -> 78
    //   455: aload_1
    //   456: getfield 55	com/jirbo/adcolony/au:o	Lcom/jirbo/adcolony/bf;
    //   459: getfield 140	com/jirbo/adcolony/bf:f	I
    //   462: istore 11
    //   464: iload 11
    //   466: ifle +25 -> 491
    //   469: iload_2
    //   470: iload 11
    //   472: getstatic 35	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   475: getfield 40	com/jirbo/adcolony/g:h	Lcom/jirbo/adcolony/ca;
    //   478: iload 9
    //   480: ldc2_w 141
    //   483: invokevirtual 89	com/jirbo/adcolony/ca:a	(ID)I
    //   486: isub
    //   487: invokestatic 91	com/jirbo/adcolony/bq:a	(II)I
    //   490: istore_2
    //   491: iload_2
    //   492: ifne +18 -> 510
    //   495: invokestatic 72	com/jirbo/adcolony/bq:c	()V
    //   498: getstatic 77	com/jirbo/adcolony/aq:c	Lcom/jirbo/adcolony/aq;
    //   501: ldc 144
    //   503: invokevirtual 82	com/jirbo/adcolony/aq:c	(Ljava/lang/String;)I
    //   506: istore_2
    //   507: goto -429 -> 78
    //   510: aload_1
    //   511: getfield 55	com/jirbo/adcolony/au:o	Lcom/jirbo/adcolony/bf;
    //   514: getfield 146	com/jirbo/adcolony/bf:e	I
    //   517: istore 12
    //   519: iload 12
    //   521: ifle +25 -> 546
    //   524: iload_2
    //   525: iload 12
    //   527: getstatic 35	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   530: getfield 40	com/jirbo/adcolony/g:h	Lcom/jirbo/adcolony/ca;
    //   533: iload 9
    //   535: ldc2_w 147
    //   538: invokevirtual 89	com/jirbo/adcolony/ca:a	(ID)I
    //   541: isub
    //   542: invokestatic 91	com/jirbo/adcolony/bq:a	(II)I
    //   545: istore_2
    //   546: iload_2
    //   547: ifne +18 -> 565
    //   550: invokestatic 72	com/jirbo/adcolony/bq:c	()V
    //   553: getstatic 77	com/jirbo/adcolony/aq:c	Lcom/jirbo/adcolony/aq;
    //   556: ldc 150
    //   558: invokevirtual 82	com/jirbo/adcolony/aq:c	(Ljava/lang/String;)I
    //   561: istore_2
    //   562: goto -484 -> 78
    //   565: aload_1
    //   566: getfield 55	com/jirbo/adcolony/au:o	Lcom/jirbo/adcolony/bf;
    //   569: getfield 151	com/jirbo/adcolony/bf:d	I
    //   572: istore 13
    //   574: iload 13
    //   576: ifle +25 -> 601
    //   579: iload_2
    //   580: iload 13
    //   582: getstatic 35	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   585: getfield 40	com/jirbo/adcolony/g:h	Lcom/jirbo/adcolony/ca;
    //   588: iload 9
    //   590: ldc2_w 152
    //   593: invokevirtual 89	com/jirbo/adcolony/ca:a	(ID)I
    //   596: isub
    //   597: invokestatic 91	com/jirbo/adcolony/bq:a	(II)I
    //   600: istore_2
    //   601: iload_2
    //   602: ifne +18 -> 620
    //   605: invokestatic 72	com/jirbo/adcolony/bq:c	()V
    //   608: getstatic 77	com/jirbo/adcolony/aq:c	Lcom/jirbo/adcolony/aq;
    //   611: ldc 155
    //   613: invokevirtual 82	com/jirbo/adcolony/aq:c	(Ljava/lang/String;)I
    //   616: istore_2
    //   617: goto -539 -> 78
    //   620: aload_1
    //   621: getfield 55	com/jirbo/adcolony/au:o	Lcom/jirbo/adcolony/bf;
    //   624: getfield 156	com/jirbo/adcolony/bf:c	I
    //   627: istore 14
    //   629: aload_1
    //   630: getfield 55	com/jirbo/adcolony/au:o	Lcom/jirbo/adcolony/bf;
    //   633: getfield 157	com/jirbo/adcolony/bf:b	I
    //   636: istore 15
    //   638: iload 15
    //   640: ifle -562 -> 78
    //   643: iload_2
    //   644: iload 15
    //   646: getstatic 35	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   649: getfield 40	com/jirbo/adcolony/g:h	Lcom/jirbo/adcolony/ca;
    //   652: iload 9
    //   654: iload 14
    //   656: i2d
    //   657: invokevirtual 89	com/jirbo/adcolony/ca:a	(ID)I
    //   660: isub
    //   661: invokestatic 91	com/jirbo/adcolony/bq:a	(II)I
    //   664: istore 16
    //   666: iload 16
    //   668: istore_2
    //   669: goto -591 -> 78
    //   672: astore_3
    //   673: aload_0
    //   674: monitorexit
    //   675: aload_3
    //   676: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	677	0	this	bq
    //   0	677	1	paramau	au
    //   1	668	2	m	int
    //   672	4	3	localObject	Object
    //   20	285	4	n	int
    //   29	27	5	i1	int
    //   89	45	6	i2	int
    //   157	13	7	i3	int
    //   211	24	8	i4	int
    //   398	255	9	i5	int
    //   407	25	10	i6	int
    //   462	25	11	i7	int
    //   517	25	12	i8	int
    //   572	25	13	i9	int
    //   627	28	14	i10	int
    //   636	25	15	i11	int
    //   664	3	16	i12	int
    //   292	13	17	i13	int
    //   335	33	18	i14	int
    //   347	27	19	i15	int
    //   73	3	20	i16	int
    // Exception table:
    //   from	to	target	type
    //   4	31	672	finally
    //   36	75	672	finally
    //   82	91	672	finally
    //   96	129	672	finally
    //   138	150	672	finally
    //   153	159	672	finally
    //   164	174	672	finally
    //   178	204	672	finally
    //   207	213	672	finally
    //   218	239	672	finally
    //   243	269	672	finally
    //   272	294	672	finally
    //   299	309	672	finally
    //   313	322	672	finally
    //   325	349	672	finally
    //   354	378	672	finally
    //   382	391	672	finally
    //   394	409	672	finally
    //   414	436	672	finally
    //   440	452	672	finally
    //   455	464	672	finally
    //   469	491	672	finally
    //   495	507	672	finally
    //   510	519	672	finally
    //   524	546	672	finally
    //   550	562	672	finally
    //   565	574	672	finally
    //   579	601	672	finally
    //   605	617	672	finally
    //   620	638	672	finally
    //   643	666	672	finally
  }
  
  private static void c()
  {
    a.c.b.a();
  }
  
  final au a()
  {
    ax localax = this.i;
    String str = (String)this.g.get(this.k.c % this.g.size());
    for (int m = 0; m < localax.a.size(); m++)
    {
      au localau = (au)localax.a.get(m);
      if (localau.a.equals(str)) {
        return localau;
      }
    }
    return null;
  }
  
  final boolean a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if ((!this.e) || (!this.f)) {}
      while ((this.i.a.size() == 0) || (this.i.a().r.a)) {
        return false;
      }
      return true;
    }
    if ((!this.e) || (!this.f)) {
      return aq.c.b("Ad is not ready, as zone " + this.a + " is disabled or inactive.");
    }
    if (this.i.a.size() == 0) {
      return aq.c.b("Ad is not ready, as there are currently no ads to play in zone " + this.a + ".");
    }
    if (this.i.a().r.a) {
      return aq.c.b("Ad is not ready, as zone " + this.a + " is V4VC enabled and must be played using an AdColonyV4VCAd object.");
    }
    return true;
  }
  
  final boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!paramBoolean2)
    {
      if (!paramBoolean1) {
        a.j();
      }
      if ((!this.e) || (!this.f)) {}
      while ((this.i.a.size() == 0) || (this.g.size() == 0)) {
        return false;
      }
      int i1 = this.g.size();
      for (int i2 = 0;; i2++)
      {
        Object localObject = null;
        if (i2 < i1)
        {
          au localau2 = a();
          if (localau2 == null) {
            break;
          }
          if (!localau2.a()) {
            break label111;
          }
          localObject = localau2;
        }
        if ((localObject == null) || (a(localObject) == 0)) {
          break;
        }
        return true;
        label111:
        b();
      }
    }
    if ((!this.e) || (!this.f)) {
      return aq.c.b("Ad is not ready to be played, as zone " + this.a + " is disabled or inactive.");
    }
    if ((this.i.a.size() == 0) || (this.g.size() == 0)) {
      return aq.c.b("Ad is not ready to be played, as AdColony currently has no videos available to be played in zone " + this.a + ".");
    }
    int m = this.g.size();
    int n = 0;
    label231:
    au localau1;
    if (n < m)
    {
      localau1 = a();
      if (localau1 == null) {
        return aq.c.b("Ad is not ready to be played due to an unknown error.");
      }
      if (!localau1.a()) {}
    }
    for (;;)
    {
      if (localau1 == null)
      {
        return aq.c.b("Ad is not ready to be played as required assets are still downloading or otherwise missing.");
        b();
        n++;
        break label231;
      }
      if (a(localau1) == 0) {
        break;
      }
      return true;
      localau1 = null;
    }
  }
  
  final void b()
  {
    this.k.c = ((1 + this.k.c) % this.g.size());
  }
  
  final boolean b(boolean paramBoolean)
  {
    boolean bool = true;
    if (!paramBoolean) {
      if ((!this.e) || (!this.f)) {
        bool = false;
      }
    }
    do
    {
      do
      {
        return bool;
      } while ((this.i.a.size() != 0) && (this.i.a().r.a));
      return false;
      if ((!this.e) || (!this.f)) {
        return aq.c.b("Ad is not ready, as zone " + this.a + " is disabled or inactive.");
      }
      if (this.i.a.size() == 0) {
        return aq.c.b("Ad is not ready, as there are currently no ads to play in zone " + this.a + ".");
      }
    } while (this.i.a().r.a);
    return aq.c.b("Ad is not ready, as zone " + this.a + " is not V4VC enabled and must be played using an AdColonyVideoAd object.");
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.bq
 * JD-Core Version:    0.7.0.1
 */