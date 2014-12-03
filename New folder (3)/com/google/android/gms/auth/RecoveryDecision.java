package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RecoveryDecision
  implements SafeParcelable
{
  public static final a CREATOR = new a();
  final int a;
  public PendingIntent b;
  public boolean c;
  public boolean d;
  public boolean e;
  public PendingIntent f;
  
  public RecoveryDecision()
  {
    this.a = 1;
  }
  
  RecoveryDecision(int paramInt, PendingIntent paramPendingIntent1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, PendingIntent paramPendingIntent2)
  {
    this.a = paramInt;
    this.b = paramPendingIntent1;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
    this.f = paramPendingIntent2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.RecoveryDecision
 * JD-Core Version:    0.7.0.1
 */