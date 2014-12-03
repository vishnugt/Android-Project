package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;

final class u
  implements MediaPlayer.OnBufferingUpdateListener
{
  u(o paramo) {}
  
  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    this.a.p = paramInt;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.u
 * JD-Core Version:    0.7.0.1
 */