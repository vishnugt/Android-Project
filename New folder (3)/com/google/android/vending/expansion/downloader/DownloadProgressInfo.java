package com.google.android.vending.expansion.downloader;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class DownloadProgressInfo
  implements Parcelable
{
  public static final Parcelable.Creator<DownloadProgressInfo> CREATOR = new b();
  public long a;
  public long b;
  public long c;
  public float d;
  
  public DownloadProgressInfo(Parcel paramParcel)
  {
    this.a = paramParcel.readLong();
    this.b = paramParcel.readLong();
    this.c = paramParcel.readLong();
    this.d = paramParcel.readFloat();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.a);
    paramParcel.writeLong(this.b);
    paramParcel.writeLong(this.c);
    paramParcel.writeFloat(this.d);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.vending.expansion.downloader.DownloadProgressInfo
 * JD-Core Version:    0.7.0.1
 */