package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class dz$a
  implements SafeParcelable
{
  public static final da CREATOR = new da();
  final int a;
  final String b;
  final ArrayList<dz.b> c;
  
  dz$a(int paramInt, String paramString, ArrayList<dz.b> paramArrayList)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramArrayList;
  }
  
  dz$a(String paramString, HashMap<String, dw.a<?, ?>> paramHashMap)
  {
    this.a = 1;
    this.b = paramString;
    this.c = a(paramHashMap);
  }
  
  private static ArrayList<dz.b> a(HashMap<String, dw.a<?, ?>> paramHashMap)
  {
    if (paramHashMap == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new dz.b(str, (dw.a)paramHashMap.get(str)));
    }
    return localArrayList;
  }
  
  final HashMap<String, dw.a<?, ?>> a()
  {
    HashMap localHashMap = new HashMap();
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      dz.b localb = (dz.b)this.c.get(j);
      localHashMap.put(localb.b, localb.c);
    }
    return localHashMap;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    da.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dz.a
 * JD-Core Version:    0.7.0.1
 */