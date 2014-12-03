package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class dt$a
  implements SafeParcelable
{
  public static final cv CREATOR = new cv();
  final int a;
  final String b;
  final int c;
  
  dt$a(int paramInt1, String paramString, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
  }
  
  dt$a(String paramString, int paramInt)
  {
    this.a = 1;
    this.b = paramString;
    this.c = paramInt;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cv.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dt.a
 * JD-Core Version:    0.7.0.1
 */