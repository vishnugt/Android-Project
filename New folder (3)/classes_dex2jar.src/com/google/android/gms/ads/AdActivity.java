package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.ae;

public final class AdActivity
  extends Activity
{
  private ae a;
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = ac.a(this);
    if (this.a == null)
    {
      finish();
      return;
    }
    try
    {
      this.a.a(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      finish();
    }
  }
  
  protected final void onDestroy()
  {
    try
    {
      if (this.a != null) {
        this.a.i();
      }
      label16:
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label16;
    }
  }
  
  protected final void onPause()
  {
    try
    {
      if (this.a != null) {
        this.a.g();
      }
      super.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        finish();
      }
    }
  }
  
  protected final void onRestart()
  {
    super.onRestart();
    try
    {
      if (this.a != null) {
        this.a.d();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      finish();
    }
  }
  
  protected final void onResume()
  {
    super.onResume();
    try
    {
      if (this.a != null) {
        this.a.f();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      finish();
    }
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      if (this.a != null) {
        this.a.b(paramBundle);
      }
      super.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        finish();
      }
    }
  }
  
  protected final void onStart()
  {
    super.onStart();
    try
    {
      if (this.a != null) {
        this.a.e();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      finish();
    }
  }
  
  protected final void onStop()
  {
    try
    {
      if (this.a != null) {
        this.a.h();
      }
      super.onStop();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        finish();
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdActivity
 * JD-Core Version:    0.7.0.1
 */