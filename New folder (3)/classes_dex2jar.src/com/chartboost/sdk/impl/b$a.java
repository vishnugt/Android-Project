package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Libraries.a.a;
import com.chartboost.sdk.c.b;
import org.json.JSONObject;

public class b$a
  extends c.b
{
  public ImageView c;
  public ImageView d;
  public Button e;
  public v f;
  
  private b$a(b paramb, Context paramContext)
  {
    super(paramb, paramContext);
    setBackgroundColor(0);
    setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    this.f = new v(paramContext);
    this.d = new ImageView(paramContext);
    this.e = new Button(paramContext);
    this.c = new ImageView(paramContext);
    this.e.setOnClickListener(new b.a.1(this));
    this.d.setClickable(true);
    this.d.setOnClickListener(new b.a.2(this));
    this.f.a(this.c);
    this.f.a(this.d);
    this.f.a(this.e);
    addView(this.f, new RelativeLayout.LayoutParams(-1, -1));
  }
  
  private Point a(String paramString)
  {
    JSONObject localJSONObject1 = b.a(this.g).optJSONObject(paramString);
    if (localJSONObject1 != null)
    {
      JSONObject localJSONObject2 = localJSONObject1.optJSONObject("offset");
      if (localJSONObject2 != null) {
        return new Point(localJSONObject2.optInt("x", 0), localJSONObject2.optInt("y", 0));
      }
    }
    return new Point(0, 0);
  }
  
  protected void a(int paramInt1, int paramInt2)
  {
    boolean bool = Chartboost.sharedChartboost().getOrientation().isPortrait();
    a.a locala1;
    a.a locala2;
    label36:
    RelativeLayout.LayoutParams localLayoutParams1;
    RelativeLayout.LayoutParams localLayoutParams2;
    RelativeLayout.LayoutParams localLayoutParams3;
    float f1;
    label94:
    String str1;
    if (bool)
    {
      locala1 = this.g.h;
      if (!bool) {
        break label567;
      }
      locala2 = this.g.j;
      localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
      if (!bool) {
        break label579;
      }
      f1 = Math.max(320.0F / paramInt1, 480.0F / paramInt2);
      localLayoutParams1.width = ((int)(locala2.c() / f1));
      localLayoutParams1.height = ((int)(locala2.d() / f1));
      if (!bool) {
        break label597;
      }
      str1 = "frame-portrait";
      label132:
      Point localPoint1 = a(str1);
      localLayoutParams1.leftMargin = Math.round((paramInt1 - localLayoutParams1.width) / 2.0F + localPoint1.x / f1);
      localLayoutParams1.topMargin = Math.round((paramInt2 - localLayoutParams1.height) / 2.0F + localPoint1.y / f1);
      this.d.setId(100);
      localLayoutParams2.width = ((int)(locala1.c() / f1));
      localLayoutParams2.height = ((int)(locala1.d() / f1));
      if (!bool) {
        break label604;
      }
    }
    label567:
    label579:
    label597:
    label604:
    for (String str2 = "ad-portrait";; str2 = "ad-landscape")
    {
      Point localPoint2 = a(str2);
      localLayoutParams2.leftMargin = Math.round((paramInt1 - localLayoutParams2.width) / 2.0F + localPoint2.x / f1);
      localLayoutParams2.topMargin = Math.round((paramInt2 - localLayoutParams2.height) / 2.0F + localPoint2.y / f1);
      localLayoutParams3.width = ((int)(this.g.l.c() / f1));
      localLayoutParams3.height = ((int)(this.g.l.d() / f1));
      Point localPoint3 = a("close");
      localLayoutParams3.leftMargin = (localLayoutParams2.leftMargin + localLayoutParams2.width + Math.round(localPoint3.x / f1 - CBUtility.b(10, getContext())));
      localLayoutParams3.topMargin = (localLayoutParams2.topMargin - localLayoutParams3.height + Math.round(localPoint3.y / f1 - CBUtility.b(10, getContext())));
      this.c.setLayoutParams(localLayoutParams1);
      this.d.setLayoutParams(localLayoutParams2);
      this.e.setLayoutParams(localLayoutParams3);
      BitmapDrawable localBitmapDrawable1 = new BitmapDrawable(locala2.b());
      this.c.setScaleType(ImageView.ScaleType.FIT_CENTER);
      this.c.setImageDrawable(localBitmapDrawable1);
      BitmapDrawable localBitmapDrawable2 = new BitmapDrawable(locala1.b());
      this.d.setScaleType(ImageView.ScaleType.FIT_CENTER);
      this.d.setImageDrawable(localBitmapDrawable2);
      BitmapDrawable localBitmapDrawable3 = new BitmapDrawable(this.g.l.b());
      this.e.setBackgroundDrawable(localBitmapDrawable3);
      return;
      locala1 = this.g.i;
      break;
      locala2 = this.g.k;
      break label36;
      f1 = Math.max(320.0F / paramInt2, 480.0F / paramInt1);
      break label94;
      str1 = "frame-landscape";
      break label132;
    }
  }
  
  public void b()
  {
    super.b();
    this.d = null;
    this.c = null;
    this.e = null;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.b.a
 * JD-Core Version:    0.7.0.1
 */