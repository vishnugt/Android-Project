package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public final class p
  extends af
{
  private final Activity a;
  private bh b;
  private w c;
  private ax d;
  private s e;
  private aa f;
  private FrameLayout g;
  private WebChromeClient.CustomViewCallback h;
  private boolean i = false;
  private boolean j = false;
  private RelativeLayout k;
  
  public p(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  public static void a(Context paramContext, bh parambh)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", parambh.n.e);
    bh.a(localIntent, parambh);
    localIntent.addFlags(524288);
    paramContext.startActivity(localIntent);
  }
  
  private void b(boolean paramBoolean)
  {
    int m;
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      m = 50;
      this.f = new aa(this.a, m);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(10);
      if (!paramBoolean) {
        break label88;
      }
    }
    label88:
    for (int n = 11;; n = 9)
    {
      localLayoutParams.addRule(n);
      this.f.a(this.b.h);
      this.k.addView(this.f, localLayoutParams);
      return;
      m = 32;
      break;
    }
  }
  
  private static RelativeLayout.LayoutParams c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    localLayoutParams.addRule(10);
    localLayoutParams.addRule(9);
    return localLayoutParams;
  }
  
  private void c(boolean paramBoolean)
  {
    this.a.requestWindowFeature(1);
    Window localWindow = this.a.getWindow();
    localWindow.setFlags(1024, 1024);
    a(this.b.k);
    if (Build.VERSION.SDK_INT >= 11) {
      localWindow.setFlags(16777216, 16777216);
    }
    this.k = new RelativeLayout(this.a);
    this.k.setBackgroundColor(-16777216);
    this.a.setContentView(this.k);
    boolean bool = this.b.e.e().a();
    if (paramBoolean)
    {
      this.d = ax.a(this.a, this.b.e.d(), bool, this.b.n);
      this.d.e().a(this.b.f, this.b.j);
      this.d.e().a(new q(this));
      if (this.b.m != null) {
        this.d.loadUrl(this.b.m);
      }
    }
    for (;;)
    {
      this.d.a(this);
      this.k.addView(this.d, -1, -1);
      if (!paramBoolean) {
        this.d.b();
      }
      b(bool);
      return;
      if (this.b.i != null)
      {
        this.d.loadDataWithBaseURL(this.b.g, this.b.i, "text/html", "UTF-8", null);
      }
      else
      {
        throw new r("No URL or HTML to display in ad overlay.");
        this.d = this.b.e;
        this.d.setContext(this.a);
      }
    }
  }
  
  private void k()
  {
    if ((!this.a.isFinishing()) || (this.j)) {}
    do
    {
      do
      {
        return;
        this.j = true;
      } while (!this.a.isFinishing());
      if (this.d != null)
      {
        this.d.a();
        this.k.removeView(this.d);
        if (this.e != null)
        {
          this.d.a(false);
          this.e.c.addView(this.d, this.e.a, this.e.b);
        }
      }
    } while ((this.b == null) || (this.b.d == null));
  }
  
  public final void a()
  {
    this.a.finish();
  }
  
  public final void a(int paramInt)
  {
    this.a.setRequestedOrientation(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.c != null) {
      this.c.setLayoutParams(c(paramInt1, paramInt2, paramInt3, paramInt4));
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    boolean bool = false;
    if (paramBundle != null) {
      bool = paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
    }
    this.i = bool;
    Activity localActivity;
    be localbe;
    do
    {
      try
      {
        this.b = bh.a(this.a.getIntent());
        if (this.b == null) {
          throw new r("Could not get info for ad overlay.");
        }
      }
      catch (r localr)
      {
        localr.getMessage();
        this.a.finish();
        return;
      }
      if ((paramBundle == null) && ((this.b.d == null) || ((this.b.l != 1) && (this.b.c != null)))) {}
      switch (this.b.l)
      {
      default: 
        throw new r("Could not determine ad overlay type.");
      case 1: 
        c(false);
        return;
      case 2: 
        this.e = new s(this.b.e);
        c(false);
        return;
      case 3: 
        c(true);
        return;
      }
      if (this.i)
      {
        this.a.finish();
        return;
      }
      localActivity = this.a;
      localbe = this.b.b;
    } while (n.a(localActivity, localbe));
    this.a.finish();
  }
  
  public final void a(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.g = new FrameLayout(this.a);
    this.g.setBackgroundColor(-16777216);
    this.g.addView(paramView, -1, -1);
    this.a.setContentView(this.g);
    this.h = paramCustomViewCallback;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.f != null) {
      this.f.a(paramBoolean);
    }
  }
  
  public final w b()
  {
    return this.c;
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.c == null)
    {
      this.c = new w(this.a, this.d);
      this.k.addView(this.c, 0, c(paramInt1, paramInt2, paramInt3, paramInt4));
      this.d.e().b();
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
  }
  
  public final void c()
  {
    if (this.b != null) {
      a(this.b.k);
    }
    if (this.g != null)
    {
      this.a.setContentView(this.k);
      this.g.removeAllViews();
      this.g = null;
    }
    if (this.h != null)
    {
      this.h.onCustomViewHidden();
      this.h = null;
    }
  }
  
  public final void d() {}
  
  public final void e() {}
  
  public final void f()
  {
    if ((this.b != null) && (this.b.l == 4))
    {
      if (!this.i) {
        break label47;
      }
      this.a.finish();
    }
    for (;;)
    {
      if (this.d != null) {
        ar.b(this.d);
      }
      return;
      label47:
      this.i = true;
    }
  }
  
  public final void g()
  {
    if (this.c != null) {
      this.c.c();
    }
    c();
    if ((this.d != null) && ((!this.a.isFinishing()) || (this.e == null))) {
      ar.a(this.d);
    }
    k();
  }
  
  public final void h()
  {
    k();
  }
  
  public final void i()
  {
    if (this.c != null) {
      this.c.a();
    }
    if (this.d != null) {
      this.k.removeView(this.d);
    }
    k();
  }
  
  public final void j()
  {
    this.k.removeView(this.f);
    b(true);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.p
 * JD-Core Version:    0.7.0.1
 */