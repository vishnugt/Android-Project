package com.supercell.titan;

import android.opengl.GLSurfaceView.EGLConfigChooser;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

final class w
  implements GLSurfaceView.EGLConfigChooser
{
  private static int g = 4;
  private static int[] h;
  protected int a;
  protected int b;
  protected int c;
  protected int d;
  protected int e;
  protected int f;
  private final int[] i = new int[1];
  
  static
  {
    int[] arrayOfInt = new int[9];
    arrayOfInt[0] = 12324;
    arrayOfInt[1] = 4;
    arrayOfInt[2] = 12323;
    arrayOfInt[3] = 4;
    arrayOfInt[4] = 12322;
    arrayOfInt[5] = 4;
    arrayOfInt[6] = 12352;
    arrayOfInt[7] = g;
    arrayOfInt[8] = 12344;
    h = arrayOfInt;
  }
  
  public w(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
    this.f = 0;
  }
  
  private int a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt)
  {
    boolean bool = paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt, this.i);
    int j = 0;
    if (bool) {
      j = this.i[0];
    }
    return j;
  }
  
  private EGLConfig a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
  {
    Object localObject1 = null;
    int j = 268435455;
    int k = paramArrayOfEGLConfig.length;
    int m = 0;
    EGLConfig localEGLConfig;
    int i2;
    if (m < k)
    {
      localEGLConfig = paramArrayOfEGLConfig[m];
      int n = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12325);
      int i1 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12326);
      if ((n < this.e) || (i1 < this.f)) {
        break label208;
      }
      int i3 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12324);
      int i4 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12323);
      int i5 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12322);
      int i6 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12321);
      if ((i3 != this.a) || (i4 != this.b) || (i5 != this.c) || (i6 != this.d)) {
        break label208;
      }
      i2 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12338);
      if (i2 == 0) {
        return localEGLConfig;
      }
      if (i2 >= j) {
        break label208;
      }
    }
    for (Object localObject2 = localEGLConfig;; localObject2 = localObject1)
    {
      m++;
      localObject1 = localObject2;
      j = i2;
      break;
      return localObject1;
      label208:
      i2 = j;
    }
  }
  
  public final EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay)
  {
    int[] arrayOfInt = new int[1];
    paramEGL10.eglChooseConfig(paramEGLDisplay, h, null, 0, arrayOfInt);
    int j = arrayOfInt[0];
    if (j <= 0) {
      throw new IllegalArgumentException("No configs match configSpec");
    }
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[j];
    paramEGL10.eglChooseConfig(paramEGLDisplay, h, arrayOfEGLConfig, j, arrayOfInt);
    return a(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.w
 * JD-Core Version:    0.7.0.1
 */