package android.support.v4.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class c
{
  private static final Object f = new Object();
  private static c g;
  private final Context a;
  private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> b = new HashMap();
  private final HashMap<String, ArrayList<f>> c = new HashMap();
  private final ArrayList<e> d = new ArrayList();
  private final Handler e;
  
  private c(Context paramContext)
  {
    this.a = paramContext;
    this.e = new d(this, paramContext.getMainLooper());
  }
  
  public static c a(Context paramContext)
  {
    synchronized (f)
    {
      if (g == null) {
        g = new c(paramContext.getApplicationContext());
      }
      c localc = g;
      return localc;
    }
  }
  
  public final void a(BroadcastReceiver paramBroadcastReceiver)
  {
    for (;;)
    {
      int j;
      synchronized (this.b)
      {
        ArrayList localArrayList1 = (ArrayList)this.b.remove(paramBroadcastReceiver);
        if (localArrayList1 != null) {
          break label174;
        }
        return;
        if (i < localArrayList1.size())
        {
          IntentFilter localIntentFilter = (IntentFilter)localArrayList1.get(i);
          j = 0;
          if (j >= localIntentFilter.countActions()) {
            break label195;
          }
          String str = localIntentFilter.getAction(j);
          ArrayList localArrayList2 = (ArrayList)this.c.get(str);
          if (localArrayList2 == null) {
            break label189;
          }
          k = 0;
          if (k < localArrayList2.size())
          {
            if (((f)localArrayList2.get(k)).b == paramBroadcastReceiver)
            {
              localArrayList2.remove(k);
              m = k - 1;
              break label180;
            }
          }
          else
          {
            if (localArrayList2.size() > 0) {
              break label189;
            }
            this.c.remove(str);
            break label189;
          }
        }
        else
        {
          return;
        }
      }
      int m = k;
      break label180;
      label174:
      int i = 0;
      continue;
      label180:
      int k = m + 1;
      continue;
      label189:
      j++;
      continue;
      label195:
      i++;
    }
  }
  
  public final void a(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    synchronized (this.b)
    {
      f localf = new f(paramIntentFilter, paramBroadcastReceiver);
      ArrayList localArrayList1 = (ArrayList)this.b.get(paramBroadcastReceiver);
      if (localArrayList1 == null)
      {
        localArrayList1 = new ArrayList(1);
        this.b.put(paramBroadcastReceiver, localArrayList1);
      }
      localArrayList1.add(paramIntentFilter);
      for (int i = 0; i < paramIntentFilter.countActions(); i++)
      {
        String str = paramIntentFilter.getAction(i);
        ArrayList localArrayList2 = (ArrayList)this.c.get(str);
        if (localArrayList2 == null)
        {
          localArrayList2 = new ArrayList(1);
          this.c.put(str, localArrayList2);
        }
        localArrayList2.add(localf);
      }
      return;
    }
  }
  
  public final boolean a(Intent paramIntent)
  {
    int i;
    label146:
    int j;
    Object localObject2;
    Object localObject3;
    int m;
    synchronized (this.b)
    {
      String str1 = paramIntent.getAction();
      String str2 = paramIntent.resolveTypeIfNeeded(this.a.getContentResolver());
      Uri localUri = paramIntent.getData();
      String str3 = paramIntent.getScheme();
      Set localSet = paramIntent.getCategories();
      if ((0x8 & paramIntent.getFlags()) == 0) {
        break label467;
      }
      i = 1;
      if (i != 0) {
        new StringBuilder("Resolving type ").append(str2).append(" scheme ").append(str3).append(" of intent ").append(paramIntent).toString();
      }
      ArrayList localArrayList = (ArrayList)this.c.get(paramIntent.getAction());
      if (localArrayList == null) {
        break label437;
      }
      if (i == 0) {
        break label448;
      }
      new StringBuilder("Action list: ").append(localArrayList).toString();
      break label448;
      if (j >= localArrayList.size()) {
        break label508;
      }
      f localf = (f)localArrayList.get(j);
      if (i != 0) {
        new StringBuilder("Matching against filter ").append(localf.a).toString();
      }
      if (localf.c)
      {
        if (i == 0) {
          break label473;
        }
        localObject3 = localObject2;
      }
      else
      {
        m = localf.a.match(str1, str2, str3, localUri, localSet, "LocalBroadcastManager");
        if (m >= 0)
        {
          if (i != 0) {
            new StringBuilder("  Filter matched!  match=0x").append(Integer.toHexString(m)).toString();
          }
          if (localObject2 != null) {
            break label441;
          }
          localObject3 = new ArrayList();
          label281:
          ((ArrayList)localObject3).add(localf);
          localf.c = true;
        }
      }
    }
    String str4;
    if (i != 0) {
      switch (m)
      {
      default: 
        str4 = "unknown reason";
        label344:
        new StringBuilder("  Filter did not match: ").append(str4).toString();
        break;
      }
    }
    for (;;)
    {
      int k;
      if (k < ((ArrayList)localObject2).size())
      {
        ((f)((ArrayList)localObject2).get(k)).c = false;
        k++;
      }
      else
      {
        this.d.add(new e(paramIntent, (ArrayList)localObject2));
        if (!this.e.hasMessages(1)) {
          this.e.sendEmptyMessage(1);
        }
        return true;
        label437:
        label441:
        label448:
        label467:
        label473:
        label508:
        do
        {
          return false;
          localObject3 = localObject2;
          break label281;
          localObject2 = null;
          j = 0;
          break label146;
          for (;;)
          {
            j++;
            localObject2 = localObject3;
            break label146;
            i = 0;
            break;
            localObject3 = localObject2;
          }
          str4 = "action";
          break label344;
          str4 = "category";
          break label344;
          str4 = "data";
          break label344;
          str4 = "type";
          break label344;
        } while (localObject2 == null);
        k = 0;
      }
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.c
 * JD-Core Version:    0.7.0.1
 */