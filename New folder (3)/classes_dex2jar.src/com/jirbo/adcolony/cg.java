package com.jirbo.adcolony;

import android.app.Activity;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public final class cg
{
  g a;
  String b;
  String c;
  String d;
  File e;
  File f;
  
  cg(g paramg)
  {
    this.a = paramg;
  }
  
  static double a(String paramString)
  {
    try
    {
      StatFs localStatFs = new StatFs(paramString);
      long l = localStatFs.getBlockSize();
      int i = localStatFs.getAvailableBlocks();
      return l * i;
    }
    catch (RuntimeException localRuntimeException) {}
    return 0.0D;
  }
  
  static String b()
  {
    return a.a().getFilesDir().getAbsolutePath();
  }
  
  static String c()
  {
    if ("mounted".equals(Environment.getExternalStorageState())) {
      return Environment.getExternalStorageDirectory().getAbsolutePath();
    }
    return null;
  }
  
  final void a()
  {
    if ((this.e == null) || (this.f == null)) {
      return;
    }
    if (!this.e.isDirectory()) {
      this.e.delete();
    }
    if (!this.f.isDirectory()) {
      this.f.delete();
    }
    this.e.mkdirs();
    this.f.mkdirs();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.cg
 * JD-Core Version:    0.7.0.1
 */