package com.google.android.vending.expansion.downloader.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class f
  extends SQLiteOpenHelper
{
  private static final String[][][] a;
  private static final String[] b = { "DownloadColumns", "MetadataColumns" };
  
  static
  {
    String[][][] arrayOfString; = new String[2][][];
    arrayOfString;[0] = e.a;
    arrayOfString;[1] = g.a;
    a = arrayOfString;;
  }
  
  f(Context paramContext)
  {
    super(paramContext, "DownloadsDB", null, 7);
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    String[] arrayOfString = b;
    int i = arrayOfString.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        String str = arrayOfString[j];
        try
        {
          paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
          j++;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            localException.printStackTrace();
          }
        }
      }
    }
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = a.length;
    int j = 0;
    if (j < i) {
      for (;;)
      {
        try
        {
          String[][] arrayOfString = (String[][])a[j];
          String str = b[j];
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("CREATE TABLE ");
          localStringBuilder.append(str);
          localStringBuilder.append(" (");
          int k = arrayOfString.length;
          int m = 0;
          if (m >= k)
          {
            localStringBuilder.setLength(-1 + localStringBuilder.length());
            localStringBuilder.append(");");
            paramSQLiteDatabase.execSQL(localStringBuilder.toString());
            j++;
            break;
          }
          String[] arrayOfString1 = arrayOfString[m];
          localStringBuilder.append(' ');
          localStringBuilder.append(arrayOfString1[0]);
          localStringBuilder.append(' ');
          localStringBuilder.append(arrayOfString1[1]);
          localStringBuilder.append(',');
          m++;
          continue;
        }
        catch (Exception localException)
        {
          Object localObject;
          continue;
        }
        localObject.printStackTrace();
      }
    }
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    f.class.getName();
    new StringBuilder("Upgrading database from version ").append(paramInt1).append(" to ").append(paramInt2).append(", which will destroy all old data").toString();
    a(paramSQLiteDatabase);
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.google.android.vending.expansion.downloader.a.f
 * JD-Core Version:    0.7.0.1
 */