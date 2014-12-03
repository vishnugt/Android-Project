package com.supercell.titan;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import java.util.Vector;

public class NativeDialogManager
  extends DialogFragment
{
  public static boolean a;
  public static int b;
  public static int c;
  private static int d = 1000;
  private static NativeDialogManager g;
  private static Vector<at> h = new Vector();
  private int e = -1;
  private boolean f;
  
  public static int ShowDialog(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    int i = 1 + d;
    d = i;
    if (g == null)
    {
      a(paramString1, paramString2, paramString3, paramString4, paramString5, i);
      return i;
    }
    at localat = new at((byte)0);
    localat.a = paramString1;
    localat.b = paramString2;
    localat.c = paramString3;
    localat.d = paramString4;
    localat.e = paramString5;
    localat.f = i;
    h.add(localat);
    return i;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    if (this.f) {
      return;
    }
    this.f = true;
    g = null;
    GameApp localGameApp = GameApp.getInstance();
    if (!h.isEmpty())
    {
      at localat = (at)h.remove(0);
      a(localat.a, localat.b, localat.c, localat.d, localat.e, localat.f);
    }
    for (;;)
    {
      a = true;
      c = paramInt1;
      b = paramInt2;
      return;
      localGameApp.e().setRenderMode(1);
      WifiManager localWifiManager = (WifiManager)GameApp.getInstance().getSystemService("wifi");
      if (localWifiManager != null) {
        localWifiManager.reconnect();
      }
    }
  }
  
  private static void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    GameApp localGameApp = GameApp.getInstance();
    localGameApp.runOnUiThread(new ar(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt, localGameApp));
  }
  
  private void b()
  {
    this.f = true;
    try
    {
      dismiss();
      return;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
  
  public static boolean isDialogVisible()
  {
    return g != null;
  }
  
  public static void nativeDialogDismissAll()
  {
    h.clear();
    if (g != null)
    {
      g.b();
      g = null;
    }
    a = false;
    GameApp.getInstance().e().setRenderMode(1);
  }
  
  public final void a()
  {
    b();
    a = false;
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    GameApp localGameApp = GameApp.getInstance();
    if (localGameApp == null) {
      return null;
    }
    as localas = new as(this);
    String str1 = getArguments().getString("title");
    String str2 = getArguments().getString("button");
    String str3 = getArguments().getString("button2");
    String str4 = getArguments().getString("button3");
    String str5 = getArguments().getString("message");
    this.e = getArguments().getInt("id");
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localGameApp, 4).setTitle(str1).setMessage(str5).setNeutralButton(str2, localas);
    if (!str3.isEmpty()) {
      localBuilder.setPositiveButton(str3, localas);
    }
    if (!str4.isEmpty()) {
      localBuilder.setNegativeButton(str4, localas);
    }
    return localBuilder.create();
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    GameApp.getInstance().d();
    a(this.e, 0);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.NativeDialogManager
 * JD-Core Version:    0.7.0.1
 */