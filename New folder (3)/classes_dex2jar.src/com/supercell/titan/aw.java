package com.supercell.titan;

import android.os.Bundle;
import android.widget.Toast;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.widget.WebDialog.OnCompleteListener;

final class aw
  implements WebDialog.OnCompleteListener
{
  aw(au paramau) {}
  
  public final void onComplete(Bundle paramBundle, FacebookException paramFacebookException)
  {
    if (paramFacebookException == null)
    {
      if (paramBundle.getString("post_id") != null)
      {
        Toast.makeText(this.a.a, "Posted story", 0).show();
        return;
      }
      Toast.makeText(this.a.a.getApplicationContext(), "Publish cancelled", 0).show();
      return;
    }
    if ((paramFacebookException instanceof FacebookOperationCanceledException))
    {
      Toast.makeText(this.a.a.getApplicationContext(), "Publish cancelled", 0).show();
      return;
    }
    Toast.makeText(this.a.a.getApplicationContext(), "Error posting story", 0).show();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.aw
 * JD-Core Version:    0.7.0.1
 */