package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager
{
  private static final Object a = new Object();
  private static HashSet<Uri> b = new HashSet();
  private final Context c;
  private final Handler d;
  private final ExecutorService e;
  private final b f;
  private final Map<e, ImageManager.ImageReceiver> g;
  private final Map<Uri, ImageManager.ImageReceiver> h;
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager
 * JD-Core Version:    0.7.0.1
 */