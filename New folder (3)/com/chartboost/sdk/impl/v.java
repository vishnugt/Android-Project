package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Region.Op;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;

public class v
  extends AbsoluteLayout
{
  private Matrix a = new Matrix();
  private Matrix b = new Matrix();
  private float[] c = new float[2];
  private View d;
  private RelativeLayout e;
  
  public v(Context paramContext)
  {
    super(paramContext);
    this.e = new RelativeLayout(paramContext);
    addView(this.e, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
    this.d = this.e;
  }
  
  public v(Context paramContext, View paramView)
  {
    super(paramContext);
    addView(paramView, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
    this.d = paramView;
  }
  
  public View a()
  {
    return this.d;
  }
  
  public void a(View paramView)
  {
    a(paramView, new RelativeLayout.LayoutParams(-2, -2));
  }
  
  public void a(View paramView, RelativeLayout.LayoutParams paramLayoutParams)
  {
    if (this.e != null)
    {
      this.e.addView(paramView, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("cannot call addViewToContainer() on CBRotatableContainer that was set up with a default view");
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    CBOrientation.Difference localDifference = Chartboost.sharedChartboost().getForcedOrientationDifference();
    int i = localDifference.getAsInt();
    if (localDifference == CBOrientation.Difference.ANGLE_0)
    {
      super.dispatchDraw(paramCanvas);
      return;
    }
    paramCanvas.save();
    paramCanvas.clipRect(0.0F, 0.0F, getWidth(), getHeight(), Region.Op.REPLACE);
    try
    {
      localObject = (ViewGroup)getParent();
    }
    catch (Exception localException1)
    {
      Object localObject;
      ViewGroup localViewGroup;
      label93:
      int j;
      int k;
      label153:
      break label153;
    }
    try
    {
      localViewGroup = (ViewGroup)((View)localObject).getParent();
      if (!(localViewGroup instanceof ScrollView))
      {
        boolean bool = localViewGroup instanceof HorizontalScrollView;
        if (!bool) {}
      }
      else
      {
        localObject = localViewGroup;
      }
    }
    catch (Exception localException2)
    {
      break label93;
    }
    j = getLeft() - ((View)localObject).getScrollX();
    k = getTop() - ((View)localObject).getScrollY();
    paramCanvas.clipRect(0 - j, 0 - k, ((View)localObject).getWidth() - j, ((View)localObject).getHeight() - k, Region.Op.INTERSECT);
    paramCanvas.translate(getWidth() / 2.0F, getHeight() / 2.0F);
    paramCanvas.rotate(i);
    if (localDifference.isOdd()) {
      paramCanvas.translate(-getHeight() / 2.0F, -getWidth() / 2.0F);
    }
    for (;;)
    {
      this.a = paramCanvas.getMatrix();
      this.a.invert(this.b);
      super.dispatchDraw(paramCanvas);
      paramCanvas.restore();
      return;
      paramCanvas.translate(-getWidth() / 2.0F, -getHeight() / 2.0F);
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (Chartboost.sharedChartboost().getForcedOrientationDifference() == CBOrientation.Difference.ANGLE_0) {
      return super.dispatchTouchEvent(paramMotionEvent);
    }
    float[] arrayOfFloat = this.c;
    arrayOfFloat[0] = paramMotionEvent.getRawX();
    arrayOfFloat[1] = paramMotionEvent.getRawY();
    this.b.mapPoints(arrayOfFloat);
    paramMotionEvent.setLocation(arrayOfFloat[0], arrayOfFloat[1]);
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (Chartboost.sharedChartboost().getForcedOrientationDifference().isOdd())
    {
      super.onMeasure(paramInt2, paramInt1);
      setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    CBOrientation.Difference localDifference = Chartboost.sharedChartboost().getForcedOrientationDifference();
    ViewGroup.LayoutParams localLayoutParams = this.d.getLayoutParams();
    int i;
    if (localDifference.isOdd())
    {
      i = paramInt2;
      localLayoutParams.width = i;
      if (!localDifference.isOdd()) {
        break label120;
      }
    }
    for (;;)
    {
      localLayoutParams.height = paramInt1;
      this.d.setLayoutParams(localLayoutParams);
      this.d.measure(View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824));
      this.d.layout(0, 0, localLayoutParams.width, localLayoutParams.height);
      return;
      i = paramInt1;
      break;
      label120:
      paramInt1 = paramInt2;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.v
 * JD-Core Version:    0.7.0.1
 */