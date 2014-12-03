package com.facebook.widget;

import android.support.v4.app.p;
import com.facebook.Request;

abstract class PickerFragment$LoadingStrategy
{
  protected static final int CACHED_RESULT_REFRESH_DELAY = 2000;
  protected GraphObjectAdapter<T> adapter;
  protected GraphObjectPagingLoader<T> loader;
  
  PickerFragment$LoadingStrategy(PickerFragment paramPickerFragment) {}
  
  public void attach(GraphObjectAdapter<T> paramGraphObjectAdapter)
  {
    this.loader = ((GraphObjectPagingLoader)this.this$0.getLoaderManager().a(new PickerFragment.LoadingStrategy.1(this)));
    this.loader.setOnErrorListener(new PickerFragment.LoadingStrategy.2(this));
    this.adapter = paramGraphObjectAdapter;
    this.adapter.changeCursor(this.loader.getCursor());
    this.adapter.setOnErrorListener(new PickerFragment.LoadingStrategy.3(this));
  }
  
  public void clearResults()
  {
    if (this.loader != null) {
      this.loader.clearResults();
    }
  }
  
  public void detach()
  {
    this.adapter.setDataNeededListener(null);
    this.adapter.setOnErrorListener(null);
    this.loader.setOnErrorListener(null);
    this.loader = null;
    this.adapter = null;
  }
  
  public boolean isDataPresentOrLoading()
  {
    return (!this.adapter.isEmpty()) || (this.loader.isLoading());
  }
  
  protected GraphObjectPagingLoader<T> onCreateLoader()
  {
    return new GraphObjectPagingLoader(this.this$0.getActivity(), PickerFragment.access$600(this.this$0));
  }
  
  protected void onLoadFinished(GraphObjectPagingLoader<T> paramGraphObjectPagingLoader, SimpleGraphObjectCursor<T> paramSimpleGraphObjectCursor)
  {
    this.this$0.updateAdapter(paramSimpleGraphObjectCursor);
  }
  
  protected void onLoadReset(GraphObjectPagingLoader<T> paramGraphObjectPagingLoader)
  {
    this.adapter.changeCursor(null);
  }
  
  protected void onStartLoading(GraphObjectPagingLoader<T> paramGraphObjectPagingLoader, Request paramRequest)
  {
    this.this$0.displayActivityCircle();
  }
  
  public void startLoading(Request paramRequest)
  {
    if (this.loader != null)
    {
      this.loader.startLoading(paramRequest, true);
      onStartLoading(this.loader, paramRequest);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.PickerFragment.LoadingStrategy
 * JD-Core Version:    0.7.0.1
 */