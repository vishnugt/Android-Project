package com.supercell.titan;

final class bg
  implements Runnable
{
  bg(String paramString) {}
  
  public final void run()
  {
    if (NativeFacebookManager.g() != null) {
      NativeFacebookManager.c(NativeFacebookManager.g(), this.a);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bg
 * JD-Core Version:    0.7.0.1
 */