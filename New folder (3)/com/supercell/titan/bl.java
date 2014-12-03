package com.supercell.titan;

final class bl
  implements Runnable
{
  public final void run()
  {
    if (NativeFacebookManager.g() != null) {
      NativeFacebookManager.c(NativeFacebookManager.g());
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bl
 * JD-Core Version:    0.7.0.1
 */