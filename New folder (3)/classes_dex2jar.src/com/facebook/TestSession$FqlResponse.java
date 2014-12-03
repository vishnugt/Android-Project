package com.facebook;

import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;

abstract interface TestSession$FqlResponse
  extends GraphObject
{
  public abstract GraphObjectList<TestSession.FqlResult> getData();
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.TestSession.FqlResponse
 * JD-Core Version:    0.7.0.1
 */