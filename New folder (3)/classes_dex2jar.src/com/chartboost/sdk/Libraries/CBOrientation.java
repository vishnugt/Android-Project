package com.chartboost.sdk.Libraries;

public enum CBOrientation
{
  public static final CBOrientation LANDSCAPE_LEFT = LANDSCAPE;
  public static final CBOrientation LANDSCAPE_RIGHT = LANDSCAPE_REVERSE;
  public static final CBOrientation PORTRAIT_LEFT;
  public static final CBOrientation PORTRAIT_RIGHT;
  
  static
  {
    PORTRAIT = new CBOrientation("PORTRAIT", 1);
    LANDSCAPE = new CBOrientation("LANDSCAPE", 2);
    PORTRAIT_REVERSE = new CBOrientation("PORTRAIT_REVERSE", 3);
    LANDSCAPE_REVERSE = new CBOrientation("LANDSCAPE_REVERSE", 4);
    CBOrientation[] arrayOfCBOrientation = new CBOrientation[5];
    arrayOfCBOrientation[0] = UNSPECIFIED;
    arrayOfCBOrientation[1] = PORTRAIT;
    arrayOfCBOrientation[2] = LANDSCAPE;
    arrayOfCBOrientation[3] = PORTRAIT_REVERSE;
    arrayOfCBOrientation[4] = LANDSCAPE_REVERSE;
    b = arrayOfCBOrientation;
    PORTRAIT_LEFT = PORTRAIT_REVERSE;
    PORTRAIT_RIGHT = PORTRAIT;
  }
  
  public final boolean isLandscape()
  {
    return (this == LANDSCAPE) || (this == LANDSCAPE_REVERSE);
  }
  
  public final boolean isPortrait()
  {
    return (this == PORTRAIT) || (this == PORTRAIT_REVERSE);
  }
  
  public final CBOrientation rotate180()
  {
    return rotate90().rotate90();
  }
  
  public final CBOrientation rotate270()
  {
    return rotate90().rotate90().rotate90();
  }
  
  public final CBOrientation rotate90()
  {
    switch (a()[ordinal()])
    {
    default: 
      return UNSPECIFIED;
    case 3: 
      return PORTRAIT_LEFT;
    case 4: 
      return LANDSCAPE_RIGHT;
    case 5: 
      return PORTRAIT_RIGHT;
    }
    return LANDSCAPE_LEFT;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.CBOrientation
 * JD-Core Version:    0.7.0.1
 */