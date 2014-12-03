package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fv$b
  extends dw
  implements c, SafeParcelable
{
  public static final ei CREATOR = new ei();
  private static final HashMap<String, dw.a<?, ?>> a;
  private final Set<Integer> b;
  private final int c;
  private fv.b.a d;
  private fv.b.b e;
  private int f;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("coverInfo", dw.a.a("coverInfo", 2, fv.b.a.class));
    a.put("coverPhoto", dw.a.a("coverPhoto", 3, fv.b.b.class));
    a.put("layout", dw.a.a("layout", 4, new dt().a("banner", 0)));
  }
  
  public fv$b()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  fv$b(Set<Integer> paramSet, int paramInt1, fv.b.a parama, fv.b.b paramb, int paramInt2)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = parama;
    this.e = paramb;
    this.f = paramInt2;
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
  
  final fv.b.a g()
  {
    return this.d;
  }
  
  final fv.b.b h()
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
    ei.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fv.b
 * JD-Core Version:    0.7.0.1
 */