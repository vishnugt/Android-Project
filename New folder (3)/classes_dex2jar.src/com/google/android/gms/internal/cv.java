package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class cv
  implements Parcelable.Creator<dt.a>
{
  static void a(dt.a parama, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, parama.a);
    c.a(paramParcel, 2, parama.b, false);
    c.b(paramParcel, 3, parama.c);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cv
 * JD-Core Version:    0.7.0.1
 */