package com.chartboost.sdk.impl;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class an
  implements ak
{
  protected ar a;
  
  private void a(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    a((byte)5, paramString);
    int i = paramArrayOfByte.length;
    if (paramInt == 2) {
      i += 4;
    }
    this.a.c(i);
    this.a.write(paramInt);
    if (paramInt == 2) {
      this.a.c(i - 4);
    }
    int j = this.a.a();
    this.a.write(paramArrayOfByte);
    ag.a(this.a.a() - j, paramArrayOfByte.length);
  }
  
  private void a(String paramString, Iterable paramIterable)
  {
    a((byte)4, paramString);
    int i = this.a.a();
    this.a.c(0);
    Iterator localIterator = paramIterable.iterator();
    for (int j = 0;; j++)
    {
      if (!localIterator.hasNext())
      {
        this.a.write(0);
        this.a.a(i, this.a.a() - i);
        return;
      }
      Object localObject = localIterator.next();
      b(String.valueOf(j), localObject);
    }
  }
  
  private void a(String paramString1, String paramString2, byte paramByte)
  {
    a(paramByte, paramString1);
    b(paramString2);
  }
  
  private void a(String paramString, Map paramMap)
  {
    a((byte)3, paramString);
    int i = this.a.a();
    this.a.c(0);
    Iterator localIterator = paramMap.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        this.a.write(0);
        this.a.a(i, this.a.a() - i);
        return;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      b(localEntry.getKey().toString(), localEntry.getValue());
    }
  }
  
  private void a(String paramString, Pattern paramPattern)
  {
    a((byte)11, paramString);
    c(paramPattern.pattern());
    c(ai.a(paramPattern.flags()));
  }
  
  private void c(String paramString, Object paramObject)
  {
    a((byte)4, paramString);
    int i = this.a.a();
    this.a.c(0);
    int j = Array.getLength(paramObject);
    for (int k = 0;; k++)
    {
      if (k >= j)
      {
        this.a.write(0);
        this.a.a(i, this.a.a() - i);
        return;
      }
      b(String.valueOf(k), Array.get(paramObject, k));
    }
  }
  
  private void d(String paramString)
  {
    a((byte)-1, paramString);
  }
  
  private void e(String paramString)
  {
    a((byte)127, paramString);
  }
  
  public void a()
  {
    this.a = null;
  }
  
  protected void a(byte paramByte, String paramString)
  {
    this.a.write(paramByte);
    c(paramString);
  }
  
  public void a(ar paramar)
  {
    if (this.a != null) {
      throw new IllegalStateException("in the middle of something");
    }
    this.a = paramar;
  }
  
  protected void a(String paramString)
  {
    a((byte)10, paramString);
  }
  
  protected void a(String paramString, au paramau)
  {
    a((byte)17, paramString);
    this.a.c(paramau.b());
    this.a.c(paramau.a());
  }
  
  protected void a(String paramString, av paramav)
  {
    a(paramString, paramav.a(), paramav.b());
  }
  
  protected void a(String paramString, aw paramaw)
  {
    a((byte)13, paramString);
    this.a.a();
    b(paramaw.a());
  }
  
  protected void a(String paramString, ax paramax)
  {
    a((byte)15, paramString);
    int i = this.a.a();
    this.a.c(0);
    b(paramax.a());
    b(paramax.b());
    this.a.a(i, this.a.a() - i);
  }
  
  protected void a(String paramString, ba paramba)
  {
    a((byte)7, paramString);
    this.a.d(paramba.c());
    this.a.d(paramba.d());
    this.a.d(paramba.e());
  }
  
  protected void a(String paramString, bb parambb)
  {
    a(paramString, parambb.a(), (byte)14);
  }
  
  protected void a(String paramString, Boolean paramBoolean)
  {
    a((byte)8, paramString);
    ar localar = this.a;
    if (paramBoolean.booleanValue()) {}
    for (int i = 1;; i = 0)
    {
      localar.write(i);
      return;
    }
  }
  
  protected void a(String paramString, Number paramNumber)
  {
    if (((paramNumber instanceof Integer)) || ((paramNumber instanceof Short)) || ((paramNumber instanceof Byte)) || ((paramNumber instanceof AtomicInteger)))
    {
      a((byte)16, paramString);
      this.a.c(paramNumber.intValue());
      return;
    }
    if (((paramNumber instanceof Long)) || ((paramNumber instanceof AtomicLong)))
    {
      a((byte)18, paramString);
      this.a.a(paramNumber.longValue());
      return;
    }
    if (((paramNumber instanceof Float)) || ((paramNumber instanceof Double)))
    {
      a((byte)1, paramString);
      this.a.a(paramNumber.doubleValue());
      return;
    }
    throw new IllegalArgumentException("can't serialize " + paramNumber.getClass());
  }
  
  protected void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, (byte)2);
  }
  
  protected void a(String paramString, Date paramDate)
  {
    a((byte)9, paramString);
    this.a.a(paramDate.getTime());
  }
  
  protected void a(String paramString, UUID paramUUID)
  {
    a((byte)5, paramString);
    this.a.c(16);
    this.a.write(3);
    this.a.a(paramUUID.getMostSignificantBits());
    this.a.a(paramUUID.getLeastSignificantBits());
  }
  
  protected void a(String paramString, byte[] paramArrayOfByte)
  {
    a(paramString, 0, paramArrayOfByte);
  }
  
  protected boolean a(String paramString, al paramal)
  {
    return false;
  }
  
  protected boolean a(String paramString, Object paramObject)
  {
    return false;
  }
  
  public byte[] a(al paramal)
  {
    aq localaq = new aq();
    a(localaq);
    b(paramal);
    a();
    return localaq.c();
  }
  
  public int b(al paramal)
  {
    return b(null, paramal);
  }
  
  protected int b(String paramString, al paramal)
  {
    if (paramal == null) {
      throw new NullPointerException("can't save a null object");
    }
    int i = this.a.a();
    if ((paramal instanceof List)) {}
    for (byte b = 4;; b = 3)
    {
      if (a(paramString, paramal)) {
        return this.a.a() - i;
      }
      if (paramString != null) {
        a(b, paramString);
      }
      int j = this.a.a();
      this.a.c(0);
      int k;
      List localList;
      Iterator localIterator2;
      if ((b == 3) && (paramString == null))
      {
        k = 1;
        localList = null;
        if (b == 3)
        {
          if ((k != 0) && (paramal.b("_id"))) {
            b("_id", paramal.a("_id"));
          }
          Object localObject = paramal.a("_transientFields");
          boolean bool = localObject instanceof List;
          localList = null;
          if (bool) {
            localList = (List)localObject;
          }
        }
        if (!(paramal instanceof Map)) {
          break label326;
        }
        localIterator2 = ((Map)paramal).entrySet().iterator();
        label191:
        if (localIterator2.hasNext()) {
          break label244;
        }
      }
      for (;;)
      {
        this.a.write(0);
        this.a.a(j, this.a.a() - j);
        return this.a.a() - i;
        k = 0;
        break;
        label244:
        Map.Entry localEntry = (Map.Entry)localIterator2.next();
        if (((k != 0) && (((String)localEntry.getKey()).equals("_id"))) || ((localList != null) && (localList.contains(localEntry.getKey())))) {
          break label191;
        }
        b((String)localEntry.getKey(), localEntry.getValue());
        break label191;
        label326:
        Iterator localIterator1 = paramal.keySet().iterator();
        while (localIterator1.hasNext())
        {
          String str = (String)localIterator1.next();
          if (((k == 0) || (!str.equals("_id"))) && ((localList == null) || (!localList.contains(str)))) {
            b(str, paramal.a(str));
          }
        }
      }
    }
  }
  
  protected void b(String paramString)
  {
    int i = this.a.a();
    this.a.c(0);
    int j = c(paramString);
    this.a.a(i, j);
  }
  
  protected void b(String paramString, Object paramObject)
  {
    if (paramString.equals("_transientFields")) {}
    Object localObject;
    do
    {
      return;
      if ((paramString.equals("$where")) && ((paramObject instanceof String)))
      {
        a((byte)13, paramString);
        b(paramObject.toString());
        return;
      }
      localObject = ai.a(paramObject);
      if (localObject == null)
      {
        a(paramString);
        return;
      }
      if ((localObject instanceof Date))
      {
        a(paramString, (Date)localObject);
        return;
      }
      if ((localObject instanceof Number))
      {
        a(paramString, (Number)localObject);
        return;
      }
      if ((localObject instanceof Character))
      {
        a(paramString, localObject.toString());
        return;
      }
      if ((localObject instanceof String))
      {
        a(paramString, localObject.toString());
        return;
      }
      if ((localObject instanceof ba))
      {
        a(paramString, (ba)localObject);
        return;
      }
      if ((localObject instanceof al))
      {
        b(paramString, (al)localObject);
        return;
      }
      if ((localObject instanceof Boolean))
      {
        a(paramString, (Boolean)localObject);
        return;
      }
      if ((localObject instanceof Pattern))
      {
        a(paramString, (Pattern)localObject);
        return;
      }
      if ((localObject instanceof Map))
      {
        a(paramString, (Map)localObject);
        return;
      }
      if ((localObject instanceof Iterable))
      {
        a(paramString, (Iterable)localObject);
        return;
      }
      if ((localObject instanceof byte[]))
      {
        a(paramString, (byte[])localObject);
        return;
      }
      if ((localObject instanceof av))
      {
        a(paramString, (av)localObject);
        return;
      }
      if ((localObject instanceof UUID))
      {
        a(paramString, (UUID)localObject);
        return;
      }
      if (localObject.getClass().isArray())
      {
        c(paramString, localObject);
        return;
      }
      if ((localObject instanceof bb))
      {
        a(paramString, (bb)localObject);
        return;
      }
      if ((localObject instanceof au))
      {
        a(paramString, (au)localObject);
        return;
      }
      if ((localObject instanceof ax))
      {
        a(paramString, (ax)localObject);
        return;
      }
      if ((localObject instanceof aw))
      {
        a(paramString, (aw)localObject);
        return;
      }
      if ((localObject instanceof ab))
      {
        ao localao = new ao();
        localao.a("$ref", ((ab)localObject).b());
        localao.a("$id", ((ab)localObject).a());
        b(paramString, localao);
        return;
      }
      if ((localObject instanceof az))
      {
        a((byte)-1, paramString);
        return;
      }
      if ((localObject instanceof ay))
      {
        a((byte)127, paramString);
        return;
      }
    } while (a(paramString, localObject));
    throw new IllegalArgumentException("can't serialize " + localObject.getClass());
  }
  
  protected int c(String paramString)
  {
    int i = paramString.length();
    int j = 0;
    int k = 0;
    if (j >= i)
    {
      this.a.write(0);
      return k + 1;
    }
    int m = Character.codePointAt(paramString, j);
    if (m < 128)
    {
      this.a.write((byte)m);
      k++;
    }
    for (;;)
    {
      j += Character.charCount(m);
      break;
      if (m < 2048)
      {
        this.a.write((byte)(192 + (m >> 6)));
        this.a.write((byte)(128 + (m & 0x3F)));
        k += 2;
      }
      else if (m < 65536)
      {
        this.a.write((byte)(224 + (m >> 12)));
        this.a.write((byte)(128 + (0x3F & m >> 6)));
        this.a.write((byte)(128 + (m & 0x3F)));
        k += 3;
      }
      else
      {
        this.a.write((byte)(240 + (m >> 18)));
        this.a.write((byte)(128 + (0x3F & m >> 12)));
        this.a.write((byte)(128 + (0x3F & m >> 6)));
        this.a.write((byte)(128 + (m & 0x3F)));
        k += 4;
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.an
 * JD-Core Version:    0.7.0.1
 */