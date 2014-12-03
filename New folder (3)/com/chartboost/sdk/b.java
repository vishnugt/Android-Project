package com.chartboost.sdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.chartboost.sdk.impl.a;
import com.chartboost.sdk.impl.a.b;
import com.chartboost.sdk.impl.a.c;
import com.chartboost.sdk.impl.p;
import com.chartboost.sdk.impl.p.a;
import com.chartboost.sdk.impl.p.b;
import com.chartboost.sdk.impl.q;
import com.chartboost.sdk.impl.t;
import com.chartboost.sdk.impl.u;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class b
{
  private Chartboost a;
  private WeakReference<Activity> b;
  private t c;
  private boolean d = false;
  private boolean e = false;
  private boolean f = false;
  private u g;
  private u h;
  
  protected b(Chartboost paramChartboost, Activity paramActivity)
  {
    this.a = paramChartboost;
    this.b = new WeakReference(paramActivity);
  }
  
  private void b(a parama)
  {
    if (this.e) {}
    ChartboostDelegate localChartboostDelegate;
    do
    {
      do
      {
        Activity localActivity;
        do
        {
          return;
          parama.c = a.b.b;
          localActivity = (Activity)this.b.get();
          if ((parama.f.b()) && (localActivity != null)) {
            break;
          }
        } while (parama.f.d == null);
        parama.f.d.a();
        return;
        if (parama.i)
        {
          parama.i = false;
          this.g = new u(localActivity, parama.f.d());
          localActivity.addContentView(this.g, new FrameLayout.LayoutParams(-1, -1));
          parama.c = a.b.c;
          parama.h = this.g;
          this.e = true;
          return;
        }
        this.g = new u(localActivity, parama.f.d());
        localActivity.addContentView(this.g, new FrameLayout.LayoutParams(-1, -1));
        this.g.b().a();
        Object localObject = p.b.a;
        if (parama.d == a.c.c) {
          localObject = p.b.c;
        }
        p.b localb = p.b.a(parama.a.optInt("animation"));
        if (localb != null) {
          localObject = localb;
        }
        if (this.a.getAnimationsOff()) {
          localObject = p.b.f;
        }
        parama.c = a.b.c;
        parama.h = this.g;
        p.a((p.b)localObject, parama);
        this.e = true;
        localChartboostDelegate = this.a.getDelegate();
      } while (localChartboostDelegate == null);
      if (parama.d == a.c.b)
      {
        localChartboostDelegate.didShowInterstitial(parama.e);
        return;
      }
    } while (parama.d != a.c.c);
    localChartboostDelegate.didShowMoreApps();
  }
  
  private p.a c(a parama)
  {
    return new b.1(this);
  }
  
  private void d()
  {
    Activity localActivity = (Activity)this.b.get();
    if (localActivity == null) {
      return;
    }
    this.c = new t(localActivity);
    this.h = new u(localActivity, this.c);
    this.h.b().a(true);
    localActivity.addContentView(this.h, new FrameLayout.LayoutParams(-1, -1));
    this.h.b().a();
    this.h.b().a((View)this.c.getParent());
    this.d = true;
  }
  
  protected final void a(Activity paramActivity)
  {
    this.b = new WeakReference(paramActivity);
  }
  
  protected final void a(b.a parama)
  {
    if (parama.a) {
      d();
    }
    while (parama.b == null) {
      return;
    }
    b(parama.b);
  }
  
  public final void a(a parama)
  {
    this.e = false;
    new b.b(this, parama, true).run();
    if (parama.c == a.b.c) {
      parama.c = a.b.b;
    }
    for (;;)
    {
      parama.c();
      try
      {
        ((ViewGroup)this.g.getParent()).removeView(this.g);
        this.g = null;
        return;
        parama.c = a.b.a;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
        }
      }
    }
  }
  
  public final void a(a parama, boolean paramBoolean)
  {
    this.e = false;
    if (!paramBoolean) {
      this.f = true;
    }
    parama.c = a.b.d;
    Object localObject = p.b.a;
    if (parama.d == a.c.c) {
      localObject = p.b.c;
    }
    p.b localb = p.b.a(parama.a.optInt("animation"));
    if (localb != null) {
      localObject = localb;
    }
    if (this.a.getAnimationsOff()) {
      localObject = p.b.f;
    }
    p.b((p.b)localObject, parama, c(parama));
  }
  
  public final void a(boolean paramBoolean)
  {
    if (a()) {}
    try
    {
      ((ViewGroup)this.h.getParent()).removeView(this.h);
      this.c = null;
      this.h = null;
      this.d = false;
      Activity localActivity = (Activity)this.b.get();
      if ((!this.f) && (paramBoolean) && (this.a.getImpressionsUseActivities()) && (!this.e) && (localActivity != null) && ((localActivity instanceof CBImpressionActivity)))
      {
        this.a.d();
        localActivity.finish();
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  protected final boolean a()
  {
    return this.d;
  }
  
  public final void b(a parama, boolean paramBoolean)
  {
    if (this.g == null) {}
    for (;;)
    {
      return;
      try
      {
        ((ViewGroup)this.g.getParent()).removeView(this.g);
        parama.b();
        this.g = null;
        this.f = false;
        if ((!this.a.getImpressionsUseActivities()) || (paramBoolean) || (this.d)) {
          continue;
        }
        Activity localActivity = (Activity)this.b.get();
        if ((localActivity == null) || (!(localActivity instanceof CBImpressionActivity))) {
          continue;
        }
        localActivity.finish();
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
        }
      }
    }
  }
  
  protected final boolean b()
  {
    return this.e;
  }
  
  protected final boolean c()
  {
    return (a()) || (b());
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.b
 * JD-Core Version:    0.7.0.1
 */