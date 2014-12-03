package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;

public final class CircleOptions
  implements SafeParcelable
{
  public static final c CREATOR = new c();
  private final int a;
  private LatLng b = null;
  private double c = 0.0D;
  private float d = 10.0F;
  private int e = -16777216;
  private int f = 0;
  private float g = 0.0F;
  private boolean h = true;
  
  public CircleOptions()
  {
    this.a = 1;
  }
  
  CircleOptions(int paramInt1, LatLng paramLatLng, double paramDouble, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramLatLng;
    this.c = paramDouble;
    this.d = paramFloat1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramFloat2;
    this.h = paramBoolean;
  }
  
  final int a()
  {
    return this.a;
  }
  
  public final LatLng b()
  {
    return this.b;
  }
  
  public final double c()
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
  
  public final int e()
  {
    return this.e;
  }
  
  public final int f()
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
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (b.a())
    {
      int i = com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 20293);
      com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, 1, this.a);
      com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 2, this.b, paramInt, false);
      com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 3, this.c);
      com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 4, this.d);
      com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, 5, this.e);
      com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, 6, this.f);
      com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 7, this.g);
      com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 8, this.h);
      com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, i);
      return;
    }
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.CircleOptions
 * JD-Core Version:    0.7.0.1
 */