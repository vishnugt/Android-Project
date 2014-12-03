package android.support.v4.app;

import java.io.PrintWriter;
import java.util.ArrayList;

final class a
  extends o
  implements Runnable
{
  final j a;
  b b;
  b c;
  int d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  boolean k;
  boolean l = true;
  String m;
  boolean n;
  int o;
  int p;
  CharSequence q;
  int r;
  CharSequence s;
  
  public a(j paramj)
  {
    this.a = paramj;
  }
  
  public final void a()
  {
    if (j.a) {
      new StringBuilder("popFromBackStack: ").append(this).toString();
    }
    a(-1);
    b localb = this.c;
    if (localb != null)
    {
      switch (localb.c)
      {
      default: 
        throw new IllegalArgumentException("Unknown cmd: " + localb.c);
      case 1: 
        Fragment localFragment8 = localb.d;
        localFragment8.mNextAnim = localb.h;
        this.a.a(localFragment8, j.c(this.i), this.j);
      }
      for (;;)
      {
        localb = localb.b;
        break;
        Fragment localFragment6 = localb.d;
        if (localFragment6 != null)
        {
          localFragment6.mNextAnim = localb.h;
          this.a.a(localFragment6, j.c(this.i), this.j);
        }
        if (localb.i != null)
        {
          for (int i1 = 0; i1 < localb.i.size(); i1++)
          {
            Fragment localFragment7 = (Fragment)localb.i.get(i1);
            localFragment7.mNextAnim = localb.g;
            this.a.a(localFragment7, false);
          }
          Fragment localFragment5 = localb.d;
          localFragment5.mNextAnim = localb.g;
          this.a.a(localFragment5, false);
          continue;
          Fragment localFragment4 = localb.d;
          localFragment4.mNextAnim = localb.g;
          this.a.c(localFragment4, j.c(this.i), this.j);
          continue;
          Fragment localFragment3 = localb.d;
          localFragment3.mNextAnim = localb.h;
          this.a.b(localFragment3, j.c(this.i), this.j);
          continue;
          Fragment localFragment2 = localb.d;
          localFragment2.mNextAnim = localb.g;
          this.a.e(localFragment2, j.c(this.i), this.j);
          continue;
          Fragment localFragment1 = localb.d;
          localFragment1.mNextAnim = localb.g;
          this.a.d(localFragment1, j.c(this.i), this.j);
        }
      }
    }
    this.a.a(this.a.n, j.c(this.i), this.j, true);
    if (this.o >= 0)
    {
      this.a.b(this.o);
      this.o = -1;
    }
  }
  
  final void a(int paramInt)
  {
    if (!this.k) {}
    for (;;)
    {
      return;
      if (j.a) {
        new StringBuilder("Bump nesting in ").append(this).append(" by ").append(paramInt).toString();
      }
      for (b localb = this.b; localb != null; localb = localb.a)
      {
        if (localb.d != null)
        {
          Fragment localFragment2 = localb.d;
          localFragment2.mBackStackNesting = (paramInt + localFragment2.mBackStackNesting);
          if (j.a) {
            new StringBuilder("Bump nesting of ").append(localb.d).append(" to ").append(localb.d.mBackStackNesting).toString();
          }
        }
        if (localb.i != null) {
          for (int i1 = -1 + localb.i.size(); i1 >= 0; i1--)
          {
            Fragment localFragment1 = (Fragment)localb.i.get(i1);
            localFragment1.mBackStackNesting = (paramInt + localFragment1.mBackStackNesting);
            if (j.a) {
              new StringBuilder("Bump nesting of ").append(localFragment1).append(" to ").append(localFragment1.mBackStackNesting).toString();
            }
          }
        }
      }
    }
  }
  
  final void a(b paramb)
  {
    if (this.b == null)
    {
      this.c = paramb;
      this.b = paramb;
    }
    for (;;)
    {
      paramb.e = this.e;
      paramb.f = this.f;
      paramb.g = this.g;
      paramb.h = this.h;
      this.d = (1 + this.d);
      return;
      paramb.b = this.c;
      this.c.a = paramb;
      this.c = paramb;
    }
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mName=");
    paramPrintWriter.print(this.m);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.o);
    paramPrintWriter.print(" mCommitted=");
    paramPrintWriter.println(this.n);
    if (this.i != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTransition=#");
      paramPrintWriter.print(Integer.toHexString(this.i));
      paramPrintWriter.print(" mTransitionStyle=#");
      paramPrintWriter.println(Integer.toHexString(this.j));
    }
    if ((this.e != 0) || (this.f != 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mEnterAnim=#");
      paramPrintWriter.print(Integer.toHexString(this.e));
      paramPrintWriter.print(" mExitAnim=#");
      paramPrintWriter.println(Integer.toHexString(this.f));
    }
    if ((this.g != 0) || (this.h != 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mPopEnterAnim=#");
      paramPrintWriter.print(Integer.toHexString(this.g));
      paramPrintWriter.print(" mPopExitAnim=#");
      paramPrintWriter.println(Integer.toHexString(this.h));
    }
    if ((this.p != 0) || (this.q != null))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mBreadCrumbTitleRes=#");
      paramPrintWriter.print(Integer.toHexString(this.p));
      paramPrintWriter.print(" mBreadCrumbTitleText=");
      paramPrintWriter.println(this.q);
    }
    if ((this.r != 0) || (this.s != null))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
      paramPrintWriter.print(Integer.toHexString(this.r));
      paramPrintWriter.print(" mBreadCrumbShortTitleText=");
      paramPrintWriter.println(this.s);
    }
    if (this.b != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str = paramString + "    ";
      for (b localb = this.b; localb != null; localb = localb.a)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(0);
        paramPrintWriter.println(":");
        paramPrintWriter.print(str);
        paramPrintWriter.print("cmd=");
        paramPrintWriter.print(localb.c);
        paramPrintWriter.print(" fragment=");
        paramPrintWriter.println(localb.d);
        if ((localb.e != 0) || (localb.f != 0))
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("enterAnim=#");
          paramPrintWriter.print(Integer.toHexString(localb.e));
          paramPrintWriter.print(" exitAnim=#");
          paramPrintWriter.println(Integer.toHexString(localb.f));
        }
        if ((localb.g != 0) || (localb.h != 0))
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("popEnterAnim=#");
          paramPrintWriter.print(Integer.toHexString(localb.g));
          paramPrintWriter.print(" popExitAnim=#");
          paramPrintWriter.println(Integer.toHexString(localb.h));
        }
        if ((localb.i != null) && (localb.i.size() > 0))
        {
          int i1 = 0;
          if (i1 < localb.i.size())
          {
            paramPrintWriter.print(str);
            if (localb.i.size() == 1) {
              paramPrintWriter.print("Removed: ");
            }
            for (;;)
            {
              paramPrintWriter.println(localb.i.get(i1));
              i1++;
              break;
              paramPrintWriter.println("Removed:");
              paramPrintWriter.print(str);
              paramPrintWriter.print("  #");
              paramPrintWriter.print(0);
              paramPrintWriter.print(": ");
            }
          }
        }
      }
    }
  }
  
  public final void run()
  {
    if (j.a) {
      new StringBuilder("Run: ").append(this).toString();
    }
    if ((this.k) && (this.o < 0)) {
      throw new IllegalStateException("addToBackStack() called after commit()");
    }
    a(1);
    b localb = this.b;
    if (localb != null)
    {
      switch (localb.c)
      {
      default: 
        throw new IllegalArgumentException("Unknown cmd: " + localb.c);
      case 1: 
        Fragment localFragment9 = localb.d;
        localFragment9.mNextAnim = localb.e;
        this.a.a(localFragment9, false);
      }
      for (;;)
      {
        localb = localb.a;
        break;
        Fragment localFragment6 = localb.d;
        Fragment localFragment7;
        if (this.a.g != null)
        {
          int i1 = 0;
          localFragment7 = localFragment6;
          if (i1 < this.a.g.size())
          {
            Fragment localFragment8 = (Fragment)this.a.g.get(i1);
            if (j.a) {
              new StringBuilder("OP_REPLACE: adding=").append(localFragment7).append(" old=").append(localFragment8).toString();
            }
            if ((localFragment7 == null) || (localFragment8.mContainerId == localFragment7.mContainerId))
            {
              if (localFragment8 != localFragment7) {
                break label298;
              }
              localFragment7 = null;
              localb.d = null;
            }
            for (;;)
            {
              i1++;
              break;
              label298:
              if (localb.i == null) {
                localb.i = new ArrayList();
              }
              localb.i.add(localFragment8);
              localFragment8.mNextAnim = localb.f;
              if (this.k)
              {
                localFragment8.mBackStackNesting = (1 + localFragment8.mBackStackNesting);
                if (j.a) {
                  new StringBuilder("Bump nesting of ").append(localFragment8).append(" to ").append(localFragment8.mBackStackNesting).toString();
                }
              }
              this.a.a(localFragment8, this.i, this.j);
            }
          }
        }
        else
        {
          localFragment7 = localFragment6;
        }
        if (localFragment7 != null)
        {
          localFragment7.mNextAnim = localb.e;
          this.a.a(localFragment7, false);
          continue;
          Fragment localFragment5 = localb.d;
          localFragment5.mNextAnim = localb.f;
          this.a.a(localFragment5, this.i, this.j);
          continue;
          Fragment localFragment4 = localb.d;
          localFragment4.mNextAnim = localb.f;
          this.a.b(localFragment4, this.i, this.j);
          continue;
          Fragment localFragment3 = localb.d;
          localFragment3.mNextAnim = localb.e;
          this.a.c(localFragment3, this.i, this.j);
          continue;
          Fragment localFragment2 = localb.d;
          localFragment2.mNextAnim = localb.f;
          this.a.d(localFragment2, this.i, this.j);
          continue;
          Fragment localFragment1 = localb.d;
          localFragment1.mNextAnim = localb.e;
          this.a.e(localFragment1, this.i, this.j);
        }
      }
    }
    this.a.a(this.a.n, this.i, this.j, true);
    if (this.k) {
      this.a.a(this);
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.a
 * JD-Core Version:    0.7.0.1
 */