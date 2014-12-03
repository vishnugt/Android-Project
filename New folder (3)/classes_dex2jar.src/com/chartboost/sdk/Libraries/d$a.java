package com.chartboost.sdk.Libraries;

public abstract class d$a
{
  private String a = null;
  
  public abstract String a();
  
  public abstract boolean a(Object paramObject);
  
  public boolean a(Object paramObject, StringBuilder paramStringBuilder)
  {
    boolean bool = a(paramObject);
    if (!bool) {
      if (this.a == null) {
        break label32;
      }
    }
    label32:
    for (String str = this.a;; str = a())
    {
      paramStringBuilder.append(str);
      return bool;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.d.a
 * JD-Core Version:    0.7.0.1
 */