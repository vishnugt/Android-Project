package com.facebook;

import android.os.Bundle;

public class NonCachingTokenCachingStrategy
  extends TokenCachingStrategy
{
  public void clear() {}
  
  public Bundle load()
  {
    return null;
  }
  
  public void save(Bundle paramBundle) {}
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.NonCachingTokenCachingStrategy
 * JD-Core Version:    0.7.0.1
 */