package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ActivityRecognitionResult
  implements SafeParcelable
{
  public static final a CREATOR = new a();
  List<DetectedActivity> a;
  long b;
  long c;
  private final int d = 1;
  
  public ActivityRecognitionResult(List<DetectedActivity> paramList, long paramLong1, long paramLong2)
  {
    this.a = paramList;
    this.b = paramLong1;
    this.c = paramLong2;
  }
  
  public final int a()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "ActivityRecognitionResult [probableActivities=" + this.a + ", timeMillis=" + this.b + ", elapsedRealtimeMillis=" + this.c + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.ActivityRecognitionResult
 * JD-Core Version:    0.7.0.1
 */