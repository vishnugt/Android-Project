package com.supercell.titan;

final class bf
  implements Runnable
{
  bf(String paramString) {}
  
  public final void run()
  {
    if (NativeFacebookManager.g() != null) {
      NativeFacebookManager.b(NativeFacebookManager.g(), this.a);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bf
 * JD-Core Version:    0.7.0.1
 */