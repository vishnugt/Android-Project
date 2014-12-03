package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LoyaltyWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new f();
  String a;
  String b;
  String c;
  String d;
  String e;
  private final int f;
  
  public LoyaltyWalletObject()
  {
    this.f = 2;
  }
  
  LoyaltyWalletObject(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.f = paramInt;
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
  }
  
  public final int a()
  {
    return this.f;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.LoyaltyWalletObject
 * JD-Core Version:    0.7.0.1
 */