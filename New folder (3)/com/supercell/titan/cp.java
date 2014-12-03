package com.supercell.titan;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class cp
{
  private final boolean a;
  private final Cipher b;
  private final Cipher c;
  private final Cipher d;
  private final Cipher e;
  private final SharedPreferences f;
  
  public cp(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      this.b = Cipher.getInstance("AES/CBC/PKCS5Padding");
      this.c = Cipher.getInstance("AES/CBC/PKCS5Padding");
      this.d = Cipher.getInstance("AES/ECB/PKCS5Padding");
      this.e = Cipher.getInstance("AES/ECB/PKCS5Padding");
      byte[] arrayOfByte = new byte[this.b.getBlockSize()];
      System.arraycopy("fldsjfodasjifudslfjdsaofshaufihadsf".getBytes(), 0, arrayOfByte, 0, this.b.getBlockSize());
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(arrayOfByte);
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-256");
      localMessageDigest.reset();
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(localMessageDigest.digest(paramString2.getBytes("UTF-8")), "AES/CBC/PKCS5Padding");
      this.b.init(1, localSecretKeySpec, localIvParameterSpec);
      this.c.init(2, localSecretKeySpec, localIvParameterSpec);
      this.d.init(1, localSecretKeySpec);
      this.e.init(2, localSecretKeySpec);
      this.f = paramContext.getSharedPreferences(paramString1, 0);
      this.a = true;
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      GameApp.debuggerException(localGeneralSecurityException);
      throw new cq(localGeneralSecurityException);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      GameApp.debuggerException(localUnsupportedEncodingException);
      throw new cq(localUnsupportedEncodingException);
    }
  }
  
  private static String a(String paramString, Cipher paramCipher)
  {
    try
    {
      byte[] arrayOfByte = a(paramCipher, paramString.getBytes("UTF-8"));
      return Base64.encodeToString(arrayOfByte, 2);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      GameApp.debuggerException(localUnsupportedEncodingException);
      throw new cq(localUnsupportedEncodingException);
    }
  }
  
  private static byte[] a(Cipher paramCipher, byte[] paramArrayOfByte)
  {
    try
    {
      byte[] arrayOfByte = paramCipher.doFinal(paramArrayOfByte);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      GameApp.debuggerException(localException);
      throw new cq(localException);
    }
  }
  
  private static String b(String paramString, Cipher paramCipher)
  {
    byte[] arrayOfByte1 = Base64.decode(paramString, 2);
    try
    {
      byte[] arrayOfByte2 = a(paramCipher, arrayOfByte1);
      String str;
      return "";
    }
    catch (cq localcq)
    {
      try
      {
        str = new String(arrayOfByte2, "UTF-8");
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        GameApp.debuggerException(localUnsupportedEncodingException);
      }
      localcq = localcq;
      GameApp.debuggerException(localcq);
      return "";
    }
  }
  
  private String c(String paramString)
  {
    if (this.a) {
      paramString = a(paramString, this.d);
    }
    return paramString;
  }
  
  public final void a(String paramString)
  {
    String str = c(paramString);
    if (this.f.contains(paramString)) {
      this.f.edit().remove(str).apply();
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    String str1 = c(paramString1);
    if ((paramString2 == null) || (paramString2.isEmpty()))
    {
      if (this.f.contains(str1)) {
        this.f.edit().remove(str1).apply();
      }
      return;
    }
    String str2 = a(paramString2, this.b);
    this.f.edit().putString(str1, str2).apply();
  }
  
  public final String b(String paramString)
  {
    String str1 = c(paramString);
    if (this.f.contains(str1))
    {
      String str2 = b(this.f.getString(str1, ""), this.c);
      if (str2.isEmpty()) {
        this.f.edit().remove(str1).apply();
      }
      return str2;
    }
    return "";
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.cp
 * JD-Core Version:    0.7.0.1
 */