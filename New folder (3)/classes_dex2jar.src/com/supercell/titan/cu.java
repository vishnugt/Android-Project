package com.supercell.titan;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class cu
  implements TextView.OnEditorActionListener
{
  cu(cs paramcs) {}
  
  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 6) {
      GameApp.getInstance().a(cs.a());
    }
    return false;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.cu
 * JD-Core Version:    0.7.0.1
 */