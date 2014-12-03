package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class dd
  implements SafeParcelable
{
  private static final Object b = new Object();
  private static ClassLoader c = null;
  private static Integer d = null;
  public boolean a = false;
  
  private static ClassLoader a()
  {
    synchronized (b)
    {
      ClassLoader localClassLoader = c;
      return localClassLoader;
    }
  }
  
  private static boolean a(Class<?> paramClass)
  {
    try
    {
      boolean bool = "SAFE_PARCELABLE_NULL_STRING".equals(paramClass.getField("NULL").get(null));
      return bool;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return false;
    }
    catch (NoSuchFieldException localNoSuchFieldException) {}
    return false;
  }
  
  protected static boolean b(String paramString)
  {
    ClassLoader localClassLoader = a();
    if (localClassLoader == null) {
      return true;
    }
    try
    {
      boolean bool = a(localClassLoader.loadClass(paramString));
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  protected static Integer s()
  {
    synchronized (b)
    {
      Integer localInteger = d;
      return localInteger;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dd
 * JD-Core Version:    0.7.0.1
 */