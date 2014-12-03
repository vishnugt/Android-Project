package com.chartboost.sdk.Libraries;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a
{
  private Map<String, a.a> a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5F, true));
  private long b = 0L;
  private long c = 1000000L;
  
  public a()
  {
    a((int)(0.15F * (float)Runtime.getRuntime().maxMemory()));
  }
  
  private static long a(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return 0L;
    }
    return paramBitmap.getRowBytes() * paramBitmap.getHeight();
  }
  
  private void b()
  {
    Iterator localIterator;
    if (this.b > this.c) {
      localIterator = this.a.entrySet().iterator();
    }
    for (;;)
    {
      if (!localIterator.hasNext()) {}
      do
      {
        return;
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        this.b -= a(((a.a)localEntry.getValue()).b());
        localIterator.remove();
      } while (this.b <= this.c);
    }
  }
  
  public a.a a(String paramString)
  {
    if (!this.a.containsKey(paramString)) {
      return null;
    }
    return (a.a)this.a.get(paramString);
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(String paramString, a.a parama)
  {
    try
    {
      if (this.a.containsKey(paramString)) {
        this.b -= a(((a.a)this.a.get(paramString)).b());
      }
      this.a.put(paramString, parama);
      this.b += a(parama.b());
      b();
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.a
 * JD-Core Version:    0.7.0.1
 */