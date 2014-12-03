package com.supercell.titan;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.vending.expansion.downloader.k;

final class af
  implements View.OnClickListener
{
  af(GameApp paramGameApp) {}
  
  public final void onClick(View paramView)
  {
    GameApp localGameApp;
    if (GameApp.g(this.a))
    {
      GameApp.h(this.a).c();
      localGameApp = this.a;
      if (GameApp.g(this.a)) {
        break label60;
      }
    }
    label60:
    for (boolean bool = true;; bool = false)
    {
      GameApp.a(localGameApp, bool);
      return;
      GameApp.h(this.a).a();
      break;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.af
 * JD-Core Version:    0.7.0.1
 */