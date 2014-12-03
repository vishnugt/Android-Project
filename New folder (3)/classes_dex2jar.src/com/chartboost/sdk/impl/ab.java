package com.chartboost.sdk.impl;

public class ab
{
  final Object a;
  final String b;
  
  public Object a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ab localab;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localab = (ab)paramObject;
      if (this.a != null)
      {
        if (this.a.equals(localab.a)) {}
      }
      else {
        while (localab.a != null) {
          return false;
        }
      }
      if (this.b == null) {
        break;
      }
    } while (this.b.equals(localab.b));
    for (;;)
    {
      return false;
      if (localab.b == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    if (this.a != null) {}
    for (int i = this.a.hashCode();; i = 0)
    {
      int j = i * 31;
      String str = this.b;
      int k = 0;
      if (str != null) {
        k = this.b.hashCode();
      }
      return j + k;
    }
  }
  
  public String toString()
  {
    return "{ \"$ref\" : \"" + this.b + "\", \"$id\" : \"" + this.a + "\" }";
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.ab
 * JD-Core Version:    0.7.0.1
 */