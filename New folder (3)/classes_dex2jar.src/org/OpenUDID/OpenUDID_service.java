package org.OpenUDID;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class OpenUDID_service
  extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return new b(this);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     org.OpenUDID.OpenUDID_service
 * JD-Core Version:    0.7.0.1
 */