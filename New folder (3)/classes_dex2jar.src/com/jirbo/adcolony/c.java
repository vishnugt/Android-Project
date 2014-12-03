package com.jirbo.adcolony;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

final class c
  extends Handler
{
  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    if (paramBoolean) {}
    for (;;)
    {
      sendMessage(obtainMessage(paramInt, paramString));
      return;
      paramString = null;
    }
  }
  
  public final void handleMessage(Message paramMessage)
  {
    String str = (String)paramMessage.obj;
    int i = paramMessage.what;
    if (str != null) {}
    for (boolean bool = true;; bool = false)
    {
      if (!bool) {
        str = "";
      }
      new dy(bool, str, i);
      for (int j = 0; j < a.K.size(); j++) {
        a.K.get(j);
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.c
 * JD-Core Version:    0.7.0.1
 */