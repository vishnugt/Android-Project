package com.supercell.titan;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.res.Resources;

final class aa
  implements Runnable
{
  aa(GameApp paramGameApp) {}
  
  public final void run()
  {
    ab localab = new ab(this);
    String str = this.a.getResources().getString(co.UnsatisfiedLinkErrorReinstallPrompt).replace("{GAME}", GameApp.a(this.a));
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
    localBuilder.setMessage(str);
    localBuilder.setPositiveButton("OK", localab);
    localBuilder.setNegativeButton("Uninstall", localab);
    localBuilder.setCancelable(false);
    localBuilder.create().show();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.aa
 * JD-Core Version:    0.7.0.1
 */