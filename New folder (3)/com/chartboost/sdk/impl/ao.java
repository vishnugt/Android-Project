package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

public class ao
  extends LinkedHashMap<String, Object>
  implements al
{
  public ao() {}
  
  public ao(String paramString, Object paramObject)
  {
    a(paramString, paramObject);
  }
  
  public Object a(String paramString)
  {
    return super.get(paramString);
  }
  
  public Object a(String paramString, Object paramObject)
  {
    return super.put(paramString, paramObject);
  }
  
  public boolean b(String paramString)
  {
    return super.containsKey(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof al)) {
      return false;
    }
    al localal = (al)paramObject;
    if (!keySet().equals(localal.keySet())) {
      return false;
    }
    Iterator localIterator = keySet().iterator();
    Object localObject1;
    Object localObject2;
    do
    {
      Pattern localPattern1;
      Pattern localPattern2;
      do
      {
        do
        {
          do
          {
            if (!localIterator.hasNext()) {
              return true;
            }
            String str = (String)localIterator.next();
            localObject1 = a(str);
            localObject2 = localal.a(str);
            if ((localObject1 == null) && (localObject2 != null)) {
              return false;
            }
            if (localObject2 != null) {
              break;
            }
          } while (localObject1 == null);
          return false;
          if ((!(localObject1 instanceof Number)) || (!(localObject2 instanceof Number))) {
            break;
          }
        } while (((Number)localObject1).doubleValue() == ((Number)localObject2).doubleValue());
        return false;
        if ((!(localObject1 instanceof Pattern)) || (!(localObject2 instanceof Pattern))) {
          break;
        }
        localPattern1 = (Pattern)localObject1;
        localPattern2 = (Pattern)localObject2;
      } while ((localPattern1.pattern().equals(localPattern2.pattern())) && (localPattern1.flags() == localPattern2.flags()));
      return false;
    } while (localObject1.equals(localObject2));
    return false;
  }
  
  public void putAll(Map paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      a(localEntry.getKey().toString(), localEntry.getValue());
    }
  }
  
  public String toString()
  {
    return ae.a(this);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.ao
 * JD-Core Version:    0.7.0.1
 */