package com.facebook;

import java.util.Iterator;
import java.util.List;

class Session$3
  implements Runnable
{
  Session$3(Session paramSession, SessionState paramSessionState, Exception paramException) {}
  
  public void run()
  {
    Iterator localIterator = Session.access$800(this.this$0).iterator();
    while (localIterator.hasNext())
    {
      Session.3.1 local1 = new Session.3.1(this, (Session.StatusCallback)localIterator.next());
      Session.access$1000(Session.access$900(this.this$0), local1);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.Session.3
 * JD-Core Version:    0.7.0.1
 */