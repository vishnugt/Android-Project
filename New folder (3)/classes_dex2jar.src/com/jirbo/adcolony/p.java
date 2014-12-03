package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.view.SurfaceHolder;

final class p
  implements MediaPlayer.OnVideoSizeChangedListener
{
  p(o paramo) {}
  
  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    this.a.i = paramMediaPlayer.getVideoWidth();
    this.a.j = paramMediaPlayer.getVideoHeight();
    if ((this.a.i != 0) && (this.a.j != 0)) {
      this.a.getHolder().setFixedSize(this.a.i, this.a.j);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.p
 * JD-Core Version:    0.7.0.1
 */