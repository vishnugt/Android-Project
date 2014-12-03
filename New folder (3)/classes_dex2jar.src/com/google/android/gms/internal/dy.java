package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import java.lang.ref.WeakReference;

final class dy
  extends dv
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener
{
  private WeakReference<View> c;
  private boolean d = false;
  
  protected dy(dj paramdj, int paramInt)
  {
    super(paramdj, paramInt, (byte)0);
  }
  
  private void b(View paramView)
  {
    int i = -1;
    if (dh.a(17))
    {
      Display localDisplay = paramView.getDisplay();
      if (localDisplay != null) {
        i = localDisplay.getDisplayId();
      }
    }
    IBinder localIBinder = paramView.getWindowToken();
    int[] arrayOfInt = new int[2];
    paramView.getLocationInWindow(arrayOfInt);
    int j = paramView.getWidth();
    int k = paramView.getHeight();
    this.b.c = i;
    this.b.a = localIBinder;
    this.b.d = arrayOfInt[0];
    this.b.e = arrayOfInt[1];
    this.b.f = (j + arrayOfInt[0]);
    this.b.g = (k + arrayOfInt[1]);
    if (this.d)
    {
      a();
      this.d = false;
    }
  }
  
  public final void a()
  {
    if (this.b.a != null)
    {
      super.a();
      return;
    }
    if (this.c != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      return;
    }
  }
  
  protected final void a(int paramInt)
  {
    this.b = new dx(paramInt, null, (byte)0);
  }
  
  public final void a(View paramView)
  {
    this.a.p();
    ViewTreeObserver localViewTreeObserver;
    if (this.c != null)
    {
      View localView2 = (View)this.c.get();
      Context localContext2 = this.a.g();
      if ((localView2 == null) && ((localContext2 instanceof Activity))) {
        localView2 = ((Activity)localContext2).getWindow().getDecorView();
      }
      if (localView2 != null)
      {
        localView2.removeOnAttachStateChangeListener(this);
        localViewTreeObserver = localView2.getViewTreeObserver();
        if (!dh.a(16)) {
          break label182;
        }
        localViewTreeObserver.removeOnGlobalLayoutListener(this);
      }
    }
    for (;;)
    {
      this.c = null;
      Context localContext1 = this.a.g();
      if ((paramView == null) && ((localContext1 instanceof Activity)))
      {
        View localView1 = ((Activity)localContext1).findViewById(16908290);
        if (localView1 == null) {
          localView1 = ((Activity)localContext1).getWindow().getDecorView();
        }
        paramView = localView1;
        dm.a();
      }
      if (paramView == null) {
        break;
      }
      b(paramView);
      this.c = new WeakReference(paramView);
      paramView.addOnAttachStateChangeListener(this);
      paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
      return;
      label182:
      localViewTreeObserver.removeGlobalOnLayoutListener(this);
    }
    dm.b();
  }
  
  public final void onGlobalLayout()
  {
    if (this.c == null) {}
    View localView;
    do
    {
      return;
      localView = (View)this.c.get();
    } while (localView == null);
    b(localView);
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    b(paramView);
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    this.a.p();
    paramView.removeOnAttachStateChangeListener(this);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dy
 * JD-Core Version:    0.7.0.1
 */