package com.chartboost.sdk.Libraries;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class b
{
  public static byte[] a(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    if (paramArrayOfByte != null) {}
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.update(paramArrayOfByte);
      byte[] arrayOfByte = localMessageDigest.digest();
      localObject = arrayOfByte;
      return localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    return null;
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    BigInteger localBigInteger = new BigInteger(1, paramArrayOfByte);
    return String.format(Locale.US, "%0" + (paramArrayOfByte.length << 1) + "x", new Object[] { localBigInteger });
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.b
 * JD-Core Version:    0.7.0.1
 */