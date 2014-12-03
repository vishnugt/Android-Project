package com.jirbo.adcolony;

abstract class di
{
  boolean g = true;
  int h = 0;
  
  private void b(long paramLong)
  {
    if (paramLong == 0L) {
      return;
    }
    b(paramLong / 10L);
    a((char)(int)(48L + paramLong % 10L));
  }
  
  abstract void a(char paramChar);
  
  final void a(long paramLong)
  {
    for (;;)
    {
      if (this.g) {
        b();
      }
      if (paramLong == 0L)
      {
        a('0');
        return;
      }
      if (paramLong == -paramLong)
      {
        a("-9223372036854775808");
        return;
      }
      if (paramLong >= 0L) {
        break;
      }
      a('-');
      paramLong = -paramLong;
    }
    b(paramLong);
  }
  
  final void a(String paramString)
  {
    int i = paramString.length();
    for (int j = 0; j < i; j++) {
      b(paramString.charAt(j));
    }
  }
  
  final void b()
  {
    if (this.g)
    {
      this.g = false;
      int i = this.h;
      for (;;)
      {
        i--;
        if (i < 0) {
          break;
        }
        a(' ');
      }
    }
  }
  
  final void b(char paramChar)
  {
    if (this.g) {
      b();
    }
    a(paramChar);
    if (paramChar == '\n') {
      this.g = true;
    }
  }
  
  final void b(String paramString)
  {
    a(paramString);
    b('\n');
  }
  
  final void c()
  {
    b(',');
    b('\n');
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.di
 * JD-Core Version:    0.7.0.1
 */