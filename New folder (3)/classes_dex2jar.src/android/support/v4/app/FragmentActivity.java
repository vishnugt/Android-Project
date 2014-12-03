package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.c.c;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FragmentActivity
  extends Activity
{
  final Handler a = new f(this);
  final j b = new j();
  boolean c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  boolean h;
  boolean i;
  boolean j;
  c<r> k;
  r l;
  
  public static void c() {}
  
  final r a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.k == null) {
      this.k = new c();
    }
    r localr = (r)this.k.a(paramInt);
    if (localr == null)
    {
      if (paramBoolean2)
      {
        localr = new r(this, paramBoolean1);
        this.k.a(paramInt, localr);
      }
      return localr;
    }
    localr.a(this);
    return localr;
  }
  
  protected final void a()
  {
    this.b.j();
  }
  
  final void a(int paramInt)
  {
    if (this.k != null)
    {
      r localr = (r)this.k.a(paramInt);
      if ((localr != null) && (!localr.f))
      {
        localr.h();
        this.k.b(paramInt);
      }
    }
  }
  
  public final void a(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    if (paramInt == -1)
    {
      super.startActivityForResult(paramIntent, -1);
      return;
    }
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    super.startActivityForResult(paramIntent, (1 + paramFragment.mIndex << 16) + (0xFFFF & paramInt));
  }
  
  final void a(boolean paramBoolean)
  {
    if (!this.f)
    {
      this.f = true;
      this.g = paramBoolean;
      this.a.removeMessages(1);
      if (this.j)
      {
        this.j = false;
        if (this.l != null)
        {
          if (this.g) {
            break label66;
          }
          this.l.c();
        }
      }
    }
    for (;;)
    {
      this.b.m();
      return;
      label66:
      this.l.d();
    }
  }
  
  public final void b()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      invalidateOptionsMenu();
      return;
    }
    this.h = true;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.c);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.d);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.e);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.f);
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.j);
    if (this.l != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.l)));
      paramPrintWriter.println(":");
      this.l.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.b.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int m = paramInt1 >> 16;
    if (m != 0)
    {
      int n = m - 1;
      if ((this.b.f == null) || (n < 0) || (n >= this.b.f.size()))
      {
        new StringBuilder("Activity result fragment index out of range: 0x").append(Integer.toHexString(paramInt1)).toString();
        return;
      }
      Fragment localFragment = (Fragment)this.b.f.get(n);
      if (localFragment == null)
      {
        new StringBuilder("Activity result no fragment exists for index: 0x").append(Integer.toHexString(paramInt1)).toString();
        return;
      }
      localFragment.onActivityResult(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    if (!this.b.a()) {
      finish();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.b.a(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    this.b.a(this);
    if (getLayoutInflater().getFactory() == null) {
      getLayoutInflater().setFactory(this);
    }
    super.onCreate(paramBundle);
    h localh = (h)getLastNonConfigurationInstance();
    if (localh != null) {
      this.k = localh.e;
    }
    Parcelable localParcelable;
    j localj;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      localj = this.b;
      if (localh == null) {
        break label94;
      }
    }
    label94:
    for (ArrayList localArrayList = localh.d;; localArrayList = null)
    {
      localj.a(localParcelable, localArrayList);
      this.b.g();
      return;
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool = super.onCreatePanelMenu(paramInt, paramMenu) | this.b.a(paramMenu, getMenuInflater());
      if (Build.VERSION.SDK_INT >= 11) {
        return bool;
      }
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString)) {
      return super.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, g.a);
    if (str1 == null) {
      str1 = localTypedArray.getString(0);
    }
    int m = localTypedArray.getResourceId(1, -1);
    String str2 = localTypedArray.getString(2);
    localTypedArray.recycle();
    Object localObject = null;
    if (m != -1) {
      localObject = this.b.a(m);
    }
    if ((localObject == null) && (str2 != null)) {
      localObject = this.b.a(str2);
    }
    if (localObject == null) {
      localObject = this.b.a(0);
    }
    if (j.a) {
      new StringBuilder("onCreateView: id=0x").append(Integer.toHexString(m)).append(" fname=").append(str1).append(" existing=").append(localObject).toString();
    }
    int n;
    if (localObject == null)
    {
      Fragment localFragment = Fragment.instantiate(this, str1);
      localFragment.mFromLayout = true;
      if (m != 0)
      {
        n = m;
        localFragment.mFragmentId = n;
        localFragment.mContainerId = 0;
        localFragment.mTag = str2;
        localFragment.mInLayout = true;
        localFragment.mFragmentManager = this.b;
        localFragment.onInflate(this, paramAttributeSet, localFragment.mSavedFragmentState);
        this.b.a(localFragment, true);
        localObject = localFragment;
      }
    }
    for (;;)
    {
      if (((Fragment)localObject).mView != null) {
        break label438;
      }
      throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
      n = 0;
      break;
      if (((Fragment)localObject).mInLayout) {
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(m) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + str1);
      }
      ((Fragment)localObject).mInLayout = true;
      if (!((Fragment)localObject).mRetaining) {
        ((Fragment)localObject).onInflate(this, paramAttributeSet, ((Fragment)localObject).mSavedFragmentState);
      }
      this.b.b((Fragment)localObject);
    }
    label438:
    if (m != 0) {
      ((Fragment)localObject).mView.setId(m);
    }
    if (((Fragment)localObject).mView.getTag() == null) {
      ((Fragment)localObject).mView.setTag(str2);
    }
    return ((Fragment)localObject).mView;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    a(false);
    this.b.n();
    if (this.l != null) {
      this.l.h();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.b.o();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 0: 
      return this.b.a(paramMenuItem);
    }
    return this.b.b(paramMenuItem);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.b.b(paramMenu);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    this.d = false;
    if (this.a.hasMessages(2))
    {
      this.a.removeMessages(2);
      this.b.j();
    }
    this.b.k();
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    this.a.removeMessages(2);
    this.b.j();
    this.b.c();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.h)
      {
        this.h = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      boolean bool1 = super.onPreparePanel(paramInt, paramView, paramMenu) | this.b.a(paramMenu);
      boolean bool2 = false;
      if (bool1)
      {
        boolean bool3 = paramMenu.hasVisibleItems();
        bool2 = false;
        if (bool3) {
          bool2 = true;
        }
      }
      return bool2;
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.a.sendEmptyMessage(2);
    this.d = true;
    this.b.c();
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    if (this.e) {
      a(true);
    }
    ArrayList localArrayList = this.b.d();
    c localc = this.k;
    int m = 0;
    if (localc != null)
    {
      int n = -1 + this.k.a();
      if (n >= 0)
      {
        r localr = (r)this.k.e(n);
        if (localr.f) {}
        for (int i1 = 1;; i1 = m)
        {
          n--;
          m = i1;
          break;
          localr.h();
          this.k.c(n);
        }
      }
    }
    if ((localArrayList == null) && (m == 0)) {
      return null;
    }
    h localh = new h();
    localh.a = null;
    localh.b = null;
    localh.c = null;
    localh.d = localArrayList;
    localh.e = this.k;
    return localh;
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.b.e();
    if (localParcelable != null) {
      paramBundle.putParcelable("android:support:fragments", localParcelable);
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    this.e = false;
    this.f = false;
    this.a.removeMessages(1);
    if (!this.c)
    {
      this.c = true;
      this.b.h();
    }
    this.b.f();
    this.b.c();
    if (!this.j)
    {
      this.j = true;
      if (this.l == null) {
        break label141;
      }
      this.l.b();
    }
    for (;;)
    {
      this.i = true;
      this.b.i();
      if (this.k == null) {
        break;
      }
      for (int m = -1 + this.k.a(); m >= 0; m--)
      {
        r localr = (r)this.k.e(m);
        localr.e();
        localr.g();
      }
      label141:
      if (!this.i) {
        this.l = a(-1, this.j, false);
      }
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    this.e = true;
    this.a.sendEmptyMessage(1);
    this.b.l();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0)) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentActivity
 * JD-Core Version:    0.7.0.1
 */