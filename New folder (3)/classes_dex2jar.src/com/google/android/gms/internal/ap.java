package com.google.android.gms.internal;

import android.os.Process;

final class ap
  implements Runnable
{
  ap(Runnable paramRunnable) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    this.a.run();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ap
 * JD-Core Version:    0.7.0.1
 */