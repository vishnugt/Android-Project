package com.chartboost.sdk.Libraries;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class d$d
  extends d.a
{
  protected d.g[] a;
  protected String b = null;
  
  public d$d(d.g[] paramArrayOfg)
  {
    this.a = paramArrayOfg;
  }
  
  public String a()
  {
    if (this.b != null) {
      return this.b;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("object must contain the following key-value schema: {\n");
    for (int i = 0;; i++)
    {
      if (i >= this.a.length)
      {
        localStringBuilder.append("}");
        return localStringBuilder.toString();
      }
      localStringBuilder.append("<");
      localStringBuilder.append(d.g.a(this.a[i]));
      localStringBuilder.append(": [");
      localStringBuilder.append(d.g.b(this.a[i]).a());
      localStringBuilder.append("]>");
      if (i < -1 + this.a.length) {
        localStringBuilder.append(",\n");
      }
    }
  }
  
  public boolean a(Object paramObject)
  {
    Map localMap;
    Iterator localIterator;
    int j;
    label55:
    boolean bool2;
    if ((paramObject instanceof Map))
    {
      localMap = (Map)paramObject;
      localIterator = localMap.entrySet().iterator();
      if (!localIterator.hasNext())
      {
        if ((this.a != null) && (this.a.length > 0))
        {
          j = 0;
          if (j < this.a.length) {
            break label130;
          }
        }
        bool2 = true;
      }
    }
    label130:
    boolean bool1;
    do
    {
      return bool2;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((localEntry.getKey() instanceof String)) {
        break;
      }
      this.b = ("key '" + localEntry.getKey().toString() + "' is not a string");
      return false;
      String str2 = d.g.a(this.a[j]);
      d.a locala2 = d.g.b(this.a[j]);
      if (!localMap.containsKey(str2))
      {
        if (!locala2.a(null))
        {
          this.b = ("no key for required mapping '" + str2 + "' : <" + locala2.a() + ">");
          return false;
        }
      }
      else if (!locala2.a(localMap.get(str2)))
      {
        this.b = ("key '" + str2 + "' fails to match: <" + locala2.a() + ">");
        return false;
      }
      j++;
      break label55;
      bool1 = paramObject instanceof JSONObject;
      bool2 = false;
    } while (!bool1);
    JSONObject localJSONObject = (JSONObject)paramObject;
    int i;
    if ((this.a != null) && (this.a.length > 0)) {
      i = 0;
    }
    for (;;)
    {
      if (i >= this.a.length) {
        return true;
      }
      String str1 = d.g.a(this.a[i]);
      d.a locala1 = d.g.b(this.a[i]);
      try
      {
        if (!locala1.a(localJSONObject.get(str1)))
        {
          this.b = ("key '" + str1 + "' fails to match: <" + locala1.a() + ">");
          return false;
        }
      }
      catch (JSONException localJSONException)
      {
        if (!locala1.a(null))
        {
          this.b = ("no key for required mapping '" + str1 + "' : <" + locala1.a() + ">");
          return false;
        }
        i++;
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.Libraries.d.d
 * JD-Core Version:    0.7.0.1
 */