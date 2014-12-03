package com.google.android.gms.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;
import java.util.HashMap;
import java.util.Map;

public final class w
  extends FrameLayout
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener
{
  private final ax a;
  private final MediaController b;
  private final y c;
  private final VideoView d;
  private long e;
  private String f;
  
  public w(Context paramContext, ax paramax)
  {
    super(paramContext);
    this.a = paramax;
    this.d = new VideoView(paramContext);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
    addView(this.d, localLayoutParams);
    this.b = new MediaController(paramContext);
    this.c = new y(this);
    this.c.a();
    this.d.setOnCompletionListener(this);
    this.d.setOnPreparedListener(this);
    this.d.setOnErrorListener(this);
  }
  
  public static void a(ax paramax, String paramString1, String paramString2)
  {
    int i;
    if (paramString2 == null)
    {
      i = 1;
      if (i == 0) {
        break label60;
      }
    }
    label60:
    for (int j = 2;; j = 3)
    {
      HashMap localHashMap = new HashMap(j);
      localHashMap.put("what", paramString1);
      if (i == 0) {
        localHashMap.put("extra", paramString2);
      }
      a(paramax, "error", localHashMap);
      return;
      i = 0;
      break;
    }
  }
  
  private static void a(ax paramax, String paramString1, String paramString2, String paramString3)
  {
    HashMap localHashMap = new HashMap(2);
    localHashMap.put(paramString2, paramString3);
    a(paramax, paramString1, localHashMap);
  }
  
  private static void a(ax paramax, String paramString, Map<String, String> paramMap)
  {
    paramMap.put("event", paramString);
    paramax.a("onVideoEvent", paramMap);
  }
  
  public final void a()
  {
    y localy = this.c;
    localy.b = true;
    av.a.removeCallbacks(localy.a);
    this.d.stopPlayback();
  }
  
  public final void a(int paramInt)
  {
    this.d.seekTo(paramInt);
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    this.d.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final void a(String paramString)
  {
    this.f = paramString;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.d.setMediaController(this.b);
      return;
    }
    this.b.hide();
    this.d.setMediaController(null);
  }
  
  public final void b()
  {
    if (!TextUtils.isEmpty(this.f))
    {
      this.d.setVideoPath(this.f);
      return;
    }
    a(this.a, "no_src", null);
  }
  
  public final void c()
  {
    this.d.pause();
  }
  
  public final void d()
  {
    this.d.start();
  }
  
  public final void e()
  {
    long l = this.d.getCurrentPosition();
    if (this.e != l)
    {
      float f1 = (float)l / 1000.0F;
      a(this.a, "timeupdate", "time", String.valueOf(f1));
      this.e = l;
    }
  }
  
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    a(this.a, "ended", new HashMap(1));
  }
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    a(this.a, String.valueOf(paramInt1), String.valueOf(paramInt2));
    return true;
  }
  
  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    float f1 = this.d.getDuration() / 1000.0F;
    a(this.a, "canplaythrough", "duration", String.valueOf(f1));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.w
 * JD-Core Version:    0.7.0.1
 */