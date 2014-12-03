package com.supercell.titan;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;

final class ab
  implements DialogInterface.OnClickListener
{
  ab(aa paramaa) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      this.a.a.finish();
      return;
      if (Build.VERSION.SDK_INT >= 9)
      {
        Intent localIntent = new Intent();
        localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        localIntent.setData(Uri.fromParts("package", GameApp.getInstance().getPackageName(), null));
        this.a.a.startActivity(localIntent);
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.ab
 * JD-Core Version:    0.7.0.1
 */