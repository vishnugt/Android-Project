package com.supercell.titan;

import android.text.InputFilter;
import android.text.Spanned;

final class da
  implements InputFilter
{
  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    while (paramInt1 < paramInt2)
    {
      if (paramCharSequence.charAt(paramInt1) >= '') {
        return "";
      }
      paramInt1++;
    }
    return null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.da
 * JD-Core Version:    0.7.0.1
 */