package com.facebook.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.List;

public class FacebookDialog$ShareDialogBuilder
  extends FacebookDialog.Builder<ShareDialogBuilder>
{
  private String caption;
  private boolean dataErrorsFatal;
  private String description;
  private ArrayList<String> friends;
  private String link;
  private String name;
  private String picture;
  private String place;
  private String ref;
  
  public FacebookDialog$ShareDialogBuilder(Activity paramActivity)
  {
    super(paramActivity);
  }
  
  Intent handleBuild(Bundle paramBundle)
  {
    putExtra(paramBundle, "com.facebook.platform.extra.APPLICATION_ID", this.applicationId);
    putExtra(paramBundle, "com.facebook.platform.extra.APPLICATION_NAME", this.applicationName);
    putExtra(paramBundle, "com.facebook.platform.extra.TITLE", this.name);
    putExtra(paramBundle, "com.facebook.platform.extra.SUBTITLE", this.caption);
    putExtra(paramBundle, "com.facebook.platform.extra.DESCRIPTION", this.description);
    putExtra(paramBundle, "com.facebook.platform.extra.LINK", this.link);
    putExtra(paramBundle, "com.facebook.platform.extra.IMAGE", this.picture);
    putExtra(paramBundle, "com.facebook.platform.extra.PLACE", this.place);
    putExtra(paramBundle, "com.facebook.platform.extra.TITLE", this.name);
    putExtra(paramBundle, "com.facebook.platform.extra.REF", this.ref);
    paramBundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", this.dataErrorsFatal);
    if (!Utility.isNullOrEmpty(this.friends)) {
      paramBundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", this.friends);
    }
    int i = FacebookDialog.access$300(this.activity, Integer.valueOf(20130618));
    return NativeProtocol.createPlatformActivityIntent(this.activity, "com.facebook.platform.action.request.FEED_DIALOG", i, paramBundle);
  }
  
  boolean handleCanPresent()
  {
    Activity localActivity = this.activity;
    FacebookDialog.ShareDialogFeature[] arrayOfShareDialogFeature = new FacebookDialog.ShareDialogFeature[1];
    arrayOfShareDialogFeature[0] = FacebookDialog.ShareDialogFeature.SHARE_DIALOG;
    return FacebookDialog.canPresentShareDialog(localActivity, arrayOfShareDialogFeature);
  }
  
  public ShareDialogBuilder setCaption(String paramString)
  {
    this.caption = paramString;
    return this;
  }
  
  public ShareDialogBuilder setDataErrorsFatal(boolean paramBoolean)
  {
    this.dataErrorsFatal = paramBoolean;
    return this;
  }
  
  public ShareDialogBuilder setDescription(String paramString)
  {
    this.description = paramString;
    return this;
  }
  
  public ShareDialogBuilder setFriends(List<String> paramList)
  {
    this.friends = new ArrayList(paramList);
    return this;
  }
  
  public ShareDialogBuilder setLink(String paramString)
  {
    this.link = paramString;
    return this;
  }
  
  public ShareDialogBuilder setName(String paramString)
  {
    this.name = paramString;
    return this;
  }
  
  public ShareDialogBuilder setPicture(String paramString)
  {
    this.picture = paramString;
    return this;
  }
  
  public ShareDialogBuilder setPlace(String paramString)
  {
    this.place = paramString;
    return this;
  }
  
  public ShareDialogBuilder setRef(String paramString)
  {
    this.ref = paramString;
    return this;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.ShareDialogBuilder
 * JD-Core Version:    0.7.0.1
 */