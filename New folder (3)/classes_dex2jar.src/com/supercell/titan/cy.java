package com.supercell.titan;

import android.view.inputmethod.InputMethodManager;

final class cy
  implements Runnable
{
  cy(GameApp paramGameApp, boolean paramBoolean) {}
  
  public final void run()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.a.getSystemService("input_method");
    cs localcs = this.a.a();
    localInputMethodManager.hideSoftInputFromWindow(localcs.getWindowToken(), 0);
    localcs.clearFocus();
    if (this.b) {
      GameApp.inputKeyboardDismissed();
    }
    GameApp.getInstance().d();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.cy
 * JD-Core Version:    0.7.0.1
 */