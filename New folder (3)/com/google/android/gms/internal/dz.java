package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class dz
  implements SafeParcelable
{
  public static final cz CREATOR = new cz();
  private final int a;
  private final HashMap<String, HashMap<String, dw.a<?, ?>>> b;
  private final ArrayList<dz.a> c;
  private final String d;
  
  dz(int paramInt, ArrayList<dz.a> paramArrayList, String paramString)
  {
    this.a = paramInt;
    this.c = null;
    this.b = a(paramArrayList);
    this.d = ((String)cr.a(paramString));
    d();
  }
  
  private static HashMap<String, HashMap<String, dw.a<?, ?>>> a(ArrayList<dz.a> paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      dz.a locala = (dz.a)paramArrayList.get(j);
      localHashMap.put(locala.b, locala.a());
    }
    return localHashMap;
  }
  
  private void d()
  {
    Iterator localIterator1 = this.b.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      HashMap localHashMap = (HashMap)this.b.get(str);
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext()) {
        ((dw.a)localHashMap.get((String)localIterator2.next())).a(this);
      }
    }
  }
  
  final int a()
  {
    return this.a;
  }
  
  public final HashMap<String, dw.a<?, ?>> a(String paramString)
  {
    return (HashMap)this.b.get(paramString);
  }
  
  final ArrayList<dz.a> b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new dz.a(str, (HashMap)this.b.get(str)));
    }
    return localArrayList;
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = this.b.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      localStringBuilder.append(str1).append(":\n");
      HashMap localHashMap = (HashMap)this.b.get(str1);
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localStringBuilder.append("  ").append(str2).append(": ");
        localStringBuilder.append(localHashMap.get(str2));
      }
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cz.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dz
 * JD-Core Version:    0.7.0.1
 */