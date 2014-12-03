package com.jirbo.adcolony;

final class h
  extends an
{
  h(g paramg1, g paramg2)
  {
    super(paramg2);
  }
  
  final void a()
  {
    ce localce = this.m.e;
    aq.b.b("AdColony resuming");
    a.i = true;
    if (localce.b) {
      aq.d.b("AdColony.onResume() called multiple times in succession.");
    }
    localce.b = true;
    ad localad = ap.a(new ag("session_info.txt"));
    double d;
    if (localad != null)
    {
      localce.c = localad.a("allow_resume", false);
      localce.f = localad.d("start_time");
      localce.g = localad.d("finish_time");
      d = cm.b();
      if (!localce.c) {
        break label168;
      }
      if (d - localce.g > localce.a.a.d)
      {
        localce.a(localce.g - localce.f);
        localce.f = d;
        localce.b();
      }
      localce.c = false;
      localce.a();
    }
    for (;;)
    {
      a.j();
      return;
      localce.d = true;
      break;
      label168:
      localce.f = d;
      localce.b();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.h
 * JD-Core Version:    0.7.0.1
 */