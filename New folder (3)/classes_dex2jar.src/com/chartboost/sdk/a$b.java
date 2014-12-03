package com.chartboost.sdk;

import java.util.Map;

class a$b
  implements Runnable
{
  private String b;
  
  public a$b(a parama, String paramString)
  {
    this.b = paramString;
  }
  
  public void run()
  {
    if (a.b(this.a).hasCachedInterstitial(this.b))
    {
      a.b(this.a, (com.chartboost.sdk.impl.a)a.a(this.a).get(this.b));
      return;
    }
    a.a(this.a, this.b, false);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.a.b
 * JD-Core Version:    0.7.0.1
 */