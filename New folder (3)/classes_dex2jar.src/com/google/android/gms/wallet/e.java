package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class e
  implements Parcelable.Creator<LineItem>
{
  static void a(LineItem paramLineItem, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramLineItem.a());
    c.a(paramParcel, 2, paramLineItem.a, false);
    c.a(paramParcel, 3, paramLineItem.b, false);
    c.a(paramParcel, 4, paramLineItem.c, false);
    c.a(paramParcel, 5, paramLineItem.d, false);
    c.b(paramParcel, 6, paramLineItem.e);
    c.a(paramParcel, 7, paramLineItem.f, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.e
 * JD-Core Version:    0.7.0.1
 */