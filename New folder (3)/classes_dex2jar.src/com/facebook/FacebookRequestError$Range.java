package com.facebook;

class FacebookRequestError$Range
{
  private final int end;
  private final int start;
  
  private FacebookRequestError$Range(int paramInt1, int paramInt2)
  {
    this.start = paramInt1;
    this.end = paramInt2;
  }
  
  boolean contains(int paramInt)
  {
    return (this.start <= paramInt) && (paramInt <= this.end);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.FacebookRequestError.Range
 * JD-Core Version:    0.7.0.1
 */