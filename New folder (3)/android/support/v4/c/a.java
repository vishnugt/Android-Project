package android.support.v4.c;

public final class a
{
  public static void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null)
    {
      paramStringBuilder.append("null");
      return;
    }
    String str = paramObject.getClass().getSimpleName();
    if ((str == null) || (str.length() <= 0))
    {
      str = paramObject.getClass().getName();
      int i = str.lastIndexOf('.');
      if (i > 0) {
        str = str.substring(i + 1);
      }
    }
    paramStringBuilder.append(str);
    paramStringBuilder.append('{');
    paramStringBuilder.append(Integer.toHexString(System.identityHashCode(paramObject)));
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.c.a
 * JD-Core Version:    0.7.0.1
 */