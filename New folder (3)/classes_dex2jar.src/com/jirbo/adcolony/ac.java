package com.jirbo.adcolony;

final class ac
  extends af
{
  String a;
  
  ac(String paramString)
  {
    this.a = paramString;
  }
  
  final void a(di paramdi)
  {
    a(paramdi, this.a);
  }
  
  final String b()
  {
    return this.a;
  }
  
  final double d()
  {
    try
    {
      double d = Double.parseDouble(this.a);
      return d;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return 0.0D;
  }
  
  final int e()
  {
    return (int)d();
  }
  
  final boolean j()
  {
    return true;
  }
  
  final boolean k()
  {
    String str = this.a.toLowerCase();
    return (str.equals("true")) || (str.equals("yes"));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ac
 * JD-Core Version:    0.7.0.1
 */