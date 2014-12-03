package android.support.v4.app;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.c.b;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

final class j
  extends i
{
  static final Interpolator A = new AccelerateInterpolator(1.5F);
  static boolean a = false;
  static final boolean b;
  static final Interpolator x;
  static final Interpolator y;
  static final Interpolator z;
  ArrayList<Runnable> c;
  Runnable[] d;
  boolean e;
  ArrayList<Fragment> f;
  ArrayList<Fragment> g;
  ArrayList<Integer> h;
  ArrayList<a> i;
  ArrayList<Fragment> j;
  ArrayList<a> k;
  ArrayList<Integer> l;
  ArrayList<FragmentManager.OnBackStackChangedListener> m;
  int n = 0;
  FragmentActivity o;
  boolean p;
  boolean q;
  boolean r;
  String s;
  boolean t;
  Bundle u = null;
  SparseArray<Parcelable> v = null;
  Runnable w = new k(this);
  
  static
  {
    int i1 = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i1 >= 11) {
      bool = true;
    }
    b = bool;
    x = new DecelerateInterpolator(2.5F);
    y = new DecelerateInterpolator(1.5F);
    z = new AccelerateInterpolator(2.5F);
  }
  
  private static Animation a(float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(y);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }
  
  private static Animation a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setInterpolator(x);
    localScaleAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localScaleAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat3, paramFloat4);
    localAlphaAnimation.setInterpolator(y);
    localAlphaAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localAlphaAnimation);
    return localAnimationSet;
  }
  
  private Animation a(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    Animation localAnimation = paramFragment.onCreateAnimation(paramInt1, paramBoolean, paramFragment.mNextAnim);
    if (localAnimation != null) {}
    do
    {
      return localAnimation;
      if (paramFragment.mNextAnim == 0) {
        break;
      }
      localAnimation = AnimationUtils.loadAnimation(this.o, paramFragment.mNextAnim);
    } while (localAnimation != null);
    if (paramInt1 == 0) {
      return null;
    }
    int i1 = -1;
    switch (paramInt1)
    {
    }
    while (i1 < 0)
    {
      return null;
      if (paramBoolean)
      {
        i1 = 1;
      }
      else
      {
        i1 = 2;
        continue;
        if (paramBoolean)
        {
          i1 = 3;
        }
        else
        {
          i1 = 4;
          continue;
          if (paramBoolean) {
            i1 = 5;
          } else {
            i1 = 6;
          }
        }
      }
    }
    switch (i1)
    {
    default: 
      if ((paramInt2 == 0) && (this.o.getWindow() != null)) {
        paramInt2 = this.o.getWindow().getAttributes().windowAnimations;
      }
      if (paramInt2 == 0) {
        return null;
      }
      break;
    case 1: 
      return a(1.125F, 1.0F, 0.0F, 1.0F);
    case 2: 
      return a(1.0F, 0.975F, 1.0F, 0.0F);
    case 3: 
      return a(0.975F, 1.0F, 0.0F, 1.0F);
    case 4: 
      return a(1.0F, 1.075F, 1.0F, 0.0F);
    case 5: 
      return a(0.0F, 1.0F);
    case 6: 
      return a(1.0F, 0.0F);
    }
    return null;
  }
  
  /* Error */
  private void a(int paramInt, a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 171	android/support/v4/app/j:k	Ljava/util/ArrayList;
    //   6: ifnonnull +14 -> 20
    //   9: aload_0
    //   10: new 173	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 174	java/util/ArrayList:<init>	()V
    //   17: putfield 171	android/support/v4/app/j:k	Ljava/util/ArrayList;
    //   20: aload_0
    //   21: getfield 171	android/support/v4/app/j:k	Ljava/util/ArrayList;
    //   24: invokevirtual 178	java/util/ArrayList:size	()I
    //   27: istore 4
    //   29: iload_1
    //   30: iload 4
    //   32: if_icmpge +48 -> 80
    //   35: getstatic 51	android/support/v4/app/j:a	Z
    //   38: ifeq +29 -> 67
    //   41: new 180	java/lang/StringBuilder
    //   44: dup
    //   45: ldc 182
    //   47: invokespecial 185	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   50: iload_1
    //   51: invokevirtual 189	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   54: ldc 191
    //   56: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: aload_2
    //   60: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   63: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   66: pop
    //   67: aload_0
    //   68: getfield 171	android/support/v4/app/j:k	Ljava/util/ArrayList;
    //   71: iload_1
    //   72: aload_2
    //   73: invokevirtual 205	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   76: pop
    //   77: aload_0
    //   78: monitorexit
    //   79: return
    //   80: iload 4
    //   82: iload_1
    //   83: if_icmpge +73 -> 156
    //   86: aload_0
    //   87: getfield 171	android/support/v4/app/j:k	Ljava/util/ArrayList;
    //   90: aconst_null
    //   91: invokevirtual 209	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   94: pop
    //   95: aload_0
    //   96: getfield 211	android/support/v4/app/j:l	Ljava/util/ArrayList;
    //   99: ifnonnull +14 -> 113
    //   102: aload_0
    //   103: new 173	java/util/ArrayList
    //   106: dup
    //   107: invokespecial 174	java/util/ArrayList:<init>	()V
    //   110: putfield 211	android/support/v4/app/j:l	Ljava/util/ArrayList;
    //   113: getstatic 51	android/support/v4/app/j:a	Z
    //   116: ifeq +21 -> 137
    //   119: new 180	java/lang/StringBuilder
    //   122: dup
    //   123: ldc 213
    //   125: invokespecial 185	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   128: iload 4
    //   130: invokevirtual 189	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   133: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: pop
    //   137: aload_0
    //   138: getfield 211	android/support/v4/app/j:l	Ljava/util/ArrayList;
    //   141: iload 4
    //   143: invokestatic 219	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   146: invokevirtual 209	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   149: pop
    //   150: iinc 4 1
    //   153: goto -73 -> 80
    //   156: getstatic 51	android/support/v4/app/j:a	Z
    //   159: ifeq +29 -> 188
    //   162: new 180	java/lang/StringBuilder
    //   165: dup
    //   166: ldc 221
    //   168: invokespecial 185	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   171: iload_1
    //   172: invokevirtual 189	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   175: ldc 223
    //   177: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: aload_2
    //   181: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: pop
    //   188: aload_0
    //   189: getfield 171	android/support/v4/app/j:k	Ljava/util/ArrayList;
    //   192: aload_2
    //   193: invokevirtual 209	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   196: pop
    //   197: goto -120 -> 77
    //   200: astore_3
    //   201: aload_0
    //   202: monitorexit
    //   203: aload_3
    //   204: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	this	j
    //   0	205	1	paramInt	int
    //   0	205	2	parama	a
    //   200	4	3	localObject	Object
    //   27	124	4	i1	int
    // Exception table:
    //   from	to	target	type
    //   2	20	200	finally
    //   20	29	200	finally
    //   35	67	200	finally
    //   67	77	200	finally
    //   77	79	200	finally
    //   86	113	200	finally
    //   113	137	200	finally
    //   137	150	200	finally
    //   156	188	200	finally
    //   188	197	200	finally
  }
  
  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 4097: 
      return 8194;
    case 8194: 
      return 4097;
    }
    return 4099;
  }
  
  private void c(Fragment paramFragment)
  {
    if (paramFragment.mInnerView == null) {
      return;
    }
    if (this.v == null) {
      this.v = new SparseArray();
    }
    for (;;)
    {
      paramFragment.mInnerView.saveHierarchyState(this.v);
      if (this.v.size() <= 0) {
        break;
      }
      paramFragment.mSavedViewState = this.v;
      this.v = null;
      return;
      this.v.clear();
    }
  }
  
  private void d(int paramInt)
  {
    a(paramInt, 0, 0, false);
  }
  
  private void p()
  {
    if (this.m != null) {
      for (int i1 = 0; i1 < this.m.size(); i1++) {
        this.m.get(i1);
      }
    }
  }
  
  public final Fragment a(int paramInt)
  {
    Fragment localFragment;
    if (this.g != null) {
      for (int i2 = -1 + this.g.size(); i2 >= 0; i2--)
      {
        localFragment = (Fragment)this.g.get(i2);
        if ((localFragment != null) && (localFragment.mFragmentId == paramInt)) {
          return localFragment;
        }
      }
    }
    if (this.f != null) {
      for (int i1 = -1 + this.f.size();; i1--)
      {
        if (i1 < 0) {
          break label107;
        }
        localFragment = (Fragment)this.f.get(i1);
        if ((localFragment != null) && (localFragment.mFragmentId == paramInt)) {
          break;
        }
      }
    }
    label107:
    return null;
  }
  
  public final Fragment a(String paramString)
  {
    Fragment localFragment;
    if ((this.g != null) && (paramString != null)) {
      for (int i2 = -1 + this.g.size(); i2 >= 0; i2--)
      {
        localFragment = (Fragment)this.g.get(i2);
        if ((localFragment != null) && (paramString.equals(localFragment.mTag))) {
          return localFragment;
        }
      }
    }
    if ((this.f != null) && (paramString != null)) {
      for (int i1 = -1 + this.f.size();; i1--)
      {
        if (i1 < 0) {
          break label121;
        }
        localFragment = (Fragment)this.f.get(i1);
        if ((localFragment != null) && (paramString.equals(localFragment.mTag))) {
          break;
        }
      }
    }
    label121:
    return null;
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.o == null) && (paramInt1 != 0)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (this.n == paramInt1)) {}
    do
    {
      return;
      this.n = paramInt1;
    } while (this.f == null);
    int i1 = 0;
    boolean bool1 = false;
    label54:
    Fragment localFragment;
    if (i1 < this.f.size())
    {
      localFragment = (Fragment)this.f.get(i1);
      if (localFragment == null) {
        break label170;
      }
      a(localFragment, paramInt1, paramInt2, paramInt3, false);
      if (localFragment.mLoaderManager == null) {
        break label170;
      }
    }
    label170:
    for (boolean bool2 = bool1 | localFragment.mLoaderManager.a();; bool2 = bool1)
    {
      i1++;
      bool1 = bool2;
      break label54;
      if (!bool1) {
        b();
      }
      if ((!this.p) || (this.o == null) || (this.n != 5)) {
        break;
      }
      this.o.b();
      this.p = false;
      return;
    }
  }
  
  public final void a(Configuration paramConfiguration)
  {
    if (this.g != null) {
      for (int i1 = 0; i1 < this.g.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if (localFragment != null) {
          localFragment.onConfigurationChanged(paramConfiguration);
        }
      }
    }
  }
  
  final void a(Parcelable paramParcelable, ArrayList<Fragment> paramArrayList)
  {
    int i1 = 0;
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      FragmentManagerState localFragmentManagerState = (FragmentManagerState)paramParcelable;
      if (localFragmentManagerState.a != null)
      {
        if (paramArrayList != null) {
          for (int i5 = 0; i5 < paramArrayList.size(); i5++)
          {
            Fragment localFragment4 = (Fragment)paramArrayList.get(i5);
            if (a) {
              new StringBuilder("restoreAllState: re-attaching retained ").append(localFragment4).toString();
            }
            FragmentState localFragmentState2 = localFragmentManagerState.a[localFragment4.mIndex];
            localFragmentState2.k = localFragment4;
            localFragment4.mSavedViewState = null;
            localFragment4.mBackStackNesting = 0;
            localFragment4.mInLayout = false;
            localFragment4.mAdded = false;
            localFragment4.mTarget = null;
            if (localFragmentState2.j != null)
            {
              localFragmentState2.j.setClassLoader(this.o.getClassLoader());
              localFragment4.mSavedViewState = localFragmentState2.j.getSparseParcelableArray("android:view_state");
            }
          }
        }
        this.f = new ArrayList(localFragmentManagerState.a.length);
        if (this.h != null) {
          this.h.clear();
        }
        int i2 = 0;
        if (i2 < localFragmentManagerState.a.length)
        {
          FragmentState localFragmentState1 = localFragmentManagerState.a[i2];
          if (localFragmentState1 != null)
          {
            Fragment localFragment3 = localFragmentState1.a(this.o);
            if (a) {
              new StringBuilder("restoreAllState: adding #").append(i2).append(": ").append(localFragment3).toString();
            }
            this.f.add(localFragment3);
            localFragmentState1.k = null;
          }
          for (;;)
          {
            i2++;
            break;
            if (a) {
              new StringBuilder("restoreAllState: adding #").append(i2).append(": (null)").toString();
            }
            this.f.add(null);
            if (this.h == null) {
              this.h = new ArrayList();
            }
            if (a) {
              new StringBuilder("restoreAllState: adding avail #").append(i2).toString();
            }
            this.h.add(Integer.valueOf(i2));
          }
        }
        if (paramArrayList != null)
        {
          int i4 = 0;
          if (i4 < paramArrayList.size())
          {
            Fragment localFragment2 = (Fragment)paramArrayList.get(i4);
            if (localFragment2.mTargetIndex >= 0) {
              if (localFragment2.mTargetIndex >= this.f.size()) {
                break label472;
              }
            }
            for (localFragment2.mTarget = ((Fragment)this.f.get(localFragment2.mTargetIndex));; localFragment2.mTarget = null)
            {
              i4++;
              break;
              label472:
              new StringBuilder("Re-attaching retained fragment ").append(localFragment2).append(" target no longer exists: ").append(localFragment2.mTargetIndex).toString();
            }
          }
        }
        if (localFragmentManagerState.b != null)
        {
          this.g = new ArrayList(localFragmentManagerState.b.length);
          for (int i3 = 0; i3 < localFragmentManagerState.b.length; i3++)
          {
            Fragment localFragment1 = (Fragment)this.f.get(localFragmentManagerState.b[i3]);
            if (localFragment1 == null) {
              throw new IllegalStateException("No instantiated fragment for index #" + localFragmentManagerState.b[i3]);
            }
            localFragment1.mAdded = true;
            if (a) {
              new StringBuilder("restoreAllState: making added #").append(i3).append(": ").append(localFragment1).toString();
            }
            this.g.add(localFragment1);
          }
        }
        this.g = null;
        if (localFragmentManagerState.c == null) {
          break;
        }
        this.i = new ArrayList(localFragmentManagerState.c.length);
        while (i1 < localFragmentManagerState.c.length)
        {
          a locala = localFragmentManagerState.c[i1].a(this);
          if (a) {
            new StringBuilder("restoreAllState: adding bse #").append(i1).append(" (index ").append(locala.o).append("): ").append(locala).toString();
          }
          this.i.add(locala);
          if (locala.o >= 0) {
            a(locala.o, locala);
          }
          i1++;
        }
      }
    }
    this.i = null;
  }
  
  public final void a(Fragment paramFragment)
  {
    if (paramFragment.mDeferStart)
    {
      if (this.e) {
        this.t = true;
      }
    }
    else {
      return;
    }
    paramFragment.mDeferStart = false;
    a(paramFragment, this.n, 0, 0, false);
  }
  
  public final void a(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      new StringBuilder("remove: ").append(paramFragment).append(" nesting=").append(paramFragment.mBackStackNesting).toString();
    }
    int i1;
    if (!paramFragment.isInBackStack())
    {
      i1 = 1;
      if ((!paramFragment.mDetached) || (i1 != 0))
      {
        if (this.g != null) {
          this.g.remove(paramFragment);
        }
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
          this.p = true;
        }
        paramFragment.mAdded = false;
        paramFragment.mRemoving = true;
        if (i1 == 0) {
          break label129;
        }
      }
    }
    label129:
    for (int i2 = 0;; i2 = 1)
    {
      a(paramFragment, i2, paramInt1, paramInt2, false);
      return;
      i1 = 0;
      break;
    }
  }
  
  final void a(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((!paramFragment.mAdded) && (paramInt1 > 1)) {
      paramInt1 = 1;
    }
    if ((paramFragment.mRemoving) && (paramInt1 > paramFragment.mState)) {
      paramInt1 = paramFragment.mState;
    }
    if ((paramFragment.mDeferStart) && (paramFragment.mState < 4) && (paramInt1 > 3)) {
      paramInt1 = 3;
    }
    if (paramFragment.mState < paramInt1)
    {
      if ((paramFragment.mFromLayout) && (!paramFragment.mInLayout)) {
        return;
      }
      if (paramFragment.mAnimatingAway != null)
      {
        paramFragment.mAnimatingAway = null;
        a(paramFragment, paramFragment.mStateAfterAnimating, 0, 0, true);
      }
      switch (paramFragment.mState)
      {
      }
    }
    for (;;)
    {
      paramFragment.mState = paramInt1;
      return;
      if (a) {
        new StringBuilder("moveto CREATED: ").append(paramFragment).toString();
      }
      int i1;
      Fragment localFragment;
      if (paramFragment.mSavedFragmentState != null)
      {
        paramFragment.mSavedViewState = paramFragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        i1 = paramFragment.mSavedFragmentState.getInt("android:target_state", -1);
        if (i1 != -1) {
          break label345;
        }
        localFragment = null;
      }
      label345:
      do
      {
        paramFragment.mTarget = localFragment;
        if (paramFragment.mTarget != null) {
          paramFragment.mTargetRequestCode = paramFragment.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        paramFragment.mUserVisibleHint = paramFragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        if (!paramFragment.mUserVisibleHint)
        {
          paramFragment.mDeferStart = true;
          if (paramInt1 > 3) {
            paramInt1 = 3;
          }
        }
        paramFragment.mActivity = this.o;
        paramFragment.mFragmentManager = this.o.b;
        paramFragment.mCalled = false;
        paramFragment.onAttach(this.o);
        if (paramFragment.mCalled) {
          break;
        }
        throw new u("Fragment " + paramFragment + " did not call through to super.onAttach()");
        if (i1 >= this.f.size()) {
          throw new IllegalStateException("Fragement no longer exists for key " + "android:target_state" + ": index " + i1);
        }
        localFragment = (Fragment)this.f.get(i1);
      } while (localFragment != null);
      throw new IllegalStateException("Fragement no longer exists for key " + "android:target_state" + ": index " + i1);
      FragmentActivity.c();
      if (!paramFragment.mRetaining)
      {
        paramFragment.mCalled = false;
        paramFragment.onCreate(paramFragment.mSavedFragmentState);
        if (!paramFragment.mCalled) {
          throw new u("Fragment " + paramFragment + " did not call through to super.onCreate()");
        }
      }
      paramFragment.mRetaining = false;
      if (paramFragment.mFromLayout)
      {
        paramFragment.mView = paramFragment.onCreateView(paramFragment.getLayoutInflater(paramFragment.mSavedFragmentState), null, paramFragment.mSavedFragmentState);
        if (paramFragment.mView == null) {
          break label717;
        }
        paramFragment.mInnerView = paramFragment.mView;
        paramFragment.mView = t.a(paramFragment.mView);
        if (paramFragment.mHidden) {
          paramFragment.mView.setVisibility(8);
        }
        paramFragment.onViewCreated(paramFragment.mView, paramFragment.mSavedFragmentState);
      }
      while (paramInt1 > 1)
      {
        if (a) {
          new StringBuilder("moveto ACTIVITY_CREATED: ").append(paramFragment).toString();
        }
        if (!paramFragment.mFromLayout)
        {
          ViewGroup localViewGroup;
          if (paramFragment.mContainerId != 0)
          {
            localViewGroup = (ViewGroup)this.o.findViewById(paramFragment.mContainerId);
            if ((localViewGroup == null) && (!paramFragment.mRestored))
            {
              throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramFragment.mContainerId) + " for fragment " + paramFragment);
              label717:
              paramFragment.mInnerView = null;
            }
          }
          else
          {
            localViewGroup = null;
          }
          paramFragment.mContainer = localViewGroup;
          paramFragment.mView = paramFragment.onCreateView(paramFragment.getLayoutInflater(paramFragment.mSavedFragmentState), localViewGroup, paramFragment.mSavedFragmentState);
          if (paramFragment.mView == null) {
            break label900;
          }
          paramFragment.mInnerView = paramFragment.mView;
          paramFragment.mView = t.a(paramFragment.mView);
          if (localViewGroup != null)
          {
            Animation localAnimation2 = a(paramFragment, paramInt2, true, paramInt3);
            if (localAnimation2 != null) {
              paramFragment.mView.startAnimation(localAnimation2);
            }
            localViewGroup.addView(paramFragment.mView);
          }
          if (paramFragment.mHidden) {
            paramFragment.mView.setVisibility(8);
          }
          paramFragment.onViewCreated(paramFragment.mView, paramFragment.mSavedFragmentState);
        }
        for (;;)
        {
          paramFragment.mCalled = false;
          paramFragment.onActivityCreated(paramFragment.mSavedFragmentState);
          if (paramFragment.mCalled) {
            break;
          }
          throw new u("Fragment " + paramFragment + " did not call through to super.onActivityCreated()");
          label900:
          paramFragment.mInnerView = null;
        }
        if (paramFragment.mView != null) {
          paramFragment.restoreViewState();
        }
        paramFragment.mSavedFragmentState = null;
      }
      if (paramInt1 > 3)
      {
        if (a) {
          new StringBuilder("moveto STARTED: ").append(paramFragment).toString();
        }
        paramFragment.mCalled = false;
        paramFragment.performStart();
        if (!paramFragment.mCalled) {
          throw new u("Fragment " + paramFragment + " did not call through to super.onStart()");
        }
      }
      if (paramInt1 > 4)
      {
        if (a) {
          new StringBuilder("moveto RESUMED: ").append(paramFragment).toString();
        }
        paramFragment.mCalled = false;
        paramFragment.mResumed = true;
        paramFragment.onResume();
        if (!paramFragment.mCalled) {
          throw new u("Fragment " + paramFragment + " did not call through to super.onResume()");
        }
        paramFragment.mSavedFragmentState = null;
        paramFragment.mSavedViewState = null;
        continue;
        if (paramFragment.mState > paramInt1) {
          switch (paramFragment.mState)
          {
          }
        }
      }
    }
    label1143:
    do
    {
      if (paramInt1 > 0) {
        break;
      }
      if ((this.r) && (paramFragment.mAnimatingAway != null))
      {
        View localView = paramFragment.mAnimatingAway;
        paramFragment.mAnimatingAway = null;
        localView.clearAnimation();
      }
      if (paramFragment.mAnimatingAway == null) {
        break label1598;
      }
      paramFragment.mStateAfterAnimating = paramInt1;
      paramInt1 = 1;
      break;
      if (paramInt1 < 5)
      {
        if (a) {
          new StringBuilder("movefrom RESUMED: ").append(paramFragment).toString();
        }
        paramFragment.mCalled = false;
        paramFragment.onPause();
        if (!paramFragment.mCalled) {
          throw new u("Fragment " + paramFragment + " did not call through to super.onPause()");
        }
        paramFragment.mResumed = false;
      }
      if (paramInt1 < 4)
      {
        if (a) {
          new StringBuilder("movefrom STARTED: ").append(paramFragment).toString();
        }
        paramFragment.mCalled = false;
        paramFragment.performStop();
        if (!paramFragment.mCalled) {
          throw new u("Fragment " + paramFragment + " did not call through to super.onStop()");
        }
      }
      if (paramInt1 < 3)
      {
        if (a) {
          new StringBuilder("movefrom STOPPED: ").append(paramFragment).toString();
        }
        paramFragment.performReallyStop();
      }
    } while (paramInt1 >= 2);
    if (a) {
      new StringBuilder("movefrom ACTIVITY_CREATED: ").append(paramFragment).toString();
    }
    if ((paramFragment.mView != null) && (!this.o.isFinishing()) && (paramFragment.mSavedViewState == null)) {
      c(paramFragment);
    }
    paramFragment.mCalled = false;
    paramFragment.performDestroyView();
    if (!paramFragment.mCalled) {
      throw new u("Fragment " + paramFragment + " did not call through to super.onDestroyView()");
    }
    if ((paramFragment.mView != null) && (paramFragment.mContainer != null)) {
      if ((this.n <= 0) || (this.r)) {
        break label1843;
      }
    }
    label1843:
    for (Animation localAnimation1 = a(paramFragment, paramInt2, false, paramInt3);; localAnimation1 = null)
    {
      if (localAnimation1 != null)
      {
        paramFragment.mAnimatingAway = paramFragment.mView;
        paramFragment.mStateAfterAnimating = paramInt1;
        localAnimation1.setAnimationListener(new l(this, paramFragment));
        paramFragment.mView.startAnimation(localAnimation1);
      }
      paramFragment.mContainer.removeView(paramFragment.mView);
      paramFragment.mContainer = null;
      paramFragment.mView = null;
      paramFragment.mInnerView = null;
      break label1143;
      label1598:
      if (a) {
        new StringBuilder("movefrom CREATED: ").append(paramFragment).toString();
      }
      if (!paramFragment.mRetaining)
      {
        paramFragment.mCalled = false;
        paramFragment.onDestroy();
        if (!paramFragment.mCalled) {
          throw new u("Fragment " + paramFragment + " did not call through to super.onDestroy()");
        }
      }
      paramFragment.mCalled = false;
      paramFragment.onDetach();
      if (!paramFragment.mCalled) {
        throw new u("Fragment " + paramFragment + " did not call through to super.onDetach()");
      }
      if (paramBoolean) {
        break;
      }
      if (!paramFragment.mRetaining)
      {
        if (paramFragment.mIndex < 0) {
          break;
        }
        if (a) {
          new StringBuilder("Freeing fragment index ").append(paramFragment).toString();
        }
        this.f.set(paramFragment.mIndex, null);
        if (this.h == null) {
          this.h = new ArrayList();
        }
        this.h.add(Integer.valueOf(paramFragment.mIndex));
        this.o.a(paramFragment.mIndex);
        paramFragment.initState();
        break;
      }
      paramFragment.mActivity = null;
      paramFragment.mFragmentManager = null;
      break;
    }
  }
  
  public final void a(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.g == null) {
      this.g = new ArrayList();
    }
    if (a) {
      new StringBuilder("add: ").append(paramFragment).toString();
    }
    if (paramFragment.mIndex < 0)
    {
      if ((this.h != null) && (this.h.size() > 0)) {
        break label183;
      }
      if (this.f == null) {
        this.f = new ArrayList();
      }
      paramFragment.setIndex(this.f.size());
      this.f.add(paramFragment);
    }
    for (;;)
    {
      if (a) {
        new StringBuilder("Allocated fragment index ").append(paramFragment).toString();
      }
      if (!paramFragment.mDetached)
      {
        this.g.add(paramFragment);
        paramFragment.mAdded = true;
        paramFragment.mRemoving = false;
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
          this.p = true;
        }
        if (paramBoolean) {
          b(paramFragment);
        }
      }
      return;
      label183:
      paramFragment.setIndex(((Integer)this.h.remove(-1 + this.h.size())).intValue());
      this.f.set(paramFragment.mIndex, paramFragment);
    }
  }
  
  public final void a(FragmentActivity paramFragmentActivity)
  {
    if (this.o != null) {
      throw new IllegalStateException();
    }
    this.o = paramFragmentActivity;
  }
  
  final void a(a parama)
  {
    if (this.i == null) {
      this.i = new ArrayList();
    }
    this.i.add(parama);
    p();
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i1 = 0;
    String str = paramString + "    ";
    if (this.f != null)
    {
      int i11 = this.f.size();
      if (i11 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        for (int i12 = 0; i12 < i11; i12++)
        {
          Fragment localFragment3 = (Fragment)this.f.get(i12);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i12);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment3);
          if (localFragment3 != null) {
            localFragment3.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
        }
      }
    }
    if (this.g != null)
    {
      int i9 = this.g.size();
      if (i9 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        for (int i10 = 0; i10 < i9; i10++)
        {
          Fragment localFragment2 = (Fragment)this.g.get(i10);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i10);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment2.toString());
        }
      }
    }
    if (this.j != null)
    {
      int i7 = this.j.size();
      if (i7 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (int i8 = 0; i8 < i7; i8++)
        {
          Fragment localFragment1 = (Fragment)this.j.get(i8);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i8);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment1.toString());
        }
      }
    }
    if (this.i != null)
    {
      int i5 = this.i.size();
      if (i5 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (int i6 = 0; i6 < i5; i6++)
        {
          a locala2 = (a)this.i.get(i6);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i6);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(locala2.toString());
          locala2.a(str, paramPrintWriter);
        }
      }
    }
    try
    {
      if (this.k != null)
      {
        int i3 = this.k.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          for (int i4 = 0; i4 < i3; i4++)
          {
            a locala1 = (a)this.k.get(i4);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i4);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(locala1);
          }
        }
      }
      if ((this.l != null) && (this.l.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.l.toArray()));
      }
      if (this.c != null)
      {
        int i2 = this.c.size();
        if (i2 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          while (i1 < i2)
          {
            Runnable localRunnable = (Runnable)this.c.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(localRunnable);
            i1++;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.q);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.r);
    if (this.p)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.p);
    }
    if (this.s != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.s);
    }
    if ((this.h != null) && (this.h.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.h.toArray()));
    }
  }
  
  public final boolean a()
  {
    if (this.q) {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    if (this.s != null) {
      throw new IllegalStateException("Can not perform this action inside of " + this.s);
    }
    c();
    if (this.i == null) {}
    int i1;
    do
    {
      return false;
      i1 = -1 + this.i.size();
    } while (i1 < 0);
    ((a)this.i.remove(i1)).a();
    p();
    return true;
  }
  
  public final boolean a(Menu paramMenu)
  {
    if (this.g != null)
    {
      int i1 = 0;
      bool = false;
      while (i1 < this.g.size())
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if ((localFragment != null) && (!localFragment.mHidden) && (localFragment.mHasMenu) && (localFragment.mMenuVisible))
        {
          bool = true;
          localFragment.onPrepareOptionsMenu(paramMenu);
        }
        i1++;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    ArrayList localArrayList1 = null;
    if (this.g != null)
    {
      int i2 = 0;
      boolean bool2;
      for (bool1 = false; i2 < this.g.size(); bool1 = bool2)
      {
        Fragment localFragment2 = (Fragment)this.g.get(i2);
        if ((localFragment2 != null) && (!localFragment2.mHidden) && (localFragment2.mHasMenu) && (localFragment2.mMenuVisible))
        {
          bool1 = true;
          localFragment2.onCreateOptionsMenu(paramMenu, paramMenuInflater);
          if (localArrayList1 == null) {
            localArrayList1 = new ArrayList();
          }
          localArrayList1.add(localFragment2);
        }
        bool2 = bool1;
        i2++;
      }
    }
    boolean bool1 = false;
    ArrayList localArrayList2 = this.j;
    int i1 = 0;
    if (localArrayList2 != null) {
      while (i1 < this.j.size())
      {
        Fragment localFragment1 = (Fragment)this.j.get(i1);
        if ((localArrayList1 == null) || (!localArrayList1.contains(localFragment1))) {
          localFragment1.onDestroyOptionsMenu();
        }
        i1++;
      }
    }
    this.j = localArrayList1;
    return bool1;
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.g;
    boolean bool = false;
    if (localArrayList != null) {}
    for (int i1 = 0;; i1++)
    {
      int i2 = this.g.size();
      bool = false;
      if (i1 < i2)
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if ((localFragment != null) && (!localFragment.mHidden) && (localFragment.mHasMenu) && (localFragment.mMenuVisible) && (localFragment.onOptionsItemSelected(paramMenuItem))) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  final void b()
  {
    if (this.f == null) {}
    for (;;)
    {
      return;
      for (int i1 = 0; i1 < this.f.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.f.get(i1);
        if (localFragment != null) {
          a(localFragment);
        }
      }
    }
  }
  
  public final void b(int paramInt)
  {
    try
    {
      this.k.set(paramInt, null);
      if (this.l == null) {
        this.l = new ArrayList();
      }
      if (a) {
        new StringBuilder("Freeing back stack index ").append(paramInt).toString();
      }
      this.l.add(Integer.valueOf(paramInt));
      return;
    }
    finally {}
  }
  
  final void b(Fragment paramFragment)
  {
    a(paramFragment, this.n, 0, 0, false);
  }
  
  public final void b(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      new StringBuilder("hide: ").append(paramFragment).toString();
    }
    if (!paramFragment.mHidden)
    {
      paramFragment.mHidden = true;
      if (paramFragment.mView != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, true, paramInt2);
        if (localAnimation != null) {
          paramFragment.mView.startAnimation(localAnimation);
        }
        paramFragment.mView.setVisibility(8);
      }
      if ((paramFragment.mAdded) && (paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
        this.p = true;
      }
      paramFragment.onHiddenChanged(true);
    }
  }
  
  public final void b(Menu paramMenu)
  {
    if (this.g != null) {
      for (int i1 = 0; i1 < this.g.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if ((localFragment != null) && (!localFragment.mHidden) && (localFragment.mHasMenu) && (localFragment.mMenuVisible)) {
          localFragment.onOptionsMenuClosed(paramMenu);
        }
      }
    }
  }
  
  public final boolean b(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.g;
    boolean bool = false;
    if (localArrayList != null) {}
    for (int i1 = 0;; i1++)
    {
      int i2 = this.g.size();
      bool = false;
      if (i1 < i2)
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if ((localFragment != null) && (!localFragment.mHidden) && (localFragment.mUserVisibleHint) && (localFragment.onContextItemSelected(paramMenuItem))) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  public final void c(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      new StringBuilder("show: ").append(paramFragment).toString();
    }
    if (paramFragment.mHidden)
    {
      paramFragment.mHidden = false;
      if (paramFragment.mView != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, true, paramInt2);
        if (localAnimation != null) {
          paramFragment.mView.startAnimation(localAnimation);
        }
        paramFragment.mView.setVisibility(0);
      }
      if ((paramFragment.mAdded) && (paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
        this.p = true;
      }
      paramFragment.onHiddenChanged(false);
    }
  }
  
  public final boolean c()
  {
    if (this.e) {
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    }
    if (Looper.myLooper() != this.o.a.getLooper()) {
      throw new IllegalStateException("Must be called from main thread of process");
    }
    boolean bool2;
    for (boolean bool1 = false;; bool1 = true) {
      try
      {
        if ((this.c == null) || (this.c.size() == 0))
        {
          if (!this.t) {
            return bool1;
          }
          int i1 = 0;
          bool2 = false;
          while (i1 < this.f.size())
          {
            Fragment localFragment = (Fragment)this.f.get(i1);
            if ((localFragment != null) && (localFragment.mLoaderManager != null)) {
              bool2 |= localFragment.mLoaderManager.a();
            }
            i1++;
          }
        }
        int i2 = this.c.size();
        if ((this.d == null) || (this.d.length < i2)) {
          this.d = new Runnable[i2];
        }
        this.c.toArray(this.d);
        this.c.clear();
        this.o.a.removeCallbacks(this.w);
        this.e = true;
        for (int i3 = 0; i3 < i2; i3++)
        {
          this.d[i3].run();
          this.d[i3] = null;
        }
        this.e = false;
      }
      finally {}
    }
    if (!bool2)
    {
      this.t = false;
      b();
    }
    return bool1;
  }
  
  final ArrayList<Fragment> d()
  {
    ArrayList localArrayList1 = this.f;
    ArrayList localArrayList2 = null;
    if (localArrayList1 != null)
    {
      int i1 = 0;
      if (i1 < this.f.size())
      {
        Fragment localFragment = (Fragment)this.f.get(i1);
        if ((localFragment != null) && (localFragment.mRetainInstance))
        {
          if (localArrayList2 == null) {
            localArrayList2 = new ArrayList();
          }
          localArrayList2.add(localFragment);
          localFragment.mRetaining = true;
          if (localFragment.mTarget == null) {
            break label131;
          }
        }
        label131:
        for (int i2 = localFragment.mTarget.mIndex;; i2 = -1)
        {
          localFragment.mTargetIndex = i2;
          if (a) {
            new StringBuilder("retainNonConfig: keeping retained ").append(localFragment).toString();
          }
          i1++;
          break;
        }
      }
    }
    return localArrayList2;
  }
  
  public final void d(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      new StringBuilder("detach: ").append(paramFragment).toString();
    }
    if (!paramFragment.mDetached)
    {
      paramFragment.mDetached = true;
      if (paramFragment.mAdded)
      {
        if (this.g != null) {
          this.g.remove(paramFragment);
        }
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
          this.p = true;
        }
        paramFragment.mAdded = false;
        a(paramFragment, 1, paramInt1, paramInt2, false);
      }
    }
  }
  
  final Parcelable e()
  {
    c();
    if (b) {
      this.q = true;
    }
    if ((this.f == null) || (this.f.size() <= 0)) {
      return null;
    }
    int i1 = this.f.size();
    FragmentState[] arrayOfFragmentState = new FragmentState[i1];
    int i2 = 0;
    int i3 = 0;
    Fragment localFragment1;
    FragmentState localFragmentState;
    Bundle localBundle1;
    if (i2 < i1)
    {
      localFragment1 = (Fragment)this.f.get(i2);
      if (localFragment1 == null) {
        break label967;
      }
      if (localFragment1.mIndex < 0)
      {
        String str3 = "Failure saving state: active " + localFragment1 + " has cleared index: " + localFragment1.mIndex;
        a("  ", null, new PrintWriter(new b("FragmentManager")), new String[0]);
        throw new IllegalStateException(str3);
      }
      localFragmentState = new FragmentState(localFragment1);
      arrayOfFragmentState[i2] = localFragmentState;
      if ((localFragment1.mState > 0) && (localFragmentState.j == null))
      {
        if (this.u == null) {
          this.u = new Bundle();
        }
        localFragment1.onSaveInstanceState(this.u);
        if (this.u.isEmpty()) {
          break label961;
        }
        localBundle1 = this.u;
        this.u = null;
        label241:
        if (localFragment1.mView != null) {
          c(localFragment1);
        }
        if (localFragment1.mSavedViewState != null)
        {
          if (localBundle1 == null) {
            localBundle1 = new Bundle();
          }
          localBundle1.putSparseParcelableArray("android:view_state", localFragment1.mSavedViewState);
        }
        if (!localFragment1.mUserVisibleHint)
        {
          if (localBundle1 == null) {
            localBundle1 = new Bundle();
          }
          localBundle1.putBoolean("android:user_visible_hint", localFragment1.mUserVisibleHint);
        }
        localFragmentState.j = localBundle1;
        if (localFragment1.mTarget != null)
        {
          if (localFragment1.mTarget.mIndex < 0)
          {
            String str2 = "Failure saving state: " + localFragment1 + " has target not in fragment manager: " + localFragment1.mTarget;
            a("  ", null, new PrintWriter(new b("FragmentManager")), new String[0]);
            throw new IllegalStateException(str2);
          }
          if (localFragmentState.j == null) {
            localFragmentState.j = new Bundle();
          }
          Bundle localBundle2 = localFragmentState.j;
          Fragment localFragment2 = localFragment1.mTarget;
          if (localFragment2.mIndex < 0) {
            throw new IllegalStateException("Fragment " + localFragment2 + " is not currently in the FragmentManager");
          }
          localBundle2.putInt("android:target_state", localFragment2.mIndex);
          if (localFragment1.mTargetRequestCode != 0) {
            localFragmentState.j.putInt("android:target_req_state", localFragment1.mTargetRequestCode);
          }
        }
        label535:
        if (a) {
          new StringBuilder("Saved state of ").append(localFragment1).append(": ").append(localFragmentState.j).toString();
        }
      }
    }
    label961:
    label967:
    for (int i8 = 1;; i8 = i3)
    {
      i2++;
      i3 = i8;
      break;
      localFragmentState.j = localFragment1.mSavedFragmentState;
      break label535;
      if (i3 == 0) {
        return null;
      }
      if (this.g != null)
      {
        int i6 = this.g.size();
        if (i6 > 0)
        {
          arrayOfInt = new int[i6];
          for (int i7 = 0; i7 < i6; i7++)
          {
            arrayOfInt[i7] = ((Fragment)this.g.get(i7)).mIndex;
            if (arrayOfInt[i7] < 0)
            {
              String str1 = "Failure saving state: active " + this.g.get(i7) + " has cleared index: " + arrayOfInt[i7];
              a("  ", null, new PrintWriter(new b("FragmentManager")), new String[0]);
              throw new IllegalStateException(str1);
            }
            if (a) {
              new StringBuilder("saveAllState: adding fragment #").append(i7).append(": ").append(this.g.get(i7)).toString();
            }
          }
        }
      }
      int[] arrayOfInt = null;
      ArrayList localArrayList = this.i;
      BackStackState[] arrayOfBackStackState = null;
      if (localArrayList != null)
      {
        int i4 = this.i.size();
        arrayOfBackStackState = null;
        if (i4 > 0)
        {
          arrayOfBackStackState = new BackStackState[i4];
          for (int i5 = 0; i5 < i4; i5++)
          {
            arrayOfBackStackState[i5] = new BackStackState((a)this.i.get(i5));
            if (a) {
              new StringBuilder("saveAllState: adding back stack #").append(i5).append(": ").append(this.i.get(i5)).toString();
            }
          }
        }
      }
      FragmentManagerState localFragmentManagerState = new FragmentManagerState();
      localFragmentManagerState.a = arrayOfFragmentState;
      localFragmentManagerState.b = arrayOfInt;
      localFragmentManagerState.c = arrayOfBackStackState;
      return localFragmentManagerState;
      localBundle1 = null;
      break label241;
    }
  }
  
  public final void e(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      new StringBuilder("attach: ").append(paramFragment).toString();
    }
    if (paramFragment.mDetached)
    {
      paramFragment.mDetached = false;
      if (!paramFragment.mAdded)
      {
        if (this.g == null) {
          this.g = new ArrayList();
        }
        this.g.add(paramFragment);
        paramFragment.mAdded = true;
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
          this.p = true;
        }
        a(paramFragment, this.n, paramInt1, paramInt2, false);
      }
    }
  }
  
  public final void f()
  {
    this.q = false;
  }
  
  public final void g()
  {
    this.q = false;
    d(1);
  }
  
  public final void h()
  {
    this.q = false;
    d(2);
  }
  
  public final void i()
  {
    this.q = false;
    d(4);
  }
  
  public final void j()
  {
    this.q = false;
    d(5);
  }
  
  public final void k()
  {
    d(4);
  }
  
  public final void l()
  {
    this.q = true;
    d(3);
  }
  
  public final void m()
  {
    d(2);
  }
  
  public final void n()
  {
    this.r = true;
    c();
    d(0);
    this.o = null;
  }
  
  public final void o()
  {
    if (this.g != null) {
      for (int i1 = 0; i1 < this.g.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if (localFragment != null) {
          localFragment.onLowMemory();
        }
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    android.support.v4.c.a.a(this.o, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.j
 * JD-Core Version:    0.7.0.1
 */