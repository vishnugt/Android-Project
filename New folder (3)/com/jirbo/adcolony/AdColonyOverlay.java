package com.jirbo.adcolony;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class AdColonyOverlay
  extends ADCVideo
{
  Rect J = new Rect();
  int K = 0;
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Display localDisplay = getWindowManager().getDefaultDisplay();
    this.r = localDisplay.getWidth();
    this.s = localDisplay.getHeight();
    a.q = true;
    View localView = new View(this);
    localView.setBackgroundColor(-16777216);
    if ((c) && (this.A.L))
    {
      this.D.setLayoutParams(new FrameLayout.LayoutParams(this.r, this.s - this.A.l, 17));
      this.C.addView(localView, new FrameLayout.LayoutParams(this.r, this.s, 17));
      new Handler().postDelayed(new dw(this, localView), 1500L);
    }
    this.A.a();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.AdColonyOverlay
 * JD-Core Version:    0.7.0.1
 */