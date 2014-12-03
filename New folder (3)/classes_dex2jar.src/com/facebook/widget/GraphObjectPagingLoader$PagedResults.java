package com.facebook.widget;

import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;

abstract interface GraphObjectPagingLoader$PagedResults
  extends GraphObject
{
  public abstract GraphObjectList<GraphObject> getData();
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.GraphObjectPagingLoader.PagedResults
 * JD-Core Version:    0.7.0.1
 */