package com.chartboost.sdk.impl;

import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public class z
  extends ai
{
  static final Logger a = Logger.getLogger("com.mongodb");
  static final boolean b = Boolean.getBoolean("DEBUG.MONGO");
  public static final ByteOrder c;
  static final int d;
  static final ba e;
  
  static
  {
    if (a.getLevel() == null)
    {
      if (!b) {
        break label73;
      }
      a.setLevel(Level.ALL);
    }
    for (;;)
    {
      c = ByteOrder.LITTLE_ENDIAN;
      d = Integer.parseInt(System.getProperty("MONGO.POOLSIZE", "10"));
      e = new ba(-1, -1, -1);
      return;
      label73:
      a.setLevel(Level.WARNING);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.z
 * JD-Core Version:    0.7.0.1
 */