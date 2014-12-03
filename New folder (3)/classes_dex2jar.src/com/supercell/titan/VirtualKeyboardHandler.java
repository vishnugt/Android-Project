package com.supercell.titan;

import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import java.io.UnsupportedEncodingException;

public class VirtualKeyboardHandler
{
  public static boolean a;
  private static int b = -1;
  private static int c = 1;
  private static final InputFilter d = new da();
  
  private static void a(boolean paramBoolean)
  {
    GameApp localGameApp = GameApp.getInstance();
    localGameApp.runOnUiThread(new cy(localGameApp, paramBoolean));
    a = false;
  }
  
  public static void dismissKeyboard()
  {
    a(true);
  }
  
  public static void hideKeyboard()
  {
    a(false);
  }
  
  public static void setMaxTextLength(int paramInt1, int paramInt2)
  {
    int i = 1;
    if ((paramInt1 == b) && (paramInt2 == c)) {
      return;
    }
    if (paramInt2 == 0) {}
    for (int j = i;; j = 0)
    {
      if (paramInt1 >= 0) {
        j++;
      }
      b = paramInt1;
      c = paramInt2;
      cs localcs = GameApp.getInstance().a();
      InputFilter[] arrayOfInputFilter = new InputFilter[j];
      if (paramInt1 >= 0) {
        arrayOfInputFilter[0] = new InputFilter.LengthFilter(paramInt1);
      }
      for (;;)
      {
        int k = 301989894;
        if (paramInt2 == 0)
        {
          arrayOfInputFilter[i] = d;
          k = -1845493754;
        }
        localcs.setFilters(arrayOfInputFilter);
        localcs.setImeOptions(k);
        return;
        i = 0;
      }
    }
  }
  
  public static void setText(byte[] paramArrayOfByte)
  {
    try
    {
      String str = new String(paramArrayOfByte, "UTF-8");
      GameApp localGameApp = GameApp.getInstance();
      localGameApp.runOnUiThread(new cz(localGameApp, str));
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      GameApp.debuggerException(localUnsupportedEncodingException);
    }
  }
  
  public static void showKeyboard()
  {
    GameApp localGameApp = GameApp.getInstance();
    localGameApp.runOnUiThread(new cx(localGameApp.a(), localGameApp));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.VirtualKeyboardHandler
 * JD-Core Version:    0.7.0.1
 */