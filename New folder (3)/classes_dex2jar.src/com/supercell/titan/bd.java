package com.supercell.titan;

final class bd
  implements Runnable
{
  bd(String paramString1, String paramString2, String paramString3, String paramString4) {}
  
  public final void run()
  {
    if (NativeFacebookManager.g() != null) {
      NativeFacebookManager.a(NativeFacebookManager.g(), this.a, this.b, this.c, this.d);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bd
 * JD-Core Version:    0.7.0.1
 */