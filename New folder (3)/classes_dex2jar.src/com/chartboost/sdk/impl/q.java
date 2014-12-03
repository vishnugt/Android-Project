package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class q
  extends RelativeLayout
{
  public q.a a;
  private boolean b;
  
  public q(Context paramContext)
  {
    super(paramContext);
    this.a = new q.a(this, paramContext);
    this.a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    addView(this.a);
    setFocusable(false);
  }
  
  public void a()
  {
    a(this.a);
  }
  
  public void a(View paramView)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(510L);
    localAlphaAnimation.setFillAfter(true);
    paramView.startAnimation(localAlphaAnimation);
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
    this.a.a();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.q
 * JD-Core Version:    0.7.0.1
 */