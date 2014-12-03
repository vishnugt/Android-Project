package com.chartboost.sdk.impl;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.List;

public class s
{
  private ScrollView a;
  private HorizontalScrollView b;
  private ViewGroup c;
  private LinearLayout d;
  private BaseAdapter e;
  private List<List<View>> f;
  private List<List<View>> g;
  private List<Integer> h;
  private int i;
  private DataSetObserver j = new s.1(this);
  
  public s(Context paramContext, int paramInt)
  {
    this.d = new LinearLayout(paramContext);
    this.i = paramInt;
    this.d.setOrientation(paramInt);
    if (paramInt == 0) {}
    for (this.c = a(paramContext);; this.c = b(paramContext))
    {
      this.c.addView(this.d);
      this.f = new ArrayList();
      this.g = new ArrayList();
      this.h = new ArrayList();
      this.d.setOnTouchListener(new s.2(this));
      return;
    }
  }
  
  private HorizontalScrollView a(Context paramContext)
  {
    if (this.b == null)
    {
      this.b = new HorizontalScrollView(paramContext);
      this.b.setFillViewport(true);
    }
    return this.b;
  }
  
  private ScrollView b(Context paramContext)
  {
    if (this.a == null)
    {
      this.a = new ScrollView(paramContext);
      this.a.setFillViewport(true);
    }
    return this.a;
  }
  
  private Context d()
  {
    return this.d.getContext();
  }
  
  public ViewGroup a()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    if (paramInt != this.i)
    {
      this.i = paramInt;
      this.d.setOrientation(paramInt);
      this.c.removeView(this.d);
      if (paramInt != 0) {
        break label60;
      }
    }
    label60:
    for (this.c = a(d());; this.c = b(d()))
    {
      this.c.addView(this.d);
      return;
    }
  }
  
  public void a(BaseAdapter paramBaseAdapter)
  {
    if (this.e != null) {
      this.e.unregisterDataSetObserver(this.j);
    }
    this.e = paramBaseAdapter;
    this.e.registerDataSetObserver(this.j);
    this.d.removeAllViews();
    this.f.clear();
    this.g.clear();
    for (int k = 0;; k++)
    {
      if (k >= this.e.getViewTypeCount())
      {
        this.h.clear();
        this.e.notifyDataSetChanged();
        return;
      }
      this.f.add(new ArrayList());
      this.g.add(new ArrayList());
    }
  }
  
  public LinearLayout b()
  {
    return this.d;
  }
  
  public void c()
  {
    if ((this.c == this.a) && (this.a != null)) {
      this.a.fullScroll(130);
    }
    while ((this.c != this.b) || (this.b == null)) {
      return;
    }
    this.b.fullScroll(66);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.s
 * JD-Core Version:    0.7.0.1
 */