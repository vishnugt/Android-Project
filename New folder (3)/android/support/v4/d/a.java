package android.support.v4.d;

import android.graphics.Canvas;
import android.os.Build.VERSION;

public final class a
{
  private static final d b = new b();
  private Object a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      b = new c();
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    b.a(this.a, paramInt1, paramInt2);
  }
  
  public final boolean a()
  {
    return b.a(this.a);
  }
  
  public final boolean a(float paramFloat)
  {
    return b.a(this.a, paramFloat);
  }
  
  public final boolean a(Canvas paramCanvas)
  {
    return b.a(this.a, paramCanvas);
  }
  
  public final void b()
  {
    b.b(this.a);
  }
  
  public final boolean c()
  {
    return b.c(this.a);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.a
 * JD-Core Version:    0.7.0.1
 */