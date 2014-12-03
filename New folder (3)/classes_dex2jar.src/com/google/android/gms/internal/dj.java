package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.LocalSocket;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.f;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public final class dj
  extends bx<dq>
{
  private final String h;
  private final String i;
  private final Map<String, ea> j;
  private PlayerEntity k;
  private final dv l;
  private boolean m = false;
  private final Binder n;
  private final long o;
  private final boolean p;
  
  public dj(Context paramContext, String paramString1, String paramString2, c paramc, d paramd, String[] paramArrayOfString, int paramInt, View paramView)
  {
    super(paramContext, paramc, paramd, paramArrayOfString);
    this.h = paramString1;
    this.i = ((String)cr.a(paramString2));
    this.n = new Binder();
    this.j = new HashMap();
    this.l = dv.a(this, paramInt);
    this.l.a(paramView);
    this.o = hashCode();
    this.p = false;
  }
  
  protected final String a()
  {
    return "com.google.android.gms.games.service.START";
  }
  
  protected final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    if ((paramInt == 0) && (paramBundle != null)) {
      this.m = paramBundle.getBoolean("show_welcome_popup");
    }
    super.a(paramInt, paramIBinder, paramBundle);
  }
  
  public final void a(IBinder paramIBinder, Bundle paramBundle)
  {
    if (d()) {}
    try
    {
      ((dq)l()).a(paramIBinder, paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      dm.a();
    }
  }
  
  protected final void a(a parama)
  {
    super.a(parama);
    this.m = false;
  }
  
  public final void a(f paramf)
  {
    if (paramf == null) {}
    for (Object localObject = null;; localObject = localdk)
    {
      try
      {
        ((dq)l()).a((dn)localObject);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        dk localdk;
        dm.a();
      }
      localdk = new dk(this, paramf);
    }
  }
  
  protected final void a(cl paramcl, ca paramca)
  {
    String str = this.a.getResources().getConfiguration().locale.toString();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.p);
    paramcl.a(paramca, 4030500, this.a.getPackageName(), this.i, this.d, this.h, this.l.c(), str, localBundle);
  }
  
  public final void a(String paramString)
  {
    try
    {
      ((dq)l()).b(null, paramString, this.l.c(), this.l.b());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      dm.a();
    }
  }
  
  protected final void a(String... paramVarArgs)
  {
    int i1 = 0;
    int i2 = 0;
    boolean bool1 = false;
    if (i1 < paramVarArgs.length)
    {
      String str = paramVarArgs[i1];
      if (str.equals("https://www.googleapis.com/auth/games")) {
        bool1 = true;
      }
      for (;;)
      {
        i1++;
        break;
        if (str.equals("https://www.googleapis.com/auth/games.firstparty")) {
          i2 = 1;
        }
      }
    }
    if (i2 != 0)
    {
      if (!bool1) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        cr.a(bool2, String.format("Cannot have both %s and %s!", new Object[] { "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty" }));
        return;
      }
    }
    cr.a(bool1, String.format("GamesClient requires %s to function.", new Object[] { "https://www.googleapis.com/auth/games" }));
  }
  
  protected final String b()
  {
    return "com.google.android.gms.games.internal.IGamesService";
  }
  
  public final void c()
  {
    this.k = null;
    super.c();
  }
  
  public final void f()
  {
    this.m = false;
    if (d()) {}
    try
    {
      dq localdq = (dq)l();
      localdq.c();
      localdq.b(this.o);
      localdq.a(this.o);
      Iterator localIterator = this.j.values().iterator();
      while (localIterator.hasNext())
      {
        ea localea = (ea)localIterator.next();
        try
        {
          localea.a.close();
        }
        catch (IOException localIOException)
        {
          dm.c();
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        dm.a();
      }
      this.j.clear();
      super.f();
    }
  }
  
  protected final void h()
  {
    super.h();
    if (this.m)
    {
      this.l.a();
      this.m = false;
    }
  }
  
  protected final Bundle i()
  {
    try
    {
      Bundle localBundle = ((dq)l()).b();
      if (localBundle != null) {
        localBundle.setClassLoader(dj.class.getClassLoader());
      }
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      dm.a();
    }
    return null;
  }
  
  public final String m()
  {
    try
    {
      String str = ((dq)l()).e();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      dm.a();
    }
    return null;
  }
  
  /* Error */
  public final com.google.android.gms.games.Player n()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 273	com/google/android/gms/internal/dj:k	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 205	com/google/android/gms/internal/dj:k	Lcom/google/android/gms/games/PlayerEntity;
    //   10: astore_2
    //   11: aload_2
    //   12: ifnonnull +51 -> 63
    //   15: new 275	com/google/android/gms/games/g
    //   18: dup
    //   19: aload_0
    //   20: invokevirtual 103	com/google/android/gms/internal/dj:l	()Landroid/os/IInterface;
    //   23: checkcast 105	com/google/android/gms/internal/dq
    //   26: invokeinterface 278 1 0
    //   31: invokespecial 281	com/google/android/gms/games/g:<init>	(Lcom/google/android/gms/common/data/d;)V
    //   34: astore_3
    //   35: aload_3
    //   36: invokevirtual 283	com/google/android/gms/games/g:a	()I
    //   39: ifle +20 -> 59
    //   42: aload_0
    //   43: aload_3
    //   44: iconst_0
    //   45: invokevirtual 286	com/google/android/gms/games/g:b	(I)Lcom/google/android/gms/games/Player;
    //   48: invokeinterface 290 1 0
    //   53: checkcast 292	com/google/android/gms/games/PlayerEntity
    //   56: putfield 205	com/google/android/gms/internal/dj:k	Lcom/google/android/gms/games/PlayerEntity;
    //   59: aload_3
    //   60: invokevirtual 294	com/google/android/gms/games/g:b	()V
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_0
    //   66: getfield 205	com/google/android/gms/internal/dj:k	Lcom/google/android/gms/games/PlayerEntity;
    //   69: areturn
    //   70: astore 4
    //   72: aload_3
    //   73: invokevirtual 294	com/google/android/gms/games/g:b	()V
    //   76: aload 4
    //   78: athrow
    //   79: astore 5
    //   81: invokestatic 111	com/google/android/gms/internal/dm:a	()V
    //   84: goto -21 -> 63
    //   87: astore_1
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_1
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	dj
    //   87	4	1	localObject1	Object
    //   10	2	2	localPlayerEntity	PlayerEntity
    //   34	39	3	localg	com.google.android.gms.games.g
    //   70	7	4	localObject2	Object
    //   79	1	5	localRemoteException	RemoteException
    // Exception table:
    //   from	to	target	type
    //   35	59	70	finally
    //   15	35	79	android/os/RemoteException
    //   59	63	79	android/os/RemoteException
    //   72	79	79	android/os/RemoteException
    //   6	11	87	finally
    //   15	35	87	finally
    //   59	63	87	finally
    //   63	65	87	finally
    //   72	79	87	finally
    //   81	84	87	finally
  }
  
  public final Intent o()
  {
    k();
    Intent localIntent = new Intent("com.google.android.gms.games.VIEW_ACHIEVEMENTS");
    localIntent.addFlags(67108864);
    localIntent.setData(Uri.fromParts("version", Integer.toString(4030500), null));
    return localIntent;
  }
  
  public final void p()
  {
    if (d()) {}
    try
    {
      ((dq)l()).c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      dm.a();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dj
 * JD-Core Version:    0.7.0.1
 */