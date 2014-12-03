package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class i
  implements Parcelable.Creator<NotifyTransactionStatusRequest>
{
  static void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramNotifyTransactionStatusRequest.a);
    c.a(paramParcel, 2, paramNotifyTransactionStatusRequest.b, false);
    c.b(paramParcel, 3, paramNotifyTransactionStatusRequest.c);
    c.a(paramParcel, 4, paramNotifyTransactionStatusRequest.d, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.i
 * JD-Core Version:    0.7.0.1
 */