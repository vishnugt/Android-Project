package com.jirbo.adcolony;

public final class dy
{
  boolean a;
  String b;
  int c;
  
  dy(boolean paramBoolean, String paramString, int paramInt)
  {
    this.a = paramBoolean;
    this.b = paramString;
    this.c = paramInt;
  }
  
  public final String toString()
  {
    if (this.a) {
      return this.b + ":" + this.c;
    }
    return "no reward";
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.dy
 * JD-Core Version:    0.7.0.1
 */