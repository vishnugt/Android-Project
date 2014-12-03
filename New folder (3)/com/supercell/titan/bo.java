package com.supercell.titan;

final class bo
  implements Runnable
{
  bo(String paramString) {}
  
  public final void run()
  {
    if (NativeFacebookManager.g() != null)
    {
      NativeFacebookManager.a(NativeFacebookManager.g(), this.a);
      NativeFacebookManager.a(NativeFacebookManager.g(), NativeFacebookManager.j());
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bo
 * JD-Core Version:    0.7.0.1
 */