package com.supercell.titan;

import android.os.Bundle;
import android.widget.Toast;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.widget.WebDialog.OnCompleteListener;

final class av
  implements WebDialog.OnCompleteListener
{
  av(au paramau) {}
  
  public final void onComplete(Bundle paramBundle, FacebookException paramFacebookException)
  {
    if (paramFacebookException != null)
    {
      if (!(paramFacebookException instanceof FacebookOperationCanceledException)) {
        Toast.makeText(this.a.a.getApplicationContext(), "Network Error", 0).show();
      }
    }
    else if (paramBundle.getString("request") != null)
    {
      Toast.makeText(this.a.a.getApplicationContext(), "Request sent", 0).show();
      return;
    }
    Toast.makeText(this.a.a.getApplicationContext(), "Request cancelled", 0).show();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.av
 * JD-Core Version:    0.7.0.1
 */