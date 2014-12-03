package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

final class f
  extends Handler
{
  f(FragmentActivity paramFragmentActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
    case 1: 
      do
      {
        return;
      } while (!this.a.e);
      this.a.a(false);
      return;
    }
    this.a.a();
    this.a.b.c();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.f
 * JD-Core Version:    0.7.0.1
 */