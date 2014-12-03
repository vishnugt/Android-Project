package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

class ai
  extends View
{
  static double i;
  static String j = "";
  static String k = "";
  static boolean l = true;
  static Paint m = new Paint(1);
  static float[] n = new float[80];
  ao a;
  ao b;
  ao c;
  ao d;
  ao e;
  ao f;
  ao g;
  ao h;
  long o = System.currentTimeMillis();
  int p;
  int q;
  int r;
  int s;
  int t;
  int u;
  int v;
  String w;
  dx x;
  
  ai()
  {
    super(a.a());
  }
  
  private static int a(String paramString)
  {
    m.getTextWidths(paramString, n);
    float f1 = 0.0F;
    int i1 = paramString.length();
    for (int i2 = 0; i2 < i1; i2++) {
      f1 += n[i2];
    }
    return (int)f1;
  }
  
  static void a(String paramString, int paramInt1, int paramInt2, Canvas paramCanvas)
  {
    int i1 = paramInt1 - a(paramString) / 2;
    m.setColor(-986896);
    paramCanvas.drawText(paramString, i1 + 1, paramInt2 + 1, m);
    m.setColor(-8355712);
    paramCanvas.drawText(paramString, i1, paramInt2, m);
  }
  
  final void a(String paramString1, String paramString2)
  {
    int i1 = a(paramString1);
    j = "";
    k = "";
    if (i1 > this.a.f - a("WW") - a(paramString2))
    {
      l = false;
      int i2 = 0;
      String str1 = "";
      for (int i3 = 0; i3 < this.a.f - a("WW") - a(paramString2); i3 = a(str1))
      {
        str1 = str1 + paramString1.charAt(i2);
        i2++;
      }
      int i4 = 0;
      int i5 = 0;
      if (i4 < i2)
      {
        String str3;
        if ((str1.charAt(i4) == ' ') && (i4 >= 5))
        {
          str3 = paramString1.substring(0, i4);
          i5 = i4;
        }
        for (;;)
        {
          j = str3;
          i4++;
          break;
          if (i5 < 5) {
            str3 = paramString1.substring(0, i2);
          } else {
            str3 = j;
          }
        }
      }
      if (i5 < 5) {}
      for (String str2 = paramString1.substring(i2);; str2 = paramString1.substring(i5))
      {
        k = str2;
        return;
      }
    }
    l = true;
    j = paramString1;
    k = "";
  }
  
  public final boolean a()
  {
    double d1 = 2.5D;
    double d2 = 0.8D;
    if (this.a != null) {
      return true;
    }
    this.a = new ao(a.c("pre_popup_bg"));
    this.b = new ao(a.c("v4vc_logo"));
    this.c = new ao(a.c("yes_button_normal"));
    this.d = new ao(a.c("yes_button_down"));
    this.e = new ao(a.c("no_button_normal"));
    this.f = new ao(a.c("no_button_down"));
    this.h = new ao(a.c("done_button_normal"));
    this.g = new ao(a.c("done_button_down"));
    Display localDisplay = a.a().getWindowManager().getDefaultDisplay();
    int i1 = localDisplay.getWidth();
    int i2 = localDisplay.getHeight();
    double d3;
    if (i2 > i1)
    {
      d3 = (i2 - i1) / 360.0D;
      if (d3 <= d1) {
        break label345;
      }
    }
    for (;;)
    {
      if (d1 < d2) {}
      for (;;)
      {
        i = d2;
        this.a.a(d2 / 1.8D);
        this.b.a(d2 / 1.8D);
        this.d.a(d2 / 1.8D);
        this.f.a(d2 / 1.8D);
        this.c.a(d2 / 1.8D);
        this.e.a(d2 / 1.8D);
        this.g.a(d2 / 1.8D);
        this.h.a(d2 / 1.8D);
        m.setTextSize((float)(d2 * 18.0D));
        m.setFakeBoldText(true);
        return true;
        d3 = (i1 - i2) / 360.0D;
        break;
        d2 = d1;
      }
      label345:
      d1 = d3;
    }
  }
  
  final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 < paramInt3) {}
    while ((paramInt2 < paramInt4) || (paramInt1 >= paramInt3 + this.c.f) || (paramInt2 >= paramInt4 + this.c.g)) {
      return false;
    }
    return true;
  }
  
  void b()
  {
    Display localDisplay = a.a().getWindowManager().getDefaultDisplay();
    int i1 = localDisplay.getWidth();
    int i2 = localDisplay.getHeight();
    this.p = ((i1 - this.a.f) / 2);
    this.q = (-80 + (i2 - this.a.g) / 2);
    this.r = (this.p + this.a.f / 2);
    this.s = (this.q + this.a.g / 2);
    this.v = (this.q + (int)(this.a.g - (this.c.g + 16.0D * i)));
    this.t = (this.p + (int)(16.0D * i));
    this.u = (this.p + (int)(this.a.f - (this.c.f + 16.0D * i)));
  }
  
  final void b(String paramString, int paramInt1, int paramInt2, Canvas paramCanvas)
  {
    int i1 = paramInt1 + this.c.f / 2;
    int i2 = paramInt2 + this.c.g / 2 + 4 * (int)m.getTextSize() / 10;
    int i3 = i1 - a(paramString) / 2;
    m.setColor(-8355712);
    paramCanvas.drawText(paramString, i3 + 2, i2 + 2, m);
    m.setColor(-1);
    paramCanvas.drawText(paramString, i3, i2, m);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ai
 * JD-Core Version:    0.7.0.1
 */