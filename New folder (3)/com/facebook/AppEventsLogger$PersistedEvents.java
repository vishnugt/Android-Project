package com.facebook;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class AppEventsLogger$PersistedEvents
{
  static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
  private static Object staticLock = new Object();
  private Context context;
  private HashMap<AppEventsLogger.AccessTokenAppIdPair, List<AppEventsLogger.AppEvent>> persistedEvents = new HashMap();
  
  private AppEventsLogger$PersistedEvents(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public static void persistEvents(Context paramContext, AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair, AppEventsLogger.SessionEventsState paramSessionEventsState)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(paramAccessTokenAppIdPair, paramSessionEventsState);
    persistEvents(paramContext, localHashMap);
  }
  
  public static void persistEvents(Context paramContext, Map<AppEventsLogger.AccessTokenAppIdPair, AppEventsLogger.SessionEventsState> paramMap)
  {
    PersistedEvents localPersistedEvents;
    synchronized (staticLock)
    {
      localPersistedEvents = readAndClearStore(paramContext);
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        List localList = ((AppEventsLogger.SessionEventsState)localEntry.getValue()).getEventsToPersist();
        if (localList.size() != 0) {
          localPersistedEvents.addEvents((AppEventsLogger.AccessTokenAppIdPair)localEntry.getKey(), localList);
        }
      }
    }
    localPersistedEvents.write();
  }
  
  public static PersistedEvents readAndClearStore(Context paramContext)
  {
    synchronized (staticLock)
    {
      PersistedEvents localPersistedEvents = new PersistedEvents(paramContext);
      localPersistedEvents.readAndClearStore();
      return localPersistedEvents;
    }
  }
  
  /* Error */
  private void readAndClearStore()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 104	java/io/ObjectInputStream
    //   5: dup
    //   6: new 106	java/io/BufferedInputStream
    //   9: dup
    //   10: aload_0
    //   11: getfield 30	com/facebook/AppEventsLogger$PersistedEvents:context	Landroid/content/Context;
    //   14: ldc 8
    //   16: invokevirtual 112	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   19: invokespecial 115	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   22: invokespecial 116	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   25: astore_2
    //   26: aload_2
    //   27: invokevirtual 119	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   30: checkcast 25	java/util/HashMap
    //   33: astore 8
    //   35: aload_0
    //   36: getfield 30	com/facebook/AppEventsLogger$PersistedEvents:context	Landroid/content/Context;
    //   39: ldc 8
    //   41: invokevirtual 123	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   44: invokevirtual 128	java/io/File:delete	()Z
    //   47: pop
    //   48: aload_0
    //   49: aload 8
    //   51: putfield 28	com/facebook/AppEventsLogger$PersistedEvents:persistedEvents	Ljava/util/HashMap;
    //   54: aload_2
    //   55: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   58: return
    //   59: astore 12
    //   61: aload_1
    //   62: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   65: return
    //   66: astore 11
    //   68: aconst_null
    //   69: astore_2
    //   70: aload 11
    //   72: astore 4
    //   74: invokestatic 140	com/facebook/AppEventsLogger:access$800	()Ljava/lang/String;
    //   77: pop
    //   78: new 142	java/lang/StringBuilder
    //   81: dup
    //   82: ldc 144
    //   84: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   87: aload 4
    //   89: invokevirtual 150	java/lang/Exception:toString	()Ljava/lang/String;
    //   92: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: pop
    //   99: aload_2
    //   100: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   103: return
    //   104: astore 10
    //   106: aconst_null
    //   107: astore_2
    //   108: aload 10
    //   110: astore 5
    //   112: aload_2
    //   113: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   116: aload 5
    //   118: athrow
    //   119: astore 5
    //   121: goto -9 -> 112
    //   124: astore 4
    //   126: goto -52 -> 74
    //   129: astore_3
    //   130: aload_2
    //   131: astore_1
    //   132: goto -71 -> 61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	PersistedEvents
    //   1	131	1	localObject1	Object
    //   25	106	2	localObjectInputStream	java.io.ObjectInputStream
    //   129	1	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   72	16	4	localException1	java.lang.Exception
    //   124	1	4	localException2	java.lang.Exception
    //   110	7	5	localObject2	Object
    //   119	1	5	localObject3	Object
    //   33	17	8	localHashMap	HashMap
    //   104	5	10	localObject4	Object
    //   66	5	11	localException3	java.lang.Exception
    //   59	1	12	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   2	26	59	java/io/FileNotFoundException
    //   2	26	66	java/lang/Exception
    //   2	26	104	finally
    //   26	54	119	finally
    //   74	99	119	finally
    //   26	54	124	java/lang/Exception
    //   26	54	129	java/io/FileNotFoundException
  }
  
  /* Error */
  private void write()
  {
    // Byte code:
    //   0: new 157	java/io/ObjectOutputStream
    //   3: dup
    //   4: new 159	java/io/BufferedOutputStream
    //   7: dup
    //   8: aload_0
    //   9: getfield 30	com/facebook/AppEventsLogger$PersistedEvents:context	Landroid/content/Context;
    //   12: ldc 8
    //   14: iconst_0
    //   15: invokevirtual 163	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   18: invokespecial 166	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   21: invokespecial 167	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: getfield 28	com/facebook/AppEventsLogger$PersistedEvents:persistedEvents	Ljava/util/HashMap;
    //   30: invokevirtual 171	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   33: aload_1
    //   34: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   37: return
    //   38: astore_2
    //   39: aconst_null
    //   40: astore_1
    //   41: invokestatic 140	com/facebook/AppEventsLogger:access$800	()Ljava/lang/String;
    //   44: pop
    //   45: new 142	java/lang/StringBuilder
    //   48: dup
    //   49: ldc 144
    //   51: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   54: aload_2
    //   55: invokevirtual 150	java/lang/Exception:toString	()Ljava/lang/String;
    //   58: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   64: pop
    //   65: aload_1
    //   66: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   69: return
    //   70: astore_3
    //   71: aconst_null
    //   72: astore_1
    //   73: aload_1
    //   74: invokestatic 134	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   77: aload_3
    //   78: athrow
    //   79: astore_3
    //   80: goto -7 -> 73
    //   83: astore_2
    //   84: goto -43 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	PersistedEvents
    //   24	50	1	localObjectOutputStream	java.io.ObjectOutputStream
    //   38	17	2	localException1	java.lang.Exception
    //   83	1	2	localException2	java.lang.Exception
    //   70	8	3	localObject1	Object
    //   79	1	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	25	38	java/lang/Exception
    //   0	25	70	finally
    //   25	33	79	finally
    //   41	65	79	finally
    //   25	33	83	java/lang/Exception
  }
  
  public void addEvents(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair, List<AppEventsLogger.AppEvent> paramList)
  {
    if (!this.persistedEvents.containsKey(paramAccessTokenAppIdPair)) {
      this.persistedEvents.put(paramAccessTokenAppIdPair, new ArrayList());
    }
    ((List)this.persistedEvents.get(paramAccessTokenAppIdPair)).addAll(paramList);
  }
  
  public List<AppEventsLogger.AppEvent> getEvents(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    return (List)this.persistedEvents.get(paramAccessTokenAppIdPair);
  }
  
  public Set<AppEventsLogger.AccessTokenAppIdPair> keySet()
  {
    return this.persistedEvents.keySet();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.PersistedEvents
 * JD-Core Version:    0.7.0.1
 */