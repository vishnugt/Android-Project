package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout.LayoutParams;
import com.chartboost.sdk.c.a;

class x$b
  extends WebView
{
  public x$b(x paramx, Context paramContext)
  {
    super(paramContext);
    setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    setBackgroundColor(0);
    getSettings().setJavaScriptEnabled(true);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramInt == 4) || (paramInt == 3)) && (this.a.a != null)) {
      this.a.a.a();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.x.b
 * JD-Core Version:    0.7.0.1
 */