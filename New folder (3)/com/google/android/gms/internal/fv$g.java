package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.i;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fv$g
  extends dw
  implements i, SafeParcelable
{
  public static final ep CREATOR = new ep();
  private static final HashMap<String, dw.a<?, ?>> a;
  private final Set<Integer> b;
  private final int c;
  private boolean d;
  private String e;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("primary", dw.a.c("primary", 2));
    a.put("value", dw.a.d("value", 3));
  }
  
  public fv$g()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  fv$g(Set<Integer> paramSet, int paramInt, boolean paramBoolean, String paramString)
  {
    this.b = paramSet;
    this.c = paramInt;
    this.d = paramBoolean;
    this.e = paramString;
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
      return Boolean.valueOf(this.d);
    }
    return this.e;
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
    if (!(paramObject instanceof g)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    g localg = (g)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala = (dw.a)localIterator.next();
      if (a(locala))
      {
        if (localg.a(locala))
        {
          if (!b(locala).equals(localg.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localg.a(locala)) {
        return false;
      }
    }
    return true;
  }
  
  final int f()
  {
    return this.c;
  }
  
  public final boolean g()
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
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ep.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fv.g
 * JD-Core Version:    0.7.0.1
 */