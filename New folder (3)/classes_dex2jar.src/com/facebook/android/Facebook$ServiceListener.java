package com.facebook.android;

import android.os.Bundle;

public abstract interface Facebook$ServiceListener
{
  public abstract void onComplete(Bundle paramBundle);
  
  public abstract void onError(Error paramError);
  
  public abstract void onFacebookError(FacebookError paramFacebookError);
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.android.Facebook.ServiceListener
 * JD-Core Version:    0.7.0.1
 */