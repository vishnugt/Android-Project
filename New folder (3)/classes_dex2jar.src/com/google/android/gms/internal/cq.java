package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class cq
{
  private final List<String> a;
  private final Object b;
  
  private cq(Object paramObject)
  {
    this.b = cr.a(paramObject);
    this.a = new ArrayList();
  }
  
  public final cq a(String paramString, Object paramObject)
  {
    this.a.add((String)cr.a(paramString) + "=" + String.valueOf(paramObject));
    return this;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append((String)this.a.get(j));
      if (j < i - 1) {
        localStringBuilder.append(", ");
      }
    }
    return '}';
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cq
 * JD-Core Version:    0.7.0.1
 */