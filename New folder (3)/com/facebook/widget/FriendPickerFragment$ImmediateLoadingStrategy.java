package com.facebook.widget;

import com.facebook.model.GraphUser;

class FriendPickerFragment$ImmediateLoadingStrategy
  extends PickerFragment.LoadingStrategy
{
  private FriendPickerFragment$ImmediateLoadingStrategy(FriendPickerFragment paramFriendPickerFragment)
  {
    super(paramFriendPickerFragment);
  }
  
  private void followNextLink()
  {
    this.this$0.displayActivityCircle();
    this.loader.followNextLink();
  }
  
  protected void onLoadFinished(GraphObjectPagingLoader<GraphUser> paramGraphObjectPagingLoader, SimpleGraphObjectCursor<GraphUser> paramSimpleGraphObjectCursor)
  {
    super.onLoadFinished(paramGraphObjectPagingLoader, paramSimpleGraphObjectCursor);
    if ((paramSimpleGraphObjectCursor == null) || (paramGraphObjectPagingLoader.isLoading())) {}
    do
    {
      return;
      if (paramSimpleGraphObjectCursor.areMoreObjectsAvailable())
      {
        followNextLink();
        return;
      }
      this.this$0.hideActivityCircle();
    } while (!paramSimpleGraphObjectCursor.isFromCache());
    if (paramSimpleGraphObjectCursor.getCount() == 0) {}
    for (long l = 2000L;; l = 0L)
    {
      paramGraphObjectPagingLoader.refreshOriginalRequest(l);
      return;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.FriendPickerFragment.ImmediateLoadingStrategy
 * JD-Core Version:    0.7.0.1
 */