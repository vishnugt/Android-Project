package com.chartboost.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;

public final class CBImpressionActivity
  extends Activity
{
  public static final String PARAM_FULLSCREEN = "paramFullscreen";
  protected Chartboost a;
  
  public final void onBackPressed()
  {
    if (this.a.b()) {
      return;
    }
    super.onBackPressed();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    if (getIntent().getBooleanExtra("paramFullscreen", false)) {
      getWindow().addFlags(1024);
    }
    getWindow().setWindowAnimations(0);
    setContentView(new RelativeLayout(this));
    this.a = Chartboost.sharedChartboost();
    this.a.a(this);
  }
  
  protected final void onDestroy()
  {
    super.onDestroy();
    this.a.c(this);
  }
  
  protected final void onStart()
  {
    super.onStart();
    this.a.a(this);
  }
  
  protected final void onStop()
  {
    super.onStop();
    this.a.b(this);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.CBImpressionActivity
 * JD-Core Version:    0.7.0.1
 */