package com.facebook;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class Settings$1
  implements ThreadFactory
{
  private final AtomicInteger counter = new AtomicInteger(0);
  
  public final Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, "FacebookSdk #" + this.counter.incrementAndGet());
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.Settings.1
 * JD-Core Version:    0.7.0.1
 */