package com.supercell.titan;

import com.facebook.Request;
import com.facebook.Session;

public final class bw
  implements Runnable
{
  private final GameApp a;
  private final Session b;
  
  public bw(GameApp paramGameApp, Session paramSession)
  {
    this.a = paramGameApp;
    this.b = paramSession;
  }
  
  public final void run()
  {
    Request.newMeRequest(this.b, new bx(this)).executeAsync();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bw
 * JD-Core Version:    0.7.0.1
 */