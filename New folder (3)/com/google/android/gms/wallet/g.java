package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class g
  implements Parcelable.Creator<MaskedWallet>
{
  static void a(MaskedWallet paramMaskedWallet, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramMaskedWallet.a());
    c.a(paramParcel, 2, paramMaskedWallet.a, false);
    c.a(paramParcel, 3, paramMaskedWallet.b, false);
    c.a(paramParcel, 4, paramMaskedWallet.c);
    c.a(paramParcel, 5, paramMaskedWallet.d, false);
    c.a(paramParcel, 6, paramMaskedWallet.e, paramInt, false);
    c.a(paramParcel, 7, paramMaskedWallet.f, paramInt, false);
    c.a(paramParcel, 8, paramMaskedWallet.g, paramInt);
    c.a(paramParcel, 9, paramMaskedWallet.h, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.g
 * JD-Core Version:    0.7.0.1
 */