package com.jirbo.adcolony;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.widget.MediaController;

final class s
  implements MediaPlayer.OnErrorListener
{
  s(o paramo) {}
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    new StringBuilder("Error: ").append(paramInt1).append(",").append(paramInt2).toString();
    this.a.e = -1;
    this.a.f = -1;
    if (this.a.m != null) {
      this.a.m.hide();
    }
    if ((this.a.q != null) && (this.a.q.onError(this.a.h, paramInt1, paramInt2))) {}
    while (this.a.getWindowToken() == null) {
      return true;
    }
    o.b().getResources();
    if (paramInt1 == 200) {}
    for (String str = "Invalid progressive playback";; str = "Unknown error")
    {
      new AlertDialog.Builder(o.b()).setTitle("ERROR").setMessage(str).setPositiveButton("OKAY", new t(this)).setCancelable(false).show();
      return true;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.s
 * JD-Core Version:    0.7.0.1
 */