package com.chartboost.sdk.impl;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class r
  extends Animation
{
  private final float a;
  private final float b;
  private final float c;
  private final float d;
  private boolean e = true;
  private Camera f;
  
  public r(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    this.e = paramBoolean;
  }
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = this.a + paramFloat * (this.b - this.a);
    Camera localCamera = this.f;
    Matrix localMatrix = paramTransformation.getMatrix();
    localCamera.save();
    if (this.e) {
      localCamera.rotateY(f1);
    }
    for (;;)
    {
      localCamera.getMatrix(localMatrix);
      localCamera.restore();
      localMatrix.preTranslate(-this.c, -this.d);
      localMatrix.postTranslate(this.c, this.d);
      return;
      localCamera.rotateX(f1);
    }
  }
  
  public void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    this.f = new Camera();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.r
 * JD-Core Version:    0.7.0.1
 */