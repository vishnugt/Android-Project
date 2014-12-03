package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Environment;
import com.chartboost.sdk.Chartboost;
import java.io.File;

class o$d
{
  private File a = null;
  private File b = null;
  private File c = null;
  
  public o$d(Context paramContext)
  {
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    for (;;)
    {
      try
      {
        if (paramContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
          continue;
        }
        i = 1;
        if ((i != 0) && (Environment.getExternalStorageState().equals("mounted"))) {
          this.b = paramContext.getExternalFilesDir("cache");
        }
        if (this.b != null)
        {
          this.b = new File(this.b, "__chartboost");
          this.b = new File(this.b, "images");
          if ((this.b != null) && (!this.b.exists())) {
            this.b.mkdirs();
          }
        }
      }
      catch (Exception localException)
      {
        int i;
        this.b = null;
        continue;
        File localFile = this.c;
        continue;
      }
      this.c = paramContext.getCacheDir();
      if (this.c != null)
      {
        this.c = new File(this.c, "__chartboost");
        this.c = new File(this.c, "images");
        if (!this.c.exists()) {
          this.c.mkdirs();
        }
      }
      if (this.b == null) {
        continue;
      }
      localFile = this.b;
      this.a = localFile;
      return;
      i = 0;
    }
  }
  
  public File a(String paramString)
  {
    if (this.a == null) {
      a(Chartboost.sharedChartboost().getContext());
    }
    if (this.a == null) {
      return null;
    }
    return new File(this.a, paramString);
  }
  
  public void a()
  {
    int i = 0;
    if (this.a == null) {
      return;
    }
    for (;;)
    {
      int k;
      int m;
      try
      {
        File[] arrayOfFile2;
        if (this.b != null)
        {
          arrayOfFile2 = this.b.listFiles();
          if (arrayOfFile2 != null)
          {
            k = arrayOfFile2.length;
            m = 0;
            break label101;
          }
        }
        if (this.c == null) {
          break;
        }
        File[] arrayOfFile1 = this.c.listFiles();
        if (arrayOfFile1 == null) {
          break;
        }
        int j = arrayOfFile1.length;
        if (i >= j) {
          break;
        }
        arrayOfFile1[i].delete();
        i++;
        continue;
        arrayOfFile2[m].delete();
        m++;
      }
      catch (Exception localException)
      {
        return;
      }
      label101:
      if (m < k) {}
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.o.d
 * JD-Core Version:    0.7.0.1
 */