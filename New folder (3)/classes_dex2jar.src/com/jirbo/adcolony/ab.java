package com.jirbo.adcolony;

final class ab
  extends af
{
  double a;
  
  ab(double paramDouble)
  {
    this.a = paramDouble;
  }
  
  final void a(di paramdi)
  {
    double d = this.a;
    if (paramdi.g) {
      paramdi.b();
    }
    if ((Double.isNaN(d)) || (Double.isInfinite(d))) {
      paramdi.a("0.0");
    }
    long l1;
    long l3;
    for (;;)
    {
      return;
      if (d < 0.0D)
      {
        d = -d;
        paramdi.a('-');
      }
      l1 = Math.pow(10.0D, 4.0D);
      long l2 = Math.round(d * l1);
      paramdi.a(l2 / l1);
      paramdi.a('.');
      l3 = l2 % l1;
      if (l3 != 0L) {
        break;
      }
      for (int i = 0; i < 4; i++) {
        paramdi.a('0');
      }
    }
    for (long l4 = l3 * 10L; l4 < l1; l4 *= 10L) {
      paramdi.a('0');
    }
    paramdi.a(l3);
  }
  
  final double d()
  {
    return this.a;
  }
  
  final int e()
  {
    return (int)this.a;
  }
  
  final boolean i()
  {
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ab
 * JD-Core Version:    0.7.0.1
 */