package com.jirbo.adcolony;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.util.ArrayList;

public class AdColonyBrowser
  extends Activity
{
  static boolean A = false;
  static boolean B = false;
  static boolean C = false;
  public static String a;
  static boolean v = false;
  static boolean w = false;
  static boolean x = false;
  static boolean y = false;
  static boolean z = true;
  WebView b;
  ao c;
  ao d;
  ao e;
  ao f;
  ao g;
  ao h;
  ao i;
  ao j;
  ao k;
  RelativeLayout l;
  RelativeLayout m;
  boolean n = false;
  boolean o = false;
  boolean p = false;
  boolean q = false;
  ProgressBar r;
  DisplayMetrics s;
  ds t;
  du u;
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, this.s.heightPixels - (int)(1.5D * this.g.g));
    localLayoutParams.addRule(3, this.l.getId());
    this.b.setLayoutParams(localLayoutParams);
    z = true;
    this.t.invalidate();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    B = true;
    this.c = new ao(a.c("browser_back_image_normal"));
    this.d = new ao(a.c("browser_stop_image_normal"));
    this.e = new ao(a.c("browser_reload_image_normal"));
    this.f = new ao(a.c("browser_forward_image_normal"));
    this.g = new ao(a.c("browser_close_image_normal"));
    this.h = new ao(a.c("browser_glow_button"));
    this.i = new ao(a.c("browser_icon"));
    this.j = new ao(a.c("browser_back_image_normal"), (byte)0);
    this.k = new ao(a.c("browser_forward_image_normal"), (byte)0);
    this.s = a.a().getResources().getDisplayMetrics();
    float f1 = this.s.widthPixels / this.s.xdpi;
    float f2 = this.s.heightPixels / this.s.ydpi;
    double d1 = Math.sqrt(f1 * f1 + f2 * f2);
    double d2 = Math.sqrt(this.s.widthPixels * this.s.widthPixels + this.s.heightPixels * this.s.heightPixels) / d1 / 220.0D;
    if (d2 > 1.8D) {
      d2 = 1.8D;
    }
    z = true;
    v = false;
    w = false;
    C = false;
    this.c.a(d2);
    this.d.a(d2);
    this.e.a(d2);
    this.f.a(d2);
    this.g.a(d2);
    this.h.a(d2);
    this.j.a(d2);
    this.k.a(d2);
    this.r = new ProgressBar(this);
    this.r.setVisibility(4);
    this.m = new RelativeLayout(this);
    this.l = new RelativeLayout(this);
    this.l.setBackgroundColor(-3355444);
    if (!a.d)
    {
      this.l.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int)(1.5D * this.c.g)));
      requestWindowFeature(1);
      getWindow().setFlags(1024, 1024);
      getWindow().requestFeature(2);
      setVolumeControlStream(3);
      this.b = new WebView(this);
      this.b.getSettings().setJavaScriptEnabled(true);
      this.b.getSettings().setBuiltInZoomControls(true);
      this.b.getSettings().setUseWideViewPort(true);
      this.b.getSettings().setLoadWithOverviewMode(true);
      this.b.getSettings().setGeolocationEnabled(true);
      if (a.d) {
        break label951;
      }
      if (Build.VERSION.SDK_INT < 10) {
        break label943;
      }
      setRequestedOrientation(6);
      label568:
      this.b.setWebChromeClient(new dq(this));
      this.b.setWebViewClient(new dr(this));
      this.t = new ds(this, this);
      this.u = new du(this, this);
      this.m.setBackgroundColor(16777215);
      this.m.addView(this.l);
      this.l.setId(12345);
      RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, this.s.heightPixels - (int)(1.5D * this.g.g));
      localLayoutParams1.addRule(3, this.l.getId());
      this.m.addView(this.b, localLayoutParams1);
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, 20);
      localLayoutParams2.addRule(3, this.l.getId());
      localLayoutParams2.setMargins(0, -10, 0, 0);
      this.m.addView(this.u, localLayoutParams2);
      if (this.s.widthPixels <= this.s.heightPixels) {
        break label961;
      }
    }
    label943:
    label951:
    label961:
    for (int i1 = this.s.widthPixels;; i1 = this.s.heightPixels)
    {
      this.m.addView(this.t, new RelativeLayout.LayoutParams(i1 * 2, i1 * 2));
      RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, this.s.heightPixels - (int)(1.5D * this.g.g));
      localLayoutParams3.addRule(3, this.l.getId());
      this.m.addView(new dt(this, this), localLayoutParams3);
      setContentView(this.m);
      this.b.loadUrl(a);
      aq.c.a("Viewing ").b(a);
      return;
      this.l.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int)(1.5D * this.c.g)));
      break;
      setRequestedOrientation(0);
      break label568;
      setRequestedOrientation(a.l);
      break label568;
    }
  }
  
  public void onDestroy()
  {
    if ((!a.j) && (A == true))
    {
      for (int i1 = 0; i1 < a.J.size(); i1++) {
        ((Bitmap)a.J.get(i1)).recycle();
      }
      a.J.clear();
    }
    A = false;
    B = false;
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    this.t.a();
  }
  
  public void onResume()
  {
    super.onResume();
    z = true;
    this.t.invalidate();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.AdColonyBrowser
 * JD-Core Version:    0.7.0.1
 */