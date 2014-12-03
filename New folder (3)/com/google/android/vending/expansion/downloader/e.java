package com.google.android.vending.expansion.downloader;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;

final class e
  extends Handler
{
  e(d paramd) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
    case 11: 
      Bundle localBundle;
      do
      {
        return;
        localBundle = paramMessage.getData();
      } while (this.a.c == null);
      localBundle.setClassLoader(this.a.c.getClassLoader());
      DownloadProgressInfo localDownloadProgressInfo = (DownloadProgressInfo)paramMessage.getData().getParcelable("progress");
      this.a.a.a(localDownloadProgressInfo);
      return;
    case 10: 
      this.a.a.a(paramMessage.getData().getInt("newState"));
      return;
    }
    this.a.a.a((Messenger)paramMessage.getData().getParcelable("EMH"));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.vending.expansion.downloader.e
 * JD-Core Version:    0.7.0.1
 */