package com.facebook;

import com.facebook.model.GraphObject;

abstract interface TestSession$UserAccount
  extends GraphObject
{
  public abstract String getName();
  
  public abstract String getUid();
  
  public abstract void setName(String paramString);
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.TestSession.UserAccount
 * JD-Core Version:    0.7.0.1
 */