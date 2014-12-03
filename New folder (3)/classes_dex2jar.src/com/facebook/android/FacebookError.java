package com.facebook.android;

public class FacebookError
  extends RuntimeException
{
  private static final long serialVersionUID = 1L;
  private int mErrorCode = 0;
  private String mErrorType;
  
  @Deprecated
  public FacebookError(String paramString)
  {
    super(paramString);
  }
  
  @Deprecated
  public FacebookError(String paramString1, String paramString2, int paramInt)
  {
    super(paramString1);
    this.mErrorType = paramString2;
    this.mErrorCode = paramInt;
  }
  
  @Deprecated
  public int getErrorCode()
  {
    return this.mErrorCode;
  }
  
  @Deprecated
  public String getErrorType()
  {
    return this.mErrorType;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.FacebookError
 * JD-Core Version:    0.7.0.1
 */