package com.chartboost.sdk;

import com.chartboost.sdk.impl.n.a;

class a$2
  implements n.a
{
  a$2(a parama) {}
  
  public void a(boolean paramBoolean, String paramString)
  {
    b localb = a.b(this.a).a();
    if ((localb != null) && (localb.a())) {
      localb.a(true);
    }
    if ((!paramBoolean) && (a.b(this.a).getDelegate() != null)) {
      a.b(this.a).getDelegate().didFailToLoadUrl(paramString);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.a.2
 * JD-Core Version:    0.7.0.1
 */