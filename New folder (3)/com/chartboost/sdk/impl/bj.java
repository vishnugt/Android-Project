package com.chartboost.sdk.impl;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class bj<T>
{
  final int a;
  private Queue<T> b = new ConcurrentLinkedQueue();
  
  public bj(int paramInt)
  {
    this.a = paramInt;
  }
  
  protected boolean a(T paramT)
  {
    return true;
  }
  
  protected abstract T b();
  
  public void b(T paramT)
  {
    if (!a(paramT)) {}
    while (this.b.size() > this.a) {
      return;
    }
    this.b.add(paramT);
  }
  
  public T c()
  {
    Object localObject = this.b.poll();
    if (localObject != null) {
      return localObject;
    }
    return b();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.bj
 * JD-Core Version:    0.7.0.1
 */