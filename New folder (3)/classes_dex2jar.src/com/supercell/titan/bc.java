package com.supercell.titan;

final class bc
  implements Runnable
{
  bc(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {}
  
  public final void run()
  {
    if (NativeFacebookManager.g() != null) {
      NativeFacebookManager.a(NativeFacebookManager.g(), this.a, this.b, this.c, this.d, this.e);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.bc
 * JD-Core Version:    0.7.0.1
 */