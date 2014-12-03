package android.support.v4.view;

import android.view.KeyEvent;

final class c
  implements d
{
  public final boolean a(int paramInt)
  {
    return KeyEvent.metaStateHasModifiers(paramInt, 1);
  }
  
  public final boolean b(int paramInt)
  {
    return KeyEvent.metaStateHasNoModifiers(paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.c
 * JD-Core Version:    0.7.0.1
 */