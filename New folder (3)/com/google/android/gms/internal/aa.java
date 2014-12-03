package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;

public final class aa
  extends FrameLayout
  implements View.OnClickListener
{
  private final Activity a;
  private final ImageButton b;
  
  public aa(Activity paramActivity, int paramInt)
  {
    super(paramActivity);
    this.a = paramActivity;
    setOnClickListener(this);
    this.b = new ImageButton(paramActivity);
    this.b.setImageResource(17301527);
    this.b.setBackgroundColor(0);
    this.b.setOnClickListener(this);
    this.b.setPadding(0, 0, 0, 0);
    int i = av.a(paramActivity, paramInt);
    addView(this.b, new FrameLayout.LayoutParams(i, i, 17));
  }
  
  public final void a(boolean paramBoolean)
  {
    ImageButton localImageButton = this.b;
    if (paramBoolean) {}
    for (int i = 4;; i = 0)
    {
      localImageButton.setVisibility(i);
      return;
    }
  }
  
  public final void onClick(View paramView)
  {
    this.a.finish();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.aa
 * JD-Core Version:    0.7.0.1
 */