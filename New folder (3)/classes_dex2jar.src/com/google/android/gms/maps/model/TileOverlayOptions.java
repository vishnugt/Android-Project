package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.a.a;

public final class TileOverlayOptions
  implements SafeParcelable
{
  public static final l CREATOR = new l();
  private final int a;
  private a b;
  private m c;
  private boolean d = true;
  private float e;
  
  public TileOverlayOptions()
  {
    this.a = 1;
  }
  
  TileOverlayOptions(int paramInt, IBinder paramIBinder, boolean paramBoolean, float paramFloat)
  {
    this.a = paramInt;
    this.b = com.google.android.gms.maps.model.a.b.a(paramIBinder);
    if (this.b == null) {}
    for (k localk = null;; localk = new k(this))
    {
      this.c = localk;
      this.d = paramBoolean;
      this.e = paramFloat;
      return;
    }
  }
  
  final int a()
  {
    return this.a;
  }
  
  final IBinder b()
  {
    return this.b.asBinder();
  }
  
  public final float c()
  {
    return this.e;
  }
  
  public final boolean d()
  {
    return this.d;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (com.google.android.gms.maps.a.b.a())
    {
      int i = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.a);
      c.a(paramParcel, 2, b());
      c.a(paramParcel, 3, this.d);
      c.a(paramParcel, 4, this.e);
      c.b(paramParcel, i);
      return;
    }
    l.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.TileOverlayOptions
 * JD-Core Version:    0.7.0.1
 */