package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class b
  implements Parcelable.Creator<Cart>
{
  static void a(Cart paramCart, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramCart.a());
    c.a(paramParcel, 2, paramCart.a, false);
    c.a(paramParcel, 3, paramCart.b, false);
    c.b(paramParcel, 4, paramCart.c, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.b
 * JD-Core Version:    0.7.0.1
 */