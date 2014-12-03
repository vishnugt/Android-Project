package com.supercell.titan;

import android.os.Bundle;
import com.android.vending.billing.IInAppBillingService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ci
  extends Thread
{
  ci(cf paramcf, Bundle paramBundle, JSONArray paramJSONArray) {}
  
  public final void run()
  {
    for (;;)
    {
      try
      {
        Bundle localBundle = cf.a(this.c).a(3, this.c.i.getPackageName(), "inapp", this.a);
        i = cf.a(localBundle, "RESPONSE_CODE");
        if (i != 0) {
          continue;
        }
        cf.c(this.c, true);
        ArrayList localArrayList = localBundle.getStringArrayList("DETAILS_LIST");
        if (localArrayList == null) {
          continue;
        }
        try
        {
          Iterator localIterator = localArrayList.iterator();
          if (localIterator.hasNext())
          {
            JSONObject localJSONObject = new JSONObject((String)localIterator.next());
            this.b.put(localJSONObject);
            continue;
          }
          cf.c(this.c);
        }
        catch (JSONException localJSONException)
        {
          cf.a(this.c, localJSONException.getMessage());
          cf.a(this.c, -2);
          GameApp.debuggerException(localJSONException);
        }
      }
      catch (Exception localException)
      {
        int i;
        cf.a(this.c, localException.getMessage());
        cf.a(this.c, -5);
        GameApp.debuggerException(localException);
        continue;
        if (i != -1) {
          continue;
        }
        cf.a(this.c, "UNABLE TO GET PRODUCTS");
        cf.a(this.c, -4);
        continue;
        if (i != 3) {
          continue;
        }
        cf.c(this.c, false);
        cf.a(this.c, cf.b(i));
        cf.a(this.c, i);
        continue;
        synchronized (this.b)
        {
          synchronized (this.c.e)
          {
            this.c.e = this.b.toString();
            this.c.f = cf.c(this.c);
            this.c.g = cf.e(this.c);
            cf.a(this.c, "");
            cf.a(this.c, 0);
            return;
          }
        }
      }
      if ((cf.d(this.c).isEmpty()) || (cf.e(this.c) != 0)) {
        continue;
      }
      cf.a(this.c, this.b);
      return;
      cf.a(this.c, "<>");
      cf.a(this.c, -3);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.ci
 * JD-Core Version:    0.7.0.1
 */