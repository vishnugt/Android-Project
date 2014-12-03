package com.supercell.titan;

final class bn
  implements Runnable
{
  public final void run()
  {
    if (NativeFacebookManager.g() != null) {
      NativeFacebookManager.a(NativeFacebookManager.g(), NativeFacebookManager.i());
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bn
 * JD-Core Version:    0.7.0.1
 */