package com.jirbo.adcolony;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;

public final class ao
{
  static int j;
  static int k;
  Bitmap a;
  Bitmap b;
  Paint c = new Paint();
  Rect d = new Rect();
  Rect e = new Rect();
  int f;
  int g;
  int h;
  int i;
  boolean l;
  
  ao(String paramString)
  {
    this(paramString, '\000');
  }
  
  ao(String paramString, byte paramByte)
  {
    this(paramString, true);
  }
  
  private ao(String paramString, char paramChar)
  {
    this(paramString, false);
  }
  
  private ao(String paramString, boolean paramBoolean)
  {
    for (;;)
    {
      int m;
      try
      {
        FileInputStream localFileInputStream = new FileInputStream(paramString);
        byte[] arrayOfByte = new byte[localFileInputStream.available()];
        localFileInputStream.read(arrayOfByte);
        localFileInputStream.close();
        this.a = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
        this.b = this.a;
        this.f = this.a.getWidth();
        this.g = this.a.getHeight();
        this.h = this.a.getWidth();
        this.i = this.a.getHeight();
        j = this.h;
        k = this.i;
        a(1.0D);
        if (paramBoolean)
        {
          this.a = a(this.a);
          int[] arrayOfInt = new int[this.a.getWidth() * this.a.getHeight()];
          this.a.getPixels(arrayOfInt, 0, this.a.getWidth(), 0, 0, this.a.getWidth(), this.a.getHeight());
          m = 0;
          if (m < arrayOfInt.length)
          {
            if ((arrayOfInt[m] < 255) && (arrayOfInt[m] != 0)) {
              arrayOfInt[m] = (0xFF000000 | 0x7F7F7F & arrayOfInt[m] >> 1);
            }
          }
          else
          {
            this.a.setPixels(arrayOfInt, 0, this.a.getWidth(), 0, 0, this.a.getWidth(), this.a.getHeight());
            this.b = this.a;
          }
        }
        else
        {
          a.J.add(this.a);
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        new StringBuilder("Failed to load image ").append(paramString).toString();
        a.i();
        this.l = true;
        return;
      }
      m++;
    }
  }
  
  private static Bitmap a(Bitmap paramBitmap)
  {
    try
    {
      File localFile = new File(Environment.getExternalStorageDirectory() + File.separator + "temp.tmp");
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile, "rw");
      int m = j;
      int n = k;
      Bitmap.Config localConfig = paramBitmap.getConfig();
      FileChannel localFileChannel = localRandomAccessFile.getChannel();
      MappedByteBuffer localMappedByteBuffer = localFileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, n * paramBitmap.getRowBytes());
      paramBitmap.copyPixelsToBuffer(localMappedByteBuffer);
      localBitmap2 = Bitmap.createBitmap(m, n, localConfig);
      ((Exception)localObject).printStackTrace();
    }
    catch (Exception localException1)
    {
      try
      {
        localMappedByteBuffer.position(0);
        localBitmap2.copyPixelsFromBuffer(localMappedByteBuffer);
        localFileChannel.close();
        localRandomAccessFile.close();
        localFile.delete();
        return localBitmap2;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          Bitmap localBitmap2;
          Bitmap localBitmap1 = localBitmap2;
          Object localObject = localException2;
        }
      }
      localException1 = localException1;
      localObject = localException1;
      localBitmap1 = paramBitmap;
    }
    return localBitmap1;
  }
  
  final void a(double paramDouble)
  {
    if (this.a == null) {}
    while (this.a.isRecycled()) {
      return;
    }
    if (paramDouble != 1.0D)
    {
      int m = (int)(paramDouble * this.b.getWidth());
      int n = (int)(paramDouble * this.b.getHeight());
      if ((m != this.f) || (n != this.g))
      {
        this.f = m;
        this.g = n;
        this.a = Bitmap.createScaledBitmap(this.b, this.f, this.g, true);
        a.J.add(this.a);
      }
    }
    this.d.right = this.f;
    this.d.bottom = this.g;
  }
  
  final void a(int paramInt)
  {
    if (this.a == null) {
      return;
    }
    Bitmap localBitmap1 = Bitmap.createBitmap(this.b, 0, 0, this.h / 3, this.i);
    Bitmap localBitmap2 = Bitmap.createBitmap(this.b, 2 * this.h / 3, 0, this.h / 3, this.i);
    Bitmap localBitmap3 = Bitmap.createScaledBitmap(Bitmap.createBitmap(this.b, this.h / 3, 0, this.h / 3, this.i), paramInt, this.i, false);
    int[] arrayOfInt1 = new int[this.h / 3 * this.i];
    int[] arrayOfInt2 = new int[this.h / 3 * this.i];
    localBitmap1.getPixels(arrayOfInt1, 0, this.h / 3, 0, 0, this.h / 3, this.i);
    localBitmap2.getPixels(arrayOfInt2, 0, this.h / 3, 0, 0, this.h / 3, this.i);
    localBitmap3.getPixels(new int[localBitmap3.getWidth() * localBitmap3.getHeight()], 0, localBitmap3.getWidth(), 0, 0, localBitmap3.getWidth(), localBitmap3.getHeight());
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    label329:
    while (i2 < localBitmap3.getHeight())
    {
      if (i1 < this.h / 3)
      {
        if (n < arrayOfInt1.length) {
          localBitmap3.setPixel(i1, i2, arrayOfInt1[n]);
        }
        n++;
      }
      for (;;)
      {
        i1++;
        if (i1 != localBitmap3.getWidth()) {
          break label329;
        }
        i2++;
        i1 = 0;
        break;
        if (i1 >= localBitmap3.getWidth() - this.h / 3)
        {
          if (m < arrayOfInt2.length) {
            localBitmap3.setPixel(i1, i2, arrayOfInt2[m]);
          }
          m++;
        }
      }
    }
    this.a = localBitmap3;
    this.b = this.a;
    this.f = this.a.getWidth();
    this.g = this.a.getHeight();
    this.h = this.f;
    this.i = this.g;
    this.d.right = this.f;
    this.d.bottom = this.g;
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    if (this.a == null) {}
    while ((this.a.isRecycled()) || ((paramInt1 == this.f) && (paramInt2 == this.g))) {
      return;
    }
    this.a = Bitmap.createScaledBitmap(this.b, paramInt1, paramInt2, true);
    this.f = paramInt1;
    this.g = paramInt2;
    this.d.right = paramInt1;
    this.d.bottom = paramInt2;
    a.J.add(this.a);
  }
  
  final void a(Canvas paramCanvas)
  {
    if (this.a == null) {}
    while (this.a.isRecycled()) {
      return;
    }
    paramCanvas.drawBitmap(this.a, this.d, this.e, this.c);
  }
  
  final void a(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2);
    a(paramCanvas);
  }
  
  final void b(int paramInt1, int paramInt2)
  {
    this.e.left = paramInt1;
    this.e.top = paramInt2;
    this.e.right = (paramInt1 + this.f);
    this.e.bottom = (paramInt2 + this.g);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.ao
 * JD-Core Version:    0.7.0.1
 */