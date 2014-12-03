package android.support.v4.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class l
  implements Animation.AnimationListener
{
  l(j paramj, Fragment paramFragment) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (this.a.mAnimatingAway != null)
    {
      this.a.mAnimatingAway = null;
      this.b.a(this.a, this.a.mStateAfterAnimating, 0, 0, false);
    }
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.l
 * JD-Core Version:    0.7.0.1
 */