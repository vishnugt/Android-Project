package com.mobileapptracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class b
  extends SQLiteOpenHelper
{
  b(Context paramContext)
  {
    super(paramContext, "MAT", null, 1);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table referrer_apps (_id integer primary key autoincrement, publisher_package_name text not null, tracking_id text, unique(publisher_package_name) on conflict replace);");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    new StringBuilder("Upgrading database from version ").append(paramInt1).append(" to ").append(paramInt2).append(", which will destroy all old data").toString();
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS siteids");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.mobileapptracker.b
 * JD-Core Version:    0.7.0.1
 */