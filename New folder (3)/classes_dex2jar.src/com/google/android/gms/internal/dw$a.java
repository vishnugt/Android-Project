package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

public class dw$a<I, O>
  implements SafeParcelable
{
  public static final cx CREATOR = new cx();
  protected final int a;
  protected final boolean b;
  protected final int c;
  protected final boolean d;
  protected final String e;
  protected final int f;
  protected final Class<? extends dw> g;
  protected final String h;
  private final int i;
  private dz j;
  private cw<I, O> k;
  
  dw$a(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, int paramInt4, String paramString2, dr paramdr)
  {
    this.i = paramInt1;
    this.a = paramInt2;
    this.b = paramBoolean1;
    this.c = paramInt3;
    this.d = paramBoolean2;
    this.e = paramString1;
    this.f = paramInt4;
    if (paramString2 == null) {
      this.g = null;
    }
    for (this.h = null; paramdr == null; this.h = paramString2)
    {
      this.k = null;
      return;
      this.g = ec.class;
    }
    this.k = paramdr.c();
  }
  
  private dw$a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString, int paramInt3, Class<? extends dw> paramClass, cw<I, O> paramcw)
  {
    this.i = 1;
    this.a = paramInt1;
    this.b = paramBoolean1;
    this.c = paramInt2;
    this.d = paramBoolean2;
    this.e = paramString;
    this.f = paramInt3;
    this.g = paramClass;
    if (paramClass == null) {}
    for (this.h = null;; this.h = paramClass.getCanonicalName())
    {
      this.k = paramcw;
      return;
    }
  }
  
  public static a<ArrayList<String>, ArrayList<String>> a(String paramString)
  {
    return new a(7, true, 7, true, paramString, 3, null, null);
  }
  
  public static a<Integer, Integer> a(String paramString, int paramInt)
  {
    return new a(0, false, 0, false, paramString, paramInt, null, null);
  }
  
  public static a a(String paramString, int paramInt, cw<?, ?> paramcw)
  {
    return new a(7, false, 0, false, paramString, paramInt, null, paramcw);
  }
  
  public static <T extends dw> a<T, T> a(String paramString, int paramInt, Class<T> paramClass)
  {
    return new a(11, false, 11, false, paramString, paramInt, paramClass, null);
  }
  
  public static a<Double, Double> b(String paramString, int paramInt)
  {
    return new a(4, false, 4, false, paramString, paramInt, null, null);
  }
  
  public static <T extends dw> a<ArrayList<T>, ArrayList<T>> b(String paramString, int paramInt, Class<T> paramClass)
  {
    return new a(11, true, 11, true, paramString, paramInt, paramClass, null);
  }
  
  public static a<Boolean, Boolean> c(String paramString, int paramInt)
  {
    return new a(6, false, 6, false, paramString, paramInt, null, null);
  }
  
  public static a<String, String> d(String paramString, int paramInt)
  {
    return new a(7, false, 7, false, paramString, paramInt, null, null);
  }
  
  public final int a()
  {
    return this.i;
  }
  
  public final I a(O paramO)
  {
    return this.k.a(paramO);
  }
  
  public final void a(dz paramdz)
  {
    this.j = paramdz;
  }
  
  public final int b()
  {
    return this.a;
  }
  
  public final boolean c()
  {
    return this.b;
  }
  
  public final int d()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final boolean e()
  {
    return this.d;
  }
  
  public final String f()
  {
    return this.e;
  }
  
  public final int g()
  {
    return this.f;
  }
  
  public final Class<? extends dw> h()
  {
    return this.g;
  }
  
  final String i()
  {
    if (this.h == null) {
      return null;
    }
    return this.h;
  }
  
  public final boolean j()
  {
    return this.k != null;
  }
  
  final dr k()
  {
    if (this.k == null) {
      return null;
    }
    return dr.a(this.k);
  }
  
  public final HashMap<String, a<?, ?>> l()
  {
    cr.a(this.h);
    cr.a(this.j);
    return this.j.a(this.h);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("Field\n");
    localStringBuilder1.append("            versionCode=").append(this.i).append('\n');
    localStringBuilder1.append("                 typeIn=").append(this.a).append('\n');
    localStringBuilder1.append("            typeInArray=").append(this.b).append('\n');
    localStringBuilder1.append("                typeOut=").append(this.c).append('\n');
    localStringBuilder1.append("           typeOutArray=").append(this.d).append('\n');
    localStringBuilder1.append("        outputFieldName=").append(this.e).append('\n');
    localStringBuilder1.append("      safeParcelFieldId=").append(this.f).append('\n');
    localStringBuilder1.append("       concreteTypeName=").append(i()).append('\n');
    if (this.g != null) {
      localStringBuilder1.append("     concreteType.class=").append(this.g.getCanonicalName()).append('\n');
    }
    StringBuilder localStringBuilder2 = localStringBuilder1.append("          converterName=");
    if (this.k == null) {}
    for (String str = "null";; str = this.k.getClass().getCanonicalName())
    {
      localStringBuilder2.append(str).append('\n');
      return localStringBuilder1.toString();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cx.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dw.a
 * JD-Core Version:    0.7.0.1
 */