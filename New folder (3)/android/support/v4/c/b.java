package android.support.v4.c;

import java.io.Writer;

public final class b
  extends Writer
{
  private final String a;
  private StringBuilder b = new StringBuilder(128);
  
  public b(String paramString)
  {
    this.a = paramString;
  }
  
  private void a()
  {
    if (this.b.length() > 0)
    {
      this.b.toString();
      this.b.delete(0, this.b.length());
    }
  }
  
  public final void close()
  {
    a();
  }
  
  public final void flush()
  {
    a();
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramInt2)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n') {
        a();
      }
      for (;;)
      {
        i++;
        break;
        this.b.append(c);
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.c.b
 * JD-Core Version:    0.7.0.1
 */