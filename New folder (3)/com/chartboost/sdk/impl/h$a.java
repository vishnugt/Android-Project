package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Libraries.a.a;
import com.chartboost.sdk.c.b;

public class h$a
  extends c.b
{
  private ImageView d;
  private ImageView e;
  private FrameLayout f;
  private s g;
  private v h;
  private v i;
  private h.a.a j;
  
  private h$a(h paramh, Context paramContext)
  {
    super(paramh, paramContext);
    setBackgroundColor(-1842205);
    this.f = new FrameLayout(paramContext);
    this.e = new ImageView(paramContext);
    this.d = new ImageView(paramContext);
    if (Chartboost.sharedChartboost().getForcedOrientationDifference().isOdd()) {}
    for (int m = 0;; m = 1)
    {
      this.g = new s(paramContext, m);
      this.g.b().setBackgroundColor(-1842205);
      this.f.setFocusable(false);
      this.e.setFocusable(false);
      this.d.setFocusable(false);
      this.d.setClickable(true);
      this.h = new v(paramContext, this.d);
      this.i = new v(paramContext, this.f);
      addView(this.i);
      this.f.addView(this.e);
      addView(this.h);
      a(this.e);
      a(this.f);
      a(this.d);
      a(this.i);
      a(this.h);
      this.d.setOnClickListener(new h.a.1(this));
      this.j = new h.a.a(this, paramContext);
      return;
    }
  }
  
  private void a(View paramView)
  {
    int m = 200;
    if (m == getId()) {
      m = 201;
    }
    View localView1 = findViewById(m);
    int n = m;
    for (View localView2 = localView1;; localView2 = findViewById(n))
    {
      if (localView2 == null)
      {
        paramView.setId(n);
        paramView.setSaveEnabled(false);
        return;
      }
      n++;
    }
  }
  
  protected void a(int paramInt1, int paramInt2)
  {
    if (this.g.a() != null) {
      removeView(this.g.a());
    }
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
    CBOrientation.Difference localDifference = Chartboost.sharedChartboost().getForcedOrientationDifference();
    int m;
    int n;
    label120:
    int i1;
    label160:
    label309:
    int i2;
    label336:
    label485:
    int i3;
    if (localDifference.isOdd())
    {
      m = CBUtility.a(h.f(), getContext());
      localLayoutParams1.width = m;
      if (!localDifference.isOdd()) {
        break label632;
      }
      n = -1;
      localLayoutParams1.height = n;
      switch (c()[localDifference.ordinal()])
      {
      default: 
        BitmapDrawable localBitmapDrawable = new BitmapDrawable(h.b(this.c).b());
        localBitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        localBitmapDrawable.setTileModeY(Shader.TileMode.CLAMP);
        this.f.setBackgroundDrawable(localBitmapDrawable);
        if (h.c(this.c) != null)
        {
          this.e.setImageBitmap(h.c(this.c).b());
          localLayoutParams.width = CBUtility.a(h.c(this.c).c(), getContext());
          localLayoutParams.height = CBUtility.a(Math.min(h.f(), h.c(this.c).d()), getContext());
        }
        this.d.setImageBitmap(h.d(this.c).b());
        if (localDifference.isOdd())
        {
          i1 = h.g();
          localLayoutParams2.width = CBUtility.a(i1, getContext());
          if (!localDifference.isOdd()) {
            break label675;
          }
          i2 = h.h();
          localLayoutParams2.height = CBUtility.a(i2, getContext());
          switch (c()[localDifference.ordinal()])
          {
          default: 
            localLayoutParams2.rightMargin = CBUtility.a(10, getContext());
            localLayoutParams2.topMargin = CBUtility.a((h.f() - h.g()) / 2, getContext());
            localLayoutParams2.addRule(11);
            label426:
            localLayoutParams3.width = -1;
            localLayoutParams3.height = -1;
            switch (c()[localDifference.ordinal()])
            {
            default: 
              localLayoutParams3.addRule(3, this.i.getId());
              s locals = this.g;
              if (localDifference.isOdd())
              {
                i3 = 0;
                label502:
                locals.a(i3);
                a(this.g.a());
                this.g.a(this.j);
                addView(this.g.a(), localLayoutParams3);
                if (localDifference != CBOrientation.Difference.ANGLE_180) {
                  break label872;
                }
                this.g.b().setGravity(80);
              }
              break;
            }
            break;
          }
        }
        break;
      }
    }
    for (;;)
    {
      this.i.setLayoutParams(localLayoutParams1);
      this.e.setLayoutParams(localLayoutParams);
      this.e.setScaleType(ImageView.ScaleType.FIT_CENTER);
      this.h.setLayoutParams(localLayoutParams2);
      this.d.setScaleType(ImageView.ScaleType.FIT_CENTER);
      post(new h.a.2(this, localDifference));
      return;
      m = -1;
      break;
      label632:
      n = CBUtility.a(h.f(), getContext());
      break label120;
      localLayoutParams1.addRule(11);
      break label160;
      localLayoutParams1.addRule(12);
      break label160;
      i1 = h.h();
      break label309;
      label675:
      i2 = h.g();
      break label336;
      localLayoutParams2.bottomMargin = CBUtility.a(10, getContext());
      localLayoutParams2.rightMargin = CBUtility.a((h.f() - h.g()) / 2, getContext());
      localLayoutParams2.addRule(11);
      localLayoutParams2.addRule(12);
      break label426;
      localLayoutParams2.leftMargin = CBUtility.a(10, getContext());
      localLayoutParams2.bottomMargin = CBUtility.a((h.f() - h.g()) / 2, getContext());
      localLayoutParams2.addRule(12);
      break label426;
      localLayoutParams2.topMargin = CBUtility.a(10, getContext());
      localLayoutParams2.leftMargin = CBUtility.a((h.f() - h.g()) / 2, getContext());
      break label426;
      localLayoutParams3.addRule(0, this.i.getId());
      break label485;
      localLayoutParams3.addRule(2, this.i.getId());
      break label485;
      localLayoutParams3.addRule(1, this.i.getId());
      break label485;
      i3 = 1;
      break label502;
      label872:
      if (localDifference == CBOrientation.Difference.ANGLE_90) {
        this.g.b().setGravity(5);
      } else {
        this.g.b().setGravity(0);
      }
    }
  }
  
  public void b()
  {
    super.b();
    this.d = null;
    this.e = null;
    this.g = null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.h.a
 * JD-Core Version:    0.7.0.1
 */