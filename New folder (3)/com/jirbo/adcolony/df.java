package com.jirbo.adcolony;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.WebView;

final class df
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  df(cv paramcv, View paramView) {}
  
  public final void onGlobalLayout()
  {
    Rect localRect = new Rect();
    this.a.getWindowVisibleDisplayFrame(localRect);
    if (this.b.a != null) {
      this.b.b(this.a.getRootView().getHeight() - (localRect.bottom - localRect.top) - (this.b.c.s - this.b.a.getHeight()) / 2);
    }
    this.b.e();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.df
 * JD-Core Version:    0.7.0.1
 */