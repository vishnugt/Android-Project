package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class bh
  implements SafeParcelable
{
  public static final t CREATOR = new t();
  public final int a;
  public final be b;
  public final ew c;
  public final u d;
  public final ax e;
  public final b f;
  public final String g;
  public final boolean h;
  public final String i;
  public final ab j;
  public final int k;
  public final int l;
  public final String m;
  public final co n;
  
  bh(int paramInt1, be parambe, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt2, int paramInt3, String paramString3, co paramco)
  {
    this.a = paramInt1;
    this.b = parambe;
    this.c = ((ew)d.a(com.google.android.gms.a.b.a(paramIBinder1)));
    this.d = ((u)d.a(com.google.android.gms.a.b.a(paramIBinder2)));
    this.e = ((ax)d.a(com.google.android.gms.a.b.a(paramIBinder3)));
    this.f = ((b)d.a(com.google.android.gms.a.b.a(paramIBinder4)));
    this.g = paramString1;
    this.h = paramBoolean;
    this.i = paramString2;
    this.j = ((ab)d.a(com.google.android.gms.a.b.a(paramIBinder5)));
    this.k = paramInt2;
    this.l = paramInt3;
    this.m = paramString3;
    this.n = paramco;
  }
  
  public bh(be parambe, ew paramew, u paramu, ab paramab, co paramco)
  {
    this.a = 1;
    this.b = parambe;
    this.c = paramew;
    this.d = paramu;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = false;
    this.i = null;
    this.j = paramab;
    this.k = -1;
    this.l = 4;
    this.m = null;
    this.n = paramco;
  }
  
  public bh(ew paramew, u paramu, ab paramab, ax paramax, boolean paramBoolean, int paramInt, co paramco)
  {
    this.a = 1;
    this.b = null;
    this.c = paramew;
    this.d = paramu;
    this.e = paramax;
    this.f = null;
    this.g = null;
    this.h = paramBoolean;
    this.i = null;
    this.j = paramab;
    this.k = paramInt;
    this.l = 2;
    this.m = null;
    this.n = paramco;
  }
  
  public bh(ew paramew, u paramu, b paramb, ab paramab, ax paramax, boolean paramBoolean, int paramInt, String paramString, co paramco)
  {
    this.a = 1;
    this.b = null;
    this.c = paramew;
    this.d = paramu;
    this.e = paramax;
    this.f = paramb;
    this.g = null;
    this.h = paramBoolean;
    this.i = null;
    this.j = paramab;
    this.k = paramInt;
    this.l = 3;
    this.m = paramString;
    this.n = paramco;
  }
  
  public bh(ew paramew, u paramu, b paramb, ab paramab, ax paramax, boolean paramBoolean, int paramInt, String paramString1, String paramString2, co paramco)
  {
    this.a = 1;
    this.b = null;
    this.c = paramew;
    this.d = paramu;
    this.e = paramax;
    this.f = paramb;
    this.g = paramString2;
    this.h = paramBoolean;
    this.i = paramString1;
    this.j = paramab;
    this.k = paramInt;
    this.l = 3;
    this.m = null;
    this.n = paramco;
  }
  
  public static bh a(Intent paramIntent)
  {
    try
    {
      Bundle localBundle = paramIntent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      localBundle.setClassLoader(bh.class.getClassLoader());
      bh localbh = (bh)localBundle.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      return localbh;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static void a(Intent paramIntent, bh parambh)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", parambh);
    paramIntent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", localBundle);
  }
  
  final IBinder a()
  {
    return d.a(this.c).asBinder();
  }
  
  final IBinder b()
  {
    return d.a(this.d).asBinder();
  }
  
  final IBinder c()
  {
    return d.a(this.e).asBinder();
  }
  
  final IBinder d()
  {
    return d.a(this.f).asBinder();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  final IBinder e()
  {
    return d.a(this.j).asBinder();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bh
 * JD-Core Version:    0.7.0.1
 */