package com.chartboost.sdk.Libraries;

public enum CBOrientation$Difference
{
  static
  {
    ANGLE_180 = new Difference("ANGLE_180", 2);
    ANGLE_270 = new Difference("ANGLE_270", 3);
    Difference[] arrayOfDifference = new Difference[4];
    arrayOfDifference[0] = ANGLE_0;
    arrayOfDifference[1] = ANGLE_90;
    arrayOfDifference[2] = ANGLE_180;
    arrayOfDifference[3] = ANGLE_270;
    b = arrayOfDifference;
  }
  
  public final int getAsInt()
  {
    switch (a()[ordinal()])
    {
    default: 
      return 0;
    case 2: 
      return 90;
    case 3: 
      return 180;
    }
    return 270;
  }
  
  public final boolean isOdd()
  {
    return (this == ANGLE_90) || (this == ANGLE_270);
  }
  
  public final boolean isReverse()
  {
    return (this == ANGLE_180) || (this == ANGLE_270);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.CBOrientation.Difference
 * JD-Core Version:    0.7.0.1
 */