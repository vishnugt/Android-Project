package com.google.android.vending.expansion.downloader.a;

import android.provider.BaseColumns;

public final class e
  implements BaseColumns
{
  public static final String[][] a = { { "_id", "INTEGER PRIMARY KEY" }, { "FILEIDX", "INTEGER UNIQUE" }, { "URI", "TEXT" }, { "FN", "TEXT UNIQUE" }, { "ETAG", "TEXT" }, { "TOTALBYTES", "INTEGER" }, { "CURRENTBYTES", "INTEGER" }, { "LASTMOD", "INTEGER" }, { "STATUS", "INTEGER" }, { "CONTROL", "INTEGER" }, { "FAILCOUNT", "INTEGER" }, { "RETRYAFTER", "INTEGER" }, { "REDIRECTCOUNT", "INTEGER" } };
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.vending.expansion.downloader.a.e
 * JD-Core Version:    0.7.0.1
 */