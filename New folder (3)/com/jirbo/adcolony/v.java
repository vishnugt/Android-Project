package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.widget.MediaController;

final class v
  implements SurfaceHolder.Callback
{
  v(o paramo) {}
  
  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    this.a.k = paramInt2;
    this.a.l = paramInt3;
    int j;
    if (this.a.f == 3)
    {
      j = i;
      if ((this.a.i != paramInt2) || (this.a.j != paramInt3)) {
        break label136;
      }
    }
    for (;;)
    {
      if ((this.a.h != null) && (j != 0) && (i != 0))
      {
        if (this.a.r != 0) {
          this.a.seekTo(this.a.r);
        }
        this.a.start();
        if (this.a.m != null) {
          this.a.m.show();
        }
      }
      return;
      j = 0;
      break;
      label136:
      i = 0;
    }
  }
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.a.g = paramSurfaceHolder;
    if ((this.a.h != null) && (this.a.e == 6) && (this.a.f == 7))
    {
      this.a.h.setDisplay(this.a.g);
      this.a.c();
      return;
    }
    o.a(this.a);
  }
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.a.g = null;
    if (this.a.m != null) {
      this.a.m.hide();
    }
    if (this.a.e != 6) {
      o.b(this.a);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.v
 * JD-Core Version:    0.7.0.1
 */