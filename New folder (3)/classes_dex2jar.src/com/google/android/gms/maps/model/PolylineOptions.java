package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.a.b;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions
  implements SafeParcelable
{
  public static final i CREATOR = new i();
  private final int a;
  private final List<LatLng> b;
  private float c = 10.0F;
  private int d = -16777216;
  private float e = 0.0F;
  private boolean f = true;
  private boolean g = false;
  
  public PolylineOptions()
  {
    this.a = 1;
    this.b = new ArrayList();
  }
  
  PolylineOptions(int paramInt1, List paramList, float paramFloat1, int paramInt2, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramFloat1;
    this.d = paramInt2;
    this.e = paramFloat2;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
  }
  
  final int a()
  {
    return this.a;
  }
  
  public final List<LatLng> b()
  {
    return this.b;
  }
  
  public final float c()
  {
    return this.c;
  }
  
  public final int d()
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
  
  public final boolean f()
  {
    return this.f;
  }
  
  public final boolean g()
  {
    return this.g;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (b.a())
    {
      int i = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.a);
      c.b(paramParcel, 2, this.b, false);
      c.a(paramParcel, 3, this.c);
      c.b(paramParcel, 4, this.d);
      c.a(paramParcel, 5, this.e);
      c.a(paramParcel, 6, this.f);
      c.a(paramParcel, 7, this.g);
      c.b(paramParcel, i);
      return;
    }
    i.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.PolylineOptions
 * JD-Core Version:    0.7.0.1
 */