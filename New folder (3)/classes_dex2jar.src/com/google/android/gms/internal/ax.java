package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ax
  extends WebView
  implements DownloadListener
{
  private final ay a;
  private final MutableContextWrapper b;
  private final Object c = new Object();
  private final er d;
  private final co e;
  private p f;
  private x g;
  private boolean h;
  private boolean i;
  
  private ax(MutableContextWrapper paramMutableContextWrapper, x paramx, boolean paramBoolean, co paramco)
  {
    super(paramMutableContextWrapper);
    this.b = paramMutableContextWrapper;
    this.g = paramx;
    this.h = true;
    this.d = null;
    this.e = paramco;
    setBackgroundColor(0);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSavePassword(false);
    ar.a(paramMutableContextWrapper, paramco.b, localWebSettings);
    if (Build.VERSION.SDK_INT >= 17)
    {
      at.a(getContext(), localWebSettings);
      localWebSettings.setMediaPlaybackRequiresUserGesture(false);
      setDownloadListener(this);
      if (Build.VERSION.SDK_INT < 11) {
        break label178;
      }
      this.a = new bl(this, paramBoolean);
      label125:
      setWebViewClient(this.a);
      if (Build.VERSION.SDK_INT < 14) {
        break label194;
      }
      setWebChromeClient(new bm(this));
    }
    for (;;)
    {
      i();
      return;
      if (Build.VERSION.SDK_INT < 11) {
        break;
      }
      at.a(getContext(), localWebSettings);
      break;
      label178:
      this.a = new ay(this, paramBoolean);
      break label125;
      label194:
      if (Build.VERSION.SDK_INT >= 11) {
        setWebChromeClient(new bb(this));
      }
    }
  }
  
  public static ax a(Context paramContext, x paramx, boolean paramBoolean, co paramco)
  {
    return new ax(new MutableContextWrapper(paramContext), paramx, paramBoolean, paramco);
  }
  
  private void i()
  {
    for (;;)
    {
      synchronized (this.c)
      {
        if ((this.h) || (this.g.e))
        {
          if (Build.VERSION.SDK_INT < 14)
          {
            j();
            return;
          }
          k();
        }
      }
      if (Build.VERSION.SDK_INT < 18) {
        j();
      } else {
        k();
      }
    }
  }
  
  private void j()
  {
    synchronized (this.c)
    {
      if ((!this.i) && (Build.VERSION.SDK_INT >= 11)) {
        setLayerType(1, null);
      }
      this.i = true;
      return;
    }
  }
  
  private void k()
  {
    synchronized (this.c)
    {
      if ((this.i) && (Build.VERSION.SDK_INT >= 11)) {
        setLayerType(0, null);
      }
      this.i = false;
      return;
    }
  }
  
  public final void a()
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.e.b);
    a("onhide", localHashMap);
  }
  
  public final void a(p paramp)
  {
    synchronized (this.c)
    {
      this.f = paramp;
      return;
    }
  }
  
  public final void a(String paramString, Map<String, ?> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("javascript:AFMA_ReceiveMessage('");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    if (paramMap != null) {}
    try
    {
      String str = ar.a(paramMap).toString();
      localStringBuilder.append(",");
      localStringBuilder.append(str);
      localStringBuilder.append(");");
      new StringBuilder("Dispatching AFMA event: ").append(localStringBuilder).toString();
      loadUrl(localStringBuilder.toString());
      return;
    }
    catch (JSONException localJSONException) {}
  }
  
  public final void a(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      this.h = paramBoolean;
      i();
      return;
    }
  }
  
  public final void b()
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.e.b);
    a("onshow", localHashMap);
  }
  
  public final p c()
  {
    synchronized (this.c)
    {
      p localp = this.f;
      return localp;
    }
  }
  
  public final x d()
  {
    synchronized (this.c)
    {
      x localx = this.g;
      return localx;
    }
  }
  
  public final ay e()
  {
    return this.a;
  }
  
  public final er f()
  {
    return this.d;
  }
  
  public final co g()
  {
    return this.e;
  }
  
  public final boolean h()
  {
    synchronized (this.c)
    {
      boolean bool = this.h;
      return bool;
    }
  }
  
  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(paramString1), paramString4);
      getContext().startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      new StringBuilder("Couldn't find an Activity to view url/mimetype: ").append(paramString1).append(" / ").append(paramString4).toString();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1;
    for (int j = 2147483647;; j = i1)
    {
      int n;
      label237:
      do
      {
        int m;
        for (;;)
        {
          synchronized (this.c)
          {
            if ((isInEditMode()) || (this.h))
            {
              super.onMeasure(paramInt1, paramInt2);
              return;
            }
            int k = View.MeasureSpec.getMode(paramInt1);
            m = View.MeasureSpec.getSize(paramInt1);
            n = View.MeasureSpec.getMode(paramInt2);
            i1 = View.MeasureSpec.getSize(paramInt2);
            if (k == -2147483648) {
              break label237;
            }
            if (k != 1073741824) {
              break;
            }
            break label237;
            if ((this.g.g > i2) || (this.g.d > j))
            {
              new StringBuilder("Not enough space to show ad. Needs ").append(this.g.g).append("x").append(this.g.d).append(", but only has ").append(m).append("x").append(i1).toString();
              if (getVisibility() != 8) {
                setVisibility(4);
              }
              setMeasuredDimension(0, 0);
              return;
            }
          }
          if (getVisibility() != 8) {
            setVisibility(0);
          }
          setMeasuredDimension(this.g.g, this.g.d);
        }
        int i2 = j;
        continue;
        i2 = m;
      } while ((n != -2147483648) && (n != 1073741824));
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.d != null) {
      this.d.b();
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final void setContext(Context paramContext)
  {
    this.b.setBaseContext(paramContext);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ax
 * JD-Core Version:    0.7.0.1
 */