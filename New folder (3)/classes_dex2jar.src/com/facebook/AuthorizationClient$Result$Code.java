package com.facebook;

 enum AuthorizationClient$Result$Code
{
  private final String loggingValue;
  
  static
  {
    CANCEL = new Code("CANCEL", 1, "cancel");
    ERROR = new Code("ERROR", 2, "error");
    Code[] arrayOfCode = new Code[3];
    arrayOfCode[0] = SUCCESS;
    arrayOfCode[1] = CANCEL;
    arrayOfCode[2] = ERROR;
    $VALUES = arrayOfCode;
  }
  
  private AuthorizationClient$Result$Code(String paramString)
  {
    this.loggingValue = paramString;
  }
  
  final String getLoggingValue()
  {
    return this.loggingValue;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.Result.Code
 * JD-Core Version:    0.7.0.1
 */