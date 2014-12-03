package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class f
  implements Parcelable.Creator<LoyaltyWalletObject>
{
  static void a(LoyaltyWalletObject paramLoyaltyWalletObject, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramLoyaltyWalletObject.a());
    c.a(paramParcel, 2, paramLoyaltyWalletObject.a, false);
    c.a(paramParcel, 3, paramLoyaltyWalletObject.b, false);
    c.a(paramParcel, 4, paramLoyaltyWalletObject.c, false);
    c.a(paramParcel, 5, paramLoyaltyWalletObject.d, false);
    c.a(paramParcel, 6, paramLoyaltyWalletObject.e, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.f
 * JD-Core Version:    0.7.0.1
 */