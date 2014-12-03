package com.jirbo.adcolony;

import java.util.ArrayList;
import java.util.Iterator;

final class ck
{
  static String a = new String("mutex");
  static ArrayList<cl> b = new ArrayList();
  static ArrayList<cl> c = new ArrayList();
  static ArrayList<Runnable> d = new ArrayList();
  static ArrayList<Runnable> e = new ArrayList();
  static volatile boolean f;
  
  static void a()
  {
    synchronized (a)
    {
      f = true;
      Iterator localIterator1 = b.iterator();
      while (localIterator1.hasNext()) {
        synchronized ((cl)localIterator1.next())
        {
          ???.notify();
        }
      }
    }
    synchronized (a)
    {
      b.clear();
      synchronized (a)
      {
        d.clear();
      }
    }
    synchronized (a)
    {
      f = false;
      e.clear();
      e.addAll(d);
      d.clear();
      c.clear();
      Iterator localIterator2 = e.iterator();
      while (localIterator2.hasNext())
      {
        a((Runnable)localIterator2.next());
        continue;
        localObject2 = finally;
        throw localObject2;
        localObject3 = finally;
        throw localObject3;
      }
    }
  }
  
  static void a(Runnable paramRunnable)
  {
    for (;;)
    {
      cl localcl2;
      synchronized (a)
      {
        if (f)
        {
          d.add(paramRunnable);
          return;
        }
        int i = b.size();
        if (i <= 0) {
          break label135;
        }
        localcl1 = (cl)b.remove(i - 1);
        if (localcl1 != null) {
          break label109;
        }
        localcl2 = new cl();
      }
      synchronized (a)
      {
        c.add(localcl2);
        localcl2.a = paramRunnable;
        localcl2.start();
        return;
        localObject1 = finally;
        throw localObject1;
      }
      try
      {
        label109:
        localcl1.a = paramRunnable;
        localcl1.notify();
        return;
      }
      finally
      {
        localObject3 = finally;
        throw localObject3;
      }
      label135:
      cl localcl1 = null;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ck
 * JD-Core Version:    0.7.0.1
 */