package com.supercell.titan;

import android.text.Editable;
import android.text.TextWatcher;

final class cv
  implements TextWatcher
{
  cv(cs paramcs) {}
  
  public final void afterTextChanged(Editable paramEditable)
  {
    if (!cs.a(this.a)) {
      GameApp.getInstance().a(new cw(this, paramEditable.toString()));
    }
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.cv
 * JD-Core Version:    0.7.0.1
 */