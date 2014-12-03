package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions
  implements SafeParcelable
{
  public static final a CREATOR = new a();
  private final int a;
  private Boolean b;
  private Boolean c;
  private int d = -1;
  private CameraPosition e;
  private Boolean f;
  private Boolean g;
  private Boolean h;
  private Boolean i;
  private Boolean j;
  private Boolean k;
  
  public GoogleMapOptions()
  {
    this.a = 1;
  }
  
  GoogleMapOptions(int paramInt1, byte paramByte1, byte paramByte2, int paramInt2, CameraPosition paramCameraPosition, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8)
  {
    this.a = paramInt1;
    this.b = com.google.android.gms.maps.a.a.a(paramByte1);
    this.c = com.google.android.gms.maps.a.a.a(paramByte2);
    this.d = paramInt2;
    this.e = paramCameraPosition;
    this.f = com.google.android.gms.maps.a.a.a(paramByte3);
    this.g = com.google.android.gms.maps.a.a.a(paramByte4);
    this.h = com.google.android.gms.maps.a.a.a(paramByte5);
    this.i = com.google.android.gms.maps.a.a.a(paramByte6);
    this.j = com.google.android.gms.maps.a.a.a(paramByte7);
    this.k = com.google.android.gms.maps.a.a.a(paramByte8);
  }
  
  final int a()
  {
    return this.a;
  }
  
  final byte b()
  {
    return com.google.android.gms.maps.a.a.a(this.b);
  }
  
  final byte c()
  {
    return com.google.android.gms.maps.a.a.a(this.c);
  }
  
  final byte d()
  {
    return com.google.android.gms.maps.a.a.a(this.f);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  final byte e()
  {
    return com.google.android.gms.maps.a.a.a(this.g);
  }
  
  final byte f()
  {
    return com.google.android.gms.maps.a.a.a(this.h);
  }
  
  final byte g()
  {
    return com.google.android.gms.maps.a.a.a(this.i);
  }
  
  final byte h()
  {
    return com.google.android.gms.maps.a.a.a(this.j);
  }
  
  final byte i()
  {
    return com.google.android.gms.maps.a.a.a(this.k);
  }
  
  public final int j()
  {
    return this.d;
  }
  
  public final CameraPosition k()
  {
    return this.e;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (b.a())
    {
      int m = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.a);
      c.a(paramParcel, 2, com.google.android.gms.maps.a.a.a(this.b));
      c.a(paramParcel, 3, com.google.android.gms.maps.a.a.a(this.c));
      c.b(paramParcel, 4, this.d);
      c.a(paramParcel, 5, this.e, paramInt, false);
      c.a(paramParcel, 6, com.google.android.gms.maps.a.a.a(this.f));
      c.a(paramParcel, 7, com.google.android.gms.maps.a.a.a(this.g));
      c.a(paramParcel, 8, com.google.android.gms.maps.a.a.a(this.h));
      c.a(paramParcel, 9, com.google.android.gms.maps.a.a.a(this.i));
      c.a(paramParcel, 10, com.google.android.gms.maps.a.a.a(this.j));
      c.a(paramParcel, 11, com.google.android.gms.maps.a.a.a(this.k));
      c.b(paramParcel, m);
      return;
    }
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.GoogleMapOptions
 * JD-Core Version:    0.7.0.1
 */