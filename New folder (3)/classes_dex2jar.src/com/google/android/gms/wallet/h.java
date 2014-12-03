package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class h
  implements Parcelable.Creator<MaskedWalletRequest>
{
  static void a(MaskedWalletRequest paramMaskedWalletRequest, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramMaskedWalletRequest.a());
    c.a(paramParcel, 2, paramMaskedWalletRequest.a, false);
    c.a(paramParcel, 3, paramMaskedWalletRequest.b);
    c.a(paramParcel, 4, paramMaskedWalletRequest.c);
    c.a(paramParcel, 5, paramMaskedWalletRequest.d);
    c.a(paramParcel, 6, paramMaskedWalletRequest.e, false);
    c.a(paramParcel, 7, paramMaskedWalletRequest.f, false);
    c.a(paramParcel, 8, paramMaskedWalletRequest.g, false);
    c.a(paramParcel, 9, paramMaskedWalletRequest.h, paramInt, false);
    c.a(paramParcel, 10, paramMaskedWalletRequest.i);
    c.a(paramParcel, 11, paramMaskedWalletRequest.j);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.h
 * JD-Core Version:    0.7.0.1
 */