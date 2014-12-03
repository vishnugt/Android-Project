package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class v
  implements SafeParcelable
{
  public static final ex CREATOR = new ex();
  public final int a;
  public final long b;
  public final Bundle c;
  public final int d;
  public final List<String> e;
  public final boolean f;
  public final int g;
  
  v(int paramInt1, long paramLong, Bundle paramBundle, int paramInt2, List<String> paramList, boolean paramBoolean, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramLong;
    this.c = paramBundle;
    this.d = paramInt2;
    this.e = paramList;
    this.f = paramBoolean;
    this.g = paramInt3;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ex.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.v
 * JD-Core Version:    0.7.0.1
 */