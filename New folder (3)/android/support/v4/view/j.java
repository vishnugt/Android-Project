package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class j
{
  static final m a = new k();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new l();
      return;
    }
  }
  
  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.a(paramVelocityTracker, paramInt);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.j
 * JD-Core Version:    0.7.0.1
 */