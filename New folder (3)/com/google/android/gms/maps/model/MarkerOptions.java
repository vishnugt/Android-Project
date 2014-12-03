package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

public final class MarkerOptions
  implements SafeParcelable
{
  public static final g CREATOR = new g();
  private final int a;
  private LatLng b;
  private String c;
  private String d;
  private a e;
  private float f = 0.5F;
  private float g = 1.0F;
  private boolean h;
  private boolean i = true;
  private boolean j = false;
  private float k = 0.0F;
  private float l = 0.5F;
  private float m = 0.0F;
  private float n = 1.0F;
  
  public MarkerOptions()
  {
    this.a = 1;
  }
  
  MarkerOptions(int paramInt, LatLng paramLatLng, String paramString1, String paramString2, IBinder paramIBinder, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    this.a = paramInt;
    this.b = paramLatLng;
    this.c = paramString1;
    this.d = paramString2;
    if (paramIBinder == null) {}
    for (a locala = null;; locala = new a(com.google.android.gms.a.b.a(paramIBinder)))
    {
      this.e = locala;
      this.f = paramFloat1;
      this.g = paramFloat2;
      this.h = paramBoolean1;
      this.i = paramBoolean2;
      this.j = paramBoolean3;
      this.k = paramFloat3;
      this.l = paramFloat4;
      this.m = paramFloat5;
      this.n = paramFloat6;
      return;
    }
  }
  
  final int a()
  {
    return this.a;
  }
  
  final IBinder b()
  {
    if (this.e == null) {
      return null;
    }
    return this.e.a.asBinder();
  }
  
  public final LatLng c()
  {
    return this.b;
  }
  
  public final String d()
  {
    return this.c;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String e()
  {
    return this.d;
  }
  
  public final float f()
  {
    return this.f;
  }
  
  public final float g()
  {
    return this.g;
  }
  
  public final boolean h()
  {
    return this.h;
  }
  
  public final boolean i()
  {
    return this.i;
  }
  
  public final boolean j()
  {
    return this.j;
  }
  
  public final float k()
  {
    return this.k;
  }
  
  public final float l()
  {
    return this.l;
  }
  
  public final float m()
  {
    return this.m;
  }
  
  public final float n()
  {
    return this.n;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (com.google.android.gms.maps.a.b.a())
    {
      int i1 = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.a);
      c.a(paramParcel, 2, this.b, paramInt, false);
      c.a(paramParcel, 3, this.c, false);
      c.a(paramParcel, 4, this.d, false);
      c.a(paramParcel, 5, b());
      c.a(paramParcel, 6, this.f);
      c.a(paramParcel, 7, this.g);
      c.a(paramParcel, 8, this.h);
      c.a(paramParcel, 9, this.i);
      c.b(paramParcel, i1);
      return;
    }
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.MarkerOptions
 * JD-Core Version:    0.7.0.1
 */