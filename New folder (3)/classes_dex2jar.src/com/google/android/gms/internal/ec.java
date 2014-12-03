package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ec
  extends dw
  implements SafeParcelable
{
  public static final db CREATOR = new db();
  private final int a;
  private final Parcel b;
  private final int c;
  private final dz d;
  private final String e;
  private int f;
  private int g;
  
  ec(int paramInt, Parcel paramParcel, dz paramdz)
  {
    this.a = paramInt;
    this.b = ((Parcel)cr.a(paramParcel));
    this.c = 2;
    this.d = paramdz;
    if (this.d == null) {}
    for (this.e = null;; this.e = this.d.c())
    {
      this.f = 2;
      return;
    }
  }
  
  private static HashMap<String, String> a(Bundle paramBundle)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramBundle.getString(str));
    }
    return localHashMap;
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unknown type = " + paramInt);
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      paramStringBuilder.append(paramObject);
      return;
    case 7: 
      paramStringBuilder.append("\"").append(df.a(paramObject.toString())).append("\"");
      return;
    case 8: 
      paramStringBuilder.append("\"").append(de.a((byte[])paramObject)).append("\"");
      return;
    case 9: 
      paramStringBuilder.append("\"").append(de.b((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 10: 
      dg.a(paramStringBuilder, (HashMap)paramObject);
      return;
    }
    throw new IllegalArgumentException("Method does not accept concrete type.");
  }
  
  private void a(StringBuilder paramStringBuilder, dw.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    int i = 0;
    if (parama.e())
    {
      paramStringBuilder.append("[");
      int i8;
      int i9;
      Object localObject;
      switch (parama.d())
      {
      default: 
        throw new IllegalStateException("Unknown field type out.");
      case 0: 
        int i11 = a.a(paramParcel, paramInt);
        int i12 = paramParcel.dataPosition();
        int[] arrayOfInt = null;
        if (i11 == 0) {}
        for (;;)
        {
          int i13 = arrayOfInt.length;
          while (i < i13)
          {
            if (i != 0) {
              paramStringBuilder.append(",");
            }
            paramStringBuilder.append(Integer.toString(arrayOfInt[i]));
            i++;
          }
          arrayOfInt = paramParcel.createIntArray();
          paramParcel.setDataPosition(i11 + i12);
        }
      case 1: 
        i8 = a.a(paramParcel, paramInt);
        i9 = paramParcel.dataPosition();
        localObject = null;
        if (i8 == 0) {
          dc.a(paramStringBuilder, (Object[])localObject);
        }
        break;
      }
      for (;;)
      {
        paramStringBuilder.append("]");
        return;
        int i10 = paramParcel.readInt();
        localObject = new BigInteger[i10];
        while (i < i10)
        {
          localObject[i] = new BigInteger(paramParcel.createByteArray());
          i++;
        }
        paramParcel.setDataPosition(i8 + i9);
        break;
        int i6 = a.a(paramParcel, paramInt);
        int i7 = paramParcel.dataPosition();
        long[] arrayOfLong = null;
        if (i6 == 0) {}
        for (;;)
        {
          dc.a(paramStringBuilder, arrayOfLong);
          break;
          arrayOfLong = paramParcel.createLongArray();
          paramParcel.setDataPosition(i6 + i7);
        }
        int i4 = a.a(paramParcel, paramInt);
        int i5 = paramParcel.dataPosition();
        float[] arrayOfFloat = null;
        if (i4 == 0) {}
        for (;;)
        {
          dc.a(paramStringBuilder, arrayOfFloat);
          break;
          arrayOfFloat = paramParcel.createFloatArray();
          paramParcel.setDataPosition(i4 + i5);
        }
        int i2 = a.a(paramParcel, paramInt);
        int i3 = paramParcel.dataPosition();
        double[] arrayOfDouble = null;
        if (i2 == 0) {}
        for (;;)
        {
          dc.a(paramStringBuilder, arrayOfDouble);
          break;
          arrayOfDouble = paramParcel.createDoubleArray();
          paramParcel.setDataPosition(i2 + i3);
        }
        dc.a(paramStringBuilder, a.o(paramParcel, paramInt));
        continue;
        int n = a.a(paramParcel, paramInt);
        int i1 = paramParcel.dataPosition();
        boolean[] arrayOfBoolean = null;
        if (n == 0) {}
        for (;;)
        {
          dc.a(paramStringBuilder, arrayOfBoolean);
          break;
          arrayOfBoolean = paramParcel.createBooleanArray();
          paramParcel.setDataPosition(n + i1);
        }
        dc.a(paramStringBuilder, a.p(paramParcel, paramInt));
        continue;
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
        Parcel[] arrayOfParcel = a.s(paramParcel, paramInt);
        int k = arrayOfParcel.length;
        for (int m = 0; m < k; m++)
        {
          if (m > 0) {
            paramStringBuilder.append(",");
          }
          arrayOfParcel[m].setDataPosition(0);
          a(paramStringBuilder, parama.l(), arrayOfParcel[m]);
        }
      }
    }
    switch (parama.d())
    {
    default: 
      throw new IllegalStateException("Unknown field type out");
    case 0: 
      paramStringBuilder.append(a.e(paramParcel, paramInt));
      return;
    case 1: 
      paramStringBuilder.append(a.g(paramParcel, paramInt));
      return;
    case 2: 
      paramStringBuilder.append(a.f(paramParcel, paramInt));
      return;
    case 3: 
      paramStringBuilder.append(a.h(paramParcel, paramInt));
      return;
    case 4: 
      paramStringBuilder.append(a.i(paramParcel, paramInt));
      return;
    case 5: 
      paramStringBuilder.append(a.j(paramParcel, paramInt));
      return;
    case 6: 
      paramStringBuilder.append(a.c(paramParcel, paramInt));
      return;
    case 7: 
      String str2 = a.k(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(df.a(str2)).append("\"");
      return;
    case 8: 
      byte[] arrayOfByte2 = a.n(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(de.a(arrayOfByte2)).append("\"");
      return;
    case 9: 
      byte[] arrayOfByte1 = a.n(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(de.b(arrayOfByte1));
      paramStringBuilder.append("\"");
      return;
    case 10: 
      Bundle localBundle = a.m(paramParcel, paramInt);
      Set localSet = localBundle.keySet();
      localSet.size();
      paramStringBuilder.append("{");
      Iterator localIterator = localSet.iterator();
      for (int j = 1; localIterator.hasNext(); j = 0)
      {
        String str1 = (String)localIterator.next();
        if (j == 0) {
          paramStringBuilder.append(",");
        }
        paramStringBuilder.append("\"").append(str1).append("\"");
        paramStringBuilder.append(":");
        paramStringBuilder.append("\"").append(df.a(localBundle.getString(str1))).append("\"");
      }
      paramStringBuilder.append("}");
      return;
    }
    Parcel localParcel = a.r(paramParcel, paramInt);
    localParcel.setDataPosition(0);
    a(paramStringBuilder, parama.l(), localParcel);
  }
  
  private static void a(StringBuilder paramStringBuilder, dw.a<?, ?> parama, Object paramObject)
  {
    if (parama.c())
    {
      ArrayList localArrayList = (ArrayList)paramObject;
      paramStringBuilder.append("[");
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        if (j != 0) {
          paramStringBuilder.append(",");
        }
        a(paramStringBuilder, parama.b(), localArrayList.get(j));
      }
      paramStringBuilder.append("]");
      return;
    }
    a(paramStringBuilder, parama.b(), paramObject);
  }
  
  private void a(StringBuilder paramStringBuilder, HashMap<String, dw.a<?, ?>> paramHashMap, Parcel paramParcel)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator.next();
      localHashMap.put(Integer.valueOf(((dw.a)localEntry2.getValue()).g()), localEntry2);
    }
    paramStringBuilder.append('{');
    int i = a.a(paramParcel);
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      Map.Entry localEntry1 = (Map.Entry)localHashMap.get(Integer.valueOf(0xFFFF & k));
      if (localEntry1 != null)
      {
        if (j != 0) {
          paramStringBuilder.append(",");
        }
        String str = (String)localEntry1.getKey();
        dw.a locala = (dw.a)localEntry1.getValue();
        paramStringBuilder.append("\"").append(str).append("\":");
        if (locala.j()) {
          switch (locala.d())
          {
          default: 
            throw new IllegalArgumentException("Unknown field out type = " + locala.d());
          case 0: 
            a(paramStringBuilder, locala, a(locala, Integer.valueOf(a.e(paramParcel, k))));
          }
        }
        for (;;)
        {
          j = 1;
          break;
          a(paramStringBuilder, locala, a(locala, a.g(paramParcel, k)));
          continue;
          a(paramStringBuilder, locala, a(locala, Long.valueOf(a.f(paramParcel, k))));
          continue;
          a(paramStringBuilder, locala, a(locala, Float.valueOf(a.h(paramParcel, k))));
          continue;
          a(paramStringBuilder, locala, a(locala, Double.valueOf(a.i(paramParcel, k))));
          continue;
          a(paramStringBuilder, locala, a(locala, a.j(paramParcel, k)));
          continue;
          a(paramStringBuilder, locala, a(locala, Boolean.valueOf(a.c(paramParcel, k))));
          continue;
          a(paramStringBuilder, locala, a(locala, a.k(paramParcel, k)));
          continue;
          a(paramStringBuilder, locala, a(locala, a.n(paramParcel, k)));
          continue;
          a(paramStringBuilder, locala, a(locala, a(a.m(paramParcel, k))));
          continue;
          throw new IllegalArgumentException("Method does not accept concrete type.");
          a(paramStringBuilder, locala, paramParcel, k);
        }
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    paramStringBuilder.append('}');
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public final HashMap<String, dw.a<?, ?>> b()
  {
    if (this.d == null) {
      return null;
    }
    return this.d.a(this.e);
  }
  
  protected final Object c()
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  protected final boolean d()
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final Parcel e()
  {
    switch (this.f)
    {
    }
    for (;;)
    {
      return this.b;
      this.g = c.a(this.b, 20293);
      c.b(this.b, this.g);
      this.f = 2;
    }
  }
  
  final dz f()
  {
    switch (this.c)
    {
    default: 
      throw new IllegalStateException("Invalid creation type: " + this.c);
    case 0: 
      return null;
    case 1: 
      return this.d;
    }
    return this.d;
  }
  
  public String toString()
  {
    cr.a(this.d, "Cannot convert to JSON on client side.");
    Parcel localParcel = e();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new StringBuilder(100);
    a(localStringBuilder, this.d.a(this.e), localParcel);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    db.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ec
 * JD-Core Version:    0.7.0.1
 */