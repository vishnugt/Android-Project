package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.view.SurfaceHolder;
import android.widget.MediaController;

final class q
  implements MediaPlayer.OnPreparedListener
{
  q(o paramo) {}
  
  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    this.a.e = 2;
    o localo1 = this.a;
    o localo2 = this.a;
    this.a.u = true;
    localo2.t = true;
    localo1.s = true;
    if (this.a.o != null) {
      this.a.o.onPrepared(this.a.h);
    }
    if (this.a.m != null) {
      this.a.m.setEnabled(true);
    }
    this.a.i = paramMediaPlayer.getVideoWidth();
    this.a.j = paramMediaPlayer.getVideoHeight();
    int i = this.a.r;
    if (i != 0) {
      this.a.seekTo(i);
    }
    if ((this.a.i != 0) && (this.a.j != 0))
    {
      this.a.getHolder().setFixedSize(this.a.i, this.a.j);
      if ((this.a.k == this.a.i) && (this.a.l == this.a.j))
      {
        if (this.a.f != 3) {
          break label250;
        }
        this.a.start();
        if (this.a.m != null) {
          this.a.m.show();
        }
      }
    }
    label250:
    while (this.a.f != 3)
    {
      do
      {
        return;
      } while ((this.a.isPlaying()) || ((i == 0) && (this.a.getCurrentPosition() <= 0)) || (this.a.m == null));
      this.a.m.show(0);
      return;
    }
    this.a.start();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.q
 * JD-Core Version:    0.7.0.1
 */