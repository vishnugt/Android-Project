package com.facebook.widget;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.android.R.drawable;
import com.facebook.android.R.string;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;

public class WebDialog
  extends Dialog
{
  private static final int BACKGROUND_GRAY = -872415232;
  static final String CANCEL_URI = "fbconnect://cancel";
  public static final int DEFAULT_THEME = 16973840;
  static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
  private static final String DISPLAY_TOUCH = "touch";
  private static final String LOG_TAG = "FacebookSDK.WebDialog";
  private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
  private static final int MAX_PADDING_SCREEN_WIDTH = 800;
  private static final double MIN_SCALE_FACTOR = 0.5D;
  private static final int NO_PADDING_SCREEN_HEIGHT = 800;
  private static final int NO_PADDING_SCREEN_WIDTH = 480;
  static final String REDIRECT_URI = "fbconnect://success";
  private static final String USER_AGENT = "user_agent";
  private FrameLayout contentFrameLayout;
  private ImageView crossImageView;
  private boolean isDetached = false;
  private boolean listenerCalled = false;
  private WebDialog.OnCompleteListener onCompleteListener;
  private ProgressDialog spinner;
  private String url;
  private WebView webView;
  
  public WebDialog(Context paramContext, String paramString)
  {
    this(paramContext, paramString, 16973840);
  }
  
  public WebDialog(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, paramInt);
    this.url = paramString;
  }
  
  public WebDialog(Context paramContext, String paramString, Bundle paramBundle, int paramInt, WebDialog.OnCompleteListener paramOnCompleteListener)
  {
    super(paramContext, paramInt);
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    paramBundle.putString("display", "touch");
    paramBundle.putString("type", "user_agent");
    this.url = Utility.buildUri(ServerProtocol.getDialogAuthority(), "dialog/" + paramString, paramBundle).toString();
    this.onCompleteListener = paramOnCompleteListener;
  }
  
  private void calculateSize()
  {
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    int i;
    if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels)
    {
      i = localDisplayMetrics.widthPixels;
      if (localDisplayMetrics.widthPixels >= localDisplayMetrics.heightPixels) {
        break label133;
      }
    }
    label133:
    for (int j = localDisplayMetrics.heightPixels;; j = localDisplayMetrics.widthPixels)
    {
      int k = Math.min(getScaledSize(i, localDisplayMetrics.density, 480, 800), localDisplayMetrics.widthPixels);
      int m = Math.min(getScaledSize(j, localDisplayMetrics.density, 800, 1280), localDisplayMetrics.heightPixels);
      getWindow().setLayout(k, m);
      return;
      i = localDisplayMetrics.heightPixels;
      break;
    }
  }
  
  private void createCrossImage()
  {
    this.crossImageView = new ImageView(getContext());
    this.crossImageView.setOnClickListener(new WebDialog.3(this));
    Drawable localDrawable = getContext().getResources().getDrawable(R.drawable.com_facebook_close);
    this.crossImageView.setImageDrawable(localDrawable);
    this.crossImageView.setVisibility(4);
  }
  
  private int getScaledSize(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    double d = 0.5D;
    int i = (int)(paramInt1 / paramFloat);
    if (i <= paramInt2) {
      d = 1.0D;
    }
    for (;;)
    {
      return (int)(d * paramInt1);
      if (i < paramInt3) {
        d += d * ((paramInt3 - i) / (paramInt3 - paramInt2));
      }
    }
  }
  
  private void sendCancelToListener()
  {
    sendErrorToListener(new FacebookOperationCanceledException());
  }
  
  private void sendErrorToListener(Throwable paramThrowable)
  {
    if ((this.onCompleteListener != null) && (!this.listenerCalled))
    {
      this.listenerCalled = true;
      if (!(paramThrowable instanceof FacebookException)) {
        break label43;
      }
    }
    label43:
    for (FacebookException localFacebookException = (FacebookException)paramThrowable;; localFacebookException = new FacebookException(paramThrowable))
    {
      this.onCompleteListener.onComplete(null, localFacebookException);
      return;
    }
  }
  
  private void sendSuccessToListener(Bundle paramBundle)
  {
    if ((this.onCompleteListener != null) && (!this.listenerCalled))
    {
      this.listenerCalled = true;
      this.onCompleteListener.onComplete(paramBundle, null);
    }
  }
  
  private void setUpWebView(int paramInt)
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    this.webView = new WebView(getContext());
    this.webView.setVerticalScrollBarEnabled(false);
    this.webView.setHorizontalScrollBarEnabled(false);
    this.webView.setWebViewClient(new WebDialog.DialogWebViewClient(this, null));
    this.webView.getSettings().setJavaScriptEnabled(true);
    this.webView.loadUrl(this.url);
    this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    this.webView.setVisibility(4);
    this.webView.getSettings().setSavePassword(false);
    localLinearLayout.setPadding(paramInt, paramInt, paramInt, paramInt);
    localLinearLayout.addView(this.webView);
    localLinearLayout.setBackgroundColor(-872415232);
    this.contentFrameLayout.addView(localLinearLayout);
  }
  
  public void dismiss()
  {
    if (this.webView != null) {
      this.webView.stopLoading();
    }
    if (!this.isDetached)
    {
      if (this.spinner.isShowing()) {
        this.spinner.dismiss();
      }
      super.dismiss();
    }
  }
  
  public WebDialog.OnCompleteListener getOnCompleteListener()
  {
    return this.onCompleteListener;
  }
  
  public void onAttachedToWindow()
  {
    this.isDetached = false;
    super.onAttachedToWindow();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setOnCancelListener(new WebDialog.1(this));
    this.spinner = new ProgressDialog(getContext());
    this.spinner.requestWindowFeature(1);
    this.spinner.setMessage(getContext().getString(R.string.com_facebook_loading));
    this.spinner.setOnCancelListener(new WebDialog.2(this));
    requestWindowFeature(1);
    this.contentFrameLayout = new FrameLayout(getContext());
    calculateSize();
    getWindow().setGravity(17);
    getWindow().setSoftInputMode(16);
    createCrossImage();
    setUpWebView(1 + this.crossImageView.getDrawable().getIntrinsicWidth() / 2);
    this.contentFrameLayout.addView(this.crossImageView, new ViewGroup.LayoutParams(-2, -2));
    setContentView(this.contentFrameLayout);
  }
  
  public void onDetachedFromWindow()
  {
    this.isDetached = true;
    super.onDetachedFromWindow();
  }
  
  public void setOnCompleteListener(WebDialog.OnCompleteListener paramOnCompleteListener)
  {
    this.onCompleteListener = paramOnCompleteListener;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.WebDialog
 * JD-Core Version:    0.7.0.1
 */