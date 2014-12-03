package com.supercell.titan;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import java.util.Vector;

public final class v
  extends GLSurfaceView
{
  public String a = "";
  public boolean b;
  public final Vector<z> c = new Vector(10);
  public final Vector<z> d = new Vector(10);
  public int e;
  public boolean f;
  public final y[] g = new y[10];
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private final x m;
  private boolean n;
  private boolean o;
  private int p = 1;
  
  public v(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    super(paramContext);
    for (int i1 = 0; i1 < 10; i1++) {
      this.g[i1] = new y(this);
    }
    setEGLContextClientVersion(2);
    setEGLConfigChooser(new w(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5));
    this.m = new x(this);
    setRenderer(this.m);
    setPreserveEGLContextOnPause(true);
  }
  
  private int b(int paramInt)
  {
    int i1 = this.e;
    do
    {
      i1--;
      if (i1 < 0) {
        break;
      }
    } while (this.g[i1].c != paramInt);
    return i1;
    return -1;
  }
  
  public final void a()
  {
    this.n = true;
  }
  
  public final void a(int paramInt)
  {
    y localy = this.g[paramInt];
    this.e = (-1 + this.e);
    int i1 = this.e;
    while (paramInt < i1)
    {
      this.g[paramInt] = this.g[(paramInt + 1)];
      paramInt++;
    }
    this.g[i1] = localy;
  }
  
  public final void onPause()
  {
    this.l = true;
    super.onPause();
    if (GameApp.isNativeLibraryLoaded()) {
      GameApp.stop();
    }
  }
  
  public final void onResume()
  {
    super.onResume();
    this.l = false;
    if (getRenderMode() == 0) {
      requestRender();
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    z localz;
    int i1;
    int i3;
    if (this.h)
    {
      if (!this.c.isEmpty()) {
        break label103;
      }
      localz = new z(this);
      i1 = paramMotionEvent.getActionIndex();
      int i2 = paramMotionEvent.getActionMasked();
      i3 = paramMotionEvent.getPointerId(i1);
      switch (i2)
      {
      }
    }
    for (;;)
    {
      if (localz != null) {
        this.d.add(localz);
      }
      return true;
      label103:
      localz = (z)this.c.remove(0);
      break;
      localz.c = 0;
      localz.a = ((int)paramMotionEvent.getX(i1));
      localz.b = ((int)paramMotionEvent.getY(i1));
      localz.d = i3;
      continue;
      localz.c = 1;
      localz.a = ((int)paramMotionEvent.getX(i1));
      localz.b = ((int)paramMotionEvent.getY(i1));
      localz.d = i3;
      continue;
      int i4 = 0;
      if (i4 < paramMotionEvent.getPointerCount())
      {
        if (localz == null) {
          if (!this.c.isEmpty()) {
            break label279;
          }
        }
        label279:
        for (localz = new z(this);; localz = (z)this.c.remove(0))
        {
          int i5 = paramMotionEvent.getPointerId(i4);
          localz.c = 2;
          localz.d = i5;
          localz.a = ((int)paramMotionEvent.getX(i4));
          localz.b = ((int)paramMotionEvent.getY(i4));
          this.d.add(localz);
          i4++;
          localz = null;
          break;
        }
        localz.c = 3;
      }
    }
  }
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    super.surfaceCreated(paramSurfaceHolder);
    this.o = true;
  }
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.o = false;
    super.surfaceDestroyed(paramSurfaceHolder);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.v
 * JD-Core Version:    0.7.0.1
 */