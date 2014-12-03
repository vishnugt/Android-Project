package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public final class n
{
  public static boolean a(Context paramContext, be parambe)
  {
    if (parambe == null) {}
    Intent localIntent;
    do
    {
      return false;
      localIntent = new Intent();
    } while (TextUtils.isEmpty(parambe.c));
    if (!TextUtils.isEmpty(parambe.d)) {
      localIntent.setDataAndType(Uri.parse(parambe.c), parambe.d);
    }
    String[] arrayOfString;
    for (;;)
    {
      localIntent.setAction("android.intent.action.VIEW");
      if (!TextUtils.isEmpty(parambe.e)) {
        localIntent.setPackage(parambe.e);
      }
      if (TextUtils.isEmpty(parambe.f)) {
        break label155;
      }
      arrayOfString = parambe.f.split("/", 2);
      if (arrayOfString.length >= 2) {
        break;
      }
      new StringBuilder("Could not parse component name from open GMSG: ").append(parambe.f).toString();
      return false;
      localIntent.setData(Uri.parse(parambe.c));
    }
    localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
    try
    {
      label155:
      new StringBuilder("Launching an intent: ").append(localIntent).toString();
      paramContext.startActivity(localIntent);
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      localActivityNotFoundException.getMessage();
    }
    return false;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.n
 * JD-Core Version:    0.7.0.1
 */