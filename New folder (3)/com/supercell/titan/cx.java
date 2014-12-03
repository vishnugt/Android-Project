package com.supercell.titan;

import android.view.inputmethod.InputMethodManager;

final class cx
  implements Runnable
{
  cx(cs paramcs, GameApp paramGameApp) {}
  
  public final void run()
  {
    this.a.requestFocus();
    InputMethodManager localInputMethodManager = (InputMethodManager)this.b.getSystemService("input_method");
    boolean bool = localInputMethodManager.showSoftInput(this.a, 0);
    VirtualKeyboardHandler.a = bool;
    if (!bool) {
      VirtualKeyboardHandler.a = localInputMethodManager.showSoftInput(this.a, 2);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.cx
 * JD-Core Version:    0.7.0.1
 */