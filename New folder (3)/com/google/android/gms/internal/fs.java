package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.a.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fs
  extends dw
  implements b, SafeParcelable
{
  public static final ef CREATOR = new ef();
  private static final HashMap<String, dw.a<?, ?>> a;
  private final Set<Integer> b;
  private final int c;
  private String d;
  private fq e;
  private String f;
  private fq g;
  private String h;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("id", dw.a.d("id", 2));
    a.put("result", dw.a.a("result", 4, fq.class));
    a.put("startDate", dw.a.d("startDate", 5));
    a.put("target", dw.a.a("target", 6, fq.class));
    a.put("type", dw.a.d("type", 7));
  }
  
  public fs()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  fs(Set<Integer> paramSet, int paramInt, String paramString1, fq paramfq1, String paramString2, fq paramfq2, String paramString3)
  {
    this.b = paramSet;
    this.c = paramInt;
    this.d = paramString1;
    this.e = paramfq1;
    this.f = paramString2;
    this.g = paramfq2;
    this.h = paramString3;
  }
  
  protected final boolean a(dw.a parama)
  {
    return this.b.contains(Integer.valueOf(parama.g()));
  }
  
  protected final Object b(dw.a parama)
  {
    switch (parama.g())
    {
    case 3: 
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.g());
    case 2: 
      return this.d;
    case 4: 
      return this.e;
    case 5: 
      return this.f;
    case 6: 
      return this.g;
    }
    return this.h;
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
    if (!(paramObject instanceof fs)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    fs localfs = (fs)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala = (dw.a)localIterator.next();
      if (a(locala))
      {
        if (localfs.a(locala))
        {
          if (!b(locala).equals(localfs.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localfs.a(locala)) {
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
  
  final fq h()
  {
    return this.e;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = a.values().iterator();
    int i = 0;
    dw.a locala;
    if (localIterator.hasNext())
    {
      locala = (dw.a)localIterator.next();
      if (!a(locala)) {
        break label66;
      }
    }
    label66:
    for (int j = i + locala.g() + b(locala).hashCode();; j = i)
    {
      i = j;
      break;
      return i;
    }
  }
  
  public final String i()
  {
    return this.f;
  }
  
  final fq j()
  {
    return this.g;
  }
  
  public final String k()
  {
    return this.h;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ef.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fs
 * JD-Core Version:    0.7.0.1
 */