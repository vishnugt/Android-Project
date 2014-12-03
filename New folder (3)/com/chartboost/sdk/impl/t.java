package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;

public class t
  extends LinearLayout
  implements u.a
{
  private TextView a;
  private v b;
  private w c;
  
  public t(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    setGravity(17);
    this.a = new TextView(getContext());
    this.a.setTextColor(-1);
    this.a.setTextSize(2, 16.0F);
    this.a.setTypeface(null, 1);
    this.a.setText("Loading...");
    this.a.setGravity(17);
    this.b = new v(paramContext, this.a);
    this.c = new w(getContext());
    addView(this.b);
    addView(this.c);
    a();
  }
  
  public void a()
  {
    removeView(this.b);
    removeView(this.c);
    float f = getContext().getResources().getDisplayMetrics().density;
    int i = Math.round(20.0F * f);
    CBOrientation.Difference localDifference = Chartboost.sharedChartboost().getForcedOrientationDifference();
    switch (b()[localDifference.ordinal()])
    {
    default: 
      setOrientation(1);
      LinearLayout.LayoutParams localLayoutParams7 = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams7.setMargins(i, i, i, 0);
      addView(this.b, localLayoutParams7);
      LinearLayout.LayoutParams localLayoutParams8 = new LinearLayout.LayoutParams(-1, Math.round(f * 32.0F));
      localLayoutParams8.setMargins(i, i, i, i);
      addView(this.c, localLayoutParams8);
      return;
    case 2: 
      setOrientation(0);
      LinearLayout.LayoutParams localLayoutParams5 = new LinearLayout.LayoutParams(Math.round(f * 32.0F), -1);
      localLayoutParams5.setMargins(i, i, 0, i);
      addView(this.c, localLayoutParams5);
      LinearLayout.LayoutParams localLayoutParams6 = new LinearLayout.LayoutParams(-2, -1);
      localLayoutParams6.setMargins(i, i, i, i);
      addView(this.b, localLayoutParams6);
      return;
    case 3: 
      setOrientation(1);
      LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-1, Math.round(f * 32.0F));
      localLayoutParams3.setMargins(i, i, i, 0);
      addView(this.c, localLayoutParams3);
      LinearLayout.LayoutParams localLayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
      localLayoutParams4.setMargins(i, i, i, i);
      addView(this.b, localLayoutParams4);
      return;
    }
    setOrientation(0);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams1.setMargins(i, i, 0, i);
    addView(this.b, localLayoutParams1);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(Math.round(f * 32.0F), -1);
    localLayoutParams2.setMargins(i, i, i, i);
    addView(this.c, localLayoutParams2);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.t
 * JD-Core Version:    0.7.0.1
 */