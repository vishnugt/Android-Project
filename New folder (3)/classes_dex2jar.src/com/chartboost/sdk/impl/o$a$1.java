package com.chartboost.sdk.impl;

import android.os.Bundle;
import android.widget.ImageView;
import com.chartboost.sdk.Libraries.a;
import com.chartboost.sdk.Libraries.a.a;
import java.lang.ref.WeakReference;

class o$a$1
  implements Runnable
{
  o$a$1(o.a parama, a.a parama1) {}
  
  public void run()
  {
    if (o.a.a(this.a) != null) {}
    for (boolean bool = o.a.a(this.a).getBoolean("paramNoMemoryCache");; bool = false)
    {
      try
      {
        if ((this.b != null) && (!bool)) {
          o.a(o.a.e(this.a)).a(o.a.b(this.a), this.b);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          ImageView localImageView;
          o.a locala;
          localException.printStackTrace();
        }
      }
      if (o.a.c(this.a) != null)
      {
        localImageView = (ImageView)o.a.c(this.a).get();
        locala = o.a(localImageView);
        if (this.a == locala) {
          localImageView.setImageBitmap(this.b.b());
        }
      }
      if (o.a.d(this.a) != null) {
        o.a.d(this.a).a(this.b, o.a.a(this.a));
      }
      return;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.o.a.1
 * JD-Core Version:    0.7.0.1
 */