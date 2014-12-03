package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.d;
import com.google.android.gms.a.e;
import com.google.android.gms.a.f;

public final class ac
  extends e<ah>
{
  private static final ac a = new ac();
  
  private ac()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public static ae a(Activity paramActivity)
  {
    Intent localIntent;
    try
    {
      localIntent = paramActivity.getIntent();
      if (!localIntent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
        throw new ad("Ad overlay requires the useClientJar flag in intent extras.");
      }
    }
    catch (ad localad)
    {
      localad.getMessage();
      return null;
    }
    if (localIntent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false)) {
      return new p(paramActivity);
    }
    ae localae = a.b(paramActivity);
    return localae;
  }
  
  private ae b(Activity paramActivity)
  {
    try
    {
      a locala = d.a(paramActivity);
      ae localae = af.a(((ah)a(paramActivity)).a(locala));
      return localae;
    }
    catch (RemoteException localRemoteException)
    {
      return null;
    }
    catch (f localf) {}
    return null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ac
 * JD-Core Version:    0.7.0.1
 */