package com.facebook;

import com.facebook.model.GraphObject;

abstract interface Response$PagingInfo
  extends GraphObject
{
  public abstract String getNext();
  
  public abstract String getPrevious();
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.Response.PagingInfo
 * JD-Core Version:    0.7.0.1
 */