package com.google.android.gms.internal;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;

final class s
{
  public final int a;
  public final ViewGroup.LayoutParams b;
  public final ViewGroup c;
  
  public s(ax paramax)
  {
    this.b = paramax.getLayoutParams();
    ViewParent localViewParent = paramax.getParent();
    if ((localViewParent instanceof ViewGroup))
    {
      this.c = ((ViewGroup)localViewParent);
      this.a = this.c.indexOfChild(paramax);
      this.c.removeView(paramax);
      paramax.a(true);
      return;
    }
    throw new r("Could not get the parent of the WebView for an overlay.");
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.s
 * JD-Core Version:    0.7.0.1
 */