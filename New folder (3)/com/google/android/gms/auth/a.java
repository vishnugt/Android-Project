package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator<RecoveryDecision>
{
  static void a(RecoveryDecision paramRecoveryDecision, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramRecoveryDecision.a);
    c.a(paramParcel, 2, paramRecoveryDecision.b, paramInt, false);
    c.a(paramParcel, 3, paramRecoveryDecision.c);
    c.a(paramParcel, 4, paramRecoveryDecision.d);
    c.a(paramParcel, 5, paramRecoveryDecision.e);
    c.a(paramParcel, 6, paramRecoveryDecision.f, paramInt, false);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.a
 * JD-Core Version:    0.7.0.1
 */