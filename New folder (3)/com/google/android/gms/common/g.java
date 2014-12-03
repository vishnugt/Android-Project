package com.google.android.gms.common;

import [[B;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.b;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.cg;
import com.google.android.gms.internal.dh;
import java.io.UnsupportedEncodingException;

public final class g
{
  static final byte[][] a;
  static final byte[][] b;
  static final byte[][] c;
  static final byte[][] d;
  static final byte[][] e;
  public static boolean f = false;
  public static boolean g = false;
  static boolean h = false;
  private static final byte[][] i;
  private static final byte[][] j;
  private static int k = -1;
  private static final Object l = new Object();
  
  static
  {
    byte[][] arrayOfByte1 = new byte[2][];
    arrayOfByte1[0] = a("");
    arrayOfByte1[1] = a("");
    a = arrayOfByte1;
    byte[][] arrayOfByte2 = new byte[2][];
    arrayOfByte2[0] = a("");
    arrayOfByte2[1] = a("");
    b = arrayOfByte2;
    byte[][] arrayOfByte3 = new byte[1][];
    arrayOfByte3[0] = a("");
    c = arrayOfByte3;
    byte[][] arrayOfByte4 = new byte[2][];
    arrayOfByte4[0] = a("");
    arrayOfByte4[1] = a("");
    d = arrayOfByte4;
    byte[][][] arrayOfByte = new byte[4][][];
    arrayOfByte[0] = a;
    arrayOfByte[1] = b;
    arrayOfByte[2] = c;
    arrayOfByte[3] = d;
    int m = arrayOfByte.length;
    int n = 0;
    int i1 = 0;
    while (n < m)
    {
      i1 += arrayOfByte[n].length;
      n++;
    }
    byte[][] arrayOfByte5 = new byte[i1][];
    int i2 = arrayOfByte.length;
    int i3 = 0;
    int i4 = 0;
    while (i4 < i2)
    {
      [[B local[[B = arrayOfByte[i4];
      int i5 = i3;
      int i6 = 0;
      while (i6 < local[[B.length)
      {
        int i7 = i5 + 1;
        arrayOfByte5[i5] = local[[B[i6];
        i6++;
        i5 = i7;
      }
      i4++;
      i3 = i5;
    }
    i = arrayOfByte5;
    byte[][] arrayOfByte6 = new byte[3][];
    arrayOfByte6[0] = a[0];
    arrayOfByte6[1] = b[0];
    arrayOfByte6[2] = d[0];
    j = arrayOfByte6;
    byte[][] arrayOfByte7 = new byte[1][];
    arrayOfByte7[0] = a("");
    e = arrayOfByte7;
  }
  
  public static int a(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      paramContext.getResources().getString(b.common_google_play_services_unknown_issue);
      label16:
      if (System.currentTimeMillis() < 1227312000288L) {
        return 12;
      }
      try
      {
        ApplicationInfo localApplicationInfo3 = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        localApplicationInfo1 = localApplicationInfo3;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        for (;;)
        {
          Bundle localBundle;
          int m;
          Log.wtf("GooglePlayServicesUtil", "This should never happen.", localNameNotFoundException1);
          ApplicationInfo localApplicationInfo1 = null;
        }
      }
      localBundle = localApplicationInfo1.metaData;
      if (localBundle != null)
      {
        m = localBundle.getInt("com.google.android.gms.version");
        if (m != 4030500) {
          throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 4030500 but found " + m + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
      }
      else
      {
        throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
      }
      byte[] arrayOfByte;
      try
      {
        PackageInfo localPackageInfo1 = localPackageManager.getPackageInfo("com.android.vending", 64);
        arrayOfByte = a(localPackageInfo1, a);
        if (arrayOfByte == null) {
          return 9;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2)
      {
        return 9;
      }
      PackageInfo localPackageInfo2;
      try
      {
        localPackageInfo2 = localPackageManager.getPackageInfo("com.google.android.gms", 64);
        if (a(localPackageInfo2, new byte[][] { arrayOfByte }) == null) {
          return 9;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException3)
      {
        return 1;
      }
      if (localPackageInfo2.versionCode < 4030500)
      {
        new StringBuilder("Google Play services out of date.  Requires 4030500 but found ").append(localPackageInfo2.versionCode).toString();
        return 2;
      }
      try
      {
        ApplicationInfo localApplicationInfo2 = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
        if (!localApplicationInfo2.enabled) {
          return 3;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException4)
      {
        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
        localNameNotFoundException4.printStackTrace();
        return 1;
      }
      return 0;
    }
    catch (Throwable localThrowable)
    {
      break label16;
    }
  }
  
  public static Dialog a(int paramInt, Activity paramActivity)
  {
    AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(paramActivity);
    Resources localResources1 = paramActivity.getResources();
    String str1;
    label85:
    AlertDialog.Builder localBuilder2;
    bv localbv;
    Resources localResources2;
    String str2;
    switch (paramInt)
    {
    case 4: 
    case 6: 
    case 8: 
    case 10: 
    case 11: 
    default: 
      str1 = localResources1.getString(b.common_google_play_services_unknown_issue);
      localBuilder2 = localBuilder1.setMessage(str1);
      localbv = new bv(paramActivity, a(paramInt));
      localResources2 = paramActivity.getResources();
      switch (paramInt)
      {
      default: 
        str2 = localResources2.getString(17039370);
      }
      break;
    }
    for (;;)
    {
      if (str2 != null) {
        localBuilder2.setPositiveButton(str2, localbv);
      }
      switch (paramInt)
      {
      default: 
        new StringBuilder("Unexpected error code ").append(paramInt).toString();
        return localBuilder2.setTitle(b.common_google_play_services_unknown_issue).create();
        Resources localResources3 = paramActivity.getResources();
        int m;
        label285:
        int n;
        if ((0xF & localResources3.getConfiguration().screenLayout) > 3)
        {
          m = 1;
          if ((!dh.a(11)) || (m == 0))
          {
            Configuration localConfiguration = localResources3.getConfiguration();
            if (!dh.a(13)) {
              break label379;
            }
            if (((0xF & localConfiguration.screenLayout) > 3) || (localConfiguration.smallestScreenWidthDp < 600)) {
              break label373;
            }
            n = 1;
          }
        }
        for (;;)
        {
          int i1 = 0;
          if (n != 0) {
            i1 = 1;
          }
          if (i1 == 0) {
            break label385;
          }
          str1 = localResources1.getString(b.common_google_play_services_install_text_tablet);
          break;
          m = 0;
          break label285;
          label373:
          n = 0;
          continue;
          label379:
          n = 0;
        }
        label385:
        str1 = localResources1.getString(b.common_google_play_services_install_text_phone);
        break label85;
        str1 = localResources1.getString(b.common_google_play_services_enable_text);
        break label85;
        str1 = localResources1.getString(b.common_google_play_services_update_text);
        break label85;
        str1 = localResources1.getString(b.common_google_play_services_unsupported_text);
        break label85;
        str1 = localResources1.getString(b.common_google_play_services_network_error_text);
        break label85;
        str1 = localResources1.getString(b.common_google_play_services_invalid_account_text);
        break label85;
        str1 = localResources1.getString(b.common_google_play_services_unsupported_date_text);
        break label85;
        str2 = localResources2.getString(b.common_google_play_services_install_button);
        continue;
        str2 = localResources2.getString(b.common_google_play_services_enable_button);
        continue;
        str2 = localResources2.getString(b.common_google_play_services_update_button);
      }
    }
    return null;
    return localBuilder2.setTitle(b.common_google_play_services_unknown_issue).create();
    return localBuilder2.setTitle(b.common_google_play_services_install_title).create();
    return localBuilder2.setTitle(b.common_google_play_services_enable_title).create();
    return localBuilder2.setTitle(b.common_google_play_services_update_title).create();
    return localBuilder2.setTitle(b.common_google_play_services_unsupported_title).create();
    return localBuilder2.setTitle(b.common_google_play_services_network_error_title).create();
    return localBuilder2.setTitle(b.common_google_play_services_unknown_issue).create();
    return localBuilder2.setTitle(b.common_google_play_services_unknown_issue).create();
    return localBuilder2.setTitle(b.common_google_play_services_invalid_account_title).create();
    return localBuilder2.setTitle(b.common_google_play_services_unknown_issue).create();
    return localBuilder2.setTitle(b.common_google_play_services_unsupported_title).create();
  }
  
  private static Intent a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
    case 2: 
      return cg.b("com.google.android.gms");
    case 3: 
      return cg.a("com.google.android.gms");
    }
    return cg.a();
  }
  
  /* Error */
  private static byte[] a(PackageInfo paramPackageInfo, byte[]... paramVarArgs)
  {
    // Byte code:
    //   0: ldc_w 312
    //   3: invokestatic 318	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   6: astore_3
    //   7: aload_0
    //   8: getfield 322	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   11: arraylength
    //   12: iconst_1
    //   13: if_icmpeq +8 -> 21
    //   16: aconst_null
    //   17: areturn
    //   18: astore_2
    //   19: aconst_null
    //   20: areturn
    //   21: new 324	java/io/ByteArrayInputStream
    //   24: dup
    //   25: aload_0
    //   26: getfield 322	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   29: iconst_0
    //   30: aaload
    //   31: invokevirtual 330	android/content/pm/Signature:toByteArray	()[B
    //   34: invokespecial 333	java/io/ByteArrayInputStream:<init>	([B)V
    //   37: astore 4
    //   39: aload_3
    //   40: aload 4
    //   42: invokevirtual 337	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   45: checkcast 339	java/security/cert/X509Certificate
    //   48: astore 6
    //   50: aload 6
    //   52: invokevirtual 342	java/security/cert/X509Certificate:checkValidity	()V
    //   55: aload_0
    //   56: getfield 322	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   59: iconst_0
    //   60: aaload
    //   61: invokevirtual 330	android/content/pm/Signature:toByteArray	()[B
    //   64: astore 9
    //   66: iconst_0
    //   67: istore 10
    //   69: iload 10
    //   71: aload_1
    //   72: arraylength
    //   73: if_icmpge +40 -> 113
    //   76: aload_1
    //   77: iload 10
    //   79: aaload
    //   80: astore 12
    //   82: aload 12
    //   84: aload 9
    //   86: invokestatic 348	java/util/Arrays:equals	([B[B)Z
    //   89: ifeq +18 -> 107
    //   92: aload 12
    //   94: areturn
    //   95: astore 5
    //   97: aconst_null
    //   98: areturn
    //   99: astore 8
    //   101: aconst_null
    //   102: areturn
    //   103: astore 7
    //   105: aconst_null
    //   106: areturn
    //   107: iinc 10 1
    //   110: goto -41 -> 69
    //   113: ldc 154
    //   115: iconst_2
    //   116: invokestatic 352	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   119: ifeq +26 -> 145
    //   122: new 134	java/lang/StringBuilder
    //   125: dup
    //   126: ldc_w 354
    //   129: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   132: aload 9
    //   134: iconst_0
    //   135: invokestatic 360	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   138: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: pop
    //   145: aconst_null
    //   146: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	paramPackageInfo	PackageInfo
    //   0	147	1	paramVarArgs	byte[][]
    //   18	1	2	localCertificateException1	java.security.cert.CertificateException
    //   6	34	3	localCertificateFactory	java.security.cert.CertificateFactory
    //   37	4	4	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   95	1	5	localCertificateException2	java.security.cert.CertificateException
    //   48	3	6	localX509Certificate	java.security.cert.X509Certificate
    //   103	1	7	localCertificateNotYetValidException	java.security.cert.CertificateNotYetValidException
    //   99	1	8	localCertificateExpiredException	java.security.cert.CertificateExpiredException
    //   64	69	9	arrayOfByte1	byte[]
    //   67	41	10	m	int
    //   80	13	12	arrayOfByte2	byte[]
    // Exception table:
    //   from	to	target	type
    //   0	7	18	java/security/cert/CertificateException
    //   39	50	95	java/security/cert/CertificateException
    //   50	55	99	java/security/cert/CertificateExpiredException
    //   50	55	103	java/security/cert/CertificateNotYetValidException
  }
  
  private static byte[] a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("ISO-8859-1");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError(localUnsupportedEncodingException);
    }
  }
  
  public static void b(Context paramContext)
  {
    int m = a(paramContext);
    if (m != 0)
    {
      Intent localIntent = a(m);
      new StringBuilder("GooglePlayServices not available due to error ").append(m).toString();
      if (localIntent == null) {
        throw new e(m);
      }
      throw new f(m, "Google Play Services not available", localIntent);
    }
  }
  
  public static Context c(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.g
 * JD-Core Version:    0.7.0.1
 */