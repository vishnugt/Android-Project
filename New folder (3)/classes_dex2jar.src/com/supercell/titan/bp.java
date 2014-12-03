package com.supercell.titan;

final class bp
  implements Runnable
{
  public final void run()
  {
    if (NativeFacebookManager.g() != null)
    {
      NativeFacebookManager.g();
      NativeFacebookManager.k();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bp
 * JD-Core Version:    0.7.0.1
 */