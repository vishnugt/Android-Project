package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.j;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fv$h
  extends dw
  implements j, SafeParcelable
{
  public static final eq CREATOR = new eq();
  private static final HashMap<String, dw.a<?, ?>> a;
  private final Set<Integer> b;
  private final int c;
  private String d;
  private final int e = 4;
  private int f;
  private String g;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("label", dw.a.d("label", 5));
    a.put("type", dw.a.a("type", 6, new dt().a("home", 0).a("work", 1).a("blog", 2).a("profile", 3).a("other", 4).a("otherProfile", 5).a("contributor", 6).a("website", 7)));
    a.put("value", dw.a.d("value", 4));
  }
  
  public fv$h()
  {
    this.c = 2;
    this.b = new HashSet();
  }
  
  fv$h(Set<Integer> paramSet, int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = paramString1;
    this.f = paramInt2;
    this.g = paramString2;
  }
  
  @Deprecated
  public static int h()
  {
    return 4;
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
    case 5: 
      return this.d;
    case 6: 
      return Integer.valueOf(this.f);
    }
    return this.g;
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
    if (!(paramObject instanceof h)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    h localh = (h)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala = (dw.a)localIterator.next();
      if (a(locala))
      {
        if (localh.a(locala))
        {
          if (!b(locala).equals(localh.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localh.a(locala)) {
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
  
  public final int i()
  {
    return this.f;
  }
  
  public final String j()
  {
    return this.g;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    eq.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fv.h
 * JD-Core Version:    0.7.0.1
 */