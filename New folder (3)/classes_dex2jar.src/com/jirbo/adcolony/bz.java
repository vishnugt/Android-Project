package com.jirbo.adcolony;

import java.io.InputStream;

final class bz
{
  char[] a;
  int b;
  int c;
  
  bz(InputStream paramInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramInputStream.available());
    int i = paramInputStream.read();
    if (i != -1)
    {
      if (((i >= 32) && (i <= 126)) || (i == 10) || (i >= 128)) {
        localStringBuilder.append((char)i);
      }
      for (;;)
      {
        i = paramInputStream.read();
        break;
        localStringBuilder.append(' ');
      }
    }
    this.c = localStringBuilder.length();
    this.a = new char[this.c];
    localStringBuilder.getChars(0, this.c, this.a, 0);
  }
  
  bz(String paramString)
  {
    this.c = paramString.length();
    this.a = new char[this.c];
    int i = 0;
    if (i < this.c)
    {
      int j = paramString.charAt(i);
      if (((j >= 32) && (j <= 126)) || (j == 10) || (j >= 128)) {
        this.a[i] = j;
      }
      for (;;)
      {
        i++;
        break;
        this.a[i] = ' ';
      }
    }
  }
  
  final boolean a()
  {
    return this.b < this.c;
  }
  
  final boolean a(char paramChar)
  {
    if ((this.b == this.c) || (this.a[this.b] != paramChar)) {
      return false;
    }
    this.b = (1 + this.b);
    return true;
  }
  
  final char b()
  {
    if (this.b == this.c) {
      return '\000';
    }
    return this.a[this.b];
  }
  
  final char c()
  {
    char[] arrayOfChar = this.a;
    int i = this.b;
    this.b = (i + 1);
    return arrayOfChar[i];
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.bz
 * JD-Core Version:    0.7.0.1
 */