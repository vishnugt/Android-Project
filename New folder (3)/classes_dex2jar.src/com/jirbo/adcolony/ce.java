package com.jirbo.adcolony;

import java.util.ArrayList;

final class ce
{
  g a;
  boolean b;
  boolean c;
  boolean d = false;
  boolean e = false;
  double f;
  double g;
  String h = "uuid";
  
  ce(g paramg)
  {
    this.a = paramg;
  }
  
  final void a()
  {
    ad localad = new ad();
    localad.b("allow_resume", this.c);
    localad.a("start_time", this.f);
    localad.a("finish_time", this.g);
    ap.a(new ag("session_info.txt"), localad);
  }
  
  final void a(double paramDouble)
  {
    aq.a.a("Submitting session duration ").b(paramDouble);
    ad localad = new ad();
    localad.a("session_length", (int)paramDouble);
    this.a.d.a("session_end", localad);
  }
  
  final void b()
  {
    this.e = true;
    this.h = cm.a();
    if ((a.c == null) || (a.c.b == null) || (a.c.b.j == null) || (a.c.b.j.n == null)) {}
    for (;;)
    {
      return;
      for (int i = 0; i < a.c.b.j.n.a.size(); i++) {
        a.c.b.j.n.a(i).k.d = 0;
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ce
 * JD-Core Version:    0.7.0.1
 */