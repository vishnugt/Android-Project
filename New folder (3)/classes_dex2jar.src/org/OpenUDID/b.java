package org.OpenUDID;

import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Parcel;

final class b
  extends Binder
{
  b(OpenUDID_service paramOpenUDID_service) {}
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences("openudid_prefs", 0);
    paramParcel2.writeInt(paramParcel1.readInt());
    paramParcel2.writeString(localSharedPreferences.getString("openudid", null));
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     org.OpenUDID.b
 * JD-Core Version:    0.7.0.1
 */