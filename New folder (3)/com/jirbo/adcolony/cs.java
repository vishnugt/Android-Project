package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.widget.FrameLayout;

final class cs
  implements MediaPlayer.OnCompletionListener
{
  cs(ADCVideo paramADCVideo) {}
  
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    this.a.setContentView(this.a.C);
    this.a.E.removeAllViews();
    ADCVideo.e = false;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.cs
 * JD-Core Version:    0.7.0.1
 */