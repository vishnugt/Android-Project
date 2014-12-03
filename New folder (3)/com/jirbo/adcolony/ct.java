package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.widget.FrameLayout;

final class ct
  implements MediaPlayer.OnPreparedListener
{
  ct(ADCVideo paramADCVideo) {}
  
  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    this.a.E.removeViewAt(1);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ct
 * JD-Core Version:    0.7.0.1
 */