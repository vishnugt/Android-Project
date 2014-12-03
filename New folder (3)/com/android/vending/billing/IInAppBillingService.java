package com.android.vending.billing;

import android.os.Bundle;
import android.os.IInterface;

public abstract interface IInAppBillingService
  extends IInterface
{
  public abstract int a(int paramInt, String paramString1, String paramString2);
  
  public abstract Bundle a(int paramInt, String paramString1, String paramString2, Bundle paramBundle);
  
  public abstract Bundle a(int paramInt, String paramString1, String paramString2, String paramString3);
  
  public abstract Bundle a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract int b(int paramInt, String paramString1, String paramString2);
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.android.vending.billing.IInAppBillingService
 * JD-Core Version:    0.7.0.1
 */