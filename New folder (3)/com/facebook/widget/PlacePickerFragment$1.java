package com.facebook.widget;

import android.content.Context;
import com.facebook.android.R.drawable;
import com.facebook.android.R.layout;
import com.facebook.android.R.string;
import com.facebook.model.GraphPlace;

class PlacePickerFragment$1
  extends PickerFragment<GraphPlace>.PickerFragmentAdapter<GraphPlace>
{
  PlacePickerFragment$1(PlacePickerFragment paramPlacePickerFragment, Context paramContext)
  {
    super(paramPlacePickerFragment, paramContext);
  }
  
  protected int getDefaultPicture()
  {
    return R.drawable.com_facebook_place_default_icon;
  }
  
  protected int getGraphObjectRowLayoutId(GraphPlace paramGraphPlace)
  {
    return R.layout.com_facebook_placepickerfragment_list_row;
  }
  
  protected CharSequence getSubTitleOfGraphObject(GraphPlace paramGraphPlace)
  {
    String str = paramGraphPlace.getCategory();
    Integer localInteger = (Integer)paramGraphPlace.getProperty("were_here_count");
    if ((str != null) && (localInteger != null)) {
      return this.this$0.getString(R.string.com_facebook_placepicker_subtitle_format, new Object[] { str, localInteger });
    }
    if ((str == null) && (localInteger != null)) {
      return this.this$0.getString(R.string.com_facebook_placepicker_subtitle_were_here_only_format, new Object[] { localInteger });
    }
    if ((str != null) && (localInteger == null)) {
      return this.this$0.getString(R.string.com_facebook_placepicker_subtitle_catetory_only_format, new Object[] { str });
    }
    return null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.PlacePickerFragment.1
 * JD-Core Version:    0.7.0.1
 */