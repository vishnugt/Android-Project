package com.jirbo.adcolony;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;

final class bx
  extends Handler
{
  bx()
  {
    sendMessageDelayed(obtainMessage(), 1000L);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (a.a().isFinishing())
    {
      a.g();
      return;
    }
    if (a.a().hasWindowFocus()) {
      bw.a();
    }
    sendMessageDelayed(obtainMessage(), 1000L);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.bx
 * JD-Core Version:    0.7.0.1
 */