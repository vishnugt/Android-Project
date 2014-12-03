package com.jirbo.adcolony;

import java.util.ArrayList;

final class bt
{
  ArrayList<bq> a;
  
  final bq a(int paramInt)
  {
    return (bq)this.a.get(paramInt);
  }
  
  final bq a(String paramString)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      bq localbq = (bq)this.a.get(i);
      if (localbq.a.equals(paramString)) {
        return localbq;
      }
    }
    aq.a.a("No such zone: ").b(paramString);
    return null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.bt
 * JD-Core Version:    0.7.0.1
 */