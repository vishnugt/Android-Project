package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class dz$b
  implements SafeParcelable
{
  public static final cy CREATOR = new cy();
  final int a;
  final String b;
  final dw.a<?, ?> c;
  
  dz$b(int paramInt, String paramString, dw.a<?, ?> parama)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = parama;
  }
  
  dz$b(String paramString, dw.a<?, ?> parama)
  {
    this.a = 1;
    this.b = paramString;
    this.c = parama;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cy.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dz.b
 * JD-Core Version:    0.7.0.1
 */