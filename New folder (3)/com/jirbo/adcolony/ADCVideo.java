package com.jirbo.adcolony;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;
import java.io.FileInputStream;
import java.io.IOException;

public abstract class ADCVideo
  extends Activity
{
  static int a;
  static int b;
  static boolean c;
  static boolean d;
  static boolean e;
  static Activity f;
  static boolean g;
  static boolean h;
  cv A;
  VideoView B;
  FrameLayout C;
  FrameLayout D;
  FrameLayout E;
  Rect F = new Rect();
  ao G;
  cu H;
  FileInputStream I;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  boolean m;
  double n;
  double o;
  long p;
  long q;
  int r;
  int s;
  int t;
  int u;
  int v;
  String w = "";
  boolean x = true;
  boolean y = true;
  o z;
  
  static void a()
  {
    a = 0;
    c = false;
    d = false;
  }
  
  final void a(String paramString)
  {
    this.w = paramString;
    e = true;
    this.B = new VideoView(this);
    Uri localUri = Uri.parse(paramString);
    this.B.setVideoURI(localUri);
    new MediaController(this).setMediaPlayer(this.B);
    this.B.setLayoutParams(new FrameLayout.LayoutParams(this.r, this.s, 17));
    this.E.addView(this.B);
    this.E.addView(this.H);
    setContentView(this.E);
    this.B.setOnCompletionListener(new cs(this));
    this.B.setOnPreparedListener(new ct(this));
    this.B.start();
  }
  
  final boolean b()
  {
    Display localDisplay = getWindowManager().getDefaultDisplay();
    this.r = localDisplay.getWidth();
    this.s = localDisplay.getHeight();
    this.v = -16777216;
    getWindow().setBackgroundDrawable(new ColorDrawable(this.v));
    int i1 = this.r;
    int i2 = this.s;
    this.t = i1;
    this.u = i2;
    boolean bool1 = a.q;
    boolean bool2 = false;
    if (bool1)
    {
      a.q = false;
      bool2 = true;
    }
    return bool2;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i1 = 1;
    super.onCreate(paramBundle);
    f = this;
    int i2;
    int i3;
    if (!a.b("video_enabled"))
    {
      i2 = i1;
      a.B = i2;
      if (a.b("end_card_enabled")) {
        break label197;
      }
      i3 = i1;
      label36:
      a.A = i3;
      a.C = a.b("load_timeout_enabled");
      a.D = a.a("load_timeout");
      requestWindowFeature(i1);
      getWindow().setFlags(1024, 1024);
      if (a.d) {
        break label211;
      }
      if (Build.VERSION.SDK_INT < 10) {
        break label203;
      }
      setRequestedOrientation(6);
    }
    for (;;)
    {
      setVolumeControlStream(3);
      this.z = new o(this);
      this.C = new FrameLayout(this);
      this.A = new cv(this);
      this.E = new FrameLayout(this);
      this.H = new cu(this, this);
      this.G = new ao(a.c("browser_icon"));
      AdColonyBrowser.A = false;
      a.v = this;
      a.w = this;
      return;
      i2 = 0;
      break;
      label197:
      i3 = 0;
      break label36;
      label203:
      setRequestedOrientation(0);
    }
    label211:
    int i4 = getResources().getConfiguration().orientation;
    if ((i4 == 0) || (i4 == 6) || (i4 == 2)) {}
    for (int i5 = 6;; i5 = 7)
    {
      a.l = i5;
      if ((Build.VERSION.SDK_INT < 10) || (Build.MODEL.equals("Kindle Fire"))) {
        break label287;
      }
      setRequestedOrientation(a.l);
      break;
    }
    label287:
    if (Build.MODEL.equals("Kindle Fire"))
    {
      getRequestedOrientation();
      switch (((WindowManager)getSystemService("window")).getDefaultDisplay().getRotation())
      {
      default: 
        i1 = 8;
      }
    }
    for (;;)
    {
      a.l = i1;
      setRequestedOrientation(i1);
      break;
      i1 = 0;
      continue;
      i1 = 9;
      continue;
      i1 = i4;
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    AdColonyBrowser.A = true;
    a.k = true;
    a.v = null;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((cf.z != null) && (cf.z.onKeyDown(paramInt, paramKeyEvent))) {}
    label126:
    do
    {
      do
      {
        do
        {
          return true;
          if (paramInt != 4) {
            break label126;
          }
          if (!c) {
            break;
          }
          if (e)
          {
            this.B.stopPlayback();
            e = false;
            this.E.removeAllViews();
            setContentView(this.C);
            return true;
          }
        } while ((this.A == null) || (this.A.r != 0));
        this.A.c();
        return true;
      } while ((this.A == null) || (!this.A.H) || (!this.A.J));
      this.A.d();
      return true;
    } while (paramInt == 82);
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    g = false;
    if (e)
    {
      b = this.B.getCurrentPosition();
      this.B.stopPlayback();
      if (c)
      {
        View localView = new View(this);
        localView.setBackgroundColor(-16777216);
        setContentView(localView);
        this.q = System.currentTimeMillis();
        if (!isFinishing()) {
          this.o += (this.q - this.p) / 1000.0D;
        }
      }
      if (this.z == null) {
        break label200;
      }
      if (this.z.getCurrentPosition() != 0) {
        a = this.z.getCurrentPosition();
      }
      this.z.a();
      this.z.setBackgroundColor(-16777216);
    }
    for (;;)
    {
      this.A.x = true;
      this.A.E = false;
      this.A.D = false;
      this.A.F = false;
      this.A.s = 0;
      this.A.r = 0;
      this.A.invalidate();
      super.onPause();
      return;
      b = 0;
      break;
      label200:
      a = 0;
    }
  }
  
  public void onResume()
  {
    g = true;
    super.onResume();
    b();
    if (this.x)
    {
      this.x = false;
      if (!c)
      {
        if (this.A.L) {
          this.D.addView(this.A.a);
        }
        if (this.A.L) {
          this.D.setVisibility(4);
        }
        if (Build.MODEL.equals("Kindle Fire")) {
          this.A.l = 20;
        }
        if (Build.MODEL.equals("SCH-I800")) {
          this.A.l = 25;
        }
        this.C.addView(this.z, new FrameLayout.LayoutParams(this.t, this.u, 17));
        if (this.A.L) {
          this.C.addView(this.D, new FrameLayout.LayoutParams(this.r, this.s - this.A.l, 17));
        }
        this.C.addView(this.A, new FrameLayout.LayoutParams(this.r, this.s, 17));
      }
    }
    if (e)
    {
      this.E.addView(this.H);
      setContentView(this.E);
    }
    for (;;)
    {
      this.z.a(this.A);
      this.z.a(this.A);
      try
      {
        this.I = new FileInputStream(a.c("video_filepath"));
        this.z.a(this.I.getFD());
        if (!h) {
          onWindowFocusChanged(true);
        }
        if (a.B)
        {
          this.A.a();
          this.A.b();
        }
        return;
      }
      catch (IOException localIOException)
      {
        new StringBuilder("Unable to play video: ").append(a.c("video_filepath")).toString();
        a.i();
        finish();
      }
      setContentView(this.C);
      if (c) {
        this.p = System.currentTimeMillis();
      }
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      h = false;
      if ((!c) && (g)) {
        if (this.z != null)
        {
          this.z.seekTo(a);
          if (!a.d) {
            break label107;
          }
          Handler localHandler = new Handler();
          cr localcr = new cr(this);
          this.z.setBackgroundColor(-16777216);
          localHandler.postDelayed(localcr, 900L);
          if (!cf.y) {
            this.z.start();
          }
          this.A.requestFocus();
          this.A.invalidate();
        }
      }
      label107:
      do
      {
        return;
        this.z.setBackgroundColor(0);
        break;
        if (e)
        {
          this.B.seekTo(b);
          this.B.start();
          return;
        }
      } while (!c);
      this.A.invalidate();
      return;
    }
    if (g)
    {
      a = this.z.getCurrentPosition();
      this.z.pause();
    }
    h = true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ADCVideo
 * JD-Core Version:    0.7.0.1
 */