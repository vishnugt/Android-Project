package android.support.v4.app;

import android.support.v4.c.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class r
  extends p
{
  static boolean a = false;
  final c<s> b = new c();
  final c<s> c = new c();
  FragmentActivity d;
  boolean e;
  boolean f;
  boolean g;
  
  r(FragmentActivity paramFragmentActivity, boolean paramBoolean)
  {
    this.d = paramFragmentActivity;
    this.e = paramBoolean;
  }
  
  private s b(q<Object> paramq)
  {
    try
    {
      this.g = true;
      s locals = new s(this, paramq);
      locals.d = paramq.onCreateLoader(0, null);
      a(locals);
      return locals;
    }
    finally
    {
      this.g = false;
    }
  }
  
  public final <D> android.support.v4.a.a<D> a(q<D> paramq)
  {
    if (this.g) {
      throw new IllegalStateException("Called while creating a loader");
    }
    s locals = (s)this.b.a(0);
    if (a) {
      new StringBuilder("initLoader in ").append(this).append(": args=").append(null).toString();
    }
    if (locals == null)
    {
      locals = b(paramq);
      if (a) {
        new StringBuilder("  Created new loader ").append(locals).toString();
      }
    }
    for (;;)
    {
      if ((locals.e) && (this.e)) {
        locals.b(locals.d, locals.g);
      }
      return locals.d;
      if (a) {
        new StringBuilder("  Re-using existing loader ").append(locals).toString();
      }
      locals.c = paramq;
    }
  }
  
  final void a(FragmentActivity paramFragmentActivity)
  {
    this.d = paramFragmentActivity;
  }
  
  final void a(s params)
  {
    this.b.a(params.a, params);
    if (this.e) {
      params.a();
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    if (this.b.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      String str2 = paramString + "    ";
      for (int j = 0; j < this.b.a(); j++)
      {
        s locals2 = (s)this.b.e(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.d(j));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(locals2.toString());
        locals2.a(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
    if (this.c.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      String str1 = paramString + "    ";
      while (i < this.c.a())
      {
        s locals1 = (s)this.c.e(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.c.d(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(locals1.toString());
        locals1.a(str1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i++;
      }
    }
  }
  
  public final boolean a()
  {
    int i = this.b.a();
    int j = 0;
    boolean bool1 = false;
    if (j < i)
    {
      s locals = (s)this.b.e(j);
      if ((locals.h) && (!locals.f)) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        bool1 |= bool2;
        j++;
        break;
      }
    }
    return bool1;
  }
  
  final void b()
  {
    if (a) {
      new StringBuilder("Starting in ").append(this).toString();
    }
    if (this.e)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStart when already started: ").append(this).toString();
    }
    for (;;)
    {
      return;
      this.e = true;
      for (int i = -1 + this.b.a(); i >= 0; i--) {
        ((s)this.b.e(i)).a();
      }
    }
  }
  
  final void c()
  {
    if (a) {
      new StringBuilder("Stopping in ").append(this).toString();
    }
    if (!this.e)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStop when not started: ").append(this).toString();
      return;
    }
    for (int i = -1 + this.b.a(); i >= 0; i--) {
      ((s)this.b.e(i)).b();
    }
    this.e = false;
  }
  
  final void d()
  {
    if (a) {
      new StringBuilder("Retaining in ").append(this).toString();
    }
    if (!this.e)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doRetain when not started: ").append(this).toString();
    }
    for (;;)
    {
      return;
      this.f = true;
      this.e = false;
      for (int i = -1 + this.b.a(); i >= 0; i--)
      {
        s locals = (s)this.b.e(i);
        if (a) {
          new StringBuilder("  Retaining: ").append(locals).toString();
        }
        locals.i = true;
        locals.j = locals.h;
        locals.h = false;
        locals.c = null;
      }
    }
  }
  
  final void e()
  {
    if (this.f)
    {
      if (a) {
        new StringBuilder("Finished Retaining in ").append(this).toString();
      }
      this.f = false;
      for (int i = -1 + this.b.a(); i >= 0; i--)
      {
        s locals = (s)this.b.e(i);
        if (locals.i)
        {
          if (a) {
            new StringBuilder("  Finished Retaining: ").append(locals).toString();
          }
          locals.i = false;
          if ((locals.h != locals.j) && (!locals.h)) {
            locals.b();
          }
        }
        if ((locals.h) && (locals.e) && (!locals.k)) {
          locals.b(locals.d, locals.g);
        }
      }
    }
  }
  
  final void f()
  {
    for (int i = -1 + this.b.a(); i >= 0; i--) {
      ((s)this.b.e(i)).k = true;
    }
  }
  
  final void g()
  {
    for (int i = -1 + this.b.a(); i >= 0; i--)
    {
      s locals = (s)this.b.e(i);
      if ((locals.h) && (locals.k))
      {
        locals.k = false;
        if (locals.e) {
          locals.b(locals.d, locals.g);
        }
      }
    }
  }
  
  final void h()
  {
    if (!this.f)
    {
      if (a) {
        new StringBuilder("Destroying Active in ").append(this).toString();
      }
      for (int j = -1 + this.b.a(); j >= 0; j--) {
        ((s)this.b.e(j)).c();
      }
    }
    if (a) {
      new StringBuilder("Destroying Inactive in ").append(this).toString();
    }
    for (int i = -1 + this.c.a(); i >= 0; i--) {
      ((s)this.c.e(i)).c();
    }
    this.c.b();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    android.support.v4.c.a.a(this.d, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.r
 * JD-Core Version:    0.7.0.1
 */