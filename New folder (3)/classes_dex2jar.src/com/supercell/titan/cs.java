package com.supercell.titan;

import android.content.Context;
import android.text.Editable;
import android.widget.EditText;

final class cs
  extends EditText
{
  private static final Runnable a = new ct();
  private boolean b;
  
  public cs(Context paramContext)
  {
    super(paramContext);
    setOnEditorActionListener(new cu(this));
    addTextChangedListener(new cv(this));
  }
  
  public final void a(String paramString)
  {
    this.b = true;
    getEditableText().clear();
    getEditableText().append(paramString);
    this.b = false;
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if ((paramBoolean) && (hasFocus()) && (VirtualKeyboardHandler.a)) {
      VirtualKeyboardHandler.showKeyboard();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.cs
 * JD-Core Version:    0.7.0.1
 */