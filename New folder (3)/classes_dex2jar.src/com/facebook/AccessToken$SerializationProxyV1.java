package com.facebook;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

class AccessToken$SerializationProxyV1
  implements Serializable
{
  private static final long serialVersionUID = -2488473066578201069L;
  private final Date expires;
  private final Date lastRefresh;
  private final List<String> permissions;
  private final AccessTokenSource source;
  private final String token;
  
  private AccessToken$SerializationProxyV1(String paramString, Date paramDate1, List<String> paramList, AccessTokenSource paramAccessTokenSource, Date paramDate2)
  {
    this.expires = paramDate1;
    this.permissions = paramList;
    this.token = paramString;
    this.source = paramAccessTokenSource;
    this.lastRefresh = paramDate2;
  }
  
  private Object readResolve()
  {
    return new AccessToken(this.token, this.expires, this.permissions, this.source, this.lastRefresh);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AccessToken.SerializationProxyV1
 * JD-Core Version:    0.7.0.1
 */