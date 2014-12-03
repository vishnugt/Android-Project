package com.chartboost.sdk;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

class Chartboost$b
  extends WeakReference<Activity>
{
  private int a;
  
  public Chartboost$b(Activity paramActivity)
  {
    super(paramActivity);
    this.a = paramActivity.hashCode();
  }
  
  public int a()
  {
    return this.a;
  }
  
  public boolean a(Activity paramActivity)
  {
    if (paramActivity == null) {}
    while (paramActivity.hashCode() != this.a) {
      return false;
    }
    return true;
  }
  
  public boolean a(b paramb)
  {
    if (paramb == null) {}
    while (paramb.a() != this.a) {
      return false;
    }
    return true;
  }
  
  public Context b()
  {
    Context localContext = (Context)get();
    if (localContext == null) {
      localContext = Chartboost.sharedChartboost().getContext();
    }
    return localContext;
  }
  
  public int hashCode()
  {
    return a();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Chartboost.b
 * JD-Core Version:    0.7.0.1
 */