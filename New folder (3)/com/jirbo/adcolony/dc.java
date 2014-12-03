package com.jirbo.adcolony;

import android.view.View;
import android.widget.FrameLayout;
import java.io.PrintStream;

final class dc
  implements Runnable
{
  dc(cv paramcv, View paramView) {}
  
  public final void run()
  {
    this.b.c.C.removeView(this.a);
    this.b.a(true);
    this.b.c.p = System.currentTimeMillis();
    System.out.println("TESTING - blah");
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dc
 * JD-Core Version:    0.7.0.1
 */