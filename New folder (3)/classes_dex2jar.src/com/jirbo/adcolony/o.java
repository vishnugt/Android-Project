package com.jirbo.adcolony;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import java.io.FileDescriptor;
import java.io.IOException;

final class o
  extends SurfaceView
  implements MediaController.MediaPlayerControl
{
  private MediaPlayer.OnErrorListener A = new s(this);
  private MediaPlayer.OnBufferingUpdateListener B = new u(this);
  String a = "ADCCustomVideoView";
  Uri b;
  FileDescriptor c;
  int d;
  int e = 0;
  int f = 0;
  SurfaceHolder g = null;
  MediaPlayer h = null;
  int i = 0;
  int j = 0;
  int k;
  int l;
  MediaController m;
  MediaPlayer.OnCompletionListener n;
  MediaPlayer.OnPreparedListener o;
  int p;
  MediaPlayer.OnErrorListener q;
  int r;
  boolean s;
  boolean t;
  boolean u;
  int v;
  MediaPlayer.OnVideoSizeChangedListener w = new p(this);
  MediaPlayer.OnPreparedListener x = new q(this);
  SurfaceHolder.Callback y = new v(this);
  private MediaPlayer.OnCompletionListener z = new r(this);
  
  o(Context paramContext)
  {
    super(paramContext);
    getHolder().addCallback(this.y);
    getHolder().setType(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
    this.e = 0;
    this.f = 0;
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.h != null)
    {
      this.h.reset();
      this.h.release();
      this.h = null;
      this.e = 0;
      if (paramBoolean) {
        this.f = 0;
      }
    }
  }
  
  static Activity b()
  {
    return a.a();
  }
  
  private void d()
  {
    if (((this.b == null) && (this.c == null)) || (this.g == null)) {}
    Object localObject;
    for (;;)
    {
      return;
      Intent localIntent = new Intent("com.android.music.musicservicecommand");
      localIntent.putExtra("command", "pause");
      a.a().sendBroadcast(localIntent);
      a(false);
      try
      {
        this.h = new MediaPlayer();
        this.h.setOnPreparedListener(this.x);
        this.h.setOnVideoSizeChangedListener(this.w);
        this.d = -1;
        this.h.setOnCompletionListener(this.z);
        this.h.setOnErrorListener(this.A);
        this.h.setOnBufferingUpdateListener(this.B);
        this.p = 0;
        if (this.b != null)
        {
          this.h.setDataSource(a.a(), this.b);
          this.h.setDisplay(this.g);
          this.h.setAudioStreamType(3);
          this.h.setScreenOnWhilePlaying(true);
          this.h.prepare();
          this.e = 1;
          if ((this.h == null) || (this.m == null)) {
            continue;
          }
          this.m.setMediaPlayer(this);
          if (!(getParent() instanceof View)) {
            break label386;
          }
          localObject = (View)getParent();
          this.m.setAnchorView((View)localObject);
          this.m.setEnabled(f());
        }
      }
      catch (IOException localIOException)
      {
        while (this.b != null)
        {
          new StringBuilder("Unable to open content: ").append(this.b).toString();
          this.e = -1;
          this.f = -1;
          this.A.onError(this.h, 1, 0);
          return;
          this.h.setDataSource(this.c);
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        label285:
        if (this.b == null) {
          break label400;
        }
      }
    }
    new StringBuilder("Unable to open content: ").append(this.b).toString();
    label386:
    label400:
    for (;;)
    {
      this.e = -1;
      this.f = -1;
      this.A.onError(this.h, 1, 0);
      return;
      localObject = this;
      break;
      break label285;
    }
  }
  
  private void e()
  {
    if (this.m.isShowing())
    {
      this.m.hide();
      return;
    }
    this.m.show();
  }
  
  private boolean f()
  {
    return (this.h != null) && (this.e != -1) && (this.e != 0) && (this.e != 1);
  }
  
  public final void a()
  {
    if (this.h != null)
    {
      this.h.stop();
      this.h.release();
      this.h = null;
      this.e = 0;
      this.f = 0;
    }
  }
  
  public final void a(MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    this.n = paramOnCompletionListener;
  }
  
  public final void a(MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.q = paramOnErrorListener;
  }
  
  public final void a(FileDescriptor paramFileDescriptor)
  {
    this.c = paramFileDescriptor;
    this.r = 0;
    d();
    requestLayout();
    invalidate();
  }
  
  public final void c()
  {
    if ((this.g == null) && (this.e == 6)) {
      this.f = 7;
    }
    do
    {
      return;
      if ((this.h != null) && (this.e == 6))
      {
        this.h.start();
        this.e = this.v;
        this.f = this.v;
        return;
      }
    } while (this.e != 8);
    d();
  }
  
  public final boolean canPause()
  {
    return this.s;
  }
  
  public final boolean canSeekBackward()
  {
    return this.t;
  }
  
  public final boolean canSeekForward()
  {
    return this.u;
  }
  
  public final int getBufferPercentage()
  {
    if (this.h != null) {
      return this.p;
    }
    return 0;
  }
  
  public final int getCurrentPosition()
  {
    if (f()) {
      return this.h.getCurrentPosition();
    }
    return 0;
  }
  
  public final int getDuration()
  {
    if (f())
    {
      if (this.d > 0) {
        return this.d;
      }
      this.d = this.h.getDuration();
      return this.d;
    }
    this.d = -1;
    return this.d;
  }
  
  public final boolean isPlaying()
  {
    return (f()) && (this.h.isPlaying());
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i1;
    if ((paramInt != 4) && (paramInt != 24) && (paramInt != 25) && (paramInt != 82) && (paramInt != 5) && (paramInt != 6)) {
      i1 = 1;
    }
    while ((f()) && (i1 != 0) && (this.m != null)) {
      if ((paramInt == 79) || (paramInt == 85))
      {
        if (this.h.isPlaying())
        {
          pause();
          this.m.show();
          return true;
          i1 = 0;
        }
        else
        {
          start();
          this.m.hide();
          return true;
        }
      }
      else
      {
        if ((paramInt != 86) || (!this.h.isPlaying())) {
          break label141;
        }
        pause();
        this.m.show();
      }
    }
    for (;;)
    {
      return super.onKeyDown(paramInt, paramKeyEvent);
      label141:
      e();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = getDefaultSize(this.i, paramInt1);
    int i2 = getDefaultSize(this.j, paramInt2);
    if ((this.i > 0) && (this.j > 0))
    {
      if (i2 * this.i <= i1 * this.j) {
        break label70;
      }
      i2 = i1 * this.j / this.i;
    }
    for (;;)
    {
      setMeasuredDimension(i1, i2);
      return;
      label70:
      if (i2 * this.i < i1 * this.j) {
        i1 = i2 * this.i / this.j;
      }
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((f()) && (this.m != null)) {
      e();
    }
    return false;
  }
  
  public final boolean onTrackballEvent(MotionEvent paramMotionEvent)
  {
    if ((f()) && (this.m != null)) {
      e();
    }
    return false;
  }
  
  public final void pause()
  {
    if ((f()) && (this.h.isPlaying()))
    {
      this.h.pause();
      this.e = 4;
    }
    this.f = 4;
  }
  
  public final void seekTo(int paramInt)
  {
    if (f())
    {
      this.h.seekTo(paramInt);
      this.r = 0;
      return;
    }
    this.r = paramInt;
  }
  
  public final void start()
  {
    if (f())
    {
      this.h.start();
      this.e = 3;
    }
    this.f = 3;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.o
 * JD-Core Version:    0.7.0.1
 */