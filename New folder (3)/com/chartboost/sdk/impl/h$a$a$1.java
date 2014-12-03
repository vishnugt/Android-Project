package com.chartboost.sdk.impl;

import android.view.View;
import android.view.View.OnClickListener;
import com.chartboost.sdk.c.c;
import org.json.JSONObject;

class h$a$a$1
  implements View.OnClickListener
{
  h$a$a$1(h.a.a parama, JSONObject paramJSONObject) {}
  
  public void onClick(View paramView)
  {
    String str = this.b.optString("deep-link");
    if ((str == null) || (str.equals(""))) {
      str = this.b.optString("link");
    }
    if (h.a.b(h.a.a.a(this.a)).b != null) {
      h.a.b(h.a.a.a(this.a)).b.a(str, this.b);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.h.a.a.1
 * JD-Core Version:    0.7.0.1
 */