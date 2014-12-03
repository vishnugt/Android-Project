package com.facebook.internal;

class WorkQueue$WorkNode
  implements WorkQueue.WorkItem
{
  private final Runnable callback;
  private boolean isRunning;
  private WorkNode next;
  private WorkNode prev;
  
  static
  {
    if (!WorkQueue.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  WorkQueue$WorkNode(WorkQueue paramWorkQueue, Runnable paramRunnable)
  {
    this.callback = paramRunnable;
  }
  
  WorkNode addToList(WorkNode paramWorkNode, boolean paramBoolean)
  {
    assert (this.next == null);
    assert (this.prev == null);
    if (paramWorkNode == null)
    {
      this.prev = this;
      this.next = this;
    }
    for (WorkNode localWorkNode2 = this; paramBoolean; localWorkNode2 = paramWorkNode)
    {
      return this;
      this.next = paramWorkNode;
      this.prev = paramWorkNode.prev;
      WorkNode localWorkNode1 = this.next;
      this.prev.next = this;
      localWorkNode1.prev = this;
    }
    return localWorkNode2;
  }
  
  public boolean cancel()
  {
    synchronized (WorkQueue.access$100(this.this$0))
    {
      if (!isRunning())
      {
        WorkQueue.access$202(this.this$0, removeFromList(WorkQueue.access$200(this.this$0)));
        return true;
      }
      return false;
    }
  }
  
  Runnable getCallback()
  {
    return this.callback;
  }
  
  WorkNode getNext()
  {
    return this.next;
  }
  
  public boolean isRunning()
  {
    return this.isRunning;
  }
  
  public void moveToFront()
  {
    synchronized (WorkQueue.access$100(this.this$0))
    {
      if (!isRunning())
      {
        WorkQueue.access$202(this.this$0, removeFromList(WorkQueue.access$200(this.this$0)));
        WorkQueue.access$202(this.this$0, addToList(WorkQueue.access$200(this.this$0), true));
      }
      return;
    }
  }
  
  WorkNode removeFromList(WorkNode paramWorkNode)
  {
    assert (this.next != null);
    assert (this.prev != null);
    if (paramWorkNode == this) {
      if (this.next != this) {
        break label91;
      }
    }
    label91:
    for (paramWorkNode = null;; paramWorkNode = this.next)
    {
      this.next.prev = this.prev;
      this.prev.next = this.next;
      this.prev = null;
      this.next = null;
      return paramWorkNode;
    }
  }
  
  void setIsRunning(boolean paramBoolean)
  {
    this.isRunning = paramBoolean;
  }
  
  void verify(boolean paramBoolean)
  {
    assert (this.prev.next == this);
    assert (this.next.prev == this);
    assert (isRunning() == paramBoolean);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.internal.WorkQueue.WorkNode
 * JD-Core Version:    0.7.0.1
 */