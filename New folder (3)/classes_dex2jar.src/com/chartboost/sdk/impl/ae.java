package com.chartboost.sdk.impl;

public class ae
{
  public static String a(Object paramObject)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(paramObject, localStringBuilder);
    return localStringBuilder.toString();
  }
  
  public static void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    af.a().a(paramObject, paramStringBuilder);
  }
  
  static void a(StringBuilder paramStringBuilder, String paramString)
  {
    paramStringBuilder.append("\"");
    int i = 0;
    if (i >= paramString.length())
    {
      paramStringBuilder.append("\"");
      return;
    }
    char c = paramString.charAt(i);
    if (c == '\\') {
      paramStringBuilder.append("\\\\");
    }
    for (;;)
    {
      i++;
      break;
      if (c == '"') {
        paramStringBuilder.append("\\\"");
      } else if (c == '\n') {
        paramStringBuilder.append("\\n");
      } else if (c == '\r') {
        paramStringBuilder.append("\\r");
      } else if (c == '\t') {
        paramStringBuilder.append("\\t");
      } else if (c == '\b') {
        paramStringBuilder.append("\\b");
      } else if (c >= ' ') {
        paramStringBuilder.append(c);
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.chartboost.sdk.impl.ae
 * JD-Core Version:    0.7.0.1
 */