package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b<T>
  implements Parcelable.Creator<T>
{
  final c<T> a;
  
  public b(c<T> paramc)
  {
    this.a = paramc;
  }
  
  public final T createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }
  
  public final T[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.b.b
 * JD-Core Version:    0.7.0.1
 */