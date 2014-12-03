package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class dr
  implements SafeParcelable
{
  public static final ct CREATOR = new ct();
  private final int a;
  private final dt b;
  
  dr(int paramInt, dt paramdt)
  {
    this.a = paramInt;
    this.b = paramdt;
  }
  
  private dr(dt paramdt)
  {
    this.a = 1;
    this.b = paramdt;
  }
  
  public static dr a(cw<?, ?> paramcw)
  {
    if ((paramcw instanceof dt)) {
      return new dr((dt)paramcw);
    }
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }
  
  final int a()
  {
    return this.a;
  }
  
  final dt b()
  {
    return this.b;
  }
  
  public final cw<?, ?> c()
  {
    if (this.b != null) {
      return this.b;
    }
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ct.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dr
 * JD-Core Version:    0.7.0.1
 */