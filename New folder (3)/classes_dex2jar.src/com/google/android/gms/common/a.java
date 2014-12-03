package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cq;

public final class a
{
  public static final a a = new a(0, null);
  private final PendingIntent b;
  private final int c;
  
  public a(int paramInt, PendingIntent paramPendingIntent)
  {
    this.c = paramInt;
    this.b = paramPendingIntent;
  }
  
  public final void a(Activity paramActivity, int paramInt)
  {
    if (!a()) {
      return;
    }
    paramActivity.startIntentSenderForResult(this.b.getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  public final boolean a()
  {
    return (this.c != 0) && (this.b != null);
  }
  
  public final int b()
  {
    return this.c;
  }
  
  public final String toString()
  {
    cq localcq = cp.a(this);
    String str;
    switch (this.c)
    {
    default: 
      str = "unknown status code " + this.c;
    }
    for (;;)
    {
      return localcq.a("statusCode", str).a("resolution", this.b).toString();
      str = "SUCCESS";
      continue;
      str = "SERVICE_MISSING";
      continue;
      str = "SERVICE_VERSION_UPDATE_REQUIRED";
      continue;
      str = "SERVICE_DISABLED";
      continue;
      str = "SIGN_IN_REQUIRED";
      continue;
      str = "INVALID_ACCOUNT";
      continue;
      str = "RESOLUTION_REQUIRED";
      continue;
      str = "NETWORK_ERROR";
      continue;
      str = "INTERNAL_ERROR";
      continue;
      str = "SERVICE_INVALID";
      continue;
      str = "DEVELOPER_ERROR";
      continue;
      str = "LICENSE_CHECK_FAILED";
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.a
 * JD-Core Version:    0.7.0.1
 */