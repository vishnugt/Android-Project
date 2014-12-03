package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

final class ce
{
  final String a;
  final cf b;
  final HashSet<bx<?>.cb> c;
  int d;
  boolean e;
  IBinder f;
  ComponentName g;
  
  public ce(cd paramcd, String paramString)
  {
    this.a = paramString;
    this.b = new cf(this);
    this.c = new HashSet();
    this.d = 0;
  }
  
  public final void a(bx<?>.cb parambx)
  {
    this.c.add(parambx);
  }
  
  public final boolean b(bx<?>.cb parambx)
  {
    return this.c.contains(parambx);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ce
 * JD-Core Version:    0.7.0.1
 */