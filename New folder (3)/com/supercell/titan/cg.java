package com.supercell.titan;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.vending.billing.IInAppBillingService.Stub;

final class cg
  implements ServiceConnection
{
  cg(cf paramcf) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    cf.a(this.a, IInAppBillingService.Stub.a(paramIBinder));
    cf.a(this.a, true);
    if (cf.a(this.a) == null) {
      cf.b(this.a, false);
    }
    for (;;)
    {
      GameApp.getInstance().a(new ch(this));
      return;
      cf.b(this.a, true);
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    cf.a(this.a, null);
    cf.a(this.a, false);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.cg
 * JD-Core Version:    0.7.0.1
 */