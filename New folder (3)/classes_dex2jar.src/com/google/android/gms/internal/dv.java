package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;

public class dv
{
  protected dj a;
  protected dx b;
  
  private dv(dj paramdj, int paramInt)
  {
    this.a = paramdj;
    a(paramInt);
  }
  
  public static dv a(dj paramdj, int paramInt)
  {
    if (dh.a(12)) {
      return new dy(paramdj, paramInt);
    }
    return new dv(paramdj, paramInt);
  }
  
  public void a()
  {
    this.a.a(this.b.a, this.b.a());
  }
  
  protected void a(int paramInt)
  {
    this.b = new dx(paramInt, new Binder(), (byte)0);
  }
  
  public void a(View paramView) {}
  
  public final Bundle b()
  {
    return this.b.a();
  }
  
  public final IBinder c()
  {
    return this.b.a;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dv
 * JD-Core Version:    0.7.0.1
 */