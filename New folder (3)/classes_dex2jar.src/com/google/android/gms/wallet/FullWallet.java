package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWallet
  implements SafeParcelable
{
  public static final Parcelable.Creator<FullWallet> CREATOR = new c();
  String a;
  String b;
  ProxyCard c;
  String d;
  Address e;
  Address f;
  String[] g;
  private final int h;
  
  public FullWallet()
  {
    this.h = 1;
  }
  
  FullWallet(int paramInt, String paramString1, String paramString2, ProxyCard paramProxyCard, String paramString3, Address paramAddress1, Address paramAddress2, String[] paramArrayOfString)
  {
    this.h = paramInt;
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramProxyCard;
    this.d = paramString3;
    this.e = paramAddress1;
    this.f = paramAddress2;
    this.g = paramArrayOfString;
  }
  
  public final int a()
  {
    return this.h;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.FullWallet
 * JD-Core Version:    0.7.0.1
 */