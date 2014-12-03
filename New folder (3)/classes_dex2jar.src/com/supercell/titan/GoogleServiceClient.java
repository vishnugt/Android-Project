package com.supercell.titan;

import android.app.Dialog;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.a;
import com.google.android.gms.common.d;
import com.google.android.gms.common.g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.e;
import com.google.android.gms.games.f;
import com.google.android.gms.internal.cr;
import com.google.android.gms.internal.dj;

public class GoogleServiceClient
  implements com.google.android.gms.common.c, d, f
{
  public static int a = 1100042;
  private final GameApp b;
  private final com.google.android.gms.games.c c;
  private volatile boolean d = false;
  private volatile boolean e = false;
  private volatile String f = "";
  private volatile String g = "";
  private boolean h = false;
  
  public GoogleServiceClient(GameApp paramGameApp)
  {
    this.b = paramGameApp;
    e locale = new e(this.b.getApplicationContext(), this, this);
    locale.h = ((View)cr.a(paramGameApp.e()));
    this.c = new com.google.android.gms.games.c(locale.a, locale.b, locale.c, locale.d, locale.e, locale.f, locale.g, locale.h, (byte)0);
    updateNativeInstance(this);
  }
  
  public static native void onSignIn();
  
  public static native void onSignInCanceled();
  
  public static native void onSignInFailed();
  
  public static native void onSignOut();
  
  public static native void updateNativeInstance(GoogleServiceClient paramGoogleServiceClient);
  
  public void connect()
  {
    if (this.c.a.e()) {
      return;
    }
    try
    {
      this.c.a.c();
      return;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
  
  public void forNative_signIn(boolean paramBoolean)
  {
    this.b.runOnUiThread(new aq(this, this, paramBoolean));
  }
  
  public void forNative_signOut()
  {
    this.b.runOnUiThread(new ai(this, this));
  }
  
  public String getPlayerDisplayName()
  {
    return this.g;
  }
  
  public String getPlayerId()
  {
    return this.f;
  }
  
  public boolean isAvailable()
  {
    return this.e;
  }
  
  public boolean isSignedIn()
  {
    return this.d;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 != a) {
      return;
    }
    switch (paramInt2)
    {
    default: 
      return;
    case -1: 
      onStart();
      return;
    case 0: 
      this.b.a(new ah(this));
      return;
    case 10002: 
      this.b.a(new aj(this));
      return;
    case 10001: 
      this.b.a(new ak(this));
      return;
    case 10004: 
      this.b.a(new al(this));
      return;
    }
    this.b.a(new am(this));
  }
  
  public void onConnected(Bundle paramBundle)
  {
    this.d = true;
    this.h = false;
    try
    {
      this.f = this.c.a.m();
      this.g = this.c.a.n().c();
      this.b.a(new an(this));
      PurchaseManager localPurchaseManager = this.b.b();
      if ((localPurchaseManager instanceof cf)) {
        ((cf)localPurchaseManager).g();
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        GameApp.debuggerException(localException);
      }
    }
  }
  
  public void onConnectionFailed(a parama)
  {
    if (this.d) {
      this.b.a(new ao(this));
    }
    this.d = false;
    if ((parama.a()) && (this.h)) {
      this.h = false;
    }
    try
    {
      parama.a(this.b, a);
      parama.b();
      return;
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
      for (;;)
      {
        GameApp.debuggerException(localSendIntentException);
      }
    }
  }
  
  public void onDisconnected()
  {
    this.d = false;
    this.h = false;
    this.f = "";
    this.g = "";
  }
  
  public void onSignOutComplete()
  {
    this.d = false;
    this.f = "";
    this.g = "";
    try
    {
      this.c.a.f();
      this.b.a(new ap(this));
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        GameApp.debuggerException(localException);
      }
    }
  }
  
  public void onStart()
  {
    switch (g.a(this.b.getApplicationContext()))
    {
    default: 
      return;
    case 0: 
      this.e = true;
      connect();
      return;
    }
    this.e = false;
  }
  
  public void onStop()
  {
    try
    {
      this.c.a.f();
      return;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
  
  public void showAchievements()
  {
    if ((isSignedIn()) && (this.c.a.d()))
    {
      Intent localIntent = this.c.a.o();
      this.b.startActivityForResult(localIntent, 0);
    }
  }
  
  public void signIn(boolean paramBoolean)
  {
    int i = g.a(this.b.getApplicationContext());
    if (i == 0)
    {
      this.h = true;
      connect();
    }
    while (!paramBoolean) {
      return;
    }
    g.a(i, this.b).show();
  }
  
  public void signOut()
  {
    if (this.c.a.d()) {}
    try
    {
      this.c.a.a(this);
      return;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
  
  public void unlockAchievement(String paramString)
  {
    try
    {
      this.c.a.a(paramString);
      return;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.GoogleServiceClient
 * JD-Core Version:    0.7.0.1
 */