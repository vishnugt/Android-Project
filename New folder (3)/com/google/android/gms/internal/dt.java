package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class dt
  implements SafeParcelable, cw<String, Integer>
{
  public static final cu CREATOR = new cu();
  private final int a;
  private final HashMap<String, Integer> b;
  private final HashMap<Integer, String> c;
  private final ArrayList<dt.a> d;
  
  public dt()
  {
    this.a = 1;
    this.b = new HashMap();
    this.c = new HashMap();
    this.d = null;
  }
  
  dt(int paramInt, ArrayList<dt.a> paramArrayList)
  {
    this.a = paramInt;
    this.b = new HashMap();
    this.c = new HashMap();
    this.d = null;
    a(paramArrayList);
  }
  
  private void a(ArrayList<dt.a> paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      dt.a locala = (dt.a)localIterator.next();
      a(locala.b, locala.c);
    }
  }
  
  final int a()
  {
    return this.a;
  }
  
  public final dt a(String paramString, int paramInt)
  {
    this.b.put(paramString, Integer.valueOf(paramInt));
    this.c.put(Integer.valueOf(paramInt), paramString);
    return this;
  }
  
  final ArrayList<dt.a> b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new dt.a(str, ((Integer)this.b.get(str)).intValue()));
    }
    return localArrayList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cu.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dt
 * JD-Core Version:    0.7.0.1
 */