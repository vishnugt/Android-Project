package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class fv
  extends dw
  implements a, SafeParcelable
{
  public static final eg CREATOR = new eg();
  private static final HashMap<String, dw.a<?, ?>> a;
  private boolean A;
  private final Set<Integer> b;
  private final int c;
  private String d;
  private fv.a e;
  private String f;
  private String g;
  private int h;
  private fv.b i;
  private String j;
  private String k;
  private int l;
  private String m;
  private fv.c n;
  private boolean o;
  private String p;
  private fv.d q;
  private String r;
  private int s;
  private List<fv.f> t;
  private List<fv.g> u;
  private int v;
  private int w;
  private String x;
  private String y;
  private List<fv.h> z;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("aboutMe", dw.a.d("aboutMe", 2));
    a.put("ageRange", dw.a.a("ageRange", 3, fv.a.class));
    a.put("birthday", dw.a.d("birthday", 4));
    a.put("braggingRights", dw.a.d("braggingRights", 5));
    a.put("circledByCount", dw.a.a("circledByCount", 6));
    a.put("cover", dw.a.a("cover", 7, fv.b.class));
    a.put("currentLocation", dw.a.d("currentLocation", 8));
    a.put("displayName", dw.a.d("displayName", 9));
    a.put("gender", dw.a.a("gender", 12, new dt().a("male", 0).a("female", 1).a("other", 2)));
    a.put("id", dw.a.d("id", 14));
    a.put("image", dw.a.a("image", 15, fv.c.class));
    a.put("isPlusUser", dw.a.c("isPlusUser", 16));
    a.put("language", dw.a.d("language", 18));
    a.put("name", dw.a.a("name", 19, fv.d.class));
    a.put("nickname", dw.a.d("nickname", 20));
    a.put("objectType", dw.a.a("objectType", 21, new dt().a("person", 0).a("page", 1)));
    a.put("organizations", dw.a.b("organizations", 22, fv.f.class));
    a.put("placesLived", dw.a.b("placesLived", 23, fv.g.class));
    a.put("plusOneCount", dw.a.a("plusOneCount", 24));
    a.put("relationshipStatus", dw.a.a("relationshipStatus", 25, new dt().a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8)));
    a.put("tagline", dw.a.d("tagline", 26));
    a.put("url", dw.a.d("url", 27));
    a.put("urls", dw.a.b("urls", 28, fv.h.class));
    a.put("verified", dw.a.c("verified", 29));
  }
  
  public fv()
  {
    this.c = 2;
    this.b = new HashSet();
  }
  
  fv(Set<Integer> paramSet, int paramInt1, String paramString1, fv.a parama, String paramString2, String paramString3, int paramInt2, fv.b paramb, String paramString4, String paramString5, int paramInt3, String paramString6, fv.c paramc, boolean paramBoolean1, String paramString7, fv.d paramd, String paramString8, int paramInt4, List<fv.f> paramList, List<fv.g> paramList1, int paramInt5, int paramInt6, String paramString9, String paramString10, List<fv.h> paramList2, boolean paramBoolean2)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = paramString1;
    this.e = parama;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramInt2;
    this.i = paramb;
    this.j = paramString4;
    this.k = paramString5;
    this.l = paramInt3;
    this.m = paramString6;
    this.n = paramc;
    this.o = paramBoolean1;
    this.p = paramString7;
    this.q = paramd;
    this.r = paramString8;
    this.s = paramInt4;
    this.t = paramList;
    this.u = paramList1;
    this.v = paramInt5;
    this.w = paramInt6;
    this.x = paramString9;
    this.y = paramString10;
    this.z = paramList2;
    this.A = paramBoolean2;
  }
  
  public final String A()
  {
    return this.x;
  }
  
  public final String B()
  {
    return this.y;
  }
  
  final List<fv.h> C()
  {
    return this.z;
  }
  
  public final boolean D()
  {
    return this.A;
  }
  
  protected final boolean a(dw.a parama)
  {
    return this.b.contains(Integer.valueOf(parama.g()));
  }
  
  protected final Object b(dw.a parama)
  {
    switch (parama.g())
    {
    case 10: 
    case 11: 
    case 13: 
    case 17: 
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.g());
    case 2: 
      return this.d;
    case 3: 
      return this.e;
    case 4: 
      return this.f;
    case 5: 
      return this.g;
    case 6: 
      return Integer.valueOf(this.h);
    case 7: 
      return this.i;
    case 8: 
      return this.j;
    case 9: 
      return this.k;
    case 12: 
      return Integer.valueOf(this.l);
    case 14: 
      return this.m;
    case 15: 
      return this.n;
    case 16: 
      return Boolean.valueOf(this.o);
    case 18: 
      return this.p;
    case 19: 
      return this.q;
    case 20: 
      return this.r;
    case 21: 
      return Integer.valueOf(this.s);
    case 22: 
      return this.t;
    case 23: 
      return this.u;
    case 24: 
      return Integer.valueOf(this.v);
    case 25: 
      return Integer.valueOf(this.w);
    case 26: 
      return this.x;
    case 27: 
      return this.y;
    case 28: 
      return this.z;
    }
    return Boolean.valueOf(this.A);
  }
  
  public final HashMap<String, dw.a<?, ?>> b()
  {
    return a;
  }
  
  protected final Object c()
  {
    return null;
  }
  
  protected final boolean d()
  {
    return false;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  final Set<Integer> e()
  {
    return this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fv)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    fv localfv = (fv)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala = (dw.a)localIterator.next();
      if (a(locala))
      {
        if (localfv.a(locala))
        {
          if (!b(locala).equals(localfv.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localfv.a(locala)) {
        return false;
      }
    }
    return true;
  }
  
  final int f()
  {
    return this.c;
  }
  
  public final String g()
  {
    return this.d;
  }
  
  final fv.a h()
  {
    return this.e;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = a.values().iterator();
    int i1 = 0;
    dw.a locala;
    if (localIterator.hasNext())
    {
      locala = (dw.a)localIterator.next();
      if (!a(locala)) {
        break label66;
      }
    }
    label66:
    for (int i2 = i1 + locala.g() + b(locala).hashCode();; i2 = i1)
    {
      i1 = i2;
      break;
      return i1;
    }
  }
  
  public final String i()
  {
    return this.f;
  }
  
  public final String j()
  {
    return this.g;
  }
  
  public final int k()
  {
    return this.h;
  }
  
  final fv.b l()
  {
    return this.i;
  }
  
  public final String m()
  {
    return this.j;
  }
  
  public final String n()
  {
    return this.k;
  }
  
  public final int o()
  {
    return this.l;
  }
  
  public final String p()
  {
    return this.m;
  }
  
  final fv.c q()
  {
    return this.n;
  }
  
  public final boolean r()
  {
    return this.o;
  }
  
  public final String s()
  {
    return this.p;
  }
  
  final fv.d t()
  {
    return this.q;
  }
  
  public final String u()
  {
    return this.r;
  }
  
  public final int v()
  {
    return this.s;
  }
  
  final List<fv.f> w()
  {
    return this.t;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    eg.a(this, paramParcel, paramInt);
  }
  
  final List<fv.g> x()
  {
    return this.u;
  }
  
  public final int y()
  {
    return this.v;
  }
  
  public final int z()
  {
    return this.w;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fv
 * JD-Core Version:    0.7.0.1
 */