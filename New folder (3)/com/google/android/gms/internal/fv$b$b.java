package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fv$b$b
  extends dw
  implements e, SafeParcelable
{
  public static final ek CREATOR = new ek();
  private static final HashMap<String, dw.a<?, ?>> a;
  private final Set<Integer> b;
  private final int c;
  private int d;
  private String e;
  private int f;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("height", dw.a.a("height", 2));
    a.put("url", dw.a.d("url", 3));
    a.put("width", dw.a.a("width", 4));
  }
  
  public fv$b$b()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  fv$b$b(Set<Integer> paramSet, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramString;
    this.f = paramInt3;
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
      return Integer.valueOf(this.d);
    case 3: 
      return this.e;
    }
    return Integer.valueOf(this.f);
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
    if (!(paramObject instanceof b)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    b localb = (b)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala = (dw.a)localIterator.next();
      if (a(locala))
      {
        if (localb.a(locala))
        {
          if (!b(locala).equals(localb.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localb.a(locala)) {
        return false;
      }
    }
    return true;
  }
  
  final int f()
  {
    return this.c;
  }
  
  public final int g()
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
  
  public final int i()
  {
    return this.f;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ek.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fv.b.b
 * JD-Core Version:    0.7.0.1
 */