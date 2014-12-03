package com.chartboost.sdk.Libraries;

class d$k
  extends d.a
{
  protected String a = null;
  private d.a[] b;
  
  public d$k(d.a[] paramArrayOfa)
  {
    this.b = paramArrayOfa;
  }
  
  public String a()
  {
    if (this.a != null) {
      return this.a;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("object must match ALL of the following: ");
    for (int i = 0;; i++)
    {
      if (i >= this.b.length) {
        return localStringBuilder.toString();
      }
      localStringBuilder.append("<");
      localStringBuilder.append(this.b[i].a());
      localStringBuilder.append(">");
      if (i < -1 + this.b.length) {
        localStringBuilder.append(", ");
      }
    }
  }
  
  public boolean a(Object paramObject)
  {
    for (int i = 0;; i++)
    {
      if (i >= this.b.length) {
        return true;
      }
      if (!this.b[i].a(paramObject))
      {
        this.a = ("object failed to match: <" + this.b[i].a() + ">");
        return false;
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.d.k
 * JD-Core Version:    0.7.0.1
 */