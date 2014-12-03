package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.cs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class d
  implements Runnable
{
  private final Uri b;
  private final Bitmap c;
  private final CountDownLatch d;
  private boolean e;
  
  public d(ImageManager paramImageManager, Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
  {
    this.b = paramUri;
    this.c = paramBitmap;
    this.e = paramBoolean;
    this.d = paramCountDownLatch;
  }
  
  private void a(ImageManager.ImageReceiver paramImageReceiver, boolean paramBoolean)
  {
    paramImageReceiver.a = true;
    ArrayList localArrayList = ImageManager.ImageReceiver.a(paramImageReceiver);
    int i = localArrayList.size();
    int j = 0;
    if (j < i)
    {
      e locale = (e)localArrayList.get(j);
      if (paramBoolean)
      {
        Context localContext2 = ImageManager.a(this.a);
        Bitmap localBitmap = this.c;
        bt.a(localBitmap);
        locale.a(new BitmapDrawable(localContext2.getResources(), localBitmap), true);
      }
      for (;;)
      {
        if (locale.c != 1) {
          ImageManager.c(this.a).remove(locale);
        }
        j++;
        break;
        Context localContext1 = ImageManager.a(this.a);
        int k = locale.b;
        Drawable localDrawable = null;
        if (k != 0) {
          localDrawable = localContext1.getResources().getDrawable(locale.b);
        }
        locale.a(localDrawable, false);
      }
    }
    paramImageReceiver.a = false;
  }
  
  public final void run()
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      new StringBuilder("checkMainThread: current thread ").append(Thread.currentThread()).append(" IS NOT the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString();
      throw new IllegalStateException("OnBitmapLoadedRunnable must be executed in the main thread");
    }
    boolean bool;
    if (this.c != null) {
      bool = true;
    }
    while (ImageManager.f(this.a) != null) {
      if (this.e)
      {
        ImageManager.f(this.a).a(-1);
        System.gc();
        this.e = false;
        ImageManager.e(this.a).post(this);
        return;
        bool = false;
      }
      else if (bool)
      {
        ImageManager.f(this.a).a(new f(this.b), this.c);
      }
    }
    ImageManager.ImageReceiver localImageReceiver = (ImageManager.ImageReceiver)ImageManager.b(this.a).remove(this.b);
    if (localImageReceiver != null) {
      a(localImageReceiver, bool);
    }
    this.d.countDown();
    synchronized (ImageManager.a())
    {
      ImageManager.b().remove(this.b);
      return;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.d
 * JD-Core Version:    0.7.0.1
 */