package com.jirbo.adcolony;

final class l
  extends an
{
  l(g paramg1, g paramg2, double paramDouble)
  {
    super(paramg2);
  }
  
  final void a()
  {
    cc localcc = this.m.d;
    double d1 = this.a;
    double d2 = localcc.a.a.m;
    if (d1 >= d2)
    {
      if ((d2 < 0.25D) && (d1 >= 0.25D)) {
        localcc.b("first_quartile", null);
      }
      if ((d2 < 0.5D) && (d1 >= 0.5D)) {
        localcc.b("midpoint", null);
      }
      if ((d2 < 0.75D) && (d1 >= 0.75D)) {
        localcc.b("third_quartile", null);
      }
      if ((d2 < 1.0D) && (d1 >= 1.0D))
      {
        aq.a.a("Tracking ad event - complete");
        ad localad = new ad();
        localad.a("ad_slot", a.u.c.k.d);
        localcc.b("complete", localad);
      }
      localcc.a.a.m = d1;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.l
 * JD-Core Version:    0.7.0.1
 */