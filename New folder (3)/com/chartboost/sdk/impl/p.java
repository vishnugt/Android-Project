package com.chartboost.sdk.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;

public class p
{
  public static void a(p.b paramb, a parama)
  {
    a(paramb, parama, null);
  }
  
  public static void a(p.b paramb, a parama, p.a parama1)
  {
    b(paramb, parama, parama1, Boolean.valueOf(true));
  }
  
  public static void b(p.b paramb, a parama, p.a parama1)
  {
    c(paramb, parama, parama1, Boolean.valueOf(false));
  }
  
  private static void b(p.b paramb, a parama, p.a parama1, Boolean paramBoolean)
  {
    if (paramb == p.b.f) {
      if (parama1 != null) {
        parama1.a(parama);
      }
    }
    View localView;
    ViewTreeObserver localViewTreeObserver;
    do
    {
      do
      {
        do
        {
          return;
        } while ((parama == null) || (parama.h == null));
        localView = parama.h.c();
      } while (localView == null);
      localViewTreeObserver = localView.getViewTreeObserver();
    } while (!localViewTreeObserver.isAlive());
    localViewTreeObserver.addOnGlobalLayoutListener(new p.1(localView, paramb, parama, parama1, paramBoolean));
  }
  
  private static void c(p.b paramb, a parama, p.a parama1, Boolean paramBoolean)
  {
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.addAnimation(new AlphaAnimation(1.0F, 1.0F));
    if ((parama == null) || (parama.h == null)) {}
    View localView;
    do
    {
      return;
      localView = parama.h.c();
    } while (localView == null);
    float f1 = localView.getWidth();
    float f2 = localView.getHeight();
    CBOrientation.Difference localDifference = Chartboost.sharedChartboost().getForcedOrientationDifference();
    switch (b()[paramb.ordinal()])
    {
    }
    for (;;)
    {
      if (paramb != p.b.f) {
        break label2111;
      }
      if (parama1 == null) {
        break;
      }
      parama1.a(parama);
      return;
      r localr2;
      label200:
      ScaleAnimation localScaleAnimation6;
      label243:
      TranslateAnimation localTranslateAnimation4;
      switch (a()[localDifference.ordinal()])
      {
      default: 
        if (paramBoolean.booleanValue())
        {
          localr2 = new r(-60.0F, 0.0F, f1 / 2.0F, f2 / 2.0F, false);
          localr2.setDuration(600L);
          localr2.setFillAfter(true);
          localAnimationSet.addAnimation(localr2);
          if (!paramBoolean.booleanValue()) {
            break label542;
          }
          localScaleAnimation6 = new ScaleAnimation(0.4F, 1.0F, 0.4F, 1.0F);
          localScaleAnimation6.setDuration(600L);
          localScaleAnimation6.setFillAfter(true);
          localAnimationSet.addAnimation(localScaleAnimation6);
          switch (a()[localDifference.ordinal()])
          {
          default: 
            if (paramBoolean.booleanValue()) {
              localTranslateAnimation4 = new TranslateAnimation(0.3F * f1, 0.0F, 0.4F * -f2, 0.0F);
            }
            break;
          }
        }
        break;
      }
      for (;;)
      {
        localTranslateAnimation4.setDuration(600L);
        localTranslateAnimation4.setFillAfter(true);
        localAnimationSet.addAnimation(localTranslateAnimation4);
        break;
        if (paramBoolean.booleanValue())
        {
          localr2 = new r(-60.0F, 0.0F, f1 / 2.0F, f2 / 2.0F, true);
          break label200;
        }
        localr2 = new r(0.0F, 60.0F, f1 / 2.0F, f2 / 2.0F, true);
        break label200;
        if (paramBoolean.booleanValue())
        {
          localr2 = new r(60.0F, 0.0F, f1 / 2.0F, f2 / 2.0F, false);
          break label200;
        }
        localr2 = new r(0.0F, -60.0F, f1 / 2.0F, f2 / 2.0F, false);
        break label200;
        if (paramBoolean.booleanValue())
        {
          localr2 = new r(60.0F, 0.0F, f1 / 2.0F, f2 / 2.0F, true);
          break label200;
        }
        localr2 = new r(0.0F, -60.0F, f1 / 2.0F, f2 / 2.0F, true);
        break label200;
        localr2 = new r(0.0F, 60.0F, f1 / 2.0F, f2 / 2.0F, false);
        break label200;
        label542:
        localScaleAnimation6 = new ScaleAnimation(1.0F, 0.4F, 1.0F, 0.4F);
        break label243;
        if (paramBoolean.booleanValue())
        {
          localTranslateAnimation4 = new TranslateAnimation(f1, 0.0F, 0.3F * f2, 0.0F);
        }
        else
        {
          localTranslateAnimation4 = new TranslateAnimation(0.0F, 0.4F * -f1, 0.0F, 0.3F * f2);
          continue;
          if (paramBoolean.booleanValue())
          {
            localTranslateAnimation4 = new TranslateAnimation(0.3F * f1, 0.0F, f2, 0.0F);
          }
          else
          {
            localTranslateAnimation4 = new TranslateAnimation(0.0F, 0.3F * f1, 0.0F, 0.4F * -f2);
            continue;
            if (paramBoolean.booleanValue())
            {
              localTranslateAnimation4 = new TranslateAnimation(0.4F * -f1, 0.0F, 0.3F * f2, 0.0F);
            }
            else
            {
              localTranslateAnimation4 = new TranslateAnimation(0.0F, f1, 0.0F, 0.3F * f2);
              continue;
              localTranslateAnimation4 = new TranslateAnimation(0.0F, 0.3F * f1, 0.0F, f2);
            }
          }
        }
      }
      r localr1;
      label804:
      ScaleAnimation localScaleAnimation5;
      label847:
      TranslateAnimation localTranslateAnimation3;
      switch (a()[localDifference.ordinal()])
      {
      default: 
        if (paramBoolean.booleanValue())
        {
          localr1 = new r(-60.0F, 0.0F, f1 / 2.0F, f2 / 2.0F, true);
          localr1.setDuration(600L);
          localr1.setFillAfter(true);
          localAnimationSet.addAnimation(localr1);
          if (!paramBoolean.booleanValue()) {
            break label1146;
          }
          localScaleAnimation5 = new ScaleAnimation(0.4F, 1.0F, 0.4F, 1.0F);
          localScaleAnimation5.setDuration(600L);
          localScaleAnimation5.setFillAfter(true);
          localAnimationSet.addAnimation(localScaleAnimation5);
          switch (a()[localDifference.ordinal()])
          {
          default: 
            if (paramBoolean.booleanValue()) {
              localTranslateAnimation3 = new TranslateAnimation(0.4F * -f1, 0.0F, 0.3F * f2, 0.0F);
            }
            break;
          }
        }
        break;
      }
      for (;;)
      {
        localTranslateAnimation3.setDuration(600L);
        localTranslateAnimation3.setFillAfter(true);
        localAnimationSet.addAnimation(localTranslateAnimation3);
        break;
        if (paramBoolean.booleanValue())
        {
          localr1 = new r(60.0F, 0.0F, f1 / 2.0F, f2 / 2.0F, false);
          break label804;
        }
        localr1 = new r(0.0F, -60.0F, f1 / 2.0F, f2 / 2.0F, false);
        break label804;
        if (paramBoolean.booleanValue())
        {
          localr1 = new r(60.0F, 0.0F, f1 / 2.0F, f2 / 2.0F, true);
          break label804;
        }
        localr1 = new r(0.0F, -60.0F, f1 / 2.0F, f2 / 2.0F, true);
        break label804;
        if (paramBoolean.booleanValue())
        {
          localr1 = new r(-60.0F, 0.0F, f1 / 2.0F, f2 / 2.0F, false);
          break label804;
        }
        localr1 = new r(0.0F, 60.0F, f1 / 2.0F, f2 / 2.0F, false);
        break label804;
        localr1 = new r(0.0F, 60.0F, f1 / 2.0F, f2 / 2.0F, true);
        break label804;
        label1146:
        localScaleAnimation5 = new ScaleAnimation(1.0F, 0.4F, 1.0F, 0.4F);
        break label847;
        if (paramBoolean.booleanValue())
        {
          localTranslateAnimation3 = new TranslateAnimation(0.3F * f1, 0.0F, 0.4F * -f2, 0.0F);
        }
        else
        {
          localTranslateAnimation3 = new TranslateAnimation(0.0F, 0.3F * f1, 0.0F, f2);
          continue;
          if (paramBoolean.booleanValue())
          {
            localTranslateAnimation3 = new TranslateAnimation(f1, 0.0F, 0.3F * f2, 0.0F);
          }
          else
          {
            localTranslateAnimation3 = new TranslateAnimation(0.0F, 0.4F * -f1, 0.0F, 0.3F * f2);
            continue;
            if (paramBoolean.booleanValue())
            {
              localTranslateAnimation3 = new TranslateAnimation(0.3F * f1, 0.0F, f2, 0.0F);
            }
            else
            {
              localTranslateAnimation3 = new TranslateAnimation(0.0F, 0.3F * f1, 0.0F, 0.4F * -f2);
              continue;
              localTranslateAnimation3 = new TranslateAnimation(0.0F, f1, 0.0F, 0.3F * f2);
            }
          }
        }
      }
      float f12;
      float f10;
      float f11;
      switch (a()[localDifference.ordinal()])
      {
      default: 
        f2 = 0.0F;
        f12 = 0.0F;
        f10 = 0.0F;
        f11 = 0.0F;
        TranslateAnimation localTranslateAnimation2 = new TranslateAnimation(f11, f10, f12, f2);
        localTranslateAnimation2.setDuration(600L);
        localTranslateAnimation2.setFillAfter(true);
        localAnimationSet.addAnimation(localTranslateAnimation2);
        break;
      case 1: 
        if (paramBoolean.booleanValue()) {}
        for (f12 = f2;; f12 = 0.0F)
        {
          if (paramBoolean.booleanValue()) {
            f2 = 0.0F;
          }
          f10 = 0.0F;
          f11 = 0.0F;
          break;
        }
      case 2: 
        float f14;
        if (paramBoolean.booleanValue())
        {
          f14 = -f1;
          if (!paramBoolean.booleanValue()) {
            break label1514;
          }
        }
        for (f10 = 0.0F;; f10 = -f1)
        {
          f11 = f14;
          f12 = 0.0F;
          f2 = 0.0F;
          break;
          f14 = 0.0F;
          break label1485;
        }
      case 3: 
        if (paramBoolean.booleanValue())
        {
          f12 = -f2;
          if (!paramBoolean.booleanValue()) {
            break label1563;
          }
        }
        for (float f13 = 0.0F;; f13 = -f2)
        {
          f2 = f13;
          f10 = 0.0F;
          f11 = 0.0F;
          break;
          f12 = 0.0F;
          break label1534;
        }
      case 4: 
        label1485:
        label1514:
        label1534:
        if (paramBoolean.booleanValue()) {}
        label1563:
        for (float f9 = f1;; f9 = 0.0F)
        {
          if (paramBoolean.booleanValue()) {
            f1 = 0.0F;
          }
          f10 = f1;
          f11 = f9;
          f12 = 0.0F;
          f2 = 0.0F;
          break;
        }
        float f7;
        float f6;
        float f5;
        switch (a()[localDifference.ordinal()])
        {
        default: 
          f7 = 0.0F;
          f6 = 0.0F;
          f1 = 0.0F;
          f5 = 0.0F;
          TranslateAnimation localTranslateAnimation1 = new TranslateAnimation(f5, f1, f6, f7);
          localTranslateAnimation1.setDuration(600L);
          localTranslateAnimation1.setFillAfter(true);
          localAnimationSet.addAnimation(localTranslateAnimation1);
          break;
        case 1: 
          if (paramBoolean.booleanValue())
          {
            f6 = -f2;
            if (!paramBoolean.booleanValue()) {
              break label1746;
            }
          }
          for (f7 = 0.0F;; f7 = -f2)
          {
            f5 = 0.0F;
            f1 = 0.0F;
            break;
            f6 = 0.0F;
            break label1721;
          }
        case 2: 
          if (paramBoolean.booleanValue()) {}
          for (float f8 = f1;; f8 = 0.0F)
          {
            if (paramBoolean.booleanValue()) {
              f1 = 0.0F;
            }
            f5 = f8;
            f6 = 0.0F;
            f7 = 0.0F;
            break;
          }
        case 3: 
          if (paramBoolean.booleanValue()) {}
          for (f6 = f2;; f6 = 0.0F)
          {
            if (paramBoolean.booleanValue()) {
              f2 = 0.0F;
            }
            f7 = f2;
            f5 = 0.0F;
            f1 = 0.0F;
            break;
          }
        case 4: 
          label1721:
          label1746:
          float f3;
          if (paramBoolean.booleanValue())
          {
            f3 = -f1;
            label1846:
            if (!paramBoolean.booleanValue()) {
              break label1879;
            }
          }
          label1879:
          for (float f4 = 0.0F;; f4 = -f1)
          {
            f1 = f4;
            f5 = f3;
            f6 = 0.0F;
            f7 = 0.0F;
            break;
            f3 = 0.0F;
            break label1846;
          }
          if (paramBoolean.booleanValue())
          {
            ScaleAnimation localScaleAnimation1 = new ScaleAnimation(0.6F, 1.1F, 0.6F, 1.1F, 1, 0.5F, 1, 0.5F);
            localScaleAnimation1.setDuration(Math.round(360.0F));
            localScaleAnimation1.setStartOffset(0L);
            localScaleAnimation1.setFillAfter(true);
            localAnimationSet.addAnimation(localScaleAnimation1);
            ScaleAnimation localScaleAnimation2 = new ScaleAnimation(1.0F, 0.8181818F, 1.0F, 0.8181818F, 1, 0.5F, 1, 0.5F);
            localScaleAnimation2.setDuration(Math.round(119.99999F));
            localScaleAnimation2.setStartOffset(Math.round(360.0F));
            localScaleAnimation2.setFillAfter(true);
            localAnimationSet.addAnimation(localScaleAnimation2);
            ScaleAnimation localScaleAnimation3 = new ScaleAnimation(1.0F, 1.111111F, 1.0F, 1.111111F, 1, 0.5F, 1, 0.5F);
            localScaleAnimation3.setDuration(Math.round(59.999977F));
            localScaleAnimation3.setStartOffset(Math.round(480.0F));
            localScaleAnimation3.setFillAfter(true);
            localAnimationSet.addAnimation(localScaleAnimation3);
          }
          else
          {
            ScaleAnimation localScaleAnimation4 = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
            localScaleAnimation4.setDuration(600L);
            localScaleAnimation4.setStartOffset(0L);
            localScaleAnimation4.setFillAfter(true);
            localAnimationSet.addAnimation(localScaleAnimation4);
          }
          break;
        }
        break;
      }
    }
    label2111:
    Chartboost.sharedChartboost().getHandler().postDelayed(new p.2(parama1, parama), 600L);
    localView.startAnimation(localAnimationSet);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.p
 * JD-Core Version:    0.7.0.1
 */