package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState
  implements Parcelable
{
  public static final Parcelable.Creator<FragmentManagerState> CREATOR = new m();
  FragmentState[] a;
  int[] b;
  BackStackState[] c;
  
  public FragmentManagerState() {}
  
  public FragmentManagerState(Parcel paramParcel)
  {
    this.a = ((FragmentState[])paramParcel.createTypedArray(FragmentState.CREATOR));
    this.b = paramParcel.createIntArray();
    this.c = ((BackStackState[])paramParcel.createTypedArray(BackStackState.CREATOR));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedArray(this.a, paramInt);
    paramParcel.writeIntArray(this.b);
    paramParcel.writeTypedArray(this.c, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentManagerState
 * JD-Core Version:    0.7.0.1
 */