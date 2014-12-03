package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class d<T>
  implements Parcelable.ClassLoaderCreator<T>
{
  private final c<T> a;
  
  public d(c<T> paramc)
  {
    this.a = paramc;
  }
  
  public final T createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }
  
  public final T createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return this.a.a(paramParcel, paramClassLoader);
  }
  
  public final T[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.b.d
 * JD-Core Version:    0.7.0.1
 */