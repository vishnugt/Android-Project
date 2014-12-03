package com.jirbo.adcolony;

import java.util.ArrayList;

final class dk
{
  g a;
  boolean b = false;
  ArrayList<dj> c = new ArrayList();
  
  dk(g paramg)
  {
    this.a = paramg;
  }
  
  final dj a(String paramString)
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      dj localdj2 = (dj)this.c.get(j);
      if (localdj2.a.equals(paramString)) {
        return localdj2;
      }
    }
    this.b = true;
    dj localdj1 = new dj(paramString);
    this.c.add(localdj1);
    return localdj1;
  }
  
  final void a()
  {
    int i = 0;
    aq.a.b("Saving zone state...");
    this.b = false;
    z localz = new z();
    String[] arrayOfString = this.a.a.j;
    int j = arrayOfString.length;
    while (i < j)
    {
      dj localdj = a(arrayOfString[i]);
      ad localad = new ad();
      localad.b("uuid", localdj.a);
      localad.a("skipped_plays", localdj.b);
      localad.a("play_order_index", localdj.c);
      localz.a(localad);
      i++;
    }
    ap.a(new ag("zone_state.txt"), localz);
    aq.a.b("Saved zone state");
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dk
 * JD-Core Version:    0.7.0.1
 */