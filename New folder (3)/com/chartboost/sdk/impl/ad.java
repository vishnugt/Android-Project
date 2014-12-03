package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.List;

class ad
  extends ac
{
  private bf<ah> a = new bf();
  
  void a(Class paramClass, ah paramah)
  {
    this.a.a(paramClass, paramah);
  }
  
  public void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    Object localObject = z.a(paramObject);
    if (localObject == null)
    {
      paramStringBuilder.append(" null ");
      return;
    }
    ah localah = null;
    Iterator localIterator = bf.a(localObject.getClass()).iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {}
      do
      {
        if ((localah == null) && (localObject.getClass().isArray())) {
          localah = (ah)this.a.a([Ljava.lang.Object.class);
        }
        if (localah != null) {
          break;
        }
        throw new RuntimeException("json can't serialize type : " + localObject.getClass());
        Class localClass = (Class)localIterator.next();
        localah = (ah)this.a.a(localClass);
      } while (localah != null);
    }
    localah.a(localObject, paramStringBuilder);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.ad
 * JD-Core Version:    0.7.0.1
 */