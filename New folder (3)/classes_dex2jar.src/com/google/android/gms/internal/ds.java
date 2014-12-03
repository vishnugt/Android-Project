package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.d;

public abstract class ds
  extends Binder
  implements dq
{
  public static dq a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
    if ((localIInterface != null) && ((localIInterface instanceof dq))) {
      return (dq)localIInterface;
    }
    return new du(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.games.internal.IGamesService");
      return true;
    case 5001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(do.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      String str28 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str28);
      return true;
    case 5004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      Bundle localBundle8 = b();
      paramParcel2.writeNoException();
      if (localBundle8 != null)
      {
        paramParcel2.writeInt(1);
        localBundle8.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      IBinder localIBinder7 = paramParcel1.readStrongBinder();
      int i48 = paramParcel1.readInt();
      Bundle localBundle7 = null;
      if (i48 != 0) {
        localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localIBinder7, localBundle7);
      paramParcel2.writeNoException();
      return true;
    case 5006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c();
      paramParcel2.writeNoException();
      return true;
    case 5007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      String str27 = d();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str27);
      return true;
    case 5064: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      String str26 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str26);
      return true;
    case 5065: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5009: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5010: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      b(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5011: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn30 = do.a(paramParcel1.readStrongBinder());
      String str25 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool38 = true;; bool38 = false)
      {
        a(localdn30, str25, bool38, paramParcel1.createLongArray());
        paramParcel2.writeNoException();
        return true;
      }
    case 5012: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      String str24 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str24);
      return true;
    case 5013: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      d locald2 = f();
      paramParcel2.writeNoException();
      if (locald2 != null)
      {
        paramParcel2.writeInt(1);
        locald2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5014: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5015: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn29 = do.a(paramParcel1.readStrongBinder());
      int i46 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool36 = true;; bool36 = false)
      {
        int i47 = paramParcel1.readInt();
        boolean bool37 = false;
        if (i47 != 0) {
          bool37 = true;
        }
        a(localdn29, i46, bool36, bool37);
        paramParcel2.writeNoException();
        return true;
      }
    case 5016: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5017: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      b(do.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5018: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      d(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5019: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn28 = do.a(paramParcel1.readStrongBinder());
      String str23 = paramParcel1.readString();
      int i43 = paramParcel1.readInt();
      int i44 = paramParcel1.readInt();
      int i45 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool35 = true;; bool35 = false)
      {
        a(localdn28, str23, i43, i44, i45, bool35);
        paramParcel2.writeNoException();
        return true;
      }
    case 5020: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn27 = do.a(paramParcel1.readStrongBinder());
      String str22 = paramParcel1.readString();
      int i40 = paramParcel1.readInt();
      int i41 = paramParcel1.readInt();
      int i42 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool34 = true;; bool34 = false)
      {
        b(localdn27, str22, i40, i41, i42, bool34);
        paramParcel2.writeNoException();
        return true;
      }
    case 5021: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn26 = do.a(paramParcel1.readStrongBinder());
      int i39 = paramParcel1.readInt();
      Bundle localBundle6 = null;
      if (i39 != 0) {
        localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localdn26, localBundle6, paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5022: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c(do.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5023: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn25 = do.a(paramParcel1.readStrongBinder());
      String str21 = paramParcel1.readString();
      IBinder localIBinder6 = paramParcel1.readStrongBinder();
      int i38 = paramParcel1.readInt();
      Bundle localBundle5 = null;
      if (i38 != 0) {
        localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localdn25, str21, localIBinder6, localBundle5);
      paramParcel2.writeNoException();
      return true;
    case 5024: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn24 = do.a(paramParcel1.readStrongBinder());
      String str20 = paramParcel1.readString();
      IBinder localIBinder5 = paramParcel1.readStrongBinder();
      int i37 = paramParcel1.readInt();
      Bundle localBundle4 = null;
      if (i37 != 0) {
        localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      b(localdn24, str20, localIBinder5, localBundle4);
      paramParcel2.writeNoException();
      return true;
    case 5025: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn23 = do.a(paramParcel1.readStrongBinder());
      String str19 = paramParcel1.readString();
      int i36 = paramParcel1.readInt();
      IBinder localIBinder4 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle3 = null)
      {
        a(localdn23, str19, i36, localIBinder4, localBundle3);
        paramParcel2.writeNoException();
        return true;
      }
    case 5026: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      d(do.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5027: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      e(do.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5028: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5029: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      b(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5058: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(do.a(paramParcel1.readStrongBinder()), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5059: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      b(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5030: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn22 = do.a(paramParcel1.readStrongBinder());
      IBinder localIBinder3 = paramParcel1.readStrongBinder();
      int i35 = paramParcel1.readInt();
      String[] arrayOfString = paramParcel1.createStringArray();
      Bundle localBundle2;
      if (paramParcel1.readInt() != 0)
      {
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label2058;
        }
      }
      for (boolean bool33 = true;; bool33 = false)
      {
        a(localdn22, localIBinder3, i35, arrayOfString, localBundle2, bool33, paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
        localBundle2 = null;
        break;
      }
    case 5031: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn21 = do.a(paramParcel1.readStrongBinder());
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      String str18 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool32 = true;; bool32 = false)
      {
        a(localdn21, localIBinder2, str18, bool32, paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      }
    case 5032: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      e(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5033: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int i34 = a(do.a(paramParcel1.readStrongBinder()), paramParcel1.createByteArray(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i34);
      return true;
    case 5034: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int i33 = a(paramParcel1.createByteArray(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i33);
      return true;
    case 5035: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      String str17 = b(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str17);
      return true;
    case 5036: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5037: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      f(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5038: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      b(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5039: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn20 = do.a(paramParcel1.readStrongBinder());
      String str15 = paramParcel1.readString();
      String str16 = paramParcel1.readString();
      int i29 = paramParcel1.readInt();
      int i30 = paramParcel1.readInt();
      int i31 = paramParcel1.readInt();
      int i32 = paramParcel1.readInt();
      boolean bool31 = false;
      if (i32 != 0) {
        bool31 = true;
      }
      a(localdn20, str15, str16, i29, i30, i31, bool31);
      paramParcel2.writeNoException();
      return true;
    case 5040: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn19 = do.a(paramParcel1.readStrongBinder());
      String str13 = paramParcel1.readString();
      String str14 = paramParcel1.readString();
      int i25 = paramParcel1.readInt();
      int i26 = paramParcel1.readInt();
      int i27 = paramParcel1.readInt();
      int i28 = paramParcel1.readInt();
      boolean bool30 = false;
      if (i28 != 0) {
        bool30 = true;
      }
      b(localdn19, str13, str14, i25, i26, i27, bool30);
      paramParcel2.writeNoException();
      return true;
    case 5041: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5042: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      g(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5043: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      h(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5044: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn18 = do.a(paramParcel1.readStrongBinder());
      int i23 = paramParcel1.readInt();
      int i24 = paramParcel1.readInt();
      boolean bool28;
      if (paramParcel1.readInt() != 0)
      {
        bool28 = true;
        if (paramParcel1.readInt() == 0) {
          break label2671;
        }
      }
      for (boolean bool29 = true;; bool29 = false)
      {
        a(localdn18, i23, i24, bool28, bool29);
        paramParcel2.writeNoException();
        return true;
        bool28 = false;
        break;
      }
    case 5045: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn17 = do.a(paramParcel1.readStrongBinder());
      String str12 = paramParcel1.readString();
      int i22 = paramParcel1.readInt();
      boolean bool26;
      if (paramParcel1.readInt() != 0)
      {
        bool26 = true;
        if (paramParcel1.readInt() == 0) {
          break label2750;
        }
      }
      for (boolean bool27 = true;; bool27 = false)
      {
        a(localdn17, str12, i22, bool26, bool27);
        paramParcel2.writeNoException();
        return true;
        bool26 = false;
        break;
      }
    case 5046: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn16 = do.a(paramParcel1.readStrongBinder());
      int i20 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool24 = true;; bool24 = false)
      {
        int i21 = paramParcel1.readInt();
        boolean bool25 = false;
        if (i21 != 0) {
          bool25 = true;
        }
        b(localdn16, i20, bool24, bool25);
        paramParcel2.writeNoException();
        return true;
      }
    case 5047: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      f(do.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5048: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn15 = do.a(paramParcel1.readStrongBinder());
      int i18 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool22 = true;; bool22 = false)
      {
        int i19 = paramParcel1.readInt();
        boolean bool23 = false;
        if (i19 != 0) {
          bool23 = true;
        }
        c(localdn15, i18, bool22, bool23);
        paramParcel2.writeNoException();
        return true;
      }
    case 5049: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      g(do.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5050: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5051: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5052: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      i(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5053: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int i17 = j(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i17);
      return true;
    case 5060: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int i16 = d(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i16);
      return true;
    case 5054: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn14 = do.a(paramParcel1.readStrongBinder());
      String str11 = paramParcel1.readString();
      int i15 = paramParcel1.readInt();
      boolean bool21 = false;
      if (i15 != 0) {
        bool21 = true;
      }
      a(localdn14, str11, bool21);
      paramParcel2.writeNoException();
      return true;
    case 5061: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      k(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5055: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5067: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      boolean bool20 = g();
      paramParcel2.writeNoException();
      int i14 = 0;
      if (bool20) {
        i14 = 1;
      }
      paramParcel2.writeInt(i14);
      return true;
    case 5068: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int i13 = paramParcel1.readInt();
      boolean bool19 = false;
      if (i13 != 0) {
        bool19 = true;
      }
      a(bool19);
      paramParcel2.writeNoException();
      return true;
    case 5056: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      h(do.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5057: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      l(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5062: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      i(do.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5063: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn13 = do.a(paramParcel1.readStrongBinder());
      int i12 = paramParcel1.readInt();
      boolean bool18 = false;
      if (i12 != 0) {
        bool18 = true;
      }
      a(localdn13, bool18);
      paramParcel2.writeNoException();
      return true;
    case 5066: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      Uri localUri2 = e(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localUri2 != null)
      {
        paramParcel2.writeInt(1);
        localUri2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5501: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn12 = do.a(paramParcel1.readStrongBinder());
      String str10 = paramParcel1.readString();
      int i11 = paramParcel1.readInt();
      boolean bool16;
      if (paramParcel1.readInt() != 0)
      {
        bool16 = true;
        if (paramParcel1.readInt() == 0) {
          break label3497;
        }
      }
      for (boolean bool17 = true;; bool17 = false)
      {
        b(localdn12, str10, i11, bool16, bool17);
        paramParcel2.writeNoException();
        return true;
        bool16 = false;
        break;
      }
    case 5502: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      d locald1 = h();
      paramParcel2.writeNoException();
      if (locald1 != null)
      {
        paramParcel2.writeInt(1);
        locald1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 6001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn11 = do.a(paramParcel1.readStrongBinder());
      int i10 = paramParcel1.readInt();
      boolean bool15 = false;
      if (i10 != 0) {
        bool15 = true;
      }
      b(localdn11, bool15);
      paramParcel2.writeNoException();
      return true;
    case 6002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn10 = do.a(paramParcel1.readStrongBinder());
      String str8 = paramParcel1.readString();
      String str9 = paramParcel1.readString();
      int i9 = paramParcel1.readInt();
      boolean bool14 = false;
      if (i9 != 0) {
        bool14 = true;
      }
      a(localdn10, str8, str9, bool14);
      paramParcel2.writeNoException();
      return true;
    case 6003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn9 = do.a(paramParcel1.readStrongBinder());
      int i7 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool12 = true;; bool12 = false)
      {
        int i8 = paramParcel1.readInt();
        boolean bool13 = false;
        if (i8 != 0) {
          bool13 = true;
        }
        d(localdn9, i7, bool12, bool13);
        paramParcel2.writeNoException();
        return true;
      }
    case 6004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn8 = do.a(paramParcel1.readStrongBinder());
      int i5 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool10 = true;; bool10 = false)
      {
        int i6 = paramParcel1.readInt();
        boolean bool11 = false;
        if (i6 != 0) {
          bool11 = true;
        }
        e(localdn8, i5, bool10, bool11);
        paramParcel2.writeNoException();
        return true;
      }
    case 6501: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn7 = do.a(paramParcel1.readStrongBinder());
      String str7 = paramParcel1.readString();
      int i3 = paramParcel1.readInt();
      boolean bool6;
      boolean bool7;
      if (paramParcel1.readInt() != 0)
      {
        bool6 = true;
        if (paramParcel1.readInt() == 0) {
          break label3901;
        }
        bool7 = true;
        if (paramParcel1.readInt() == 0) {
          break label3907;
        }
      }
      for (boolean bool8 = true;; bool8 = false)
      {
        int i4 = paramParcel1.readInt();
        boolean bool9 = false;
        if (i4 != 0) {
          bool9 = true;
        }
        a(localdn7, str7, i3, bool6, bool7, bool8, bool9);
        paramParcel2.writeNoException();
        return true;
        bool6 = false;
        break;
        bool7 = false;
        break label3844;
      }
    case 6502: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn6 = do.a(paramParcel1.readStrongBinder());
      String str6 = paramParcel1.readString();
      int i2 = paramParcel1.readInt();
      boolean bool5 = false;
      if (i2 != 0) {
        bool5 = true;
      }
      b(localdn6, str6, bool5);
      paramParcel2.writeNoException();
      return true;
    case 6503: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn5 = do.a(paramParcel1.readStrongBinder());
      int i1 = paramParcel1.readInt();
      boolean bool4 = false;
      if (i1 != 0) {
        bool4 = true;
      }
      c(localdn5, bool4);
      paramParcel2.writeNoException();
      return true;
    case 6504: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn4 = do.a(paramParcel1.readStrongBinder());
      String str5 = paramParcel1.readString();
      int n = paramParcel1.readInt();
      boolean bool3 = false;
      if (n != 0) {
        bool3 = true;
      }
      c(localdn4, str5, bool3);
      paramParcel2.writeNoException();
      return true;
    case 6505: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn3 = do.a(paramParcel1.readStrongBinder());
      String str4 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      boolean bool2 = false;
      if (m != 0) {
        bool2 = true;
      }
      d(localdn3, str4, bool2);
      paramParcel2.writeNoException();
      return true;
    case 6506: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      dn localdn2 = do.a(paramParcel1.readStrongBinder());
      String str2 = paramParcel1.readString();
      String str3 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      boolean bool1 = false;
      if (k != 0) {
        bool1 = true;
      }
      b(localdn2, str2, str3, bool1);
      paramParcel2.writeNoException();
      return true;
    case 6507: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int j = paramParcel1.readInt();
      Uri localUri1 = null;
      if (j != 0) {
        localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      }
      ParcelFileDescriptor localParcelFileDescriptor = a(localUri1);
      paramParcel2.writeNoException();
      if (localParcelFileDescriptor != null)
      {
        paramParcel2.writeInt(1);
        localParcelFileDescriptor.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 7001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      m(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 7002: 
      label2058:
      label2671:
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      label2750:
      label3907:
      a(do.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readString());
      label3497:
      label3901:
      paramParcel2.writeNoException();
      label3844:
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
    dn localdn1 = do.a(paramParcel1.readStrongBinder());
    String str1 = paramParcel1.readString();
    int i = paramParcel1.readInt();
    IBinder localIBinder1 = paramParcel1.readStrongBinder();
    if (paramParcel1.readInt() != 0) {}
    for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
    {
      b(localdn1, str1, i, localIBinder1, localBundle1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ds
 * JD-Core Version:    0.7.0.1
 */