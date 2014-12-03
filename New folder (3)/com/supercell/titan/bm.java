package com.supercell.titan;

final class bm
  implements Runnable
{
  public final void run()
  {
    if (NativeFacebookManager.g() != null)
    {
      NativeFacebookManager.g();
      NativeFacebookManager.h();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bm
 * JD-Core Version:    0.7.0.1
 */