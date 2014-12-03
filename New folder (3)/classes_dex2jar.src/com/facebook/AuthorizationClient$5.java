package com.facebook;

import java.util.ArrayList;

class AuthorizationClient$5
  implements RequestBatch.Callback
{
  AuthorizationClient$5(AuthorizationClient paramAuthorizationClient, ArrayList paramArrayList1, AuthorizationClient.Result paramResult, ArrayList paramArrayList2) {}
  
  /* Error */
  public void onBatchCompleted(RequestBatch paramRequestBatch)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	com/facebook/AuthorizationClient$5:val$fbids	Ljava/util/ArrayList;
    //   4: invokevirtual 36	java/util/ArrayList:size	()I
    //   7: iconst_2
    //   8: if_icmpne +97 -> 105
    //   11: aload_0
    //   12: getfield 19	com/facebook/AuthorizationClient$5:val$fbids	Ljava/util/ArrayList;
    //   15: iconst_0
    //   16: invokevirtual 40	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   19: ifnull +86 -> 105
    //   22: aload_0
    //   23: getfield 19	com/facebook/AuthorizationClient$5:val$fbids	Ljava/util/ArrayList;
    //   26: iconst_1
    //   27: invokevirtual 40	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   30: ifnull +75 -> 105
    //   33: aload_0
    //   34: getfield 19	com/facebook/AuthorizationClient$5:val$fbids	Ljava/util/ArrayList;
    //   37: iconst_0
    //   38: invokevirtual 40	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   41: checkcast 42	java/lang/String
    //   44: aload_0
    //   45: getfield 19	com/facebook/AuthorizationClient$5:val$fbids	Ljava/util/ArrayList;
    //   48: iconst_1
    //   49: invokevirtual 40	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   52: invokevirtual 46	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   55: ifeq +50 -> 105
    //   58: aload_0
    //   59: getfield 21	com/facebook/AuthorizationClient$5:val$pendingResult	Lcom/facebook/AuthorizationClient$Result;
    //   62: getfield 52	com/facebook/AuthorizationClient$Result:token	Lcom/facebook/AccessToken;
    //   65: aload_0
    //   66: getfield 23	com/facebook/AuthorizationClient$5:val$tokenPermissions	Ljava/util/ArrayList;
    //   69: invokestatic 58	com/facebook/AccessToken:createFromTokenWithRefreshedPermissions	(Lcom/facebook/AccessToken;Ljava/util/List;)Lcom/facebook/AccessToken;
    //   72: astore 6
    //   74: aload_0
    //   75: getfield 17	com/facebook/AuthorizationClient$5:this$0	Lcom/facebook/AuthorizationClient;
    //   78: getfield 64	com/facebook/AuthorizationClient:pendingRequest	Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //   81: aload 6
    //   83: invokestatic 68	com/facebook/AuthorizationClient$Result:createTokenResult	(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Lcom/facebook/AccessToken;)Lcom/facebook/AuthorizationClient$Result;
    //   86: astore 5
    //   88: aload_0
    //   89: getfield 17	com/facebook/AuthorizationClient$5:this$0	Lcom/facebook/AuthorizationClient;
    //   92: aload 5
    //   94: invokevirtual 72	com/facebook/AuthorizationClient:complete	(Lcom/facebook/AuthorizationClient$Result;)V
    //   97: aload_0
    //   98: getfield 17	com/facebook/AuthorizationClient$5:this$0	Lcom/facebook/AuthorizationClient;
    //   101: invokestatic 76	com/facebook/AuthorizationClient:access$000	(Lcom/facebook/AuthorizationClient;)V
    //   104: return
    //   105: aload_0
    //   106: getfield 17	com/facebook/AuthorizationClient$5:this$0	Lcom/facebook/AuthorizationClient;
    //   109: getfield 64	com/facebook/AuthorizationClient:pendingRequest	Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //   112: ldc 78
    //   114: aconst_null
    //   115: invokestatic 82	com/facebook/AuthorizationClient$Result:createErrorResult	(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //   118: astore 4
    //   120: aload 4
    //   122: astore 5
    //   124: goto -36 -> 88
    //   127: astore_3
    //   128: aload_0
    //   129: getfield 17	com/facebook/AuthorizationClient$5:this$0	Lcom/facebook/AuthorizationClient;
    //   132: aload_0
    //   133: getfield 17	com/facebook/AuthorizationClient$5:this$0	Lcom/facebook/AuthorizationClient;
    //   136: getfield 64	com/facebook/AuthorizationClient:pendingRequest	Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //   139: ldc 84
    //   141: aload_3
    //   142: invokevirtual 88	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   145: invokestatic 82	com/facebook/AuthorizationClient$Result:createErrorResult	(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //   148: invokevirtual 72	com/facebook/AuthorizationClient:complete	(Lcom/facebook/AuthorizationClient$Result;)V
    //   151: aload_0
    //   152: getfield 17	com/facebook/AuthorizationClient$5:this$0	Lcom/facebook/AuthorizationClient;
    //   155: invokestatic 76	com/facebook/AuthorizationClient:access$000	(Lcom/facebook/AuthorizationClient;)V
    //   158: return
    //   159: astore_2
    //   160: aload_0
    //   161: getfield 17	com/facebook/AuthorizationClient$5:this$0	Lcom/facebook/AuthorizationClient;
    //   164: invokestatic 76	com/facebook/AuthorizationClient:access$000	(Lcom/facebook/AuthorizationClient;)V
    //   167: aload_2
    //   168: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	5
    //   0	169	1	paramRequestBatch	RequestBatch
    //   159	9	2	localObject1	Object
    //   127	15	3	localException	java.lang.Exception
    //   118	3	4	localResult	AuthorizationClient.Result
    //   86	37	5	localObject2	Object
    //   72	10	6	localAccessToken	AccessToken
    // Exception table:
    //   from	to	target	type
    //   0	88	127	java/lang/Exception
    //   88	97	127	java/lang/Exception
    //   105	120	127	java/lang/Exception
    //   0	88	159	finally
    //   88	97	159	finally
    //   105	120	159	finally
    //   128	151	159	finally
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.5
 * JD-Core Version:    0.7.0.1
 */