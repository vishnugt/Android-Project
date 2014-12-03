package com.chartboost.sdk.impl;

class as$a
{
  int a;
  int b;
  
  as$a()
  {
    a();
  }
  
  void a()
  {
    this.a = -1;
    this.b = 0;
  }
  
  void a(int paramInt)
  {
    this.a = (-1 + paramInt / 16384);
    this.b = (paramInt % 16384);
  }
  
  void a(a parama)
  {
    this.a = parama.a;
    this.b = parama.b;
  }
  
  int b()
  {
    return 16384 * (1 + this.a) + this.b;
  }
  
  void b(int paramInt)
  {
    this.b = (paramInt + this.b);
    if (this.b > 16384) {
      throw new IllegalArgumentException("something is wrong");
    }
  }
  
  int c()
  {
    int i = this.b;
    this.b = (i + 1);
    return i;
  }
  
  int c(int paramInt)
  {
    if (paramInt < this.a) {
      return 16384;
    }
    return this.b;
  }
  
  void d()
  {
    if (this.b != 16384) {
      throw new IllegalArgumentException("broken");
    }
    this.a = (1 + this.a);
    this.b = 0;
  }
  
  public String toString()
  {
    return this.a + "," + this.b;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.as.a
 * JD-Core Version:    0.7.0.1
 */