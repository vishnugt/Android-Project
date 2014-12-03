package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class cm
  extends Binder
  implements cl
{
  public static cl a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
    if ((localIInterface != null) && ((localIInterface instanceof cl))) {
      return (cl)localIInterface;
    }
    return new cn(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci12 = cj.a(paramParcel1.readStrongBinder());
      int i17 = paramParcel1.readInt();
      String str15 = paramParcel1.readString();
      String str16 = paramParcel1.readString();
      String[] arrayOfString2 = paramParcel1.createStringArray();
      String str17 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle12 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle12 = null)
      {
        a(localci12, i17, str15, str16, arrayOfString2, str17, localBundle12);
        paramParcel2.writeNoException();
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci11 = cj.a(paramParcel1.readStrongBinder());
      int i15 = paramParcel1.readInt();
      String str14 = paramParcel1.readString();
      int i16 = paramParcel1.readInt();
      Bundle localBundle11 = null;
      if (i16 != 0) {
        localBundle11 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localci11, i15, str14, localBundle11);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(cj.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(cj.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci10 = cj.a(paramParcel1.readStrongBinder());
      int i13 = paramParcel1.readInt();
      String str13 = paramParcel1.readString();
      int i14 = paramParcel1.readInt();
      Bundle localBundle10 = null;
      if (i14 != 0) {
        localBundle10 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      b(localci10, i13, str13, localBundle10);
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci9 = cj.a(paramParcel1.readStrongBinder());
      int i11 = paramParcel1.readInt();
      String str12 = paramParcel1.readString();
      int i12 = paramParcel1.readInt();
      Bundle localBundle9 = null;
      if (i12 != 0) {
        localBundle9 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      c(localci9, i11, str12, localBundle9);
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci8 = cj.a(paramParcel1.readStrongBinder());
      int i9 = paramParcel1.readInt();
      String str11 = paramParcel1.readString();
      int i10 = paramParcel1.readInt();
      Bundle localBundle8 = null;
      if (i10 != 0) {
        localBundle8 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      d(localci8, i9, str11, localBundle8);
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci7 = cj.a(paramParcel1.readStrongBinder());
      int i7 = paramParcel1.readInt();
      String str10 = paramParcel1.readString();
      int i8 = paramParcel1.readInt();
      Bundle localBundle7 = null;
      if (i8 != 0) {
        localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      e(localci7, i7, str10, localBundle7);
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci6 = cj.a(paramParcel1.readStrongBinder());
      int i6 = paramParcel1.readInt();
      String str6 = paramParcel1.readString();
      String str7 = paramParcel1.readString();
      String[] arrayOfString1 = paramParcel1.createStringArray();
      String str8 = paramParcel1.readString();
      IBinder localIBinder = paramParcel1.readStrongBinder();
      String str9 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle6 = null)
      {
        a(localci6, i6, str6, str7, arrayOfString1, str8, localIBinder, str9, localBundle6);
        paramParcel2.writeNoException();
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(cj.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci5 = cj.a(paramParcel1.readStrongBinder());
      int i4 = paramParcel1.readInt();
      String str5 = paramParcel1.readString();
      int i5 = paramParcel1.readInt();
      Bundle localBundle5 = null;
      if (i5 != 0) {
        localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      f(localci5, i4, str5, localBundle5);
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci4 = cj.a(paramParcel1.readStrongBinder());
      int i2 = paramParcel1.readInt();
      String str4 = paramParcel1.readString();
      int i3 = paramParcel1.readInt();
      Bundle localBundle4 = null;
      if (i3 != 0) {
        localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      g(localci4, i2, str4, localBundle4);
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci3 = cj.a(paramParcel1.readStrongBinder());
      int n = paramParcel1.readInt();
      String str3 = paramParcel1.readString();
      int i1 = paramParcel1.readInt();
      Bundle localBundle3 = null;
      if (i1 != 0) {
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      h(localci3, n, str3, localBundle3);
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      ci localci2 = cj.a(paramParcel1.readStrongBinder());
      int k = paramParcel1.readInt();
      String str2 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (m != 0) {
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      i(localci2, k, str2, localBundle2);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
    ci localci1 = cj.a(paramParcel1.readStrongBinder());
    int i = paramParcel1.readInt();
    String str1 = paramParcel1.readString();
    int j = paramParcel1.readInt();
    Bundle localBundle1 = null;
    if (j != 0) {
      localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
    }
    j(localci1, i, str1, localBundle1);
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cm
 * JD-Core Version:    0.7.0.1
 */