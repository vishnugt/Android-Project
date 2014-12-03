package com.chartboost.sdk.impl;

public class ax
  extends aw
{
  final al b;
  
  public al b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ax)) {}
    ax localax;
    do
    {
      return false;
      localax = (ax)paramObject;
    } while ((!this.a.equals(localax.a)) || (!this.b.equals(localax.b)));
    return true;
  }
  
  public int hashCode()
  {
    return this.a.hashCode() ^ this.b.hashCode();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.ax
 * JD-Core Version:    0.7.0.1
 */