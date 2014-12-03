package com.supercell.titan;

import android.app.FragmentManager;
import android.os.Bundle;

final class ar
  implements Runnable
{
  ar(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, GameApp paramGameApp) {}
  
  public final void run()
  {
    NativeDialogManager localNativeDialogManager = new NativeDialogManager();
    localNativeDialogManager.setStyle(0, 16974126);
    Bundle localBundle = new Bundle();
    localBundle.putString("title", this.a);
    localBundle.putString("message", this.b);
    localBundle.putString("button", this.c);
    localBundle.putString("button2", this.d);
    localBundle.putString("button3", this.e);
    localBundle.putInt("id", this.f);
    localNativeDialogManager.setArguments(localBundle);
    FragmentManager localFragmentManager = this.g.getFragmentManager();
    try
    {
      localNativeDialogManager.show(localFragmentManager, "NativeDialog");
      NativeDialogManager.a(localNativeDialogManager);
      this.g.e().setRenderMode(0);
      return;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.ar
 * JD-Core Version:    0.7.0.1
 */