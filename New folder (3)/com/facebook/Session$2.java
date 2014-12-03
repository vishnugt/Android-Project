package com.facebook;

class Session$2
  implements AuthorizationClient.OnCompletedListener
{
  Session$2(Session paramSession) {}
  
  public void onCompleted(AuthorizationClient.Result paramResult)
  {
    if (paramResult.code == AuthorizationClient.Result.Code.CANCEL) {}
    for (int i = 0;; i = -1)
    {
      Session.access$700(this.this$0, i, paramResult);
      return;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.Session.2
 * JD-Core Version:    0.7.0.1
 */