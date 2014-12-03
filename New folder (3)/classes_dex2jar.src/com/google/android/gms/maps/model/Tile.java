package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.a.b;

public final class Tile
  implements SafeParcelable
{
  public static final j CREATOR = new j();
  public final int a;
  public final int b;
  public final byte[] c;
  private final int d;
  
  public Tile()
  {
    this(1, -1, -1, null);
  }
  
  Tile(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.d = paramInt1;
    this.a = paramInt2;
    this.b = paramInt3;
    this.c = paramArrayOfByte;
  }
  
  final int a()
  {
    return this.d;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (b.a())
    {
      int i = c.a(paramParcel, 20293);
      c.b(paramParcel, 1, this.d);
      c.b(paramParcel, 2, this.a);
      c.b(paramParcel, 3, this.b);
      c.a(paramParcel, this.c);
      c.b(paramParcel, i);
      return;
    }
    j.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.Tile
 * JD-Core Version:    0.7.0.1
 */