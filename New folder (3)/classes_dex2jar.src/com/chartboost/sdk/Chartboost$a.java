package com.chartboost.sdk;

class Chartboost$a
  implements Runnable
{
  private int b;
  private int c;
  private int d;
  private int e;
  
  private Chartboost$a(Chartboost paramChartboost)
  {
    int j;
    int k;
    label35:
    int m;
    if (Chartboost.a(paramChartboost) == null)
    {
      j = i;
      this.b = j;
      if (paramChartboost.a != null) {
        break label81;
      }
      k = i;
      this.c = k;
      if (Chartboost.b(paramChartboost) != null) {
        break label93;
      }
      m = i;
      label51:
      this.d = m;
      if (Chartboost.c(paramChartboost) != null) {
        break label105;
      }
    }
    for (;;)
    {
      this.e = i;
      return;
      j = Chartboost.a(paramChartboost).hashCode();
      break;
      label81:
      k = paramChartboost.a.hashCode();
      break label35;
      label93:
      m = Chartboost.b(paramChartboost).hashCode();
      break label51;
      label105:
      i = Chartboost.c(paramChartboost).hashCode();
    }
  }
  
  public void run()
  {
    if (this.a.getContext() != null) {
      this.a.clearImageCache();
    }
    if ((this.a.a != null) && (this.a.a.hashCode() == this.c)) {
      this.a.a = null;
    }
    if ((Chartboost.a(this.a) != null) && (Chartboost.a(this.a).hashCode() == this.b)) {
      Chartboost.a(this.a, null);
    }
    if ((Chartboost.b(this.a) != null) && (Chartboost.b(this.a).hashCode() == this.d)) {
      Chartboost.a(this.a, null);
    }
    if ((Chartboost.c(this.a) != null) && (Chartboost.c(this.a).hashCode() == this.e)) {
      Chartboost.a(this.a, null);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Chartboost.a
 * JD-Core Version:    0.7.0.1
 */