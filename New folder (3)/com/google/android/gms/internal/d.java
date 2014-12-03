package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

final class d
  implements k
{
  public final void a(ax paramax, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("urls");
    if (str1 == null) {
      return;
    }
    String[] arrayOfString1 = str1.split(",");
    HashMap localHashMap = new HashMap();
    PackageManager localPackageManager = paramax.getContext().getPackageManager();
    int i = arrayOfString1.length;
    int j = 0;
    if (j < i)
    {
      String str2 = arrayOfString1[j];
      String[] arrayOfString2 = str2.split(";", 2);
      String str3 = arrayOfString2[0].trim();
      String str4;
      if (arrayOfString2.length > 1)
      {
        str4 = arrayOfString2[1].trim();
        label100:
        if (localPackageManager.resolveActivity(new Intent(str4, Uri.parse(str3)), 65536) == null) {
          break label153;
        }
      }
      label153:
      for (boolean bool = true;; bool = false)
      {
        localHashMap.put(str2, Boolean.valueOf(bool));
        j++;
        break;
        str4 = "android.intent.action.VIEW";
        break label100;
      }
    }
    paramax.a("openableURLs", localHashMap);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.d
 * JD-Core Version:    0.7.0.1
 */