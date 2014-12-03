package com.facebook.widget;

public enum FacebookDialog$ShareDialogFeature
  implements FacebookDialog.DialogFeature
{
  private int minVersion;
  
  static
  {
    ShareDialogFeature[] arrayOfShareDialogFeature = new ShareDialogFeature[1];
    arrayOfShareDialogFeature[0] = SHARE_DIALOG;
    $VALUES = arrayOfShareDialogFeature;
  }
  
  private FacebookDialog$ShareDialogFeature(int paramInt)
  {
    this.minVersion = paramInt;
  }
  
  public final int getMinVersion()
  {
    return this.minVersion;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.ShareDialogFeature
 * JD-Core Version:    0.7.0.1
 */