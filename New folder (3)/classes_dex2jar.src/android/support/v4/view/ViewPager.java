package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObservable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class ViewPager
  extends ViewGroup
{
  private static final int[] a = { 16842931 };
  private static final Comparator<x> b = new u();
  private static final Interpolator c = new v();
  private boolean A;
  private int B;
  private int C;
  private int D;
  private float E;
  private float F;
  private float G;
  private int H;
  private VelocityTracker I;
  private int J;
  private int K;
  private int L;
  private int M;
  private boolean N;
  private android.support.v4.d.a O;
  private android.support.v4.d.a P;
  private boolean Q;
  private boolean R;
  private boolean S;
  private int T;
  private aa U;
  private aa V;
  private z W;
  private int Z;
  private final ArrayList<x> d;
  private final x e;
  private final Rect f;
  private i g;
  private int h;
  private int i;
  private Parcelable j;
  private ClassLoader k;
  private Scroller l;
  private ab m;
  private int n;
  private Drawable o;
  private int p;
  private int q;
  private float r;
  private float s;
  private int t;
  private int u;
  private boolean v;
  private boolean w;
  private boolean x;
  private int y;
  private boolean z;
  
  private Rect a(Rect paramRect, View paramView)
  {
    if (paramRect == null) {}
    for (Rect localRect = new Rect();; localRect = paramRect)
    {
      if (paramView == null)
      {
        localRect.set(0, 0, 0, 0);
        return localRect;
      }
      localRect.left = paramView.getLeft();
      localRect.right = paramView.getRight();
      localRect.top = paramView.getTop();
      localRect.bottom = paramView.getBottom();
      ViewGroup localViewGroup;
      for (ViewParent localViewParent = paramView.getParent(); ((localViewParent instanceof ViewGroup)) && (localViewParent != this); localViewParent = localViewGroup.getParent())
      {
        localViewGroup = (ViewGroup)localViewParent;
        localRect.left += localViewGroup.getLeft();
        localRect.right += localViewGroup.getRight();
        localRect.top += localViewGroup.getTop();
        localRect.bottom += localViewGroup.getBottom();
      }
      return localRect;
    }
  }
  
  private x a(int paramInt)
  {
    new x().b = paramInt;
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > 0) && (!this.d.isEmpty()))
    {
      int i2 = paramInt1 + paramInt3;
      int i3 = paramInt2 + paramInt4;
      int i4 = (int)(getScrollX() / i3 * i2);
      scrollTo(i4, getScrollY());
      if (!this.l.isFinished())
      {
        int i5 = this.l.getDuration() - this.l.timePassed();
        x localx2 = c(this.h);
        this.l.startScroll(i4, 0, (int)(localx2.e * paramInt1), 0, i5);
      }
      return;
    }
    x localx1 = c(this.h);
    if (localx1 != null) {}
    for (float f1 = Math.min(localx1.e, this.s);; f1 = 0.0F)
    {
      int i1 = (int)(f1 * paramInt1);
      if (i1 == getScrollX()) {
        break;
      }
      g();
      scrollTo(i1, getScrollY());
      return;
    }
  }
  
  private void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  private void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    if ((this.g == null) || (this.g.a() <= 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if ((!paramBoolean2) && (this.h == paramInt1) && (this.d.size() != 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    for (;;)
    {
      int i1 = this.y;
      if ((paramInt1 <= i1 + this.h) && (paramInt1 >= this.h - i1)) {
        break;
      }
      for (int i2 = 0; i2 < this.d.size(); i2++) {
        ((x)this.d.get(i2)).c = true;
      }
      if (paramInt1 >= this.g.a()) {
        paramInt1 = -1 + this.g.a();
      }
    }
    int i3;
    int i4;
    if (this.h != paramInt1)
    {
      i3 = 1;
      b(paramInt1);
      x localx = c(paramInt1);
      i4 = 0;
      if (localx != null) {
        i4 = (int)(getWidth() * Math.max(this.r, Math.min(localx.e, this.s)));
      }
      if (!paramBoolean1) {
        break label493;
      }
      if (getChildCount() != 0) {
        break label262;
      }
      setScrollingCacheEnabled(false);
    }
    label221:
    int i5;
    label262:
    int i6;
    int i7;
    int i8;
    int i9;
    float f2;
    int i11;
    for (;;)
    {
      if (((i3 == 0) || (this.U == null)) || ((i3 != 0) && (this.V != null)))
      {
        return;
        i3 = 0;
        break;
        i5 = getScrollX();
        i6 = getScrollY();
        i7 = i4 - i5;
        i8 = 0 - i6;
        if ((i7 == 0) && (i8 == 0))
        {
          g();
          c();
          setScrollState(0);
        }
        else
        {
          setScrollingCacheEnabled(true);
          setScrollState(2);
          i9 = getWidth();
          int i10 = i9 / 2;
          float f1 = Math.min(1.0F, 1.0F * Math.abs(i7) / i9);
          f2 = i10 + i10 * (float)Math.sin((float)(0.47123891676382D * (f1 - 0.5F)));
          i11 = Math.abs(paramInt2);
          if (i11 <= 0) {
            break label445;
          }
        }
      }
    }
    label445:
    float f4;
    for (int i12 = 4 * Math.round(1000.0F * Math.abs(f2 / i11));; i12 = (int)(100.0F * (1.0F + Math.abs(i7) / (f4 + this.n))))
    {
      int i13 = Math.min(i12, 600);
      this.l.startScroll(i5, i6, i7, i8, i13);
      n.b(this);
      break label221;
      break;
      float f3 = i9;
      f4 = f3 * 1.0F;
    }
    label493:
    if (((i3 == 0) || (this.U == null)) || ((i3 != 0) && (this.V != null))) {}
    g();
    scrollTo(i4, 0);
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = e.a(paramMotionEvent);
    if (e.b(paramMotionEvent, i1) == this.H) {
      if (i1 != 0) {
        break label56;
      }
    }
    label56:
    for (int i2 = 1;; i2 = 0)
    {
      this.F = e.c(paramMotionEvent, i2);
      this.H = e.b(paramMotionEvent, i2);
      if (this.I != null) {
        this.I.clear();
      }
      return;
    }
  }
  
  private boolean a(float paramFloat)
  {
    int i1 = 1;
    float f1 = this.F - paramFloat;
    this.F = paramFloat;
    float f2 = f1 + getScrollX();
    int i2 = getWidth();
    float f3 = i2 * this.r;
    float f4 = i2 * this.s;
    x localx1 = (x)this.d.get(0);
    x localx2 = (x)this.d.get(-1 + this.d.size());
    if (localx1.b != 0) {
      f3 = localx1.e * i2;
    }
    for (int i3 = 0;; i3 = i1)
    {
      float f5;
      if (localx2.b != -1 + this.g.a())
      {
        f5 = localx2.e * i2;
        i1 = 0;
      }
      for (;;)
      {
        boolean bool;
        if (f2 < f3)
        {
          bool = false;
          if (i3 != 0)
          {
            float f6 = f3 - f2;
            bool = this.O.a(Math.abs(f6) / i2);
          }
        }
        for (;;)
        {
          this.F += f3 - (int)f3;
          scrollTo((int)f3, getScrollY());
          e();
          return bool;
          if (f2 > f5)
          {
            bool = false;
            if (i1 != 0)
            {
              float f7 = f2 - f5;
              bool = this.P.a(Math.abs(f7) / i2);
            }
            f3 = f5;
          }
          else
          {
            f3 = f2;
            bool = false;
          }
        }
        f5 = f4;
      }
    }
  }
  
  private boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i3;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i1 = paramView.getScrollX();
      int i2 = paramView.getScrollY();
      i3 = -1 + localViewGroup.getChildCount();
      if (i3 >= 0)
      {
        localView = localViewGroup.getChildAt(i3);
        if ((paramInt2 + i1 < localView.getLeft()) || (paramInt2 + i1 >= localView.getRight()) || (paramInt3 + i2 < localView.getTop()) || (paramInt3 + i2 >= localView.getBottom()) || (!a(localView, true, paramInt1, paramInt2 + i1 - localView.getLeft(), paramInt3 + i2 - localView.getTop()))) {}
      }
    }
    while ((paramBoolean) && (n.a(paramView, -paramInt1)))
    {
      View localView;
      return true;
      i3--;
      break;
    }
    return false;
  }
  
  private void b(int paramInt)
  {
    x localx16;
    if (this.h != paramInt)
    {
      localx16 = c(this.h);
      this.h = paramInt;
    }
    for (x localx1 = localx16;; localx1 = null)
    {
      if (this.g == null) {
        label33:
        return;
      }
      int i2;
      int i3;
      int i4;
      int i5;
      x localx2;
      if ((!this.x) && (getWindowToken() != null))
      {
        int i1 = this.y;
        i2 = Math.max(0, this.h - i1);
        i3 = this.g.a();
        i4 = Math.min(i3 - 1, i1 + this.h);
        i5 = 0;
        if (i5 >= this.d.size()) {
          break label1766;
        }
        localx2 = (x)this.d.get(i5);
        if (localx2.b >= this.h) {
          if (localx2.b != this.h) {
            break label1766;
          }
        }
      }
      for (;;)
      {
        if ((localx2 == null) && (i3 > 0)) {}
        for (x localx3 = a(this.h);; localx3 = localx2)
        {
          label200:
          int i12;
          label232:
          float f3;
          label342:
          label348:
          int i14;
          label449:
          Object localObject1;
          label495:
          int i30;
          label503:
          x localx15;
          label597:
          Object localObject2;
          float f12;
          if (localx3 != null)
          {
            int i9 = i5 - 1;
            x localx7;
            float f2;
            int i11;
            int i13;
            if (i9 >= 0)
            {
              localx7 = (x)this.d.get(i9);
              float f1 = 2.0F - localx3.d;
              int i10 = -1 + this.h;
              f2 = 0.0F;
              i11 = i10;
              i12 = i5;
              i13 = i9;
              if (i11 < 0) {
                break label449;
              }
              if ((f2 < f1) || (i11 >= i2)) {
                break label348;
              }
              if (localx7 == null) {
                break label449;
              }
              if ((i11 == localx7.b) && (!localx7.c))
              {
                this.d.remove(i13);
                i.b();
                i13--;
                i12--;
                if (i13 < 0) {
                  break label342;
                }
                localx7 = (x)this.d.get(i13);
              }
            }
            for (;;)
            {
              i11--;
              break label232;
              i5++;
              break;
              localx7 = null;
              break label200;
              localx7 = null;
              continue;
              if ((localx7 != null) && (i11 == localx7.b))
              {
                f2 += localx7.d;
                i13--;
                if (i13 >= 0) {
                  localx7 = (x)this.d.get(i13);
                } else {
                  localx7 = null;
                }
              }
              else
              {
                f2 += a(i11).d;
                i12++;
                if (i13 >= 0) {
                  localx7 = (x)this.d.get(i13);
                } else {
                  localx7 = null;
                }
              }
            }
            f3 = localx3.d;
            i14 = i12 + 1;
            if (f3 < 2.0F) {
              if (i14 < this.d.size())
              {
                localObject1 = (x)this.d.get(i14);
                i30 = 1 + this.h;
                if (i30 >= i3) {
                  break label774;
                }
                if ((f3 < 2.0F) || (i30 <= i4)) {
                  break label639;
                }
                if (localObject1 == null) {
                  break label774;
                }
                if ((i30 != ((x)localObject1).b) || (((x)localObject1).c)) {
                  break label1744;
                }
                this.d.remove(i14);
                i.b();
                if (i14 >= this.d.size()) {
                  break label633;
                }
                localx15 = (x)this.d.get(i14);
                float f16 = f3;
                localObject2 = localx15;
                f12 = f16;
              }
            }
          }
          for (;;)
          {
            i30++;
            float f13 = f12;
            localObject1 = localObject2;
            f3 = f13;
            break label503;
            localObject1 = null;
            break label495;
            label633:
            localx15 = null;
            break label597;
            label639:
            if ((localObject1 != null) && (i30 == ((x)localObject1).b))
            {
              float f14 = f3 + ((x)localObject1).d;
              i14++;
              if (i14 < this.d.size()) {}
              for (x localx14 = (x)this.d.get(i14);; localx14 = null)
              {
                localObject2 = localx14;
                f12 = f14;
                break;
              }
            }
            x localx12 = a(i30);
            i14++;
            float f11 = f3 + localx12.d;
            if (i14 < this.d.size()) {}
            for (x localx13 = (x)this.d.get(i14);; localx13 = null)
            {
              localObject2 = localx13;
              f12 = f11;
              break;
            }
            label774:
            int i15 = this.g.a();
            int i16 = getWidth();
            float f4;
            int i24;
            float f10;
            int i28;
            int i29;
            if (i16 > 0)
            {
              f4 = this.n / i16;
              if (localx1 == null) {
                break label1147;
              }
              i24 = localx1.b;
              if (i24 < localx3.b)
              {
                f10 = f4 + (localx1.e + localx1.d);
                i28 = i24 + 1;
                i29 = 0;
              }
            }
            else
            {
              for (;;)
              {
                if ((i28 > localx3.b) || (i29 >= this.d.size())) {
                  break label1147;
                }
                x localx11 = (x)this.d.get(i29);
                for (;;)
                {
                  if ((i28 > localx11.b) && (i29 < -1 + this.d.size()))
                  {
                    i29++;
                    localx11 = (x)this.d.get(i29);
                    continue;
                    f4 = 0.0F;
                    break;
                  }
                }
                while (i28 < localx11.b)
                {
                  f10 += 1.0F + f4;
                  i28++;
                }
                localx11.e = f10;
                f10 += f4 + localx11.d;
                i28++;
              }
            }
            if (i24 > localx3.b)
            {
              int i25 = -1 + this.d.size();
              float f9 = localx1.e;
              int i26 = i24 - 1;
              int i27 = i25;
              while ((i26 >= localx3.b) && (i27 >= 0))
              {
                for (x localx10 = (x)this.d.get(i27); (i26 < localx10.b) && (i27 > 0); localx10 = (x)this.d.get(i27)) {
                  i27--;
                }
                while (i26 > localx10.b)
                {
                  f9 -= 1.0F + f4;
                  i26--;
                }
                f9 -= f4 + localx10.d;
                localx10.e = f9;
                i26--;
              }
            }
            label1147:
            int i17 = this.d.size();
            float f5 = localx3.e;
            int i18 = -1 + localx3.b;
            float f6;
            float f7;
            if (localx3.b == 0)
            {
              f6 = localx3.e;
              this.r = f6;
              if (localx3.b != i15 - 1) {
                break label1289;
              }
              f7 = localx3.e + localx3.d - 1.0F;
              label1220:
              this.s = f7;
            }
            label1289:
            int i23;
            for (int i19 = i12 - 1;; i19 = i23)
            {
              if (i19 < 0) {
                break label1347;
              }
              x localx9 = (x)this.d.get(i19);
              for (;;)
              {
                if (i18 > localx9.b)
                {
                  i18--;
                  f5 -= 1.0F + f4;
                  continue;
                  f6 = -3.402824E+038F;
                  break;
                  f7 = 3.4028235E+38F;
                  break label1220;
                }
              }
              f5 -= f4 + localx9.d;
              localx9.e = f5;
              if (localx9.b == 0) {
                this.r = f5;
              }
              i23 = i19 - 1;
              i18--;
            }
            label1347:
            float f8 = f4 + (localx3.e + localx3.d);
            int i20 = 1 + localx3.b;
            int i22;
            for (int i21 = i12 + 1; i21 < i17; i21 = i22)
            {
              x localx8 = (x)this.d.get(i21);
              while (i20 < localx8.b)
              {
                i20++;
                f8 += 1.0F + f4;
              }
              if (localx8.b == i15 - 1) {
                this.s = (f8 + localx8.d - 1.0F);
              }
              localx8.e = f8;
              f8 += f4 + localx8.d;
              i22 = i21 + 1;
              i20++;
            }
            this.R = false;
            if (localx3 != null) {}
            int i6 = getChildCount();
            for (int i7 = 0; i7 < i6; i7++)
            {
              y localy = (y)getChildAt(i7).getLayoutParams();
              if ((!localy.a) && (localy.c == 0.0F))
              {
                x localx6 = d();
                if (localx6 != null) {
                  localy.c = localx6.d;
                }
              }
            }
            if (!hasFocus()) {
              break;
            }
            View localView1 = findFocus();
            label1615:
            ViewParent localViewParent;
            x localx4;
            if (localView1 != null)
            {
              localViewParent = localView1.getParent();
              if (localViewParent != this) {
                if ((localViewParent == null) || (!(localViewParent instanceof View))) {
                  localx4 = null;
                }
              }
            }
            for (;;)
            {
              if ((localx4 != null) && (localx4.b == this.h)) {
                break label1742;
              }
              for (int i8 = 0;; i8++)
              {
                if (i8 >= getChildCount()) {
                  break label1717;
                }
                View localView2 = getChildAt(i8);
                x localx5 = d();
                if ((localx5 != null) && (localx5.b == this.h) && (localView2.requestFocus(2))) {
                  break;
                }
              }
              label1717:
              break label33;
              localView1 = (View)localViewParent;
              break label1615;
              localx4 = d();
              continue;
              localx4 = null;
            }
            label1742:
            break label33;
            break label33;
            label1744:
            float f15 = f3;
            localObject2 = localObject1;
            f12 = f15;
          }
        }
        label1766:
        localx2 = null;
      }
    }
  }
  
  private x c(int paramInt)
  {
    for (int i1 = 0; i1 < this.d.size(); i1++)
    {
      x localx = (x)this.d.get(i1);
      if (localx.b == paramInt) {
        return localx;
      }
    }
    return null;
  }
  
  private void c()
  {
    b(this.h);
  }
  
  private x d()
  {
    for (int i1 = 0; i1 < this.d.size(); i1++)
    {
      x localx = (x)this.d.get(i1);
      i locali = this.g;
      if (locali.c()) {
        return localx;
      }
    }
    return null;
  }
  
  private boolean d(int paramInt)
  {
    View localView1 = findFocus();
    if (localView1 == this) {
      localView1 = null;
    }
    View localView2 = FocusFinder.getInstance().findNextFocus(this, localView1, paramInt);
    boolean bool1;
    if ((localView2 != null) && (localView2 != localView1)) {
      if (paramInt == 17)
      {
        int i3 = a(this.f, localView2).left;
        int i4 = a(this.f, localView1).left;
        if ((localView1 != null) && (i3 >= i4)) {
          bool1 = j();
        }
      }
    }
    for (;;)
    {
      boolean bool2 = bool1;
      do
      {
        do
        {
          if (bool2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
          }
          return bool2;
          bool1 = localView2.requestFocus();
          break;
          bool2 = false;
        } while (paramInt != 66);
        int i1 = a(this.f, localView2).left;
        int i2 = a(this.f, localView1).left;
        if ((localView1 != null) && (i1 <= i2)) {
          break label202;
        }
        bool1 = localView2.requestFocus();
        break;
        if ((paramInt == 17) || (paramInt == 1))
        {
          bool1 = j();
          break;
        }
        if (paramInt == 66) {
          break label202;
        }
        bool2 = false;
      } while (paramInt != 2);
      label202:
      if ((this.g != null) && (this.h < -1 + this.g.a()))
      {
        setCurrentItem$2563266(1 + this.h);
        bool1 = true;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  private boolean e()
  {
    boolean bool1;
    if (this.d.size() == 0)
    {
      this.S = false;
      f();
      boolean bool2 = this.S;
      bool1 = false;
      if (!bool2) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
    }
    else
    {
      x localx = h();
      getWidth();
      this.S = false;
      f();
      if (!this.S) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
      bool1 = true;
    }
    return bool1;
  }
  
  private void f()
  {
    int i2;
    int i3;
    int i4;
    int i6;
    View localView;
    int i11;
    int i8;
    int i9;
    if (this.T > 0)
    {
      int i1 = getScrollX();
      i2 = getPaddingLeft();
      i3 = getPaddingRight();
      i4 = getWidth();
      int i5 = getChildCount();
      i6 = 0;
      if (i6 < i5)
      {
        localView = getChildAt(i6);
        y localy = (y)localView.getLayoutParams();
        if (!localy.a) {
          break label299;
        }
        switch (0x7 & localy.b)
        {
        case 2: 
        case 4: 
        default: 
          i11 = i2;
          int i17 = i3;
          i8 = i2;
          i9 = i17;
          label132:
          int i13 = i11 + i1 - localView.getLeft();
          if (i13 != 0) {
            localView.offsetLeftAndRight(i13);
          }
          break;
        }
      }
    }
    for (;;)
    {
      i6++;
      int i10 = i9;
      i2 = i8;
      i3 = i10;
      break;
      int i15 = i2 + localView.getWidth();
      int i16 = i2;
      i9 = i3;
      i8 = i15;
      i11 = i16;
      break label132;
      i11 = Math.max((i4 - localView.getMeasuredWidth()) / 2, i2);
      int i14 = i3;
      i8 = i2;
      i9 = i14;
      break label132;
      i11 = i4 - i3 - localView.getMeasuredWidth();
      int i12 = i3 + localView.getMeasuredWidth();
      i8 = i2;
      i9 = i12;
      break label132;
      if ((this.U == null) || (this.V != null)) {}
      this.S = true;
      return;
      label299:
      int i7 = i3;
      i8 = i2;
      i9 = i7;
    }
  }
  
  private void g()
  {
    if (this.Z == 2) {}
    int i3;
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        setScrollingCacheEnabled(false);
        this.l.abortAnimation();
        int i4 = getScrollX();
        int i5 = getScrollY();
        int i6 = this.l.getCurrX();
        int i7 = this.l.getCurrY();
        if ((i4 != i6) || (i5 != i7)) {
          scrollTo(i6, i7);
        }
        setScrollState(0);
      }
      this.x = false;
      int i2 = 0;
      i3 = i1;
      while (i2 < this.d.size())
      {
        x localx = (x)this.d.get(i2);
        if (localx.c)
        {
          localx.c = false;
          i3 = 1;
        }
        i2++;
      }
    }
    if (i3 != 0) {
      c();
    }
  }
  
  private x h()
  {
    int i1 = getWidth();
    float f1;
    float f2;
    label31:
    float f3;
    float f4;
    int i2;
    int i3;
    int i4;
    Object localObject;
    label49:
    x localx1;
    x localx3;
    int i5;
    if (i1 > 0)
    {
      f1 = getScrollX() / i1;
      if (i1 <= 0) {
        break label210;
      }
      f2 = this.n / i1;
      f3 = 0.0F;
      f4 = 0.0F;
      i2 = -1;
      i3 = 0;
      i4 = 1;
      localObject = null;
      if (i3 < this.d.size())
      {
        localx1 = (x)this.d.get(i3);
        if ((i4 != 0) || (localx1.b == i2 + 1)) {
          break label261;
        }
        localx3 = this.e;
        localx3.e = (f2 + (f3 + f4));
        localx3.b = (i2 + 1);
        localx3.d = 1.0F;
        i5 = i3 - 1;
      }
    }
    for (x localx2 = localx3;; localx2 = localx1)
    {
      float f5 = localx2.e;
      float f6 = f2 + (f5 + localx2.d);
      if ((i4 != 0) || (f1 >= f5))
      {
        if ((f1 < f6) || (i5 == -1 + this.d.size())) {
          localObject = localx2;
        }
      }
      else
      {
        return localObject;
        f1 = 0.0F;
        break;
        label210:
        f2 = 0.0F;
        break label31;
      }
      int i6 = localx2.b;
      float f7 = localx2.d;
      int i7 = i5 + 1;
      f4 = f5;
      i2 = i6;
      f3 = f7;
      localObject = localx2;
      i3 = i7;
      i4 = 0;
      break label49;
      label261:
      i5 = i3;
    }
  }
  
  private void i()
  {
    this.z = false;
    this.A = false;
    if (this.I != null)
    {
      this.I.recycle();
      this.I = null;
    }
  }
  
  private boolean j()
  {
    if (this.h > 0)
    {
      setCurrentItem$2563266(-1 + this.h);
      return true;
    }
    return false;
  }
  
  private void setCurrentItem$2563266(int paramInt)
  {
    this.x = false;
    a(paramInt, true, false);
  }
  
  private void setScrollState(int paramInt)
  {
    if (this.Z == paramInt) {}
    do
    {
      return;
      this.Z = paramInt;
    } while (this.U == null);
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.w != paramBoolean) {
      this.w = paramBoolean;
    }
  }
  
  final void a()
  {
    if ((this.d.size() < 1 + 2 * this.y) && (this.d.size() < this.g.a())) {}
    int i2;
    for (int i1 = 1;; i1 = 0)
    {
      i2 = this.h;
      x localx;
      for (int i3 = 0; i3 < this.d.size(); i3++) {
        localx = (x)this.d.get(i3);
      }
    }
    Collections.sort(this.d, b);
    if (i1 != 0)
    {
      int i4 = getChildCount();
      for (int i5 = 0; i5 < i4; i5++)
      {
        y localy = (y)getChildAt(i5).getLayoutParams();
        if (!localy.a) {
          localy.c = 0.0F;
        }
      }
      a(i2, false, true);
      requestLayout();
    }
  }
  
  public final void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayList.size();
    int i2 = getDescendantFocusability();
    if (i2 != 393216) {
      for (int i3 = 0; i3 < getChildCount(); i3++)
      {
        View localView = getChildAt(i3);
        if (localView.getVisibility() == 0)
        {
          x localx = d();
          if ((localx != null) && (localx.b == this.h)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
      }
    }
    if (((i2 == 262144) && (i1 != paramArrayList.size())) || (!isFocusable())) {}
    while ((((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) || (paramArrayList == null)) {
      return;
    }
    paramArrayList.add(this);
  }
  
  public final void addTouchables(ArrayList<View> paramArrayList)
  {
    for (int i1 = 0; i1 < getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 0)
      {
        x localx = d();
        if ((localx != null) && (localx.b == this.h)) {
          localView.addTouchables(paramArrayList);
        }
      }
    }
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams)) {}
    for (ViewGroup.LayoutParams localLayoutParams = generateLayoutParams(paramLayoutParams);; localLayoutParams = paramLayoutParams)
    {
      y localy = (y)localLayoutParams;
      localy.a |= paramView instanceof w;
      if (this.v)
      {
        if ((localy != null) && (localy.a)) {
          throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        localy.d = true;
        addViewInLayout(paramView, paramInt, localLayoutParams);
        return;
      }
      super.addView(paramView, paramInt, localLayoutParams);
      return;
    }
  }
  
  protected final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof y)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public final void computeScroll()
  {
    if ((!this.l.isFinished()) && (this.l.computeScrollOffset()))
    {
      int i1 = getScrollX();
      int i2 = getScrollY();
      int i3 = this.l.getCurrX();
      int i4 = this.l.getCurrY();
      if ((i1 != i3) || (i2 != i4))
      {
        scrollTo(i3, i4);
        if (!e())
        {
          this.l.abortAnimation();
          scrollTo(0, i4);
        }
      }
      n.b(this);
      return;
    }
    g();
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool2;
    if (!super.dispatchKeyEvent(paramKeyEvent))
    {
      if (paramKeyEvent.getAction() == 0) {}
      switch (paramKeyEvent.getKeyCode())
      {
      default: 
        bool2 = false;
      }
    }
    for (;;)
    {
      boolean bool1 = false;
      if (bool2) {
        bool1 = true;
      }
      return bool1;
      bool2 = d(17);
      continue;
      bool2 = d(66);
      continue;
      if (Build.VERSION.SDK_INT < 11) {
        break;
      }
      if (a.b(paramKeyEvent))
      {
        bool2 = d(2);
      }
      else
      {
        if (!a.a(paramKeyEvent)) {
          break;
        }
        bool2 = d(1);
      }
    }
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    int i1 = getChildCount();
    for (int i2 = 0;; i2++)
    {
      boolean bool = false;
      if (i2 < i1)
      {
        View localView = getChildAt(i2);
        if (localView.getVisibility() == 0)
        {
          x localx = d();
          if ((localx != null) && (localx.b == this.h) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))) {
            bool = true;
          }
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i1 = n.a(this);
    boolean bool2;
    if ((i1 == 0) || ((i1 == 1) && (this.g != null) && (this.g.a() > 1)))
    {
      boolean bool1 = this.O.a();
      bool2 = false;
      if (!bool1)
      {
        int i5 = paramCanvas.save();
        int i6 = getHeight() - getPaddingTop() - getPaddingBottom();
        int i7 = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i6 + getPaddingTop(), this.r * i7);
        this.O.a(i6, i7);
        bool2 = false | this.O.a(paramCanvas);
        paramCanvas.restoreToCount(i5);
      }
      if (!this.P.a())
      {
        int i2 = paramCanvas.save();
        int i3 = getWidth();
        int i4 = getHeight() - getPaddingTop() - getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(1.0F + this.s) * i3);
        this.P.a(i4, i3);
        bool2 |= this.P.a(paramCanvas);
        paramCanvas.restoreToCount(i2);
      }
    }
    for (;;)
    {
      if (bool2) {
        n.b(this);
      }
      return;
      this.O.b();
      this.P.b();
      bool2 = false;
    }
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.o;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  protected final ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new y();
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new y(getContext(), paramAttributeSet);
  }
  
  protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }
  
  public final i getAdapter()
  {
    return this.g;
  }
  
  public final int getCurrentItem()
  {
    return this.h;
  }
  
  public final int getOffscreenPageLimit()
  {
    return this.y;
  }
  
  public final int getPageMargin()
  {
    return this.n;
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.Q = true;
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.n > 0) && (this.o != null) && (this.d.size() > 0) && (this.g != null))
    {
      int i1 = getScrollX();
      int i2 = getWidth();
      float f1 = this.n / i2;
      x localx = (x)this.d.get(0);
      float f2 = localx.e;
      int i3 = this.d.size();
      int i4 = localx.b;
      int i5 = ((x)this.d.get(i3 - 1)).b;
      int i6 = 0;
      int i7 = i4;
      if (i7 < i5)
      {
        while ((i7 > localx.b) && (i6 < i3))
        {
          ArrayList localArrayList = this.d;
          i6++;
          localx = (x)localArrayList.get(i6);
        }
        float f3;
        if (i7 == localx.b) {
          f3 = (localx.e + localx.d) * i2;
        }
        for (f2 = f1 + (localx.e + localx.d);; f2 += 1.0F + f1)
        {
          if (f3 + this.n > i1)
          {
            this.o.setBounds((int)f3, this.p, (int)(0.5F + (f3 + this.n)), this.q);
            this.o.draw(paramCanvas);
          }
          if (f3 > i1 + i2) {
            return;
          }
          i7++;
          break;
          f3 = (1.0F + f2) * i2;
        }
      }
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 0xFF & paramMotionEvent.getAction();
    if ((i1 == 3) || (i1 == 1))
    {
      this.z = false;
      this.A = false;
      this.H = -1;
      if (this.I != null)
      {
        this.I.recycle();
        this.I = null;
      }
    }
    do
    {
      return false;
      if (i1 == 0) {
        break;
      }
      if (this.z) {
        return true;
      }
    } while (this.A);
    switch (i1)
    {
    }
    for (;;)
    {
      if (this.I == null) {
        this.I = VelocityTracker.obtain();
      }
      this.I.addMovement(paramMotionEvent);
      return this.z;
      int i2 = this.H;
      if (i2 != -1)
      {
        int i3 = e.a(paramMotionEvent, i2);
        float f2 = e.c(paramMotionEvent, i3);
        float f3 = f2 - this.F;
        float f4 = Math.abs(f3);
        float f5 = e.d(paramMotionEvent, i3);
        float f6 = Math.abs(f5 - this.G);
        if (f3 != 0.0F)
        {
          float f8 = this.F;
          if (((f8 < this.C) && (f3 > 0.0F)) || ((f8 > getWidth() - this.C) && (f3 < 0.0F))) {}
          for (int i4 = 1; (i4 == 0) && (a(this, false, (int)f3, (int)f2, (int)f5)); i4 = 0)
          {
            this.F = f2;
            this.E = f2;
            this.G = f5;
            this.A = true;
            return false;
          }
        }
        float f7;
        if ((f4 > this.D) && (f4 > f6))
        {
          this.z = true;
          setScrollState(1);
          if (f3 > 0.0F)
          {
            f7 = this.E + this.D;
            label362:
            this.F = f7;
            setScrollingCacheEnabled(true);
          }
        }
        while ((this.z) && (a(f2)))
        {
          n.b(this);
          break;
          f7 = this.E - this.D;
          break label362;
          if (f6 > this.D) {
            this.A = true;
          }
        }
        float f1 = paramMotionEvent.getX();
        this.E = f1;
        this.F = f1;
        this.G = paramMotionEvent.getY();
        this.H = e.b(paramMotionEvent, 0);
        this.A = false;
        this.l.computeScrollOffset();
        if ((this.Z == 2) && (Math.abs(this.l.getFinalX() - this.l.getCurrX()) > this.M))
        {
          this.l.abortAnimation();
          this.x = false;
          c();
          this.z = true;
          setScrollState(1);
        }
        else
        {
          g();
          this.z = false;
          continue;
          a(paramMotionEvent);
        }
      }
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.v = true;
    c();
    this.v = false;
    int i1 = getChildCount();
    int i2 = paramInt3 - paramInt1;
    int i3 = paramInt4 - paramInt2;
    int i4 = getPaddingLeft();
    int i5 = getPaddingTop();
    int i6 = getPaddingRight();
    int i7 = getPaddingBottom();
    int i8 = getScrollX();
    int i9 = 0;
    int i10 = 0;
    View localView2;
    int i20;
    label172:
    int i21;
    int i23;
    int i24;
    label224:
    int i13;
    int i14;
    int i15;
    if (i10 < i1)
    {
      localView2 = getChildAt(i10);
      if (localView2.getVisibility() == 8) {
        break label651;
      }
      y localy2 = (y)localView2.getLayoutParams();
      if (!localy2.a) {
        break label651;
      }
      int i17 = 0x7 & localy2.b;
      int i18 = 0x70 & localy2.b;
      switch (i17)
      {
      case 2: 
      case 4: 
      default: 
        i20 = i4;
        switch (i18)
        {
        default: 
          i21 = i5;
          int i29 = i7;
          i23 = i5;
          i24 = i29;
          int i25 = i20 + i8;
          localView2.layout(i25, i21, i25 + localView2.getMeasuredWidth(), i21 + localView2.getMeasuredHeight());
          i13 = i9 + 1;
          i14 = i23;
          i7 = i24;
          i15 = i6;
        }
        break;
      }
    }
    for (int i16 = i4;; i16 = i4)
    {
      i10++;
      i4 = i16;
      i6 = i15;
      i5 = i14;
      i9 = i13;
      break;
      int i30 = i4 + localView2.getMeasuredWidth();
      i20 = i4;
      i4 = i30;
      break label172;
      i20 = Math.max((i2 - localView2.getMeasuredWidth()) / 2, i4);
      break label172;
      int i19 = i2 - i6 - localView2.getMeasuredWidth();
      i6 += localView2.getMeasuredWidth();
      i20 = i19;
      break label172;
      int i27 = i5 + localView2.getMeasuredHeight();
      int i28 = i5;
      i24 = i7;
      i23 = i27;
      i21 = i28;
      break label224;
      i21 = Math.max((i3 - localView2.getMeasuredHeight()) / 2, i5);
      int i26 = i7;
      i23 = i5;
      i24 = i26;
      break label224;
      i21 = i3 - i7 - localView2.getMeasuredHeight();
      int i22 = i7 + localView2.getMeasuredHeight();
      i23 = i5;
      i24 = i22;
      break label224;
      for (int i11 = 0; i11 < i1; i11++)
      {
        View localView1 = getChildAt(i11);
        if (localView1.getVisibility() != 8)
        {
          y localy1 = (y)localView1.getLayoutParams();
          if (!localy1.a)
          {
            x localx = d();
            if (localx != null)
            {
              int i12 = i4 + (int)(i2 * localx.e);
              if (localy1.d)
              {
                localy1.d = false;
                localView1.measure(View.MeasureSpec.makeMeasureSpec((int)((i2 - i4 - i6) * localy1.c), 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - i5 - i7, 1073741824));
              }
              localView1.layout(i12, i5, i12 + localView1.getMeasuredWidth(), i5 + localView1.getMeasuredHeight());
            }
          }
        }
      }
      this.p = i5;
      this.q = (i3 - i7);
      this.T = i9;
      this.Q = false;
      return;
      label651:
      i13 = i9;
      i14 = i5;
      i15 = i6;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    int i1 = getMeasuredWidth();
    this.C = Math.min(i1 / 10, this.B);
    int i2 = i1 - getPaddingLeft() - getPaddingRight();
    int i3 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i4 = getChildCount();
    int i5 = 0;
    View localView2;
    y localy2;
    int i10;
    int i11;
    int i12;
    label167:
    int i13;
    label182:
    label192:
    int i14;
    int i15;
    if (i5 < i4)
    {
      localView2 = getChildAt(i5);
      if (localView2.getVisibility() != 8)
      {
        localy2 = (y)localView2.getLayoutParams();
        if ((localy2 != null) && (localy2.a))
        {
          int i8 = 0x7 & localy2.b;
          int i9 = 0x70 & localy2.b;
          i10 = -2147483648;
          i11 = -2147483648;
          if ((i9 != 48) && (i9 != 80)) {
            break label294;
          }
          i12 = 1;
          if ((i8 != 3) && (i8 != 5)) {
            break label300;
          }
          i13 = 1;
          if (i12 == 0) {
            break label306;
          }
          i10 = 1073741824;
          if (localy2.width == -2) {
            break label478;
          }
          i14 = 1073741824;
          if (localy2.width == -1) {
            break label471;
          }
          i15 = localy2.width;
        }
      }
    }
    for (;;)
    {
      if (localy2.height != -2)
      {
        i11 = 1073741824;
        if (localy2.height == -1) {}
      }
      for (int i16 = localy2.height;; i16 = i3)
      {
        localView2.measure(View.MeasureSpec.makeMeasureSpec(i15, i14), View.MeasureSpec.makeMeasureSpec(i16, i11));
        if (i12 != 0) {
          i3 -= localView2.getMeasuredHeight();
        }
        for (;;)
        {
          i5++;
          break;
          label294:
          i12 = 0;
          break label167;
          label300:
          i13 = 0;
          break label182;
          label306:
          if (i13 == 0) {
            break label192;
          }
          i11 = 1073741824;
          break label192;
          if (i13 != 0) {
            i2 -= localView2.getMeasuredWidth();
          }
        }
        this.t = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        this.u = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.v = true;
        c();
        this.v = false;
        int i6 = getChildCount();
        for (int i7 = 0; i7 < i6; i7++)
        {
          View localView1 = getChildAt(i7);
          if (localView1.getVisibility() != 8)
          {
            y localy1 = (y)localView1.getLayoutParams();
            if ((localy1 == null) || (!localy1.a)) {
              localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i2 * localy1.c), 1073741824), this.u);
            }
          }
        }
        return;
      }
      label471:
      i15 = i2;
      continue;
      label478:
      i14 = i10;
      i15 = i2;
    }
  }
  
  protected final boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i1 = -1;
    int i2 = getChildCount();
    int i3;
    if ((paramInt & 0x2) != 0)
    {
      i1 = 1;
      i3 = 0;
    }
    while (i3 != i2)
    {
      View localView = getChildAt(i3);
      if (localView.getVisibility() == 0)
      {
        x localx = d();
        if ((localx != null) && (localx.b == this.h) && (localView.requestFocus(paramInt, paramRect)))
        {
          return true;
          i3 = i2 - 1;
          i2 = i1;
          continue;
        }
      }
      i3 += i1;
    }
    return false;
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof ViewPager.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    ViewPager.SavedState localSavedState = (ViewPager.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.g != null)
    {
      a(localSavedState.a, false, true);
      return;
    }
    this.i = localSavedState.a;
    this.j = localSavedState.b;
    this.k = localSavedState.c;
  }
  
  public final Parcelable onSaveInstanceState()
  {
    ViewPager.SavedState localSavedState = new ViewPager.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.h;
    if (this.g != null) {
      localSavedState.b = null;
    }
    return localSavedState;
  }
  
  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      a(paramInt1, paramInt3, this.n, this.n);
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.N) {
      return true;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {
      return false;
    }
    if ((this.g == null) || (this.g.a() == 0)) {
      return false;
    }
    if (this.I == null) {
      this.I = VelocityTracker.obtain();
    }
    this.I.addMovement(paramMotionEvent);
    int i1 = 0xFF & paramMotionEvent.getAction();
    boolean bool1 = false;
    switch (i1)
    {
    }
    for (;;)
    {
      if (bool1) {
        n.b(this);
      }
      return true;
      this.l.abortAnimation();
      this.x = false;
      c();
      this.z = true;
      setScrollState(1);
      float f6 = paramMotionEvent.getX();
      this.E = f6;
      this.F = f6;
      this.H = e.b(paramMotionEvent, 0);
      bool1 = false;
      continue;
      if (!this.z)
      {
        int i8 = e.a(paramMotionEvent, this.H);
        float f2 = e.c(paramMotionEvent, i8);
        float f3 = Math.abs(f2 - this.F);
        float f4 = Math.abs(e.d(paramMotionEvent, i8) - this.G);
        if ((f3 > this.D) && (f3 > f4))
        {
          this.z = true;
          if (f2 - this.E <= 0.0F) {
            break label340;
          }
        }
      }
      label340:
      for (float f5 = this.E + this.D;; f5 = this.E - this.D)
      {
        this.F = f5;
        setScrollState(1);
        setScrollingCacheEnabled(true);
        boolean bool4 = this.z;
        bool1 = false;
        if (!bool4) {
          break;
        }
        bool1 = false | a(e.c(paramMotionEvent, e.a(paramMotionEvent, this.H)));
        break;
      }
      boolean bool3 = this.z;
      bool1 = false;
      if (bool3)
      {
        VelocityTracker localVelocityTracker = this.I;
        localVelocityTracker.computeCurrentVelocity(1000, this.K);
        int i3 = (int)j.a(localVelocityTracker, this.H);
        this.x = true;
        int i4 = getWidth();
        int i5 = getScrollX();
        x localx1 = h();
        int i6 = localx1.b;
        float f1 = (i5 / i4 - localx1.e) / localx1.d;
        if ((Math.abs((int)(e.c(paramMotionEvent, e.a(paramMotionEvent, this.H)) - this.E)) > this.L) && (Math.abs(i3) > this.J)) {
          if (i3 <= 0) {}
        }
        label495:
        for (int i7 = i6;; i7 = (int)(0.5F + (f1 + i6)))
        {
          if (this.d.size() > 0)
          {
            x localx2 = (x)this.d.get(0);
            x localx3 = (x)this.d.get(-1 + this.d.size());
            i7 = Math.max(localx2.b, Math.min(i7, localx3.b));
          }
          a(i7, true, true, i3);
          this.H = -1;
          i();
          bool1 = this.O.c() | this.P.c();
          break;
          i6++;
          break label495;
        }
        boolean bool2 = this.z;
        bool1 = false;
        if (bool2)
        {
          a(this.h, true, true);
          this.H = -1;
          i();
          bool1 = this.O.c() | this.P.c();
          continue;
          int i2 = e.a(paramMotionEvent);
          this.F = e.c(paramMotionEvent, i2);
          this.H = e.b(paramMotionEvent, i2);
          bool1 = false;
          continue;
          a(paramMotionEvent);
          this.F = e.c(paramMotionEvent, e.a(paramMotionEvent, this.H));
          bool1 = false;
        }
      }
    }
  }
  
  public final void setAdapter(i parami)
  {
    if (this.g != null)
    {
      i locali3 = this.g;
      ab localab2 = this.m;
      locali3.a.unregisterObserver(localab2);
      for (int i1 = 0; i1 < this.d.size(); i1++)
      {
        x localx = (x)this.d.get(i1);
        i.b();
      }
      this.d.clear();
      for (int i2 = 0; i2 < getChildCount(); i2++) {
        if (!((y)getChildAt(i2).getLayoutParams()).a)
        {
          removeViewAt(i2);
          i2--;
        }
      }
      this.h = 0;
      scrollTo(0, 0);
    }
    i locali1 = this.g;
    this.g = parami;
    if (this.g != null)
    {
      if (this.m == null) {
        this.m = new ab(this, (byte)0);
      }
      i locali2 = this.g;
      ab localab1 = this.m;
      locali2.a.registerObserver(localab1);
      this.x = false;
      this.Q = true;
      if (this.i < 0) {
        break label291;
      }
      a(this.i, false, true);
      this.i = -1;
      this.j = null;
      this.k = null;
    }
    for (;;)
    {
      if ((this.W != null) && (locali1 != parami)) {}
      return;
      label291:
      c();
    }
  }
  
  public final void setCurrentItem(int paramInt)
  {
    this.x = false;
    if (!this.Q) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramInt, bool, false);
      return;
    }
  }
  
  public final void setOffscreenPageLimit(int paramInt)
  {
    if (paramInt <= 0)
    {
      new StringBuilder("Requested offscreen page limit ").append(paramInt).append(" too small; defaulting to 1").toString();
      paramInt = 1;
    }
    if (paramInt != this.y)
    {
      this.y = paramInt;
      c();
    }
  }
  
  final void setOnAdapterChangeListener(z paramz)
  {
    this.W = paramz;
  }
  
  public final void setOnPageChangeListener(aa paramaa)
  {
    this.U = paramaa;
  }
  
  public final void setPageMargin(int paramInt)
  {
    int i1 = this.n;
    this.n = paramInt;
    int i2 = getWidth();
    a(i2, i2, paramInt, i1);
    requestLayout();
  }
  
  public final void setPageMarginDrawable(int paramInt)
  {
    setPageMarginDrawable(getContext().getResources().getDrawable(paramInt));
  }
  
  public final void setPageMarginDrawable(Drawable paramDrawable)
  {
    this.o = paramDrawable;
    if (paramDrawable != null) {
      refreshDrawableState();
    }
    if (paramDrawable == null) {}
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
    }
  }
  
  protected final boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.o);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager
 * JD-Core Version:    0.7.0.1
 */