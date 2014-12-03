package com.supercell.titan;

import android.os.Handler;
import android.os.Message;
import java.util.Vector;

final class bz
  extends Handler
{
  public final void handleMessage(Message paramMessage)
  {
    try
    {
      ca localca = (ca)paramMessage.obj;
      NativeHTTPClientManager.a().remove(localca);
      NativeHTTPClientManager.b().add(localca);
      return;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bz
 * JD-Core Version:    0.7.0.1
 */