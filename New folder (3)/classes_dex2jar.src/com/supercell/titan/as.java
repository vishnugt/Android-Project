package com.supercell.titan;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class as
  implements DialogInterface.OnClickListener
{
  as(NativeDialogManager paramNativeDialogManager) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i;
    if (paramInt == -1) {
      i = 1;
    }
    for (;;)
    {
      NativeDialogManager.a(this.a, NativeDialogManager.b(this.a), i);
      return;
      i = 0;
      if (paramInt == -2) {
        i = 2;
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.as
 * JD-Core Version:    0.7.0.1
 */