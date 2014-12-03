package com.supercell.titan;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.Session;
import com.facebook.widget.WebDialog;
import com.facebook.widget.WebDialog.FeedDialogBuilder;
import com.facebook.widget.WebDialog.OnCompleteListener;
import com.facebook.widget.WebDialog.RequestsDialogBuilder;

public final class au
  implements Runnable
{
  final GameApp a;
  final Bundle b;
  final ay c;
  final Session d;
  private WebDialog.OnCompleteListener e = new av(this);
  private WebDialog.OnCompleteListener f = new aw(this);
  
  public au(GameApp paramGameApp, Session paramSession, Bundle paramBundle, ay paramay)
  {
    this.a = paramGameApp;
    this.d = paramSession;
    this.b = paramBundle;
    this.c = paramay;
  }
  
  public final void run()
  {
    if ((this.d == null) || (!this.d.isOpened())) {
      return;
    }
    for (;;)
    {
      try
      {
        int i = ax.a[this.c.ordinal()];
        localWebDialog = null;
        switch (i)
        {
        default: 
          localWebDialog.show();
          return;
        }
      }
      catch (FacebookException localFacebookException)
      {
        GameApp.debuggerException(localFacebookException);
        return;
      }
      WebDialog localWebDialog = new WebDialog.RequestsDialogBuilder(this.a, this.d, this.b).build();
      localWebDialog.setOnCompleteListener(this.e);
      continue;
      localWebDialog = new WebDialog.FeedDialogBuilder(this.a, this.d, this.b).build();
      localWebDialog.setOnCompleteListener(this.f);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.au
 * JD-Core Version:    0.7.0.1
 */