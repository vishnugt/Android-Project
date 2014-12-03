package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class bg
  implements DialogInterface.OnCancelListener
{
  bg(JsPromptResult paramJsPromptResult) {}
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.cancel();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bg
 * JD-Core Version:    0.7.0.1
 */