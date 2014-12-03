package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.widget.MediaController;

final class r
  implements MediaPlayer.OnCompletionListener
{
  r(o paramo) {}
  
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    this.a.e = 5;
    this.a.f = 5;
    if (this.a.m != null) {
      this.a.m.hide();
    }
    if (this.a.n != null) {
      this.a.n.onCompletion(this.a.h);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.r
 * JD-Core Version:    0.7.0.1
 */