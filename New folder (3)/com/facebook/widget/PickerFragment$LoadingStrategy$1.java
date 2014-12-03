package com.facebook.widget;

import android.os.Bundle;
import android.support.v4.a.a;
import android.support.v4.app.q;
import com.facebook.FacebookException;

class PickerFragment$LoadingStrategy$1
  implements q<SimpleGraphObjectCursor<T>>
{
  PickerFragment$LoadingStrategy$1(PickerFragment.LoadingStrategy paramLoadingStrategy) {}
  
  public a<SimpleGraphObjectCursor<T>> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return this.this$1.onCreateLoader();
  }
  
  public void onLoadFinished(a<SimpleGraphObjectCursor<T>> parama, SimpleGraphObjectCursor<T> paramSimpleGraphObjectCursor)
  {
    if (parama != this.this$1.loader) {
      throw new FacebookException("Received callback for unknown loader.");
    }
    this.this$1.onLoadFinished((GraphObjectPagingLoader)parama, paramSimpleGraphObjectCursor);
  }
  
  public void onLoaderReset(a<SimpleGraphObjectCursor<T>> parama)
  {
    if (parama != this.this$1.loader) {
      throw new FacebookException("Received callback for unknown loader.");
    }
    this.this$1.onLoadReset((GraphObjectPagingLoader)parama);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.PickerFragment.LoadingStrategy.1
 * JD-Core Version:    0.7.0.1
 */