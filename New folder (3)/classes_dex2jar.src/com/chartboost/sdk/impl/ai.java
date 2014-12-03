package com.chartboost.sdk.impl;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class ai
{
  private static boolean a = false;
  private static boolean b = false;
  static final Logger f = Logger.getLogger("org.bson.BSON");
  static bf<List<ap>> g = new bf();
  static bf<List<ap>> h = new bf();
  protected static Charset i = Charset.forName("UTF-8");
  static ThreadLocal<ak> j = new ai.1();
  static ThreadLocal<aj> k = new ai.2();
  
  public static Object a(Object paramObject)
  {
    if (!a()) {}
    for (;;)
    {
      return paramObject;
      if ((g.a() != 0) && (paramObject != null))
      {
        List localList = (List)g.a(paramObject.getClass());
        if (localList != null)
        {
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext()) {
            paramObject = ((ap)localIterator.next()).a(paramObject);
          }
        }
      }
    }
  }
  
  public static String a(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    ai.a[] arrayOfa = ai.a.values();
    int m = arrayOfa.length;
    int n = 0;
    int i1 = paramInt;
    for (;;)
    {
      if (n >= m)
      {
        if (i1 <= 0) {
          break;
        }
        throw new IllegalArgumentException("some flags could not be recognized.");
      }
      ai.a locala = arrayOfa[n];
      if ((i1 & locala.j) > 0)
      {
        localStringBuilder.append(locala.k);
        i1 -= locala.j;
      }
      n++;
    }
    return localStringBuilder.toString();
  }
  
  private static boolean a()
  {
    return (a) || (b);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.ai
 * JD-Core Version:    0.7.0.1
 */