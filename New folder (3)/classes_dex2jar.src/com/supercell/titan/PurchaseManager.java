package com.supercell.titan;

import android.content.Intent;
import java.util.Vector;

public abstract class PurchaseManager
{
  private static PurchaseManager l;
  protected final Vector<String> a = new Vector();
  protected final Vector<ce> b = new Vector();
  protected final Vector<cd> c = new Vector();
  protected final Vector<String> d = new Vector();
  protected String e = "";
  protected String f = "";
  protected int g = -1;
  protected final Vector<String> h = new Vector();
  protected final GameApp i;
  protected int j;
  protected final Vector<ce> k = new Vector();
  private boolean m = true;
  private boolean n;
  
  protected PurchaseManager(GameApp paramGameApp)
  {
    this.i = paramGameApp;
    l = this;
  }
  
  public static void addSku(String paramString)
  {
    if (!l.h.contains(paramString)) {
      l.h.add(paramString);
    }
  }
  
  public static boolean arePaymentsAvailable()
  {
    return l.d();
  }
  
  public static native void billingProductBought(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public static native void billingProductCanceled(String paramString);
  
  public static native void billingProductFailed(String paramString1, String paramString2, int paramInt);
  
  public static void buyProduct(String paramString)
  {
    l.c(paramString);
  }
  
  public static void cppBillingCreated()
  {
    l.n = true;
  }
  
  public static void cppBillingDestroyed()
  {
    l.n = false;
  }
  
  public static void finishTransaction(String paramString)
  {
    l.d(paramString);
  }
  
  public static String getProductDetails(String paramString)
  {
    return l.b(paramString);
  }
  
  public static boolean isWaitingForTransaction()
  {
    for (int i1 = 1;; i1 = 0) {
      synchronized (l)
      {
        int i2;
        if (l.j > 0)
        {
          i2 = i1;
          if (!l.k.isEmpty()) {
            return i1 | i2;
          }
        }
        else
        {
          i2 = 0;
        }
      }
    }
  }
  
  public static native void sendPurchasingEvent(String paramString);
  
  public static void startBillingTransactions()
  {
    if (!l.m)
    {
      l.m = true;
      l.b.addAll(l.k);
      l.k.clear();
    }
  }
  
  public static void stopBillingTransactions()
  {
    l.m = false;
  }
  
  public static native void updateBillingProductDetails(String paramString1, String paramString2, int paramInt);
  
  public static void updateDetails()
  {
    l.b();
  }
  
  public void a()
  {
    l = null;
  }
  
  protected final void a(int paramInt)
  {
    this.k.remove(paramInt);
  }
  
  public void a(int paramInt, Intent paramIntent) {}
  
  protected final boolean a(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {}
    while ((!this.h.isEmpty()) && (!this.h.contains(paramString))) {
      return false;
    }
    return true;
  }
  
  protected abstract String b(String paramString);
  
  protected abstract void b();
  
  public final void c()
  {
    int i1 = this.a.size();
    for (int i2 = 0; i2 < i1; i2++) {
      sendPurchasingEvent((String)this.a.remove(0));
    }
    if (!this.n) {}
    for (;;)
    {
      return;
      if (this.e == null) {
        this.e = "";
      }
      if (this.f == null) {
        this.f = "";
      }
      if ((!this.e.isEmpty()) || (!this.f.isEmpty()))
      {
        if (!this.f.isEmpty()) {
          break label250;
        }
        updateBillingProductDetails(this.e, "", this.g);
      }
      for (;;)
      {
        this.e = "";
        this.f = "";
        this.g = -1;
        if (!this.m) {
          break;
        }
        int i3 = this.b.size();
        for (int i4 = 0; i4 < i3; i4++)
        {
          ce localce = (ce)this.b.remove(0);
          if (localce != null)
          {
            billingProductBought(localce.c, localce.b, localce.a, localce.d);
            if (this.k.size() >= 100) {
              this.k.remove(0);
            }
            this.k.add(localce);
          }
        }
        label250:
        updateBillingProductDetails("", "", this.g);
      }
      int i5 = this.c.size();
      for (int i6 = 0; i6 < i5; i6++)
      {
        cd localcd = (cd)this.c.remove(0);
        if (localcd != null) {
          billingProductFailed(localcd.a, localcd.b, localcd.c);
        }
      }
      int i7 = this.d.size();
      for (int i8 = 0; i8 < i7; i8++) {
        billingProductCanceled((String)this.d.remove(0));
      }
    }
  }
  
  protected abstract void c(String paramString);
  
  protected abstract void d(String paramString);
  
  protected abstract boolean d();
  
  public final int e()
  {
    return this.h.size();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.PurchaseManager
 * JD-Core Version:    0.7.0.1
 */