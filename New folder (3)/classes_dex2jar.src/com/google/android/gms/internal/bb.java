package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class bb
  extends WebChromeClient
{
  private final ax a;
  
  public bb(ax paramax)
  {
    this.a = paramax;
  }
  
  private static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
    localBuilder.setTitle(paramString1);
    if (paramBoolean)
    {
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      localLinearLayout.setOrientation(1);
      TextView localTextView = new TextView(paramContext);
      localTextView.setText(paramString2);
      EditText localEditText = new EditText(paramContext);
      localEditText.setText(paramString3);
      localLinearLayout.addView(localTextView);
      localLinearLayout.addView(localEditText);
      localBuilder.setView(localLinearLayout).setPositiveButton(17039370, new bj(paramJsPromptResult, localEditText)).setNegativeButton(17039360, new bi(paramJsPromptResult)).setOnCancelListener(new bg(paramJsPromptResult)).create().show();
      return true;
    }
    localBuilder.setMessage(paramString2).setPositiveButton(17039370, new bf(paramJsResult)).setNegativeButton(17039360, new bd(paramJsResult)).setOnCancelListener(new bc(paramJsResult)).create().show();
    return true;
  }
  
  protected final void a(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    p localp = this.a.c();
    if (localp == null)
    {
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    localp.a(paramView, paramCustomViewCallback);
    localp.a(paramInt);
  }
  
  public final void onCloseWindow(WebView paramWebView)
  {
    if (!(paramWebView instanceof ax)) {}
    p localp;
    do
    {
      return;
      localp = ((ax)paramWebView).c();
    } while (localp == null);
    localp.a();
  }
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    new StringBuilder("JS: ").append(paramConsoleMessage.message()).append(" (").append(paramConsoleMessage.sourceId()).append(":").append(paramConsoleMessage.lineNumber()).append(")").toString();
    paramConsoleMessage.messageLevel().ordinal();
    return super.onConsoleMessage(paramConsoleMessage);
  }
  
  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l = 5242880L - paramLong3;
    if (l <= 0L)
    {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    }
    if (paramLong1 == 0L)
    {
      if ((paramLong2 <= l) && (paramLong2 <= 1048576L)) {}
      for (;;)
      {
        paramQuotaUpdater.updateQuota(paramLong2);
        return;
        paramLong2 = 0L;
      }
    }
    if (paramLong2 == 0L) {
      paramLong1 = Math.min(paramLong1 + Math.min(131072L, l), 1048576L);
    }
    for (;;)
    {
      paramLong2 = paramLong1;
      break;
      if (paramLong2 <= Math.min(1048576L - paramLong1, l)) {
        paramLong1 += paramLong2;
      }
    }
  }
  
  public final void onHideCustomView()
  {
    p localp = this.a.c();
    if (localp == null) {
      return;
    }
    localp.c();
  }
  
  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(paramWebView.getContext(), paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(paramWebView.getContext(), paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(paramWebView.getContext(), paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return a(paramWebView.getContext(), paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }
  
  public final void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l1 = 5242880L - paramLong2;
    long l2 = 131072L + paramLong1;
    if (l1 < l2)
    {
      paramQuotaUpdater.updateQuota(0L);
      return;
    }
    paramQuotaUpdater.updateQuota(l2);
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    a(paramView, -1, paramCustomViewCallback);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bb
 * JD-Core Version:    0.7.0.1
 */