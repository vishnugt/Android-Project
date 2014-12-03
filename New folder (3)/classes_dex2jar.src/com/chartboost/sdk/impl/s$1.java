package com.chartboost.sdk.impl;

import android.database.DataSetObserver;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.List;

class s$1
  extends DataSetObserver
{
  s$1(s params) {}
  
  public void onChanged()
  {
    int i = s.a(this.a).getChildCount();
    int k;
    int m;
    for (int j = 0;; j++)
    {
      if (j >= i)
      {
        s.c(this.a).clear();
        s.a(this.a).removeAllViews();
        k = s.e(this.a).getCount();
        m = 0;
        if (m < k) {
          break;
        }
        s.a(this.a).requestLayout();
        return;
      }
      List localList1 = (List)s.b(this.a).get(((Integer)s.c(this.a).get(j)).intValue());
      List localList2 = (List)s.d(this.a).get(((Integer)s.c(this.a).get(j)).intValue());
      View localView1 = s.a(this.a).getChildAt(j);
      localList1.remove(localView1);
      localList2.add(localView1);
    }
    int n = s.e(this.a).getItemViewType(m);
    List localList3 = (List)s.b(this.a).get(n);
    List localList4 = (List)s.d(this.a).get(n);
    s.c(this.a).add(Integer.valueOf(n));
    boolean bool = localList4.isEmpty();
    View localView2 = null;
    if (!bool)
    {
      localView2 = (View)localList4.get(0);
      localList4.remove(0);
    }
    View localView3 = s.e(this.a).getView(m, localView2, s.a(this.a));
    localList3.add(localView3);
    if (s.f(this.a) == 0) {}
    for (LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);; localLayoutParams = new LinearLayout.LayoutParams(-1, -2))
    {
      if (m < k - 1) {
        localLayoutParams.setMargins(0, 0, 0, 1);
      }
      s.a(this.a).addView(localView3, localLayoutParams);
      m++;
      break;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.s.1
 * JD-Core Version:    0.7.0.1
 */