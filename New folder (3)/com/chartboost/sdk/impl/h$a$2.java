package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;

class h$a$2
  implements Runnable
{
  h$a$2(h.a parama, CBOrientation.Difference paramDifference) {}
  
  public void run()
  {
    try
    {
      h.a.a(this.a, true);
      this.a.requestLayout();
      h.a.a(this.a).a().requestLayout();
      h.a.a(this.a).b().requestLayout();
      h.a.a(this.a, false);
      if ((this.b == CBOrientation.Difference.ANGLE_180) || (this.b == CBOrientation.Difference.ANGLE_90)) {
        h.a.a(this.a).c();
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.h.a.2
 * JD-Core Version:    0.7.0.1
 */