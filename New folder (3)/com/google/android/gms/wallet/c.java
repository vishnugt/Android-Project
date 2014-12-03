package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class c
  implements Parcelable.Creator<FullWallet>
{
  static void a(FullWallet paramFullWallet, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, 1, paramFullWallet.a());
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 2, paramFullWallet.a, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 3, paramFullWallet.b, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 4, paramFullWallet.c, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 5, paramFullWallet.d, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 6, paramFullWallet.e, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 7, paramFullWallet.f, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 8, paramFullWallet.g);
    com.google.android.gms.common.internal.safeparcel.c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.c
 * JD-Core Version:    0.7.0.1
 */