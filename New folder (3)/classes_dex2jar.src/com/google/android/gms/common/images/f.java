package com.google.android.gms.common.images;

import android.net.Uri;
import java.util.Arrays;

public final class f
{
  public final Uri a;
  
  public f(Uri paramUri)
  {
    this.a = paramUri;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof f)) {}
    do
    {
      return false;
      if (this == paramObject) {
        return true;
      }
    } while (((f)paramObject).hashCode() != hashCode());
    return true;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.f
 * JD-Core Version:    0.7.0.1
 */