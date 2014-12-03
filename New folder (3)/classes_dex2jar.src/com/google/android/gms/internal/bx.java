package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.g;
import java.util.ArrayList;

public abstract class bx<T extends IInterface>
  implements b
{
  public static final String[] g = { "service_esmobile", "service_googleme" };
  final Context a;
  final Handler b;
  final ArrayList<c> c = new ArrayList();
  final String[] d;
  boolean e = false;
  boolean f = false;
  private T h;
  private ArrayList<c> i;
  private boolean j = false;
  private ArrayList<d> k;
  private boolean l = false;
  private final ArrayList<bx<T>.bz<?>> m = new ArrayList();
  private bx<T>.cb n;
  private final Object o = new Object();
  
  protected bx(Context paramContext, c paramc, d paramd, String... paramVarArgs)
  {
    this.a = ((Context)cr.a(paramContext));
    this.i = new ArrayList();
    this.i.add(cr.a(paramc));
    this.k = new ArrayList();
    this.k.add(cr.a(paramd));
    this.b = new by(this, paramContext.getMainLooper());
    a(paramVarArgs);
    this.d = paramVarArgs;
  }
  
  protected abstract T a(IBinder paramIBinder);
  
  protected abstract String a();
  
  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    this.b.sendMessage(this.b.obtainMessage(1, new cc(this, paramInt, paramIBinder, paramBundle)));
  }
  
  protected void a(a parama)
  {
    this.b.removeMessages(4);
    for (;;)
    {
      int i2;
      synchronized (this.k)
      {
        this.l = true;
        ArrayList localArrayList2 = this.k;
        int i1 = localArrayList2.size();
        i2 = 0;
        if (i2 < i1)
        {
          if (!this.e) {
            return;
          }
          if (this.k.contains(localArrayList2.get(i2))) {
            ((d)localArrayList2.get(i2)).onConnectionFailed(parama);
          }
        }
        else
        {
          this.l = false;
          return;
        }
      }
      i2++;
    }
  }
  
  public final void a(bx<T>.bz<?> parambx)
  {
    synchronized (this.m)
    {
      this.m.add(parambx);
      this.b.sendMessage(this.b.obtainMessage(2, parambx));
      return;
    }
  }
  
  protected abstract void a(cl paramcl, ca paramca);
  
  protected void a(String... paramVarArgs) {}
  
  protected abstract String b();
  
  protected final void b(IBinder paramIBinder)
  {
    try
    {
      a(cm.a(paramIBinder), new ca(this));
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  public void c()
  {
    this.e = true;
    do
    {
      synchronized (this.o)
      {
        this.f = true;
        int i1 = g.a(this.a);
        if (i1 != 0)
        {
          this.b.sendMessage(this.b.obtainMessage(3, Integer.valueOf(i1)));
          return;
        }
      }
      if (this.n != null)
      {
        this.h = null;
        cd.a(this.a).b(a(), this.n);
      }
      this.n = new cb(this);
    } while (cd.a(this.a).a(a(), this.n));
    new StringBuilder("unable to connect to service: ").append(a()).toString();
    this.b.sendMessage(this.b.obtainMessage(3, Integer.valueOf(9)));
  }
  
  public final boolean d()
  {
    return this.h != null;
  }
  
  public final boolean e()
  {
    synchronized (this.o)
    {
      boolean bool = this.f;
      return bool;
    }
  }
  
  public void f()
  {
    this.e = false;
    synchronized (this.o)
    {
      this.f = false;
    }
    synchronized (this.m)
    {
      int i1 = this.m.size();
      int i2 = 0;
      while (i2 < i1)
      {
        ((bz)this.m.get(i2)).c();
        i2++;
        continue;
        localObject2 = finally;
        throw localObject2;
      }
      this.m.clear();
      this.h = null;
      if (this.n != null)
      {
        cd.a(this.a).b(a(), this.n);
        this.n = null;
      }
      return;
    }
  }
  
  public final Context g()
  {
    return this.a;
  }
  
  protected void h()
  {
    boolean bool1 = true;
    for (;;)
    {
      int i2;
      synchronized (this.i)
      {
        if (this.j) {
          break label165;
        }
        bool2 = bool1;
        cr.a(bool2);
        this.b.removeMessages(4);
        this.j = true;
        if (this.c.size() != 0) {
          break label171;
        }
        cr.a(bool1);
        Bundle localBundle = i();
        ArrayList localArrayList2 = this.i;
        int i1 = localArrayList2.size();
        i2 = 0;
        if ((i2 < i1) && (this.e) && (d()))
        {
          this.c.size();
          if (!this.c.contains(localArrayList2.get(i2))) {
            ((c)localArrayList2.get(i2)).onConnected(localBundle);
          }
        }
        else
        {
          this.c.clear();
          this.j = false;
          return;
        }
      }
      i2++;
      continue;
      label165:
      boolean bool2 = false;
      continue;
      label171:
      bool1 = false;
    }
  }
  
  protected Bundle i()
  {
    return null;
  }
  
  protected final void j()
  {
    this.b.removeMessages(4);
    for (;;)
    {
      int i2;
      synchronized (this.i)
      {
        this.j = true;
        ArrayList localArrayList2 = this.i;
        int i1 = localArrayList2.size();
        i2 = 0;
        if ((i2 < i1) && (this.e))
        {
          if (this.i.contains(localArrayList2.get(i2))) {
            ((c)localArrayList2.get(i2)).onDisconnected();
          }
        }
        else
        {
          this.j = false;
          return;
        }
      }
      i2++;
    }
  }
  
  protected final void k()
  {
    if (!d()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  protected final T l()
  {
    k();
    return this.h;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bx
 * JD-Core Version:    0.7.0.1
 */