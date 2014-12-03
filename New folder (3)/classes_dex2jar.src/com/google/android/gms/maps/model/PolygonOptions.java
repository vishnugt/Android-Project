package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.a.b;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions
  implements SafeParcelable
{
  public static final h CREATOR = new h();
  private final int a;
  private final List<LatLng> b;
  private final List<List<LatLng>> c;
  private float d = 10.0F;
  private int e = -16777216;
  private int f = 0;
  private float g = 0.0F;
  private boolean h = true;
  private boolean i = false;
  
  public PolygonOptions()
  {
    this.a = 1;
    this.b = new ArrayList();
    this.c = new ArrayList();
  }
  
  PolygonOptions(int paramInt1, List<LatLng> paramList, List paramList1, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramList1;
    this.d = paramFloat1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramFloat2;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
  }
  
  final int a()
  {
    return this.a;
  }
  
  final List b()
  {
    return this.c;
  }
  
  public final List<LatLng> c()
  {
    return this.b;
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
  
  public final boolean i()
  {
    return this.i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (b.a())
    {
      int j = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.a);
      c.b(paramParcel, 2, this.b, false);
      c.a(paramParcel, this.c);
      c.a(paramParcel, 4, this.d);
      c.b(paramParcel, 5, this.e);
      c.b(paramParcel, 6, this.f);
      c.a(paramParcel, 7, this.g);
      c.a(paramParcel, 8, this.h);
      c.a(paramParcel, 9, this.i);
      c.b(paramParcel, j);
      return;
    }
    h.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.PolygonOptions
 * JD-Core Version:    0.7.0.1
 */