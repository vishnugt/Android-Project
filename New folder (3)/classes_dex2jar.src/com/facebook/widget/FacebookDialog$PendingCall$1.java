package com.facebook.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class FacebookDialog$PendingCall$1
  implements Parcelable.Creator<FacebookDialog.PendingCall>
{
  public final FacebookDialog.PendingCall createFromParcel(Parcel paramParcel)
  {
    return new FacebookDialog.PendingCall(paramParcel, null);
  }
  
  public final FacebookDialog.PendingCall[] newArray(int paramInt)
  {
    return new FacebookDialog.PendingCall[paramInt];
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.PendingCall.1
 * JD-Core Version:    0.7.0.1
 */