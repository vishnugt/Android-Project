package com.jirbo.adcolony;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.media.MediaPlayer.OnCompletionListener;

final class t
  implements DialogInterface.OnClickListener
{
  t(s params) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a.a.n != null) {
      this.a.a.n.onCompletion(this.a.a.h);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.t
 * JD-Core Version:    0.7.0.1
 */