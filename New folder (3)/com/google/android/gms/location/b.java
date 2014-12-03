package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class b
  implements Parcelable.Creator<DetectedActivity>
{
  static void a(DetectedActivity paramDetectedActivity, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramDetectedActivity.a);
    c.b(paramParcel, 1000, paramDetectedActivity.a());
    c.b(paramParcel, 2, paramDetectedActivity.b);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.b
 * JD-Core Version:    0.7.0.1
 */