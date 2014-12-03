package com.google.android.vending.expansion.downloader.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class d
{
  public static final String a = d.class.getName();
  private static d g;
  private static final String[] h = { "FN", "URI", "ETAG", "TOTALBYTES", "CURRENTBYTES", "LASTMOD", "STATUS", "CONTROL", "FAILCOUNT", "RETRYAFTER", "REDIRECTCOUNT", "FILEIDX" };
  final SQLiteOpenHelper b;
  long c = -1L;
  int d = -1;
  int e = -1;
  int f;
  
  private d(Context paramContext)
  {
    this.b = new f(paramContext);
    Cursor localCursor = this.b.getReadableDatabase().rawQuery("SELECT APKVERSION,_id,DOWNLOADSTATUS,DOWNLOADFLAGS FROM MetadataColumns LIMIT 1", null);
    if ((localCursor != null) && (localCursor.moveToFirst()))
    {
      this.d = localCursor.getInt(0);
      this.c = localCursor.getLong(1);
      this.e = localCursor.getInt(2);
      this.f = localCursor.getInt(3);
      localCursor.close();
    }
    g = this;
  }
  
  /* Error */
  public static d a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 109	com/google/android/vending/expansion/downloader/a/d:g	Lcom/google/android/vending/expansion/downloader/a/d;
    //   6: ifnonnull +17 -> 23
    //   9: new 2	com/google/android/vending/expansion/downloader/a/d
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 111	com/google/android/vending/expansion/downloader/a/d:<init>	(Landroid/content/Context;)V
    //   17: astore_2
    //   18: ldc 2
    //   20: monitorexit
    //   21: aload_2
    //   22: areturn
    //   23: getstatic 109	com/google/android/vending/expansion/downloader/a/d:g	Lcom/google/android/vending/expansion/downloader/a/d;
    //   26: astore_2
    //   27: goto -9 -> 18
    //   30: astore_1
    //   31: ldc 2
    //   33: monitorexit
    //   34: aload_1
    //   35: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	paramContext	Context
    //   30	5	1	localObject	Object
    //   17	10	2	locald	d
    // Exception table:
    //   from	to	target	type
    //   3	18	30	finally
    //   23	27	30	finally
  }
  
  public final boolean a()
  {
    ContentValues localContentValues;
    SQLiteDatabase localSQLiteDatabase;
    long l;
    int i;
    if (this.e != -1)
    {
      localContentValues = new ContentValues();
      localContentValues.put("DOWNLOADSTATUS", Integer.valueOf(-1));
      localSQLiteDatabase = this.b.getWritableDatabase();
      if (-1L != this.c) {
        break label89;
      }
      l = localSQLiteDatabase.insert("MetadataColumns", "APKVERSION", localContentValues);
      if (-1L != l) {
        break label78;
      }
      i = 0;
    }
    while (i != 0)
    {
      this.e = -1;
      return true;
      label78:
      this.c = l;
      label89:
      do
      {
        i = 1;
        break;
      } while (localSQLiteDatabase.update("MetadataColumns", localContentValues, "_id = " + this.c, null) != 0);
      i = 0;
    }
    return false;
  }
  
  public final b[] b()
  {
    localObject1 = null;
    SQLiteDatabase localSQLiteDatabase = this.b.getReadableDatabase();
    try
    {
      localCursor = localSQLiteDatabase.query("DownloadColumns", h, null, null, null, null, null);
      if (localCursor == null) {}
    }
    finally
    {
      b[] arrayOfb;
      label56:
      int j;
      String str;
      b localb;
      boolean bool;
      if (localObject1 != null) {
        localObject1.close();
      }
    }
    try
    {
      if (!localCursor.moveToFirst()) {
        break label278;
      }
      arrayOfb = new b[localCursor.getCount()];
      i = 0;
    }
    finally
    {
      localObject1 = localCursor;
      break label293;
      i = k;
      break label56;
    }
    j = localCursor.getInt(11);
    str = localCursor.getString(0);
    getClass().getPackage().getName();
    localb = new b(j, str);
    localb.a = localCursor.getString(1);
    localb.d = localCursor.getString(2);
    localb.e = localCursor.getLong(3);
    localb.f = localCursor.getLong(4);
    localb.g = localCursor.getLong(5);
    localb.h = localCursor.getInt(6);
    localb.i = localCursor.getInt(7);
    localb.j = localCursor.getInt(8);
    localb.k = localCursor.getInt(9);
    localb.l = localCursor.getInt(10);
    k = i + 1;
    arrayOfb[i] = localb;
    bool = localCursor.moveToNext();
    if (!bool)
    {
      if (localCursor != null) {
        localCursor.close();
      }
      return arrayOfb;
      label278:
      if (localCursor != null) {
        localCursor.close();
      }
      return null;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.vending.expansion.downloader.a.d
 * JD-Core Version:    0.7.0.1
 */