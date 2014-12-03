package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.bn;
import com.google.android.gms.internal.bs;
import com.google.android.gms.internal.dh;
import java.lang.ref.WeakReference;

public final class e
{
  final f a;
  int b;
  int c;
  private int d;
  private WeakReference<a> e;
  private WeakReference<ImageView> f;
  private WeakReference<TextView> g;
  private int h;
  private boolean i;
  
  private static bn a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 != null) {
      if (!(paramDrawable1 instanceof bn)) {}
    }
    for (paramDrawable1 = ((bn)paramDrawable1).a();; paramDrawable1 = null) {
      return new bn(paramDrawable1, paramDrawable2);
    }
  }
  
  private boolean a()
  {
    return this.i;
  }
  
  final void a(Drawable paramDrawable, boolean paramBoolean)
  {
    int j = 1;
    ImageView localImageView;
    label76:
    boolean bool2;
    switch (this.c)
    {
    default: 
    case 1: 
    case 2: 
      int n;
      do
      {
        do
        {
          do
          {
            return;
          } while ((a)this.e.get() == null);
          return;
          localImageView = (ImageView)this.f.get();
        } while (localImageView == null);
        if (paramBoolean) {
          break label209;
        }
        if ((j == 0) || (!(localImageView instanceof bs))) {
          break;
        }
        n = ((bs)localImageView).a();
      } while ((this.b != 0) && (n == this.b));
      bool2 = a();
      if (!bool2) {
        break;
      }
    }
    for (Object localObject6 = a(localImageView.getDrawable(), paramDrawable);; localObject6 = paramDrawable)
    {
      localImageView.setImageDrawable((Drawable)localObject6);
      bs localbs;
      Uri localUri;
      if ((localImageView instanceof bs))
      {
        localbs = (bs)localImageView;
        if (!paramBoolean) {
          break label214;
        }
        localUri = this.a.a;
        label171:
        localbs.a(localUri);
        if (j == 0) {
          break label220;
        }
      }
      label209:
      label214:
      label220:
      for (int m = this.b;; m = 0)
      {
        localbs.a(m);
        if (!bool2) {
          break;
        }
        ((bn)localObject6).b();
        return;
        j = 0;
        break label76;
        localUri = null;
        break label171;
      }
      TextView localTextView = (TextView)this.g.get();
      if (localTextView == null) {
        break;
      }
      int k = this.h;
      boolean bool1 = a();
      Drawable[] arrayOfDrawable;
      Drawable localDrawable;
      if (dh.a(17))
      {
        arrayOfDrawable = localTextView.getCompoundDrawablesRelative();
        localDrawable = arrayOfDrawable[k];
        if (!bool1) {
          break label426;
        }
      }
      label392:
      label401:
      label410:
      label424:
      label426:
      for (Object localObject1 = a(localDrawable, paramDrawable);; localObject1 = paramDrawable)
      {
        Object localObject2;
        label299:
        Object localObject3;
        label309:
        Object localObject4;
        label319:
        Object localObject5;
        if (k == 0)
        {
          localObject2 = localObject1;
          if (k != j) {
            break label383;
          }
          localObject3 = localObject1;
          if (k != 2) {
            break label392;
          }
          localObject4 = localObject1;
          if (k != 3) {
            break label401;
          }
          localObject5 = localObject1;
          label329:
          if (!dh.a(17)) {
            break label410;
          }
          localTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject2, (Drawable)localObject3, (Drawable)localObject4, (Drawable)localObject5);
        }
        for (;;)
        {
          if (!bool1) {
            break label424;
          }
          ((bn)localObject1).b();
          return;
          arrayOfDrawable = localTextView.getCompoundDrawables();
          break;
          localObject2 = arrayOfDrawable[0];
          break label299;
          label383:
          localObject3 = arrayOfDrawable[j];
          break label309;
          localObject4 = arrayOfDrawable[2];
          break label319;
          localObject5 = arrayOfDrawable[3];
          break label329;
          localTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject2, (Drawable)localObject3, (Drawable)localObject4, (Drawable)localObject5);
        }
        break;
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof e)) {}
    do
    {
      return false;
      if (this == paramObject) {
        return true;
      }
    } while (((e)paramObject).hashCode() != hashCode());
    return true;
  }
  
  public final int hashCode()
  {
    return this.d;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.e
 * JD-Core Version:    0.7.0.1
 */