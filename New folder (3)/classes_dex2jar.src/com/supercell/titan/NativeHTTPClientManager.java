package com.supercell.titan;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NativeHTTPClientManager
{
  private static Vector<ca> a = new Vector();
  private static Vector<ca> b = new Vector();
  private static int c = 1234;
  private static final NativeHTTPClientManager f = new NativeHTTPClientManager();
  private final bz d = new bz((byte)0);
  private final ExecutorService e = Executors.newCachedThreadPool();
  
  private void a(Runnable paramRunnable)
  {
    this.e.execute(paramRunnable);
  }
  
  public static native void getFinished(boolean paramBoolean, int paramInt, byte[] paramArrayOfByte);
  
  public static NativeHTTPClientManager getInstance()
  {
    return f;
  }
  
  public static native void postFinished(boolean paramBoolean, int paramInt, byte[] paramArrayOfByte);
  
  public static int startGetRequest(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    NativeHTTPClientManager localNativeHTTPClientManager = getInstance();
    ca localca = new ca(localNativeHTTPClientManager.d, paramString3, paramString4);
    localca.a(paramString1, paramString2);
    int i = c;
    c = i + 1;
    localca.a = i;
    a.add(localca);
    localNativeHTTPClientManager.a(localca);
    return localca.a;
  }
  
  public static int startPostRequest(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    NativeHTTPClientManager localNativeHTTPClientManager = getInstance();
    ca localca = new ca(localNativeHTTPClientManager.d, "", "");
    localca.a(paramString1, paramArrayOfByte, paramString2);
    int i = c;
    c = i + 1;
    localca.a = i;
    a.add(localca);
    localNativeHTTPClientManager.a(localca);
    return localca.a;
  }
  
  public static void updateBeforeFrame()
  {
    int i = b.size();
    int j = 0;
    if (j < i)
    {
      ca localca = (ca)b.remove(0);
      boolean bool;
      label37:
      int k;
      byte[] arrayOfByte;
      if (localca.a() == cc.d)
      {
        bool = true;
        k = localca.a;
        arrayOfByte = localca.c();
        if (localca.b() != cb.a) {
          break label78;
        }
        getFinished(bool, k, arrayOfByte);
      }
      for (;;)
      {
        j++;
        break;
        bool = false;
        break label37;
        label78:
        postFinished(bool, k, arrayOfByte);
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.supercell.titan.NativeHTTPClientManager
 * JD-Core Version:    0.7.0.1
 */