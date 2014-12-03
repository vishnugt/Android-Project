package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;

class s$2
  implements View.OnTouchListener
{
  s$2(s params) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    try
    {
      View localView = ((Activity)s.a(this.a).getContext()).getCurrentFocus();
      if (localView != null) {
        ((InputMethodManager)s.a(this.a).getContext().getSystemService("input_method")).hideSoftInputFromWindow(localView.getApplicationWindowToken(), 0);
      }
      return false;
    }
    catch (Exception localException) {}
    return false;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.s.2
 * JD-Core Version:    0.7.0.1
 */