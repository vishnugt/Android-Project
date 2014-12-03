package com.facebook;

import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObject.Factory;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

class AppEventsLogger$SessionEventsState
{
  public static final String ENCODED_EVENTS_KEY = "encoded_events";
  public static final String EVENT_COUNT_KEY = "event_count";
  public static final String NUM_SKIPPED_KEY = "num_skipped";
  private final int MAX_ACCUMULATED_LOG_EVENTS = 1000;
  private List<AppEventsLogger.AppEvent> accumulatedEvents = new ArrayList();
  private String attributionId;
  private String hashedDeviceAndAppId;
  private List<AppEventsLogger.AppEvent> inFlightEvents = new ArrayList();
  private int numSkippedEventsDueToFullBuffer;
  private String packageName;
  
  public AppEventsLogger$SessionEventsState(String paramString1, String paramString2, String paramString3)
  {
    this.attributionId = paramString1;
    this.packageName = paramString2;
    this.hashedDeviceAndAppId = paramString3;
  }
  
  private byte[] getStringAsByteArray(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Utility.logd("Encoding exception: ", localUnsupportedEncodingException);
    }
    return null;
  }
  
  private void populateRequest(Request paramRequest, int paramInt, JSONArray paramJSONArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    GraphObject localGraphObject = GraphObject.Factory.create();
    localGraphObject.setProperty("event", "CUSTOM_APP_EVENTS");
    if (this.numSkippedEventsDueToFullBuffer > 0) {
      localGraphObject.setProperty("num_skipped_events", Integer.valueOf(paramInt));
    }
    if (paramBoolean1) {
      Utility.setAppEventAttributionParameters(localGraphObject, this.attributionId, this.hashedDeviceAndAppId, paramBoolean2);
    }
    localGraphObject.setProperty("application_package_name", this.packageName);
    paramRequest.setGraphObject(localGraphObject);
    Bundle localBundle = paramRequest.getParameters();
    if (localBundle == null) {
      localBundle = new Bundle();
    }
    String str = paramJSONArray.toString();
    if (str != null)
    {
      localBundle.putByteArray("custom_events_file", getStringAsByteArray(str));
      paramRequest.setTag(str);
    }
    paramRequest.setParameters(localBundle);
  }
  
  public void accumulatePersistedEvents(List<AppEventsLogger.AppEvent> paramList)
  {
    try
    {
      this.accumulatedEvents.addAll(paramList);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public void addEvent(AppEventsLogger.AppEvent paramAppEvent)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 34	com/facebook/AppEventsLogger$SessionEventsState:accumulatedEvents	Ljava/util/List;
    //   6: invokeinterface 146 1 0
    //   11: aload_0
    //   12: getfield 36	com/facebook/AppEventsLogger$SessionEventsState:inFlightEvents	Ljava/util/List;
    //   15: invokeinterface 146 1 0
    //   20: iadd
    //   21: sipush 1000
    //   24: if_icmplt +16 -> 40
    //   27: aload_0
    //   28: iconst_1
    //   29: aload_0
    //   30: getfield 83	com/facebook/AppEventsLogger$SessionEventsState:numSkippedEventsDueToFullBuffer	I
    //   33: iadd
    //   34: putfield 83	com/facebook/AppEventsLogger$SessionEventsState:numSkippedEventsDueToFullBuffer	I
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: getfield 34	com/facebook/AppEventsLogger$SessionEventsState:accumulatedEvents	Ljava/util/List;
    //   44: aload_1
    //   45: invokeinterface 150 2 0
    //   50: pop
    //   51: goto -14 -> 37
    //   54: astore_2
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_2
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	SessionEventsState
    //   0	59	1	paramAppEvent	AppEventsLogger.AppEvent
    //   54	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	37	54	finally
    //   40	51	54	finally
  }
  
  public void clearInFlightAndStats(boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      this.accumulatedEvents.addAll(this.inFlightEvents);
      this.inFlightEvents.clear();
      this.numSkippedEventsDueToFullBuffer = 0;
      return;
    }
    finally {}
  }
  
  public int getAccumulatedEventCount()
  {
    try
    {
      int i = this.accumulatedEvents.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public List<AppEventsLogger.AppEvent> getEventsToPersist()
  {
    try
    {
      List localList = this.accumulatedEvents;
      this.accumulatedEvents = new ArrayList();
      return localList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public int populateRequest(Request paramRequest, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i;
    JSONArray localJSONArray;
    try
    {
      i = this.numSkippedEventsDueToFullBuffer;
      this.inFlightEvents.addAll(this.accumulatedEvents);
      this.accumulatedEvents.clear();
      localJSONArray = new JSONArray();
      Iterator localIterator = this.inFlightEvents.iterator();
      while (localIterator.hasNext())
      {
        AppEventsLogger.AppEvent localAppEvent = (AppEventsLogger.AppEvent)localIterator.next();
        if ((paramBoolean1) || (!localAppEvent.getIsImplicit())) {
          localJSONArray.put(localAppEvent.getJSONObject());
        }
      }
      if (localJSONArray.length() != 0) {
        break label118;
      }
    }
    finally {}
    return 0;
    label118:
    populateRequest(paramRequest, i, localJSONArray, paramBoolean2, paramBoolean3);
    return localJSONArray.length();
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.SessionEventsState
 * JD-Core Version:    0.7.0.1
 */