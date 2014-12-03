package org.fmod;

import android.media.AudioTrack;
import java.nio.ByteBuffer;

public class FMODAudioDevice
  implements Runnable
{
  private static int e = 0;
  private static int f = 1;
  private static int g = 2;
  private static int h = 3;
  private static int i = 4;
  private Thread a = null;
  private AudioTrack b = null;
  private boolean c = false;
  private boolean d = false;
  
  private void c()
  {
    if (this.b != null)
    {
      this.b.stop();
      this.b.release();
      this.b = null;
    }
    this.d = false;
  }
  
  private native int fmodGetInfo(int paramInt);
  
  private native int fmodProcess(ByteBuffer paramByteBuffer);
  
  public final void a()
  {
    if (this.a != null) {
      b();
    }
    this.a = new Thread(this);
    this.a.setPriority(10);
    this.c = true;
    this.a.start();
  }
  
  public final void b()
  {
    while (this.a != null)
    {
      this.c = false;
      try
      {
        this.a.join();
        this.a = null;
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
  
  public void run()
  {
    int j = 3;
    Object localObject1 = null;
    Object localObject2 = null;
    int k;
    int m;
    int i1;
    int i2;
    label85:
    int i3;
    int i4;
    if (this.c) {
      if (!this.d)
      {
        k = fmodGetInfo(e);
        m = fmodGetInfo(f);
        int n = fmodGetInfo(g);
        i1 = fmodGetInfo(i);
        if ((k > 0) && (m > 0) && (n > 0) && (i1 > 0)) {
          if (i1 == 1)
          {
            i2 = 2;
            i3 = AudioTrack.getMinBufferSize(k, i2, 2);
            if (i3 >= 0) {
              new StringBuilder("FMOD: AudioDevice::run               : Min buffer size: ").append(i3).append(" bytes").toString();
            }
            i4 = 2 * (i1 * (n * m));
            if (i4 <= i3) {
              break label414;
            }
          }
        }
      }
    }
    for (;;)
    {
      for (;;)
      {
        for (;;)
        {
          new StringBuilder("FMOD: AudioDevice::run               : Actual buffer size: ").append(i4).append(" bytes").toString();
          ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(2 * (m * i1));
          byte[] arrayOfByte = new byte[localByteBuffer.capacity()];
          this.b = new AudioTrack(3, k, i2, 2, i4, 1);
          if (this.b.getState() == 1)
          {
            this.b.play();
            this.d = true;
            localObject1 = arrayOfByte;
            localObject2 = localByteBuffer;
            break;
            if (i1 == 2)
            {
              i2 = 3;
              break label85;
            }
            if (i1 == 6)
            {
              i2 = 252;
              break label85;
            }
            i2 = 0;
            break label85;
          }
          this.b.release();
          this.b = null;
          int i5 = j - 1;
          if (i5 == 0)
          {
            this.c = false;
            j = i5;
            localObject2 = localByteBuffer;
            localObject1 = arrayOfByte;
            break;
          }
          try
          {
            Thread.sleep(1000L);
            j = i5;
            localObject2 = localByteBuffer;
            localObject1 = arrayOfByte;
          }
          catch (InterruptedException localInterruptedException2)
          {
            j = i5;
            localObject2 = localByteBuffer;
            localObject1 = arrayOfByte;
          }
        }
        break;
        try
        {
          Thread.sleep(100L);
        }
        catch (InterruptedException localInterruptedException1) {}
      }
      break;
      if (fmodGetInfo(h) == 1)
      {
        fmodProcess(localObject2);
        localObject2.get(localObject1);
        localObject2.position(0);
        this.b.write(localObject1, 0, localObject2.capacity());
        break;
      }
      c();
      break;
      c();
      return;
      label414:
      i4 = i3;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     org.fmod.FMODAudioDevice
 * JD-Core Version:    0.7.0.1
 */