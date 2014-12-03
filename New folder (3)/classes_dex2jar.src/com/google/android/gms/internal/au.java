package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class au
  extends am
{
  private final String c;
  private final Context d;
  private final String e;
  
  public au(Context paramContext, String paramString1, String paramString2)
  {
    this.d = paramContext;
    this.c = paramString1;
    this.e = paramString2;
  }
  
  public final void a()
  {
    try
    {
      new StringBuilder("Pinging URL: ").append(this.e).toString();
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(this.e).openConnection();
      try
      {
        ar.a(this.d, this.c, localHttpURLConnection);
        int i = localHttpURLConnection.getResponseCode();
        if ((i < 200) || (i >= 300)) {
          new StringBuilder("Received non-success response code ").append(i).append(" from pinging URL: ").append(this.e).toString();
        }
        return;
      }
      finally
      {
        localHttpURLConnection.disconnect();
      }
      return;
    }
    catch (IOException localIOException)
    {
      new StringBuilder("Error while pinging URL: ").append(this.e).append(". ").append(localIOException.getMessage()).toString();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.au
 * JD-Core Version:    0.7.0.1
 */