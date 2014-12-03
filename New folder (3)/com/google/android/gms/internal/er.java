package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;

public final class er
{
  private String[] a;
  private br b;
  
  private Uri c(Uri paramUri)
  {
    try
    {
      if (paramUri.getQueryParameter("ms") != null) {
        throw new es("Query parameter already exists: ms");
      }
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new es("Provided Uri is not in a valid state");
    }
    String str1 = this.b.a();
    String str2 = paramUri.toString();
    int i = str2.indexOf("&adurl");
    if (i == -1) {
      i = str2.indexOf("?adurl");
    }
    if (i != -1) {
      return Uri.parse(str2.substring(0, i + 1) + "ms" + "=" + str1 + "&" + str2.substring(i + 1));
    }
    Uri localUri = paramUri.buildUpon().appendQueryParameter("ms", str1).build();
    return localUri;
  }
  
  public final br a()
  {
    return this.b;
  }
  
  public final boolean a(Uri paramUri)
  {
    if (paramUri == null) {
      throw new NullPointerException();
    }
    try
    {
      String str = paramUri.getHost();
      String[] arrayOfString = this.a;
      int i = arrayOfString.length;
      for (int j = 0;; j++)
      {
        boolean bool1 = false;
        if (j < i)
        {
          boolean bool2 = str.endsWith(arrayOfString[j]);
          if (bool2) {
            bool1 = true;
          }
        }
        else
        {
          return bool1;
        }
      }
      return false;
    }
    catch (NullPointerException localNullPointerException) {}
  }
  
  public final Uri b(Uri paramUri)
  {
    try
    {
      paramUri.getQueryParameter("ai");
      Uri localUri = c(paramUri);
      return localUri;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new es("Provided Uri is not in a valid state");
    }
  }
  
  public final void b() {}
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.er
 * JD-Core Version:    0.7.0.1
 */