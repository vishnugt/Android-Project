package com.chartboost.sdk.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class p$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  p$1(View paramView, p.b paramb, a parama, p.a parama1, Boolean paramBoolean) {}
  
  public void onGlobalLayout()
  {
    this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    p.a(this.b, this.c, this.d, this.e);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.p.1
 * JD-Core Version:    0.7.0.1
 */