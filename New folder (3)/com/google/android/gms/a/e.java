package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.cr;

public abstract class e<T>
{
  private final String a;
  private T b;
  
  public e(String paramString)
  {
    this.a = paramString;
  }
  
  protected final T a(Context paramContext)
  {
    ClassLoader localClassLoader;
    if (this.b == null)
    {
      cr.a(paramContext);
      Context localContext = g.c(paramContext);
      if (localContext == null) {
        throw new f("Could not get remote context.");
      }
      localClassLoader = localContext.getClassLoader();
    }
    try
    {
      this.b = a((IBinder)localClassLoader.loadClass(this.a).newInstance());
      return this.b;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new f("Could not load creator class.");
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new f("Could not instantiate creator.");
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new f("Could not access creator.");
    }
  }
  
  protected abstract T a(IBinder paramIBinder);
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.a.e
 * JD-Core Version:    0.7.0.1
 */