package com.mobileapptracker;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class d
  implements Runnable
{
  private String b = null;
  private String c = null;
  private String d = null;
  private double e = 0.0D;
  private String f = null;
  private String g = null;
  private String h = null;
  private String i = null;
  private boolean j = false;
  
  public d(MobileAppTracker paramMobileAppTracker, String paramString1, String paramString2, String paramString3, double paramDouble, String paramString4, String paramString5, String paramString6, String paramString7, boolean paramBoolean)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramDouble;
    this.f = paramString4;
    this.g = paramString5;
    this.h = paramString6;
    this.i = paramString7;
    this.j = paramBoolean;
  }
  
  public final void run()
  {
    if (this.j) {
      this.b = MobileAppTracker.a(this.a, this.b, this.d, this.e, this.f, this.g);
    }
    if ((this.d.equals("open")) && (!MobileAppTracker.a(this.a, "mat_last_open", "lastOpenDate"))) {
      MobileAppTracker.c(this.a);
    }
    label541:
    JSONObject localJSONObject3;
    do
    {
      JSONObject localJSONObject2;
      do
      {
        for (;;)
        {
          return;
          if (MobileAppTracker.c(this.a)) {
            new StringBuilder("Sending ").append(this.d).append(" event to server...").toString();
          }
          JSONObject localJSONObject1 = new JSONObject();
          try
          {
            if (this.c != null) {
              localJSONObject1.put("data", new JSONArray(this.c));
            }
            if (this.h != null) {
              localJSONObject1.put("store_iap_data", this.h);
            }
            if (this.i != null) {
              localJSONObject1.put("store_iap_signature", this.i);
            }
            localJSONObject2 = MobileAppTracker.d(this.a).a(this.b, localJSONObject1);
            if (localJSONObject2 != null) {}
          }
          catch (JSONException localJSONException1)
          {
            try
            {
              MobileAppTracker.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
              MobileAppTracker.c(this.a);
              return;
              localJSONException1 = localJSONException1;
              MobileAppTracker.c(this.a);
              localJSONException1.printStackTrace();
            }
            catch (InterruptedException localInterruptedException)
            {
              for (;;)
              {
                localInterruptedException.printStackTrace();
                Thread.currentThread().interrupt();
              }
            }
            if (MobileAppTracker.e(this.a) != null) {
              MobileAppTracker.e(this.a).didSucceedWithData(localJSONObject2);
            }
            if (this.d.equals("install")) {}
            for (;;)
            {
              try
              {
                for (;;)
                {
                  MobileAppTracker.b(this.a, localJSONObject2.getString("log_id"));
                  if (!MobileAppTracker.c(this.a)) {
                    break;
                  }
                  new StringBuilder("Server response: ").append(localJSONObject2.toString()).toString();
                  if (localJSONObject2.length() <= 0) {
                    break;
                  }
                  try
                  {
                    if (localJSONObject2.getString("log_action").equals("null")) {
                      break label541;
                    }
                    JSONObject localJSONObject4 = localJSONObject2.getJSONObject("log_action");
                    if (!localJSONObject4.has("conversion")) {
                      break;
                    }
                    JSONObject localJSONObject5 = localJSONObject4.getJSONObject("conversion");
                    if ((!localJSONObject5.has("status")) || (!localJSONObject5.getString("status").equals("rejected"))) {
                      break;
                    }
                    String str2 = localJSONObject5.getString("status_code");
                    new StringBuilder("Event was rejected by server: status code ").append(str2).toString();
                    return;
                  }
                  catch (JSONException localJSONException3)
                  {
                    localJSONException3.printStackTrace();
                    return;
                  }
                }
              }
              catch (JSONException localJSONException4)
              {
                if (!MobileAppTracker.c(this.a)) {
                  continue;
                }
                localJSONException4.printStackTrace();
                continue;
              }
              if (this.d.equals("update"))
              {
                try
                {
                  MobileAppTracker.c(this.a, localJSONObject2.getString("log_id"));
                }
                catch (JSONException localJSONException2) {}
                if (MobileAppTracker.c(this.a)) {
                  localJSONException2.printStackTrace();
                }
              }
            }
          }
        }
      } while (!localJSONObject2.has("options"));
      localJSONObject3 = localJSONObject2.getJSONObject("options");
    } while (!localJSONObject3.has("conversion_status"));
    String str1 = localJSONObject3.getString("conversion_status");
    new StringBuilder("Event was ").append(str1).append(" by server").toString();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.mobileapptracker.d
 * JD-Core Version:    0.7.0.1
 */