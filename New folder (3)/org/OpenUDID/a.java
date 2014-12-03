package org.OpenUDID;

import java.util.Comparator;
import java.util.Map;

final class a
  implements Comparator
{
  private a(OpenUDID_manager paramOpenUDID_manager) {}
  
  public final int compare(Object paramObject1, Object paramObject2)
  {
    if (((Integer)OpenUDID_manager.a(this.a).get(paramObject1)).intValue() < ((Integer)OpenUDID_manager.a(this.a).get(paramObject2)).intValue()) {
      return 1;
    }
    if (OpenUDID_manager.a(this.a).get(paramObject1) == OpenUDID_manager.a(this.a).get(paramObject2)) {
      return 0;
    }
    return -1;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     org.OpenUDID.a
 * JD-Core Version:    0.7.0.1
 */