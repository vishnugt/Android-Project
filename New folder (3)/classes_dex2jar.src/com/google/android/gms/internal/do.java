package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.h;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

public abstract class do
  extends Binder
  implements dn
{
  public do()
  {
    attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
  }
  
  public static dn a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof dn))) {
      return (dn)localIInterface;
    }
    return new dp(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
      return true;
    case 5001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      a(paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i26 = paramParcel1.readInt();
      d locald30 = null;
      if (i26 != 0) {
        locald30 = h.a(paramParcel1);
      }
      a(locald30);
      paramParcel2.writeNoException();
      return true;
    case 5003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      b(paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i25 = paramParcel1.readInt();
      d locald29 = null;
      if (i25 != 0) {
        locald29 = h.a(paramParcel1);
      }
      b(locald29);
      paramParcel2.writeNoException();
      return true;
    case 5005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (d locald27 = h.a(paramParcel1);; locald27 = null)
      {
        int i24 = paramParcel1.readInt();
        d locald28 = null;
        if (i24 != 0) {
          locald28 = h.a(paramParcel1);
        }
        a(locald27, locald28);
        paramParcel2.writeNoException();
        return true;
      }
    case 5006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i23 = paramParcel1.readInt();
      d locald26 = null;
      if (i23 != 0) {
        locald26 = h.a(paramParcel1);
      }
      c(locald26);
      paramParcel2.writeNoException();
      return true;
    case 5007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i22 = paramParcel1.readInt();
      d locald25 = null;
      if (i22 != 0) {
        locald25 = h.a(paramParcel1);
      }
      d(locald25);
      paramParcel2.writeNoException();
      return true;
    case 5008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i21 = paramParcel1.readInt();
      d locald24 = null;
      if (i21 != 0) {
        locald24 = h.a(paramParcel1);
      }
      e(locald24);
      paramParcel2.writeNoException();
      return true;
    case 5009: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i20 = paramParcel1.readInt();
      d locald23 = null;
      if (i20 != 0) {
        locald23 = h.a(paramParcel1);
      }
      f(locald23);
      paramParcel2.writeNoException();
      return true;
    case 5010: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i19 = paramParcel1.readInt();
      d locald22 = null;
      if (i19 != 0) {
        locald22 = h.a(paramParcel1);
      }
      g(locald22);
      paramParcel2.writeNoException();
      return true;
    case 5011: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i18 = paramParcel1.readInt();
      d locald21 = null;
      if (i18 != 0) {
        locald21 = h.a(paramParcel1);
      }
      h(locald21);
      paramParcel2.writeNoException();
      return true;
    case 5012: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i17 = paramParcel1.readInt();
      d locald20 = null;
      if (i17 != 0) {
        locald20 = h.a(paramParcel1);
      }
      k(locald20);
      paramParcel2.writeNoException();
      return true;
    case 5013: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5014: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i16 = paramParcel1.readInt();
      d locald19 = null;
      if (i16 != 0) {
        locald19 = h.a(paramParcel1);
      }
      l(locald19);
      paramParcel2.writeNoException();
      return true;
    case 5015: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      b(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5016: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      a();
      paramParcel2.writeNoException();
      return true;
    case 5017: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i15 = paramParcel1.readInt();
      d locald18 = null;
      if (i15 != 0) {
        locald18 = h.a(paramParcel1);
      }
      i(locald18);
      paramParcel2.writeNoException();
      return true;
    case 5037: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i14 = paramParcel1.readInt();
      d locald17 = null;
      if (i14 != 0) {
        locald17 = h.a(paramParcel1);
      }
      j(locald17);
      paramParcel2.writeNoException();
      return true;
    case 5018: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i13 = paramParcel1.readInt();
      d locald16 = null;
      if (i13 != 0) {
        locald16 = h.a(paramParcel1);
      }
      m(locald16);
      paramParcel2.writeNoException();
      return true;
    case 5019: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i12 = paramParcel1.readInt();
      d locald15 = null;
      if (i12 != 0) {
        locald15 = h.a(paramParcel1);
      }
      n(locald15);
      paramParcel2.writeNoException();
      return true;
    case 5020: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      c(paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5021: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i11 = paramParcel1.readInt();
      d locald14 = null;
      if (i11 != 0) {
        locald14 = h.a(paramParcel1);
      }
      o(locald14);
      paramParcel2.writeNoException();
      return true;
    case 5022: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i10 = paramParcel1.readInt();
      d locald13 = null;
      if (i10 != 0) {
        locald13 = h.a(paramParcel1);
      }
      p(locald13);
      paramParcel2.writeNoException();
      return true;
    case 5023: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i9 = paramParcel1.readInt();
      d locald12 = null;
      if (i9 != 0) {
        locald12 = h.a(paramParcel1);
      }
      q(locald12);
      paramParcel2.writeNoException();
      return true;
    case 5024: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i8 = paramParcel1.readInt();
      d locald11 = null;
      if (i8 != 0) {
        locald11 = h.a(paramParcel1);
      }
      r(locald11);
      paramParcel2.writeNoException();
      return true;
    case 5025: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i7 = paramParcel1.readInt();
      d locald10 = null;
      if (i7 != 0) {
        locald10 = h.a(paramParcel1);
      }
      s(locald10);
      paramParcel2.writeNoException();
      return true;
    case 5026: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i6 = paramParcel1.readInt();
      d locald9 = null;
      if (i6 != 0) {
        locald9 = h.a(paramParcel1);
      }
      a(locald9, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5027: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i5 = paramParcel1.readInt();
      d locald8 = null;
      if (i5 != 0) {
        locald8 = h.a(paramParcel1);
      }
      b(locald8, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5028: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i4 = paramParcel1.readInt();
      d locald7 = null;
      if (i4 != 0) {
        locald7 = h.a(paramParcel1);
      }
      c(locald7, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5029: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i3 = paramParcel1.readInt();
      d locald6 = null;
      if (i3 != 0) {
        locald6 = h.a(paramParcel1);
      }
      d(locald6, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5030: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i2 = paramParcel1.readInt();
      d locald5 = null;
      if (i2 != 0) {
        locald5 = h.a(paramParcel1);
      }
      e(locald5, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5031: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i1 = paramParcel1.readInt();
      d locald4 = null;
      if (i1 != 0) {
        locald4 = h.a(paramParcel1);
      }
      f(locald4, paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 5032: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int n = paramParcel1.readInt();
      RealTimeMessage localRealTimeMessage = null;
      if (n != 0) {
        localRealTimeMessage = (RealTimeMessage)RealTimeMessage.CREATOR.createFromParcel(paramParcel1);
      }
      a(localRealTimeMessage);
      paramParcel2.writeNoException();
      return true;
    case 5033: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5034: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int m = paramParcel1.readInt();
      String str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        a(m, str, bool);
        paramParcel2.writeNoException();
        return true;
      }
    case 5038: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int k = paramParcel1.readInt();
      d locald3 = null;
      if (k != 0) {
        locald3 = h.a(paramParcel1);
      }
      t(locald3);
      paramParcel2.writeNoException();
      return true;
    case 5035: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int j = paramParcel1.readInt();
      d locald2 = null;
      if (j != 0) {
        locald2 = h.a(paramParcel1);
      }
      u(locald2);
      paramParcel2.writeNoException();
      return true;
    case 5036: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      c(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5039: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      int i = paramParcel1.readInt();
      d locald1 = null;
      if (i != 0) {
        locald1 = h.a(paramParcel1);
      }
      v(locald1);
      paramParcel2.writeNoException();
      return true;
    case 5040: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      d(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 6001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
    b(paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.do
 * JD-Core Version:    0.7.0.1
 */