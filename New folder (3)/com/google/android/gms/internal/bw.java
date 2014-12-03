package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public final class bw
  implements SafeParcelable
{
  public static final al CREATOR = new al();
  public final int a;
  public final String b;
  public final String c;
  public final List<String> d;
  public final int e;
  public final List<String> f;
  public final long g;
  public final boolean h;
  public final long i;
  public final List<String> j;
  public final long k;
  public final int l;
  
  bw(int paramInt1, String paramString1, String paramString2, List<String> paramList1, int paramInt2, List<String> paramList2, long paramLong1, boolean paramBoolean, long paramLong2, List<String> paramList3, long paramLong3, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    List localList1;
    List localList2;
    if (paramList1 != null)
    {
      localList1 = Collections.unmodifiableList(paramList1);
      this.d = localList1;
      this.e = paramInt2;
      if (paramList2 == null) {
        break label116;
      }
      localList2 = Collections.unmodifiableList(paramList2);
      label55:
      this.f = localList2;
      this.g = paramLong1;
      this.h = paramBoolean;
      this.i = paramLong2;
      if (paramList3 == null) {
        break label122;
      }
    }
    label116:
    label122:
    for (List localList3 = Collections.unmodifiableList(paramList3);; localList3 = null)
    {
      this.j = localList3;
      this.k = paramLong3;
      this.l = paramInt3;
      return;
      localList1 = null;
      break;
      localList2 = null;
      break label55;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    al.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bw
 * JD-Core Version:    0.7.0.1
 */