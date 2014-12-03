package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.chartboost.sdk.Chartboost;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutorService;

public class n
{
  public n.a a;
  
  public n(n.a parama)
  {
    this.a = parama;
  }
  
  private void a(String paramString, Context paramContext)
  {
    if (paramContext == null) {
      paramContext = Chartboost.sharedChartboost().getContext();
    }
    if (paramContext == null) {
      if (this.a != null) {
        this.a.a(false, paramString);
      }
    }
    for (;;)
    {
      return;
      try
      {
        Intent localIntent1 = new Intent("android.intent.action.VIEW");
        if (!(paramContext instanceof Activity)) {
          localIntent1.addFlags(268435456);
        }
        localIntent1.setData(Uri.parse(paramString));
        paramContext.startActivity(localIntent1);
        if (this.a == null) {
          continue;
        }
        this.a.a(true, paramString);
        return;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          if (paramString.startsWith("market://"))
          {
            try
            {
              paramString = "http://market.android.com/" + paramString.substring(9);
              Intent localIntent2 = new Intent("android.intent.action.VIEW");
              if (!(paramContext instanceof Activity)) {
                localIntent2.addFlags(268435456);
              }
              localIntent2.setData(Uri.parse(paramString));
              paramContext.startActivity(localIntent2);
            }
            catch (Exception localException2) {}
            if (this.a == null) {
              break;
            }
            this.a.a(false, paramString);
            return;
          }
          if (this.a != null) {
            this.a.a(false, paramString);
          }
        }
      }
    }
  }
  
  public void a(String paramString, Activity paramActivity)
  {
    String str;
    try
    {
      URI localURI = new URI(paramString);
      str = localURI.getScheme();
      if (str == null)
      {
        if (this.a != null) {
          this.a.a(false, paramString);
        }
        return;
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      while (this.a == null) {}
      this.a.a(false, paramString);
      return;
    }
    if ((!str.equals("http")) && (!str.equals("https")))
    {
      a(paramString, paramActivity);
      return;
    }
    n.1 local1 = new n.1(this, paramString, paramActivity);
    l.a().execute(local1);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.n
 * JD-Core Version:    0.7.0.1
 */