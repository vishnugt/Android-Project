package com.facebook.widget;

import android.content.Context;
import com.facebook.NativeAppCallAttachmentStore;
import java.util.HashMap;

class FacebookDialog$OpenGraphActionDialogBuilder$1
  implements FacebookDialog.OnPresentCallback
{
  FacebookDialog$OpenGraphActionDialogBuilder$1(FacebookDialog.OpenGraphActionDialogBuilder paramOpenGraphActionDialogBuilder) {}
  
  public void onPresent(Context paramContext)
  {
    if ((FacebookDialog.OpenGraphActionDialogBuilder.access$400(this.this$0) != null) && (FacebookDialog.OpenGraphActionDialogBuilder.access$400(this.this$0).size() > 0)) {
      FacebookDialog.access$500().addAttachmentsForCall(paramContext, this.this$0.appCall.getCallId(), FacebookDialog.OpenGraphActionDialogBuilder.access$400(this.this$0));
    }
    if ((FacebookDialog.OpenGraphActionDialogBuilder.access$600(this.this$0) != null) && (FacebookDialog.OpenGraphActionDialogBuilder.access$600(this.this$0).size() > 0)) {
      FacebookDialog.access$500().addAttachmentFilesForCall(paramContext, this.this$0.appCall.getCallId(), FacebookDialog.OpenGraphActionDialogBuilder.access$600(this.this$0));
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.OpenGraphActionDialogBuilder.1
 * JD-Core Version:    0.7.0.1
 */