package com.jirbo.adcolony;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

final class cv
  extends View
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener
{
  static float[] am = new float[80];
  boolean A;
  boolean B;
  boolean C;
  boolean D;
  boolean E;
  boolean F;
  boolean G;
  boolean H;
  boolean I;
  boolean J;
  boolean K;
  boolean L;
  Canvas M;
  String N;
  String O;
  String P;
  co Q;
  Paint R;
  Paint S;
  Paint T;
  Paint U;
  Rect V;
  ao W;
  ao Z;
  WebView a;
  ao aa;
  ao ab;
  ao ac;
  ao ad;
  ao ae;
  ao af;
  ao ag;
  ao ah;
  ao[] ai;
  ao[] aj;
  ar ak;
  String[] al;
  float an;
  float ao;
  float ap;
  float aq;
  float ar;
  float as;
  float at;
  Paint au;
  RectF av;
  dh aw;
  Handler ax;
  View b;
  ADCVideo c;
  double d;
  double e;
  int f;
  int g;
  int h;
  int i;
  int j;
  int k;
  int l;
  int m;
  int n;
  int o;
  int p;
  int q;
  int r;
  int s;
  long t;
  long u;
  boolean v;
  boolean w;
  boolean x;
  boolean y;
  boolean z;
  
  /* Error */
  cv(ADCVideo paramADCVideo)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 109	android/view/View:<init>	(Landroid/content/Context;)V
    //   5: aload_0
    //   6: dconst_1
    //   7: putfield 111	com/jirbo/adcolony/cv:d	D
    //   10: aload_0
    //   11: dconst_1
    //   12: putfield 113	com/jirbo/adcolony/cv:e	D
    //   15: aload_0
    //   16: bipush 99
    //   18: putfield 115	com/jirbo/adcolony/cv:f	I
    //   21: aload_0
    //   22: iconst_0
    //   23: putfield 117	com/jirbo/adcolony/cv:g	I
    //   26: aload_0
    //   27: iconst_1
    //   28: putfield 119	com/jirbo/adcolony/cv:v	Z
    //   31: aload_0
    //   32: iconst_1
    //   33: putfield 121	com/jirbo/adcolony/cv:w	Z
    //   36: aload_0
    //   37: iconst_1
    //   38: putfield 123	com/jirbo/adcolony/cv:x	Z
    //   41: aload_0
    //   42: iconst_1
    //   43: putfield 125	com/jirbo/adcolony/cv:y	Z
    //   46: aload_0
    //   47: iconst_1
    //   48: putfield 127	com/jirbo/adcolony/cv:z	Z
    //   51: aload_0
    //   52: iconst_1
    //   53: putfield 129	com/jirbo/adcolony/cv:A	Z
    //   56: aload_0
    //   57: getstatic 134	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   60: getfield 139	com/jirbo/adcolony/g:a	Lcom/jirbo/adcolony/f;
    //   63: getfield 143	com/jirbo/adcolony/f:b	Ljava/lang/String;
    //   66: putfield 145	com/jirbo/adcolony/cv:N	Ljava/lang/String;
    //   69: aload_0
    //   70: new 147	android/graphics/Paint
    //   73: dup
    //   74: invokespecial 149	android/graphics/Paint:<init>	()V
    //   77: putfield 151	com/jirbo/adcolony/cv:R	Landroid/graphics/Paint;
    //   80: aload_0
    //   81: new 147	android/graphics/Paint
    //   84: dup
    //   85: iconst_1
    //   86: invokespecial 154	android/graphics/Paint:<init>	(I)V
    //   89: putfield 156	com/jirbo/adcolony/cv:S	Landroid/graphics/Paint;
    //   92: aload_0
    //   93: new 147	android/graphics/Paint
    //   96: dup
    //   97: iconst_1
    //   98: invokespecial 154	android/graphics/Paint:<init>	(I)V
    //   101: putfield 158	com/jirbo/adcolony/cv:T	Landroid/graphics/Paint;
    //   104: aload_0
    //   105: new 147	android/graphics/Paint
    //   108: dup
    //   109: iconst_1
    //   110: invokespecial 154	android/graphics/Paint:<init>	(I)V
    //   113: putfield 160	com/jirbo/adcolony/cv:U	Landroid/graphics/Paint;
    //   116: aload_0
    //   117: new 162	android/graphics/Rect
    //   120: dup
    //   121: invokespecial 163	android/graphics/Rect:<init>	()V
    //   124: putfield 165	com/jirbo/adcolony/cv:V	Landroid/graphics/Rect;
    //   127: aload_0
    //   128: iconst_4
    //   129: anewarray 167	com/jirbo/adcolony/ao
    //   132: putfield 169	com/jirbo/adcolony/cv:ai	[Lcom/jirbo/adcolony/ao;
    //   135: aload_0
    //   136: iconst_4
    //   137: anewarray 167	com/jirbo/adcolony/ao
    //   140: putfield 171	com/jirbo/adcolony/cv:aj	[Lcom/jirbo/adcolony/ao;
    //   143: aload_0
    //   144: iconst_4
    //   145: anewarray 173	java/lang/String
    //   148: putfield 175	com/jirbo/adcolony/cv:al	[Ljava/lang/String;
    //   151: aload_0
    //   152: new 147	android/graphics/Paint
    //   155: dup
    //   156: iconst_1
    //   157: invokespecial 154	android/graphics/Paint:<init>	(I)V
    //   160: putfield 177	com/jirbo/adcolony/cv:au	Landroid/graphics/Paint;
    //   163: aload_0
    //   164: new 179	android/graphics/RectF
    //   167: dup
    //   168: invokespecial 180	android/graphics/RectF:<init>	()V
    //   171: putfield 182	com/jirbo/adcolony/cv:av	Landroid/graphics/RectF;
    //   174: aload_0
    //   175: new 184	com/jirbo/adcolony/dh
    //   178: dup
    //   179: aload_0
    //   180: invokespecial 187	com/jirbo/adcolony/dh:<init>	(Lcom/jirbo/adcolony/cv;)V
    //   183: putfield 189	com/jirbo/adcolony/cv:aw	Lcom/jirbo/adcolony/dh;
    //   186: aload_0
    //   187: new 191	com/jirbo/adcolony/cy
    //   190: dup
    //   191: aload_0
    //   192: invokespecial 192	com/jirbo/adcolony/cy:<init>	(Lcom/jirbo/adcolony/cv;)V
    //   195: putfield 194	com/jirbo/adcolony/cv:ax	Landroid/os/Handler;
    //   198: aload_0
    //   199: aload_1
    //   200: putfield 196	com/jirbo/adcolony/cv:c	Lcom/jirbo/adcolony/ADCVideo;
    //   203: aload_0
    //   204: getstatic 134	com/jirbo/adcolony/a:c	Lcom/jirbo/adcolony/g;
    //   207: getfield 139	com/jirbo/adcolony/g:a	Lcom/jirbo/adcolony/f;
    //   210: getfield 198	com/jirbo/adcolony/f:r	Z
    //   213: putfield 200	com/jirbo/adcolony/cv:H	Z
    //   216: getstatic 203	com/jirbo/adcolony/a:u	Lcom/jirbo/adcolony/dn;
    //   219: ifnull +27 -> 246
    //   222: aload_0
    //   223: aload_0
    //   224: getfield 200	com/jirbo/adcolony/cv:H	Z
    //   227: getstatic 203	com/jirbo/adcolony/a:u	Lcom/jirbo/adcolony/dn;
    //   230: getfield 208	com/jirbo/adcolony/dn:d	Lcom/jirbo/adcolony/au;
    //   233: getfield 213	com/jirbo/adcolony/au:u	Lcom/jirbo/adcolony/bp;
    //   236: getfield 218	com/jirbo/adcolony/bp:l	Lcom/jirbo/adcolony/ba;
    //   239: getfield 222	com/jirbo/adcolony/ba:a	Z
    //   242: ior
    //   243: putfield 200	com/jirbo/adcolony/cv:H	Z
    //   246: aload_0
    //   247: getstatic 223	com/jirbo/adcolony/a:z	Z
    //   250: putfield 225	com/jirbo/adcolony/cv:L	Z
    //   253: getstatic 227	com/jirbo/adcolony/a:a	Ljava/lang/String;
    //   256: ifnull +9 -> 265
    //   259: getstatic 227	com/jirbo/adcolony/a:a	Ljava/lang/String;
    //   262: putstatic 229	com/jirbo/adcolony/a:E	Ljava/lang/String;
    //   265: getstatic 203	com/jirbo/adcolony/a:u	Lcom/jirbo/adcolony/dn;
    //   268: ifnull +34 -> 302
    //   271: getstatic 203	com/jirbo/adcolony/a:u	Lcom/jirbo/adcolony/dn;
    //   274: getfield 208	com/jirbo/adcolony/dn:d	Lcom/jirbo/adcolony/au;
    //   277: getfield 232	com/jirbo/adcolony/au:t	Lcom/jirbo/adcolony/bb;
    //   280: getfield 236	com/jirbo/adcolony/bb:d	Z
    //   283: ifeq +19 -> 302
    //   286: aload_0
    //   287: getfield 225	com/jirbo/adcolony/cv:L	Z
    //   290: ifne +677 -> 967
    //   293: iconst_1
    //   294: istore 23
    //   296: aload_0
    //   297: iload 23
    //   299: putfield 238	com/jirbo/adcolony/cv:I	Z
    //   302: aload_0
    //   303: getfield 238	com/jirbo/adcolony/cv:I	Z
    //   306: ifeq +667 -> 973
    //   309: aload_0
    //   310: new 167	com/jirbo/adcolony/ao
    //   313: dup
    //   314: ldc 240
    //   316: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   319: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   322: putfield 248	com/jirbo/adcolony/cv:W	Lcom/jirbo/adcolony/ao;
    //   325: aload_0
    //   326: aload_0
    //   327: getfield 248	com/jirbo/adcolony/cv:W	Lcom/jirbo/adcolony/ao;
    //   330: getfield 249	com/jirbo/adcolony/ao:f	I
    //   333: putfield 251	com/jirbo/adcolony/cv:m	I
    //   336: aload_0
    //   337: aload_0
    //   338: getfield 248	com/jirbo/adcolony/cv:W	Lcom/jirbo/adcolony/ao;
    //   341: getfield 252	com/jirbo/adcolony/ao:g	I
    //   344: putfield 254	com/jirbo/adcolony/cv:n	I
    //   347: aload_0
    //   348: getfield 251	com/jirbo/adcolony/cv:m	I
    //   351: ifne +10 -> 361
    //   354: aload_0
    //   355: sipush 480
    //   358: putfield 251	com/jirbo/adcolony/cv:m	I
    //   361: aload_0
    //   362: getfield 254	com/jirbo/adcolony/cv:n	I
    //   365: ifne +10 -> 375
    //   368: aload_0
    //   369: sipush 320
    //   372: putfield 254	com/jirbo/adcolony/cv:n	I
    //   375: aload_0
    //   376: getfield 169	com/jirbo/adcolony/cv:ai	[Lcom/jirbo/adcolony/ao;
    //   379: iconst_0
    //   380: new 167	com/jirbo/adcolony/ao
    //   383: dup
    //   384: ldc_w 256
    //   387: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   390: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   393: aastore
    //   394: aload_0
    //   395: getfield 169	com/jirbo/adcolony/cv:ai	[Lcom/jirbo/adcolony/ao;
    //   398: iconst_1
    //   399: new 167	com/jirbo/adcolony/ao
    //   402: dup
    //   403: ldc_w 258
    //   406: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   409: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   412: aastore
    //   413: aload_0
    //   414: getfield 169	com/jirbo/adcolony/cv:ai	[Lcom/jirbo/adcolony/ao;
    //   417: iconst_2
    //   418: new 167	com/jirbo/adcolony/ao
    //   421: dup
    //   422: ldc_w 260
    //   425: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   428: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   431: aastore
    //   432: aload_0
    //   433: getfield 169	com/jirbo/adcolony/cv:ai	[Lcom/jirbo/adcolony/ao;
    //   436: iconst_3
    //   437: new 167	com/jirbo/adcolony/ao
    //   440: dup
    //   441: ldc_w 262
    //   444: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   447: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   450: aastore
    //   451: aload_0
    //   452: getfield 171	com/jirbo/adcolony/cv:aj	[Lcom/jirbo/adcolony/ao;
    //   455: iconst_0
    //   456: new 167	com/jirbo/adcolony/ao
    //   459: dup
    //   460: ldc_w 264
    //   463: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   466: iconst_0
    //   467: invokespecial 267	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;B)V
    //   470: aastore
    //   471: aload_0
    //   472: getfield 171	com/jirbo/adcolony/cv:aj	[Lcom/jirbo/adcolony/ao;
    //   475: iconst_1
    //   476: new 167	com/jirbo/adcolony/ao
    //   479: dup
    //   480: ldc_w 269
    //   483: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   486: iconst_0
    //   487: invokespecial 267	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;B)V
    //   490: aastore
    //   491: aload_0
    //   492: getfield 171	com/jirbo/adcolony/cv:aj	[Lcom/jirbo/adcolony/ao;
    //   495: iconst_2
    //   496: new 167	com/jirbo/adcolony/ao
    //   499: dup
    //   500: ldc_w 271
    //   503: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   506: iconst_0
    //   507: invokespecial 267	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;B)V
    //   510: aastore
    //   511: aload_0
    //   512: getfield 171	com/jirbo/adcolony/cv:aj	[Lcom/jirbo/adcolony/ao;
    //   515: iconst_3
    //   516: new 167	com/jirbo/adcolony/ao
    //   519: dup
    //   520: ldc_w 273
    //   523: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   526: iconst_0
    //   527: invokespecial 267	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;B)V
    //   530: aastore
    //   531: aload_0
    //   532: getfield 175	com/jirbo/adcolony/cv:al	[Ljava/lang/String;
    //   535: iconst_0
    //   536: ldc_w 275
    //   539: aastore
    //   540: aload_0
    //   541: getfield 175	com/jirbo/adcolony/cv:al	[Ljava/lang/String;
    //   544: iconst_1
    //   545: ldc_w 277
    //   548: aastore
    //   549: aload_0
    //   550: getfield 175	com/jirbo/adcolony/cv:al	[Ljava/lang/String;
    //   553: iconst_2
    //   554: ldc_w 279
    //   557: aastore
    //   558: aload_0
    //   559: getfield 175	com/jirbo/adcolony/cv:al	[Ljava/lang/String;
    //   562: iconst_3
    //   563: ldc_w 281
    //   566: aastore
    //   567: aload_0
    //   568: getfield 200	com/jirbo/adcolony/cv:H	Z
    //   571: ifeq +51 -> 622
    //   574: aload_0
    //   575: new 167	com/jirbo/adcolony/ao
    //   578: dup
    //   579: ldc_w 283
    //   582: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   585: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   588: putfield 285	com/jirbo/adcolony/cv:Z	Lcom/jirbo/adcolony/ao;
    //   591: aload_0
    //   592: new 167	com/jirbo/adcolony/ao
    //   595: dup
    //   596: ldc_w 287
    //   599: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   602: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   605: putfield 289	com/jirbo/adcolony/cv:aa	Lcom/jirbo/adcolony/ao;
    //   608: aload_0
    //   609: sipush 1000
    //   612: ldc_w 291
    //   615: invokestatic 294	com/jirbo/adcolony/a:a	(Ljava/lang/String;)I
    //   618: imul
    //   619: putfield 296	com/jirbo/adcolony/cv:o	I
    //   622: aload_0
    //   623: getfield 177	com/jirbo/adcolony/cv:au	Landroid/graphics/Paint;
    //   626: getstatic 302	android/graphics/Paint$Style:STROKE	Landroid/graphics/Paint$Style;
    //   629: invokevirtual 306	android/graphics/Paint:setStyle	(Landroid/graphics/Paint$Style;)V
    //   632: aload_1
    //   633: invokevirtual 312	com/jirbo/adcolony/ADCVideo:getResources	()Landroid/content/res/Resources;
    //   636: invokevirtual 318	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   639: getfield 323	android/util/DisplayMetrics:density	F
    //   642: pop
    //   643: aload_0
    //   644: getfield 177	com/jirbo/adcolony/cv:au	Landroid/graphics/Paint;
    //   647: fconst_2
    //   648: aload_1
    //   649: invokevirtual 312	com/jirbo/adcolony/ADCVideo:getResources	()Landroid/content/res/Resources;
    //   652: invokevirtual 318	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   655: getfield 323	android/util/DisplayMetrics:density	F
    //   658: fmul
    //   659: invokevirtual 327	android/graphics/Paint:setStrokeWidth	(F)V
    //   662: aload_0
    //   663: getfield 177	com/jirbo/adcolony/cv:au	Landroid/graphics/Paint;
    //   666: ldc_w 328
    //   669: invokevirtual 331	android/graphics/Paint:setColor	(I)V
    //   672: aload_0
    //   673: iconst_0
    //   674: putfield 333	com/jirbo/adcolony/cv:G	Z
    //   677: getstatic 203	com/jirbo/adcolony/a:u	Lcom/jirbo/adcolony/dn;
    //   680: ifnull +22 -> 702
    //   683: aload_0
    //   684: getstatic 203	com/jirbo/adcolony/a:u	Lcom/jirbo/adcolony/dn;
    //   687: getfield 208	com/jirbo/adcolony/dn:d	Lcom/jirbo/adcolony/au;
    //   690: getfield 213	com/jirbo/adcolony/au:u	Lcom/jirbo/adcolony/bp;
    //   693: getfield 335	com/jirbo/adcolony/bp:m	Lcom/jirbo/adcolony/ba;
    //   696: getfield 222	com/jirbo/adcolony/ba:a	Z
    //   699: putfield 333	com/jirbo/adcolony/cv:G	Z
    //   702: aload_0
    //   703: getfield 333	com/jirbo/adcolony/cv:G	Z
    //   706: ifeq +109 -> 815
    //   709: aload_0
    //   710: new 167	com/jirbo/adcolony/ao
    //   713: dup
    //   714: ldc_w 337
    //   717: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   720: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   723: putfield 339	com/jirbo/adcolony/cv:af	Lcom/jirbo/adcolony/ao;
    //   726: aload_0
    //   727: new 167	com/jirbo/adcolony/ao
    //   730: dup
    //   731: ldc_w 341
    //   734: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   737: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   740: putfield 343	com/jirbo/adcolony/cv:ag	Lcom/jirbo/adcolony/ao;
    //   743: aload_0
    //   744: getstatic 203	com/jirbo/adcolony/a:u	Lcom/jirbo/adcolony/dn;
    //   747: getfield 208	com/jirbo/adcolony/dn:d	Lcom/jirbo/adcolony/au;
    //   750: getfield 213	com/jirbo/adcolony/au:u	Lcom/jirbo/adcolony/bp;
    //   753: getfield 335	com/jirbo/adcolony/bp:m	Lcom/jirbo/adcolony/ba;
    //   756: getfield 345	com/jirbo/adcolony/ba:j	Ljava/lang/String;
    //   759: putfield 347	com/jirbo/adcolony/cv:P	Ljava/lang/String;
    //   762: aload_0
    //   763: getstatic 203	com/jirbo/adcolony/a:u	Lcom/jirbo/adcolony/dn;
    //   766: getfield 208	com/jirbo/adcolony/dn:d	Lcom/jirbo/adcolony/au;
    //   769: getfield 213	com/jirbo/adcolony/au:u	Lcom/jirbo/adcolony/bp;
    //   772: getfield 335	com/jirbo/adcolony/bp:m	Lcom/jirbo/adcolony/ba;
    //   775: getfield 349	com/jirbo/adcolony/ba:l	Ljava/lang/String;
    //   778: putfield 351	com/jirbo/adcolony/cv:O	Ljava/lang/String;
    //   781: aload_0
    //   782: sipush 1000
    //   785: ldc_w 353
    //   788: invokestatic 294	com/jirbo/adcolony/a:a	(Ljava/lang/String;)I
    //   791: imul
    //   792: putfield 355	com/jirbo/adcolony/cv:p	I
    //   795: aload_0
    //   796: getfield 351	com/jirbo/adcolony/cv:O	Ljava/lang/String;
    //   799: ldc_w 357
    //   802: invokevirtual 361	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   805: ifeq +10 -> 815
    //   808: aload_0
    //   809: ldc_w 363
    //   812: putfield 351	com/jirbo/adcolony/cv:O	Ljava/lang/String;
    //   815: getstatic 365	com/jirbo/adcolony/ADCVideo:c	Z
    //   818: ifeq +7 -> 825
    //   821: aload_0
    //   822: invokespecial 367	com/jirbo/adcolony/cv:f	()V
    //   825: aload_0
    //   826: getfield 151	com/jirbo/adcolony/cv:R	Landroid/graphics/Paint;
    //   829: iconst_m1
    //   830: invokevirtual 331	android/graphics/Paint:setColor	(I)V
    //   833: aload_0
    //   834: getfield 158	com/jirbo/adcolony/cv:T	Landroid/graphics/Paint;
    //   837: ldc_w 368
    //   840: invokevirtual 371	android/graphics/Paint:setTextSize	(F)V
    //   843: aload_0
    //   844: getfield 158	com/jirbo/adcolony/cv:T	Landroid/graphics/Paint;
    //   847: ldc_w 372
    //   850: invokevirtual 331	android/graphics/Paint:setColor	(I)V
    //   853: aload_0
    //   854: getfield 156	com/jirbo/adcolony/cv:S	Landroid/graphics/Paint;
    //   857: ldc_w 328
    //   860: invokevirtual 331	android/graphics/Paint:setColor	(I)V
    //   863: aload_0
    //   864: getfield 156	com/jirbo/adcolony/cv:S	Landroid/graphics/Paint;
    //   867: ldc_w 373
    //   870: invokevirtual 371	android/graphics/Paint:setTextSize	(F)V
    //   873: aload_0
    //   874: getfield 156	com/jirbo/adcolony/cv:S	Landroid/graphics/Paint;
    //   877: getstatic 379	android/graphics/Paint$Align:CENTER	Landroid/graphics/Paint$Align;
    //   880: invokevirtual 383	android/graphics/Paint:setTextAlign	(Landroid/graphics/Paint$Align;)V
    //   883: aload_0
    //   884: getfield 160	com/jirbo/adcolony/cv:U	Landroid/graphics/Paint;
    //   887: ldc_w 373
    //   890: invokevirtual 371	android/graphics/Paint:setTextSize	(F)V
    //   893: aload_0
    //   894: getfield 160	com/jirbo/adcolony/cv:U	Landroid/graphics/Paint;
    //   897: iconst_m1
    //   898: invokevirtual 331	android/graphics/Paint:setColor	(I)V
    //   901: aload_0
    //   902: invokevirtual 389	java/lang/Object:getClass	()Ljava/lang/Class;
    //   905: astore 11
    //   907: iconst_2
    //   908: anewarray 391	java/lang/Class
    //   911: astore 12
    //   913: aload 12
    //   915: iconst_0
    //   916: getstatic 397	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   919: aastore
    //   920: aload 12
    //   922: iconst_1
    //   923: ldc 147
    //   925: aastore
    //   926: aload 11
    //   928: ldc_w 399
    //   931: aload 12
    //   933: invokevirtual 403	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   936: astore 13
    //   938: iconst_2
    //   939: anewarray 385	java/lang/Object
    //   942: astore 14
    //   944: aload 14
    //   946: iconst_0
    //   947: iconst_1
    //   948: invokestatic 407	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   951: aastore
    //   952: aload 14
    //   954: iconst_1
    //   955: aconst_null
    //   956: aastore
    //   957: aload 13
    //   959: aload_0
    //   960: aload 14
    //   962: invokevirtual 413	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   965: pop
    //   966: return
    //   967: iconst_0
    //   968: istore 23
    //   970: goto -674 -> 296
    //   973: aload_0
    //   974: getfield 225	com/jirbo/adcolony/cv:L	Z
    //   977: ifeq -410 -> 567
    //   980: aload_0
    //   981: new 167	com/jirbo/adcolony/ao
    //   984: dup
    //   985: ldc_w 415
    //   988: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   991: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   994: putfield 417	com/jirbo/adcolony/cv:ad	Lcom/jirbo/adcolony/ao;
    //   997: aload_0
    //   998: new 167	com/jirbo/adcolony/ao
    //   1001: dup
    //   1002: ldc_w 419
    //   1005: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1008: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   1011: putfield 421	com/jirbo/adcolony/cv:ab	Lcom/jirbo/adcolony/ao;
    //   1014: aload_0
    //   1015: new 167	com/jirbo/adcolony/ao
    //   1018: dup
    //   1019: ldc_w 423
    //   1022: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1025: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   1028: putfield 425	com/jirbo/adcolony/cv:ac	Lcom/jirbo/adcolony/ao;
    //   1031: aload_0
    //   1032: new 167	com/jirbo/adcolony/ao
    //   1035: dup
    //   1036: ldc_w 427
    //   1039: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1042: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   1045: putfield 429	com/jirbo/adcolony/cv:ae	Lcom/jirbo/adcolony/ao;
    //   1048: aload_0
    //   1049: new 167	com/jirbo/adcolony/ao
    //   1052: dup
    //   1053: ldc_w 431
    //   1056: invokestatic 243	com/jirbo/adcolony/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1059: invokespecial 246	com/jirbo/adcolony/ao:<init>	(Ljava/lang/String;)V
    //   1062: putfield 433	com/jirbo/adcolony/cv:ah	Lcom/jirbo/adcolony/ao;
    //   1065: aload_0
    //   1066: new 435	com/jirbo/adcolony/dg
    //   1069: dup
    //   1070: aload_0
    //   1071: aload_1
    //   1072: invokespecial 438	com/jirbo/adcolony/dg:<init>	(Lcom/jirbo/adcolony/cv;Landroid/app/Activity;)V
    //   1075: putfield 440	com/jirbo/adcolony/cv:b	Landroid/view/View;
    //   1078: aload_0
    //   1079: new 442	android/webkit/WebView
    //   1082: dup
    //   1083: aload_0
    //   1084: getfield 196	com/jirbo/adcolony/cv:c	Lcom/jirbo/adcolony/ADCVideo;
    //   1087: invokespecial 443	android/webkit/WebView:<init>	(Landroid/content/Context;)V
    //   1090: putfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1093: aload_0
    //   1094: getfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1097: iconst_1
    //   1098: invokevirtual 449	android/webkit/WebView:setFocusable	(Z)V
    //   1101: aload_0
    //   1102: getfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1105: iconst_0
    //   1106: invokevirtual 452	android/webkit/WebView:setHorizontalScrollBarEnabled	(Z)V
    //   1109: aload_0
    //   1110: getfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1113: iconst_0
    //   1114: invokevirtual 455	android/webkit/WebView:setVerticalScrollBarEnabled	(Z)V
    //   1117: aload_0
    //   1118: getfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1121: invokevirtual 459	android/webkit/WebView:getSettings	()Landroid/webkit/WebSettings;
    //   1124: astore_2
    //   1125: aload_2
    //   1126: iconst_1
    //   1127: invokevirtual 464	android/webkit/WebSettings:setJavaScriptEnabled	(Z)V
    //   1130: aload_2
    //   1131: iconst_1
    //   1132: invokevirtual 467	android/webkit/WebSettings:setPluginsEnabled	(Z)V
    //   1135: aload_2
    //   1136: getstatic 473	android/webkit/WebSettings$PluginState:ON_DEMAND	Landroid/webkit/WebSettings$PluginState;
    //   1139: invokevirtual 477	android/webkit/WebSettings:setPluginState	(Landroid/webkit/WebSettings$PluginState;)V
    //   1142: aload_2
    //   1143: iconst_1
    //   1144: invokevirtual 480	android/webkit/WebSettings:setBuiltInZoomControls	(Z)V
    //   1147: aload_2
    //   1148: iconst_1
    //   1149: invokevirtual 483	android/webkit/WebSettings:setGeolocationEnabled	(Z)V
    //   1152: aload_0
    //   1153: getfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1156: new 485	com/jirbo/adcolony/cz
    //   1159: dup
    //   1160: aload_0
    //   1161: invokespecial 486	com/jirbo/adcolony/cz:<init>	(Lcom/jirbo/adcolony/cv;)V
    //   1164: invokevirtual 490	android/webkit/WebView:setWebChromeClient	(Landroid/webkit/WebChromeClient;)V
    //   1167: aload_0
    //   1168: getfield 196	com/jirbo/adcolony/cv:c	Lcom/jirbo/adcolony/ADCVideo;
    //   1171: new 492	android/widget/FrameLayout
    //   1174: dup
    //   1175: aload_0
    //   1176: getfield 196	com/jirbo/adcolony/cv:c	Lcom/jirbo/adcolony/ADCVideo;
    //   1179: invokespecial 493	android/widget/FrameLayout:<init>	(Landroid/content/Context;)V
    //   1182: putfield 496	com/jirbo/adcolony/ADCVideo:D	Landroid/widget/FrameLayout;
    //   1185: ldc_w 498
    //   1188: invokestatic 501	com/jirbo/adcolony/a:b	(Ljava/lang/String;)Z
    //   1191: ifeq +81 -> 1272
    //   1194: aload_0
    //   1195: getfield 196	com/jirbo/adcolony/cv:c	Lcom/jirbo/adcolony/ADCVideo;
    //   1198: getfield 496	com/jirbo/adcolony/ADCVideo:D	Landroid/widget/FrameLayout;
    //   1201: invokevirtual 389	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1204: astore 17
    //   1206: iconst_2
    //   1207: anewarray 391	java/lang/Class
    //   1210: astore 18
    //   1212: aload 18
    //   1214: iconst_0
    //   1215: getstatic 397	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   1218: aastore
    //   1219: aload 18
    //   1221: iconst_1
    //   1222: ldc 147
    //   1224: aastore
    //   1225: aload 17
    //   1227: ldc_w 399
    //   1230: aload 18
    //   1232: invokevirtual 403	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   1235: astore 19
    //   1237: aload_0
    //   1238: getfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1241: astore 20
    //   1243: iconst_2
    //   1244: anewarray 385	java/lang/Object
    //   1247: astore 21
    //   1249: aload 21
    //   1251: iconst_0
    //   1252: iconst_1
    //   1253: invokestatic 407	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1256: aastore
    //   1257: aload 21
    //   1259: iconst_1
    //   1260: aconst_null
    //   1261: aastore
    //   1262: aload 19
    //   1264: aload 20
    //   1266: aload 21
    //   1268: invokevirtual 413	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1271: pop
    //   1272: aload_0
    //   1273: new 503	com/jirbo/adcolony/ar
    //   1276: dup
    //   1277: aload_0
    //   1278: getfield 196	com/jirbo/adcolony/cv:c	Lcom/jirbo/adcolony/ADCVideo;
    //   1281: aload_0
    //   1282: getfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1285: aload_0
    //   1286: getfield 196	com/jirbo/adcolony/cv:c	Lcom/jirbo/adcolony/ADCVideo;
    //   1289: invokespecial 506	com/jirbo/adcolony/ar:<init>	(Lcom/jirbo/adcolony/ADCVideo;Landroid/webkit/WebView;Landroid/app/Activity;)V
    //   1292: putfield 508	com/jirbo/adcolony/cv:ak	Lcom/jirbo/adcolony/ar;
    //   1295: new 510	com/jirbo/adcolony/da
    //   1298: dup
    //   1299: aload_0
    //   1300: invokespecial 511	com/jirbo/adcolony/da:<init>	(Lcom/jirbo/adcolony/cv;)V
    //   1303: astore_3
    //   1304: getstatic 513	com/jirbo/adcolony/a:F	Ljava/lang/String;
    //   1307: ldc_w 515
    //   1310: invokestatic 520	com/jirbo/adcolony/cm:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1313: astore 4
    //   1315: getstatic 525	com/jirbo/adcolony/aq:a	Lcom/jirbo/adcolony/aq;
    //   1318: ldc_w 527
    //   1321: invokevirtual 530	com/jirbo/adcolony/aq:b	(Ljava/lang/Object;)Lcom/jirbo/adcolony/aq;
    //   1324: pop
    //   1325: aload_0
    //   1326: getfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1329: aload 4
    //   1331: invokevirtual 533	android/webkit/WebView:loadUrl	(Ljava/lang/String;)V
    //   1334: getstatic 534	com/jirbo/adcolony/a:d	Z
    //   1337: ifeq +191 -> 1528
    //   1340: ldc_w 536
    //   1343: astore 6
    //   1345: aload_0
    //   1346: new 538	java/lang/StringBuilder
    //   1349: dup
    //   1350: ldc_w 540
    //   1353: invokespecial 541	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1356: aload 6
    //   1358: invokevirtual 545	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1361: ldc_w 547
    //   1364: invokevirtual 545	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1367: invokevirtual 551	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1370: invokevirtual 553	com/jirbo/adcolony/cv:a	(Ljava/lang/String;)V
    //   1373: getstatic 534	com/jirbo/adcolony/a:d	Z
    //   1376: ifeq +160 -> 1536
    //   1379: ldc_w 555
    //   1382: astore 7
    //   1384: aload_0
    //   1385: new 538	java/lang/StringBuilder
    //   1388: dup
    //   1389: ldc_w 557
    //   1392: invokespecial 541	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1395: getstatic 559	com/jirbo/adcolony/a:H	Ljava/lang/String;
    //   1398: invokevirtual 545	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1401: ldc_w 561
    //   1404: invokevirtual 545	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1407: invokevirtual 551	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1410: invokevirtual 553	com/jirbo/adcolony/cv:a	(Ljava/lang/String;)V
    //   1413: aload_0
    //   1414: new 538	java/lang/StringBuilder
    //   1417: dup
    //   1418: ldc_w 563
    //   1421: invokespecial 541	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1424: getstatic 565	com/jirbo/adcolony/a:G	Ljava/lang/String;
    //   1427: invokevirtual 545	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1430: ldc_w 561
    //   1433: invokevirtual 545	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1436: invokevirtual 551	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1439: invokevirtual 553	com/jirbo/adcolony/cv:a	(Ljava/lang/String;)V
    //   1442: aload_0
    //   1443: ldc_w 567
    //   1446: invokevirtual 553	com/jirbo/adcolony/cv:a	(Ljava/lang/String;)V
    //   1449: aload_0
    //   1450: new 538	java/lang/StringBuilder
    //   1453: dup
    //   1454: ldc_w 569
    //   1457: invokespecial 541	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1460: aload 7
    //   1462: invokevirtual 545	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1465: ldc_w 561
    //   1468: invokevirtual 545	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1471: invokevirtual 551	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1474: invokevirtual 553	com/jirbo/adcolony/cv:a	(Ljava/lang/String;)V
    //   1477: aload_0
    //   1478: ldc_w 571
    //   1481: invokevirtual 553	com/jirbo/adcolony/cv:a	(Ljava/lang/String;)V
    //   1484: aload_0
    //   1485: ldc_w 573
    //   1488: invokevirtual 553	com/jirbo/adcolony/cv:a	(Ljava/lang/String;)V
    //   1491: aload_0
    //   1492: getfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1495: aload_3
    //   1496: invokevirtual 577	android/webkit/WebView:setWebViewClient	(Landroid/webkit/WebViewClient;)V
    //   1499: aload_0
    //   1500: getfield 445	com/jirbo/adcolony/cv:a	Landroid/webkit/WebView;
    //   1503: getstatic 229	com/jirbo/adcolony/a:E	Ljava/lang/String;
    //   1506: invokevirtual 533	android/webkit/WebView:loadUrl	(Ljava/lang/String;)V
    //   1509: getstatic 525	com/jirbo/adcolony/aq:a	Lcom/jirbo/adcolony/aq;
    //   1512: ldc_w 579
    //   1515: invokevirtual 582	com/jirbo/adcolony/aq:a	(Ljava/lang/String;)Lcom/jirbo/adcolony/aq;
    //   1518: getstatic 229	com/jirbo/adcolony/a:E	Ljava/lang/String;
    //   1521: invokevirtual 530	com/jirbo/adcolony/aq:b	(Ljava/lang/Object;)Lcom/jirbo/adcolony/aq;
    //   1524: pop
    //   1525: goto -958 -> 567
    //   1528: ldc_w 584
    //   1531: astore 6
    //   1533: goto -188 -> 1345
    //   1536: ldc_w 586
    //   1539: astore 7
    //   1541: goto -157 -> 1384
    //   1544: astore 10
    //   1546: return
    //   1547: astore 16
    //   1549: goto -277 -> 1272
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1552	0	this	cv
    //   0	1552	1	paramADCVideo	ADCVideo
    //   1124	24	2	localWebSettings	android.webkit.WebSettings
    //   1303	193	3	localda	da
    //   1313	17	4	str1	String
    //   1343	189	6	str2	String
    //   1382	158	7	str3	String
    //   1544	1	10	localException1	java.lang.Exception
    //   905	22	11	localClass1	java.lang.Class
    //   911	21	12	arrayOfClass1	java.lang.Class[]
    //   936	22	13	localMethod1	java.lang.reflect.Method
    //   942	19	14	arrayOfObject1	Object[]
    //   1547	1	16	localException2	java.lang.Exception
    //   1204	22	17	localClass2	java.lang.Class
    //   1210	21	18	arrayOfClass2	java.lang.Class[]
    //   1235	28	19	localMethod2	java.lang.reflect.Method
    //   1241	24	20	localWebView	WebView
    //   1247	20	21	arrayOfObject2	Object[]
    //   294	675	23	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   901	966	1544	java/lang/Exception
    //   1194	1272	1547	java/lang/Exception
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    int i1;
    if ((paramInt1 >= this.f) && (paramInt1 < 62 + this.f)) {
      i1 = 1;
    }
    int i3;
    do
    {
      int i2;
      do
      {
        boolean bool;
        do
        {
          o localo;
          do
          {
            return i1;
            if ((paramInt1 >= 78 + this.f) && (paramInt1 < 62 + (78 + this.f))) {
              return 2;
            }
            if ((paramInt1 >= 78 + (78 + this.f)) && (paramInt1 < 62 + (78 + (78 + this.f)))) {
              return 3;
            }
            if ((paramInt1 >= 78 + (78 + (78 + this.f))) && (paramInt1 < 62 + (78 + (78 + (78 + this.f))))) {
              return 4;
            }
            localo = this.c.z;
            i1 = 0;
          } while (localo == null);
          bool = this.H;
          i1 = 0;
        } while (!bool);
        i2 = this.c.z.getWidth() - this.Z.f;
        i1 = 0;
      } while (paramInt1 < i2);
      i3 = this.Z.g;
      i1 = 0;
    } while (paramInt2 > i3);
    return 10;
  }
  
  private static boolean a(ao paramao, int paramInt1, int paramInt2)
  {
    return (paramInt1 < 8 + (paramao.e.left + paramao.f)) && (paramInt1 > -8 + paramao.e.left) && (paramInt2 < 8 + (paramao.e.top + paramao.g)) && (paramInt2 > -8 + paramao.e.top);
  }
  
  private int b(String paramString)
  {
    this.T.getTextWidths(paramString, am);
    float f1 = 0.0F;
    int i1 = paramString.length();
    for (int i2 = 0; i2 < i1; i2++) {
      f1 += am[i2];
    }
    return (int)f1;
  }
  
  private void b(boolean paramBoolean)
  {
    if (this.I) {}
    while (this.a == null) {
      return;
    }
    this.a.addJavascriptInterface(new cx(this, paramBoolean), "keyboard_listener");
  }
  
  private void f()
  {
    new Handler().postDelayed(new dd(this), 300L);
    ADCVideo.c = true;
    if (this.c.z != null) {
      this.c.z.a();
    }
    cf.z = null;
    invalidate();
    this.E = false;
    invalidate();
  }
  
  public final void a()
  {
    double d1 = 0.7D;
    boolean bool = this.c.b();
    this.v = (bool | this.v);
    if (this.c.z != null)
    {
      if (this.q <= 0) {
        this.q = this.c.z.getDuration();
      }
      if (bool)
      {
        setLayoutParams(new FrameLayout.LayoutParams(this.c.r, this.c.s, 17));
        this.c.z.setLayoutParams(new FrameLayout.LayoutParams(this.c.t, this.c.u, 17));
        this.v = true;
      }
    }
    double d8;
    float f3;
    label265:
    float f4;
    label285:
    label456:
    double d6;
    label538:
    double d2;
    double d3;
    label600:
    double d4;
    if (this.v)
    {
      this.v = false;
      if (this.w)
      {
        DisplayMetrics localDisplayMetrics = a.a().getResources().getDisplayMetrics();
        float f1 = localDisplayMetrics.widthPixels / localDisplayMetrics.xdpi;
        float f2 = localDisplayMetrics.heightPixels / localDisplayMetrics.ydpi;
        double d7 = Math.sqrt(f1 * f1 + f2 * f2);
        d8 = Math.sqrt(localDisplayMetrics.widthPixels * localDisplayMetrics.widthPixels + localDisplayMetrics.heightPixels * localDisplayMetrics.heightPixels) / d7;
        if (d8 / 280.0D >= d1) {
          break label875;
        }
        this.e = d1;
        if (20.0D * this.e >= 18.0D) {
          break label885;
        }
        f3 = 18.0F;
        if (20.0D * this.e >= 18.0D) {
          break label899;
        }
        f4 = 18.0F;
        this.S.setTextSize(f3);
        this.U.setTextSize(f3);
        this.T.setTextSize(f4);
        if (this.G)
        {
          ao localao2 = this.af;
          int i5 = b(this.O + 2 * this.af.f);
          localao2.a(i5);
          ao localao3 = this.ag;
          int i6 = b(this.O + 2 * this.ag.f);
          localao3.a(i6);
        }
        if (this.c.r <= this.c.s) {
          break label913;
        }
        this.w = false;
      }
      if (this.L)
      {
        if ((bool) && (this.a != null)) {
          this.a.setLayoutParams(new FrameLayout.LayoutParams(this.c.r, this.c.s - this.l, 17));
        }
        if (this.c.u / 640.0D >= 0.9D) {
          break label924;
        }
        d6 = 0.9D;
        this.d = d6;
      }
      if (this.I)
      {
        d2 = this.m / this.n;
        if (this.c.r / d2 <= this.c.s / 1.0D) {
          break label941;
        }
        d3 = this.c.s / 1.0D;
        this.c.t = ((int)(d2 * d3));
        this.c.u = ((int)(d3 * 1.0D));
        if (this.c.r <= this.c.s) {
          break label957;
        }
        d4 = this.c.u / 640.0D;
        label656:
        this.d = d4;
        if (this.c.r / this.m <= this.c.s / this.n) {
          break label974;
        }
      }
    }
    label899:
    label913:
    label924:
    label941:
    label957:
    label974:
    for (double d5 = this.c.s / this.n;; d5 = this.c.r / this.m)
    {
      this.W.a(d5);
      ao localao1 = this.W;
      int i3 = this.c.r;
      int i4 = this.c.s;
      localao1.b((i3 - localao1.f) / 2, (i4 - localao1.g) / 2);
      if (this.G)
      {
        int i1 = (int)(this.af.b.getHeight() * this.e);
        int i2 = (int)(this.ag.b.getHeight() * this.e);
        this.af.a(this.af.f, i1);
        this.ag.a(this.ag.f, i2);
      }
      if (this.H)
      {
        this.Z.a(this.e);
        this.aa.a(this.e);
      }
      return;
      label875:
      d1 = d8 / 280.0D;
      break;
      label885:
      f3 = (float)(20.0D * this.e);
      break label265;
      f4 = (float)(20.0D * this.e);
      break label285;
      break label456;
      d6 = this.c.u / 640.0D;
      break label538;
      d3 = this.c.r / d2;
      break label600;
      d4 = this.c.u / 960.0D;
      break label656;
    }
  }
  
  final void a(int paramInt)
  {
    for (;;)
    {
      try
      {
        if ((!this.z) && (paramInt != 10)) {
          break;
        }
        this.z = false;
        switch (paramInt)
        {
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        case 9: 
        default: 
          this.r = 0;
          new Handler().postDelayed(new cw(this), 1500L);
          return;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        this.z = true;
        return;
      }
      this.r = 0;
      a.a("info", "{\"ad_slot\":" + a.u.c.k.c + "}");
      String str2 = a.c("info_url");
      aq.b.a("INFO ").b(str2);
      if ((str2.startsWith("market:")) || (str2.startsWith("amzn:")))
      {
        this.c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
      }
      else
      {
        AdColonyBrowser.a = str2;
        this.c.startActivity(new Intent(this.c, AdColonyBrowser.class));
        continue;
        this.r = 0;
        a.a("download", "{\"ad_slot\":" + a.u.c.k.c + "}");
        String str1 = a.c("download_url");
        aq.b.a("DOWNLOAD ").b(str1);
        if ((str1.startsWith("market:")) || (str1.startsWith("amzn:")))
        {
          this.c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str1)));
        }
        else
        {
          AdColonyBrowser.a = str1;
          this.c.startActivity(new Intent(this.c, AdColonyBrowser.class));
          continue;
          this.r = 0;
          a.d("replay");
          ADCVideo.d = true;
          ADCVideo.c = false;
          ADCVideo.a = 0;
          View localView = new View(this.c);
          localView.setBackgroundColor(-16777216);
          this.c.C.addView(localView, new FrameLayout.LayoutParams(this.c.r, this.c.s, 17));
          new Handler().postDelayed(new de(this, localView), 900L);
          this.c.z.start();
          a.c.c();
          this.c.z.requestFocus();
          this.c.z.setBackgroundColor(0);
          this.c.z.setVisibility(0);
          a(false);
          invalidate();
          continue;
          this.r = 0;
          this.c.z.a();
          c();
          continue;
          this.r = 0;
          d();
        }
      }
    }
  }
  
  final void a(String paramString)
  {
    if (this.I) {}
    while (this.a == null) {
      return;
    }
    this.a.loadUrl("javascript:" + paramString);
  }
  
  final void a(boolean paramBoolean)
  {
    if (this.I) {
      return;
    }
    if (paramBoolean)
    {
      a("adc_bridge.fireChangeEvent({viewable:true});");
      return;
    }
    a("adc_bridge.fireChangeEvent({viewable:false});");
  }
  
  public final void b()
  {
    g localg = a.c;
    localg.a(ADCVideo.d);
    if ((this.L) && (this.A) && (a.C))
    {
      this.c.C.addView(this.b);
      new Handler().postDelayed(new db(this), 1000 * a.D);
    }
    if (a.A) {
      c();
    }
    a.d("card_shown");
    synchronized (this.aw)
    {
      this.Q = null;
      if (a.u.d.t.e) {
        this.Q = new co(a.u.d.t.g);
      }
      if (this.L)
      {
        Handler localHandler = new Handler();
        View localView = new View(this.c);
        dc localdc = new dc(this, localView);
        localView.setBackgroundColor(-16777216);
        this.c.C.addView(localView);
        localHandler.postDelayed(localdc, 500L);
        this.c.D.setVisibility(0);
      }
      f();
      return;
    }
  }
  
  final void b(int paramInt)
  {
    this.g = paramInt;
    if (paramInt < 0) {
      this.g = 0;
    }
  }
  
  final void c()
  {
    if ((this.c == null) || ((this.L) && ((this.a == null) || (this.c.D == null) || (this.c.C == null)))) {
      return;
    }
    this.c.q = System.currentTimeMillis();
    ADCVideo localADCVideo = this.c;
    localADCVideo.o += (this.c.q - this.c.p) / 1000.0D;
    this.c.finish();
    this.Q = null;
    if (this.L)
    {
      this.c.C.removeView(this.c.D);
      this.a.destroy();
      this.a = null;
    }
    a.x.a();
  }
  
  final void d()
  {
    if (a.u.c())
    {
      ADCVideo.a = this.c.z.getCurrentPosition();
      cf.z = new cf(this.c, (dx)a.u);
      return;
    }
    this.c.finish();
    a.x.b();
  }
  
  final void e()
  {
    if ((this.g >= 70) && (!this.B))
    {
      this.B = true;
      b(true);
    }
    while ((!this.B) || (this.g != 0)) {
      return;
    }
    this.B = false;
    b(false);
  }
  
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    b();
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    if (this.C) {
      return;
    }
    a();
    this.M = paramCanvas;
    boolean bool2;
    label51:
    boolean bool1;
    label91:
    int i5;
    int i6;
    if ((!this.J) && (this.H))
    {
      if (this.c.z.getCurrentPosition() > this.o)
      {
        bool2 = true;
        this.J = bool2;
      }
    }
    else
    {
      if ((!this.K) && (this.G))
      {
        if (this.c.z.getCurrentPosition() <= this.p) {
          break label410;
        }
        bool1 = true;
        this.K = bool1;
      }
      if ((!ADCVideo.c) || (!this.I)) {
        break label481;
      }
      paramCanvas.drawARGB(0xFF & this.c.v >> 24, 0, 0, 0);
      this.W.a(paramCanvas, (this.c.r - this.W.f) / 2, (this.c.s - this.W.g) / 2);
      i4 = (int)(186.0D * this.d) + this.W.e.left;
      i5 = (int)(470.0D * this.d) + this.W.e.top;
      i6 = 0;
      label225:
      if (i6 < this.ai.length)
      {
        if ((this.r != i6 + 1) && ((this.s != i6 + 1) || (this.x) || (this.s == 0))) {
          break label416;
        }
        this.aj[i6].a(this.d);
        this.aj[i6].a(paramCanvas, i4, i5);
      }
    }
    for (int i4 = (int)(i4 + 157.0D * this.d);; i4 = (int)(i4 + 157.0D * this.d))
    {
      label410:
      label416:
      do
      {
        this.S.setColor(-1);
        this.S.clearShadowLayer();
        paramCanvas.drawText(this.al[i6], this.ai[i6].e.left + this.ai[i6].f / 2, this.ai[i6].e.top + this.ai[i6].g, this.S);
        i6++;
        break label225;
        break;
        bool2 = false;
        break label51;
        bool1 = false;
        break label91;
      } while ((!this.x) && (i6 + 1 == this.s));
      this.ai[i6].a(this.d);
      this.ai[i6].a(paramCanvas, i4, i5);
    }
    label481:
    if ((ADCVideo.c) && (this.L))
    {
      this.ab.a(this.e);
      this.ac.a(this.e);
      this.ad.a(this.e);
      this.ae.a(this.e);
      int i3;
      if ((!a.d) && (this.h != 0))
      {
        i3 = this.h;
        this.h = i3;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        if (this.D) {
          break label666;
        }
        this.ab.a(paramCanvas, this.h, this.i);
        if (this.E) {
          break label685;
        }
        this.ad.a(paramCanvas, this.j, this.k);
      }
      for (;;)
      {
        getViewTreeObserver().addOnGlobalLayoutListener(new df(this, this));
        return;
        i3 = this.c.r - this.ab.f;
        break;
        this.ac.a(paramCanvas, this.h, this.i);
        break label606;
        this.ae.a(paramCanvas, this.j, this.k);
      }
    }
    label606:
    if (this.c.z != null)
    {
      a.c.a(this.c.z.getCurrentPosition() / this.c.z.getDuration());
      int i1 = this.c.z.getCurrentPosition();
      int i2 = (999 + (this.q - i1)) / 1000;
      if (i1 >= 500)
      {
        if (this.y)
        {
          this.ao = ((float)(360.0D / (this.q / 1000.0D)));
          this.y = false;
          Rect localRect = new Rect();
          this.S.getTextBounds("0123456789", 0, 9, localRect);
          this.ar = localRect.height();
        }
        this.ap = getWidth();
        this.aq = getHeight();
        this.as = this.ar;
        this.at = (this.c.s - this.ar - this.l);
        this.av.set(this.as - this.ar / 2.0F, this.at - 2.0F * this.ar, this.as + 2.0F * this.ar, this.at + this.ar / 2.0F);
        this.au.setShadowLayer((int)(4.0D * this.d), 0.0F, 0.0F, -16777216);
        this.an = ((float)(this.ao * (this.q / 1000.0D - i1 / 1000.0D)));
        paramCanvas.drawArc(this.av, 270.0F, this.an, false, this.au);
        if (!ADCVideo.c)
        {
          this.S.setColor(-3355444);
          this.S.setShadowLayer((int)(2.0D * this.d), 0.0F, 0.0F, -16777216);
          this.S.setTextAlign(Paint.Align.CENTER);
          this.S.setLinearText(true);
          paramCanvas.drawText(i2, this.av.centerX(), (float)(this.av.centerY() + 1.35D * this.S.getFontMetrics().bottom), this.S);
        }
        if ((this.H) && (!ADCVideo.c) && (this.J))
        {
          if (this.r != 10) {
            break label1374;
          }
          this.aa.a(paramCanvas, this.c.r - this.aa.f, (int)(4.0D * this.d));
        }
        if ((this.G) && (this.K))
        {
          if (!this.F) {
            break label1409;
          }
          this.ag.b((int)(this.c.r - this.ag.f - this.ar / 2.0F), this.c.s - this.ag.g - this.l - (int)(this.ar / 2.0F));
          this.ag.a(paramCanvas);
        }
      }
    }
    for (;;)
    {
      label666:
      label685:
      this.T.setTextAlign(Paint.Align.CENTER);
      label1196:
      paramCanvas.drawText(this.O, this.af.e.centerX(), (float)(this.af.e.centerY() + 1.35D * this.T.getFontMetrics().bottom), this.T);
      if (cf.z != null) {
        cf.z.onDraw(paramCanvas);
      }
      if (!ADCVideo.g) {
        break;
      }
      invalidate();
      return;
      label1374:
      this.Z.a(paramCanvas, this.c.r - this.Z.f, (int)(4.0D * this.d));
      break label1196;
      label1409:
      this.af.b((int)(this.c.r - this.af.f - this.ar / 2.0F), this.c.s - this.af.g - this.l - (int)(this.ar / 2.0F));
      this.af.a(paramCanvas);
    }
  }
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    d();
    return true;
  }
  
  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.l = (this.c.s - paramInt2);
    if (Build.MODEL.equals("Kindle Fire")) {
      this.l = 20;
    }
    if (Build.MODEL.equals("SCH-I800")) {
      this.l = 25;
    }
    if ((Build.MODEL.equals("SHW-M380K")) || (Build.MODEL.equals("SHW-M380S")) || (Build.MODEL.equals("SHW-M380W"))) {
      this.l = 40;
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    if (cf.z != null)
    {
      cf.z.onTouchEvent(paramMotionEvent);
      return true;
    }
    int i2 = (int)paramMotionEvent.getX();
    int i3 = (int)paramMotionEvent.getY();
    if (i1 == 0)
    {
      if ((ADCVideo.c) && (this.L))
      {
        if (a(this.ab, i2, i3))
        {
          this.D = true;
          invalidate();
          return true;
        }
        if (a(this.ad, i2, i3))
        {
          this.E = true;
          invalidate();
          return true;
        }
        return false;
      }
      if ((ADCVideo.c) && (this.I))
      {
        i2 = (int)((paramMotionEvent.getX() - this.W.e.left) / (2.0D * this.d));
        i3 = (int)((paramMotionEvent.getY() - this.W.e.top) / (2.0D * this.d));
        if ((this.r == 0) && (i3 >= 235) && (i3 < 305))
        {
          int i5 = a(i2, i3);
          this.r = i5;
          this.s = i5;
          this.x = false;
          invalidate();
        }
      }
      if ((this.H) && (this.J) && (this.c.z != null) && (a(this.Z, i2, i3)))
      {
        this.r = 10;
        this.s = this.r;
        this.x = false;
        invalidate();
        return true;
      }
      if ((this.G) && (this.K) && (a(this.af, i2, i3)))
      {
        this.F = true;
        invalidate();
        return true;
      }
    }
    else
    {
      if (i1 == 1)
      {
        if ((ADCVideo.c) && (this.L))
        {
          if ((a(this.ab, i2, i3)) && (this.D))
          {
            this.r = 4;
            this.a.clearCache(true);
            this.ax.sendMessageDelayed(this.ax.obtainMessage(this.r), 250L);
            return true;
          }
          if ((a(this.ad, i2, i3)) && (this.E))
          {
            this.r = 3;
            this.a.clearCache(true);
            this.ax.sendMessageDelayed(this.ax.obtainMessage(this.r), 250L);
            return true;
          }
        }
        if ((ADCVideo.c) && (this.I))
        {
          i2 = (int)((paramMotionEvent.getX() - this.W.e.left) / (2.0D * this.d));
          i3 = (int)((paramMotionEvent.getY() - this.W.e.top) / (2.0D * this.d));
          if ((!this.x) && (i3 >= 235) && (i3 < 305))
          {
            int i4 = a(i2, i3);
            if ((i4 > 0) && (i4 == this.s)) {
              this.ax.sendMessageDelayed(this.ax.obtainMessage(i4), 250L);
            }
          }
        }
        if ((this.H) && (this.J) && (this.c.z != null) && (a(this.Z, i2, i3)))
        {
          this.r = 10;
          this.x = true;
          this.s = this.r;
          this.ax.sendMessageDelayed(this.ax.obtainMessage(this.r), 250L);
          return true;
        }
        if ((this.G) && (this.K) && (a(this.af, i2, i3)))
        {
          this.F = false;
          if ((this.P.startsWith("market:")) || (this.P.startsWith("amzn:"))) {
            this.c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.P)));
          }
          for (;;)
          {
            a.a("in_video_engagement", "{\"ad_slot\":" + a.u.c.k.c + "}");
            return true;
            AdColonyBrowser.a = this.P;
            this.c.startActivity(new Intent(this.c, AdColonyBrowser.class));
          }
        }
        this.D = false;
        this.E = false;
        this.F = false;
        this.x = true;
        this.r = 0;
        invalidate();
        return true;
      }
      if (i1 == 3)
      {
        this.D = false;
        this.E = false;
        this.F = false;
        this.x = true;
        this.r = 0;
        invalidate();
        return true;
      }
    }
    return true;
  }
}


/* Location:           C:\Users\vishnu\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.jirbo.adcolony.cv
 * JD-Core Version:    0.7.0.1
 */