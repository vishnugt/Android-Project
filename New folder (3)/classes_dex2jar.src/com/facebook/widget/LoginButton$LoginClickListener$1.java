package com.facebook.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.Session;

class LoginButton$LoginClickListener$1
  implements DialogInterface.OnClickListener
{
  LoginButton$LoginClickListener$1(LoginButton.LoginClickListener paramLoginClickListener, Session paramSession) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.val$openSession.closeAndClearTokenInformation();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.LoginButton.LoginClickListener.1
 * JD-Core Version:    0.7.0.1
 */