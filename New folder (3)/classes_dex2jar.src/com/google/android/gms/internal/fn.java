package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class fn
  implements SafeParcelable
{
  public static final ed CREATOR = new ed();
  private final int a;
  private final String b;
  private final String[] c;
  private final String[] d;
  private final String[] e;
  private final String f;
  private final String g;
  private final String h;
  private final String i;
  
  fn(int paramInt, String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramArrayOfString1;
    this.d = paramArrayOfString2;
    this.e = paramArrayOfString3;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramString4;
    this.i = paramString5;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final String[] c()
  {
    return this.c;
  }
  
  public final String[] d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String[] e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fn)) {}
    fn localfn;
    do
    {
      return false;
      localfn = (fn)paramObject;
    } while ((this.a != localfn.a) || (!cp.a(this.b, localfn.b)) || (!cp.a(this.c, localfn.c)) || (!cp.a(this.d, localfn.d)) || (!cp.a(this.e, localfn.e)) || (!cp.a(this.f, localfn.f)) || (!cp.a(this.g, localfn.g)) || (!cp.a(this.h, localfn.h)) || (!cp.a(this.i, localfn.i)));
    return true;
  }
  
  public final String f()
  {
    return this.f;
  }
  
  public final String g()
  {
    return this.g;
  }
  
  public final String h()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    arrayOfObject[4] = this.e;
    arrayOfObject[5] = this.f;
    arrayOfObject[6] = this.g;
    arrayOfObject[7] = this.h;
    arrayOfObject[8] = this.i;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String i()
  {
    return this.i;
  }
  
  public String toString()
  {
    return cp.a(this).a("versionCode", Integer.valueOf(this.a)).a("accountName", this.b).a("requestedScopes", this.c).a("visibleActivities", this.d).a("requiredFeatures", this.e).a("packageNameForAuth", this.f).a("callingPackageName", this.g).a("applicationName", this.h).a("clientId", this.i).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ed.a(this, paramParcel);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fn
 * JD-Core Version:    0.7.0.1
 */