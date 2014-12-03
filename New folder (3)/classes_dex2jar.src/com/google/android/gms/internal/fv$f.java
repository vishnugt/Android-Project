package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.h;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fv$f
  extends dw
  implements h, SafeParcelable
{
  public static final eo CREATOR = new eo();
  private static final HashMap<String, dw.a<?, ?>> a;
  private final Set<Integer> b;
  private final int c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private boolean i;
  private String j;
  private String k;
  private int l;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("department", dw.a.d("department", 2));
    a.put("description", dw.a.d("description", 3));
    a.put("endDate", dw.a.d("endDate", 4));
    a.put("location", dw.a.d("location", 5));
    a.put("name", dw.a.d("name", 6));
    a.put("primary", dw.a.c("primary", 7));
    a.put("startDate", dw.a.d("startDate", 8));
    a.put("title", dw.a.d("title", 9));
    a.put("type", dw.a.a("type", 10, new dt().a("work", 0).a("school", 1)));
  }
  
  public fv$f()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  fv$f(Set<Integer> paramSet, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, String paramString6, String paramString7, int paramInt2)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramBoolean;
    this.j = paramString6;
    this.k = paramString7;
    this.l = paramInt2;
  }
  
  protected final boolean a(dw.a parama)
  {
    return this.b.contains(Integer.valueOf(parama.g()));
  }
  
  protected final Object b(dw.a parama)
  {
    switch (parama.g())
    {
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
      return this.h;
    case 7: 
      return Boolean.valueOf(this.i);
    case 8: 
      return this.j;
    case 9: 
      return this.k;
    }
    return Integer.valueOf(this.l);
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
    if (!(paramObject instanceof f)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    f localf = (f)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala = (dw.a)localIterator.next();
      if (a(locala))
      {
        if (localf.a(locala))
        {
          if (!b(locala).equals(localf.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localf.a(locala)) {
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
  
  public final String h()
  {
    return this.e;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = a.values().iterator();
    int m = 0;
    dw.a locala;
    if (localIterator.hasNext())
    {
      locala = (dw.a)localIterator.next();
      if (!a(locala)) {
        break label66;
      }
    }
    label66:
    for (int n = m + locala.g() + b(locala).hashCode();; n = m)
    {
      m = n;
      break;
      return m;
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
  
  public final String k()
  {
    return this.h;
  }
  
  public final boolean l()
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
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    eo.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fv.f
 * JD-Core Version:    0.7.0.1
 */