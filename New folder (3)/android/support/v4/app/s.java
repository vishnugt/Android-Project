package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.a.b;
import android.support.v4.c.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class s
  implements b<Object>
{
  final int a = 0;
  final Bundle b = null;
  q<Object> c;
  android.support.v4.a.a<Object> d;
  boolean e;
  boolean f;
  Object g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  boolean m;
  s n;
  
  public s(int paramInt)
  {
    Object localObject;
    this.c = localObject;
  }
  
  final void a()
  {
    if ((this.i) && (this.j)) {
      this.h = true;
    }
    do
    {
      do
      {
        return;
      } while (this.h);
      this.h = true;
      if (r.a) {
        new StringBuilder("  Starting: ").append(this).toString();
      }
      if ((this.d == null) && (this.c != null)) {
        this.d = this.c.onCreateLoader(this.a, this.b);
      }
    } while (this.d == null);
    if ((this.d.getClass().isMemberClass()) && (!Modifier.isStatic(this.d.getClass().getModifiers()))) {
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
    }
    if (!this.m)
    {
      this.d.registerListener(this.a, this);
      this.m = true;
    }
    this.d.startLoading();
  }
  
  public final void a(android.support.v4.a.a<Object> parama, Object paramObject)
  {
    if (r.a) {
      new StringBuilder("onLoadComplete: ").append(this).toString();
    }
    if (this.l) {}
    do
    {
      return;
      if (this.o.b.a(this.a) != this) {
        return;
      }
      s locals1 = this.n;
      if (locals1 != null)
      {
        if (r.a) {
          new StringBuilder("  Switching to pending loader: ").append(locals1).toString();
        }
        this.n = null;
        this.o.b.a(this.a, null);
        c();
        this.o.a(locals1);
        return;
      }
      if ((this.g != paramObject) || (!this.e))
      {
        this.g = paramObject;
        this.e = true;
        if (this.h) {
          b(parama, paramObject);
        }
      }
      s locals2 = (s)this.o.c.a(this.a);
      if ((locals2 != null) && (locals2 != this))
      {
        locals2.f = false;
        locals2.c();
        this.o.c.b(this.a);
      }
    } while ((this.o.d == null) || (this.o.a()));
    this.o.d.b.b();
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    for (;;)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.a);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.b);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCallbacks=");
      paramPrintWriter.println(this.c);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.d);
      if (this.d != null) {
        this.d.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
      if ((this.e) || (this.f))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mHaveData=");
        paramPrintWriter.print(this.e);
        paramPrintWriter.print("  mDeliveredData=");
        paramPrintWriter.println(this.f);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mData=");
        paramPrintWriter.println(this.g);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.h);
      paramPrintWriter.print(" mReportNextStart=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(this.l);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mRetaining=");
      paramPrintWriter.print(this.i);
      paramPrintWriter.print(" mRetainingStarted=");
      paramPrintWriter.print(this.j);
      paramPrintWriter.print(" mListenerRegistered=");
      paramPrintWriter.println(this.m);
      if (this.n == null) {
        break;
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(this.n);
      paramPrintWriter.println(":");
      this = this.n;
      paramString = paramString + "  ";
    }
  }
  
  final void b()
  {
    if (r.a) {
      new StringBuilder("  Stopping: ").append(this).toString();
    }
    this.h = false;
    if ((!this.i) && (this.d != null) && (this.m))
    {
      this.m = false;
      this.d.unregisterListener(this);
      this.d.stopLoading();
    }
  }
  
  final void b(android.support.v4.a.a<Object> parama, Object paramObject)
  {
    String str2;
    if (this.c != null)
    {
      if (this.o.d == null) {
        break label156;
      }
      str2 = this.o.d.b.s;
      this.o.d.b.s = "onLoadFinished";
    }
    label156:
    for (String str1 = str2;; str1 = null) {
      try
      {
        if (r.a) {
          new StringBuilder("  onLoadFinished in ").append(parama).append(": ").append(parama.dataToString(paramObject)).toString();
        }
        this.c.onLoadFinished(parama, paramObject);
        if (this.o.d != null) {
          this.o.d.b.s = str1;
        }
        this.f = true;
        return;
      }
      finally
      {
        if (this.o.d != null) {
          this.o.d.b.s = str1;
        }
      }
    }
  }
  
  final void c()
  {
    if (r.a) {
      new StringBuilder("  Destroying: ").append(this).toString();
    }
    this.l = true;
    boolean bool = this.f;
    this.f = false;
    String str1;
    if ((this.c != null) && (this.d != null) && (this.e) && (bool))
    {
      if (r.a) {
        new StringBuilder("  Reseting: ").append(this).toString();
      }
      if (this.o.d == null) {
        break label260;
      }
      String str2 = this.o.d.b.s;
      this.o.d.b.s = "onLoaderReset";
      str1 = str2;
    }
    for (;;)
    {
      label260:
      try
      {
        this.c.onLoaderReset(this.d);
        if (this.o.d != null) {
          this.o.d.b.s = str1;
        }
        this.c = null;
        this.g = null;
        this.e = false;
        if (this.d != null)
        {
          if (this.m)
          {
            this.m = false;
            this.d.unregisterListener(this);
          }
          this.d.reset();
        }
        if (this.n != null) {
          this = this.n;
        }
      }
      finally
      {
        if (this.o.d != null) {
          this.o.d.b.s = str1;
        }
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.a);
    localStringBuilder.append(" : ");
    android.support.v4.c.a.a(this.d, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.s
 * JD-Core Version:    0.7.0.1
 */