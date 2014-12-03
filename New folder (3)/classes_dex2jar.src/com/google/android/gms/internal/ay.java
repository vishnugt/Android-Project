package com.google.android.gms.internal;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ay
  extends WebViewClient
{
  protected final ax a;
  private final HashMap<String, k> b = new HashMap();
  private final Object c = new Object();
  private ew d;
  private u e;
  private ba f;
  private b g;
  private boolean h = false;
  private boolean i;
  private ab j;
  
  public ay(ax paramax, boolean paramBoolean)
  {
    this.a = paramax;
    this.i = paramBoolean;
  }
  
  private void a(Uri paramUri)
  {
    String str = paramUri.getPath();
    k localk = (k)this.b.get(str);
    if (localk != null)
    {
      HashMap localHashMap = new HashMap();
      UrlQuerySanitizer localUrlQuerySanitizer = new UrlQuerySanitizer();
      localUrlQuerySanitizer.setAllowUnregisteredParamaters(true);
      localUrlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
      localUrlQuerySanitizer.parseUrl(paramUri.toString());
      Iterator localIterator = localUrlQuerySanitizer.getParameterList().iterator();
      while (localIterator.hasNext())
      {
        UrlQuerySanitizer.ParameterValuePair localParameterValuePair = (UrlQuerySanitizer.ParameterValuePair)localIterator.next();
        localHashMap.put(localParameterValuePair.mParameter, localParameterValuePair.mValue);
      }
      localk.a(this.a, localHashMap);
      return;
    }
    new StringBuilder("No GMSG handler found for GMSG: ").append(paramUri).toString();
  }
  
  private void a(bh parambh)
  {
    p.a(this.a.getContext(), parambh);
  }
  
  private void a(String paramString, k paramk)
  {
    this.b.put(paramString, paramk);
  }
  
  public final void a(b paramb, ab paramab)
  {
    a("/appEvent", new a(paramb));
    a("/canOpenURLs", c.a);
    a("/click", c.b);
    a("/close", c.c);
    a("/customClose", c.d);
    a("/httpTrack", c.e);
    a("/log", c.f);
    a("/open", c.g);
    a("/touch", c.h);
    a("/video", c.i);
    this.d = null;
    this.e = null;
    this.g = paramb;
    this.j = paramab;
    this.h = true;
  }
  
  public final void a(ba paramba)
  {
    this.f = paramba;
  }
  
  public final void a(be parambe)
  {
    boolean bool = this.a.h();
    ew localew;
    u localu;
    if ((bool) && (!this.a.d().e))
    {
      localew = null;
      localu = null;
      if (!bool) {
        break label69;
      }
    }
    for (;;)
    {
      a(new bh(parambe, localew, localu, this.j, this.a.g()));
      return;
      localew = this.d;
      break;
      label69:
      localu = this.e;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    if ((this.a.h()) && (!this.a.d().e)) {}
    for (ew localew = null;; localew = this.d)
    {
      a(new bh(localew, this.e, this.j, this.a, paramBoolean, paramInt, this.a.g()));
      return;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    boolean bool = this.a.h();
    ew localew;
    u localu;
    if ((bool) && (!this.a.d().e))
    {
      localew = null;
      localu = null;
      if (!bool) {
        break label85;
      }
    }
    for (;;)
    {
      a(new bh(localew, localu, this.g, this.j, this.a, paramBoolean, paramInt, paramString, this.a.g()));
      return;
      localew = this.d;
      break;
      label85:
      localu = this.e;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = this.a.h();
    ew localew;
    u localu;
    if ((bool) && (!this.a.d().e))
    {
      localew = null;
      localu = null;
      if (!bool) {
        break label87;
      }
    }
    for (;;)
    {
      a(new bh(localew, localu, this.g, this.j, this.a, paramBoolean, paramInt, paramString1, paramString2, this.a.g()));
      return;
      localew = this.d;
      break;
      label87:
      localu = this.e;
    }
  }
  
  public final boolean a()
  {
    synchronized (this.c)
    {
      boolean bool = this.i;
      return bool;
    }
  }
  
  public final void b()
  {
    this.h = false;
  }
  
  public final void c()
  {
    synchronized (this.c)
    {
      this.h = false;
      this.i = true;
      p localp = this.a.c();
      if (localp != null)
      {
        if (!av.a()) {
          av.a.post(new az(this, localp));
        }
      }
      else {
        return;
      }
      localp.j();
    }
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (this.f != null)
    {
      this.f.a(this.a);
      this.f = null;
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    new StringBuilder("AdWebView shouldOverrideUrlLoading: ").append(paramString).toString();
    Object localObject1 = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(((Uri)localObject1).getScheme())) && ("mobileads.google.com".equalsIgnoreCase(((Uri)localObject1).getHost()))) {
      a((Uri)localObject1);
    }
    for (;;)
    {
      return true;
      if (this.h)
      {
        String str = ((Uri)localObject1).getScheme();
        if (("http".equalsIgnoreCase(str)) || ("https".equalsIgnoreCase(str))) {}
        for (int k = 1; k != 0; k = 0) {
          return super.shouldOverrideUrlLoading(paramWebView, paramString);
        }
      }
      if (!this.a.willNotDraw())
      {
        try
        {
          er localer = this.a.f();
          if ((localer != null) && (localer.a((Uri)localObject1)))
          {
            this.a.getContext();
            Uri localUri = localer.b((Uri)localObject1);
            localObject1 = localUri;
          }
          localObject2 = localObject1;
        }
        catch (es locales)
        {
          for (;;)
          {
            new StringBuilder("Unable to append parameter to URL: ").append(paramString).toString();
            Object localObject2 = localObject1;
          }
        }
        a(new be("android.intent.action.VIEW", localObject2.toString(), null, null, null, null, null));
        continue;
      }
      new StringBuilder("AdWebView unable to handle URL: ").append(paramString).toString();
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ay
 * JD-Core Version:    0.7.0.1
 */