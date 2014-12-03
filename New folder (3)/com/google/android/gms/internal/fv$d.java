package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.g;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fv$d
  extends dw
  implements g, SafeParcelable
{
  public static final em CREATOR = new em();
  private static final HashMap<String, dw.a<?, ?>> a;
  private final Set<Integer> b;
  private final int c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("familyName", dw.a.d("familyName", 2));
    a.put("formatted", dw.a.d("formatted", 3));
    a.put("givenName", dw.a.d("givenName", 4));
    a.put("honorificPrefix", dw.a.d("honorificPrefix", 5));
    a.put("honorificSuffix", dw.a.d("honorificSuffix", 6));
    a.put("middleName", dw.a.d("middleName", 7));
  }
  
  public fv$d()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  fv$d(Set<Integer> paramSet, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.b = paramSet;
    this.c = paramInt;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
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
    }
    return this.i;
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
    if (!(paramObject instanceof d)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    d locald = (d)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala = (dw.a)localIterator.next();
      if (a(locala))
      {
        if (locald.a(locala))
        {
          if (!b(locala).equals(locald.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (locald.a(locala)) {
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
    int j = 0;
    dw.a locala;
    if (localIterator.hasNext())
    {
      locala = (dw.a)localIterator.next();
      if (!a(locala)) {
        break label66;
      }
    }
    label66:
    for (int k = j + locala.g() + b(locala).hashCode();; k = j)
    {
      j = k;
      break;
      return j;
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
  
  public final String l()
  {
    return this.i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    em.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fv.d
 * JD-Core Version:    0.7.0.1
 */