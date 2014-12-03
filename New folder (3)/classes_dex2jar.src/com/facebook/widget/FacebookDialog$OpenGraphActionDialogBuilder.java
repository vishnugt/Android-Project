package com.facebook.widget;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphObjectException;
import com.facebook.NativeAppCallContentProvider;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObject.Factory;
import com.facebook.model.GraphObjectList;
import com.facebook.model.OpenGraphAction;
import com.facebook.model.OpenGraphObject;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookDialog$OpenGraphActionDialogBuilder
  extends FacebookDialog.Builder<OpenGraphActionDialogBuilder>
{
  private OpenGraphAction action;
  private String actionType;
  private boolean dataErrorsFatal;
  private HashMap<String, File> imageAttachmentFiles;
  private HashMap<String, Bitmap> imageAttachments;
  private String previewPropertyName;
  
  public FacebookDialog$OpenGraphActionDialogBuilder(Activity paramActivity, OpenGraphAction paramOpenGraphAction, String paramString)
  {
    super(paramActivity);
    Validate.notNull(paramOpenGraphAction, "action");
    Validate.notNullOrEmpty(paramOpenGraphAction.getType(), "action.getType()");
    Validate.notNullOrEmpty(paramString, "previewPropertyName");
    if (paramOpenGraphAction.getProperty(paramString) == null) {
      throw new IllegalArgumentException("A property named \"" + paramString + "\" was not found on the action.  The name of the preview property must match the name of an action property.");
    }
    this.action = paramOpenGraphAction;
    this.actionType = paramOpenGraphAction.getType();
    this.previewPropertyName = paramString;
  }
  
  @Deprecated
  public FacebookDialog$OpenGraphActionDialogBuilder(Activity paramActivity, OpenGraphAction paramOpenGraphAction, String paramString1, String paramString2)
  {
    super(paramActivity);
    Validate.notNull(paramOpenGraphAction, "action");
    Validate.notNullOrEmpty(paramString1, "actionType");
    Validate.notNullOrEmpty(paramString2, "previewPropertyName");
    if (paramOpenGraphAction.getProperty(paramString2) == null) {
      throw new IllegalArgumentException("A property named \"" + paramString2 + "\" was not found on the action.  The name of the preview property must match the name of an action property.");
    }
    String str = paramOpenGraphAction.getType();
    if ((!Utility.isNullOrEmpty(str)) && (!str.equals(paramString1))) {
      throw new IllegalArgumentException("'actionType' must match the type of 'action' if it is specified. Consider using OpenGraphActionDialogBuilder(Activity activity, OpenGraphAction action, String previewPropertyName) instead.");
    }
    this.action = paramOpenGraphAction;
    this.actionType = paramString1;
    this.previewPropertyName = paramString2;
  }
  
  private OpenGraphActionDialogBuilder addImageAttachment(String paramString, Bitmap paramBitmap)
  {
    if (this.imageAttachments == null) {
      this.imageAttachments = new HashMap();
    }
    this.imageAttachments.put(paramString, paramBitmap);
    return this;
  }
  
  private OpenGraphActionDialogBuilder addImageAttachment(String paramString, File paramFile)
  {
    if (this.imageAttachmentFiles == null) {
      this.imageAttachmentFiles = new HashMap();
    }
    this.imageAttachmentFiles.put(paramString, paramFile);
    return this;
  }
  
  private List<String> addImageAttachmentFiles(List<File> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      File localFile = (File)localIterator.next();
      String str = UUID.randomUUID().toString();
      addImageAttachment(str, localFile);
      localArrayList.add(NativeAppCallContentProvider.getAttachmentUrl(this.applicationId, this.appCall.getCallId(), str));
    }
    return localArrayList;
  }
  
  private List<String> addImageAttachments(List<Bitmap> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)localIterator.next();
      String str = UUID.randomUUID().toString();
      addImageAttachment(str, localBitmap);
      localArrayList.add(NativeAppCallContentProvider.getAttachmentUrl(this.applicationId, this.appCall.getCallId(), str));
    }
    return localArrayList;
  }
  
  private JSONObject flattenChildrenOfGraphObject(JSONObject paramJSONObject)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramJSONObject.toString());
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!str.equalsIgnoreCase("image")) {
          localJSONObject.put(str, flattenObject(localJSONObject.get(str)));
        }
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      throw new FacebookException(localJSONException);
    }
  }
  
  private Object flattenObject(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = null;
    }
    do
    {
      JSONObject localJSONObject;
      do
      {
        do
        {
          return paramObject;
          if (!(paramObject instanceof JSONObject)) {
            break;
          }
          localJSONObject = (JSONObject)paramObject;
        } while (localJSONObject.optBoolean("fbsdk:create_object"));
        if (localJSONObject.has("id")) {
          return localJSONObject.getString("id");
        }
      } while (!localJSONObject.has("url"));
      return localJSONObject.getString("url");
    } while (!(paramObject instanceof JSONArray));
    JSONArray localJSONArray1 = (JSONArray)paramObject;
    JSONArray localJSONArray2 = new JSONArray();
    int i = localJSONArray1.length();
    for (int j = 0; j < i; j++) {
      localJSONArray2.put(flattenObject(localJSONArray1.get(j)));
    }
    return localJSONArray2;
  }
  
  private void updateActionAttachmentUrls(List<String> paramList, boolean paramBoolean)
  {
    List localList = this.action.getImage();
    if (localList == null) {}
    for (Object localObject = new ArrayList(paramList.size());; localObject = localList)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("url", str);
          if (paramBoolean) {
            localJSONObject.put("user_generated", true);
          }
          ((List)localObject).add(localJSONObject);
        }
        catch (JSONException localJSONException)
        {
          throw new FacebookException("Unable to attach images", localJSONException);
        }
      }
      this.action.setImage((List)localObject);
      return;
    }
  }
  
  List<String> getImageAttachmentNames()
  {
    return new ArrayList(this.imageAttachments.keySet());
  }
  
  FacebookDialog.OnPresentCallback getOnPresentCallback()
  {
    return new FacebookDialog.OpenGraphActionDialogBuilder.1(this);
  }
  
  Intent handleBuild(Bundle paramBundle)
  {
    putExtra(paramBundle, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", this.previewPropertyName);
    putExtra(paramBundle, "com.facebook.platform.extra.ACTION_TYPE", this.actionType);
    paramBundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", this.dataErrorsFatal);
    putExtra(paramBundle, "com.facebook.platform.extra.ACTION", flattenChildrenOfGraphObject(this.action.getInnerJSONObject()).toString());
    int i = FacebookDialog.access$300(this.activity, Integer.valueOf(20130618));
    return NativeProtocol.createPlatformActivityIntent(this.activity, "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", i, paramBundle);
  }
  
  boolean handleCanPresent()
  {
    Activity localActivity = this.activity;
    FacebookDialog.OpenGraphActionDialogFeature[] arrayOfOpenGraphActionDialogFeature = new FacebookDialog.OpenGraphActionDialogFeature[1];
    arrayOfOpenGraphActionDialogFeature[0] = FacebookDialog.OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
    return FacebookDialog.canPresentOpenGraphActionDialog(localActivity, arrayOfOpenGraphActionDialogFeature);
  }
  
  public OpenGraphActionDialogBuilder setDataErrorsFatal(boolean paramBoolean)
  {
    this.dataErrorsFatal = paramBoolean;
    return this;
  }
  
  public OpenGraphActionDialogBuilder setImageAttachmentFilesForAction(List<File> paramList)
  {
    return setImageAttachmentFilesForAction(paramList, false);
  }
  
  public OpenGraphActionDialogBuilder setImageAttachmentFilesForAction(List<File> paramList, boolean paramBoolean)
  {
    Validate.containsNoNulls(paramList, "bitmapFiles");
    if (this.action == null) {
      throw new FacebookException("Can not set attachments prior to setting action.");
    }
    updateActionAttachmentUrls(addImageAttachmentFiles(paramList), paramBoolean);
    return this;
  }
  
  public OpenGraphActionDialogBuilder setImageAttachmentFilesForObject(String paramString, List<File> paramList)
  {
    return setImageAttachmentFilesForObject(paramString, paramList, false);
  }
  
  public OpenGraphActionDialogBuilder setImageAttachmentFilesForObject(String paramString, List<File> paramList, boolean paramBoolean)
  {
    Validate.notNull(paramString, "objectProperty");
    Validate.containsNoNulls(paramList, "bitmapFiles");
    if (this.action == null) {
      throw new FacebookException("Can not set attachments prior to setting action.");
    }
    updateObjectAttachmentUrls(paramString, addImageAttachmentFiles(paramList), paramBoolean);
    return this;
  }
  
  public OpenGraphActionDialogBuilder setImageAttachmentsForAction(List<Bitmap> paramList)
  {
    return setImageAttachmentsForAction(paramList, false);
  }
  
  public OpenGraphActionDialogBuilder setImageAttachmentsForAction(List<Bitmap> paramList, boolean paramBoolean)
  {
    Validate.containsNoNulls(paramList, "bitmaps");
    if (this.action == null) {
      throw new FacebookException("Can not set attachments prior to setting action.");
    }
    updateActionAttachmentUrls(addImageAttachments(paramList), paramBoolean);
    return this;
  }
  
  public OpenGraphActionDialogBuilder setImageAttachmentsForObject(String paramString, List<Bitmap> paramList)
  {
    return setImageAttachmentsForObject(paramString, paramList, false);
  }
  
  public OpenGraphActionDialogBuilder setImageAttachmentsForObject(String paramString, List<Bitmap> paramList, boolean paramBoolean)
  {
    Validate.notNull(paramString, "objectProperty");
    Validate.containsNoNulls(paramList, "bitmaps");
    if (this.action == null) {
      throw new FacebookException("Can not set attachments prior to setting action.");
    }
    updateObjectAttachmentUrls(paramString, addImageAttachments(paramList), paramBoolean);
    return this;
  }
  
  void updateObjectAttachmentUrls(String paramString, List<String> paramList, boolean paramBoolean)
  {
    OpenGraphObject localOpenGraphObject;
    try
    {
      localOpenGraphObject = (OpenGraphObject)this.action.getPropertyAs(paramString, OpenGraphObject.class);
      if (localOpenGraphObject == null) {
        throw new IllegalArgumentException("Action does not contain a property '" + paramString + "'");
      }
    }
    catch (FacebookGraphObjectException localFacebookGraphObjectException)
    {
      throw new IllegalArgumentException("Property '" + paramString + "' is not a graph object");
    }
    if (!localOpenGraphObject.getCreateObject()) {
      throw new IllegalArgumentException("The Open Graph object in '" + paramString + "' is not marked for creation");
    }
    GraphObjectList localGraphObjectList1 = localOpenGraphObject.getImage();
    if (localGraphObjectList1 == null) {}
    for (GraphObjectList localGraphObjectList2 = GraphObject.Factory.createList(GraphObject.class);; localGraphObjectList2 = localGraphObjectList1)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        GraphObject localGraphObject = GraphObject.Factory.create();
        localGraphObject.setProperty("url", str);
        if (paramBoolean) {
          localGraphObject.setProperty("user_generated", Boolean.valueOf(true));
        }
        localGraphObjectList2.add(localGraphObject);
      }
      localOpenGraphObject.setImage(localGraphObjectList2);
      return;
    }
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog.OpenGraphActionDialogBuilder
 * JD-Core Version:    0.7.0.1
 */