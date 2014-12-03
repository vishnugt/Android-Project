package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class k
  implements Parcelable.Creator<ProxyCard>
{
  static void a(ProxyCard paramProxyCard, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramProxyCard.a());
    c.a(paramParcel, 2, paramProxyCard.a, false);
    c.a(paramParcel, 3, paramProxyCard.b, false);
    c.b(paramParcel, 4, paramProxyCard.c);
    c.b(paramParcel, 5, paramProxyCard.d);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.k
 * JD-Core Version:    0.7.0.1
 */