package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class dw
{
  protected static <O, I> I a(dw.a<I, O> parama, Object paramObject)
  {
    if (dw.a.a(parama) != null) {
      paramObject = parama.a(paramObject);
    }
    return paramObject;
  }
  
  private static void a(StringBuilder paramStringBuilder, dw.a parama, Object paramObject)
  {
    if (parama.b() == 11)
    {
      paramStringBuilder.append(((dw)parama.h().cast(paramObject)).toString());
      return;
    }
    if (parama.b() == 7)
    {
      paramStringBuilder.append("\"");
      paramStringBuilder.append(df.a((String)paramObject));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }
  
  private static void a(StringBuilder paramStringBuilder, dw.a parama, ArrayList<Object> paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = 0;
    int j = paramArrayList.size();
    while (i < j)
    {
      if (i > 0) {
        paramStringBuilder.append(",");
      }
      Object localObject = paramArrayList.get(i);
      if (localObject != null) {
        a(paramStringBuilder, parama, localObject);
      }
      i++;
    }
    paramStringBuilder.append("]");
  }
  
  protected boolean a(dw.a parama)
  {
    if (parama.d() == 11)
    {
      if (parama.e())
      {
        parama.f();
        throw new UnsupportedOperationException("Concrete type arrays not supported");
      }
      parama.f();
      throw new UnsupportedOperationException("Concrete types not supported");
    }
    parama.f();
    return d();
  }
  
  protected Object b(dw.a parama)
  {
    String str1 = parama.f();
    if (parama.h() != null)
    {
      parama.f();
      c();
      cr.a(true, "Concrete field shouldn't be value object: " + parama.f());
      parama.e();
      try
      {
        String str2 = "get" + Character.toUpperCase(str1.charAt(0)) + str1.substring(1);
        Object localObject = getClass().getMethod(str2, new Class[0]).invoke(this, new Object[0]);
        return localObject;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
    }
    parama.f();
    return c();
  }
  
  public abstract HashMap<String, dw.a<?, ?>> b();
  
  protected abstract Object c();
  
  protected abstract boolean d();
  
  public String toString()
  {
    HashMap localHashMap = b();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      dw.a locala = (dw.a)localHashMap.get(str);
      if (a(locala))
      {
        Object localObject = a(locala, b(locala));
        if (localStringBuilder.length() == 0) {
          localStringBuilder.append("{");
        }
        for (;;)
        {
          localStringBuilder.append("\"").append(str).append("\":");
          if (localObject != null) {
            break label134;
          }
          localStringBuilder.append("null");
          break;
          localStringBuilder.append(",");
        }
        label134:
        switch (locala.d())
        {
        default: 
          if (locala.c()) {
            a(localStringBuilder, locala, (ArrayList)localObject);
          }
          break;
        case 8: 
          localStringBuilder.append("\"").append(de.a((byte[])localObject)).append("\"");
          break;
        case 9: 
          localStringBuilder.append("\"").append(de.b((byte[])localObject)).append("\"");
          break;
        case 10: 
          dg.a(localStringBuilder, (HashMap)localObject);
          continue;
          a(localStringBuilder, locala, localObject);
        }
      }
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.append("}");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("{}");
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dw
 * JD-Core Version:    0.7.0.1
 */