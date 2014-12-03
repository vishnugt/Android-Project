package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;

public final class a
  implements Parcelable.Creator<ActivityRecognitionResult>
{
  static void a(ActivityRecognitionResult paramActivityRecognitionResult, Parcel paramParcel)
  {
    int i = c.a(paramParcel, 20293);
    c.b(paramParcel, 1, paramActivityRecognitionResult.a, false);
    c.b(paramParcel, 1000, paramActivityRecognitionResult.a());
    c.a(paramParcel, 2, paramActivityRecognitionResult.b);
    c.a(paramParcel, 3, paramActivityRecognitionResult.c);
    c.b(paramParcel, i);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.a
 * JD-Core Version:    0.7.0.1
 */