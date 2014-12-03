package com.chartboost.sdk.Libraries;

class d$e
  extends d.a
{
  private Class<?> a;
  
  public d$e(Class<?> paramClass)
  {
    this.a = paramClass;
  }
  
  public String a()
  {
    return "object must be an instance of " + this.a.getName() + ".";
  }
  
  public boolean a(Object paramObject)
  {
    return this.a.isInstance(paramObject);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.d.e
 * JD-Core Version:    0.7.0.1
 */