package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;

public final class n
{
  static final t a = new o();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if ((i >= 16) || (Build.VERSION.CODENAME.equals("JellyBean")))
    {
      a = new s();
      return;
    }
    if (i >= 14)
    {
      a = new r();
      return;
    }
    if (i >= 11)
    {
      a = new q();
      return;
    }
    if (i >= 9)
    {
      a = new p();
      return;
    }
  }
  
  public static int a(View paramView)
  {
    return a.a(paramView);
  }
  
  public static boolean a(View paramView, int paramInt)
  {
    return a.a(paramView, paramInt);
  }
  
  public static void b(View paramView)
  {
    a.b(paramView);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.n
 * JD-Core Version:    0.7.0.1
 */