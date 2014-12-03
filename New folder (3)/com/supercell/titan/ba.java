package com.supercell.titan;

import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphObjectException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import com.facebook.android.FacebookError;

final class ba
  implements Runnable
{
  ba(az paramaz, Exception paramException) {}
  
  public final void run()
  {
    String str = this.a.toString();
    if ((this.a instanceof FacebookAuthorizationException)) {
      str = "FacebookAuthorizationException";
    }
    for (;;)
    {
      NativeFacebookManager.facebookLoginFailedWithError(str, this.a.getMessage());
      NativeFacebookManager.facebookLogout();
      return;
      if ((this.a instanceof FacebookDialogException)) {
        str = "FacebookDialogException";
      } else if ((this.a instanceof FacebookGraphObjectException)) {
        str = "FacebookGraphObjectException";
      } else if ((this.a instanceof FacebookOperationCanceledException)) {
        str = "FacebookOperationCanceledException";
      } else if ((this.a instanceof FacebookServiceException)) {
        str = "FacebookServiceException";
      } else if ((this.a instanceof FacebookException)) {
        str = "FacebookException";
      } else if ((this.a instanceof FacebookError)) {
        str = "FacebookError";
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.ba
 * JD-Core Version:    0.7.0.1
 */