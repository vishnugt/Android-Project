package com.jirbo.adcolony;

final class i
  extends an
{
  i(g paramg1, g paramg2)
  {
    super(paramg2);
  }
  
  final void a()
  {
    ce localce = this.m.e;
    aq.b.b("AdColony suspending");
    a.i = true;
    if (!localce.b) {
      aq.d.b("AdColony.onPause() called without initial call to onResume().");
    }
    localce.b = false;
    localce.c = true;
    localce.g = cm.b();
    localce.a();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.i
 * JD-Core Version:    0.7.0.1
 */