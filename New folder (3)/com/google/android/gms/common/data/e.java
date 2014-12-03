package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cr;
import java.util.Arrays;

public abstract class e
{
  protected final d a;
  protected final int b;
  private final int c;
  
  public e(d paramd, int paramInt)
  {
    this.a = ((d)cr.a(paramd));
    if ((paramInt >= 0) && (paramInt < paramd.g())) {}
    for (boolean bool = true;; bool = false)
    {
      cr.a(bool);
      this.b = paramInt;
      this.c = paramd.a(this.b);
      return;
    }
  }
  
  protected final long a(String paramString)
  {
    return this.a.a(paramString, this.b, this.c);
  }
  
  protected final int b(String paramString)
  {
    return this.a.b(paramString, this.b, this.c);
  }
  
  protected final boolean c(String paramString)
  {
    return this.a.d(paramString, this.b, this.c);
  }
  
  protected final String d(String paramString)
  {
    return this.a.c(paramString, this.b, this.c);
  }
  
  protected final Uri e(String paramString)
  {
    return this.a.e(paramString, this.b, this.c);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof e;
    boolean bool2 = false;
    if (bool1)
    {
      e locale = (e)paramObject;
      boolean bool3 = cp.a(Integer.valueOf(locale.b), Integer.valueOf(this.b));
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = cp.a(Integer.valueOf(locale.c), Integer.valueOf(this.c));
        bool2 = false;
        if (bool4)
        {
          d locald1 = locale.a;
          d locald2 = this.a;
          bool2 = false;
          if (locald1 == locald2) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  protected final boolean f(String paramString)
  {
    return this.a.f(paramString, this.b, this.c);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Integer.valueOf(this.c);
    arrayOfObject[2] = this.a;
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.e
 * JD-Core Version:    0.7.0.1
 */