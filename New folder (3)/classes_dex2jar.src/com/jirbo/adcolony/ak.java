package com.jirbo.adcolony;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

final class ak
  implements HostnameVerifier
{
  ak(aj paramaj) {}
  
  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    aq.a.b("ADCDownload - verify called");
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ak
 * JD-Core Version:    0.7.0.1
 */