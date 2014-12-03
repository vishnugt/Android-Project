package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

public final class bv
  implements DialogInterface.OnClickListener
{
  private final Activity a;
  private final Intent b;
  private final int c;
  
  public bv(Activity paramActivity, Intent paramIntent)
  {
    this.a = paramActivity;
    this.b = paramIntent;
    this.c = 0;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if (this.b != null) {
        this.a.startActivityForResult(this.b, this.c);
      }
      paramDialogInterface.dismiss();
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException) {}
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bv
 * JD-Core Version:    0.7.0.1
 */