package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard
  implements SafeParcelable
{
  public static final Parcelable.Creator<ProxyCard> CREATOR = new k();
  String a;
  String b;
  int c;
  int d;
  private final int e;
  
  ProxyCard(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.e = paramInt1;
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public final int a()
  {
    return this.e;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.ProxyCard
 * JD-Core Version:    0.7.0.1
 */