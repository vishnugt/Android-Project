package com.supercell.titan;

import android.opengl.GLSurfaceView.Renderer;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class x
  implements GLSurfaceView.Renderer
{
  private int b;
  private int c;
  
  public x(v paramv) {}
  
  private void a(int paramInt1, int paramInt2)
  {
    if ((this.b == 0) && (this.c == 0))
    {
      this.b = paramInt1;
      this.c = paramInt2;
    }
    v.d(this.a, true);
  }
  
  public final void onDrawFrame(GL10 paramGL10)
  {
    if ((v.a(this.a)) || (!v.b(this.a))) {}
    GameApp localGameApp;
    boolean bool;
    do
    {
      do
      {
        do
        {
          return;
          if (v.c(this.a))
          {
            v.a(this.a, false);
            v.b(this.a, false);
            v.c(this.a, false);
            ApplicationUtil.a.compareAndSet(true, false);
            GameApp.deinit();
          }
          if (v.d(this.a))
          {
            if (!v.e(this.a))
            {
              ApplicationUtil.requestAdvertiserInfoOnNewThread();
              v.c(this.a, true);
            }
            if ((!v.f(this.a)) && (GameApp.isNativeLibraryLoaded()) && (ApplicationUtil.a.get()))
            {
              v.d(this.a, false);
              this.a.a = this.a.a.trim();
              if ((this.a.a == null) || (this.a.a.length() <= 0)) {
                this.a.a = "";
              }
              v.b(this.a, GameApp.init(this.b, this.c, this.a.a));
              if (!v.f(this.a)) {
                throw new Error("Failed to initialize game");
              }
            }
            this.a.a = "";
          }
        } while (!v.f(this.a));
        localGameApp = GameApp.getInstance();
        if (this.a.b)
        {
          this.a.b = false;
          String str = "";
          if (this.a.a != null) {
            str = this.a.a;
          }
          this.a.a = "";
          GameApp.start(str);
        }
        Vector localVector = localGameApp.h();
        int i = localVector.size();
        for (int j = 0; j < i; j++) {
          GameApp.logDebuggerException((String)localVector.remove(0));
        }
        localGameApp.b().c();
        if (NativeDialogManager.a)
        {
          NativeDialogManager.a = false;
          GameApp.dialogDismissed(NativeDialogManager.c, NativeDialogManager.b);
        }
        NativeHTTPClientManager.getInstance();
        NativeHTTPClientManager.updateBeforeFrame();
      } while (NativeDialogManager.isDialogVisible());
      if (v.g(this.a))
      {
        v.h(this.a);
        if (!GameApp.backButtonPressed())
        {
          localGameApp.finish();
          return;
        }
      }
      int k = this.a.d.size();
      for (int m = 0; m < k; m++)
      {
        z localz = (z)this.a.d.remove(0);
        v.a(this.a, localz);
        this.a.c.add(localz);
      }
      if (this.a.f)
      {
        this.a.f = false;
        GameApp.clearTouches();
        for (int n = 0; n < this.a.e; n++)
        {
          y localy = this.a.g[n];
          GameApp.setTouch(localy.a, localy.b, localy.d, n);
        }
        int i1 = 0;
        while (i1 < this.a.e)
        {
          this.a.g[i1].e = true;
          if (this.a.g[i1].f)
          {
            this.a.a(i1);
            this.a.f = true;
          }
          else
          {
            i1++;
          }
        }
      }
      if (GCMIntentService.a)
      {
        GCMIntentService.a = false;
        GameApp.setPushNotificationValues(GCMIntentService.getErrorCode(), GCMIntentService.getID(), GCMIntentService.getErrorMessage());
      }
      bool = GameApp.update();
      GameApp.removeOutOfDateNotifications();
    } while (!bool);
    localGameApp.finish();
  }
  
  public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    switch (GameApp.getInstance().a)
    {
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    default: 
      a(paramInt1, paramInt2);
    }
    do
    {
      do
      {
        return;
      } while (paramInt1 < paramInt2);
      a(paramInt1, paramInt2);
      return;
    } while (paramInt1 > paramInt2);
    a(paramInt1, paramInt2);
  }
  
  public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    if (v.f(this.a))
    {
      v.a(this.a, true);
      this.a.b = false;
    }
    this.a.setRenderMode(1);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.x
 * JD-Core Version:    0.7.0.1
 */