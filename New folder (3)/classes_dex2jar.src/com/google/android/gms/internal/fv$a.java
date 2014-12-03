package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fv$a
  extends dw
  implements b, SafeParcelable
{
  public static final eh CREATOR = new eh();
  private static final HashMap<String, dw.a<?, ?>> a;
  private final Set<Integer> b;
  private final int c;
  private int d;
  private int e;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("max", dw.a.a("max", 2));
    a.put("min", dw.a.a("min", 3));
  }
  
  public fv$a()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  fv$a(Set<Integer> paramSet, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
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
    }
    return Integer.valueOf(this.e);
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
    if (!(paramObject instanceof a)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    a locala = (a)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala1 = (dw.a)localIterator.next();
      if (a(locala1))
      {
        if (locala.a(locala1))
        {
          if (!b(locala1).equals(locala.b(locala1))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (locala.a(locala1)) {
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
  
  public final int h()
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
    eh.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fv.a
 * JD-Core Version:    0.7.0.1
 */