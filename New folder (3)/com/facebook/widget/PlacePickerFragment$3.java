package com.facebook.widget;

import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;

class PlacePickerFragment$3
  implements Runnable
{
  PlacePickerFragment$3(PlacePickerFragment paramPlacePickerFragment) {}
  
  public void run()
  {
    try
    {
      this.this$0.loadData(true);
      return;
    }
    catch (FacebookException localFacebookException2)
    {
      localFacebookException2 = localFacebookException2;
      PickerFragment.OnErrorListener localOnErrorListener2 = this.this$0.getOnErrorListener();
      if (localOnErrorListener2 != null)
      {
        localOnErrorListener2.onError(this.this$0, localFacebookException2);
        return;
      }
      Logger.log(LoggingBehavior.REQUESTS, "PlacePickerFragment", "Error loading data : %s", new Object[] { localFacebookException2 });
      return;
    }
    catch (Exception localException)
    {
      localException = localException;
      FacebookException localFacebookException1 = new FacebookException(localException);
      PickerFragment.OnErrorListener localOnErrorListener1 = this.this$0.getOnErrorListener();
      if (localOnErrorListener1 != null)
      {
        localOnErrorListener1.onError(this.this$0, localFacebookException1);
        return;
      }
      Logger.log(LoggingBehavior.REQUESTS, "PlacePickerFragment", "Error loading data : %s", new Object[] { localFacebookException1 });
      return;
    }
    finally {}
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.PlacePickerFragment.3
 * JD-Core Version:    0.7.0.1
 */