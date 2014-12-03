package org.OpenUDID;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.provider.Settings.Secure;
import com.supercell.titan.GameApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class OpenUDID_manager
  implements ServiceConnection
{
  private static String f = null;
  private static boolean g = false;
  private final Context a;
  private List<ResolveInfo> b;
  private Map<String, Integer> c;
  private final SharedPreferences d;
  private final Random e;
  
  private OpenUDID_manager(Context paramContext)
  {
    this.d = paramContext.getSharedPreferences("openudid_prefs", 0);
    this.a = paramContext;
    this.e = new Random();
    this.c = new HashMap();
  }
  
  public static String a()
  {
    return f;
  }
  
  public static void a(Context paramContext)
  {
    OpenUDID_manager localOpenUDID_manager = new OpenUDID_manager(paramContext);
    String str = localOpenUDID_manager.d.getString("openudid", null);
    f = str;
    if (str == null)
    {
      localOpenUDID_manager.b = paramContext.getPackageManager().queryIntentServices(new Intent("org.OpenUDID.GETUDID"), 0);
      if (localOpenUDID_manager.b != null) {
        localOpenUDID_manager.c();
      }
      return;
    }
    g = true;
  }
  
  public static boolean b()
  {
    return g;
  }
  
  private void c()
  {
    if (this.b.size() > 0)
    {
      ServiceInfo localServiceInfo = ((ResolveInfo)this.b.get(0)).serviceInfo;
      Intent localIntent = new Intent();
      localIntent.setComponent(new ComponentName(localServiceInfo.applicationInfo.packageName, localServiceInfo.name));
      try
      {
        this.a.bindService(localIntent, this, 1);
        this.b.remove(0);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          GameApp.debuggerException(localException);
        }
      }
    }
    if (!this.c.isEmpty())
    {
      TreeMap localTreeMap = new TreeMap(new a(this, (byte)0));
      localTreeMap.putAll(this.c);
      f = (String)localTreeMap.firstKey();
    }
    if (f == null)
    {
      String str = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
      f = str;
      if ((str == null) || (f.equals("9774d56d682e549c")) || (f.length() < 15)) {
        f = new BigInteger(64, new SecureRandom()).toString(16);
      }
    }
    SharedPreferences.Editor localEditor = this.d.edit();
    localEditor.putString("openudid", f);
    localEditor.commit();
    g = true;
  }
  
  /* Error */
  public void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: invokestatic 223	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 5
    //   5: aload 5
    //   7: aload_0
    //   8: getfield 49	org/OpenUDID/OpenUDID_manager:e	Ljava/util/Random;
    //   11: invokevirtual 226	java/util/Random:nextInt	()I
    //   14: invokevirtual 230	android/os/Parcel:writeInt	(I)V
    //   17: invokestatic 223	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   20: astore 6
    //   22: aload_2
    //   23: iconst_1
    //   24: invokestatic 223	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   27: aload 6
    //   29: iconst_0
    //   30: invokeinterface 236 5 0
    //   35: pop
    //   36: aload 5
    //   38: invokevirtual 239	android/os/Parcel:readInt	()I
    //   41: aload 6
    //   43: invokevirtual 239	android/os/Parcel:readInt	()I
    //   46: if_icmpne +63 -> 109
    //   49: aload 6
    //   51: invokevirtual 242	android/os/Parcel:readString	()Ljava/lang/String;
    //   54: astore 8
    //   56: aload 8
    //   58: ifnull +51 -> 109
    //   61: aload_0
    //   62: getfield 54	org/OpenUDID/OpenUDID_manager:c	Ljava/util/Map;
    //   65: aload 8
    //   67: invokeinterface 245 2 0
    //   72: ifeq +50 -> 122
    //   75: aload_0
    //   76: getfield 54	org/OpenUDID/OpenUDID_manager:c	Ljava/util/Map;
    //   79: aload 8
    //   81: iconst_1
    //   82: aload_0
    //   83: getfield 54	org/OpenUDID/OpenUDID_manager:c	Ljava/util/Map;
    //   86: aload 8
    //   88: invokeinterface 248 2 0
    //   93: checkcast 250	java/lang/Integer
    //   96: invokevirtual 253	java/lang/Integer:intValue	()I
    //   99: iadd
    //   100: invokestatic 257	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   103: invokeinterface 261 3 0
    //   108: pop
    //   109: aload_0
    //   110: getfield 44	org/OpenUDID/OpenUDID_manager:a	Landroid/content/Context;
    //   113: aload_0
    //   114: invokevirtual 265	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   117: aload_0
    //   118: invokespecial 87	org/OpenUDID/OpenUDID_manager:c	()V
    //   121: return
    //   122: aload_0
    //   123: getfield 54	org/OpenUDID/OpenUDID_manager:c	Ljava/util/Map;
    //   126: aload 8
    //   128: iconst_1
    //   129: invokestatic 257	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   132: invokeinterface 261 3 0
    //   137: pop
    //   138: goto -29 -> 109
    //   141: astore_3
    //   142: goto -33 -> 109
    //   145: astore 4
    //   147: aload 4
    //   149: invokestatic 143	com/supercell/titan/GameApp:debuggerException	(Ljava/lang/Exception;)V
    //   152: goto -35 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	155	0	this	OpenUDID_manager
    //   0	155	1	paramComponentName	ComponentName
    //   0	155	2	paramIBinder	android.os.IBinder
    //   141	1	3	localRemoteException	android.os.RemoteException
    //   145	3	4	localException	Exception
    //   3	34	5	localParcel1	android.os.Parcel
    //   20	30	6	localParcel2	android.os.Parcel
    //   54	73	8	str	String
    // Exception table:
    //   from	to	target	type
    //   0	56	141	android/os/RemoteException
    //   61	109	141	android/os/RemoteException
    //   122	138	141	android/os/RemoteException
    //   109	117	145	java/lang/Exception
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     org.OpenUDID.OpenUDID_manager
 * JD-Core Version:    0.7.0.1
 */