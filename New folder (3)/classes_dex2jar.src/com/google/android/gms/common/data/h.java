package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class h
  implements Parcelable.Creator<d>
{
  public static d a(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int j = a.a(paramParcel);
    CursorWindow[] arrayOfCursorWindow = null;
    String[] arrayOfString = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = paramParcel.readInt();
      switch (0xFFFF & m)
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        arrayOfString = a.p(paramParcel, m);
        break;
      case 1000: 
        k = a.e(paramParcel, m);
        break;
      case 2: 
        arrayOfCursorWindow = (CursorWindow[])a.b(paramParcel, m, CursorWindow.CREATOR);
        break;
      case 3: 
        i = a.e(paramParcel, m);
        break;
      case 4: 
        localBundle = a.m(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b("Overread allowed size end=" + j, paramParcel);
    }
    d locald = new d(k, arrayOfString, arrayOfCursorWindow, i, localBundle);
    locald.a();
    return locald;
  }
  
  static void a(d paramd, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    c.a(paramParcel, 1, paramd.c());
    c.b(paramParcel, 1000, paramd.b());
    c.a(paramParcel, 2, paramd.d(), paramInt);
    c.b(paramParcel, 3, paramd.e());
    c.a(paramParcel, 4, paramd.f());
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.h
 * JD-Core Version:    0.7.0.1
 */