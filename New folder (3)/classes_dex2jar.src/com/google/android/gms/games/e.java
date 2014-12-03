package com.google.android.gms.games;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

public final class e
{
  public final Context a;
  public String b;
  public String c = "<<default account>>";
  public final c d;
  public final d e;
  public String[] f = { "https://www.googleapis.com/auth/games" };
  public int g = 49;
  public View h;
  
  public e(Context paramContext, c paramc, d paramd)
  {
    this.a = paramContext;
    this.b = paramContext.getPackageName();
    this.d = paramc;
    this.e = paramd;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.e
 * JD-Core Version:    0.7.0.1
 */