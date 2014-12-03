package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ArrayAdapter;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBOrientation.Difference;
import java.util.List;
import org.json.JSONObject;

public class h$a$a
  extends ArrayAdapter<JSONObject>
{
  Context a;
  
  public h$a$a(h.a parama, Context paramContext)
  {
    super(paramContext, 0, h.a(h.a.b(parama)));
    this.a = paramContext;
  }
  
  public JSONObject a(int paramInt)
  {
    return (JSONObject)h.a(h.a.b(this.b)).get(paramInt);
  }
  
  public int getCount()
  {
    return h.a(h.a.b(this.b)).size();
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    CBOrientation.Difference localDifference = Chartboost.sharedChartboost().getForcedOrientationDifference();
    if (localDifference.isReverse()) {
      paramInt = -1 + getCount() - paramInt;
    }
    JSONObject localJSONObject = a(paramInt);
    String str = localJSONObject.optString("type", "");
    Object localObject;
    v localv;
    label88:
    c localc;
    if (paramView == null) {
      if (str.equals("featured"))
      {
        localObject = new d(this.a);
        localv = new v(this.a, (View)localObject);
        ((h.b)localObject).a(localJSONObject, paramInt);
        localc = (c)localObject;
        if (!localDifference.isOdd()) {
          break label261;
        }
        localv.setLayoutParams(new AbsListView.LayoutParams(((h.b)localObject).a(), -1));
      }
    }
    for (;;)
    {
      h.a.a.1 local1 = new h.a.a.1(this, localJSONObject);
      localc.a = local1;
      localc.setOnClickListener(local1);
      if ((localObject instanceof e)) {
        ((e)localObject).b.setOnClickListener(local1);
      }
      return localv;
      if (str.equals("regular"))
      {
        localObject = new e(this.a);
        break;
      }
      boolean bool = str.equals("webview");
      localObject = null;
      if (!bool) {
        break;
      }
      localObject = new i(this.a);
      break;
      localv = (v)paramView;
      localObject = (h.b)localv.a();
      break label88;
      label261:
      localv.setLayoutParams(new AbsListView.LayoutParams(-1, ((h.b)localObject).a()));
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.h.a.a
 * JD-Core Version:    0.7.0.1
 */