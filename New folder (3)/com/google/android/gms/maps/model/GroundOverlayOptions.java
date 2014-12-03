package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

public final class GroundOverlayOptions
  implements SafeParcelable
{
  public static final d CREATOR = new d();
  private final int a;
  private a b;
  private LatLng c;
  private float d;
  private float e;
  private LatLngBounds f;
  private float g;
  private float h;
  private boolean i = true;
  private float j = 0.0F;
  private float k = 0.5F;
  private float l = 0.5F;
  
  public GroundOverlayOptions()
  {
    this.a = 1;
  }
  
  GroundOverlayOptions(int paramInt, IBinder paramIBinder, LatLng paramLatLng, float paramFloat1, float paramFloat2, LatLngBounds paramLatLngBounds, float paramFloat3, float paramFloat4, boolean paramBoolean, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    this.a = paramInt;
    this.b = new a(com.google.android.gms.a.b.a(paramIBinder));
    this.c = paramLatLng;
    this.d = paramFloat1;
    this.e = paramFloat2;
    this.f = paramLatLngBounds;
    this.g = paramFloat3;
    this.h = paramFloat4;
    this.i = paramBoolean;
    this.j = paramFloat5;
    this.k = paramFloat6;
    this.l = paramFloat7;
  }
  
  final IBinder a()
  {
    return this.b.a.asBinder();
  }
  
  final int b()
  {
    return this.a;
  }
  
  public final LatLng c()
  {
    return this.c;
  }
  
  public final float d()
  {
    return this.d;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final float e()
  {
    return this.e;
  }
  
  public final LatLngBounds f()
  {
    return this.f;
  }
  
  public final float g()
  {
    return this.g;
  }
  
  public final float h()
  {
    return this.h;
  }
  
  public final float i()
  {
    return this.j;
  }
  
  public final float j()
  {
    return this.k;
  }
  
  public final float k()
  {
    return this.l;
  }
  
  public final boolean l()
  {
    return this.i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (com.google.android.gms.maps.a.b.a())
    {
      int m = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.a);
      c.a(paramParcel, 2, a());
      c.a(paramParcel, 3, this.c, paramInt, false);
      c.a(paramParcel, 4, this.d);
      c.a(paramParcel, 5, this.e);
      c.a(paramParcel, 6, this.f, paramInt, false);
      c.a(paramParcel, 7, this.g);
      c.a(paramParcel, 8, this.h);
      c.a(paramParcel, 9, this.i);
      c.a(paramParcel, 10, this.j);
      c.a(paramParcel, 11, this.k);
      c.a(paramParcel, 12, this.l);
      c.b(paramParcel, m);
      return;
    }
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.GroundOverlayOptions
 * JD-Core Version:    0.7.0.1
 */