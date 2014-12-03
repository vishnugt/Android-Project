package com.mobileapptracker;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

public class MATProvider
  extends ContentProvider
{
  public static final String PUBLISHER_PACKAGE_NAME = "publisher_package_name";
  public static final String TRACKING_ID = "tracking_id";
  public static final String _ID = "_id";
  private static final UriMatcher a;
  private SQLiteDatabase b;
  
  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    a = localUriMatcher;
    localUriMatcher.addURI("*", "referrer_apps", 1);
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    switch (a.match(paramUri))
    {
    default: 
      throw new IllegalArgumentException("Unknown URI " + paramUri);
    }
    int i = this.b.delete("referrer_apps", paramString, paramArrayOfString);
    getContext().getContentResolver().notifyChange(paramUri, null);
    return i;
  }
  
  public String getType(Uri paramUri)
  {
    switch (a.match(paramUri))
    {
    default: 
      throw new IllegalArgumentException("Unsupported URI: " + paramUri);
    }
    return "vnd.android.cursor.dir/vnd.mobileapptracker.referrer_apps ";
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    long l = this.b.insert("referrer_apps", "", paramContentValues);
    if (l > 0L)
    {
      Uri localUri = ContentUris.withAppendedId(paramUri, l);
      getContext().getContentResolver().notifyChange(localUri, null);
      return localUri;
    }
    throw new SQLException("Failed to insert row into " + paramUri);
  }
  
  public boolean onCreate()
  {
    this.b = new b(getContext()).getWritableDatabase();
    return this.b != null;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("referrer_apps");
    if ((paramString2 == null) || (paramString2 == "")) {}
    for (String str = "publisher_package_name";; str = paramString2)
    {
      Cursor localCursor = localSQLiteQueryBuilder.query(this.b, paramArrayOfString1, paramString1, paramArrayOfString2, null, null, str);
      localCursor.setNotificationUri(getContext().getContentResolver(), paramUri);
      return localCursor;
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    switch (a.match(paramUri))
    {
    default: 
      throw new IllegalArgumentException("Unknown URI " + paramUri);
    }
    int i = this.b.update("referrer_apps", paramContentValues, paramString, paramArrayOfString);
    getContext().getContentResolver().notifyChange(paramUri, null);
    return i;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.mobileapptracker.MATProvider
 * JD-Core Version:    0.7.0.1
 */