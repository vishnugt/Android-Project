package com.chartboost.sdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.chartboost.sdk.Analytics.CBAnalytics;
import com.chartboost.sdk.Libraries.CBOrientation;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Libraries.d.g;
import com.chartboost.sdk.impl.a.b;
import com.chartboost.sdk.impl.j;
import com.chartboost.sdk.impl.k;
import com.chartboost.sdk.impl.o;
import java.util.ArrayList;
import java.util.List;

public final class Chartboost
{
  private static Chartboost d = null;
  private Runnable A = new Chartboost.a(this, null);
  protected Chartboost.b a = null;
  protected j b;
  protected Handler c;
  private b e;
  private Context f = null;
  private CBImpressionActivity g = null;
  private List<b.a> h = new ArrayList();
  private a i;
  private String j;
  private String k;
  private ChartboostDelegate l;
  private int m = 30000;
  private boolean n = false;
  private CBOrientation o;
  private boolean p;
  private boolean q = false;
  private boolean r = false;
  private String s = null;
  private boolean t = false;
  private SparseBooleanArray u = new SparseBooleanArray();
  private SparseArray<b> v = new SparseArray();
  private boolean w = false;
  private long x = 0L;
  private long y = 0L;
  private boolean z = false;
  
  private Chartboost()
  {
    d = this;
    this.c = new Handler();
    this.b = new j(null, null);
    this.i = new a(this);
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    this.u.put(paramInt, paramBoolean);
  }
  
  private void a(Activity paramActivity, boolean paramBoolean)
  {
    if (paramActivity == null) {
      return;
    }
    a(paramActivity.hashCode(), paramBoolean);
  }
  
  private void a(Chartboost.b paramb, boolean paramBoolean)
  {
    if (paramb == null) {
      return;
    }
    a(paramb.a(), paramBoolean);
  }
  
  private void a(Runnable paramRunnable)
  {
    if (!CBUtility.d())
    {
      this.c.post(paramRunnable);
      return;
    }
    paramRunnable.run();
  }
  
  private boolean a(Chartboost.b paramb)
  {
    if (paramb == null) {}
    Boolean localBoolean;
    do
    {
      return false;
      localBoolean = Boolean.valueOf(this.u.get(paramb.a()));
    } while (localBoolean == null);
    return localBoolean.booleanValue();
  }
  
  private void b(Chartboost.b paramb)
  {
    if (!this.n) {
      c(paramb);
    }
    if (!(paramb.get() instanceof CBImpressionActivity)) {
      a(paramb, false);
    }
    this.x = ((System.nanoTime() / 1000000.0D));
  }
  
  private void b(Chartboost.b paramb, boolean paramBoolean)
  {
    int i1 = paramb.a();
    b localb1 = (b)this.v.get(i1);
    b localb3;
    if ((localb1 == null) && (paramBoolean)) {
      if (this.e != null)
      {
        b localb4 = this.e;
        this.e = null;
        localb4.a((Activity)paramb.get());
        localb3 = localb4;
        this.v.put(i1, localb3);
      }
    }
    b localb2;
    do
    {
      do
      {
        return;
        localb3 = new b(this, (Activity)paramb.get());
        break;
      } while ((localb1 == null) || (paramBoolean));
      localb2 = (b)this.v.get(i1);
      this.v.remove(i1);
      localb2.a(null);
    } while (this.e != null);
    this.e = localb2;
  }
  
  private void c(Chartboost.b paramb)
  {
    b localb = a();
    if ((d(paramb)) && (localb != null))
    {
      b(paramb, false);
      this.w = false;
      if (localb.a())
      {
        localb.a(false);
        this.w = true;
      }
      if (this.i.a() != null) {
        localb.a(this.i.a());
      }
      if ((paramb.get() instanceof CBImpressionActivity)) {
        d();
      }
    }
    if (!(paramb.get() instanceof CBImpressionActivity)) {
      a(paramb, false);
    }
  }
  
  private void cacheInterstitialDataBatch(String paramString, int paramInt, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    d.a(paramString, paramInt, paramCBAPIResponseCallback);
  }
  
  private boolean d(Activity paramActivity)
  {
    if (this.n) {
      if (this.g != paramActivity) {}
    }
    do
    {
      return true;
      return false;
      if (this.a != null) {
        break;
      }
    } while (paramActivity == null);
    return false;
    return this.a.a(paramActivity);
  }
  
  private boolean d(Chartboost.b paramb)
  {
    if (this.n) {
      if (paramb == null) {
        if (this.g != null) {}
      }
    }
    do
    {
      return true;
      return false;
      return paramb.a(this.g);
      if (this.a != null) {
        break;
      }
    } while (paramb == null);
    return false;
    return this.a.a(paramb);
  }
  
  private boolean e()
  {
    return a(this.a);
  }
  
  public static Chartboost sharedChartboost()
  {
    try
    {
      if (d == null) {
        d = new Chartboost();
      }
      Chartboost localChartboost = d;
      return localChartboost;
    }
    finally {}
  }
  
  protected final b a()
  {
    Activity localActivity = c();
    if (localActivity == null) {
      return null;
    }
    return (b)this.v.get(localActivity.hashCode());
  }
  
  protected final void a(Activity paramActivity)
  {
    this.f = paramActivity.getApplicationContext();
    if (!(paramActivity instanceof CBImpressionActivity))
    {
      this.a = new Chartboost.b(paramActivity);
      a(this.a, true);
    }
    for (;;)
    {
      this.c.removeCallbacks(this.A);
      if ((paramActivity != null) && (d(paramActivity))) {
        break;
      }
      return;
      a((CBImpressionActivity)paramActivity);
    }
    b(new Chartboost.b(paramActivity), true);
    b localb;
    int i2;
    if ((paramActivity instanceof CBImpressionActivity))
    {
      localb = a();
      if (localb != null)
      {
        i2 = 0;
        label103:
        if (i2 >= this.h.size()) {
          this.h.clear();
        }
      }
      else
      {
        this.z = false;
      }
    }
    else
    {
      if (!this.w) {
        break label228;
      }
      this.w = false;
    }
    label228:
    for (int i1 = 1;; i1 = 0)
    {
      if ((this.i.a() != null) && (this.i.a().c == a.b.b) && (this.i.a().a())) {
        i1 = 0;
      }
      if (i1 == 0) {
        break;
      }
      a(new b.a(true, null));
      return;
      localb.a((b.a)this.h.get(i2));
      i2++;
      break label103;
    }
  }
  
  protected final void a(CBImpressionActivity paramCBImpressionActivity)
  {
    if (!this.t)
    {
      this.f = paramCBImpressionActivity.getApplicationContext();
      this.g = paramCBImpressionActivity;
      this.t = true;
    }
    this.c.removeCallbacks(this.A);
  }
  
  protected final void a(b.a parama)
  {
    boolean bool1 = true;
    if (getImpressionsUseActivities())
    {
      b localb2 = a();
      if ((c() != null) && (this.t) && (localb2 != null)) {
        localb2.a(parama);
      }
    }
    label160:
    label212:
    label218:
    b localb1;
    do
    {
      Activity localActivity;
      do
      {
        do
        {
          return;
        } while (!e());
        localActivity = (Activity)this.a.get();
        if (localActivity != null) {
          break;
        }
      } while (parama.b.f.d == null);
      parama.b.f.d.a();
      return;
      this.h.add(parama);
      Intent localIntent = new Intent(localActivity, CBImpressionActivity.class);
      boolean bool2;
      boolean bool3;
      if ((0x400 & localActivity.getWindow().getAttributes().flags) != 0)
      {
        bool2 = bool1;
        if ((0x800 & localActivity.getWindow().getAttributes().flags) == 0) {
          break label212;
        }
        bool3 = bool1;
        if ((!bool2) || (bool3)) {
          break label218;
        }
      }
      for (;;)
      {
        localIntent.putExtra("paramFullscreen", bool1);
        try
        {
          localActivity.startActivity(localIntent);
          this.z = true;
          return;
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          throw new RuntimeException("Chartboost impression activity not declared in manifest. Please add the following inside your manifest's <application> tag: \n<activity android:name=\"com.chartboost.sdk.CBImpressionActivity\" android:theme=\"@android:style/Theme.Translucent.NoTitleBar\" android:excludeFromRecents=\"true\" />");
        }
        bool2 = false;
        break;
        bool3 = false;
        break label160;
        bool1 = false;
      }
      localb1 = a();
    } while (localb1 == null);
    localb1.a(parama);
  }
  
  protected final void a(com.chartboost.sdk.impl.a parama)
  {
    this.i.a(parama);
  }
  
  protected final void b(Activity paramActivity)
  {
    c(new Chartboost.b(paramActivity));
  }
  
  protected final boolean b()
  {
    if ((this.i.a() != null) && (this.i.a().c == a.b.c))
    {
      a(new Chartboost.2(this));
      return true;
    }
    b localb = a();
    if ((localb != null) && (localb.a()))
    {
      a(new Chartboost.3(this, localb));
      return true;
    }
    return false;
  }
  
  protected final Activity c()
  {
    if (this.n) {
      return this.g;
    }
    return (Activity)this.a.get();
  }
  
  protected final void c(Activity paramActivity)
  {
    b(new Chartboost.b(paramActivity), false);
  }
  
  public final void cacheInterstitial()
  {
    cacheInterstitial("Default");
  }
  
  public final void cacheInterstitial(String paramString)
  {
    if (this.a == null) {
      throw new IllegalStateException("The context must be set through the Chartboost method onCreate() before calling cacheInterstitial().");
    }
    this.i.a(paramString);
  }
  
  public final void cacheInterstitialData(String paramString, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    d.a(paramString, paramCBAPIResponseCallback);
  }
  
  public final void cacheMoreApps()
  {
    if (this.a == null) {
      throw new IllegalStateException("The context must be set through the Chartboost method onCreate() before calling cacheMoreApps().");
    }
    this.i.a(true);
  }
  
  public final void clearCache()
  {
    this.i.e();
  }
  
  public final void clearImageCache()
  {
    if (getContext() == null) {
      throw new IllegalStateException("The context must be set through the Chartboost method onCreate() before calling clearImageCache().");
    }
    o.a().b();
  }
  
  protected final void d()
  {
    if (this.t)
    {
      this.g = null;
      this.t = false;
    }
  }
  
  public final CBAnalytics getAnalytics()
  {
    return CBAnalytics.sharedAnalytics();
  }
  
  public final boolean getAnimationsOff()
  {
    return this.r;
  }
  
  public final String getAppID()
  {
    return this.j;
  }
  
  public final String getAppSignature()
  {
    return this.k;
  }
  
  public final Context getContext()
  {
    return this.f;
  }
  
  public final ChartboostDelegate getDelegate()
  {
    return this.l;
  }
  
  public final CBOrientation.Difference getForcedOrientationDifference()
  {
    if (!this.p) {
      return CBOrientation.Difference.ANGLE_0;
    }
    CBOrientation localCBOrientation1 = CBUtility.c(getContext());
    CBOrientation localCBOrientation2 = getOrientation();
    if ((localCBOrientation2 == CBOrientation.UNSPECIFIED) || (localCBOrientation2 == localCBOrientation1)) {
      return CBOrientation.Difference.ANGLE_0;
    }
    if (localCBOrientation2 == localCBOrientation1.rotate90()) {
      return CBOrientation.Difference.ANGLE_90;
    }
    if (localCBOrientation2 == localCBOrientation1.rotate180()) {
      return CBOrientation.Difference.ANGLE_180;
    }
    return CBOrientation.Difference.ANGLE_270;
  }
  
  public final String getFramework()
  {
    if (this.s == null) {
      return "native";
    }
    return this.s;
  }
  
  public final Handler getHandler()
  {
    return this.c;
  }
  
  protected final Activity getHostActivity()
  {
    if (this.a != null) {
      return (Activity)this.a.get();
    }
    return null;
  }
  
  public final boolean getIgnoreErrors()
  {
    return this.q;
  }
  
  public final boolean getImpressionsUseActivities()
  {
    return this.n;
  }
  
  public final CBOrientation getOrientation()
  {
    if (getContext() == null) {
      throw new IllegalStateException("The context must be set through the Chartboost method onCreate() before calling getOrientation().");
    }
    if ((this.p) && (this.o != CBOrientation.UNSPECIFIED)) {
      return this.o;
    }
    return CBUtility.c(getContext());
  }
  
  public final int getTimeout()
  {
    return this.m;
  }
  
  public final boolean hasCachedInterstitial()
  {
    return hasCachedInterstitial("Default");
  }
  
  public final boolean hasCachedInterstitial(String paramString)
  {
    return this.i.c(paramString);
  }
  
  public final boolean hasCachedMoreApps()
  {
    return this.i.c();
  }
  
  public final boolean isIdentityTrackingDisabledOnThisDevice()
  {
    return CBUtility.c();
  }
  
  public final boolean onBackPressed()
  {
    if ((!this.q) && (!CBUtility.d())) {
      throw new IllegalStateException("It is illegal to call this method from any thread other than the UI thread. Please call it from the onBackPressed() method of your host activity.");
    }
    if (this.a == null) {
      throw new IllegalStateException("The Chartboost methods onCreate(), onStart(), onStop(), and onDestroy() must be called in the corresponding methods of your activity in order for Chartboost to function properly.");
    }
    if (this.n)
    {
      boolean bool1 = this.z;
      boolean bool2 = false;
      if (bool1)
      {
        this.z = false;
        b();
        bool2 = true;
      }
      return bool2;
    }
    return b();
  }
  
  public final void onCreate(Activity paramActivity, String paramString1, String paramString2, ChartboostDelegate paramChartboostDelegate)
  {
    if ((!this.q) && (!CBUtility.d())) {
      throw new IllegalStateException("It is illegal to call this method from any thread other than the UI thread. Please call it from the onCreate() method of your host activity.");
    }
    if ((this.a != null) && (!this.a.a(paramActivity)) && (e()))
    {
      b(this.a);
      a(this.a, false);
    }
    this.c.removeCallbacks(this.A);
    this.a = new Chartboost.b(paramActivity);
    this.f = paramActivity.getApplicationContext();
    setAppID(paramString1);
    setAppSignature(paramString2);
    setDelegate(paramChartboostDelegate);
  }
  
  public final void onDestroy(Activity paramActivity)
  {
    this.c.postDelayed(this.A, 10000L);
    c(paramActivity);
  }
  
  public final void onStart(Activity paramActivity)
  {
    if ((!this.q) && (!CBUtility.d())) {
      throw new IllegalStateException("It is illegal to call this method from any thread other than the UI thread. Please call it from the onStart() method of your host activity.");
    }
    this.c.removeCallbacks(this.A);
    if ((this.a != null) && (!this.a.a(paramActivity)) && (e()))
    {
      b(this.a);
      a(this.a, false);
    }
    a(paramActivity, true);
    this.a = new Chartboost.b(paramActivity);
    this.f = paramActivity.getApplicationContext();
    if (!this.n) {
      a(paramActivity);
    }
  }
  
  public final void onStop(Activity paramActivity)
  {
    if ((!this.q) && (!CBUtility.d())) {
      throw new IllegalStateException("It is illegal to call this method from any thread other than the UI thread. Please call it from the onStop() method of your host activity.");
    }
    Chartboost.b localb = new Chartboost.b(paramActivity);
    if (a(localb)) {
      b(localb);
    }
  }
  
  public final void setAnimationsOff(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }
  
  public final void setAppID(String paramString)
  {
    this.j = paramString;
  }
  
  public final void setAppSignature(String paramString)
  {
    this.k = paramString;
  }
  
  public final void setDelegate(ChartboostDelegate paramChartboostDelegate)
  {
    this.l = paramChartboostDelegate;
  }
  
  public final void setFramework(String paramString)
  {
    this.s = paramString;
  }
  
  public final void setIdentityTrackingDisabledOnThisDevice(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = CBUtility.a().edit();
    localEditor.putBoolean("cbIdentityTrackingDisabled", paramBoolean);
    localEditor.commit();
  }
  
  public final void setIgnoreErrors(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  public final void setImpressionsUseActivities(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public final void setOrientation(CBOrientation paramCBOrientation)
  {
    if (paramCBOrientation != CBOrientation.UNSPECIFIED) {}
    for (boolean bool = true;; bool = false)
    {
      this.p = bool;
      this.o = paramCBOrientation;
      return;
    }
  }
  
  public final void setTimeout(int paramInt)
  {
    this.m = paramInt;
  }
  
  public final void showInterstitial()
  {
    showInterstitial("Default");
  }
  
  public final void showInterstitial(String paramString)
  {
    if (this.a == null) {
      throw new IllegalStateException("The context must be set through the Chartboost method onCreate() before calling showInterstitial().");
    }
    this.i.b(paramString);
  }
  
  public final void showInterstitialData(String paramString, Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    d.b(paramString, paramCBAPIResponseCallback);
  }
  
  public final void showMoreApps()
  {
    if (this.a == null) {
      throw new IllegalStateException("The context must be set through the Chartboost method onCreate() before calling showMoreApps().");
    }
    this.i.b();
  }
  
  public final void showMoreAppsData(Chartboost.CBAPIResponseCallback paramCBAPIResponseCallback)
  {
    d.a(paramCBAPIResponseCallback);
  }
  
  public final void startSession()
  {
    if (this.a == null) {
      throw new IllegalStateException("The context must be set through the Chartboost method onCreate() before calling startSession().");
    }
    long l1 = (System.nanoTime() / 1000000.0D);
    if (l1 - this.x < 10000L) {}
    while (l1 - this.y < 60000L) {
      return;
    }
    this.y = l1;
    SharedPreferences localSharedPreferences = CBUtility.a();
    int i1 = 1 + localSharedPreferences.getInt("cbPrefSessionCount", 0);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putInt("cbPrefSessionCount", i1);
    localEditor.commit();
    k localk = new k("api/install");
    localk.a(this.a.b());
    localk.b(getAppID(), getAppSignature());
    d.g[] arrayOfg = new d.g[1];
    arrayOfg[0] = com.chartboost.sdk.Libraries.d.a("status", j.a);
    localk.a(arrayOfg);
    this.b.a(localk, new Chartboost.1(this));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Chartboost
 * JD-Core Version:    0.7.0.1
 */